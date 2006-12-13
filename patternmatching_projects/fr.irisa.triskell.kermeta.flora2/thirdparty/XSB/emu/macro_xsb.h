/* File:      macro_xsb.h
** Author(s): Swift, Sagonas, Rao, Freire, Johnson
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
** $Id: macro_xsb.h,v 1.48 2006/07/04 01:28:18 tswift Exp $
** 
*/

#ifndef __MACRO_XSB_H__
#define __MACRO_XSB_H__

#include "debug_xsb.h"

/*----------------------------------------------------------------------*/

/* typedef struct subgoal_frame *VariantSF; */

/*===========================================================================*/

/*             
 * 		     Deleted Table Frame Records
 *                   ===========================
 *
 *    These records are used to hold pointers to abolished call and
 *    answer tries for table garbage collection.  These are effective
 *    a union type, as they can hold deleted subgoals as well as
 *    deleted predicates.
 */     

typedef struct Deleted_Table_Frame *DelTFptr;
typedef struct Deleted_Table_Frame {
  BTNptr call_trie;		/* pointer to the root of the call trie */
  VariantSF subgoals;		/* chain of predicate's subgoals */
  byte      type;                /* Marked by scan of CP stack */
  byte      mark;                /* Marked by scan of CP stack */
  DelTFptr next_delTF;		/* pointer to next table info frame */
  DelTFptr next_pred_delTF;	/* pointer to next table info frame same pred */
  DelTFptr prev_delTF;		/* pointer to prev table info frame */
  DelTFptr prev_pred_delTF;	/* pointer to prev table info frame same pred */
} DeletedTableFrame;

#define DELETED_PREDICATE 0 
#define DELETED_SUBGOAL 1

#define DTF_Mark(pDTF)	           ( (pDTF)->mark )
#define DTF_Type(pDTF)	           ( (pDTF)->type )
#define DTF_CallTrie(pDTF)	   ( (pDTF)->call_trie )
#define DTF_Subgoals(pDTF)	   ( (pDTF)->subgoals )
#define DTF_Subgoal(pDTF)	   ( (pDTF)->subgoals )
#define DTF_NextDTF(pDTF)	   ( (pDTF)->next_delTF )
#define DTF_NextPredDTF(pDTF)	   ( (pDTF)->next_pred_delTF )
#define DTF_PrevDTF(pDTF)	   ( (pDTF)->prev_delTF )
#define DTF_PrevPredDTF(pDTF)	   ( (pDTF)->prev_pred_delTF )

/* Creating two doubly-linked chains -- one for all DelTf, the other
   for Deltfs for this predicate.  */
#define New_Global_DelTF_Pred(pDTF,pTIF) {				\
   pDTF = (DelTFptr)mem_alloc(sizeof(DeletedTableFrame),TABLE_SPACE);	\
   if ( IsNULL(pDTF) )							\
     xsb_abort("Ran out of memory in allocation of DeletedTableFrame");	\
   DTF_CallTrie(pDTF) = TIF_CallTrie(pTIF);				\
   DTF_Subgoals(pDTF) = TIF_Subgoals(pTIF);				\
   DTF_Type(pDTF) = DELETED_PREDICATE;					\
   DTF_Mark(pDTF) = 0;                                                  \
   DTF_PrevDTF(pDTF) = 0;						\
   DTF_PrevPredDTF(pDTF) = 0;						\
   DTF_NextDTF(pDTF) = deltf_chain_begin;				\
   DTF_NextPredDTF(pDTF) = TIF_DelTF(pTIF);				\
   if (deltf_chain_begin) DTF_PrevDTF(deltf_chain_begin) = pDTF;	\
   if (TIF_DelTF(pTIF))  DTF_PrevPredDTF(TIF_DelTF(pTIF)) = pDTF;	\
   deltf_chain_begin = pDTF;                                            \
   TIF_DelTF(pTIF) = pDTF;                                              \
  }

/* Creating two doubly-linked chains -- one for all DelTf, the other
   for Deltfs for this predicate -- this may not be necess for
   _subgoal */
#define New_Global_DelTF_Subgoal(pDTF,pTIF,pSubgoal) {			\
   pDTF = (DelTFptr)mem_alloc(sizeof(DeletedTableFrame),TABLE_SPACE);	\
   if ( IsNULL(pDTF) )							\
     xsb_abort("Ran out of memory in allocation of DeletedTableFrame");	\
   DTF_CallTrie(pDTF) = NULL;						\
   DTF_Subgoal(pDTF) = pSubgoal;					\
   DTF_Type(pDTF) = DELETED_SUBGOAL;						\
   DTF_Mark(pDTF) = 0;                                                  \
   DTF_PrevDTF(pDTF) = 0;						\
   DTF_PrevPredDTF(pDTF) = 0;						\
   DTF_NextDTF(pDTF) = deltf_chain_begin;				\
   DTF_NextPredDTF(pDTF) = TIF_DelTF(pTIF);				\
   if (deltf_chain_begin) DTF_PrevDTF(deltf_chain_begin) = pDTF;	\
   if (TIF_DelTF(pTIF))  DTF_PrevPredDTF(TIF_DelTF(pTIF)) = pDTF;	\
   deltf_chain_begin = pDTF;                                            \
   TIF_DelTF(pTIF) = pDTF;                                              \
  }

/* In macro below, need to reset DTF chain, and Pred-level DTF chain.
 * No mutexes, because it is called only during gc, w. only 1 active
 * thread. */
#define Free_Global_DelTF_Pred(pDTF,pTIF) {				\
  if (DTF_PrevDTF(pDTF) == 0) {						\
    deltf_chain_begin = DTF_NextDTF(pDTF);				\
  }									\
  else {								\
    DTF_NextDTF(DTF_PrevDTF(pDTF)) = DTF_NextDTF(pDTF);			\
  }									\
  if (DTF_NextDTF(pDTF) != 0) {						\
    DTF_PrevDTF(DTF_NextDTF(pDTF)) = DTF_PrevDTF(pDTF);			\
  }									\
  if (DTF_PrevPredDTF(pDTF) == 0) {					\
    TIF_DelTF(pTIF) = DTF_NextDTF(pDTF);				\
  }									\
  else {								\
    DTF_NextPredDTF(DTF_PrevPredDTF(pDTF)) = DTF_NextPredDTF(pDTF);	\
  }									\
  if (DTF_NextPredDTF(pDTF) != 0) {					\
    DTF_PrevPredDTF(DTF_NextPredDTF(pDTF)) = DTF_PrevPredDTF(pDTF);	\
  }									\
  mem_dealloc(pDTF,sizeof(DeletedTableFrame),TABLE_SPACE);		\
}

