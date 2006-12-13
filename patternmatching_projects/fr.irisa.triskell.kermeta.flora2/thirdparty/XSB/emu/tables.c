/* File:      tables.c
** Author(s): Ernie Johnson
** Contact:   xsb-contact@cs.sunysb.edu
** 
** Copyright (C) The Research Foundation of SUNY, 1986, 1993-1998
** 
** XSB is free software; you can redistribute it and/or modify it under the
** terms of the GNU Library General Public License as published by the Free
** Software Foundation; either version 2 of the License, or (at your option)
** any later version.
** 
** XSB is distributed in the hope that it will be useful, but WITHOUT ANY
** WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
** FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
** more details.
** 
** You should have received a copy of the GNU Library General Public License
** along with XSB; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
**
** $Id: tables.c,v 1.43 2006/03/27 00:13:54 tswift Exp $
** 
*/


#include "xsb_config.h"
#include "xsb_debug.h"

#include "debugs/debug_tables.h"
#include "debugs/debug_delay.h"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "auxlry.h"
#include "cell_xsb.h"
#include "heap_xsb.h"
#include "memory_xsb.h"
#include "register.h"
#include "binding.h"
#include "psc_xsb.h"
#include "table_stats.h"
#include "trie_internals.h"
#include "macro_xsb.h"
#include "error_xsb.h"
#include "flags_xsb.h"
#include "tst_utils.h"
#include "loader_xsb.h" /* for ZOOM_FACTOR, used in stack expansion */
/*#include "subp.h"  for exception_handler, used in stack expansion */
#include "tables.h"
#include "thread_xsb.h"

#include "sub_tables_xsb_i.h"
#include "debug_xsb.h"


/*=========================================================================
     This file contains the interface functions to the tabling subsystem
  =========================================================================*/


/*=========================================================================*/

/* Engine-Level Tabling Manager Structures
   --------------------------------------- */

/* In the multi-threaded engine, smProdSF and smConsSF will be defined
   as their private analogues */
#ifndef MULTI_THREAD
Structure_Manager smProdSF = SM_InitDecl(subsumptive_producer_sf,
					 SUBGOAL_FRAMES_PER_BLOCK,
					 "Subsumptive Producer Subgoal Frame");

Structure_Manager smConsSF = SM_InitDecl(subsumptive_consumer_sf,
					 SUBGOAL_FRAMES_PER_BLOCK,
					 "Subsumptive Consumer Subgoal Frame");

#define subsumptive_smALN        smALN
#endif

Structure_Manager smVarSF  = SM_InitDecl(variant_subgoal_frame,
					 SUBGOAL_FRAMES_PER_BLOCK,
					 "Variant Subgoal Frame");
Structure_Manager smALN    = SM_InitDecl(AnsListNode, ALNs_PER_BLOCK,
					 "Answer List Node");

/*
 * Allocates and initializes a subgoal frame for a producing subgoal.
 * The TIP field is initialized, fields of the call trie leaf and this
 * subgoal are set to point to one another, while the completion stack
 * frame pointer is set to the next available location (frame) on the
 * stack (but the space is not yet allocated from the stack).  Also,
 * an answer-list node is allocated for pointing to a dummy answer
 * node and inserted into the answer list.  Note that answer sets
 * (answer tries, roots) are lazily created -- not until an answer is
 * generated.  Therefore this field may potentially be NULL, as it is
 * initialized here.  memset() is used so that the remaining fields
 * are initialized to 0/NULL so, in some sense making this macro
 * independent of the number of fields.  

 * In addition, for variant tables, the private/shared field is set.
 * This field is used to determine whether to use shared or private
 * SMs when adding answers.
 */

