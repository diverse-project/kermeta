/* File:      emudef.h
** Author(s): Warren, Swift, Xu, Sagonas
** Contact:   xsb-contact@cs.sunysb.edu
** 
** Copyright (C) The Research Foundation of SUNY, 1986, 1993-1998
** Copyright (C) ECRC, Germany, 1990
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
** $Id: emudef.h,v 1.59 2006/02/06 20:20:03 tswift Exp $
** 
*/

#include "debugs/debug_attv.h"

#ifndef MULTI_THREAD
/* Argument Registers
   ------------------ */
Cell reg[MAX_REGS];


/* Special Registers
   ----------------- */
CPtr ereg;		/* last activation record       */
CPtr breg;		/* last choice point            */
CPtr hreg;		/* top of heap                  */
CPtr *trreg;		/* top of trail stack           */
CPtr hbreg;		/* heap back track point        */
CPtr sreg;		/* current build or unify field */
byte *cpreg;		/* return point register        */
byte *pcreg;		/* program counter              */
CPtr ebreg;		/* breg into environment stack	*/
#ifdef CP_DEBUG
Psc pscreg;
#endif

CPtr efreg;
CPtr bfreg;
CPtr hfreg;
CPtr *trfreg;

CPtr pdlreg;
CPtr openreg;

/* TLS 08/05: Root address is the address of the first tabled choice
   point on the thread's stack.  It is used to reclaim freeze
   registers, but could be removed, I think. */
CPtr root_address;      

CPtr ptcpreg = NULL;
CPtr delayreg;

#ifdef DEMAND
/* demand-freeze registers */
CPtr edfreg;
CPtr bdfreg;
CPtr hdfreg;
CPtr *trdfreg;
#endif

VarString *tsgLBuff1;
VarString *tsgLBuff2;
VarString *tsgSBuff1;
VarString *tsgSBuff2;

/*
 * interrupt_reg points to interrupt_counter, which stores the number of
 * interrupts in the interrupt chain for attributed variables.
 */
Cell interrupt_counter;
CPtr interrupt_reg = &interrupt_counter;

#endif /* MULTI_THREAD */

/*
 * Ptr to the beginning of instr. array
 */ 
byte *inst_begin_gl;

char *nil_string, *true_string;

Pair list_pscPair;

Psc list_psc, comma_psc, true_psc, if_psc, colon_psc;
Psc tnot_psc, delay_psc;
Psc box_psc;

/*
 * Ret PSC's are used to store substitution factors for subgoal calls
 * or answers.  A psc with a new arity will be created when needed,
 * except that ret_psc[0] stores the pointer to STRING "ret" and is
 * initialized when the system is started.
 */
Psc ret_psc[MAX_ARITY];

/* TLS: changed name to accord with new global conventions. */
char *list_dot_string;

#ifndef MULTI_THREAD
int asynint_code = 0;
int asynint_val = 0;
#endif

int next_free_code = 0;
unsigned long enc[16] = {0xffffffff,0xffffffff,0xffffffff,0xffffffff,
			 0xffffffff,0xffffffff,0xffffffff,0xffffffff,
			 0xffffffff,0xffffffff,0xffffffff,0xffffffff,
			 0xffffffff,0xffffffff,0xffffffff,0xffffffff};
unsigned long dec[8] = {0xffffffff,0xffffffff,0xffffffff,0xffffffff,
			0xffffffff,0xffffffff,0xffffffff,0xffffffff};

/* Replacements for labelled code in emusubs.i */

#define nunify_with_nil(op)						\
  XSB_Deref(op);       							\
  if (isref(op)) {							\
    /* op is FREE */							\
    bind_nil((CPtr)(op));						\
  }									\
  else if (isnil(op)) {XSB_Next_Instr();} /* op == [] */		\
  else if (isattv(op)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_nil, interrupt needed\n"));	\
    /* add_interrupt(op, makenil);	*/				\
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makenil);   		\
    bind_copy((CPtr)dec_addr(op1), makenil);                  		\
  }									\
  else Fail1;	/* op is LIST, INT, or FLOAT */

/*======================================================================*/

#define nunify_with_con(OP1,OP2)					\
  XSB_Deref(OP1);      							\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
    bind_string((CPtr)(OP1), (char *)OP2);				\
  }									\
  else if (isstring(OP1)) {						\
    if (string_val(OP1) == (char *)OP2) {XSB_Next_Instr();} else Fail1;	\
  }									\
  else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_con, interrupt needed\n"));	\
    /* add_interrupt(OP1, makestring((char *)OP2)); */			\
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makestring((char *)OP2));   	\
    bind_string((CPtr)dec_addr(op1),(char *)OP2);     	\
  }									\
  else Fail1;