#define Free_Global_DelTF_Subgoal(pDTF,pTIF) {				\
  if (DTF_PrevDTF(pDTF) == 0) {						\
    deltf_chain_begin = DTF_NextDTF(pDTF);				\
  }									\
  else {								\
    DTF_NextDTF(DTF_PrevDTF(pDTF)) = DTF_NextDTF(pDTF);			\
  }									\
  if (DTF_NextDTF(pDTF) != 0) {						\
    DTF_PrevDTF(DTF_NextDTF(pDTF)) = DTF_PrevDTF(pDTF);			\
  }									\
  if (DTF_PrevPredDTF(pDTF) == 0) {					\
    TIF_DelTF(pTIF) = DTF_NextDTF(pDTF);				\
  }									\
  if (DTF_PrevPredDTF(pDTF) != 0) {					\
    DTF_NextPredDTF(DTF_PrevPredDTF(pDTF)) = DTF_NextPredDTF(pDTF);	\
  }									\
  if (DTF_NextPredDTF(pDTF) != 0) {					\
    DTF_PrevPredDTF(DTF_NextPredDTF(pDTF)) = DTF_PrevPredDTF(pDTF);	\
  }									\
  mem_dealloc(pDTF,sizeof(DeletedTableFrame),TABLE_SPACE);		\
}

#ifdef MULTI_THREAD
#define New_Private_DelTF_Pred(pDTF,pTIF) {				\
   pDTF = (DelTFptr)mem_alloc(sizeof(DeletedTableFrame),TABLE_SPACE);	\
   if ( IsNULL(pDTF) )							\
     xsb_abort("Ran out of memory in allocation of DeletedTableFrame");	\
   DTF_CallTrie(pDTF) = TIF_CallTrie(pTIF);				\
   DTF_Subgoals(pDTF) = TIF_Subgoals(pTIF);				\
   DTF_Type(pDTF) = DELETED_PREDICATE;					\
   DTF_Mark(pDTF) = 0;                                                  \
   DTF_PrevDTF(pDTF) = 0;						\
   DTF_PrevPredDTF(pDTF) = 0;						\
   DTF_NextDTF(pDTF) = private_deltf_chain_begin;			\
   DTF_NextPredDTF(pDTF) = TIF_DelTF(pTIF);				\
   if (private_deltf_chain_begin)					\
     DTF_PrevDTF(private_deltf_chain_begin) = pDTF;			\
   if (TIF_DelTF(pTIF))  DTF_PrevPredDTF(TIF_DelTF(pTIF)) = pDTF;	\
   private_deltf_chain_begin = pDTF;					\
   TIF_DelTF(pTIF) = pDTF;                                              \
  }

#define New_Private_DelTF_Subgoal(pDTF,pTIF,pSubgoal) {			\
   pDTF = (DelTFptr)mem_alloc(sizeof(DeletedTableFrame),TABLE_SPACE);	\
   if ( IsNULL(pDTF) )							\
     xsb_abort("Ran out of memory in allocation of DeletedTableFrame");	\
   DTF_CallTrie(pDTF) = NULL;						\
   DTF_Subgoal(pDTF) = pSubgoal;					\
   DTF_Type(pDTF) = DELETED_SUBGOAL;					\
   DTF_Mark(pDTF) = 0;                                                  \
   DTF_PrevDTF(pDTF) = 0;						\
   DTF_PrevPredDTF(pDTF) = 0;						\
   DTF_NextDTF(pDTF) = private_deltf_chain_begin;			\
   DTF_NextPredDTF(pDTF) = TIF_DelTF(pTIF);				\
   if (private_deltf_chain_begin)					\
     DTF_PrevDTF(private_deltf_chain_begin) = pDTF;				\
   if (TIF_DelTF(pTIF))  DTF_PrevPredDTF(TIF_DelTF(pTIF)) = pDTF;	\
   private_deltf_chain_begin = pDTF;					\
   TIF_DelTF(pTIF) = pDTF;                                              \
  }

/* In macro below, need to reset DTF chain, and Pred-level DTF chain.
 * No mutexes, because it is called only during gc, w. only 1 active
 * thread. */
#define Free_Private_DelTF_Pred(pDTF,pTIF) {				\
  if (DTF_PrevDTF(pDTF) == 0) {						\
    private_deltf_chain_begin = DTF_NextDTF(pDTF);			\
  }									\
  else {								\
    DTF_NextDTF(DTF_PrevDTF(pDTF)) = DTF_NextDTF(pDTF);			\
  }									\
  if (DTF_NextDTF(pDTF) != 0) {						\
    DTF_PrevDTF(DTF_NextDTF(pDTF)) = DTF_PrevDTF(pDTF);			\
  }									\
  if (DTF_PrevPredDTF(pDTF) == 0) {					\
    TIF_DelTF(pTIF) = DTF_NextDTF(pDTF);				\
  }									\
  else {								\
    DTF_NextPredDTF(DTF_PrevPredDTF(pDTF)) = DTF_NextPredDTF(pDTF);	\
  }									\
  if (DTF_NextPredDTF(pDTF) != 0) {					\
    DTF_PrevPredDTF(DTF_NextPredDTF(pDTF)) = DTF_PrevPredDTF(pDTF);	\
  }									\
  mem_dealloc(pDTF,sizeof(DeletedTableFrame),TABLE_SPACE);		\
}

#define Free_Private_DelTF_Subgoal(pDTF,pTIF) {				\
  if (DTF_PrevDTF(pDTF) == 0) {						\
    private_deltf_chain_begin = DTF_NextDTF(pDTF);				\
  }									\
  else {								\
    DTF_NextDTF(DTF_PrevDTF(pDTF)) = DTF_NextDTF(pDTF);			\
  }									\
  if (DTF_NextDTF(pDTF) != 0) {						\
    DTF_PrevDTF(DTF_NextDTF(pDTF)) = DTF_PrevDTF(pDTF);			\
  }									\
  if (DTF_PrevPredDTF(pDTF) == 0) {					\
    TIF_DelTF(pTIF) = DTF_NextDTF(pDTF);				\
  }									\
  if (DTF_PrevPredDTF(pDTF) != 0) {					\
    DTF_NextPredDTF(DTF_PrevPredDTF(pDTF)) = DTF_NextPredDTF(pDTF);	\
  }									\
  if (DTF_NextPredDTF(pDTF) != 0) {					\
    DTF_PrevPredDTF(DTF_NextPredDTF(pDTF)) = DTF_PrevPredDTF(pDTF);	\
  }									\
  mem_dealloc(pDTF,sizeof(DeletedTableFrame),TABLE_SPACE);		\
}