#ifndef WIN32
inline 
#endif
VariantSF NewProducerSF(CTXTdeclc BTNptr Leaf,TIFptr TableInfo) {   
    									
    void *pNewSF;							

    if ( IsVariantPredicate(TableInfo) ) {				
#ifdef MULTI_THREAD								
      if (threads_current_sm == PRIVATE_SM) {				
	SM_AllocateStruct(smVarSF,pNewSF);				
	pNewSF = memset(pNewSF,0,sizeof(variant_subgoal_frame));		
	subg_sf_type(pNewSF) = PRIVATE_VARIANT_PRODUCER_SFT;		
      } else {								
	SM_AllocateSharedStruct(smVarSF,pNewSF);				
	pNewSF = memset(pNewSF,0,sizeof(variant_subgoal_frame));		
	subg_sf_type(pNewSF) = SHARED_VARIANT_PRODUCER_SFT;	
      }									
    }
#else
       SM_AllocateStruct(smVarSF,pNewSF);			       
       pNewSF = memset(pNewSF,0,sizeof(variant_subgoal_frame));		
       subg_sf_type(pNewSF) = PRIVATE_VARIANT_PRODUCER_SFT;
   }
#endif
    else {								    
     SM_AllocateStruct(smProdSF,pNewSF);				    
     pNewSF = memset(pNewSF,0,sizeof(subsumptive_producer_sf));		    
     subg_sf_type(pNewSF) = SUBSUMPTIVE_PRODUCER_SFT;			    
   }
   subg_deltf_ptr(pNewSF) = NULL;
   subg_tif_ptr(pNewSF) = TableInfo;					    
   subg_dll_add_sf(pNewSF,TIF_Subgoals(TableInfo),TIF_Subgoals(TableInfo)); 
   subg_leaf_ptr(pNewSF) = Leaf;					    
   CallTrieLeaf_SetSF(Leaf,pNewSF);					    
   subg_ans_list_ptr(pNewSF) = empty_return_handle(pNewSF);		     
   subg_compl_stack_ptr(pNewSF) = openreg - COMPLFRAMESIZE;		    
   return (VariantSF)pNewSF;						  
}

/*=========================================================================*/

/*
 *			Call Check/Insert Operation
 *			===========================
 */


/*
 * Create an Empty Call Index, represented by a Basic Trie.  Note that
 * the root of the trie is labelled with the predicate symbol.
 * Assumes that private/shared switch for SMs has been set.
 */

inline static  BTNptr newCallIndex(CTXTdeclc Psc predicate) {

  BTNptr pRoot;

  New_BTN( pRoot, CALL_TRIE_TT, TRIE_ROOT_NT, EncodeTriePSC(predicate),
	   NULL, NULL );
  return pRoot;
}

/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

/*
 * Note that the call index of the TIF is not allocated until the first
 * call is entered.  Upon exit, CallLUR_VarVector(*results) points to
 * the size of the answer template on the CPS.  See slginsts_xsb_i.h
 * for answer template layout.
 * Assumes that private/shared switch for SMs has been set.
 */

void table_call_search(CTXTdeclc TabledCallInfo *call_info,
		       CallLookupResults *results) {

  TIFptr tif;

  tif = CallInfo_TableInfo(*call_info);
  if ( IsNULL(TIF_CallTrie(tif)) )
    TIF_CallTrie(tif) = newCallIndex(CTXTc TIF_PSC(tif));
  if ( IsVariantPredicate(tif) )
    variant_call_search(CTXTc call_info,results);
  else
    subsumptive_call_search(CTXTc call_info,results);
  {
    /*
     * Copy substitution factor from CPS to Heap.  The arrangement of
     * this second s.f.  is similar to that in the CPS: the
     * size of the vector is now at the high end, but the components
     * are still arranged from high mem (first) to low (last) -- see
     * picture at beginning of slginsts_xsb_i.h.  At the return of
     * this function, each cell of the heap s.f. will have the same
     * value as the corresponding cell in the CPS s.g.  This is done so
     * that attvs can be analyzed upon interning answers -- see
     * documentation at the beginning of variant_call_search().
     */
    CPtr tmplt_component, tmplt_var_addr, hrg_addr;
    int size, j;

    tmplt_component = CallLUR_VarVector(*results);
    size = int_val(*tmplt_component) & 0xffff;
    xsb_dbgmsg((LOG_TRIE,
		"done with vcs, answer_template %x\n",tmplt_component));

    /* expand heap if there's not enough space */
    if ((pb)top_of_localstk < (pb)top_of_heap + size +
	OVERFLOW_MARGIN) {
      xsb_abort("{table_call_search} Heap overflow copying answer template");
    }

    for ( j = size - 1, tmplt_component = tmplt_component + size;
	  j >= 0;
	  j--, tmplt_component-- ) {
      tmplt_var_addr = (CPtr)*tmplt_component;
      xsb_dbgmsg((LOG_TRIE,"in TSC, copying AT to heap At[%d]: %x val: %x",
		  (size-(j)),tmplt_component,tmplt_var_addr));
      /* Now we are sure that tmplt_var_addr is a var on the heap */
      hrg_addr = hreg+j;
      bld_copy(hrg_addr, (Cell)(tmplt_var_addr));
    }
    hreg += size;
    bld_copy(hreg, cell(CallLUR_VarVector(*results)));
    hreg++;
    /* orig version in tries.c had VarPosReg pointing at Var_{m} */
    CallLUR_VarVector(*results) = CallLUR_VarVector(*results) + size + 1;
  }
}