/*======================================================================*/

#define nunify_with_num(OP1,OP2)					\
  /* op1 is general, op2 has number (untagged) */			\
  XSB_Deref(OP1);      							\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
    bind_oint((CPtr)(OP1), (Integer)OP2);                 			\
  }									\
  else if (isinteger(OP1)) {						\
    if (oint_val(OP1) == (Integer)OP2) {XSB_Next_Instr();} else Fail1;	        \
  }									\
  else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_num, interrupt needed\n"));	\
    /* add_interrupt(OP1, OP2); */				        \
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makeint(OP2));  \
    bind_oint((CPtr)dec_addr(op1), (Integer)OP2);                 		\
  }									\
  else Fail1;	/* op1 is STRING, FLOAT, STRUCT, or LIST */

/*======================================================================*/

#define nunify_with_float(OP1,OP2)					\
  XSB_Deref(OP1);      							\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
    bind_float_tagged(vptr(OP1), makefloat(OP2));			\
  }									\
  else if (isofloat(OP1)) {						\
    if ( (float)ofloat_val(OP1) == OP2) {				\
      XSB_Next_Instr();							\
    }									\
    else Fail1;								\
  }									\
  else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_float, interrupt needed\n"));	\
    /* add_interrupt(OP1, OP2); */				        \
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makefloat(OP2)); \
    bind_float_tagged((CPtr)dec_addr(op1), makefloat(OP2));		\
  }									\
  else Fail1;	/* op1 is INT, STRING, STRUCT, or LIST */ 

/*======================================================================*/

#define nunify_with_float_get(OP1,OP2)					\
  XSB_Deref(OP1);      							\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
      bind_boxedfloat(vptr(OP1), OP2);					\
  }									\
  else if (isofloat(OP1)) {						\
    if ( (float)ofloat_val(OP1) == OP2) {				\
      XSB_Next_Instr();							\
    }									\
    else Fail1;								\
  }									\
  else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_float, interrupt needed\n"));	\
    /* add_interrupt(OP1, OP2); */				        \
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makefloat(OP2)); \
    bind_boxedfloat((CPtr)dec_addr(op1), OP2);				\
  }									\
  else Fail1;	/* op1 is INT, STRING, STRUCT, or LIST */ 

/*======================================================================*/

#define nunify_with_str(OP1,OP2)					\
  /* struct psc_rec *str_ptr; using op2 */				\
  XSB_Deref(OP1);					       		\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
    bind_cs((CPtr)(OP1), (Pair)hreg);					\
    new_heap_functor(hreg, (Psc)OP2);					\
    flag = WRITE;							\
  }									\
  else if (isconstr(OP1)) {						\
    OP1 = (Cell)(cs_val(OP1));						\
    if (*((Psc *)OP1) == (Psc)OP2) {					\
      flag = READFLAG;							\
      sreg = (CPtr)OP1 + 1;						\
    }									\
    else Fail1;								\
  }									\
  else if ((Psc)OP2 == box_psc) {					\
    Cell ignore_addr;							\
    if (isfloat(OP1)) 							\
      bld_boxedfloat(CTXTc &ignore_addr, float_val(OP1));		\
    else if (isinteger(OP1)) 						\
      {bld_oint(&ignore_addr, int_val(OP1));}				\
    flag = READFLAG;							\
    sreg = hreg - 3;							\
  } else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_str, interrupt needed\n"));	\
    /* add_interrupt(OP1, makecs(hreg)); */				\
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makecs(hreg));	\
    bind_copy((CPtr)dec_addr(op1), makecs(hreg));                       \
    new_heap_functor(hreg, (Psc)OP2);					\
    flag = WRITE;							\
  }									\
  else Fail1;

/*======================================================================*/

#define nunify_with_list_sym(OP1)					\
  XSB_Deref(OP1);	       						\
  if (isref(OP1)) {							\
    /* op1 is FREE */							\
    bind_list((CPtr)(OP1), hreg);					\
    flag = WRITE;							\
  }									\
  else if (islist(OP1)) {						\
    sreg = clref_val(OP1);						\
    flag = READFLAG;							\
  }									\
  else if (isattv(OP1)) {						\
    xsb_dbgmsg((LOG_ATTV,">>>> ATTV nunify_with_list_sym, interrupt needed\n"));	\
    /* add_interrupt(OP1, makelist(hreg)); */				\
    add_interrupt(CTXTc cell(((CPtr)dec_addr(op1) + 1)),makelist(hreg));\
    bind_copy((CPtr)dec_addr(op1), makelist(hreg));                     \
    flag = WRITE;							\
  }									\
  else Fail1;