#endif

/*===========================================================================*/

/*             
 * 		     Predicate Reference Records
 *                   ===========================
 *
 *    These records are used to hold some predicate-level information
 *    for dynamic code (non-trie asserted).  Prrefs are pointed to by
 *    the ep field of a PSC record and in turn point to ClRefs of each
 *    asserted clause and back to the PSC record itself.  Prrefs also
 *    contain fields for various GC information for the dynamic
 *    predicate and its clauses.
 */

typedef struct Deleted_Clause_Frame *DelCFptr;
typedef struct {
  Cell	Instr ;
  struct ClRefHdr *FirstClRef ;
  struct ClRefHdr *LastClRef ;
  Psc psc;                          // pointer to PSC
  int mark;                         // mark (for gc)
  //  int generation; 
  DelCFptr delcf;                      // delcf pointer
}	*PrRef, PrRefData ;

#define PrRef_Instr(PRREF)          ( (PRREF)->Instr )
#define PrRef_FirstClRef(PRREF)     ( (PRREF)->FirstClRef )
#define PrRef_LastClRef(PRREF)      ( (PRREF)->LastClRef )
//#define PrRef_Generation(PRREF)     ( (PRREF)->generation )
#define PrRef_Psc(PRREF)            ( (PRREF)->psc )
#define PrRef_Mark(PRREF)           ( (PRREF)->mark )
#define PrRef_DelCF(PRREF)          ( (PRREF)->delcf )

/* Can't use CTXTdeclc here because its included early in context.h */
#ifdef MULTI_THREAD
extern xsbBool assert_buff_to_clref_p(struct th_context *, prolog_term, byte, 
				      PrRef, int, prolog_term, int, ClRef *);

extern int assert_code_to_buff_p(struct th_context *, prolog_term);
#else
extern xsbBool assert_buff_to_clref_p(prolog_term, byte, PrRef, int,
			       prolog_term, int, ClRef *);

extern int assert_code_to_buff_p(prolog_term);
#endif


/*===========================================================================*/

/*             
 * 		     Deleted Clause Frames`
 *                   ===========================
 *
 *    These records are used to hold pointers to abolished dynamic
 *    predicates and clauses for dynamic clause garbage collection.
 *    These are effectively a union type, as they can hold deleted
 *    clauses as well as information about retractall-ed or abolished
 *    predicates.
 */     

typedef struct Deleted_Clause_Frame {
  PrRef prref;		        /* ptr to prref whose clauses are to be deleted*/
  ClRef clref;		        /* ptr to first CLref in chain */
  //  int generation;	        /* generation of retractalled prref*/
  Psc psc;		        /* pointer to psc of prref (necess?) */
  byte      type;               /* Prref or Clref */
  byte      mark;               /* Marked by scan of CP stack */
  DelCFptr next_delCF;		/* pointer to next DelCl frame */
  DelCFptr next_pred_delCF;	/* pointer to next DelCl frame same pred */
  DelCFptr prev_delCF;		/* pointer to prev DelCl frame */
  DelCFptr prev_pred_delCF;	/* pointer to prev DelCl frame same pred */
} DeletedClauseFrame;

#define DELETED_PRREF 0 
#define DELETED_CLREF 1

#define DCF_Mark(pDCF)	           ( (pDCF)->mark )
#define DCF_Type(pDCF)	           ( (pDCF)->type )
#define DCF_PrRef(pDCF)	           ( (pDCF)->prref )
#define DCF_ClRef(pDCF)	           ( (pDCF)->clref )
//#define DCF_Generation(pDCF)	   ( (pDCF)->generation )
#define DCF_PSC(pDCF)	           ( (pDCF)->psc )
#define DCF_NextDCF(pDCF)	   ( (pDCF)->next_delCF )
#define DCF_PrevDCF(pDCF)	   ( (pDCF)->prev_delCF )
#define DCF_NextPredDCF(pDCF)	   ( (pDCF)->next_pred_delCF )
#define DCF_PrevPredDCF(pDCF)	   ( (pDCF)->prev_pred_delCF )

/*===========================================================================*/

/*
 *                         Table Information Frame
 *                         =======================
 *
 *  Table Information Frames are created for each tabled predicate,
 *  allowing access to its calls and their associated answers.
 */

#include "table_status_defs.h"

/*
 *typedef enum Tabled_Evaluation_Method {
 *  VARIANT_TEM      = VARIANT_EVAL_METHOD,
 *  SUBSUMPTIVE_TEM  = SUBSUMPTIVE_EVAL_METHOD,
 * DISPATCH_BLOCK    = 3
 *} TabledEvalMethod;
 */

#define isSharedTIF(pTIF)   (TIF_EvalMethod(pTIF) != DISPATCH_BLOCK)
#define isPrivateTIF(pTIF)  (TIF_EvalMethod(pTIF) == DISPATCH_BLOCK)

typedef byte TabledEvalMethod;

typedef struct Table_Info_Frame *TIFptr;
typedef struct Table_Info_Frame {
  Psc  psc_ptr;			/* pointer to the PSC record of the subgoal */
  byte method;	                /* eval pred using variant or subsumption? */
  byte mark;                    /* (bit) to indicate tif marked for gc */
  DelTFptr del_tf_ptr;          /* pointer to first deletion frame for pred */
  BTNptr call_trie;		/* pointer to the root of the call trie */
  VariantSF subgoals;		/* chain of predicate's subgoals */
  TIFptr next_tif;		/* pointer to next table info frame */
} TableInfoFrame;

#define TIF_PSC(pTIF)		   ( (pTIF)->psc_ptr )
#define TIF_DelTF(pTIF)	           ( (pTIF)->del_tf_ptr )
#define TIF_EvalMethod(pTIF)	   ( (pTIF)->method )
#define TIF_Mark(pTIF)	           ( (pTIF)->mark )
#define TIF_CallTrie(pTIF)	   ( (pTIF)->call_trie )
#define TIF_Subgoals(pTIF)	   ( (pTIF)->subgoals )
#define TIF_NextTIF(pTIF)	   ( (pTIF)->next_tif )