/*=========================================================================*/

/*
 *			Answer Check/Insert Operation
 *			=============================
 */


/*
 * Template is a pointer to the first term in the vector, with the
 * elements arranged from high to low memory.
 * Assumes that private/shared switch for SMs has been set.
 */

BTNptr table_answer_search(CTXTdeclc VariantSF producer, int size, int attv_num,
			   CPtr templ, xsbBool *is_new) {

  void *answer;

  if ( IsSubsumptiveProducer(producer) ) {
    answer =
      subsumptive_answer_search(CTXTc (SubProdSF)producer,size,templ,is_new);
    if ( *is_new ) {
      ALNptr newALN;
      New_Private_ALN(newALN,answer,NULL);
      SF_AppendNewAnswer(producer,newALN);
    }
    /*
     * Conditional answers could result via dependence upon variant
     * subgoals which produce/consume conditional answers.
     */
    if ( IsNonNULL(delayreg) ) {
      fprintf(stdwarn, "\n++Warning: Derivation of conditional answer for "
	               "subsumptive subgoal ");
      sfPrintGoal(stdwarn, producer, NO);
      fprintf(stdwarn, "\n");
      if ( *is_new ) {
	fprintf(stderr, "++Error: The answer is new: ");
	printTriePath(stderr, answer, NO);
	fprintf(stderr, "\n");
	xsb_abort("Unsupported table operation: conditional-answer insertion");
      }
      else {
	fprintf(stdwarn, "++Warning: Answer is subsumed by: ");
	printTriePath(stdwarn, answer, NO);
	fprintf(stdwarn, "\n++Warning: Answer is rejected as redundant.  "
		         "Continuing...\n");
      }
    }
  }
  else {  /* Variant Producer */
    /*
     * We want to save the substitution factor of the answer in the
     * heap, so we have to change variant_answer_search().
     */
    xsbBool wasFound = TRUE;
    
#ifndef IGNORE_DELAYVAR
    ans_var_pos_reg = hreg++;	/* Leave a cell for functor ret/n */
#endif /* IGNORE_DELAYVAR */

    answer = variant_answer_search(CTXTc size,attv_num,templ,producer,&wasFound);

#ifdef DEBUG_DELAYVAR
#ifndef IGNORE_DELAYVAR
    fprintf(stddbg, ">>>> ans_var_pos_reg = ");
    if (isinteger(cell(ans_var_pos_reg)))
      fprintf(stddbg, "\"ret\"\n");
    else 
      fprintf(stddbg, "%s/%d\n", get_name((Psc)(cell(ans_var_pos_reg))),
	      get_arity((Psc)(cell(ans_var_pos_reg))));
#endif /* IGNORE_DELAYVAR */
#endif /* DEBUG_DELAYVAR */

    do_delay_stuff(CTXTc (NODEptr)answer, producer, wasFound);

#ifndef IGNORE_DELAYVAR
    undo_answer_bindings(CTXT);
#endif /* IGNORE_DELAYVAR */

    *is_new = ! wasFound;
  }
  return (BTNptr)answer;
}

/*=========================================================================*/

/*
 *			    Answer Consumption
 *			    ==================
 */


