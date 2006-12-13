/* File:      memory_xsb.h
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
** $Id: memory_xsb.h,v 1.28 2006/01/27 20:29:47 tswift Exp $
** 
*/


/*===========================================================================*/

/*
 *			SLG-WAM Stack Management
 *			========================
 *
 * Information on each independent data area needed by the slg-wam is kept
 * in one of these structures.  "low" and "high" point into memory to
 * delineate the bounds of the data area: "low" gets the address returned
 * by an allocation routine, while "high" gets "low" + "size" * K.  Note:
 * this means that (1) "size" represents the number of K-byte blocks
 * allocated for this stack, and (2) "high" points off the end of the
 * allocated area.
 *
 * The logical, data structure specific details of how a region is used,
 * e.g., which pointer represents the bottom of a stack, is represented in
 * the code and the documentation.  "init_size" is used for storing the size
 * the stack was initialized to, for purposes of restoring it to this size
 * after each query via the trimcore/0 predicate.
 */


#ifndef _MEMORY_XSB_H_
#define _MEMORY_XSB_H_

/* Info Structure for the Data Regions
   ----------------------------------- */
typedef struct stack_info {
   byte *low;
   byte *high;
   long size;
   long init_size;
} System_Stack;


/* The SLG-WAM System Data Regions
   ------------------------------- */
extern System_Stack pdl,            /* PDL                        */
                    glstack,        /* Global + Local Stacks      */
                    tcpstack,       /* Trail + Choice Point Stack */
                    complstack;     /* Completion Stack           */


/*
 *  Finding the tops of stacks.
 *  ---------------------------
 *    In this form, the result can be used immediately for deref, recast,
 *    etc., as well as for assignment.  ALL macros return a pointer to the
 *    topmost USED cell on their respective stack.
 */
#define top_of_heap      (hreg - 1)
#define top_of_localstk  ( ((efreg < ebreg) && (efreg < ereg)) \
                           ? efreg  \
			   : ( (ereg < ebreg) \
			       ? ereg - *(cpreg - 2*sizeof(Cell)+3) + 1 \
			       : ebreg ) )
#define top_of_trail     ((trreg > trfreg) ? trreg : trfreg)
#define top_of_cpstack   ((breg < bfreg) ? breg : bfreg)

#define top_of_complstk  openreg

/* Testing pointer addresses
   ------------------------- */
#define IsInHeap(Ptr)	( ( (CPtr)(Ptr) <= top_of_heap ) &&	\
    			  ( (CPtr)(Ptr) >= (CPtr)glstack.low ) )

#define IsInEnv(Ptr)	( ( (CPtr)(Ptr) < (CPtr)glstack.high ) &&	\
			  ( (CPtr)(Ptr) >= top_of_localstk) )

#define IsInTrail(Ptr)	( ( (CPtr)(Ptr) <= (CPtr)top_of_trail ) &&	\
    			  ( (CPtr)(Ptr) >= (CPtr)cpstack.low ) )

#define IsInCPS(Ptr)	( ( (CPtr)(Ptr) < (CPtr)cpstack.high ) &&	\
			  ( (CPtr)(Ptr) >= top_of_cpstack) )


#define COMPLSTACKBOTTOM ((CPtr) complstack.high)


/*
 *  Size of margin between facing stacks before reallocating a larger area.
 */
//#define OVERFLOW_MARGIN	(2048 * ZOOM_FACTOR)
#define OVERFLOW_MARGIN	(8192 * ZOOM_FACTOR)


/* Calculate New Stack Size
   ------------------------ */
#define resize_stack(stack_size,min_exp) /*"stack_size" is in K-byte blocks*/\
   (((unsigned long)stack_size) < (min_exp)/K ? (stack_size) + (min_exp)/K : 2 * (stack_size))


/* Categories of permanent space use: */
#define ATOM_SPACE		0
#define STRING_SPACE		1
#define ASSERT_SPACE		2
#define COMPILED_SPACE		3
#define FOR_CODE_SPACE		4
#define TABLE_SPACE		5
#define FINDALL_SPACE		6
#define PROFILE_SPACE		7
#define MT_PRIVATE_SPACE	8
#define BUFF_SPACE		9
#define GC_SPACE		10
#define HASH_SPACE		11
#define INTERPROLOG_SPACE	12
#define THREAD_SPACE		13
#define READ_CAN_SPACE		14
#define LEAK_SPACE		15
#define SPECIAL_SPACE		16
#define OTHER_SPACE		17
// VARSTRING_SPACE??  some other to thread?

#define NUM_CATS_SPACE		18

/* Program and Symbol Tables Space (in Bytes)
   ------------------------------------------ */
extern long pspacesize[NUM_CATS_SPACE];


/* Memory Function Prototypes
   -------------------------- */
extern void *mem_alloc(unsigned long, int);
extern void *mem_alloc_nocheck(unsigned long, int);
extern void *mem_calloc(unsigned long, unsigned long, int);
extern void *mem_realloc(void *, unsigned long, unsigned long, int);
extern void *mem_realloc_nocheck(void *, unsigned long, unsigned long, int);
extern void mem_dealloc(void *, unsigned long, int);
#ifndef MULTI_THREAD
extern void tcpstack_realloc(long);
extern void complstack_realloc(long);
extern void handle_tcpstack_overflow(void);
#else
struct th_context ;
extern void tcpstack_realloc(struct th_context *, long);
extern void complstack_realloc(struct th_context *, long);
extern void handle_tcpstack_overflow(struct th_context *);
#endif