#define	cps_check_mark_tif(pTIF)   TIF_Mark(pTIF) = 0x1
#define	cps_check_unmark_tif(pTIF)   TIF_Mark(pTIF) = 0x0

/*
 * #define IsVariantPredicate(pTIF)		\
 *   ( TIF_EvalMethod(pTIF) == VARIANT_TEM )
 *
 * #define IsSubsumptivePredicate(pTIF)		\
 *   ( TIF_EvalMethod(pTIF) == SUBSUMPTIVE_TEM )
 */

#define IsVariantPredicate(pTIF)		\
   ( TIF_EvalMethod(pTIF) == VARIANT_EVAL_METHOD )

#define IsSubsumptivePredicate(pTIF)		\
 ( TIF_EvalMethod(pTIF) == SUBSUMPTIVE_EVAL_METHOD )

struct tif_list {
  TIFptr first;
  TIFptr last;
};
extern struct tif_list  tif_list;

/* TLS: New_TIF is now a function in tables.c */

#ifdef MULTI_THREAD
extern TIFptr New_TIF(struct th_context *,Psc);
#else
extern TIFptr New_TIF(Psc);
#endif

/* TLS: as of 8/05 tifs are freed only when abolishing a dynamic
   tabled predicate, (or when exiting a thread to abolish
   thread-private tables).  Otherwise, keep the TIF around. */

/* shared tifs use the global structure tif_list.  Thus, the
   sequential engine uses Free_Shared_Tif rather than
   Free_Private_TIF */
   
#define Free_Shared_TIF(pTIF) {						\
    TIFptr tTIF;							\
    SYS_MUTEX_LOCK( MUTEX_TABLE );					\
    tTIF = tif_list.first;						\
    if (tTIF ==  (pTIF)) {						\
      tif_list.first = TIF_NextTIF((pTIF));				\
      if  (tif_list.last == (pTIF)) tif_list.last = NULL;		\
    }									\
    else {								\
      while  (tTIF != NULL && TIF_NextTIF(tTIF) != (pTIF))		\
	tTIF =  TIF_NextTIF(tTIF);					\
      if (!tTIF) xsb_exit("Trying to free nonexistent TIF");		\
      if ((pTIF) == tif_list.last) tif_list.last = tTIF;		\
      TIF_NextTIF(tTIF) = TIF_NextTIF((pTIF));				\
    }									\
    SYS_MUTEX_UNLOCK( MUTEX_TABLE );					\
    delete_predicate_table(CTXTc pTIF);					\
    mem_dealloc((pTIF),sizeof(TableInfoFrame),TABLE_SPACE);		\
  }

#define Free_Private_TIF(pTIF) {					\
    TIFptr tTIF = private_tif_list.first;				\
    if (tTIF ==  (pTIF)) {						\
      private_tif_list.first = TIF_NextTIF((pTIF));			\
      if  (private_tif_list.last == (pTIF)) private_tif_list.last = NULL; \
    }									\
    else {								\
      while  (tTIF != NULL && TIF_NextTIF(tTIF) != (pTIF))		\
	tTIF =  TIF_NextTIF(tTIF);					\
      if (!tTIF) xsb_exit("Trying to free nonexistent TIF");		\
      if ((pTIF) == private_tif_list.last) private_tif_list.last = tTIF; \
      TIF_NextTIF(tTIF) = TIF_NextTIF((pTIF));				\
    }									\
    delete_predicate_table(CTXTc pTIF);					\
    mem_dealloc((pTIF),sizeof(TableInfoFrame),TABLE_SPACE);		\
  }

/*===========================================================================*/

/*
 *                         Table Dispatch Blocks
 *                         =======================
 *
 *  Table Information Frames are created in the multi-threaded engine
 *  to allow a single predicate to have multiple TIFs (and by
 *  extension tries), one for each thread.  A Table Dispatch Block
 *  stands between the outer TIF (to which tabletry(single)
 *  instructions point, and the per-predicate TIFs that are used to
 *  manage thread-private tables.
 */

struct TDispBlk_t { /* first two fields must be same as Table_Info_Frame for coercion! */
  Psc psc_ptr;
  byte method; /* == DISPATCH_BLOCK for disp block, VARIANT/SUB for TIF */
  byte mark;	                /* eval pred using variant or subsumption? */
  struct TDispBlk_t *PrevDB;
  struct TDispBlk_t *NextDB;
  int MaxThread;
  TIFptr Thread0;       /* should probably call this tifarray */
};
typedef struct TDispBlk_t *TDBptr;
 
#define TIF_DispatchBlock(pTIF)	   ((TDBptr) (pTIF)->psc_ptr )
#define TDB_MaxThread(pTDB)	   ( (pTDB)->MaxThread )
#define TDB_TIFArray(pTDB)         ( (&(pTDB)->Thread0) )
#define TDB_PrivateTIF(pTDB,tid)    ( TDB_TIFArray(pTDB)[(tid)] )

struct TDispBlkHdr_t {
  struct TDispBlk_t *firstDB;
  struct TDispBlk_t *lastDB;
};

/* If private predicate in MT engine, find the thread's private TIF,
   otherwise leave unchanged */
#define  handle_dispatch_block(tip)					\
  if ( isPrivateTIF(tip) ) {						\
    TDBptr tdispblk;							\
    tdispblk = (TDBptr) tip;						\
    if (th->tid > TDB_MaxThread(tdispblk))				\
      xsb_abort("Table Dispatch block too small");			\
    tip = TDB_PrivateTIF(tdispblk,th->tid);				\
    if (!tip) {								\
      /* this may not be possible, as it may always be initted in get_tip? */\
      tip = New_TIF(CTXTc tdispblk->psc_ptr);			\
      TDB_PrivateTIF(tdispblk,th->tid) = tip;				\
    }									\
  }

/*===========================================================================*/

typedef struct ascc_edge *EPtr;
typedef struct completion_stack_frame *ComplStackFrame;

/*----------------------------------------------------------------------*/
/*  Approximate Strongly Connected Component Edge Structure.		*/
/*----------------------------------------------------------------------*/

struct ascc_edge {
  ComplStackFrame ascc_node_ptr;
  EPtr next;
};