void table_consume_answer(CTXTdeclc BTNptr answer, int size, int attv_num,
			  CPtr templ, TIFptr predicate) {

  if ( size > 0 ) {
    if ( IsSubsumptivePredicate(predicate) )
      consume_subsumptive_answer(CTXTc answer,size,templ);
    else
      /* this also tracks variables created during unification */
      load_solution_trie(CTXTc size,attv_num,templ,answer);
  }
  else if ( size == 0 ) {
    if ( ! IsEscapeNode(answer) )
      xsb_abort("Size of answer template is 0 but producer contains an "
		"answer\nwith a non-empty substitution!\n");
  }
  else
    xsb_abort("table_consume_answer(): "
	      "Answer template has negative size: %d\n", size);
}

/*=========================================================================*/

/*
 *			   Answer Identification
 *			   =====================
 */


/*
 *  Collects answers from a producer's answer set based on an answer
 *  template and a time stamp value.  Collection is performed to
 *  replenish the answer cache of a properly subsumed subgoal.
 *  Collected answers are placed into the consumer's cache and the time
 *  of this collection is noted.  Returns a pointer to the chain of new
 *  answers found, or NULL if no answers were found.
 */

ALNptr table_identify_relevant_answers(CTXTdeclc SubProdSF prodSF, SubConsSF consSF,
				       CPtr templ) {

  int size;
  TimeStamp ts;         /* for selecting answers from subsumer's AnsTbl */

  TSTNptr tstRoot;      /* TS answer trie root of subsumer */
  ALNptr answers;


#ifdef DEBUG_ASSERTIONS
  if ( ((SubProdSF)consSF == prodSF) || (! IsSubsumptiveProducer(prodSF))
       || (! IsProperlySubsumed(consSF)) )
    xsb_abort("Relevant Answer Identification apparently triggered for a "
	      "variant!\nPerhaps SF type is corrupt?");
#endif
  size = int_val(*templ);
  templ--;  /* all templates on the heap, now --lfcastro */
  //  printf("\n"); printAnswerTemplate(stderr,templ,size);
  ts = conssf_timestamp(consSF);
  tstRoot = (TSTNptr)subg_ans_root_ptr(prodSF);
  NumSubOps_IdentifyRelevantAnswers++;
  answers = tst_collect_relevant_answers(CTXTc tstRoot,ts,size,templ);
  conssf_timestamp(consSF) = TSTN_TimeStamp(tstRoot);
  if ( IsNonNULL(answers) )
    SF_AppendNewAnswerList(consSF,answers);
  return answers;
}

/*=========================================================================*/

/*
 *                     Table Structure Reclamation
 *                     ===========================
 */

/*
 *  Deallocate all the data structures which become superfluous once the
 *  table has completed.  Currently, this includes the answer list nodes
 *  from the producer, and if subsumption was used, the TSIs from the
 *  answer set and the answer list nodes from the subsumed subgoals.
 *  For the producers, the engine requires that the dummy answer-list
 *  node remain, and that its 'next' field be set to either the constant
 *  CON_ANSWERS or UNCOND_ANSWERS depending on whether there were any
 *  conditional answers in the answer list.  For the subsumed (consumer)
 *  subgoals, the entire answer list, including the dummy, is reclaimed.
 *
 *  For statistical purposes, we check whether the current usage of
 *  these incomplete-table structures are new maximums.
 *
 *  Currently, timestamps from the TSIs are copied back to the TSTNs.
 *  Although not necessary, this method has some advantages.  Foremost,
 *  this field will never contain garbage values, and so we avoid
 *  dangling pointer problems.  Also, maintaining the time stamp values
 *  is beneficial for post-completion analysis of the TSTs and
 *  characteristics of the query evaluation.
 *
 *  Multiple calls to this function is avoided by checking a flag in the
 *  subgoal frame.  See macro reclaim_incomplete_table_structs() which
 *  contains the only reference to this function.
 */