/* Instruction Externs
   ------------------- */
extern byte *inst_begin_gl;       /* ptr to beginning of instruction array. */

extern Cell answer_return_inst, check_complete_inst, hash_handle_inst,
	    resume_compl_suspension_inst, fail_inst, dynfail_inst, 
  	    halt_inst, proceed_inst, 
 resume_compl_suspension_inst2,
	    reset_inst, trie_fail_unlock_inst;


/* Stack Overflow Checkers
   ----------------------- */
#define local_global_exception "! Local/Global Stack Overflow Exception\n"

#define complstack_exception "! Completion Stack Overflow Exception\n"

#define trail_cp_exception "! Trail/CP Stack Overflow Exception\n"

#ifdef DEBUG_ASSERTIONS

#define check_tcpstack_overflow {					\
									\
   CPtr cps_top;                                                        \
   cps_top = top_of_cpstack;					        \
									\
   if ((pb)cps_top < (pb)top_of_trail + OVERFLOW_MARGIN) {		\
     if ((pb)cps_top < (pb)top_of_trail) {				\
       xsb_error("Trail clobbered Choice Point Stack");			\
       print_statistics(CTXTc 1);					\
       xsb_basic_abort(trail_cp_exception);				\
     }									\
     else {								\
       fprintf(stdwarn,							\
	       "\n++Warning: Trail / Choice Point Stack overflow:   "); \
       if (pflags[STACK_REALLOC]) {					\
	 fprintf(stdwarn, "Expanding ...\n");				\
         tcpstack_realloc(CTXTc resize_stack(tcpstack.size,0));		\
       }								\
       else {								\
         fprintf(stdwarn, "Reallocation turned OFF!\n");		\
         print_statistics(CTXTc 1);					\
         xsb_basic_abort(trail_cp_exception);				\
       }								\
     }									\
   }									\
 }

#define check_glstack_overflow(arity,PCREG,EXTRA)			   \
   if ((pb)top_of_localstk < (pb)top_of_heap + OVERFLOW_MARGIN + EXTRA) {  \
     if ((pb)top_of_localstk < (pb)top_of_heap) {			   \
       xsb_basic_abort("\nFatal ERROR:  -- "				   \
				 "Local Stack clobbered Heap --\n");	   \
     }									   \
     else {								   \
       fprintf(stdwarn, "\n++Warning: Heap / Local Stack overflow:   ");   \
       if (pflags[STACK_REALLOC]) {					   \
	 fprintf(stdwarn, "Expanding ...\n");				   \
	 glstack_realloc(CTXTc resize_stack(glstack.size,		   \
			 EXTRA+OVERFLOW_MARGIN), arity);		   \
       }								   \
       else {								   \
	 fprintf(stdwarn, "Reallocation turned OFF!\n");		   \
	 print_statistics(CTXTc 1);					   \
	 xsb_basic_abort(local_global_exception);			   \
       }								   \
     }									   \
   }

#define check_completion_stack_overflow					\
   if ( (pb)openreg < (pb)complstack.low + OVERFLOW_MARGIN ) {		\
     fprintf(stdwarn, "\n++Warning: Completion Stack overflow:   ");	\
     if (pflags[STACK_REALLOC]) {					\
       fprintf(stdwarn, "Expanding ...\n");				\
       complstack_realloc(CTXTc resize_stack(complstack.size,0));	\
     }									\
     else {								\
       fprintf(stdwarn, "Reallocation turned OFF!\n");			\
       print_statistics(CTXTc 1);					\
       xsb_basic_abort(complstack_exception);				\
     }									\
   }


#else


#define check_tcpstack_overflow {					\
									\
   CPtr cps_top = top_of_cpstack;					\
									\
   if ((pb)cps_top < (pb)top_of_trail + OVERFLOW_MARGIN) {		\
     if ((pb)cps_top < (pb)top_of_trail) {				\
       xsb_basic_abort("\nFatal ERROR:  -- Trail "			\
				  "clobbered Choice Point Stack --\n");	\
     }									\
     else {								\
       if (pflags[STACK_REALLOC])					\
         tcpstack_realloc(CTXTc resize_stack(tcpstack.size,0));		\
       else {								\
         xsb_basic_abort(trail_cp_exception);				\
       }								\
     }									\
   }									\
 }

#define check_glstack_overflow(arity,PCREG,EXTRA)			      \
   if ((pb)top_of_localstk < (pb)top_of_heap + OVERFLOW_MARGIN + EXTRA) {     \
     if ((pb)top_of_localstk < (pb)top_of_heap) {			      \
       xsb_basic_abort("\nFatal ERROR:  -- "			      	      \
				 "Local Stack clobbered Heap --\n");	      \
     }									      \
     else {								      \
       if ((pflags[STACK_REALLOC] == FALSE) ||				      \
	   (glstack_ensure_space(CTXTc EXTRA,arity) != 0)) {			      \
	 xsb_basic_abort(local_global_exception);			      \
       }								      \
     }									      \
   }

#define check_completion_stack_overflow				\
   if ( (pb)openreg < (pb)complstack.low + OVERFLOW_MARGIN ) {	\
     if (pflags[STACK_REALLOC])					\
       complstack_realloc(CTXTc resize_stack(complstack.size,0));\
     else {							\
       xsb_basic_abort(complstack_exception);		        \
     }								\
   }

#endif

#endif /* _MEMORY_XSB_H_ */