#define ASCC_EDGE_SIZE		(sizeof(struct ascc_edge)/sizeof(CPtr))

#define edge_to_node(e)		((EPtr)(e))->ascc_node_ptr
#define next_edge(e)		((EPtr)(e))->next

/*----------------------------------------------------------------------*/
/*  Completion Stack Structure (ASCC node structure).			*/
/*									*/
/*  NOTE: Please make sure that fields "DG_edges" and "DGT_edges" are	*/
/*	  the last fields of the structure, and each time you modify	*/
/*	  this structure you also update the definition of the		*/
/*	  "compl_stk_frame_field" array defined in file debug.c		*/
/*----------------------------------------------------------------------*/

#define DELAYED		-1

/*----------------------------------------------------------------------*/

struct completion_stack_frame {
  VariantSF subgoal_ptr;
  int     _level_num;
  ALNptr  del_ret_list;   /* to reclaim deleted returns */
  int     visited;
#ifndef LOCAL_EVAL
  EPtr    DG_edges;
  EPtr    DGT_edges;
#endif
#ifdef CONC_COMPL
  CPtr	  ext_cons;
#endif
} ;

#define COMPLFRAMESIZE	(sizeof(struct completion_stack_frame)/sizeof(CPtr))

#define compl_subgoal_ptr(b)	((ComplStackFrame)(b))->subgoal_ptr
#define compl_level(b)		((ComplStackFrame)(b))->_level_num
#define compl_del_ret_list(b)	((ComplStackFrame)(b))->del_ret_list
#define compl_visited(b)	((ComplStackFrame)(b))->visited
#ifndef LOCAL_EVAL
#define compl_DG_edges(b)	((ComplStackFrame)(b))->DG_edges
#define compl_DGT_edges(b)	((ComplStackFrame)(b))->DGT_edges
#endif
#ifdef CONC_COMPL
#define compl_ext_cons(b)	((ComplStackFrame)(b))->ext_cons
#endif

#define prev_compl_frame(b)	(((CPtr)(b))+COMPLFRAMESIZE)
#define next_compl_frame(b)	(((CPtr)(b))-COMPLFRAMESIZE)


#define adjust_level(CS_FRAME) {					\
  int new_level = compl_level(CS_FRAME);				\
  if ( new_level < compl_level(openreg) ) {				\
    CPtr csf = CS_FRAME;						\
    while ( (compl_level(csf) >= new_level) && (csf >= openreg) ) {	\
      compl_level(csf) = new_level;					\
      csf = next_compl_frame(csf);					\
    }									\
  }									\
}


/*
 *  The overflow test MUST be placed after the initialization of the
 *  ComplStackFrame in the current implementation.  This is so that the
 *  corresponding subgoal which points to this frame can be found and its
 *  link can be updated if an expansion is required.  This was the simplest
 *  solution to not leaving any dangling pointers to the old area.
 */

#define push_completion_frame_common(subgoal) \
  level_num++; \
  openreg -= COMPLFRAMESIZE; \
  compl_subgoal_ptr(openreg) = subgoal; \
  compl_level(openreg) = level_num; \
  compl_del_ret_list(openreg) = NULL; \
  compl_visited(openreg) = FALSE

#define push_completion_frame_batched(subgoal) \
  compl_DG_edges(openreg) = compl_DGT_edges(openreg) = NULL

#ifdef LOCAL_EVAL
#define	push_completion_frame(subgoal)	\
  push_completion_frame_common(subgoal); \
  check_completion_stack_overflow
#else
#define	push_completion_frame(subgoal)	\
  push_completion_frame_common(subgoal); \
  push_completion_frame_batched(subgoal); \
  check_completion_stack_overflow
#endif

#if (!defined(LOCAL_EVAL))
#define compact_completion_frame(cp_frame,cs_frame,subgoal)	\
  compl_subgoal_ptr(cp_frame) = subgoal;			\
  compl_level(cp_frame) = compl_level(cs_frame);		\
  compl_visited(cp_frame) = FALSE;				\
  compl_DG_edges(cp_frame) = compl_DGT_edges(cp_frame) = NULL;  \
  cp_frame = next_compl_frame(cp_frame)
#endif

/*----------------------------------------------------------------------*/
/*  Subgoal (Call) Structure.						*/
/*----------------------------------------------------------------------*/

#include "slgdelay.h"

/*----------------------------------------------------------------------*/

enum SubgoalFrameType {
  SHARED_VARIANT_PRODUCER_SFT        = 0x06,   /* binary 0110 */
  SHARED_SUBSUMPTIVE_PRODUCER_SFT    = 0x05,   /* binary 0101 */
  SHARED_SUBSUMED_CONSUMER_SFT       = 0x04,   /* binary 0100 */
  PRIVATE_VARIANT_PRODUCER_SFT       = 0x02,   /* binary 0010 */
  PRIVATE_SUBSUMPTIVE_PRODUCER_SFT   = 0x01,   /* binary 0001 */
  PRIVATE_SUBSUMED_CONSUMER_SFT      = 0x00    /* binary 0000 */
};

/* Private is default */
#define VARIANT_PRODUCER_SFT   0x02
#define SUBSUMPTIVE_PRODUCER_SFT   0x01
#define SUBSUMED_CONSUMER_SFT   0x00

#define VARIANT_SUBSUMPTION_MASK  0x03

#define SHARED_PRIVATE_MASK 0x04
#define SHARED_SFT 0x04
#define PRIVATE_SFT 0x00

/* --------------------------------

   Variant (Producer) Subgoal Frame

   Note that the cp_ptr, which is not needed until a table is
   complete, is reused as the pointer to the DelTF -- but the DelTF
   usage will occur only after the table has been completed, so its
   safe.

   -------------------------------- */