void table_complete_entry(CTXTdeclc VariantSF producerSF) {

  SubConsSF pSF;
  ALNptr pRealAnsList, pALN, tag;
  TSTHTptr ht;
  TSINptr tsi_entry;

  dbg_print_subgoal(LOG_STRUCT_MANAGER, stddbg, producerSF);
  xsb_dbgmsg((LOG_STRUCT_MANAGER, " complete... reclaiming structures.\n"));

  if (flags[TRACE_STA])
    compute_maximum_tablespace_stats(CTXT);

  /* Reclaim Auxiliary Structures from the TST
     ----------------------------------------- */
  if ( ProducerSubsumesSubgoals(producerSF) &&
       IsNonNULL(subg_ans_root_ptr(producerSF)) )

    for ( ht = TSTRoot_GetHTList(subg_ans_root_ptr(producerSF));
	  IsNonNULL(ht);  ht = TSTHT_InternalLink(ht) ) {

      /*** Put timestamps back into TSTNs ***/
      for ( tsi_entry = TSTHT_IndexHead(ht);  IsNonNULL(tsi_entry);
	    tsi_entry = TSIN_Next(tsi_entry) )
	TSTN_TimeStamp(TSIN_TSTNode(tsi_entry)) = TSIN_TimeStamp(tsi_entry);

      /*** Return TSIN chain to Structure Manager ***/
      if ( IsNULL(TSTHT_IndexTail(ht)) ||
	   IsNonNULL(TSIN_Next(TSTHT_IndexTail(ht))) ||
	   IsNULL(TSTHT_IndexHead(ht)) ||
	   IsNonNULL(TSIN_Prev(TSTHT_IndexHead(ht))) )
	xsb_warn("Malconstructed TSI");

      xsb_dbgmsg((LOG_STRUCT_MANAGER, "  Reclaiming TS Index\n"));
      dbg_smPrint(LOG_STRUCT_MANAGER, smTSIN, "  before chain reclamation");

      /*** Because 'prev' field is first, the tail becomes the list head ***/
      SM_DeallocateStructList(smTSIN,TSTHT_IndexTail(ht),TSTHT_IndexHead(ht));
      TSTHT_IndexHead(ht) = TSTHT_IndexTail(ht) = NULL;

      dbg_smPrint(LOG_STRUCT_MANAGER, smTSIN, "  after chain reclamation");
    }

  /* Reclaim Producer's Answer List
     ------------------------------ */
  if ( has_answers(producerSF) ) {
    pALN = pRealAnsList = subg_answers(producerSF);
    tag = UNCOND_ANSWERS;
    do {
      if ( is_conditional_answer(ALN_Answer(pALN)) ) {
	tag = COND_ANSWERS;
	break;
      }
      pALN = ALN_Next(pALN);
    } while ( IsNonNULL(pALN) );
#ifndef CONC_COMPL
    subg_answers(producerSF) = tag;
#else
    subg_tag(producerSF) = tag;
#endif

      xsb_dbgmsg((LOG_STRUCT_MANAGER, "  Reclaiming ALN chain for subgoal\n"));
      dbg_smPrint(LOG_STRUCT_MANAGER, smALN, "  before chain reclamation");

    if ( IsNULL(subg_ans_list_tail(producerSF)) ||
	 IsNonNULL(ALN_Next(subg_ans_list_tail(producerSF))) )
      xsb_abort("Answer-List exception: Tail pointer incorrectly maintained");
#ifndef CONC_COMPL
#ifdef MULTI_THREAD
    if (IsSharedSF(producerSF)) {				
      SM_DeallocateSharedStructList(smALN,pRealAnsList,
			      subg_ans_list_tail(producerSF));
    } else {
      SM_DeallocateStructList(*private_smALN,pRealAnsList,
			      subg_ans_list_tail(producerSF));
    }
#else
      SM_DeallocateStructList(smALN,pRealAnsList,
			      subg_ans_list_tail(producerSF));
#endif
    subg_ans_list_tail(producerSF) = NULL;
#endif

    dbg_smPrint(LOG_STRUCT_MANAGER, smALN, "  after chain reclamation");
  }

  /* Process its Consumers
     --------------------- */
  if ( IsSubsumptiveProducer(producerSF) ) {
    pSF = subg_consumers(producerSF);


    if (IsNonNULL(pSF)) {
      xsb_dbgmsg((LOG_STRUCT_MANAGER, 
		 "Reclaiming structures from consumers of "));
      dbg_print_subgoal(LOG_STRUCT_MANAGER, stddbg, producerSF);
      xsb_dbgmsg((LOG_STRUCT_MANAGER, "\n"));
    }

    while ( IsNonNULL(pSF) ) {

      xsb_dbgmsg((LOG_STRUCT_MANAGER, "  Reclaiming ALN chain for consumer\n"));
      dbg_smPrint(LOG_STRUCT_MANAGER, smALN, "  before chain reclamation");

      if ( has_answers(pSF) )    /* real answers exist */
	SM_DeallocateStructList(subsumptive_smALN,subg_ans_list_ptr(pSF),
				subg_ans_list_tail(pSF))
      else
	SM_DeallocateStruct(subsumptive_smALN,subg_ans_list_ptr(pSF))
      dbg_smPrint(LOG_STRUCT_MANAGER, smALN, "  after chain reclamation");

      subg_ans_list_ptr(pSF) = subg_ans_list_tail(pSF) = NULL;
      pSF = conssf_consumers(pSF);
    }
  }

  xsb_dbgmsg((LOG_STRUCT_MANAGER, "Subgoal structure-reclamation complete!\n"));
}