/*======================================================================*/

/*
 * In getattv, the flag will always be WRITE.  The unification will be
 * done here...
 * This operation is used in the getattv instruction, emitted for
 * asserted code with attributed variables.
 *
 * The way to do it:
 * 
 * href      ->  Op1   
 * href + 1  ->  _
 *
 * Put [reference to href + 1|X] in the interrupt queue.
 *
 * Set the WRITE flag to have the next instructions put the attribute
 * at href + 1.
 *
 * The interrupt should not be handled before the attribute is created.
 */
#define nunify_with_attv(OP1) {					\
  XSB_Deref(OP1);	       					\
  if (isref(OP1)) {						\
    bind_attv((CPtr)(OP1), hreg);				\
    new_heap_free(hreg);	/* the VAR part of the attv */	\
  }								\
  else {							\
    xsb_dbgmsg((LOG_ATTV,">>>> nunify_with_attv, interrupt needed\n"));	\
    /* add_interrupt(makeattv(hreg), OP1); */			\
    *hreg = OP1; hreg++;					\
    add_interrupt(CTXTc (Integer)hreg, OP1);			\
  }								\
  flag = WRITE;							\
}

/*======================================================================*/

/* TLS: refactored to support Thread Cancellation */

#define call_sub(PSC) {							\
  if ( !(asynint_val) & !int_val(cell(interrupt_reg)) ) {   	        \
    lpcreg = (pb)get_ep(PSC);						\
  } else {								\
    if (asynint_val) {							\
      if (asynint_val & KEYINT_MARK) {					\
        synint_proc(CTXTc PSC, MYSIG_KEYB);	                      	\
        lpcreg = pcreg;							\
        asynint_val = asynint_val & ~KEYINT_MARK;			\
        asynint_code = 0;						\
      } else if (asynint_val & PROFINT_MARK) {				\
        asynint_val &= ~PROFINT_MARK;					\
        log_prog_ctr(lpcreg);						\
        lpcreg = (byte *)get_ep(PSC);					\
      } else if (asynint_val & MSGINT_MARK) {                           \
        pcreg = (byte *)get_ep(PSC);					\
        intercept(CTXTc PSC);						\
        lpcreg = pcreg;							\
      } else if (asynint_val & THREADINT_MARK) {			\
	printf("Entered thread cancel: call_sub\n");			\
        synint_proc(CTXTc PSC, THREADSIG_CANCEL);			\
        lpcreg = pcreg;							\
        asynint_val = 0;						\
        asynint_code = 0;						\
      } else {								\
        lpcreg = (byte *)get_ep(PSC);					\
        asynint_val = 0;		         			\
      }									\
    } else if (int_val(cell(interrupt_reg))) {				\
        synint_proc(CTXTc PSC, MYSIG_ATTV);		                \
        lpcreg = pcreg;							\
    }									\
  }									\
}

#define proceed_sub {							\
  if ( !(asynint_val) & !int_val(cell(interrupt_reg)) ) {		\
     lpcreg = cpreg;							\
  } else {								\
    if (asynint_val) {							\
     if (asynint_val & KEYINT_MARK) {					\
        synint_proc(CTXTc true_psc, MYSIG_KEYB);			\
        lpcreg = pcreg;							\
        asynint_val = asynint_val & ~KEYINT_MARK;			\
        asynint_code = 0;						\
     } else if (asynint_val & MSGINT_MARK) {				\
       lpcreg = cpreg;  /* ignore MSGINT in proceed */			\
     } else if (asynint_val & PROFINT_MARK) {				\
       asynint_val &= ~PROFINT_MARK;					\
       log_prog_ctr(lpcreg);						\
       lpcreg = cpreg;							\
       asynint_code = 0;						\
     } else if (asynint_val & THREADINT_MARK) {				\
       printf("Entered thread cancel: proceed\n");			\
        synint_proc(CTXTc true_psc, THREADSIG_CANCEL);			\
        lpcreg = pcreg;							\
        asynint_val = 0;						\
        asynint_code = 0;						\
     } else {								\
        lpcreg = cpreg;							\
        asynint_code = 0;						\
     }									\
    } else if (int_val(cell(interrupt_reg))) {				\
        synint_proc(CTXTc true_psc, MYSIG_ATTV);			\
        lpcreg = pcreg;							\
    }									\
  }									\
}