typedef struct subgoal_frame {
  byte sf_type;		  /* The type of subgoal frame */
  byte is_complete;	  /* If producer, whether its answer set is complete */
  byte is_reclaimed;	  /* Whether structs for supporting answer res from an
			     incomplete table have been reclaimed */
  TIFptr tif_ptr;	  /* Table of which this call is a part */
  BTNptr leaf_ptr;	  /* Handle for call in the CallTrie */
  BTNptr ans_root_ptr;	  /* Root of the return trie */
  ALNptr ans_list_ptr;	  /* Pointer to the list of returns in the ret trie */
  ALNptr ans_list_tail;	  /* pointer to the tail of the answer list */
  void *next_subgoal;	  
  void *prev_subgoal;
  CPtr  cp_ptr;		  /* Pointer to the Generator CP */
  CPtr asf_list_ptr;	  /* Pointer to list of (CP) active subgoal frames */
  CPtr compl_stack_ptr;	  /* Pointer to subgoal's completion stack frame */
  CPtr compl_suspens_ptr; /* SLGWAM: CP stack ptr */
  PNDE nde_list;	  /* pointer to a list of negative DEs */
  DelTFptr deltf_ptr;
#ifdef MULTI_THREAD
  int tid;		  /* Thread id of the generator thread for this sg */
#endif
#ifdef CONC_COMPL
  ALNptr tag;		  /* Tag can't be stored in answer list in conc compl */
#endif
#ifdef SHARED_COMPL_TABLES
  byte grabbed; 	  /* Subgoal is marked to be computed for leader in
			     deadlock detection */
#endif
} variant_subgoal_frame;

#define subg_sf_type(b)		((VariantSF)(b))->sf_type
#define subg_is_complete(b)	((VariantSF)(b))->is_complete
#define subg_is_reclaimed(b)	((VariantSF)(b))->is_reclaimed
#define subg_prev_subgoal(b)	((VariantSF)(b))->prev_subgoal
#define subg_next_subgoal(b)	((VariantSF)(b))->next_subgoal
#define subg_tif_ptr(b)		((VariantSF)(b))->tif_ptr
#define subg_leaf_ptr(b)	((VariantSF)(b))->leaf_ptr
#define subg_ans_root_ptr(b)	((VariantSF)(b))->ans_root_ptr
#define subg_ans_list_ptr(b)	((VariantSF)(b))->ans_list_ptr
#define subg_ans_list_tail(b)	((VariantSF)(b))->ans_list_tail
#define subg_cp_ptr(b)		((VariantSF)(b))->cp_ptr
#define subg_deltf_ptr(b)     	((VariantSF)(b))->deltf_ptr
#define subg_asf_list_ptr(b)	((VariantSF)(b))->asf_list_ptr

/* use this for mark as completed == 0 */
#define subg_compl_stack_ptr(b)	((VariantSF)(b))->compl_stack_ptr
#define subg_compl_susp_ptr(b)	((VariantSF)(b))->compl_suspens_ptr
#define subg_nde_list(b)	((VariantSF)(b))->nde_list

#define subg_tid(b)		((VariantSF)(b))->tid
#define subg_tag(b)		((VariantSF)(b))->tag
#define subg_grabbed(b)		((VariantSF)(b))->grabbed

/* Subsumptive Producer Subgoal Frame
   ---------------------------------- */
typedef struct SubsumedConsumerSubgoalFrame *SubConsSF;
typedef struct SubsumptiveProducerSubgoalFrame *SubProdSF;
typedef struct SubsumptiveProducerSubgoalFrame {
  variant_subgoal_frame  var_sf;
  SubConsSF  consumers;		/* List of properly subsumed subgoals which
				   consume from a producer's answer set */
} subsumptive_producer_sf;

#define subg_consumers(SF)	((SubProdSF)(SF))->consumers


/* Subsumed Consumer Subgoal Frame
 * -------------------------------
 *  Position of shared fields MUST correspond to that of variant_subgoal_frame.
 */
typedef struct SubsumedConsumerSubgoalFrame {
  byte sf_type;		   /* The type of subgoal frame */
  byte junk[2];
  TIFptr tif_ptr;	   /* Table of which this call is a part */
  BTNptr leaf_ptr;	   /* Handle for call in the CallTrie */
  SubProdSF producer;	   /* The subgoal frame from whose answer set answers
			      are collected into the answer list */
  ALNptr ans_list_ptr;	   /* Pointer to the list of returns in the ret trie */
  ALNptr ans_list_tail;	   /* Pointer to the tail of the answer list */
  TimeStamp ts;		   /* Time stamp to use during next answer ident */
  SubConsSF consumers;	   /* Chain link for properly subsumed subgoals */
} subsumptive_consumer_sf;

#define conssf_producer(SF)	((SubConsSF)(SF))->producer
#define conssf_timestamp(SF)	((SubConsSF)(SF))->ts
#define conssf_consumers(SF)	((SubConsSF)(SF))->consumers


/* beginning of REAL answers in the answer list */
#define subg_answers(subg)	ALN_Next(subg_ans_list_ptr(subg))

#define IsVariantSF(pSF) \
  ((subg_sf_type(pSF) & VARIANT_SUBSUMPTION_MASK) == VARIANT_PRODUCER_SFT)
#define IsSubProdSF(pSF) \
  ((subg_sf_type(pSF) & VARIANT_SUBSUMPTION_MASK) == SUBSUMPTIVE_PRODUCER_SFT)
#define IsSubConsSF(pSF) \
  ((subg_sf_type(pSF) & VARIANT_SUBSUMPTION_MASK) == SUBSUMED_CONSUMER_SFT)

#define IsPrivateSF(pSF) \
  ((subg_sf_type(pSF) & SHARED_PRIVATE_MASK) == PRIVATE_SFT)
#define IsSharedSF(pSF) \
  ((subg_sf_type(pSF) & SHARED_PRIVATE_MASK) == SHARED_SFT)

#define IsVariantProducer(pSF)		IsVariantSF(pSF)
#define IsSubsumptiveProducer(pSF)	IsSubProdSF(pSF)
#define IsProperlySubsumed(pSF)		IsSubConsSF(pSF)

#define IsProducingSubgoal(pSF)		\
   ( IsVariantProducer(pSF) || IsSubsumptiveProducer(pSF) )

#define ProducerSubsumesSubgoals(pSF)	\
   ( IsSubsumptiveProducer(pSF) && IsNonNULL(subg_consumers(pSF)) )


/* Doubly-linked lists of Producer Subgoal Frames
 * ----------------------------------------------
 * Manipulating a doubly-linked list maintained through fields
 * `prev' and `next'.
 */

#define subg_dll_add_sf(pSF,Chain,NewChain) {	\
   subg_prev_subgoal(pSF) = NULL;		\
   subg_next_subgoal(pSF) = Chain;		\
   if ( IsNonNULL(Chain) )			\
     subg_prev_subgoal(Chain) = pSF;		\
   NewChain = (VariantSF)pSF;				\
 }