/*-------------------------------------------------------------------------*/

/* TLS: I made this into a function and moved it from macro_xsb to
   make the tif_list conditional a little more transparent, and to
   facilitate debugging. */

inline TIFptr New_TIF(CTXTdeclc Psc pPSC) {	   
  TIFptr pTIF;

   pTIF = (TIFptr)mem_alloc(sizeof(TableInfoFrame),TABLE_SPACE);	
   if ( IsNULL(pTIF) )							
     xsb_abort("Ran out of memory in allocation of TableInfoFrame");	
   TIF_PSC(pTIF) = pPSC;						
   if (get_tabled(pPSC)==T_TABLED) {					
     TIF_EvalMethod(pTIF) = (TabledEvalMethod)pflags[TABLING_METHOD];	
     if (TIF_EvalMethod(pTIF) == VARIANT_EVAL_METHOD)			
       set_tabled(pPSC,T_TABLED_VAR);					
     else set_tabled(pPSC,T_TABLED_SUB);				
   }									
   else if (get_tabled(pPSC)==T_TABLED_VAR) 				
      TIF_EvalMethod(pTIF) = VARIANT_EVAL_METHOD;			
   else if (get_tabled(pPSC)==T_TABLED_SUB) 				
     TIF_EvalMethod(pTIF) = SUBSUMPTIVE_EVAL_METHOD;			
   else {								
      xsb_warn("%s/%d not identified as tabled in .xwam file, Recompile (variant assumed)", \
	get_name(pPSC),get_arity(pPSC));				
      TIF_EvalMethod(pTIF) = VARIANT_EVAL_METHOD;			
      set_tabled(pPSC,T_TABLED_VAR);					
   }									
   TIF_CallTrie(pTIF) = NULL;						
   TIF_Mark(pTIF) = 0;                                                  
   TIF_DelTF(pTIF) = NULL;						
   TIF_Subgoals(pTIF) = NULL;						
   TIF_NextTIF(pTIF) = NULL;						
#ifdef MULTI_THREAD
   if (get_shared(pPSC)) {
     SYS_MUTEX_LOCK( MUTEX_TABLE );				
     if ( IsNonNULL(tif_list.last) )					
       TIF_NextTIF(tif_list.last) = pTIF;				      
     else									
       tif_list.first = pTIF;						
     tif_list.last = pTIF;						
     SYS_MUTEX_UNLOCK( MUTEX_TABLE );				
   } else {
     if ( IsNonNULL(private_tif_list.last) )					
       TIF_NextTIF(private_tif_list.last) = pTIF;			     
     else									
       private_tif_list.first = pTIF;						
     private_tif_list.last = pTIF;					      
   }
#else
   if ( IsNonNULL(tif_list.last) )					
     TIF_NextTIF(tif_list.last) = pTIF;				      
   else									
     tif_list.first = pTIF;						
   tif_list.last = pTIF;						
#endif
   return pTIF;
}

/*=========================================================================*/