#define subg_dll_remove_sf(pSF,Chain,NewChain) {			 \
   if ( IsNonNULL(subg_prev_subgoal(pSF)) ) {				 \
     subg_next_subgoal(subg_prev_subgoal(pSF)) = subg_next_subgoal(pSF); \
     NewChain = Chain;							 \
   }									 \
   else									 \
     NewChain = (VariantSF)subg_next_subgoal(pSF);			 \
   if ( IsNonNULL(subg_next_subgoal(pSF)) )				 \
     subg_prev_subgoal(subg_next_subgoal(pSF)) = subg_prev_subgoal(pSF); \
   subg_prev_subgoal(pSF) = subg_next_subgoal(pSF) = NULL;		 \
 }


#ifndef MULTI_THREAD
extern ALNptr empty_return(VariantSF);
#define empty_return_handle(SF) empty_return(SF)
#else
extern ALNptr empty_return(struct th_context *,VariantSF);
#define empty_return_handle(SF) empty_return(th,SF)
#endif

/* Appending to the Answer List of a SF
   ------------------------------------ */
#define SF_AppendNewAnswerList(pSF,pAnsList) {	\
						\
   ALNptr pLast;				\
						\
   pLast = pAnsList;				\
   while ( IsNonNULL(ALN_Next(pLast)) )		\
     pLast = ALN_Next(pLast);			\
   SF_AppendToAnswerList(pSF,pAnsList,pLast);	\
 }

#define SF_AppendNewAnswer(pSF,pAns)	SF_AppendToAnswerList(pSF,pAns,pAns)

#define SF_AppendToAnswerList(pSF,pHead,pTail) {			\
   if ( has_answers(pSF) )						\
     /*
      *  Insert new answer at the end of the answer list.
      */								\
     ALN_Next(subg_ans_list_tail(pSF)) = pHead; 			\
   else									\
     /*
      * The dummy answer list node is the only node currently in the list.
      * It's pointed to by the head ptr, but the tail ptr is NULL.
      */								\
     ALN_Next(subg_ans_list_ptr(pSF)) = pHead;				\
   subg_ans_list_tail(pSF) = pTail;					\
 }


/* Global Structure Management
   --------------------------- */
#define SUBGOAL_FRAMES_PER_BLOCK    16

extern struct Structure_Manager smVarSF;
extern struct Structure_Manager smProdSF;
extern struct Structure_Manager smConsSF;


/* Subgoal Frame (De)Allocation
   ---------------------------- */

/* NewProducerSF() is now a function, in tables.c */

#define FreeProducerSF(SF) {					\
   subg_dll_remove_sf(SF,TIF_Subgoals(subg_tif_ptr(SF)),	\
		      TIF_Subgoals(subg_tif_ptr(SF)));		\
   if ( IsVariantSF(SF) ) {					\
     if (IsSharedSF(SF)) {					\
       SM_DeallocateSharedStruct(smVarSF,SF);			\
     } else {							\
       SM_DeallocateStruct(smVarSF,SF);				\
     }								\
   }								\
   else								\
     SM_DeallocateStruct(smProdSF,SF)				\
 }


/*
 *  Allocates and initializes a subgoal frame for a consuming subgoal: a
 *  properly subsumed call consuming from an incomplete producer.
 *  Consuming subgoals are NOT inserted into the subgoal chain
 *  maintained by the TIF, but instead are maintained by the producer in
 *  a private linked list.  Many fields of a consumer SF are left blank
 *  since it won't be used in the same way as those for producers.  Its
 *  main purpose is to maintain the answer list and the call form.  Just
 *  as for the producer, an answer-list node is allocated for pointing
 *  to a dummy answer node and inserted into the answer list.
 *
 *  Finally, some housekeeping is needed to support lazy creation of the
 *  auxiliary structures in the producer's answer TST.  If this is the
 *  first consumer for this producer, then create these auxiliary
 *  structures.
 */

#ifndef MULTI_THREAD
void tstCreateTSIs(TSTNptr);
#define     tstCreateTSIs_handle(Producer) tstCreateTSIs(Producer) 
#else
void tstCreateTSIs(struct th_context *,TSTNptr);
#define     tstCreateTSIs_handle(Producer) tstCreateTSIs(th,Producer) 
#endif

/* Private structure manager for subsumptive tables: no shared
   allocation needed */
#define NewSubConsSF(SF,Leaf,TableInfo,Producer) {		\
								\
   void *pNewSF;						\
								\
   SM_AllocateStruct(smConsSF,pNewSF);				\
   pNewSF = memset(pNewSF,0,sizeof(subsumptive_consumer_sf));	\
   subg_sf_type(pNewSF) = SUBSUMED_CONSUMER_SFT;		\
   subg_tif_ptr(pNewSF) = TableInfo;				\
   subg_leaf_ptr(pNewSF) = Leaf;				\
   CallTrieLeaf_SetSF(Leaf,pNewSF);				\
   conssf_producer(pNewSF) = (SubProdSF)Producer;		\
   if ( ! ProducerSubsumesSubgoals(Producer) )			\
     tstCreateTSIs_handle((TSTNptr)subg_ans_root_ptr(Producer));		\
   subg_ans_list_ptr(pNewSF) = empty_return_handle(pNewSF);		\
   conssf_timestamp(pNewSF) = CONSUMER_SF_INITIAL_TS;		\
   conssf_consumers(pNewSF) = subg_consumers(Producer);		\
   subg_consumers(Producer) = (SubConsSF)pNewSF;		\
   SF = (VariantSF)pNewSF;					\
}

/*----------------------------------------------------------------------*/
/*----------------------------------------------------------------------*/

#define set_min(a,b,c)	if (b < c) a = b; else a = c

#define tab_level(SUBG_PTR)     \
        compl_level((subg_compl_stack_ptr(SUBG_PTR)))
#define next_tab_level(CSF_PTR) \
        compl_level(prev_compl_frame(CSF_PTR))

#define is_leader(CSF_PTR)	\
	(next_tab_level(CSF_PTR) < compl_level(CSF_PTR))

/*----------------------------------------------------------------------*/
/* Codes for completed subgoals (assigned to subg_answers)              */
/*----------------------------------------------------------------------*/

#define NO_ANSWERS	(ALNptr)0
#define UNCOND_ANSWERS	(ALNptr)1
#define COND_ANSWERS	(ALNptr)2
#define INCOMP_ANSWERS	(ALNptr)3

/*----------------------------------------------------------------------*/
/* The following 2 macros are to be used for incomplete subgoals.	*/
/*----------------------------------------------------------------------*/

#define has_answers(SUBG_PTR)	    IsNonNULL(subg_answers(SUBG_PTR))
#define has_no_answers(SUBG_PTR)    IsNULL(subg_answers(SUBG_PTR))

/*----------------------------------------------------------------------*/
/* The following 5 macros should be used only for completed subgoals.	*/
/*----------------------------------------------------------------------*/

/*
 * These defs depend on when the root of an answer trie is created.
 * Currently, this is when the first answer is added to the set.  They
 * are also dependent upon representation of the truth of ground goals.
 * Currently, true subgoals have an ESCAPE node placed below the root,
 * while false goals have no root nor leaves (since no answer was ever
 * inserted, there was no opportunity to create a root).
 */
#define has_answer_code(SUBG_PTR)				\
	( IsNonNULL(subg_ans_root_ptr(SUBG_PTR)) &&		\
	  IsNonNULL(BTN_Child(subg_ans_root_ptr(SUBG_PTR))) )

#define subgoal_fails(SUBG_PTR)			\
	( ! has_answer_code(SUBG_PTR) )

/* should only be used on ground subgoals (is for escape node inspection) */
#define subgoal_unconditionally_succeeds(SUBG_PTR)			    \
        ( has_answer_code(SUBG_PTR) &&					    \
	  is_unconditional_answer(BTN_Child(subg_ans_root_ptr(SUBG_PTR))) )

#define mark_subgoal_failed(SUBG_PTR)	\
	(subg_ans_root_ptr(SUBG_PTR) = NULL)

#define neg_simplif_possible(SUBG_PTR)	\
	((subgoal_fails(SUBG_PTR)) && (subg_nde_list(SUBG_PTR) != NULL))

/*----------------------------------------------------------------------*/

#define is_completed(SUBG_PTR)		subg_is_complete(SUBG_PTR)

#define structs_are_reclaimed(SUBG_PTR) subg_is_reclaimed(SUBG_PTR)

#ifndef MULTI_THREAD   
#define mark_as_completed(SUBG_PTR) {		\
          subg_is_complete(SUBG_PTR) = TRUE;	\
          reclaim_del_ret_list(SUBG_PTR);	\
        }
#else
#define mark_as_completed(SUBG_PTR) {		\
          subg_is_complete(SUBG_PTR) = TRUE;	\
          reclaim_del_ret_list(th, SUBG_PTR);	\
        }
#endif

#define subgoal_space_has_been_reclaimed(SUBG_PTR,CS_FRAME) \
        (SUBG_PTR != compl_subgoal_ptr(CS_FRAME))

#define mark_delayed(csf1, csf2, susp) { \
	  compl_visited(csf1) = DELAYED; \
	  compl_visited(csf2) = DELAYED; \
  /* do not put TRUE but some !0 value that GC can recognize as int tagged */\
	  csf_neg_loop(susp) = XSB_INT; \
        }

/*----------------------------------------------------------------------*/
/* The following macro might be called more than once for some subgoal. */
/* So, please make sure that functions/macros that it calls are robust  */
/* under repeated uses.                                 - Kostis.       */
/* A new Subgoal Frame flag prevents multiple calls.	- Ernie		*/
/*----------------------------------------------------------------------*/

#ifndef MULTI_THREAD
#define reclaim_incomplete_table_structs(SUBG_PTR) {	\
   if ( ! structs_are_reclaimed(SUBG_PTR) ) {		\
     table_complete_entry(SUBG_PTR);			\
     structs_are_reclaimed(SUBG_PTR) = TRUE;		\
   }							\
 }
#else
#define reclaim_incomplete_table_structs(SUBG_PTR) {	\
   if ( ! structs_are_reclaimed(SUBG_PTR) ) {		\
     table_complete_entry(th, SUBG_PTR);			\
     structs_are_reclaimed(SUBG_PTR) = TRUE;		\
   }							\
 }
#endif

/*----------------------------------------------------------------------*/
#ifdef DEMAND
#define Reset_Demand_Freeze_Registers \
    bdfreg = bfreg; \
    trdfreg = trfreg; \
    hdfreg = hfreg; \
    edfreg = efreg
#else
#define Reset_Demand_Freeze_Registers 
#endif

#define reset_freeze_registers \
    bfreg = (CPtr)(tcpstack.high) - CP_SIZE; \
    trfreg = (CPtr *)(tcpstack.low); \
    hfreg = (CPtr)(glstack.low); \
    efreg = (CPtr)(glstack.high) - 1; \
    level_num = xwammode = 0; \
    root_address = ptcpreg = NULL; \
    Reset_Demand_Freeze_Registers

#define adjust_freeze_registers(tcp) \
    if (bfreg < tcp_bfreg(tcp)) { bfreg = tcp_bfreg(tcp); }	 \
    if (trfreg > tcp_trfreg(tcp)) { trfreg = tcp_trfreg(tcp); }\
    if (hfreg > tcp_hfreg(tcp)) { hfreg = tcp_hfreg(tcp); }	 \
    if (efreg < tcp_efreg(tcp)) { efreg = tcp_efreg(tcp); }

#define reclaim_stacks(tcp) \
  if (tcp == root_address) { \
    reset_freeze_registers; \
    /* xsb_dbgmsg("reset registers...."); */ \
  } \
  else { \
    adjust_freeze_registers(tcp); \
    /* xsb_dbgmsg(adjust registers...."); */ \
  }

/*----------------------------------------------------------------------*/

#define pdlpush(cell)	*(pdlreg) = cell;  pdlreg--

#define pdlpop		*(++pdlreg)

#define pdlempty	(pdlreg == (CPtr)(pdl.high) - 1)

#define resetpdl \
   if (pdlreg < (CPtr) pdl.low) \
     xsb_exit("pdlreg grew too much"); \
   else (pdlreg = (CPtr)(pdl.high) - 1)

#define remove_incomplete_tables_loop(Endpoint) remove_incomplete_tries(Endpoint)

#define remove_incomplete_tables() remove_incomplete_tries(CTXTc COMPLSTACKBOTTOM)

/*----------------------------------------------------------------------*/

#define get_var_and_attv_nums(var_num, attv_num, tmp_int)	\
  var_num = tmp_int & 0xffff;					\
  attv_num = tmp_int >> 16

/*----------------------------------------------------------------------*/

#endif /* __MACRO_XSB_H__ */
