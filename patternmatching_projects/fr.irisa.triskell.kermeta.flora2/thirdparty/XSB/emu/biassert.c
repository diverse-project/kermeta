/* File:      biassert.c
** Author(s): David S. Warren, Jiyang Xu
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
** FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License
** for more details.lo
** 
** You should have received a copy of the GNU Library General Public License
** along with XSB; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
**
** $Id: biassert.c,v 1.124 2006/07/25 14:18:41 tswift Exp $
** 
*/


#include "xsb_config.h"
#include "xsb_debug.h"

/* Special debug includes */
#include "debugs/debug_biassert.h"
#include <stdio.h>
#include <errno.h>
#include <string.h>
#include <stdlib.h>

#include "setjmp_xsb.h"
#include "auxlry.h"
#include "cell_xsb.h"
#include "psc_xsb.h"
#include "error_xsb.h"
#include "cinterf.h"
#include "memory_xsb.h"
#include "heap_xsb.h"
#include "register.h"
#include "flags_xsb.h"
#include "deref.h"
#include "inst_xsb.h"
#include "token_xsb.h"
#include "loader_xsb.h"
#include "trie_internals.h"
#include "choice.h"
#include "macro_xsb.h"
#include "tr_utils.h"
#include "trassert.h"
#include "context.h"
#include "thread_xsb.h"
#include "debug_xsb.h"
#include "biassert_defs.h"

/* --- routines used from other files ---------------------------------	*/

extern Cell val_to_hash(Cell);

extern int xsb_profiling_enabled;
extern void add_prog_seg(Psc, byte *, long);
extern void remove_prog_seg(byte *);
PrRef clref_to_prref(ClRef clref);

CPtr dbclause_cgc_block_gl = NULL;
CPtr standard_cgc_block_begin_gl = NULL;
CPtr standard_cgc_block_end_gl = NULL;

/*======================================================================*/
/* dbgen_inst: Generate an instruction in the buffer.			*/
/*======================================================================*/

#define MARKED_FOR_DELETION 66

#define write_word(Buff,Loc,w) { *(CPtr)((pb)Buff + *(Loc)) = (Cell)(w); *(Loc) += 4; \
				pad64bits(Loc); }
#define write_byte(Buff,Loc,w) { *(pb)((pb)Buff + *(Loc)) = (byte)(w); *(Loc) += 1; }

#ifdef BITS64
#define pad64bits(Loc)	{ *(Loc) += 4; }
#else
#define pad64bits(Loc)	{}
#endif

/* TLS: probably dont need to keep max thread here -- could use max_threads_glc */
struct DispBlk_t {
  struct DispBlk_t *PrevDB;
  struct DispBlk_t *NextDB;
  int MaxThread;
  CPtr Thread0;    /* Pointer to array of prrefs */
  };

struct DispBlkHdr_t {
  struct DispBlk_t *firstDB;
  struct DispBlk_t *lastDB;
} DispBlkHdr = {NULL, NULL};

#ifdef MULTI_THREAD

/* For a private dynamic predicate, return addr of its prref or its
   table wrapper */

CPtr dynpredep_to_prortb(CTXTdeclc void *pred_ep) {
    if (th->tid > (((struct DispBlk_t **)pred_ep)[1])->MaxThread) 
      xsb_abort("Dynamic Dispatch block too small");
    return (CPtr) ((&((struct DispBlk_t **)pred_ep)[1]->Thread0)[th->tid]);
}
#endif

/* Maps psc -> ep to the actual prref, accounting for dispatch tables
   and/or table wrappers. 

   Also, it could be that dynpredep_to_prref() returns NULL normally
   -- if a private predicate has been defined for one thread but not
   another.*/

PrRef dynpredep_to_prref(CTXTdeclc void *pred_ep) {
#ifdef MULTI_THREAD
  if (cell_opcode((CPtr)(pred_ep)) == switchonthread) {
    if (th->tid > (((struct DispBlk_t **)pred_ep)[1])->MaxThread) 
      xsb_abort("Dynamic Dispatch block too small");
    pred_ep = (pb) (&((struct DispBlk_t **)pred_ep)[1]->Thread0)[th->tid];
  }
  if (!pred_ep) return NULL;
#endif
  if (cell_opcode((CPtr)(pred_ep)) == tabletrysingle)
    return (PrRef)((CPtr *)(pred_ep))[6];
  else return pred_ep;
}

/* #ifdef DEBUG */
/* I hope we can trust any decent C compiler to compile away
   empty switch statements like the ones below, if DEBUG is not set
   (in which case xsb_dbgmsg is empty)                    --lfcastro */


static inline void dbgen_printinst3(Opcode, Arg1, Arg2, Arg3)
{
  switch (Opcode) {
  case getlist_tvar_tvar:
    xsb_dbgmsg((LOG_ASSERT,"getlist_tvar_tvar - %ld %ld %ld",
	       (long)Arg1,(long)Arg2,(long)Arg3)); break;
  case switchonbound:
    xsb_dbgmsg((LOG_ASSERT,"switchonbound - %ld %ld %ld",
	       (long)Arg1,(long)Arg2,(long)Arg3)); break;
  case switchon3bound:
    xsb_dbgmsg((LOG_ASSERT,"switchon3bound - %ld %ld %ld",
	       (long)Arg1,(long)Arg2,(long)Arg3)); break;
  default: xsb_dbgmsg((LOG_ASSERT,"Unknown instruction in assert %d",
		      Opcode));
  }
}

static inline void dbgen_printinst(Opcode, Arg1, Arg2)
{
  switch (Opcode) {
  case getpvar:	/* PRV */
    xsb_dbgmsg((LOG_ASSERT,"getpvar - %d %d\n", Arg1, Arg2)); break;
  case getpval:	/* PRV */
    xsb_dbgmsg((LOG_ASSERT,"getpval - %d %d\n", Arg1, Arg2)); break;
  case putpvar:	/* PRV */
    xsb_dbgmsg((LOG_ASSERT,"putpvar - %d %d\n", Arg1, Arg2)); break;
  case putpval:	/* PRV */
    xsb_dbgmsg((LOG_ASSERT,"putpval - %d %d\n", Arg1, Arg2)); break;
  case gettval:	/* PRR */
    xsb_dbgmsg((LOG_ASSERT,"gettval - %d %d\n", Arg1, Arg2)); break;
  case puttvar:	/* PRR */
    xsb_dbgmsg((LOG_ASSERT,"puttvar - %d %d\n", Arg1, Arg2)); break;
  case movreg:	/* PRR */
    xsb_dbgmsg((LOG_ASSERT,"movreg - %d %d\n", Arg1, Arg2)); break;
  case unipvar:	/* PPV */
    xsb_dbgmsg((LOG_ASSERT,"unipvar - - %d\n", Arg1)); break;
  case unipval:	/* PPV */
    xsb_dbgmsg((LOG_ASSERT,"unipval - - %d\n", Arg1)); break;
  case bldpvar:	/* PPV */
    xsb_dbgmsg((LOG_ASSERT,"bldpvar - - %d\n", Arg1)); break;
  case bldpval:	/* PPV */
    xsb_dbgmsg((LOG_ASSERT,"bldpval - - %d\n", Arg1)); break;
  case unitvar:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"unitvar - - %d\n", Arg1)); break;
  case uniavar:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"uniavar - - \n")); break;
  case unitval:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"unitval - - %d\n", Arg1)); break;
  case bldtvar:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"bldtvar - - %d\n", Arg1)); break;
  case bldavar:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"bldavar - - \n")); break;
  case bldtval:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"bldtval - - %d\n", Arg1)); break;
  case putlist:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"putlist - - %d\n", Arg1)); break;
  case getlist:	/* PPR */
    xsb_dbgmsg((LOG_ASSERT,"getlist - - %d\n", Arg1)); break;
  case getattv: /* PPR */
    xsb_dbgmsg((LOG_ASSERT,"getattv - - %d\n", Arg1)); break;
  case putattv: /* PPR */
    xsb_dbgmsg((LOG_ASSERT,"putattv - - %d\n", Arg1)); break;
  case putcon:
    xsb_dbgmsg((LOG_ASSERT,"putcon - - %d 0x%x\n", Arg1, Arg2)); break;
  case putnumcon:
    xsb_dbgmsg((LOG_ASSERT,"putnumcon - - %d 0x%x\n", Arg1, int_val(Arg2))); break;
  case putfloat:
    xsb_dbgmsg((LOG_ASSERT,"putfloat - - %d %f (0x%x)\n", Arg1, ofloat_val(Arg2), ofloat_val(Arg2))); break;
  case getcon:
    xsb_dbgmsg((LOG_ASSERT,"getcon - - %d 0x%x\n", Arg1, Arg2)); break;
  case getnumcon:
    xsb_dbgmsg((LOG_ASSERT,"getnumcon - - %d 0x%x\n", Arg1, int_val(Arg2))); break;
  case getfloat:
    xsb_dbgmsg((LOG_ASSERT,"getfloat - - %d %f (0x%x)\n", Arg1, ofloat_val(Arg2), ofloat_val(Arg2))); break;
  case putstr:
    xsb_dbgmsg((LOG_ASSERT,"putstr - - %d 0x%x\n", Arg1, Arg2)); break;
  case getstr:
    xsb_dbgmsg((LOG_ASSERT,"getstr - - %d 0x%x\n", Arg1, Arg2)); break;
  case putnil:
    xsb_dbgmsg((LOG_ASSERT,"putnil - - %d\n", Arg1)); break;
  case getnil:
    xsb_dbgmsg((LOG_ASSERT,"getnil - - %d\n", Arg1)); break;
  case bldcon:
    xsb_dbgmsg((LOG_ASSERT,"bldcon - - - 0x%x\n", Arg1)); break;
  case bldnumcon:
    xsb_dbgmsg((LOG_ASSERT,"bldnumcon - - - 0x%x\n", int_val(Arg1))); break;
  case bldfloat:
    xsb_dbgmsg((LOG_ASSERT,"bldfloat - - - %f\n", ofloat_val(Arg1))); break;
  case unicon:
    xsb_dbgmsg((LOG_ASSERT,"unicon - - - 0x%x\n", Arg1)); break;
  case uninumcon:
    xsb_dbgmsg((LOG_ASSERT,"uninumcon - - - 0x%x\n", int_val(Arg1))); break;
  case unifloat:
    xsb_dbgmsg((LOG_ASSERT,"unifloat - - - %f\n", ofloat_val(Arg1))); break;
  case xsb_execute:
    xsb_dbgmsg((LOG_ASSERT,"execute - - - 0x%x\n", Arg1)); break;
  case bldnil:
    xsb_dbgmsg((LOG_ASSERT,"bldnil - - -\n")); break;
  case uninil:
    xsb_dbgmsg((LOG_ASSERT,"uninil - - -\n")); break;
  case proceed:
    xsb_dbgmsg((LOG_ASSERT,"proceed - - -\n")); break;
  case noop:
    xsb_dbgmsg((LOG_ASSERT,"noop - - -\n")); break;
  case dynnoop:
    xsb_dbgmsg((LOG_ASSERT,"dynnoop - - -\n")); break;
  case jumptbreg:
    xsb_dbgmsg((LOG_ASSERT,"jumptbreg - - %d 0x%x\n", Arg1, Arg2)); break;
  case test_heap:
    xsb_dbgmsg((LOG_ASSERT,"test_heap - - %d %d\n", Arg1, int_val(Arg2))); break;
  case dyntrustmeelsefail:
    xsb_dbgmsg((LOG_ASSERT,"dyntrustmeelsefail - - %d 0x%x\n", Arg1, Arg2)); break;
  case dynretrymeelse:
    xsb_dbgmsg((LOG_ASSERT,"dynretrymeelse - - %d 0x%x\n", Arg1, Arg2)); break;
  case dyntrymeelse:
    xsb_dbgmsg((LOG_ASSERT,"dyntrymeelse - - %d 0x%x\n", Arg1, Arg2)); break;
  case jump:
    xsb_dbgmsg((LOG_ASSERT,"jump - - - 0x%x\n", Arg1)); break;
  case fail:
    xsb_dbgmsg((LOG_ASSERT,"fail - - -\n")); break;
  default: 
    xsb_dbgmsg((LOG_DEBUG, "Unknown instruction in assert %d",
		      Opcode));
  }
}

#define dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3) \
	dbgen_printinst3(Opcode, Arg1, Arg2, Arg3)

#define dbgen_printinst_macro(Opcode, Arg1, Arg2) \
	dbgen_printinst(Opcode, Arg1, Arg2)

/* #else  /\* DEBUG *\/ */

/* #define dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3) */
/* #define dbgen_printinst_macro(Opcode, Arg1, Arg2) */

/* #endif /\* DEBUG *\/ */


#define dbgen_inst3_tv(Opcode,Arg1,Arg2,Arg3,Buff,Loc) {	\
  dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3);		\
  write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,Arg1);	\
  write_byte(Buff,Loc,Arg2); write_byte(Buff,Loc,Arg3);		\
  pad64bits(Loc);						\
}

#define dbgen_inst3_sob(Opcode,Arg1,Arg2,Arg3,Buff,Loc) {	\
  dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3);		\
  write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,Arg1>>16);	\
  write_byte(Buff,Loc,Arg1>>8); write_byte(Buff,Loc,Arg1);	\
  pad64bits(Loc);						\
  write_word(Buff,Loc,Arg2); write_word(Buff,Loc,Arg3);		\
}

#define dbgen_inst_pvv(Opcode,Arg1,Arg2,Buff,Loc) {	\
    dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);	\
  write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
  write_byte(Buff,Loc,Arg1); write_byte(Buff,Loc,Arg2);	\
  pad64bits(Loc);					\
}

#define dbgen_inst_ppv(Opcode,Arg1,Buff,Loc) {		\
  dbgen_printinst_macro(Opcode, Arg1, 0);		\
  write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
  write_byte(Buff,Loc,0); write_byte(Buff,Loc,Arg1);	\
  pad64bits(Loc);					\
}

#define dbgen_inst_ppvw(Opcode,Arg1,Arg2,Buff,Loc) {	\
    dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);	\
    write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
    write_byte(Buff,Loc,0); write_byte(Buff,Loc,Arg1);		\
    pad64bits(Loc);						\
    write_word(Buff,Loc,Arg2);					\
}

#define dbgen_inst_ppvw_safe(Opcode,Arg1,Arg2,Buff,Loc) {	\
    int tLoc = 0, tempLoc = *Loc; char tBuff[4]; 		\
    dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);		\
    *Loc += 4;							\
    pad64bits(Loc);						\
    write_word(Buff,Loc,Arg2);					\
    write_byte(tBuff,&tLoc,Opcode); write_byte(tBuff,&tLoc,0);  \
    write_byte(tBuff,&tLoc,0); write_byte(tBuff,&tLoc,Arg1);	\
    memmove(Buff+tempLoc,tBuff,4);				\
}

#define dbgen_inst_ppvww(Opcode,Arg1,Arg2,Arg3,Buff,Loc) {	\
    dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);		\
    write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
    write_byte(Buff,Loc,0); write_byte(Buff,Loc,Arg1);		\
    pad64bits(Loc);						\
    write_word(Buff,Loc,Arg2);					\
    write_word(Buff,Loc,Arg3);					\
}

#define dbgen_inst_pppw(Opcode,Arg1,Buff,Loc) {		\
    dbgen_printinst_macro(Opcode, (Integer)Arg1, 0);	\
    write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
    write_byte(Buff,Loc,0); write_byte(Buff,Loc,0);		\
    pad64bits(Loc);						\
    write_word(Buff,Loc,Arg1);					\
}

#define dbgen_inst_ppp(Opcode,Buff,Loc) {		\
  dbgen_printinst_macro(Opcode, 0, 0);			\
  write_byte(Buff,Loc,Opcode); write_byte(Buff,Loc,0);	\
  write_byte(Buff,Loc,0); write_byte(Buff,Loc,0);	\
  pad64bits(Loc);					\
}

#define dbgen_instB3_tv(Opcode,Arg1,Arg2,Arg3) {							\
  dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3);							\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);				\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg2); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg3);		\
  pad64bits(asrtBuff->Loc);										\
}

#define dbgen_instB3_sob(Opcode,Arg1,Arg2,Arg3) {							\
  dbgen_printinst3_macro(Opcode, Arg1, Arg2, Arg3);							\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);				\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1>>16);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1>>8); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1);	\
  pad64bits(asrtBuff->Loc);										\
  write_word(asrtBuff->Buff,asrtBuff->Loc,Arg2); write_word(asrtBuff->Buff,asrtBuff->Loc,Arg3);		\
}

#define dbgen_instB_pvv(Opcode,Arg1,Arg2) {							\
  dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);						\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);			\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg2);	\
  pad64bits(asrtBuff->Loc);									\
}

#define dbgen_instB_ppv(Opcode,Arg1) {								\
  dbgen_printinst_macro(Opcode, Arg1,0);							\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);			\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,0); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1);	\
  pad64bits(asrtBuff->Loc);									\
}

#define dbgen_instB_ppvw(Opcode,Arg1,Arg2) {							\
  dbgen_printinst_macro(Opcode, Arg1, (Integer)Arg2);						\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);			\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,0); write_byte(asrtBuff->Buff,asrtBuff->Loc,Arg1);	\
  pad64bits(asrtBuff->Loc);									\
  write_word(asrtBuff->Buff,asrtBuff->Loc,Arg2);						\
}

#define dbgen_instB_pppw(Opcode,Arg1) {									\
    dbgen_printinst_macro(Opcode, (Integer)Arg1, 0);							\
    if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);				\
    write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
    write_byte(asrtBuff->Buff,asrtBuff->Loc,0); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);		\
    pad64bits(asrtBuff->Loc);										\
    write_word(asrtBuff->Buff,asrtBuff->Loc,Arg1);							\
}

#define dbgen_instB_ppp(Opcode) {								\
  dbgen_printinst_macro(Opcode,0,0);								\
  if (*asrtBuff->Loc >= asrtBuff->BLim) asrtBuff->Buff = buff_realloc(CTXT);			\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,Opcode); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
  write_byte(asrtBuff->Buff,asrtBuff->Loc,0); write_byte(asrtBuff->Buff,asrtBuff->Loc,0);	\
  pad64bits(asrtBuff->Loc);									\
}


/*======================================================================*/
/* db_cmpl(+Clause, +Buffer, +Index, -Size)                             */
/*      Clause is a fact or rule.                                       */
/*      Buffer is the buffer where the code is put.                     */
/*      Index is the argument to index on (0 if none).                  */
/*      Size is the size of the compiled code                           */
/* The predicate will generate code for the given clause in the Buffer. */
/* The first 8 bytes are reserved for general chain.  If index is       */
/* requested, the 2nd 8 bytes are used for the buckete chain. See Code  */
/* below.                                                               */
/*======================================================================*/


#ifndef MULTI_THREAD
static jmp_buf assertcmp_env;
#endif

struct flatten_elt {
	union {
		prolog_term term;
		Cell opcode;
	} v;
	int _reg;
};

#define FLATTEN_STACK_SIZE 512	

struct flatten_q {
  int flatten_stack_top;
  struct flatten_elt flatten_stack[FLATTEN_STACK_SIZE];
};


#define INST_QUEUE_SIZE	512 /* was 1024 */

struct instruction {
	Cell opcode;
	Cell arg1;
	Cell arg2;
};

struct instruction_q {
  int inst_queue_top;
  int inst_queue_bottom;
  int inst_queue_added;
  struct instruction inst_queue[INST_QUEUE_SIZE];
};

static void assertcmp_throw(CTXTdeclc int num)
{
    longjmp(assertcmp_env, num);
}


#define ERR_FUNCTOR	1
#define ERR_REGISTER	2

static int arity(CTXTdeclc prolog_term T0)
{
  if (isconstr(T0)) return p2c_arity(T0);
  else if (islist(T0)) return 2;
  else if (isstring(T0)) return 0;
  else assertcmp_throw(CTXTc ERR_FUNCTOR);
  return -1;
}

static void assertcmp_printerror(CTXTdeclc int num)
{
    switch (num) {
    case ERR_FUNCTOR:
	xsb_abort("[Assert] functor expected");
	break;
    case ERR_REGISTER:
	xsb_abort("[Assert] need too many registers");
	break;
    default: 
	xsb_abort("[Assert] error occured in assert_cmp");
    }
}

/* db_cmpl(Clause, Buff, Index, Size) */

static Integer p2c_float_as_int(prolog_term T0)
{
//  union float_conv {
//	float f;
//	Integer i;
//    } 
    
    FloatConv converter;
    converter.f = (float)ofloat_val(T0);
    return converter.i;
}

static int is_frozen_var(prolog_term T0)
{
    if (isconstr(T0) && strcmp(p2c_functor(T0), "$assertVAR")==0 &&
	p2c_arity(T0) == 1) {
	T0 = p2p_arg(T0, 1);
	return int_val(T0);
    } else return 0;
}

static void flatten_stack_init(struct flatten_q *flatten_stackq)
{
    flatten_stackq->flatten_stack_top = 0;
}

static int flatten_stack_size(struct flatten_q *flatten_stackq)
{
    return flatten_stackq->flatten_stack_top;
}

static void flatten_stack_push(struct flatten_q *flatten_stackq,
			       int argno, Cell term)
{
    flatten_stackq->flatten_stack[flatten_stackq->flatten_stack_top]._reg = argno;
    flatten_stackq->flatten_stack[flatten_stackq->flatten_stack_top].v.opcode = term;
    flatten_stackq->flatten_stack_top++;
    if (flatten_stackq->flatten_stack_top >= FLATTEN_STACK_SIZE)
      xsb_abort("flatten_stack overflow in assert");
}

static void flatten_stack_pop(struct flatten_q *flatten_stackq,
			      int *argnop, Cell *termp)
{
    flatten_stackq->flatten_stack_top--;
    *argnop = flatten_stackq->flatten_stack[flatten_stackq->flatten_stack_top]._reg;
    *termp = flatten_stackq->flatten_stack[flatten_stackq->flatten_stack_top].v.opcode;
}

static void inst_queue_init(struct instruction_q *inst_queue)
{
    inst_queue->inst_queue_top = inst_queue->inst_queue_bottom = 10;
}

static int inst_queue_empty(struct instruction_q *inst_queue)
{
    return (inst_queue->inst_queue_top == inst_queue->inst_queue_bottom);
}

static void inst_queue_push(struct instruction_q *inst_queue,
			    Cell opcode, Cell arg1, Cell arg2)
{
    inst_queue->inst_queue[inst_queue->inst_queue_top].opcode = opcode;
    inst_queue->inst_queue[inst_queue->inst_queue_top].arg1 = arg1;
    inst_queue->inst_queue[inst_queue->inst_queue_top].arg2 = arg2;
    inst_queue->inst_queue_top = (inst_queue->inst_queue_top+1) % INST_QUEUE_SIZE;
    if (inst_queue->inst_queue_top == inst_queue->inst_queue_bottom)
      xsb_abort("instruction queue overflow in assert");
}

static void inst_queue_pop(struct instruction_q *inst_queue,
			   Cell *opcodep, Cell *arg1p, Cell *arg2p)
{
    if (inst_queue->inst_queue_top == 0) inst_queue->inst_queue_top = INST_QUEUE_SIZE;
    inst_queue->inst_queue_top--;
    *opcodep = inst_queue->inst_queue[inst_queue->inst_queue_top].opcode;
    *arg1p = inst_queue->inst_queue[inst_queue->inst_queue_top].arg1;
    *arg2p = inst_queue->inst_queue[inst_queue->inst_queue_top].arg2;
}

static void inst_queue_rem(struct instruction_q *inst_queue,
			   Cell *opcodep, Cell *arg1p, Cell *arg2p)
{
    *opcodep = inst_queue->inst_queue[inst_queue->inst_queue_bottom].opcode;
    *arg1p = inst_queue->inst_queue[inst_queue->inst_queue_bottom].arg1;
    *arg2p = inst_queue->inst_queue[inst_queue->inst_queue_bottom].arg2;
    inst_queue->inst_queue_bottom = (inst_queue->inst_queue_bottom+1) % INST_QUEUE_SIZE;
}

static void inst_queue_add(struct instruction_q *inst_queue,
			   Cell opcodep, Cell arg1p, Cell arg2p)
{
    if (inst_queue->inst_queue_bottom == 0) inst_queue->inst_queue_bottom = INST_QUEUE_SIZE;
    inst_queue->inst_queue_bottom--;
    if (inst_queue->inst_queue_top == inst_queue->inst_queue_bottom)
      xsb_abort("instruction queue overflow in assert");
    inst_queue->inst_queue[inst_queue->inst_queue_bottom].opcode = opcodep;
    inst_queue->inst_queue[inst_queue->inst_queue_bottom].arg1 = arg1p;
    inst_queue->inst_queue[inst_queue->inst_queue_bottom].arg2 = arg2p;
    inst_queue->inst_queue_added++;
}

static void inst_queue_rotate(struct instruction_q *inst_queue) {
  prolog_term T0, T1;
  Cell Argno;
  while (inst_queue->inst_queue_added--) {
    inst_queue_rem(inst_queue,&Argno,&T0,&T1);
    inst_queue_push(inst_queue,Argno,T0,T1);
  }
}

/*typedef int *RegStat;*/
	/* 0 - all rest registers are free */
	/* >0 - next free register */
	/* -1 used for real var */
	/* -2 used for introduced var */

#define RVAR -1
#define TVAR -2

struct RegStat_t {
  int RegArray[MAX_REGS];
  int RegArrayInit[MAX_REGS];
  int FreeReg;
};

typedef struct RegStat_t *RegStat;

static void reg_init(RegStat Reg, int Size)
{
    int i;

    Reg->FreeReg = Size+1;
    for (i=0; i<Reg->FreeReg; i++) Reg->RegArray[i] = RVAR;
    Reg->RegArray[Reg->FreeReg] = 0;
}

/* Type: RVAR=-1 - used for real var; TVAR=-2 - used for introduced var */
static int reg_get(CTXTdeclc RegStat Reg, int Type)
{
    int new_reg;

    new_reg = Reg->FreeReg;
    if (Reg->RegArray[Reg->FreeReg]==0) {
	Reg->FreeReg++;
	if (Reg->FreeReg >= MAX_REGS) {
	  assertcmp_throw(CTXTc ERR_REGISTER);
	}
	Reg->RegArray[Reg->FreeReg] = 0;
    } else Reg->FreeReg = Reg->RegArray[Reg->FreeReg];
    Reg->RegArray[new_reg] = Type;
    Reg->RegArrayInit[new_reg] = 0;	/* register is not initialized */
    return new_reg;
}

static void reg_release(RegStat Reg, int R0)
{
    if (Reg->RegArray[R0]==TVAR) {
	Reg->RegArray[R0] = Reg->FreeReg;
	Reg->FreeReg = R0;
    }
}

#ifndef MULTI_THREAD
struct asrtBuff_t asrtBuffB = {NULL,512,NULL,0,0};
struct asrtBuff_t *asrtBuff = &asrtBuffB;
#endif

static char *buff_realloc(CTXTdecl)
{
  /*  xsb_dbgmsg((LOG_DEBUG,"Enter buff_realloc(%d) %X", asrtBuff->Buff_size,asrtBuff->Buff)); */
  asrtBuff->Buff_size = asrtBuff->Buff_size + asrtBuff->Buff_size;
  if (asrtBuff->Buff == NULL) asrtBuff->Buff = (char *)mem_alloc(asrtBuff->Buff_size,ASSERT_SPACE);
  else asrtBuff->Buff = (char *)mem_realloc(asrtBuff->Buff,(asrtBuff->Buff_size / 2),asrtBuff->Buff_size,ASSERT_SPACE);
  asrtBuff->BLim = asrtBuff->Buff_size-16;
  /*  xsb_dbgmsg((LOG_DEBUG,"Leave buff_realloc(%d) %X", asrtBuff->Buff_size,asrtBuff->Buff)); */
  return(asrtBuff->Buff);
}

/*----------------------------------------------------------------------*/
/*  Function prototypes.						*/
/*----------------------------------------------------------------------*/

static void db_genmvs(CTXTdeclc struct instruction_q *, RegStat);
static void db_putterm(CTXTdeclc int, prolog_term, RegStat, struct flatten_q *);
static void db_gentopinst(CTXTdeclc prolog_term, int, RegStat);
static void db_genterms(CTXTdeclc struct instruction_q *, RegStat);
static void db_geninst(CTXTdeclc prolog_term, RegStat, struct instruction_q *);
static void db_bldsubs(CTXTdeclc prolog_term, RegStat, struct flatten_q *);
static void db_genaput(CTXTdeclc prolog_term, int, struct instruction_q *, RegStat);

/*======================================================================*/
/*  The following code compiles a clause into a local buffer.  It	*/
/*  treats all rules as though they had a single literal on their	*/
/*  right-hand-side.  Thus it compiles a clause with more than one 	*/
/*  literal on the right-hand-side as a call to the predicate ,/2.	*/
/*======================================================================*/

int assert_code_to_buff_p(CTXTdeclc prolog_term);

int assert_code_to_buff( CTXTdecl /* Clause */)
{
  return assert_code_to_buff_p(CTXTc reg_term(CTXTc 1));
}

int assert_code_to_buff_p(CTXTdeclc prolog_term Clause)
{
  prolog_term Head, Body;
  int Location;
  int Loc_size;
  struct RegStat_t Reg_lc;
  RegStat Reg = &Reg_lc;
  int Arity;
  int has_body;
  int Argno;
  int v;
  Pair sym;
  struct instruction_q inst_queue_lc;
  struct instruction_q *inst_queue = &inst_queue_lc;

  /* set catcher */
  if ((Argno = setjmp(assertcmp_env))) {
    assertcmp_printerror(CTXTc Argno);
    return FALSE;
  }
  if (isconstr(Clause) && get_str_psc(Clause)==if_psc) { 
    Head = p2p_arg(Clause, 1);
    Body = p2p_arg(Clause, 2);
    has_body = 1;
    if (isstring(Body)) {
      if (string_val(Body) == true_string) has_body = 0; 
      else {
	sym = insert(string_val(Body),0,(Psc)flags[CURRENT_MODULE],&v);
	Body = makecs(hreg);
	new_heap_functor(hreg,sym->psc_ptr);
      }
    }
  } else {
    Head = Clause;
    Body = (prolog_term) NULL;
    has_body = 0;
  }
  Arity = arity(CTXTc Head);
  Location = 0;
  asrtBuff->Loc = &Location;
  dbgen_instB_ppvw(test_heap,Arity,0);  /* size will be backpatched */
  Loc_size = *asrtBuff->Loc - sizeof(Cell);
  if (has_body) reg_init(Reg,xsb_max(Arity,(int)get_arity(get_str_psc(Body))));
  else reg_init(Reg,Arity);
  inst_queue_init(inst_queue);
  for (Argno = 1; Argno <= Arity; Argno++) {
    db_gentopinst(CTXTc p2p_arg(Head,Argno),Argno,Reg);
  }
  if (has_body) {
    inst_queue_init(inst_queue);
    for (Argno=1; Argno<=arity(CTXTc Body); Argno++) {
      db_genaput(CTXTc p2p_arg(Body,Argno),Argno,inst_queue,Reg);
    }
    db_genmvs(CTXTc inst_queue,Reg);
    dbgen_instB_pppw(xsb_execute, get_str_psc(Body));
  } else dbgen_instB_ppp(proceed);
  asrtBuff->Size = *asrtBuff->Loc;
  write_word(asrtBuff->Buff,&Loc_size,(asrtBuff->Size/sizeof(Cell)));  /* backpatch max heap needed*/

  return TRUE;
}

static void db_gentopinst(CTXTdeclc prolog_term T0, int Argno, RegStat Reg)
{
  int Rt;
  struct instruction_q inst_queue_lc;
  struct instruction_q *inst_queue = &inst_queue_lc;
  
  if (isinteger(T0)) {
    dbgen_instB_ppvw(getnumcon, Argno, int_val(T0)); /* getnumcon */
  } else if (isstring(T0)) {
    if (strcmp(string_val(T0),"$assertAVAR"))
	dbgen_instB_ppvw(getcon, Argno, (Cell)string_val(T0));  /* getcon */
  } else if (isfloat(T0)) {
    dbgen_instB_ppvw(getfloat, Argno, T0); /* getfloat */
  } else if (isref(T0)) {
    c2p_functor(CTXTc "$assertVAR", 1, T0);
    T0 = p2p_arg(T0, 1);
    c2p_int(CTXTc Argno, T0);
    Reg->RegArrayInit[Argno] = 1;	/* Reg is initted */
  } else if (isnil(T0)) {
    dbgen_instB_ppv(getnil, Argno);	/* getnil */
  } else if ((Rt = is_frozen_var(T0))) {
    dbgen_instB_pvv(gettval, Rt, Argno);	/* gettval */
  } else {
    inst_queue_init(inst_queue);
    inst_queue_push(inst_queue, Argno, T0, 0);
    if (isattv(T0)) {
      T0 = p2p_arg(T0, 0);		/* the VAR part of the attv */
      c2p_functor(CTXTc "$assertVAR", 1, T0);
      T0 = p2p_arg(T0, 1);
      c2p_int(CTXTc Argno, T0);
      Reg->RegArrayInit[Argno] = 1;		/* Reg is initted */
    }      
    db_genterms(CTXTc inst_queue, Reg);
  }
}

static void db_genterms(CTXTdeclc struct instruction_q *inst_queue,
			RegStat Reg)
{
  prolog_term T0, T1, T2;
  Cell Argno;
  
  while (!inst_queue_empty(inst_queue)) {
    inst_queue_pop(inst_queue, &Argno, &T0, &T1);
    Reg->RegArrayInit[Argno] = 1;	/* Reg is initted */
    if (islist(T0)) {
      T1 = p2p_car(T0);
      T2 = p2p_cdr(T0);
      if (isref(T1) && isref(T2) && T1!=T2 /* not same var */) {
	int Rt1, Rt2;
	c2p_functor(CTXTc "$assertVAR", 1, T1);
	T1 = p2p_arg(T1, 1);
	Rt1 = reg_get(CTXTc Reg, RVAR);
	c2p_int(CTXTc Rt1, T1);
	c2p_functor(CTXTc "$assertVAR", 1, T2);
	T2 = p2p_arg(T2, 1);
	Rt2 = reg_get(CTXTc Reg, RVAR);
	c2p_int(CTXTc Rt2, T2);
	dbgen_instB3_tv(getlist_tvar_tvar, Argno, Rt1, Rt2);
	Reg->RegArrayInit[Rt1] = 1;	/* Reg is initted */
	Reg->RegArrayInit[Rt2] = 1;	/* Reg is initted */
	reg_release(Reg,Argno);
      } else {
	dbgen_instB_ppv(getlist, Argno);    /* getlist */
	reg_release(Reg,Argno);
	inst_queue->inst_queue_added = 0;
	db_geninst(CTXTc p2p_car(T0), Reg, inst_queue);
	db_geninst(CTXTc p2p_cdr(T0), Reg, inst_queue);
	inst_queue_rotate(inst_queue);
      }
    } else if (isconstr(T0)) {
      dbgen_instB_ppvw(getstr, Argno, get_str_psc(T0));   /* getstr */
      reg_release(Reg,Argno);
      inst_queue->inst_queue_added = 0;
      for (Argno=1; Argno <= (int)get_arity(get_str_psc(T0)); Argno++) {
	db_geninst(CTXTc p2p_arg(T0,Argno), Reg, inst_queue);
      }
      inst_queue_rotate(inst_queue);
    }
    else { /* is_attv(T0) */
      T1 = cell(clref_val(T0) + 1);	/* the ATTR part of the attv */
      XSB_Deref(T1);
      dbgen_instB_ppv(getattv, Argno);	/* getattv */
      /* The register for a new attv CANNOT be released ! */
      /* reg_release(Reg,Argno); */
      db_geninst(CTXTc T1, Reg, inst_queue);
    }
  }
}

static void db_geninst(CTXTdeclc prolog_term Sub, RegStat Reg,
		       struct instruction_q *inst_queue)
{
  int Rt;
  
  if (isinteger(Sub)) {
    dbgen_instB_pppw(uninumcon, int_val(Sub));
  } else if (isstring(Sub)) {
    if (!strcmp(string_val(Sub),"$assertAVAR")) {
      dbgen_instB_ppp(uniavar);
    } else dbgen_instB_pppw(unicon, (Cell)p2c_string(Sub));
  } else if (isnil(Sub)) {
    dbgen_instB_ppp(uninil);
  } else if (isfloat(Sub)) {
    dbgen_instB_pppw(unifloat, Sub);
  } else if (isref(Sub)) {
    c2p_functor(CTXTc "$assertVAR", 1, Sub);
    Sub = p2p_arg(Sub, 1);
    Rt = reg_get(CTXTc Reg, RVAR);
    c2p_int(CTXTc Rt, Sub);
    dbgen_instB_ppv(unitvar, Rt);
    Reg->RegArrayInit[Rt] = 1;  /* reg is inited */
  } else if ((Rt = is_frozen_var(Sub))) {
    dbgen_instB_ppv(unitval, Rt);
  } else if (isattv(Sub)) {
    /*
     * An ATTV is treated as a real variable, so that the register will
     * never be released.
     */
    Rt = reg_get(CTXTc Reg, RVAR);
    dbgen_instB_ppv(unitvar, Rt);
    Reg->RegArrayInit[Rt] = 1;  /* reg is inited */
    inst_queue_add(inst_queue, Rt, Sub, 0);

    Sub = p2p_arg(Sub, 0);		/* the VAR part of the attv */
    c2p_functor(CTXTc "$assertVAR", 1, Sub);
    Sub = p2p_arg(Sub, 1);
    c2p_int(CTXTc Rt, Sub);
  } else {
    Rt = reg_get(CTXTc Reg, TVAR);
    dbgen_instB_ppv(unitvar, Rt);
    Reg->RegArrayInit[Rt] = 1;  /* reg is inited */
    inst_queue_add(inst_queue, Rt, Sub, 0);
  }
}

static void db_genaput(CTXTdeclc prolog_term T0, int Argno,
		       struct instruction_q *inst_queue,
		       RegStat Reg)
{
  int Rt;
  struct flatten_q flatten_stack_lc;
  struct flatten_q *flatten_stackq = &flatten_stack_lc;

  if (isref(T0)) {
    c2p_functor(CTXTc "$assertVAR", 1, T0);
    T0 = p2p_arg(T0, 1);
    Rt = reg_get(CTXTc Reg, RVAR);
    c2p_int(CTXTc Rt, T0);  /* used to be TempVar???? */
    dbgen_instB_pvv(puttvar, Rt, Rt);
    Reg->RegArrayInit[Rt] = 1;  /* reg is inited */
    inst_queue_push(inst_queue, movreg, Rt, Argno);
  } else if ((Rt = is_frozen_var(T0))) {
    inst_queue_push(inst_queue, movreg, Rt, Argno);
  } else if (isinteger(T0)) {
    inst_queue_push(inst_queue, putnumcon, int_val(T0), Argno);
  } else if (isfloat(T0)) {
    inst_queue_push(inst_queue, putnumcon, p2c_float_as_int(T0), 
		    Argno);
  } else if (isnil(T0)) {
    inst_queue_push(inst_queue, putnil, 0, Argno);
  } else if (isstring(T0)) {
    if (!strcmp(string_val(T0),"$assertAVAR")) {
      Rt = reg_get(CTXTc Reg, RVAR);
      dbgen_instB_pvv(puttvar, Rt, Rt);
      Reg->RegArrayInit[Rt] = 1;  /* reg is inited */
      inst_queue_push(inst_queue, movreg, Rt, Argno);
    } else inst_queue_push(inst_queue, putcon, (Cell)p2c_string(T0), Argno);
  } else if (isattv(T0)) {
    prolog_term T1;
    
    Rt = reg_get(CTXTc Reg, RVAR);
    inst_queue_push(inst_queue, movreg, Rt, Argno);
    flatten_stack_init(flatten_stackq);

    T1 = p2p_arg(T0, 0);		/* the VAR part of the attv */
    c2p_functor(CTXTc "$assertVAR", 1, T1);
    T1 = p2p_arg(T1, 1);
    c2p_int(CTXTc Rt, T1);
    Reg->RegArrayInit[Rt] = 1;		/* Reg is initted */

    db_putterm(CTXTc Rt,T0,Reg,flatten_stackq);    
  } else {  /* structure */
    Rt = reg_get(CTXTc Reg, TVAR);
    inst_queue_push(inst_queue, movreg, Rt, Argno);
    flatten_stack_init(flatten_stackq);
    db_putterm(CTXTc Rt,T0,Reg,flatten_stackq);
  }
}

static void db_putterm(CTXTdeclc int Rt, prolog_term T0,
		       RegStat Reg, struct flatten_q *flatten_stackq)
{
  int Argno;
  int BldOpcode;
  Cell Arg1;
  int stack_size;
  
  stack_size = flatten_stack_size(flatten_stackq);
  if (islist(T0)) {		/* is_list */
    db_bldsubs(CTXTc p2p_cdr(T0),Reg,flatten_stackq);
    db_bldsubs(CTXTc p2p_car(T0),Reg,flatten_stackq);
    dbgen_instB_ppv(putlist, Rt);			/* putlist */
  } else if (isconstr(T0)) {	/* is_functor */
    for (Argno=get_arity(get_str_psc(T0)); Argno>=1; Argno--)
      db_bldsubs(CTXTc p2p_arg(T0,Argno),Reg,flatten_stackq);
    dbgen_instB_ppvw(putstr, Rt, get_str_psc(T0));	/* putstr */
  } else {			/* is attv */
    db_bldsubs(CTXTc cell(clref_val(T0)+1), Reg, flatten_stackq);
    dbgen_instB_ppv(putattv, Rt);
  }
  Reg->RegArrayInit[Rt] = 1;	/* in any case, reg is inited */
  while (flatten_stack_size(flatten_stackq)>stack_size) {
    flatten_stack_pop(flatten_stackq, &BldOpcode, &Arg1);	
    /* be careful about order!!*/
    switch (BldOpcode) {
    case bldpvar:
      if (Reg->RegArrayInit[Arg1]) {
	dbgen_instB_ppv(bldpval, Arg1); break;
      } else {
	Reg->RegArrayInit[Arg1] = 1;
	dbgen_instB_ppv(bldpvar, Arg1); break;
      }
    case bldtvar:
      if (Reg->RegArrayInit[Arg1]) {
	dbgen_instB_ppv(bldtval, Arg1);
      } else {
	Reg->RegArrayInit[Arg1] = 1;
	dbgen_instB_ppv(bldtvar, Arg1);
      }
      break;
    case bldavar:
      dbgen_instB_ppp(bldavar); break;
    case bldcon:
      dbgen_instB_pppw(bldcon, Arg1); break;
    case bldnumcon:
      dbgen_instB_pppw(bldnumcon, Arg1); break;
    case bldfloat:
      dbgen_instB_pppw(bldfloat, Arg1); break;
    case bldnil:
      dbgen_instB_ppp(bldnil); break;
    default: 
      xsb_dbgmsg((LOG_DEBUG,"Incorrect bld instruction in assert %d", 
		  BldOpcode));
    }
  }
}

static void db_bldsubs(CTXTdeclc prolog_term Sub, RegStat Reg,
		       struct flatten_q *flatten_stackq)
{
  int Rt;
  
  if (isstring(Sub)) {
    if (!strcmp(string_val(Sub),"$assertAVAR"))
      flatten_stack_push(flatten_stackq, bldavar, 0);
    else flatten_stack_push(flatten_stackq,bldcon,(Cell)string_val(Sub)); /* bldcon */
  } else if (isinteger(Sub)) {               /* bldnumcon(Sub) */
    flatten_stack_push(flatten_stackq, bldnumcon, int_val(Sub));
  } else if (isfloat(Sub)) {             /* bldfloat(Sub) */
    flatten_stack_push(flatten_stackq, bldfloat, Sub);
  } else if (isref(Sub)) {
    c2p_functor(CTXTc "$assertVAR", 1, Sub);
    Sub = p2p_arg(Sub, 1);
    Rt = reg_get(CTXTc Reg, RVAR);
    c2p_int(CTXTc Rt, Sub);
    flatten_stack_push(flatten_stackq, bldtvar, Rt);    /* bldtvar(Ri) */
  } else if (isnil(Sub)) {
    flatten_stack_push(flatten_stackq, bldnil, 0);      /* bldnil */
  } else if ((Rt = is_frozen_var(Sub))) {
    flatten_stack_push(flatten_stackq, bldtvar, Rt);
  } else if (isattv(Sub)) {
    prolog_term T1;

    Rt = reg_get(CTXTc Reg, RVAR);
    flatten_stack_push(flatten_stackq, bldtvar, Rt);

    T1 = p2p_arg(Sub, 0);	/* the VAR part of the attv */
    c2p_functor(CTXTc "$assertVAR", 1, T1);
    T1 = p2p_arg(T1, 1);
    c2p_int(CTXTc Rt, T1);

    /* Reg->RegArrayInit[Rt] will be set to 1 in db_putterm() */

    db_putterm(CTXTc Rt, Sub, Reg, flatten_stackq);
  } else {
    Rt = reg_get(CTXTc Reg, TVAR);
    flatten_stack_push(flatten_stackq, bldtvar, Rt);
    db_putterm(CTXTc Rt,Sub,Reg,flatten_stackq);
  }
}

static xsbBool target_is_not_source(struct instruction_q *inst_queue, int Reg)
{
  int i;
  
  for (i=inst_queue->inst_queue_bottom; i<inst_queue->inst_queue_top; i++) {
    if (inst_queue->inst_queue[i].opcode==movreg && (int)inst_queue->inst_queue[i].arg1 == Reg)
      return FALSE;
  }
  return TRUE;
}

static xsbBool source_is_not_target(struct instruction_q *inst_queue, int Reg)
{
  int i;
  
  for (i=inst_queue->inst_queue_bottom; i<inst_queue->inst_queue_top; i++) {
    if ((int)inst_queue->inst_queue[i].arg2 == Reg) return FALSE;
  }
  return TRUE;
}

/* this is a simple routine to generate a series of instructions to
   load a series of registers with constants or from other registers.
   It is given a list of Source,Target pairs.  Target is always a
   register  number.  Source may be a putcon(con), putnumcon(num),
   puttvar(reg), puttvar(Var), or movreg(reg).  The registers  can
   overlap in any way.  db_genmvs tries to generate a reasonably efficient
   series of instructions to load the indicated registers with the
   indicated values.  */ 

static void db_genmvs(CTXTdeclc struct instruction_q *inst_queue, RegStat Reg)
{
  Cell Opcode, Arg, T0, R0;
  
  /* pay attention to the ordering, must be a QUEUE !!!!! */
  while (!inst_queue_empty(inst_queue)) {
    inst_queue_rem(inst_queue, &Opcode, &Arg, &T0);	/* T0: target reg */
    switch (Opcode) {
    case puttvar:  
      dbgen_instB_pvv(Opcode, Arg, T0);
      break;
    case putnil:
      if (target_is_not_source(inst_queue,T0))
	{dbgen_instB_ppv(Opcode, T0);}
      else inst_queue_push(inst_queue, Opcode, Arg, T0);
      break;
    case putcon:
    case putnumcon:
      if (target_is_not_source(inst_queue,T0))
	{dbgen_instB_ppvw(Opcode, T0, Arg);}
      else inst_queue_push(inst_queue, Opcode, Arg, T0);
      break;
    case movreg:
      if (Arg==T0) break;
      else if (target_is_not_source(inst_queue,T0)) {
	dbgen_instB_pvv(movreg, Arg, T0); /* movreg */
	reg_release(Reg,Arg);
      } else if (source_is_not_target(inst_queue,Arg)) /* assume target is source */
	inst_queue_push(inst_queue, movreg, Arg, T0);
      /* delay the instruction at the end */
      /* else if (Arg>T0) dbgen_instB_pvv(movreg,Arg,T0); movreg */
      else {
	R0 = reg_get(CTXTc Reg, TVAR);
	dbgen_instB_pvv(movreg, Arg, R0); /* movreg */
	reg_release(Reg,Arg);
	inst_queue_push(inst_queue, movreg, R0, T0);
	/* dbgen_instB_pvv(movreg, R0, T0); */ /* movreg */
      }
      break;
    }
  }
}

/*======================================================================*/
/*	The following byte offsets are valid for 32 bit architectures	*/
/*	For 64 bit architecture multiply everything by 2		*/
/*======================================================================*/

/*======================================================================*/
/* assert_buff_to_clref(+Term +Arg,+Arity,+Prref,+AZ,+Index,+HashTabSize)*/
/*	allocates a Clref, copies the byte-code for the clause from	*/
/*	an internal buffer into it, and adds to to the chains.		*/
/*	The arguments are:						*/
/*	Term:  The term being asserted.					*/
/*	Arg:   The argument value of the indexed arg (ignored if no ind)*/
/*	Arity: the number of registers to save in a choice point.	*/
/*		Note the Arity is one more than the original arity, to  */
/*		hold the cut address.					*/
/*	Prref: predicate reference to which to add the asserted fact	*/
/*	AZ:   0 - inserted as the first clause; 1 - as the last clause	*/
/*	Index:  0 if no index is to be built, or n if an index		*/
/*		on the nth argument of the fact is to be used		*/
/*	HashTabSize:  The size of the hash table to create if one must	*/
/*		be created for this clause (the SOB record)		*/
/*======================================================================*/

/*======================================================================*/
/* Formats for dynamic code:						*/
/* PSC rec point to:							*/
/*	PrRef:								*/
/*		0: BC instruction: fail (if empty),			*/
/*			jump and save breg (if nonempty)		*/
/*		4: Addr of first Clref on ALL chain			*/
/*		8: Addr of last Clref on ALL chain			*/
/*									*/
/* PrRef's point to chain of clRef's (one of 2 types):			*/
/* (the -8 location stores length of buff + flag indicating ClRef type	*/
/*                                                                      */
/* Whoever set this up arranged for the pointer to point AFTER the      */
/* Clref structure.  So if you want to acess it as a structure you need */
/* to decrement it (see macros below)                                   */
/*                                                                      */
/*	ClRef0 (for unindexed asserted code):				*/
/*		-8: length of buffer (+0)				*/
/*		-4: Addr of previous ClRef (or PrRef)			*/
/*		0: Trymeelse-type instruction, for chain		*/
/*		4: (cont) Addr of next ClRef on chain			*/
/*		8+: BC for asserted clause				*/
/*	ClRef1 (for group of indexed clauses, aka SOB record):		*/
/*		-8: length of buffer (+1)				*/
/*		-4: Addr of previous ClRef (or PrRef)			*/
/*		0: Try-type instruction, for chain			*/
/*		4: (cont) Addr of next ClRef on chain,			*/
/*			if trust-type then ptr to prref, if first-level	*/
/*			SOB, or ptr to previous enclosing SOB+20  	*/
/*		8: BC switch-on-bound instruction (drop thru if var)	*/
/*		11: (cont) arg(s) to index on				*/
/*		12: (cont) address of Hash Table			*/
/*		16: (cont) size of Hash Table				*/
/*		20: BC jump to...	(or fail if empty)		*/
/*		24: (cont) Addr of first ClRefI on all subchain		*/
/*		    or to ClRef1 for next index				*/
/*		28: Addr of last ClRefI on all subchain			*/
/*              32: Number of clauses accessible thru this hash table   */
/*		36+: Hash Table						*/
/*									*/
/* ClRef1's point to indexed clauses, each represented by a ClRefI:	*/
/*	ClRefI (for an indexed clause):					*/
/*		-8: length of buffer (+3)				*/
/*		-4: Addr of previous ClRefI on all chain		*/
/*		0: Try-type instruction, for all subchain		*/
/*		4: (cont) Addr of next ClRefI on all subchain		*/
/*            For each index we have the following four fields:         */
/*		8: BC noop(14) to skip next NI*8-2 bytes		*/
/*		12: Addr of previous ClRefI on bucket chain		*/
/*		16: Try-type instruction, for hash bucket subchain	*/
/*		20: (cont) Addr of next ClRefI in bucket,		*/
/*		    or back to SOB rec if last				*/
/*		24: BC noop(6) to skip next (NI-1)*8-2 bytes		*/
/*		28: Addr of previous ClRefI on bucket chain		*/
/*		32: Try-type instruction, for hash bucket subchain	*/
/*		36: (cont) Addr of next ClRefI in bucket		*/
/*	   NI*16+8: BC for asserted code				*/
/*									*/
/*======================================================================*/

/* Predicate References defined in macro_xsb.h / clause reference in context.h  */

typedef struct ClRefHdrI *ClRefI;
typedef struct  {
  unsigned long buflen ;
  struct ClRefI *prev ;
  CPtr Instr ;
  struct ClRefI *next ;
}	ClRefHdrI;


#ifdef BITS64
#define HIGHBIT 0x8000000000000000
#else
#define HIGHBIT 0x80000000
#endif

#define PredOpCode(P)		(cell_opcode(&(P)->Instr))

typedef ClRef SOBRef ;

#define ClRefAddr(Cl)		((CPtr)((ClRef)(Cl)-1))
#define ClRefSize(Cl)		(((ClRef)(Cl))[-1].buflen & ~0x3 & ~HIGHBIT)
#define ClRefType(Cl)		(((ClRef)(Cl))[-1].buflen & 0x3)
#define SetClRefSize(Cl,len)	(((ClRef)(Cl))[-1].buflen |= \
		(((ClRef)(Cl))[-1].buflen & 0x3) | ((len) & ~0x3))
#define SetClRefType(Cl,type)	(((ClRef)(Cl))[-1].buflen = \
		(((ClRef)(Cl))[-1].buflen & ~0x3) | ((type) & 0x3))
#define ClRefPrev(Cl)		(((ClRef)(Cl))[-1].prev)
#define ClRefWord(Cl,pos)	(((CPtr)(Cl))[(pos)])

#define SetClRefPrev(Cl,Prv)	(((ClRef)(Cl))[-1].prev = (ClRef)(Prv))

/* Clause types */

#define UNINDEXED_CL	0
#define SOB_RECORD	1
#define TRIE_CL		2
#define INDEXED_CL	3

#define MakeClRef(ptr,Type,NCells)\
{	long sz = (((NCells)*sizeof(Cell)+sizeof(ClRefHdr) + 7) & ~0x7);	\
	(ptr) = (ClRef)mem_calloc(sz,1,ASSERT_SPACE);\
	(ptr)->buflen = ((Type)&3)+sz;\
	(ptr)++;\
}

/* Clause common fields */

#define ClRefTryInstr(Cl)	(ClRefWord((Cl),0))
#define ClRefTryOpCode(Cl)	(cell_opcode(&ClRefTryInstr(Cl)))
#define ClRefNext(Cl)		((ClRef)ClRefWord((Cl),1))


#define SetClRefNext(Cl,Nxt)	(ClRefWord((Cl),1)=(Cell)(Nxt))

/* First byte code in clause at word 2  - Jump/SOB/etc */
#define ClRefEntryPoint(Cl)	(&ClRefWord((Cl),2))

/* For compiled clause */
#define ClRefCompiledCode(Cl)	(ClRefWord((Cl),3))

/* For indexed clause group (SOBblock) */

#define ClRefSOBInstr(Cl)	(ClRefWord((Cl),2))
#define ClRefHashSize(Cl)	(ClRefWord((Cl),4))
#define ClRefJumpInstr(Cl)	(ClRefWord((Cl),5))
#define ClRefFirstIndex(Cl)	(ClRefWord((Cl),6))
#define ClRefLastIndex(Cl)	(ClRefWord((Cl),7))
#define ClRefNumNonemptyBuckets(Cl)	(ClRefWord((Cl),8))
#define ClRefHashTable(Cl)	(&ClRefWord((Cl),9))
#define ClRefHashBucket(Cl,b)	((CPtr)(ClRefHashTable(Cl)[(b)]))

#define ClRefSOBArg(Cl,n)	(cell_operandn(&ClRefWord((Cl),2),(n)))

/* Get the PrRef field of a SOB */
#define ClRefPrRef(Cl)		((PrRef)&ClRefWord((Cl),5))

/* Get the ClRef containing the PrRef */
#define PrRefClRef(Pr)		((ClRef)((CPtr)(Pr)-5))

#define ClRefUpSOB(Cl)		(PrRefClRef(ClRefNext(Cl)))

/* For Indexed clause index table */

#define ClRefNumInds(Cl)\
	 ( (cell_operand3(&ClRefWord((Cl),2))/(sizeof(Cell)/2) + 1)/4 )
#define ClRefIndPtr(Cl,Ind)	(&ClRefWord((Cl),(Ind)*4))

#define IndPtrClRef(IP,Ind)	((ClRef)((CPtr)(IP)-(Ind)*4))
#define IndRefNoop(IndPtr)	((IndPtr)[-2])
#define IndRefPrev(IndPtr)	(((CPtr *)(IndPtr))[-1])
#define IndRefTryInstr(IndPtr)	((IndPtr)[0])
#define IndRefNext(IndPtr)	(((CPtr *)(IndPtr))[1])

#define IC_CELLS(NI)		(4*(NI)+2)

#define ClRefIEntryPoint(Cl,NI)	(&ClRefWord((Cl),IC_CELLS(NI)))

/* First word of code in an (un)indexed clause */
#define ClRefEntryAny(Cl) 						\
	((CPtr)								\
		((ClRefType(Cl)&1) == UNINDEXED_CL ? ClRefEntryPoint(Cl) :\
				ClRefIEntryPoint((Cl),ClRefNumInds(Cl))	\
	))

#define ClRefNotRetracted(Cl) (cell_opcode(ClRefEntryAny(Cl))!=fail || \
                               cell_operand1(ClRefEntryAny(Cl))!=MARKED_FOR_DELETION)

static void db_addbuff(byte, ClRef, PrRef, int, int, int); 
static void db_addbuff_i(byte, ClRef, PrRef, int, int *, int, prolog_term, int);

/************************************************************/
/* debugging code to dump asserted code index structure     */
/* (works only for 32-bit machines			    */
/************************************************************/
/********* COMMENTED OUT UNTIL NEEDED ***
void asrt_tab(FILE *fd, int ind) {
  int i;
  for (i=0;i<ind;i++) fprintf(fd," ");
}

void dump_assert_index_block(FILE *fd, ClRef clrefptr, ClRef lastclrefptr, int indent) {
  int htsize, i, j, numindexes;

  do {
    if (ClRefType(clrefptr) == UNINDEXED_CL) {
      fprintf(fd,"UI %p: Len: %lu, Prev: %p, Try: %lx, Else: %p\n",
	      clrefptr, ClRefSize(clrefptr), ClRefPrev(clrefptr), ClRefTryInstr(clrefptr), 
	      ClRefNext(clrefptr));
    } else if (ClRefType(clrefptr) == SOB_RECORD) {
      asrt_tab(fd,indent);
      fprintf(fd,"SB %p: Len: %lu, Prev: %p, Try: %lx, Else: %p\n",
	      clrefptr, ClRefSize(clrefptr), ClRefPrev(clrefptr), ClRefTryInstr(clrefptr), 
	      ClRefNext(clrefptr));
      asrt_tab(fd,indent+12);
      fprintf(fd,"SOB: %lx, HT: %lx, HTs: %lu, BR: %lx, Else: %lx, Last: %lx, Num: %ld\n",
	      ClRefSOBInstr(clrefptr), ClRefWord(clrefptr,3), ClRefHashSize(clrefptr), 
	      ClRefJumpInstr(clrefptr), ClRefFirstIndex(clrefptr),
	      ClRefLastIndex(clrefptr), ClRefNumNonemptyBuckets(clrefptr));
      htsize = ClRefHashSize(clrefptr);
      for (i=0; i<htsize; i++) {
	if (ClRefHashBucket(clrefptr,i) != &dynfail_inst) {
	  asrt_tab(fd,indent+12);
	  fprintf(fd,"HT %p: %p\n",&ClRefWord(clrefptr,i+9),ClRefHashBucket(clrefptr,i));
	}
      }
      fprintf(fd,"\n");
      dump_assert_index_block(fd,(ClRef)ClRefFirstIndex(clrefptr),
			      (ClRef)ClRefLastIndex(clrefptr),indent+2);
    } else if (ClRefType(clrefptr) == INDEXED_CL) {
      fprintf(fd,"IC %p: Len: %ld, Prev: %p, Try: %lx, Else: %p\n",
	      clrefptr, ClRefSize(clrefptr), ClRefPrev(clrefptr), 
	      ClRefTryInstr(clrefptr), IndRefNext(clrefptr));
      numindexes = ClRefNumInds(clrefptr);
      for (j=0; j<numindexes; j++) {
	fprintf(fd,"   %p: BR: %lx, Prev: %lx, Try: %lx, Nxt: %lx\n",
		&ClRefWord(clrefptr,4*j+2)+2,
		ClRefWord(clrefptr,4*j+2),ClRefWord(clrefptr,4*j+3),
		ClRefWord(clrefptr,4*j+4),ClRefWord(clrefptr,4*j+5));
      }
      fprintf(fd,"\n");
    } else xsb_abort("bad format");
    if (clrefptr == lastclrefptr) return;
    clrefptr = ClRefNext(clrefptr);
  }
  while (1);
}

void dump_asserted_pred(PrRef prref, char *dumpfilename) {
  FILE *fd;

  fd = fopen(dumpfilename,"w");

  fprintf(fd,"PR %p: BR: %lx, Fst: %lx, Lst: %lx\n\n",
	  prref, *((long unsigned int *)prref), 
	  *((long unsigned int *)prref+1), *((long unsigned int *)prref+2));

  dump_assert_index_block(fd,*((ClRef *)prref+1),*((ClRef *)prref+2),0);
  fclose(fd);
}
**** COMMENTED OUT UNTIL NEEDED **********/
/***************************************************************/
/* end of debugging code to dump asserted code index structure */
/***************************************************************/

/* Used by assert & retract to get through the SOBs */

static void get_indexes( prolog_term prolog_ind, int *Index, int *NI )
{
  Index[0] = 0;
  if (isinteger(prolog_ind)) {
    Index[1] = int_val(prolog_ind);
    if (Index[1] == 0) *NI = 0; else *NI = 1;
  } else {
    for (*NI = 0; !isnil(prolog_ind); prolog_ind = p2p_cdr(prolog_ind)) {
      (*NI)++;
      Index[*NI] = int_val(p2p_car(prolog_ind));
    }
  }
}

/* Add the global buffer, which must have been filled, into the index
    for the Prref */

xsbBool assert_buff_to_clref_p(CTXTdeclc prolog_term,byte,PrRef,int,
			       prolog_term,int,ClRef *);

xsbBool assert_buff_to_clref(CTXTdecl /*Head,Arity,Prref,AZ,Indexes,HashTabSize,Clref*/)
{
  ClRef Clref;
  assert_buff_to_clref_p(CTXTc reg_term(CTXTc 1),
			 (byte)ptoc_int(CTXTc 2),
			 (PrRef)ptoc_int(CTXTc 3),
			 ptoc_int(CTXTc 4),
			 reg_term(CTXTc 5),
			 ptoc_int(CTXTc 6),
			 &Clref);
  /* ctop_int(7, (Integer Clref)); */
  return TRUE;
}

xsbBool assert_buff_to_clref_p(CTXTdeclc prolog_term Head,
			       byte Arity,
			       PrRef Pred,
			       int AZ,
			       prolog_term Indexes,
			       int HashTabSize,
			       ClRef *Clref)
{
  ClRef Clause;
  int Location, *Loc, Inum;
  int Index[20], NI;

  xsb_dbgmsg((LOG_ASSERT,"Now add clref to chain:"));

  get_indexes( Indexes, Index, &NI ) ;

  MakeClRef( Clause,
	     (NI>0) ? INDEXED_CL : UNINDEXED_CL,
	     //	     IC_CELLS(NI) + ((asrtBuff->Size+0xf)&~0x7)/sizeof(Cell) ) ;
	     IC_CELLS(NI) + ((asrtBuff->Size+0x7)&~0x7)/sizeof(Cell) ) ;

  if (xsb_profiling_enabled)
    add_prog_seg(get_str_psc(Head),(byte *)Clause,ClRefSize(Clause));

  //  printf("asserting clause for: %s/%d at %x\n",
  // get_name(get_str_psc(Head)),get_arity(get_str_psc(Head)),Clause);

  Location = 0; Loc = &Location;
  dbgen_inst_ppv(dynnoop,sizeof(Cell)/2,Clause,Loc);    /* will become dyntry */
  write_word(Clause,Loc,0);
  for (Inum = NI; Inum > 0; Inum--) {
    /* put template code for chaining buffers from hash tables  */
    dbgen_inst_ppv(noop,(4*Inum-1)*sizeof(Cell)/2,Clause,Loc);  /* noop(6) */
    write_word(Clause,Loc,0);
    dbgen_inst_ppv(dynnoop,sizeof(Cell)/2,Clause,Loc);             /* noop(2) */
    write_word(Clause,Loc,0);
  }

/* asrtBuff->Buff is a global variable used to communicate from assert_code_to_buff
   to assert_buff_to_clref through PROLOG calls */

  memmove(((pb)Clause)+Location,asrtBuff->Buff,asrtBuff->Size); /* fill in clause with code from Buff */
  /* ctop_int(7, (Integer)Clause);  DO NOT RETURN ANYTHING */
  /* *Clref = Clause; */
  
  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );

  if (NI <= 0) db_addbuff(Arity,Clause,Pred,AZ,FALSE,1);
  else db_addbuff_i(Arity,Clause,Pred,AZ,Index,NI,Head,HashTabSize);

  SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );

  return TRUE;
}

/* add NewClause to beginning of try-retry chain beginning with FirstClause */
static void prefix_to_chain(int ifSOB, byte Arity, ClRef FirstClause, ClRef NewClause)
{
  int Loc = 0;
  dbgen_inst_ppvw(ifSOB?trymeelse:dyntrymeelse,Arity,FirstClause,NewClause,&Loc);

  Loc = 0;
  if (ClRefTryOpCode(FirstClause) == dynnoop || ClRefTryOpCode(FirstClause) == noop)
  {  dbgen_inst_ppvw(dyntrustmeelsefail,Arity,ClRefNext(FirstClause),
		     FirstClause,&Loc); }
  else if (ClRefTryOpCode(FirstClause) == dyntrymeelse ||
	   ClRefTryOpCode(FirstClause) == trymeelse)
  {  dbgen_inst_ppvw(dynretrymeelse,Arity,ClRefNext(FirstClause),
		     FirstClause,&Loc);}
  else xsb_dbgmsg((LOG_DEBUG,"***Error 1 in assert: 0x%x",
		  ClRefTryOpCode(FirstClause)));

  ClRefPrev(NewClause)   = ClRefPrev(FirstClause);
  ClRefPrev(FirstClause) = NewClause;

}

/* add NewClause after LastClause on try-retry chain */
static void append_to_chain(byte Arity, ClRef LastClause, ClRef NewClause)
{
  int Loc = 0;
  dbgen_inst_ppvw(dyntrustmeelsefail,Arity,ClRefNext(LastClause),
		  NewClause,&Loc);
  SetClRefPrev(NewClause, LastClause);

  Loc = 0;
  if (ClRefTryOpCode(LastClause) == dynnoop)
  {  dbgen_inst_ppvw_safe(dyntrymeelse,Arity,NewClause,
		     LastClause,&Loc);  }
  else if (ClRefTryOpCode(LastClause) == noop)
  {  dbgen_inst_ppvw_safe(trymeelse,Arity,NewClause,
		     LastClause,&Loc);  }
  else if (ClRefTryOpCode(LastClause) == dyntrustmeelsefail)
  {  dbgen_inst_ppvw_safe(dynretrymeelse,Arity,NewClause,
		     LastClause,&Loc);  }
  else xsb_dbgmsg((LOG_DEBUG,"***Error 2 in assert: 0x%x",
		  ClRefTryOpCode(LastClause)));

}

/* add Clause to end of Pred */
static void db_addbuff(byte Arity, ClRef Clause, PrRef Pred, int AZ, int ifSOB, int Inum) 
{
  int Loc; 
  ClRef LastClause ;
  
  if (PredOpCode(Pred) == fail) {
    Loc = 0;
    dbgen_inst_ppv(ifSOB?noop:dynnoop,sizeof(Cell)/2,Clause,&Loc);
    SetClRefNext(Clause, Pred) ;
    Loc = 0;
    if (Inum > 1) {dbgen_inst_pppw(jump,Clause,Pred,&Loc);}
    else dbgen_inst_ppvw(jumptbreg,Arity,Clause,Pred,&Loc);
    Pred->LastClRef = Clause ;
    SetClRefPrev(Clause, Pred) ;
  } else if ( PredOpCode(Pred) == jumptbreg || PredOpCode(Pred) == jump ) {
    if (AZ == 0) {
      prefix_to_chain(ifSOB, Arity, Pred->FirstClRef, Clause);
      Pred->FirstClRef = Clause ;
    } else {
      LastClause = Pred->LastClRef ;
      append_to_chain(Arity,LastClause,Clause);
      Pred->LastClRef = Clause ;
    }
  } else xsb_dbgmsg((LOG_DEBUG,"***Error 3 in assert"));
}

#define NUMHASHSIZES 16
/* some primes for hash table sizes */
static int hashsizes_table[NUMHASHSIZES] = {17,503,5003,49999,200003,400009,700001,1000003,
        1000033,1000037,1000039,1000081,1000099,1000117,1000121,1000133}; 

static int hash_resize( PrRef Pred, SOBRef SOBrec, unsigned int OldTabSize )
{
   unsigned int ThisTabSize ;
   int i;

/* xsb_dbgmsg(LOG_DEBUG,"SOB - %p, with %d cls",
	      SOBrec, ClRefNumNonemptyBuckets(SOBrec) ) ; */
   /* Compute number of clauses */
   if( PredOpCode(Pred) != fail && ClRefType(SOBrec) == SOB_RECORD ) {
     ThisTabSize = ClRefHashSize(SOBrec) ;
     if (ClRefNumNonemptyBuckets(SOBrec) > (ThisTabSize/4)*3) {
       if (ThisTabSize >= (unsigned int) hashsizes_table[NUMHASHSIZES-1]) {
	 ThisTabSize = ThisTabSize+2;
       } else {
	 for (i=0; i<NUMHASHSIZES; i++) 
	   if ((unsigned int) hashsizes_table[i] > ThisTabSize) break; 
	 ThisTabSize = hashsizes_table[i];
       }
       /*printf("Resizing HT to %d\n",ThisTabSize);*/
     }
     return xsb_max(ThisTabSize, OldTabSize) ;
   }
   else return OldTabSize ;
}

static int hash_val(int Ind, prolog_term Head, int TabSize )
/* return -1 if cannot hash to this Ind (var) */
{
  int Hashval = 0 ;
  int i, j ;
  prolog_term Arg ;

  if (Ind <= 0xff) {  /* handle usual case specially */
    Arg = p2p_arg(Head,Ind) ;
    /* The following line is a hack and should be taken out
     * when the compiler change for indexing []/0 is made. */
    if (isnil(Arg)) Hashval = ihash(0, TabSize);
    else if (isref(Arg) || isattv(Arg)) Hashval = -1;
    else Hashval = ihash(val_to_hash(Arg), TabSize);
  } else {   /* handle joint indexes */
    for (i = 2; i >= 0; i--) {
      j = (Ind >> (i*8)) & 0xff;
      if (j > 0) {
	if (j <= 0x80) {
	  Arg = p2p_arg(Head,j);
	  if (isref(Arg) || isattv(Arg)) return -1;
	  else Hashval += Hashval + ihash(val_to_hash(Arg), TabSize);
	} else {
	  prolog_term *stk[MAXTOINDEX], term;
	  int k, depth = 0, argsleft[MAXTOINDEX];
	  argsleft[0] = 1;
	  term = Head; XSB_Deref(term);
	  stk[0] = clref_val(term)+ (j - 0x80);
	  for (k = MAXTOINDEX; k > 0; k--) {
	    /*printf("depth = %d, left = %d\n",depth,argsleft[depth]);*/
	    if (depth < 0) break; /* out of for */
	    term = *stk[depth];
	    argsleft[depth]--;
	    if (argsleft[depth] <= 0) depth--;
	    else stk[depth]++;
	    XSB_Deref(term);
	    switch (cell_tag(term)) {
	      /* These must match what's done in val_to_hash, except it goes through structures */
	    case XSB_FREE:
	    case XSB_REF1:
	    case XSB_ATTV:
	      return -1;
	    case XSB_INT: 
	    case XSB_FLOAT:	/* Yes, use int_val to avoid conversion problem */
	      term = (Cell)int_val(term);
	      break;
	    case XSB_LIST:
	      depth++;
	      argsleft[depth] = 2;
	      stk[depth] = clref_val(term);
	      term = (Cell)(list_pscPair); 
	      break;
	    case XSB_STRUCT:
	      if (isboxedinteger(term)) {
		term = (Cell)boxedint_val(term);
	      } else if (isboxedfloat(term)) {
		term = int_val(cell(clref_val(term)+1)) ^
		  int_val(cell(clref_val(term)+2)) ^
		  int_val(cell(clref_val(term)+3));
	      } else {
		depth++;
		argsleft[depth] = get_arity(get_str_psc(term));
		stk[depth] = clref_val(term)+1;
		term = (Cell)get_str_psc(term);
	      }
	      break;
	    case XSB_STRING:
	      term = (Cell)string_val(term);
	      break;
	    }
	    Hashval += Hashval + ihash(term, TabSize);
	  }
	}
      }
    }
    Hashval %= TabSize;
  }
  return Hashval ;
}

static SOBRef new_SOBblock(int ThisTabSize, int Ind, Psc psc )
{
   int i, Loc ;
   SOBRef NewSOB ;

   /* get NEW SOB block */
   MakeClRef(NewSOB,SOB_RECORD,9+ThisTabSize);
   /*   xsb_dbgmsg((LOG_DEBUG,"New SOB %p, size = %d", NewSOB, ThisTabSize)); */

   if (xsb_profiling_enabled)
     add_prog_seg(psc,(byte *)NewSOB,ClRefSize(NewSOB)); /* dsw profiling */

   Loc = 0 ;
   dbgen_inst3_sob( Ind>0xff ? switchon3bound : switchonbound,
 	  Ind,((Integer)ClRefHashTable(NewSOB)),ThisTabSize,&ClRefSOBInstr(NewSOB),&Loc);
   /* set the PrRef inside SOB */
   Loc = 0 ;
   dbgen_inst_ppp(fail,&ClRefJumpInstr(NewSOB),&Loc);
   ClRefFirstIndex(NewSOB) = (Cell)&ClRefJumpInstr(NewSOB) ;
   ClRefLastIndex( NewSOB) = (Cell)&ClRefJumpInstr(NewSOB) ;
   ClRefNumNonemptyBuckets(NewSOB) = 0 ;
      
   /* Initialize hash table */
   for (i = 0; i < ThisTabSize; i++)
      ClRefHashTable(NewSOB)[i] = (Cell)&dynfail_inst ;

   return NewSOB ;
}

static void addto_hashchain( int AZ, int Hashval, SOBRef SOBrec, CPtr NewInd,
			     int Arity )
{
    CPtr *Bucketaddr = (CPtr *) (ClRefHashTable(SOBrec) + Hashval);
    CPtr OldInd = *Bucketaddr ;
    int Loc ;

    if ((pb)OldInd == (pb)&dynfail_inst) { /* empty bucket, add first clause */
      *Bucketaddr = NewInd ;
      IndRefPrev(NewInd) = (CPtr) Bucketaddr ;
      IndRefNext(NewInd) = (CPtr) SOBrec ;
      ClRefNumNonemptyBuckets(SOBrec)++ ;
    } else if (AZ == 0) { /* add at beginning */
      Loc = 0;
      dbgen_inst_ppvw(dyntrymeelse,Arity,OldInd,NewInd,&Loc);
      Loc = 0;
      if (cell_opcode(OldInd) == dynnoop)
      {  dbgen_inst_ppvw(dyntrustmeelsefail,Arity,IndRefNext(OldInd),
			 OldInd,&Loc); }
      else
      {  dbgen_inst_ppvw(dynretrymeelse,Arity,IndRefNext(OldInd),
			 OldInd,&Loc); }
      IndRefPrev(OldInd) = NewInd;
      *Bucketaddr = NewInd ;
      IndRefPrev(NewInd) = (CPtr) Bucketaddr ;
    } else { /* AZ == 1 add at end */
      Loc = 0;
      dbgen_inst_ppvw(dyntrustmeelsefail,Arity, SOBrec, NewInd,&Loc);
      Loc = 0;
      if (cell_opcode(OldInd) == dynnoop)
      {  dbgen_inst_ppvw_safe(dyntrymeelse,Arity,NewInd,OldInd,&Loc); }
      else {
        while (cell_opcode(OldInd) != dyntrustmeelsefail)
          OldInd = IndRefNext(OldInd);
        dbgen_inst_ppvw_safe(dynretrymeelse,Arity,NewInd,OldInd,&Loc);
      }
      IndRefPrev(NewInd) = OldInd ;
    }
}

static void addto_allchain( int AZ, ClRef Clause, SOBRef SOBrec, byte Arity)
{
  ClRef Last, First ;
  int Loc ;

  /* add code buff to all chain */
  if (PredOpCode(ClRefPrRef(SOBrec)) == fail) { /* insert first clrefI into SOB buff */
    Loc = 0;
    dbgen_inst_ppv(dynnoop,sizeof(Cell)/2,Clause,&Loc);
    Loc = 0 ;
    dbgen_inst_pppw(jump,Clause,ClRefPrRef(SOBrec),&Loc);
    ClRefLastIndex(SOBrec) = (Cell) Clause ;
    ClRefPrev(Clause) = SOBrec ;
    SetClRefNext(Clause, SOBrec);
  } else if (AZ == 0) {  /* add at beginning */
    First = (ClRef) ClRefFirstIndex(SOBrec);
    prefix_to_chain(FALSE,Arity,First,Clause);
    ClRefPrev(First) = Clause;
    ClRefFirstIndex(SOBrec) = (Cell) Clause;
  } else {  /* add at end */
    Last = (ClRef) ClRefLastIndex(SOBrec);
    append_to_chain(Arity, Last, Clause);
    ClRefPrev(Clause) = Last ;
    ClRefLastIndex(SOBrec) = (Cell) Clause;
  }
}

/* adds an indexed buffer to an index chain */
static void db_addbuff_i(byte Arity, ClRef Clause, PrRef Pred, int AZ,
			 int *Index, int NI, prolog_term Head, int HashTabSize)
{ SOBRef SOBbuff ;
  int Inum, Ind;
  unsigned int ThisTabSize; int Hashval;

  SOBbuff = AZ == 0 ? Pred->FirstClRef : Pred->LastClRef ;
  HashTabSize = ThisTabSize = hash_resize(Pred, SOBbuff, HashTabSize);
  
  for (Inum = 1; Inum <= NI; Inum++) {
    SOBbuff = AZ == 0 ? Pred->FirstClRef : Pred->LastClRef ;
    Ind = Index[Inum];
    Hashval = hash_val(Ind, Head, ThisTabSize) ;
    if (Hashval < 0) {Hashval = 0; ThisTabSize = 1;}
    if (PredOpCode(Pred) == fail || ClRefType(SOBbuff) != SOB_RECORD
	|| ClRefHashSize(SOBbuff) != ThisTabSize
	|| ClRefSOBArg(SOBbuff,1) != (byte)(Ind>>16)  /* for byte-back */
	|| ClRefSOBArg(SOBbuff,2) != (byte)(Ind>>8)
	|| ClRefSOBArg(SOBbuff,3) != (byte)Ind) {
      SOBbuff = new_SOBblock(ThisTabSize,Ind,get_str_psc(Head));
      /* add new SOB block */
      db_addbuff(Arity,SOBbuff,Pred,AZ,TRUE,Inum);
    }
    Pred = ClRefPrRef(SOBbuff) ; /* fake a prref */
    addto_hashchain(AZ, Hashval, SOBbuff, ClRefIndPtr(Clause,Inum), Arity);
  }
  addto_allchain( AZ, Clause, SOBbuff, Arity ) ;
}

/** The following macros traverse the SOB chains/trees
 ** and pick the first (next) clause since a given sob
 **/

static void find_usable_index(prolog_term Head, ClRef *s,
			      int *ILevel, int *Index ) {
  int i,Ind = 0;

  *Index = *ILevel = 0 ;
  for (i = 1; ClRefType(*s) == SOB_RECORD; i++ ) {
    if (Head != (prolog_term)NULL) {
      Ind = ((ClRefSOBArg(*s,1) << 8) | ClRefSOBArg(*s,2) ) << 8 |
	ClRefSOBArg(*s,3) ;
      if (hash_val(Ind,Head,1) >= 0) { /* found one */
	*Index = Ind; *ILevel = i;
	break ;
      }
    }
    *s = (ClRef)ClRefFirstIndex(*s);
  }
  /* printf("fui: ILevel=%d, Index=%d\n",*ILevel,*Index); */
}

/* These following macros are used only in first_clref and next_clref
   and make some assumptions based on this use. */

/* Check if a clause with head H is in the hash table of a SOB */
/* The indexing Level is used to adjust the returned clause    */
/* pointer to the beginning of the clause		       */

#define CheckSOBClause(H, Ind, sob, Level )			\
{    int h, t ;							\
     ClRef cl ;				    			\
     t = ClRefHashSize(sob); 					\
     h = hash_val( (Ind), (H), t ) ;				\
     cl = (ClRef) ClRefHashTable(sob)[h] ;			\
     if ((pb)cl != (pb)&dynfail_inst)				\
	return IndPtrClRef(cl,Level) ;				\
}

/* This macro finds the next SOB to search in the indexing tree */
/* the ordering is down, left, (up+)left, the down and left	*/
/* parts being performed by the next macro.			*/
/* It returns 0 if the root (prref) is ever reached.		*/
/* [Compiled clauses may be intermixed with dynamic ones, so 	*/
/* that possibility must be checked.    -- no longer]		*/

#define NextSOB(sob,curLevel,IndLevel,Ind,Head)			\
{   while( ClRefTryOpCode(sob) == dyntrustmeelsefail		\
	|| ClRefTryOpCode(sob) == noop ) /* end of sob chain */	\
	if( curLevel-- == 1 ) /* root of sob tree */		\
		return 0 ;					\
	else sob = ClRefUpSOB(sob) ; /* go up */		\
    sob = ClRefNext(sob) ; /* follow sob chain */		\
    if (curLevel == 1) { /* may have changed indexes?!? */	\
	find_usable_index(Head,&sob,IndLevel,Ind);		\
	curLevel = *IndLevel;					\
	} 							\
    if( ClRefType(sob) != SOB_RECORD ) return sob;		\
}

/* sob points to first SOB of the index chain			*/
/* look for Head/Ind in all SOB chains for this index level	*/
/* if needed go up to look in next sob chain(s)			*/

#define FirstClauseSOB(sob,curLevel,IndLevel,Head,Ind)		\
{   for(;;)							\
	if( curLevel < *IndLevel ) /* sob node */		\
	{   sob = ClRefPrRef(sob)->FirstClRef; /* go down */	\
	    curLevel++ ;					\
	}							\
	else /* curLevel == *IndLevel -> sob leaf */		\
	{   CheckSOBClause(Head,*Ind,sob,curLevel) ;		\
	    NextSOB(sob,curLevel,IndLevel,Ind,Head) ;		\
	}							\
}

ClRef first_clref( PrRef Pred, prolog_term Head, int *ILevel, int *Index )
{   SOBRef sob ;	/* working SOB */
    int curLevel ;  /* index depth */

    if( PredOpCode(Pred) == fail )
	return 0 ;

    /* first findout what index shall we use */
    sob = Pred->FirstClRef;
    find_usable_index(Head,&sob,ILevel,Index);

    if( *ILevel == 0 )	/* It's not indexable, so s points to first clause */
	return sob ;	/* in all chain of first SOB at lowest level */
    else
    {	curLevel = *ILevel ;
    	FirstClauseSOB(sob,curLevel,ILevel,Head,Index) ;
    }
}

ClRef next_clref( PrRef Pred, ClRef Clause, prolog_term Head,
			 int *IndexLevel, int *Ind )
{   SOBRef sob ;	/* working SOB */
    int numInds ;	/* number of indexes */
    int curLevel ;	/* how deep is sob in the indexing trees (0->Prref/numInds->leaf) */
    CPtr PI ;	/* working index pointer */

    if( ClRefType(Clause) != INDEXED_CL ) {	/* mixed clause types */
	if( ClRefTryOpCode(Clause) == dyntrustmeelsefail
	    || ClRefTryOpCode(Clause) == dynnoop 
	    || ClRefTryOpCode(Clause) == noop)
	  return 0 ;
	else if( ClRefType(ClRefNext(Clause)) != SOB_RECORD )
	  return ClRefNext(Clause) ;
	else /* should do as in cl_ref_first -- to index */
	{   sob = ClRefNext(Clause) ; 
	    if( *IndexLevel == 0 ) /* goto first cl in all chain */
	    {	while( ClRefType(sob) == SOB_RECORD )
		    sob = ClRefPrRef(sob)->FirstClRef ;
	 	return sob ;
	    }
	    else
	    {   for( curLevel = 1 ; curLevel < *IndexLevel ; curLevel++ )
		    sob = ClRefPrRef(sob)->FirstClRef ; /* all the way down */
		CheckSOBClause(Head,*Ind,sob,*IndexLevel) ;
		NextSOB(sob,curLevel,IndexLevel,Ind,Head) ;
		FirstClauseSOB(sob,curLevel,IndexLevel,Head,Ind) ;
	    }
	}
    }
    else if( *IndexLevel == 0 ) { /* look in all chain */
	if( ClRefTryOpCode(Clause) == dyntrymeelse || /* mid chain */
	    ClRefTryOpCode(Clause) == dynretrymeelse ) 
	    return ClRefNext(Clause) ;
        else /* INDEXED_CL, look on next SOB */
	  {   numInds = curLevel = ClRefNumInds(Clause);
				      /* all chain is on lowest index chain */
	    sob = ClRefNext(Clause);    /* sob = current SOB */
	    NextSOB(sob,curLevel,IndexLevel,Ind,Head);
	    /* all leaf SOBs have non empty all chains */
	    while( curLevel++ < numInds ) {
	      sob = ClRefPrRef(sob)->FirstClRef ;
	    }
	    return ClRefPrRef(sob)->FirstClRef ;
	}
    }
    else	/* look in appropriate hash chain */
    {	PI = ClRefIndPtr(Clause,*IndexLevel) ;
	if( cell_opcode(PI) == dyntrymeelse || /* mid chain */
	    cell_opcode(PI) == dynretrymeelse ) 
	    return IndPtrClRef(IndRefNext(PI),*IndexLevel) ;
	else /* end of chain */
	  {
	    sob = (SOBRef)IndRefNext(PI) ; /* sob = current SOB */
	    curLevel = *IndexLevel ;
	    NextSOB(sob,curLevel,IndexLevel,Ind,Head) ;
	    FirstClauseSOB(sob,curLevel,IndexLevel,Head,Ind) ;
	}
    }
}
/* Generic macro that deletes an element from a chain		*
 * Made possible because of the design of all chains containing	*
 * the three words:						*
 * 		(-1)Prev - (0)TryInstr - (1)Next		*
 * Index Rec Macros are used, although any kind of chain can be *
 * handled							*
 * Args are PC    - pointer to Chain element			*
 *          Displ - value to use as noop arg for begging of BC  *
 * return position of element just deleted		        */

#define delete_from_chain( c, PC, Displ )                               \
{   switch( c )                                                         \
    {   case noop: /* uniq */                                           \
        case dynnoop: /* uniq */                                        \
            break ;                                                     \
        case trymeelse: /* first */                                     \
            IndRefPrev(IndRefNext(PC)) = IndRefPrev(PC) ;               \
            if( cell_opcode(IndRefNext(PC)) == dynretrymeelse )            \
                cell_opcode(IndRefNext(PC)) = trymeelse ;               \
            else /* trustme */                                          \
            {   cell_opcode(IndRefNext(PC)) = noop ;                    \
                cell_operand3(IndRefNext(PC)) = (Displ) ;               \
            }                                                           \
            break ;                                                     \
        case dyntrymeelse: /* first */                                  \
            IndRefPrev(IndRefNext(PC)) = IndRefPrev(PC) ;               \
            if( cell_opcode(IndRefNext(PC)) == dynretrymeelse )            \
                cell_opcode(IndRefNext(PC)) = dyntrymeelse ;            \
            else /* dyntrustme */                                       \
            {   cell_opcode(IndRefNext(PC)) = dynnoop ;                 \
                cell_operand3(IndRefNext(PC)) = (Displ) ;               \
            }                                                           \
            break ;                                                     \
        case dynretrymeelse: /* mid */                                     \
            IndRefPrev(IndRefNext(PC)) = IndRefPrev(PC) ;               \
            IndRefNext(IndRefPrev(PC)) = IndRefNext(PC) ;               \
            break ;                                                     \
        case dyntrustmeelsefail: /* last */                             \
            IndRefNext(IndRefPrev(PC)) = IndRefNext(PC) ;               \
            if( cell_opcode(IndRefPrev(PC)) == dynretrymeelse )            \
                cell_opcode(IndRefPrev(PC)) = dyntrustmeelsefail ;      \
            else if (cell_opcode(IndRefPrev(PC)) == trymeelse )         \
            {   cell_opcode(IndRefPrev(PC)) = noop ;			\
                cell_operand3(IndRefPrev(PC)) = (Displ) ;               \
	    }								\
            else /* dyntrymeelse */                                     \
            {   cell_opcode(IndRefPrev(PC)) = dynnoop ;                 \
                cell_operand3(IndRefPrev(PC)) = (Displ) ;               \
            }                                                           \
            break ;                                                     \
        default:                                                        \
            xsb_exit("error removing a clause: %x",c) ;                 \
            break ;                                                     \
    }                                                                   \
}

/* delete from a hash chain */

static void delete_from_hashchain( ClRef Clause, int Ind, int NI )
{  
    CPtr PI = ClRefIndPtr(Clause,Ind) ;
    byte c = cell_opcode(PI) ;

    delete_from_chain(c,PI,((NI-Ind)*4+1)*sizeof(Cell)/2) ;

    if( cell_opcode(PI) == dynnoop) {
      *IndRefPrev(PI) = (Cell) &dynfail_inst ;
    }
    /**    else if( cell_opcode(PI) == noop)
     *IndRefPrev(PI) = (Cell) &dynfail_inst ; **/
    else if( cell_opcode(PI) == dyntrymeelse /**|| cell_opcode(PI) == trymeelse**/)
        *IndRefPrev(PI) = (Cell) IndRefNext(PI) ;
}

/* delete from the chain pointed by a prref - a all chain or a sob chain */

static void delete_from_allchain( ClRef Clause )
{  
    PrRef Pred ;
    byte c = ClRefTryOpCode(Clause) ;

    delete_from_chain( c, (CPtr)Clause, sizeof(Cell)/2 ) ;

    switch( c )
    {   case dynnoop:
            Pred = ClRefPrRef(ClRefPrev(Clause)) ;
	    PredOpCode(Pred) = fail ;
            Pred->FirstClRef = Pred->LastClRef = (ClRef) Pred ;
            break ;
        case dyntrymeelse:
        case trymeelse:
            Pred = ClRefPrRef(ClRefPrev(Clause)) ;
            Pred->FirstClRef = ClRefNext(Clause) ;
            break ;
        case dyntrustmeelsefail:
            Pred = ClRefPrRef(ClRefNext(Clause)) ;
            Pred->LastClRef = ClRefPrev(Clause) ;
            break ;
     }
}

/* Delete the clref from the chain itself, then adjust the first and
   last pointers from the PrRef -- note that retrys need no PrRef
   adjustment. */

static void delete_from_sobchain(ClRef Clause)
{  
    PrRef Pred ;
    byte c = ClRefTryOpCode(Clause) ;

    delete_from_chain( c, (CPtr)Clause, sizeof(Cell)/2 ) ;

    switch( c )
    {   case dynnoop:
            Pred = (PrRef)ClRefPrev(Clause) ;
	    PredOpCode(Pred) = fail ;
            Pred->FirstClRef = Pred->LastClRef = (ClRef) Pred ;
            break ;
    	case noop:
            Pred = (PrRef)ClRefPrev(Clause) ;
            PredOpCode(Pred) = fail ;
            Pred->FirstClRef = Pred->LastClRef = (ClRef) Pred ;
            break ;
        case dyntrymeelse:
        case trymeelse:
            Pred = (PrRef)ClRefPrev(Clause) ;
            Pred->FirstClRef = ClRefNext(Clause) ;
            break ;
        case dyntrustmeelsefail:
            Pred = (PrRef)ClRefNext(Clause) ;
            Pred->LastClRef = ClRefPrev(Clause) ;
            break ;
     }
}

/********************************************************************
Predicates for Clause Garbage Collecting and Safe Space Reclamation
********************************************************************/

/***********************************************************************

   MARKING CP STACKS FOR RETRACT/RETRACTALL

   Retract must mark ClRefs (using a high bit on the size field),
   rather than check for an exact match between CPs and the clause.
   This is because removing a clause from a chain may change the
   instruction of the Clref immediately preceding or succeeding it --
   this change may not be possible if there is a choice point pointing
   to that next instruction.

   For instance, suppose an indexing chain has try -- retry -- trust
   with a CP C pointing to the retry, and that the "try" clause is
   retracted.  If space reclamation is done immediately, the retry
   will be changed to a try.  Later, when C is executed on failure, a
   second CP for the same goal will be put onto the CP stack ---
   leading to an infinite loop that takes a little time to figure out
   (believe me :-)

   My solution is to mark the clauses which allows a later check of
   immediate predecessors and successors, by
   determine_if_safe_to_delete(). Space is reclaimed immediately only
   if situations like the above do not occur.

************************************************************************/

/* dynamic clauses now have special try/retry/trust instructions */
#define is_dynamic_clause_inst(inst)					\
  ((int) inst == dynretrymeelse ||   (int) inst == dyntrustmeelsefail)	

/* TLS: due to weirdness of ClRefs, a ClRef pointer points to the END
   of the ClRef.  To access its components you must decrement the
   ClRef pointer.  At some point I'd like to change this, but this
   would be a rather delicate operation. */

#define mark_clref(pClRef)  \
  (ClRef_Buflen(pClRef -1) = ClRef_Buflen(pClRef - 1) | HIGHBIT)

#define unmark_clref(pClRef)  \
  (ClRef_Buflen(pClRef -1) = ClRef_Buflen(pClRef - 1 ) & (~HIGHBIT))

#define clref_is_marked(pClRef)  \
  (ClRef_Buflen(pClRef -1 ) & HIGHBIT)

/* I think this is going back in the CLref through various
   indexing chains to find the "base" of the Clref.*/
ClRef clref_from_try_addr(ClRef code_addr) {
  while (cell_opcode((CPtr)code_addr - 2) == noop) {
    code_addr = (ClRef)((CPtr)code_addr - 4);
  }
  return (ClRef)code_addr;
}

/* cf. mark_cpstack_retracall(), etc.  Traverses choice point stack to
   mark any CLREFS that it sees.  If it finds something that is
   difficult to reason about, (i.e. a ;/2 within a dynamic clause or a
   get_db_clause pointer, it breaks out of the loop, returning a flag
   that will prevent the retract from immediately reclaiming space */

int mark_cpstack_retract(CTXTdeclc ClRef clref) {
  CPtr cp_top,cp_bot, cp_inst_addr ;
  byte cp_inst;
  int found_match;
  ClRef cp_clref;

  cp_bot = (CPtr)(tcpstack.high) - CP_SIZE;

  cp_top = ((bfreg < breg)? bfreg : breg) ;		
  found_match = 0;
  while ( cp_top < cp_bot && !(found_match)) {
    cp_inst = *(byte *)*cp_top;
    if ( is_dynamic_clause_inst(cp_inst) ) {
      cp_clref = clref_from_try_addr((ClRef)*cp_top);
      if (clref == cp_clref) {
	//	fprintf(stderr,"found exact match\n");
	found_match = 1;
      } 
      else {
	mark_clref(cp_clref);
      }
    }
    else {
      cp_inst_addr = (CPtr) *cp_top;
      if (cp_inst_addr == dbclause_cgc_block_gl
	  || (cp_inst_addr > standard_cgc_block_begin_gl 
	      && cp_inst_addr < standard_cgc_block_end_gl)) {
	//	fprintf(stderr,"found dangling dbclause/; ptr in mc_retract\n");
	found_match = 1;
      }
    }
    cp_top = cp_prevtop(cp_top);
  }
  return found_match;
}

/* * * * * * * * * */

void unmark_cpstack_retract(CTXTdecl) {
  CPtr cp_top,cp_bot ;
  byte cp_inst;
  ClRef cp_clref;

  cp_bot = (CPtr)(tcpstack.high) - CP_SIZE;

  cp_top = ((bfreg < breg)? bfreg : breg) ;		
  while ( cp_top < cp_bot ) {
    cp_inst = *(byte *)*cp_top;
    if ( is_dynamic_clause_inst(cp_inst) ) {
      cp_clref = clref_from_try_addr((ClRef)*cp_top);
      unmark_clref(cp_clref);
    }
    cp_top = cp_prevtop(cp_top);
  }
}

/* * * * * * * * * */

/* Used for non-open ClRef-based retractalls.  Traverses choice point
 stack to mark any Clrefs that it sees.  If it finds something that is
 difficult to reason about, (i.e. a ';' choice point within a dynamic
 clause or a get_db_clause pointer, it breaks out of the loop,
 returning a flag that will prevent the retractall from immediately
 reclaiming space for any of the retracted clauses.  */

int mark_cpstack_retractall(CTXTdecl) {
  CPtr cp_top,cp_bot,cp_inst_addr ;
  byte cp_inst;
  ClRef cp_clref;
  int found_match = 0;

  cp_bot = (CPtr)(tcpstack.high) - CP_SIZE;

  cp_top = ((bfreg < breg)? bfreg : breg) ;		
  while ( cp_top < cp_bot && !found_match) {
    cp_inst = *(byte *)*cp_top;
    if ( is_dynamic_clause_inst(cp_inst) ) {
      cp_clref = clref_from_try_addr((ClRef)*cp_top);
      mark_clref(cp_clref);
    }
    else {
      cp_inst_addr = (CPtr) *cp_top;
      if (cp_inst_addr == dbclause_cgc_block_gl
	  || (cp_inst_addr > standard_cgc_block_begin_gl 
	      && cp_inst_addr < standard_cgc_block_end_gl)) {
	//	fprintf(stderr,"found dangling dbclause/; ptr in CLREF retra\n");
	found_match = 1;
      }
    }
    cp_top = cp_prevtop(cp_top);
  }
  return found_match;
}

/* * * * * * * * * */

static inline int dyntabled_incomplete(CTXTdeclc Psc psc) {
  if (get_tabled(psc) && !is_completed_table(get_tip(CTXTc psc)))
    return TRUE;
  else return FALSE;
  }

/* * * * * * * * * */

/*
   check_cpstack_retractall() is used for abolishing a predicate, and for
   PrRef-based retractall.  In these cases, we can simply check
   whether a clause for the predicate is on the CP stack. This differs
   from retract, where an explicit marking phase is needed.
*/

int check_cpstack_retractall(CTXTdeclc PrRef prref) { 

  CPtr cp_top,cp_bot, cp_inst_addr; 
  byte cp_inst; 
  int found_prref_match; 
  ClRef clref_ptr;

  cp_bot = (CPtr)(tcpstack.high) - CP_SIZE;

  cp_top = ((bfreg < breg)? bfreg : breg) ;		
  found_prref_match = 0;
  while ( cp_top < cp_bot && !(found_prref_match)) {
    cp_inst = *(byte *)*cp_top;
    // dynamic clauses now have special try/retry/trust instructions
    if ( is_dynamic_clause_inst(cp_inst) ) {
      clref_ptr = clref_from_try_addr((ClRef)*cp_top);
      if (prref == clref_to_prref(clref_ptr)) {
	found_prref_match = 1;
      }
    }
    else {
      cp_inst_addr = (CPtr) *cp_top;
      if (cp_inst_addr == dbclause_cgc_block_gl
	  || (cp_inst_addr > standard_cgc_block_begin_gl 
	      && cp_inst_addr < standard_cgc_block_end_gl)) {
	//	fprintf(stderr,"found dangling dbclause/; ptr in gen retra\n");
	found_prref_match = 1;
      }
    }
    cp_top = cp_prevtop(cp_top);
  }
  return found_prref_match;
}

/* * * * * * * * * */

/* 
   DelCF chains point to clrefs or prrefs that have been retracted or
   abolished, but whose space has not been reclaimed.  Each thread can
   access two such chains -- one for shared predicates and one for
   private predicates.  DelCF frames are linked together by two
   doubly-linked list, one for all DelCF frames, and one for frames
   for a given predicate.  The PrRef for a predicate P points to the
   first DelCF frame for P.

   For a predicate P, DelCFs for clrefs are added before DelCFs for
   prrefs -- this way clrefs are removed before prrefs during GC,
   which is safer.  
 */

/* used by mt engine for shared tables */
DelCFptr delcf_chain_begin = (DelCFptr) NULL;

/* Asserting _pred structures to end of pred chain.  This means that
   if lastdcf is not null, just stick it on the end; otherwise adjust
   Prref's delcf pointer. */
DelCFptr new_DelCF_pred(CTXTdeclc PrRef pPrRef,Psc pPSC,
				DelCFptr *chain_begin) {
  DelCFptr pDCF; 

  pDCF = (DelCFptr)mem_alloc(sizeof(DeletedClauseFrame),ASSERT_SPACE); 
    if ( IsNULL(pDCF) )							
      xsb_abort("Ran out of memory in allocation of DeletedClauseFrame"); 
    DCF_PrRef(pDCF) = pPrRef;			
    DCF_ClRef(pDCF) = PrRef_FirstClRef(pPrRef);	 // diff from _clause create
    DCF_PSC(pDCF) = pPSC;
    DCF_Type(pDCF) = DELETED_PRREF;
    DCF_Mark(pDCF) = 0;
    DCF_PrevDCF(pDCF) = 0;						
    DCF_PrevPredDCF(pDCF) = 0;						
    DCF_NextDCF(pDCF) = *chain_begin;
    DCF_NextPredDCF(pDCF) = PrRef_DelCF(pPrRef);  
    if (*chain_begin) DCF_PrevDCF(*chain_begin) = pDCF;	
    if (PrRef_DelCF(pPrRef))  DCF_PrevPredDCF(PrRef_DelCF(pPrRef)) = pDCF; 
    *chain_begin = pDCF;						
    PrRef_DelCF(pPrRef) = pDCF;
    return pDCF;
}

/* * * * * * * * * */

/* Asserting _clause structures to START of pred chain -- this means
   that they will be abolished before any pred-level retractalls for
   the same predicate. */
DelCFptr new_DelCF_clause(PrRef pPrRef,Psc pPSC,ClRef pClRef,
				 DelCFptr *chain_begin) {
  DelCFptr pDCF; 

  pDCF = (DelCFptr)mem_alloc(sizeof(DeletedClauseFrame),ASSERT_SPACE); 
    if ( IsNULL(pDCF) )							
      xsb_abort("Ran out of memory in allocation of DeletedClauseFrame"); 
    DCF_PrRef(pDCF) = pPrRef;			
    DCF_ClRef(pDCF) = pClRef;	  // diff from _pred create
    DCF_PSC(pDCF) = pPSC;						
    DCF_Type(pDCF) = DELETED_CLREF;
    DCF_Mark(pDCF) = 0;							
    DCF_PrevDCF(pDCF) = 0;						
    DCF_PrevPredDCF(pDCF) = 0;						
    DCF_NextDCF(pDCF) = *chain_begin;				
    DCF_NextPredDCF(pDCF) = PrRef_DelCF(pPrRef);  
    if (*chain_begin) DCF_PrevDCF(*chain_begin) = pDCF;	
    if (PrRef_DelCF(pPrRef))  DCF_PrevPredDCF(PrRef_DelCF(pPrRef)) = pDCF; 
    *chain_begin = pDCF;						
    PrRef_DelCF(pPrRef) = pDCF;
    return pDCF;
}

/* * * * * * * * * */

/* No mutexes, because it is called only during gc, w. only 1 active
 * thread. Note that prref might be NULL if we have abolished the
 * predicate. */

#define Free_DelCF(pDCF,pPRREF,chain_begin) {				\
  if (DCF_PrevDCF(pDCF) == 0) {						\
    chain_begin = DCF_NextDCF(pDCF);					\
  }									\
  else {								\
    DCF_NextDCF(DCF_PrevDCF(pDCF)) = DCF_NextDCF(pDCF);			\
  }									\
  if (DCF_NextDCF(pDCF) != 0) {						\
    DCF_PrevDCF(DCF_NextDCF(pDCF)) = DCF_PrevDCF(pDCF);			\
  }									\
  if (DCF_PrevPredDCF(pDCF) == 0 && pPRREF) {				\
    PrRef_DelCF(pPRREF) = DCF_NextPredDCF(pDCF);			\
  }									\
  else {								\
    DCF_NextPredDCF(DCF_PrevPredDCF(pDCF)) = DCF_NextPredDCF(pDCF);	\
  }									\
  if (DCF_NextPredDCF(pDCF) != 0) {					\
    DCF_PrevPredDCF(DCF_NextPredDCF(pDCF)) = DCF_PrevPredDCF(pDCF);	\
  }									\
  mem_dealloc(pDCF,sizeof(DeletedTableFrame),ASSERT_SPACE);		\
}

/* * * * * * * * * */

/* 
   Assumes check has been made that the prref itself has at least one
   clause to retract -- this prevents a retractall of an empty predicate
   from adding a delcf frame.

   Any clref structures present in the pred chain will be deleted by
   the retractall anyway, so they can be removed.

   Inserting delcf_preds at end of pred_chain.  
*/

void check_insert_global_delcf_pred(CTXTdeclc PrRef prref,Psc psc) { 
  DelCFptr dcf = PrRef_DelCF(prref);

  SYS_MUTEX_LOCK(MUTEX_DYNAMIC);
  while ( dcf != 0 ) {
    if (DCF_Type(dcf) == DELETED_CLREF) {
      //      fprintf(stderr,"Prref over-riding clref for %s/%d\n",
      //	      get_name(psc),get_arity(psc));
      Free_DelCF(dcf,prref,delcf_chain_begin);
    }
    dcf = DCF_NextPredDCF(dcf);
  }
  dcf = new_DelCF_pred(CTXTc prref,psc,&delcf_chain_begin);
  SYS_MUTEX_UNLOCK(MUTEX_DYNAMIC);
}

#ifdef MULTI_THREAD
void check_insert_private_delcf_pred(CTXTdeclc PrRef prref,Psc psc) { 
  DelCFptr dcf = PrRef_DelCF(prref);

  while ( dcf != 0 ) {
    if (DCF_Type(dcf) == DELETED_CLREF) {
      //      fprintf(stderr,"Prref over-riding clref for %s/%d\n",
      //	      get_name(psc),get_arity(psc));
      Free_DelCF(dcf,prref,private_delcf_chain_begin);
    }
    dcf = DCF_NextPredDCF(dcf);
  }
  dcf = new_DelCF_pred(CTXTc prref,psc,&private_delcf_chain_begin);
}
#endif

/* Currently am not comparing deleted clauses to deleted predicates.
   Just delete the clauses, then do the retractalls.*/

void check_insert_global_delcf_clause(CTXTdeclc PrRef prref,
				      Psc psc,ClRef clref) { 
  DelCFptr dcf = PrRef_DelCF(prref);
  int found = 0;

  SYS_MUTEX_LOCK(MUTEX_DYNAMIC);
  //  while ( dcf != 0 ) {
  //    if (DCF_Type(dcf) == DELETED_CLREF && DCF_ClRef(dcf) == clref) {
      //      fprintf(stderr,"Found clref for %s/%d\n",
      //      get_name(psc),get_arity(psc));
  //      found = 1;
  //    }
  //    dcf = DCF_NextPredDCF(dcf);
  //  }
  if (!found) {
    dcf = new_DelCF_clause(prref,psc,clref,&delcf_chain_begin);
  }
  SYS_MUTEX_UNLOCK(MUTEX_DYNAMIC);
}

#ifdef MULTI_THREAD
void check_insert_private_delcf_clause(CTXTdeclc PrRef prref,
				      Psc psc,ClRef clref) { 
  DelCFptr dcf = PrRef_DelCF(prref);
  int found = 0;

  //  while ( dcf != 0 ) {
  //    if (DCF_Type(dcf) == DELETED_CLREF && DCF_ClRef(dcf) == clref) {
      //      fprintf(stderr,"Found clref for %s/%d\n",
      //      get_name(psc),get_arity(psc));
  //      found = 1;
  //    }
  //    dcf = DCF_NextPredDCF(dcf);
  //  }
  if (!found) {
    dcf = new_DelCF_clause(prref,psc,clref,&private_delcf_chain_begin);
  }
}

#define check_insert_shared_delcf_pred(context,prref,psc)	\
  check_insert_global_delcf_pred(context,prref,psc)	 

#define check_insert_shared_delcf_clause(context,prref,psc,clref)	\
  check_insert_global_delcf_clause(context,prref,psc,clref)	 

#define check_insert_private_delcf_pred(context,prref,psc)	\
  check_insert_private_delcf_pred(context,prref,psc)	 

#define check_insert_private_delcf_clause(context,prref,psc,clref)	\
  check_insert_global_delcf_clause(context,prref,psc,clref)	 

#else 
#define check_insert_private_delcf_pred(prref,psc)	\
  check_insert_global_delcf_pred(prref,psc)	 

#define check_insert_private_delcf_clause(prref,psc,clref)	\
  check_insert_global_delcf_clause(prref,psc,clref)	 
#endif

/* * * * * * * * * * * */

/* Marking DelCFs

   During the GC phase, a DelCF frame is marked if a traversal of the
   choice point stack indicates that it may be unsafe to reclaim space
   for the clrefs/prref it represents.

   If a DelCF represents a deleted prref, reclamation is complicated
   by the fact that clauses can be repeatedly asserted for a predicate
   and retractalled.  If GC cannot occur right away, this leads to
   "generations" of DelCFs.  Probably the best solution for this is to
   put ISO-style timestamps in clrefs and prrefs: until then, however,
   I'm marking all prrefs for a predicate P if any clause for P is in
   the CP stack -- regardless of its "generation".

   In addition, if a dynamic predicate is tabled and has incomplete
   tables, the Delcf is marked.  I'm not sure if this can occur(?)
*/

void mark_delcf_subchain(CTXTdeclc DelCFptr delcf,ClRef clref) {
  PrRef prref;

  prref = clref_to_prref(clref);
  while (delcf) {
    if (dyntabled_incomplete(CTXTc DCF_PSC(delcf))) {
      DCF_Mark(delcf) = 1;
      //      fprintf(stderr,"Marking DelCF for incomplete table: %s/%d\n",
      //      get_name(DCF_PSC(delcf)),get_arity(DCF_PSC(delcf)));
    }
    if (DCF_Type(delcf) == DELETED_PRREF && prref == DCF_PrRef(delcf) ) {
      DCF_Mark(delcf) = 1;
      //      fprintf(stderr,"Marking Pred DelCF for %s/%d\n",
      //      get_name(DCF_PSC(delcf)),get_arity(DCF_PSC(delcf)));
    } else if (DCF_Type(delcf) == DELETED_CLREF && DCF_ClRef(delcf) == clref) {
      DCF_Mark(delcf) = 1;
      //      fprintf(stderr,"Marking Clause DelCF for %s/%d\n",
      //      get_name(DCF_PSC(delcf)),get_arity(DCF_PSC(delcf)) );
    } 
    delcf = DCF_NextPredDCF(delcf);
  }
}

/* 
   This function, called by gc_dynamic traverses the CP stack to mark
   both DelCFs and ClRefs that cannot be GC'd.  

   DelCFs are marked in mark_delcf_subchain() and are obtained by the
   DelCF pointer off of the PrRef.  ClRefs must also be marked
   directly.  This is done so that determine_if_safe_to_delete() can
   operate properly (see other comments for this predicate).  See
   comments for mark_cpstack_retract()).
 */

int mark_dynamic(CTXTdecl) 
{
  CPtr cp_top,cp_bot, cp_inst_addr ;
  byte cp_inst;
  ClRef clref_ptr;
  PrRef prref_ptr;
  int found_match = 0;

  cp_bot = (CPtr)(tcpstack.high) - CP_SIZE;
  cp_top = ((bfreg < breg)? bfreg : breg) ;		

  while ( cp_top < cp_bot && !found_match) {
    cp_inst = *(byte *)*cp_top;
    if ( is_dynamic_clause_inst(cp_inst) ) {
      clref_ptr = clref_from_try_addr((ClRef)*cp_top);
      mark_clref(clref_ptr);
      prref_ptr = clref_to_prref(clref_ptr);
      mark_delcf_subchain(CTXTc PrRef_DelCF(prref_ptr),clref_ptr);
    }
    else {
      cp_inst_addr = (CPtr) *cp_top;
      if (cp_inst_addr == dbclause_cgc_block_gl
	  || (cp_inst_addr > standard_cgc_block_begin_gl 
	      && cp_inst_addr < standard_cgc_block_end_gl)) {
	//	fprintf(stderr,"found dangling dbclause/; ptr in gc\n");
	found_match = 1;
      }
    }
    cp_top = cp_prevtop(cp_top);
  }
  return found_match;
}

void gc_retractall(CTXTdeclc ClRef);
int determine_if_safe_to_delete(ClRef);
static int really_delete_clause(ClRef);

/* Upon freeing, the Pred-delcf pointer for the current prref may need
   to be set.  To do this, need to find the current prref (via
   dynpredep_to_prref()) not a possibly old one pointed to by the
   delcf frame.
*/

int sweep_dynamic(CTXTdeclc DelCFptr *chain_begin) { 
  DelCFptr next_delcf_ptr, delcf_ptr = *chain_begin; 
  int dcf_cnt = 0;
  PrRef prref;

  /* Free global deltcs */
  while (delcf_ptr) {
    next_delcf_ptr = DCF_NextDCF(delcf_ptr);
    if (DCF_Mark(delcf_ptr)) {
      //      fprintf(stderr,"GC Sweep skipping marked %s/%d\n",
      //	      get_name(DCF_PSC(delcf_ptr)),get_arity(DCF_PSC(delcf_ptr)));
      DCF_Mark(delcf_ptr) = 0;
      dcf_cnt++;
    }
    else {
      if (DCF_Type(delcf_ptr) == DELETED_PRREF) {
	//	fprintf(stderr,"Garbage Collecting Predicate: %s/%d\n",
	//		get_name(DCF_PSC(delcf_ptr)),get_arity(DCF_PSC(delcf_ptr)));
	gc_retractall(CTXTc DCF_ClRef(delcf_ptr));
	prref = dynpredep_to_prref(CTXTc get_ep(DCF_PSC(delcf_ptr)));
	Free_DelCF(delcf_ptr,prref,*chain_begin);
      }
      else {
	if (DTF_Type(delcf_ptr) == DELETED_CLREF) {
	  if (determine_if_safe_to_delete(DCF_ClRef(delcf_ptr))) {
	    //	    fprintf(stderr,"Garbage Collecting Clause: %s/%d (%p)\n",
	    //		    get_name(DCF_PSC(delcf_ptr)),get_arity(DCF_PSC(delcf_ptr)),
	    //		    DCF_ClRef(delcf_ptr));
	    really_delete_clause(DCF_ClRef(delcf_ptr));
	    prref = dynpredep_to_prref(CTXTc get_ep(DCF_PSC(delcf_ptr)));
	    Free_DelCF(delcf_ptr,prref,*chain_begin);
	  } else {
	    dcf_cnt++;
	    //	    fprintf(stderr,"GC Sweep skipping unsafe: %s/%d\n",
	    //		    get_name(DCF_PSC(delcf_ptr)),get_arity(DCF_PSC(delcf_ptr)));
	  }
	}
      }
    }
    delcf_ptr = next_delcf_ptr;
  }
  return dcf_cnt;
}

/* Returns -1 in situations it cant handle: currently, calling with
 * frozen stacks or multiple threads, or where there may be pointers
 * to dynamic code that are difficult to reason about.  Also returns
 * -1 if clause gc has been turned off.
 */

int gc_dynamic(CTXTdecl) 
{
  int ctr = -1;

  if (pflags[CLAUSE_GARBAGE_COLLECT] == 0) return -1;

#ifdef MULTI_THREAD
  if (flags[NUM_THREADS] == 1 ) {
    if (!delcf_chain_begin && !private_delcf_chain_begin) return 0;
    if (!mark_dynamic(CTXT)) {
      ctr = sweep_dynamic(CTXTc &delcf_chain_begin) + 
	sweep_dynamic(CTXTc &private_delcf_chain_begin);
    }
    unmark_cpstack_retract(CTXT);
  } else {
    if (!private_delcf_chain_begin) return 0;
    if (!mark_dynamic(CTXT)) {
      ctr = sweep_dynamic(CTXTc &private_delcf_chain_begin);
    }
    unmark_cpstack_retract(CTXT);
  }
#else 
    if (!delcf_chain_begin) return 0;
    if (!mark_dynamic(CTXT)) {
      ctr = sweep_dynamic(CTXTc &delcf_chain_begin);
    }
    unmark_cpstack_retract(CTXT);
#endif
  return ctr;
}

#define FIXED_BLOCK_SIZE_FOR_TABLED_PRED     (8 * sizeof(Cell))

/* TLS: did not put a MUTEX_DISPBLKHDR as the chain of dispblks
   themselves are not changed, only pointers to prrefs within the
   displblks. */
#ifdef MULTI_THREAD

static inline void thread_free_private_delcfs(CTXTdecl) {

  DelCFptr next_delcf;
  DelCFptr delcf = private_delcf_chain_begin;

  while (delcf) {
    next_delcf = DCF_NextDCF(delcf);
    mem_dealloc(delcf,sizeof(DeletedClauseFrame),ASSERT_SPACE);		
    delcf = next_delcf;
  }
}

/* free_private_prref() is the same as free_prref, except that it
   knows to free a private tif, rather than having to check via the
   psc record. */

void free_private_prref(CTXTdeclc CPtr *p) {

    if ( *(pb)p == tabletrysingle )
      {
	TIFptr mtTIF = (TIFptr) *(p+2);
	Free_Private_TIF(mtTIF);
	/* free prref, from calld instr set in db_build_prref */
	mem_dealloc((pb)(*(p+6)), sizeof(PrRefData),ASSERT_SPACE);
	if (xsb_profiling_enabled)
	  remove_prog_seg((pb)*(p+6));
	mem_dealloc((pb)p, FIXED_BLOCK_SIZE_FOR_TABLED_PRED,
		    ASSERT_SPACE) ; /*free table hdr*/
      }
    else {
      mem_dealloc((pb)p, sizeof(PrRefData),ASSERT_SPACE);  /* free prref */
      if (xsb_profiling_enabled)
	remove_prog_seg((pb)p);
    }
}

void retractall_prref(CTXTdeclc PrRef);

void thread_free_dyn_blks(CTXTdecl) {
  struct DispBlk_t *dispblk;
  PrRef prref0, prref;

  //  printf("Enter thread_free_dyn_blks\n");
  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
  for (dispblk=DispBlkHdr.firstDB ; dispblk != NULL ; dispblk=dispblk->NextDB) {
    if (th->tid <= dispblk->MaxThread) {
      prref0 = (PrRef)(&(dispblk->Thread0))[th->tid];
      if (prref0) {
	if (cell_opcode((CPtr *)prref0) == tabletrysingle) 
	  prref = (PrRef)((CPtr *)prref0)[6];
	else prref = prref0;
	retractall_prref(CTXTc prref);
	free_private_prref(CTXTc (CPtr *)prref0);
	//	printf("set prref free for thread %d\n",th->tid);
       	(&(dispblk->Thread0))[th->tid] = (CPtr) NULL;
      }
    }
  }
  SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
}

/* Called upon a thread's exit. */

void release_private_dynamic_resources(CTXTdecl) {
  thread_free_private_delcfs(CTXT);
  thread_free_dyn_blks(CTXT);
}

#endif

/********************************************************************/
/* Insert in retract buffer and remove old clauses */

static int really_delete_clause(ClRef Clause)
{
  xsb_dbgmsg((LOG_RETRACT,
	     "Really deleting clause(%p) op(%x) type(%d)",
	     Clause, ClRefTryOpCode(Clause), ClRefType(Clause) )) ;
    switch( ClRefType(Clause) )
    {
        case UNINDEXED_CL:
	  delete_from_sobchain(Clause) ;
	  break ;

        case INDEXED_CL:
        {   int i, NI ;
            SOBRef sob ;
            CPtr IP ;

            NI = ClRefNumInds(Clause) ;
            xsb_dbgmsg((LOG_RETRACT,
		       "Really deleting clause (%p) size %d indexes %d",
		       Clause, ClRefSize(Clause), NI )) ;
            delete_from_allchain(Clause) ;

            /* remove it from index chains */
            for( i = NI; i >= 1; i-- ) {
	      IP = ClRefIndPtr(Clause, i);
	      if (cell_opcode(IP) == dynnoop) /* deleting last in bucket */
		sob = (SOBRef)IndRefNext(IP); /* so get SOB addr */
	      else sob = NULL;

	      xsb_dbgmsg((LOG_RETRACT,
			  "SOB(%d) - hash size %d - %d clauses",
			  i, ClRefHashSize(sob), ClRefNumNonemptyBuckets(sob) ));
	      xsb_dbgmsg((LOG_RETRACT,
			  "Addr %p : prev %p : next %p",
			  sob, ClRefNext(sob), ClRefPrev(sob) ));
	      delete_from_hashchain(Clause,i,NI) ;
	      if (sob && --ClRefNumNonemptyBuckets(sob) == 0) 
                { /* if emptied bucket, decrement count; if all empty, reclaim SOB */
                    xsb_dbgmsg((LOG_RETRACT,"deleting sob - %p", sob ));
		    delete_from_sobchain(sob) ;
		    mem_dealloc((pb)ClRefAddr(sob), ClRefSize(sob),ASSERT_SPACE);
		}
            }
            break ;
        }
        case SOB_RECORD:
        default :
	  xsb_exit( "retract internal error!" ) ;
    }
    mem_dealloc((pb)ClRefAddr(Clause), ClRefSize(Clause),ASSERT_SPACE);
    if (xsb_profiling_enabled)
      remove_prog_seg((pb)Clause);
    return TRUE ;
}

/********************/

int determine_if_safe_to_delete(ClRef Clause) {
  byte opcode;
  int NI, i;
  CPtr IP;

  if (clref_is_marked(Clause)) return FALSE;

  opcode = ClRefTryOpCode(Clause);
  if ((opcode == trymeelse || opcode == dyntrymeelse)
      && clref_is_marked(ClRefNext(Clause))) {
    return FALSE;
  }

  NI = ClRefNumInds(Clause) ;

  /* remove it from index chains */
  for( i = NI; i >= 1; i-- ) {
  
    IP = ClRefIndPtr(Clause, i);
    if (cell_opcode(IP) == trymeelse || cell_opcode(IP) == dyntrymeelse) {
      if (clref_is_marked((ClRef) (IndRefNext(IP) - (4 * i)))) {
	return FALSE;
      }
    }
  }
  return TRUE;
}
	  
/* Mark a clause for deletion: don't do anything else.  This is done
   regardless of whether space is reclaimed or not.*/
static void mark_for_deletion(CTXTdeclc ClRef Clause)
{
  //  fprintf(stderr,"Mark for deletion: (%p) op(%x) type(%d)",
  // Clause, ClRefTryOpCode(Clause), ClRefType(Clause));
  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
  switch( ClRefType(Clause) ) {
        case UNINDEXED_CL: {
	  cell_opcode(ClRefEntryPoint(Clause)) = fail ;
	  cell_operand1(ClRefEntryPoint(Clause)) = MARKED_FOR_DELETION;
	}
	  break ;
        case INDEXED_CL: {
	  cell_opcode(ClRefIEntryPoint(Clause,ClRefNumInds(Clause))) = fail ;
	  cell_operand1(ClRefIEntryPoint(Clause,ClRefNumInds(Clause))) 
	    = MARKED_FOR_DELETION;
	  }
	  break ;
        case SOB_RECORD:
	  xsb_exit( "retracting indexing record!" ) ;
	  break ;
        default :
	  xsb_exit( "retract internal error!" ) ;
	  break ;
    }
    SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
}

/* called only if retract_nr == 0.  If retract_nr != 0, then we check
   that it is not a shared predicate and more than one active thread.
   If not, the cpstack is marked, and it is determined whether the
   clause is safe to delete (that we aren't changing an instruction
   pointed to by the cp stack).  If none of these cases is true, THEN
   we can actually delete the clause.  Otherwise, we make a frame on
   the delcf list. */

static void retract_clause(CTXTdeclc ClRef Clause, Psc psc ) { 
  PrRef prref; 
  int really_deleted = 0;
  
  mark_for_deletion(CTXTc Clause);

  if ((flags[NUM_THREADS] == 1 || !get_shared(psc)) 
      && pflags[CLAUSE_GARBAGE_COLLECT] == 1  && !dyntabled_incomplete(CTXTc psc)) {

    if (!mark_cpstack_retract(CTXTc Clause) && 
	determine_if_safe_to_delete(Clause)) {
      //          fprintf(stderr,"Really deleting clause: %s/%d (%p)\n",
      //		  get_name(psc),get_arity(psc),Clause);
      really_delete_clause(Clause);
      really_deleted = 1;
    }
    unmark_cpstack_retract(CTXT);
  }
  if (!really_deleted) {
    /* retracting only if unifying -- dont worry abt. NULL return for d_to_p */
    prref = dynpredep_to_prref(CTXTc get_ep(psc));
    //    fprintf(stderr,"Delaying retract of clref in use: %s/%d\n",
    //    get_name(psc),get_arity(psc));
#ifndef MULTI_THREAD
    check_insert_private_delcf_clause(prref,psc,Clause);
#else
    if (!get_shared(psc)) {
      check_insert_private_delcf_clause(CTXT, prref,psc,Clause);
    }
    else {
      check_insert_shared_delcf_clause(CTXT, prref,psc,Clause);
    }
#endif
  }
}


/***
 *** Entry points for CLAUSE/RETRACT predicates
 ***/

ClRef previous_clref(ClRef Clause) {
  int numInds;
  byte opcode;

  if (ClRefType(Clause) == INDEXED_CL) {
    opcode = ClRefTryOpCode(Clause);
    if (opcode == dynnoop || opcode == dyntrymeelse
	|| opcode == noop || opcode == trymeelse) {
      numInds = ClRefNumInds(Clause);
      Clause = ClRefPrev(Clause); /* get used_up parent SOB */
      opcode = ClRefTryOpCode(Clause);
      while (opcode == dynnoop || opcode == dyntrymeelse
	     || opcode == noop || opcode == trymeelse) {
	if (--numInds) {
	  Clause = (ClRef)(((Cell *)ClRefPrev(Clause)) - 5);
	  opcode = ClRefTryOpCode(Clause);
	} else return ClRefPrev(Clause);
      }
      Clause = ClRefPrev(Clause);
      while (ClRefType(Clause) == SOB_RECORD) {
	Clause = (ClRef)ClRefLastIndex(Clause);
      }
    } else Clause = ClRefPrev(Clause);
  } else { // if (ClRefType(Clause) == UNINDEXED_CL)) {
    Clause = ClRefPrev(Clause);
    while (ClRefType(Clause) == SOB_RECORD) {
      Clause = (ClRef)ClRefLastIndex(Clause);
    }
  }
   return Clause;
}

CPtr get_ClRefEntryPoint(ClRef Clause) {
  int numInds;
  if( ClRefType(Clause) != INDEXED_CL )
    return ClRefEntryPoint(Clause);
  else {
    numInds = ClRefNumInds(Clause) ;
    return ClRefIEntryPoint(Clause,numInds) ;
  }
}

ClRef db_get_clause_code_space(PrRef Pred, ClRef Clause, CPtr *CodeBegAddr, 
			       CPtr *CodeEndAddr) {
  int IndexArg = 0;
  int IndexLev = 0;

  do {
    if (Clause == NULL) 
      Clause = first_clref(Pred,(prolog_term)NULL,&IndexLev,&IndexArg);
    else Clause = next_clref(Pred,Clause,(prolog_term)NULL,&IndexLev,&IndexArg);
  } while (Clause && !(ClRefNotRetracted(Clause)));

  if (Clause != NULL) {
    *CodeBegAddr = get_ClRefEntryPoint(Clause);
    *CodeEndAddr = (CPtr)((pb)ClRefAddr(Clause) + ClRefSize(Clause));
  }
  return Clause;
}

/* db_get_last_clause returns the clref of the last (un-failed) clause
in a predicate.  It fails if there are no clauses.  It should be
extended to handle indexed predicates... */

xsbBool db_get_last_clause( CTXTdecl /*+(PrRef)Pred, -(ClRef)Clause, 
			      -(Integer)Type, -(Integer)EntryPoint*/ )
{
  PrRef Pred = (PrRef)ptoc_int(CTXTc 1);
  ClRef Clause;
  CPtr EntryPoint = 0;

  Pred = dynpredep_to_prref(CTXTc Pred);
  if (!Pred) return FALSE;
    
  if (Pred->LastClRef == (ClRef)Pred) return FALSE;
  Clause = Pred->LastClRef;

  while (ClRefType(Clause) == SOB_RECORD) {
    Clause = (ClRef)ClRefLastIndex(Clause);
  }

  while (Clause != (ClRef)Pred && !ClRefNotRetracted(Clause)) {
    Clause = previous_clref(Clause);
  }

  if (Clause == (ClRef)Pred) return FALSE;
  EntryPoint = get_ClRefEntryPoint(Clause);
  ctop_int(CTXTc 2, (Integer)Clause);
  ctop_int(CTXTc 3, (Integer)ClRefType(Clause));
  ctop_int(CTXTc 4, (Integer)EntryPoint);
  return TRUE;
}

/* db_get_clause
 * gets next clause from predicate
 * Arg 1 is the previous ClRef, or 0 if this is the first call.
 * Arg 2 is n if the nth index is to be used, 0 initially, and on subsequent
 *	calls, should pass in value previously returned in Arg 10.
 * Arg 3 is the integer indicating the field(s) indexed on (from the sob(3) instr,
 *	initially 0, and subsequently value returned in Arg 11.
 * Arg 4 is the Prref (predicate handle)
 * Arg 5 is a prolog term that matches the head of the clause
 * Arg 6 is 0 for "normal" clauses, 1 for clauses that consist of a fail 
 * instruction (generated by retract_nr and to be passed to reclaim space)
 * Arg 7 returns the clause address
 * Arg 8 returns the clause type
 * Arg 9 returns the jump point into the code
 * Arg 10 returns the ordinal for indexing (pass back in Arg 2 on subsequent calls)
 * Arg 11 returns the index fields mask (pass back in Arg 3 on subsequent calls)
 */

xsbBool db_get_clause( CTXTdecl /*+CC, ?CI, ?CIL, +PredEP, +Head, +Failed, -Clause, -Type, -EntryPoint, -NewCI, -NewCIL */ )
{
  PrRef Pred = (PrRef)ptoc_int(CTXTc 4);
  int IndexLevel = 0, IndexArg = 0;
  ClRef Clause ;
  prolog_term Head = reg_term(CTXTc 5);
  CPtr EntryPoint = 0;
  Integer failed = ptoc_int(CTXTc 6) ;

  //  printf("entered db_get_clause: %s/%d\n",get_name(get_str_psc(Head)),get_arity(get_str_psc(Head)));

    xsb_dbgmsg((LOG_RETRACT_GC,
	       "GET CLAUSE P-%p(%x) C-%p(%x) F-%p L-%p",
	       Pred, *(pb)Pred, ptoc_int(CTXTc 1),
	       ptoc_int(CTXTc 1) ? *(pb)(ptoc_int(CTXTc 1)) : 0,
	       Pred->FirstClRef, Pred->LastClRef ));

    Pred = dynpredep_to_prref(CTXTc Pred);
    
    SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
    if( !(Pred) || (Pred->LastClRef == (ClRef)Pred) )
    {	Clause = 0 ;
	goto set_outputs;
    }

    Clause = (ClRef)ptoc_int(CTXTc 1);
    if (Clause == 0) {
      Clause = first_clref( Pred, Head, &IndexLevel, &IndexArg ) ;
      while (Clause && ClRefNotRetracted(Clause)==failed) {
	Clause = next_clref( Pred, Clause, Head, &IndexLevel, &IndexArg );
      }
    }
    else
      {	IndexLevel = ptoc_int(CTXTc 2);  /* which index is used, ith */
        IndexArg   = ptoc_int(CTXTc 3);  /* index mask */

	do { /* loop until a clause is found:
		Retracted if looking for failed; 
		Not Retracted if looking for not failed */
	    Clause = next_clref( Pred, Clause, Head, &IndexLevel, &IndexArg );
	} while (Clause && ClRefNotRetracted(Clause)==failed ) ;
    }

set_outputs:
    if( Clause != 0 ) {
      if( ClRefType(Clause) == SOB_RECORD ) {
	    xsb_exit("Error in get clause");
      }
      else EntryPoint = get_ClRefEntryPoint(Clause);
    }
    else
      EntryPoint = 0 ;

    xsb_dbgmsg((LOG_RETRACT_GC,
	       "GOT CLAUSE C-%p(%x)", Clause, Clause ? *(pb)Clause : 0 ));
    SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );

    ctop_int(CTXTc  7, (Integer)Clause ) ;
    ctop_int(CTXTc  8, Clause != 0 ? (Integer)ClRefType(Clause) : 4 ) ;
    ctop_int(CTXTc  9, (Integer)EntryPoint ) ;
    ctop_int(CTXTc 10, IndexLevel);
    ctop_int(CTXTc 11, IndexArg);
    return TRUE ;
}

/* obsolete, and probably wrong. */
xsbBool db_reclaim0( CTXTdecl /* CLRef, Type */ )
{
  ClRef Clause = (ClRef)ptoc_int(CTXTc 1) ;

  mark_for_deletion(CTXTc Clause) ;
  return TRUE;
}

xsbBool db_retract0( CTXTdecl /* ClRef, retract_nr */ )
{
  ClRef clause = (ClRef)ptoc_int(CTXTc 1) ;
  //  int retract_nr = (int)ptoc_int(CTXTc 2) ;
  
  int retract_nr = 0;
  
  if (retract_nr) {
    mark_for_deletion(CTXTc clause);
  } 
  else {
    Psc psc = (Psc)ptoc_int(CTXTc 3);
    retract_clause(CTXTc clause, psc ) ;
  }
  return TRUE;
}


/*----------------------------------------------------------------------
  in the following, the number 8 denotes the size (in cells) of the
  following fixed sequence of instructions:
         <tabletrysingle, allocate_gc, getVn, calld, new_answer_dealloc>
  that gets generated as an entry point clause for all dynamic tabled
  predicates.
  ----------------------------------------------------------------------*/
/* TLS: changed mem_alloc to nocheck as xsb_throw() depends on this
   predicate.  So if we're out of memory here, we're sunk. */

static inline void allocate_prref_tab(CTXTdeclc Psc psc, PrRef *prref, pb *new_ep) {
  int Loc;

  if (!(*prref = (PrRef)mem_alloc_nocheck(sizeof(PrRefData),ASSERT_SPACE))) 
    xsb_exit("++Unrecoverable Error[XSB/Runtime]: [Resource] Out of memory (PrRef)");
  //  fprintf(stdout,"build_prref: %s/%d, shared=%d, prref=%p\n",
  //          get_name(psc),get_arity(psc),get_shared(psc),prref);

  if (xsb_profiling_enabled)
    add_prog_seg(psc,(byte *)*prref,sizeof(PrRefData)); /* dsw profiling */

  Loc = 0 ;
  dbgen_inst_ppp(fail,*prref,&Loc) ;
  //  ((CPtr)(*prref))[2] = (Cell)(*prref) ; TLS: ugh!
  PrRef_FirstClRef(*prref) = NULL;
  PrRef_LastClRef(*prref) = (ClRefHdr *)*prref;
  PrRef_Psc(*prref) = psc;        
  PrRef_Mark(*prref) = 0;
  PrRef_DelCF(*prref) = NULL;
  if ( get_tabled(psc) )
    {
      TIFptr tip;
      CPtr tp;
      tip = New_TIF(CTXTc psc);
      tp  = (CPtr)mem_alloc_nocheck(FIXED_BLOCK_SIZE_FOR_TABLED_PRED,ASSERT_SPACE) ;
      if (tp == NULL) {
	xsb_exit("++Unrecoverable Error[XSB/Runtime]: [Resource] Out of memory (PrRef)");
      }
      Loc = 0 ;
      dbgen_inst_ppvww(tabletrysingle,get_arity(psc),(tp+3),tip,tp,&Loc) ;
      dbgen_inst_pvv(allocate_gc,3,3,tp,&Loc) ;
      dbgen_inst_ppv(getVn,2,tp,&Loc) ;  /* was getpbreg */
      dbgen_inst_ppvw(calld,3,*prref,tp,&Loc) ; /* *prref is *(tp+6), see remove_prref*/
      dbgen_inst_pvv(new_answer_dealloc,get_arity(psc),2,tp,&Loc) ;
      *new_ep = (pb)tp;
    }
  else *new_ep = (pb)*prref;
}


PrRef build_prref( CTXTdeclc Psc psc )
{
  PrRef p;
  pb new_ep;
  //  Integer Tabled = ptoc_int(CTXTc 2);

  set_type(psc, T_DYNA);
  set_env(psc, T_VISIBLE);

  /* set data to point to usermod -- lfcastro */
  if (get_data(psc) == NULL) 
    set_data(psc,global_mod);
    
  allocate_prref_tab(CTXTc psc,&p,&new_ep);
  p->psc = psc;
  p-> mark = 0;

#ifdef MULTI_THREAD
  //  printf("prref disp tab for %s/%d? shared=%d\n",
  //         get_name(psc),get_arity(psc),get_shared(psc));

  if ((*(pb)get_ep(psc) == switchonthread) || !get_shared(psc)) {
    struct DispBlk_t *dispblk;
    if (*(pb)get_ep(psc) != switchonthread) {
      /* create new switchonthread instruction and dispblock */
      pb disp_instr_addr = mem_calloc(sizeof(Cell),2,MT_PRIVATE_SPACE);
      dispblk = (struct DispBlk_t *) 
	mem_calloc(sizeof(struct DispBlk_t)+MAX_THREADS*sizeof(Cell),
		   1,MT_PRIVATE_SPACE);

      SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
      if (DispBlkHdr.firstDB) DispBlkHdr.firstDB->PrevDB = dispblk;
      dispblk->NextDB = DispBlkHdr.firstDB;
      DispBlkHdr.firstDB = dispblk;
      if (!DispBlkHdr.lastDB) DispBlkHdr.lastDB = dispblk;
      SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );

      dispblk->MaxThread = MAX_THREADS;
      *disp_instr_addr = switchonthread;
      *(((CPtr *)disp_instr_addr)+1) = (CPtr)dispblk;
      set_ep(psc,disp_instr_addr);
    } else {
      /* add to dispblock if room, extending if nec */
      dispblk = (struct DispBlk_t *)*((CPtr)get_ep(psc)+1);
    }
    if (dispblk->MaxThread >= th->tid) {
      (&(dispblk->Thread0))[th->tid] = (CPtr)new_ep;
    } else xsb_exit("must expand dispatch-block");
  } else set_ep(psc,new_ep);
#else
  set_ep(psc,new_ep);
#endif /* MULTI_THREAD */
  return p;
}

xsbBool db_build_prref( CTXTdecl /* PSC, Tabled?, -PrRef */ ) {

  ctop_int(CTXTc 3, (Integer)build_prref(CTXTc (Psc)ptoc_int(CTXTc 1)));
  return TRUE;
}


PrRef get_prref(CTXTdeclc Psc psc) {
  PrRef prref;
  if (get_ep(psc) == (byte *)&fail_inst) {
    prref = build_prref(CTXTc psc);
  } else {
    prref = dynpredep_to_prref(CTXTc get_ep(psc));
#ifdef MULTI_THREAD
    //  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
    if (!prref) {
      pb new_ep;
      struct DispBlk_t *dispblk = ((struct DispBlk_t **)get_ep(psc))[1];
      allocate_prref_tab(CTXTc psc,&prref,&new_ep);
      if (dispblk->MaxThread >= th->tid) {
	(&(dispblk->Thread0))[th->tid] = (CPtr) new_ep;
      } else {
	//      SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
	xsb_exit("must expand dispatch-block");
      }
    }
    //  SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
#endif
  }
  return prref;
}

xsbBool db_get_prref( CTXTdecl /* PSC, -PrRef */ ) {
  ctop_int(CTXTc 2,(Integer)get_prref(CTXTc (Psc)ptoc_int(CTXTc 1)));
  return TRUE;
}

/* See also free_private_pref() below.  free_private_prref() is the
   same as free_prref, except that it knows to free a private tif,
   rather than having to check via the psc record. */

void free_prref(CTXTdeclc CPtr *p, Psc psc) {

    if ( *(pb)p == tabletrysingle )
      {
	TIFptr mtTIF = (TIFptr) *(p+2);
#ifdef MULTI_THREAD
	if (!get_shared(psc)) {
	  Free_Private_TIF(mtTIF);
	}
	else {
	  Free_Shared_TIF(mtTIF);
	}
#else
	Free_Shared_TIF(mtTIF);
#endif
	/* free prref, from calld instr set in db_build_prref */
	mem_dealloc((pb)(*(p+6)), sizeof(PrRefData),ASSERT_SPACE);
	if (xsb_profiling_enabled)
	  remove_prog_seg((pb)*(p+6));
	mem_dealloc((pb)p, FIXED_BLOCK_SIZE_FOR_TABLED_PRED,ASSERT_SPACE) ; /*free table hdr*/
      }
    else {
      mem_dealloc((pb)p, sizeof(PrRefData),ASSERT_SPACE);  /* free prref */
      if (xsb_profiling_enabled)
	remove_prog_seg((pb)p);
    }
}

/* Given an sob clref, return the prref in which it occurs */
PrRef sob_to_prref(ClRef clref) {
  while (ClRefTryOpCode(clref) == dynretrymeelse) {
    /* search backward, under (unsupported) assumption that it is 
       more likely to be near the beginning; could look forward. */
    clref = ClRefPrev(clref);
  }
  switch (ClRefTryOpCode(clref)) {
  case dynnoop:
  case noop:
  case dyntrymeelse:
  case trymeelse:
    return (PrRef)ClRefPrev(clref);
  case dyntrustmeelsefail:
    return (PrRef)ClRefNext(clref);
  }
  return NULL;
}

/* Given a clref, return the prref in which it occurs */
#ifdef UNDEFINED
PrRef clref_to_prref(ClRef clref) {
  CPtr curInd;
  if (ClRefType(clref) == UNINDEXED_CL) {
    return sob_to_prref(clref);
  } else if (ClRefType(clref) == INDEXED_CL) { /* indexed, use first index */
    curInd = ClRefIndPtr(clref,1);
    if (ClRefTryOpCode(curInd) != dynnoop) {
      while (cell_opcode(curInd) != dyntrustmeelsefail) {
        curInd = IndRefNext(curInd);
      }
    }
    return sob_to_prref((SOBRef)IndRefNext(curInd));
  } else return NULL;
}
#endif

PrRef clref_to_prref(ClRef clref) {
  CPtr curInd;
  if (ClRefType(clref) == UNINDEXED_CL || ClRefType(clref) == SOB_RECORD) {
    return sob_to_prref(clref);
  } else if (ClRefType(clref) == INDEXED_CL) { /* indexed, use first index */
    curInd = ClRefIndPtr(clref,1);
    if (ClRefTryOpCode(curInd) != dynnoop) {
      while (cell_opcode(curInd) != dyntrustmeelsefail) {
        curInd = IndRefNext(curInd);
      }
    }
    return sob_to_prref((SOBRef)IndRefNext(curInd));
  } else return NULL;
}


/*----------------------------------------------------------------------*/
/* some stuff for trie_assert                                           */
/*----------------------------------------------------------------------*/

#define clref_fld(x) ((CPtr) *(x +1))
#define next_clref(x) ((CPtr) *(x +1))
#define last_clref(PRREF)  ((CPtr)((PrRef)(PRREF))->LastClRef)
#define try_type_instr_fld(x)  (ClRefTryOpCode(x))
#define code_to_run(x)   (cell_opcode(ClRefEntryPoint(x)))
#define first_instr_to_run(x)  (cell_opcode(ClRefWord(x,3)))

/*----------------------------------------------------------------------*/

static inline int clref_trie_asserted(CPtr Clref) {
  return((code_to_run(Clref) == jump) && 
	 (first_instr_to_run(Clref) == trie_assert_inst));
}
/*----------------------------------------------------------------------*/

/* called by gen_retractall in case the predicate "abolished" is a trie.
   This deletes from the root of the trie, as obtained by the first ClRef */

static void abolish_trie_asserted_stuff(CTXTdeclc PrRef prref) {

   BTNptr pRoot;
   CPtr b;

   /*** printf("abolish_trie\n"); ***/
   b = (CPtr)prref->FirstClRef;
   pRoot = (BTNptr)*(b + 3);
   switch_to_trie_assert;
   delete_trie(CTXTc pRoot);
   switch_from_trie_assert;
   *(pb)prref = fail;
   mem_dealloc((pb)(b-2),6*sizeof(Cell),ASSERT_SPACE);  /* allocated in trie_assert */
}

/*----------------------------------------------------------------------*/

static int another_buff(Cell Instr)
{
  int op = cell_opcode(&Instr) ;
  return (op != dynnoop && op != dyntrustmeelsefail && op != fail 
    && op != noop);
}

/*======================================================================*/
/* The following routine deletes all clauses from a prref.  It is the	*/
/* equivalent of retractall(p(_,_,_,..,_)). It is given the address of	*/
/* a buffer and frees it and all buffers it points to.			*/
/*======================================================================*/
#define MAXDYNFREEBUFF 200

/* If you update this, please check gc_retractall() also */
void retractall_prref(CTXTdeclc PrRef prref) {
  int btop = 0;
  ClRef buffer;
  ClRef buffers_to_free[MAXDYNFREEBUFF];

  if (prref && (cell_opcode((CPtr)prref) != fail)) {
    if (PredOpCode(prref) == jump) {  /* should be trie-asserted */
      abolish_trie_asserted_stuff(CTXTc prref);
      return;
    }
    buffers_to_free[btop++] = prref->FirstClRef;
    while (btop > 0) {
      if (btop >= MAXDYNFREEBUFF) xsb_exit("Too many buffers to retract");
      buffer = buffers_to_free[--btop];
      switch (ClRefType(buffer)) {
      case SOB_RECORD: 
	if (another_buff(ClRefJumpInstr(buffer)))
	  buffers_to_free[btop++] = (ClRef) ClRefFirstIndex(buffer);
	if (another_buff(ClRefTryInstr(buffer)))
	  buffers_to_free[btop++] = ClRefNext(buffer);
	mem_dealloc((pb)ClRefAddr(buffer),ClRefSize(buffer),ASSERT_SPACE);
	if (xsb_profiling_enabled)
	  remove_prog_seg((pb)buffer);
	break ;
      case UNINDEXED_CL: 
      case INDEXED_CL:
	if (another_buff(ClRefTryInstr(buffer)))
	  buffers_to_free[btop++] = ClRefNext(buffer);
	if( ClRefNotRetracted(buffer) ) {
	  /*		retract_clause(buffer,0) */
	  /* really_delete_clause(buffer); */
	  mem_dealloc((pb)ClRefAddr(buffer),ClRefSize(buffer),ASSERT_SPACE);
	  if (xsb_profiling_enabled)
	    remove_prog_seg((pb)buffer);
	}
	break;
      }
    }
    PrRef_FirstClRef(prref) = NULL;
    cell_opcode((CPtr)prref) = fail;
  }
}

/* Like retractall_prref() but used from access is from a DelFC, so we
   want to start with the old Prrefs first clref, rather than the
   prref (which by the time we gc could have a new set of clrefs
   associated with it)
*/
void gc_retractall(CTXTdeclc ClRef clref) {
  int btop = 0;
  ClRef buffer;
  ClRef buffers_to_free[MAXDYNFREEBUFF];

    buffers_to_free[btop++] = clref;
    while (btop > 0) {
      if (btop >= MAXDYNFREEBUFF) xsb_exit("Too many buffers to retract");
      buffer = buffers_to_free[--btop];
      switch (ClRefType(buffer)) {
      case SOB_RECORD: 
	if (another_buff(ClRefJumpInstr(buffer)))
	  buffers_to_free[btop++] = (ClRef) ClRefFirstIndex(buffer);
	if (another_buff(ClRefTryInstr(buffer)))
	  buffers_to_free[btop++] = ClRefNext(buffer);
	mem_dealloc((pb)ClRefAddr(buffer),ClRefSize(buffer),ASSERT_SPACE);
	if (xsb_profiling_enabled)
	  remove_prog_seg((pb)buffer);
	break ;
      case UNINDEXED_CL: 
      case INDEXED_CL:
	if (another_buff(ClRefTryInstr(buffer)))
	  buffers_to_free[btop++] = ClRefNext(buffer);
	if( ClRefNotRetracted(buffer) ) {
	  /*		retract_clause(buffer,0) */
	  /* really_delete_clause(buffer); */
	  mem_dealloc((pb)ClRefAddr(buffer),ClRefSize(buffer),ASSERT_SPACE);
	  if (xsb_profiling_enabled)
	    remove_prog_seg((pb)buffer);
	}
	break;
      }
    }
}

/* TLS change for gc.  Space is reclaimed if 

     The predicate is private OR there is a single active thread
     AND 
     a check of the CP stack determines that it is safe to
     reclaim spaces for the predicate,
     AND 
     if the predicate is tabled, there is no incomplete table
     for that predicate.
 */
int gen_retract_all(CTXTdecl/* R1: +PredEP , R2: +PSC */)
{
  PrRef prref = (PrRef)ptoc_int(CTXTc 1);
  Psc psc = (Psc)ptoc_int(CTXTc 2);
  int action = 0;

  prref = dynpredep_to_prref(CTXTc prref);

  /* Here, !prref can occur if the predicate is private but its
     thread-specific prref has not been created. */

  if (!prref || PrRef_FirstClRef(prref) == NULL) { /* nothing to retract */
    return TRUE;
  }

  if ((flags[NUM_THREADS] == 1 || !get_shared(psc))
      && pflags[CLAUSE_GARBAGE_COLLECT] == 1  && !dyntabled_incomplete(CTXTc psc)) {

    gc_dynamic(CTXT);    // part of gc strategy -- dont know how good

    action = check_cpstack_retractall(CTXTc prref);
  }  else action = 1;
  if (!action) {
    SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
    //    fprintf(stderr,"abolishing prref (gen_retra) %p\n",prref);
    retractall_prref(CTXTc prref);
    SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
  }
  else {
    //    fprintf(stderr,"Delaying retractall of prref in use: %s/%d\n",
    //    get_name(psc),get_arity(psc));
#ifndef MULTI_THREAD
    check_insert_private_delcf_pred(prref,psc);
#else
    if (!get_shared(psc)) {
      check_insert_private_delcf_pred(CTXT, prref,psc);
    }
    else {
      check_insert_shared_delcf_pred(CTXT, prref,psc);
    }
#endif
    PrRef_FirstClRef(prref) = NULL;
    cell_opcode((CPtr)prref) = fail;
  }
  return TRUE;
}

/**************************************
   abolish/1
   
   I'm trying to approximate ISO semantics when 1 thread and
   non-tabled.  If the predicate is tabled and has an incomplete
   table, we throw an error as usual; otherwise if tabled the tables
   are abolished.  

   Unlike retractalls, this predicate throws an error if its unsafet
   to reclaim space immediately.  Note that for abolish, XSB reclaims
   based on the prref.  GC-ing a prref that has been abolished is
   problematic.  If you create a DelCF for the PrRef, you have a
   pointer to a reclaimed prref which isn't good; if you delay
   reclaiming the prref you lose ISO semantics.  You could create a
   3-rd type of DelCF frame for abolishes, and some special treatment,
   but I'm too lazy for that as I dont think that abolishing a
   predicate you're backtracking into is good programming practice.

********************************************/

/* No longer available as builtin -- I think that's too dangerous now
   that we have prref gc -- TLS */
void db_remove_prref_1( CTXTdeclc Psc psc ) 
{
  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
  if (get_ep(psc) != ((byte *)(&(psc->load_inst)))) {
    free_prref(CTXTc (CPtr *)get_ep(psc),psc);
    set_type(psc, T_ORDI);
    set_ep(psc, ((byte *)(&(psc->load_inst))));
  }
  SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
}

xsbBool db_abolish0(CTXTdecl/* R1: +PredEP , R2: +PSC */)
{
  PrRef prref = (PrRef)ptoc_int(CTXTc 1);
  Psc psc = (Psc)ptoc_int(CTXTc 2);
  int action = 0;
  
  prref = dynpredep_to_prref(CTXTc prref);

  if (!prref) return TRUE;

  if (flags[NUM_THREADS] != 1) {
    xsb_abort("Cannot abolish a predicate when more than 1 thread is active");
  }

  if (get_tabled(psc)) {
    if (!is_completed_table(get_tip(CTXTc psc))) {
      xsb_table_error(CTXTc 
		    "Cannot abolish tabled predicate when table is incomplete");
    } else fast_abolish_table_predicate(CTXTc psc);
  }

  gc_dynamic(CTXT);    // part of gc strategy -- dont know how good

  action = check_cpstack_retractall(CTXTc prref);
  if (!action) {
    SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
    // fprintf(stderr, "abolishing prref %p\n",prref);
    retractall_prref(CTXTc prref);
    db_remove_prref_1( CTXTc psc);
    SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
  }
  else {
    xsb_abort("Cannot abolish a predicate with active backtrack points: use retractall");
  }
  return TRUE;
}

/*-----------------------------------------------------------------*/

/* This function is used by ClRef-based retratall.  It has close to
   the same semantics as retract_clause(), but the CP stack marking
   and unmarking has been factored out into surrounding routines for
   efficiency.  In fact, the first condition could also be factored
   out, if we wanted to. */

static void retractall_clause(CTXTdeclc ClRef Clause, Psc psc, int flag ) { 
  PrRef prref; 
  int really_deleted = 0;

  
  mark_for_deletion(CTXTc Clause);

    if ((flags[NUM_THREADS] == 1 || !get_shared(psc))
	&& pflags[CLAUSE_GARBAGE_COLLECT] == 1  
	&& !dyntabled_incomplete(CTXTc psc) && !flag) {

    if(!(clref_is_marked(Clause)) && 
	determine_if_safe_to_delete(Clause)) {
      really_delete_clause(Clause);
      really_deleted = 1;
    }
  }
  if (!really_deleted) {
    /* retracting only if unifying -- dont worry abt. NULL return for d_to_p */
    prref = dynpredep_to_prref(CTXTc get_ep(psc));
    //    fprintf(stderr,"Delaying retractall of clref in use: %s/%d\n",
    //            get_name(psc),get_arity(psc));
#ifndef MULTI_THREAD
    check_insert_private_delcf_clause(prref,psc,Clause);
#else
    if (!get_shared(psc)) {
      check_insert_private_delcf_clause(CTXT, prref,psc,Clause);
    }
    else {
      check_insert_shared_delcf_clause(CTXT, prref,psc,Clause);
    }
#endif
  }
}

/* * * * * * * * * * * * */

void db_retractall0( CTXTdecl /* (Switch) ClRef, retract_nr */ )
{
  ClRef clause = (ClRef)ptoc_int(CTXTc 2) ;
  int cantReclaim = (int)ptoc_int(CTXTc 3) ;
  
  Psc psc = (Psc)ptoc_int(CTXTc 4);
  retractall_clause(CTXTc clause, psc, cantReclaim ) ;
}

/* * * * * * * * * * * * */

/* At some point should probably move some of the following into here: 
 DB_GET_LAST_CLAUSE  DB_RETRACT0   DB_GET_CLAUSE    DB_BUILD_PRREF	
 DB_ABOLISH0	 DB_RECLAIM0	 DB_GET_PRREF */

void init_dbclause_cgc_blocks(void) {
  Psc psc;
  int new;

  psc = ((Pair)insert("db_get_clauses1", 11, 
		      pair_psc(insert_module(0, "dbclause")), &new)) -> psc_ptr;
  dbclause_cgc_block_gl = (CPtr) (get_ep(psc) + 0xc8);
}

void init_standard_cgc_blocks(void) {
  Psc psc;
  int new;

  psc = ((Pair)insert(";", 2, 
		      pair_psc(insert_module(0, "standard")), &new))-> psc_ptr;
  standard_cgc_block_begin_gl = (CPtr) (get_ep(psc));
  standard_cgc_block_end_gl = (CPtr) (get_ep(psc) + 0x94);
}


xsbBool dynamic_code_function( CTXTdecl ) 
{
  switch (ptoc_int(CTXTc 1)) {

  case MARK_CPSTACK_RETRACTALL: 
    ctop_int(CTXTc 2,mark_cpstack_retractall(CTXT));
    break;

  case UNMARK_CPSTACK_RETRACT: 
    unmark_cpstack_retract(CTXT);
    break;

  case DB_RETRACTALL0: 
    db_retractall0(CTXT);
    break;

  case INIT_DBCLAUSE_CGC_BLOCKS:
    init_dbclause_cgc_blocks();
    break;

  case INIT_STANDARD_CGC_BLOCKS:
    init_standard_cgc_blocks();
    break;

  }

  return TRUE;
}

/*===============================================================*/
/* Trie Assert and Retract                                       */
/*===============================================================*/

static inline CPtr trie_asserted_clref(CPtr prref)
{
  CPtr Clref;

  Clref = last_clref(prref);
  if (try_type_instr_fld(prref) != fail) {
    if ((code_to_run(Clref) == jump) &&
	(first_instr_to_run(Clref) == trie_assert_inst))
      return Clref;
  }
  return NULL;
}

/*---------------------------------------------------------------*/
/* used for debugging trie_assert */

static inline void print_bytes(CPtr x, int lo, int hi)
{
  int i;

  xsb_dbgmsg((LOG_DEBUG, "addr %p ---------------------------------",x));
  for (i = lo; i <= hi ; i++) {
    xsb_dbgmsg((LOG_DEBUG," i = %d 4*i = %d  x[i] = %x ",i,4*i, (int)*(x+i)));
  }
  xsb_dbgmsg((LOG_DEBUG, "Instr = %s ---code to run %s----",
	     (char *)inst_table[try_type_instr_fld(x)][0],
	     (char *)inst_table[code_to_run(x)][0] ));
}

/*----------------------------------------------------------------*/

BTNptr trie_asserted_trienode(CPtr clref) {
      if ((ClRefType(clref) == TRIE_CL) && clref_trie_asserted(clref))
	return((BTNptr)*(clref + 3));
      else return NULL;
}

/*----------------------------------------------------------------*/

int trie_assert(CTXTdecl)
{
  Cell Clause;
  Psc  psc;
  CPtr Prref;
#ifdef DEBUG_VERBOSE
  int  Arity;
#endif
  CPtr Trie_Asserted_Clref = NULL;
  BTNptr inst_node_ptr;
  int  found = 1;

  Clause = reg_term(CTXTc 1);
  psc    = (Psc)ptoc_int(CTXTc 2);
  Prref  = (CPtr)ptoc_int(CTXTc 4);

#ifdef DEBUG_VERBOSE
  Arity  = ptoc_int(CTXTc 3);
  xsb_dbgmsg((LOG_DEBUG,"Prref bytes\n"));
  if (cur_log_level >= LOG_DEBUG)
    print_bytes(Prref,-2,2);
  xsb_dbgmsg((LOG_DEBUG,"Clause :"));
  dbg_printterm(LOG_DEBUG,stddbg,Clause,24);
  xsb_dbgmsg((LOG_DEBUG," Arity %d ", Arity));
  xsb_dbgmsg((LOG_DEBUG," Psc   %d ",(int)psc));
  xsb_dbgmsg((LOG_DEBUG," Prref %d ",(int)Prref));
  xsb_dbgmsg((LOG_DEBUG,"\n"));
#endif

  Trie_Asserted_Clref = trie_asserted_clref(Prref);

  xsb_dbgmsg((LOG_ASSERT, " Trie_Asserted_Clref %p",Trie_Asserted_Clref));

  switch_to_trie_assert;
  SYS_MUTEX_LOCK( MUTEX_DYNAMIC );
  if(Trie_Asserted_Clref == NULL){
    /*
     * Allocate the trie node as in old trie assert: put it in a clref
     * block and pray.  See Note 1 below.
     */
    Trie_Asserted_Clref = ((CPtr)mem_alloc(6*sizeof(Cell),ASSERT_SPACE)) + 2;
    *(Trie_Asserted_Clref-2) = 6*sizeof(Cell)+TRIE_CL; /* store size, encode type */
    *(byte *)(Trie_Asserted_Clref +2) = jump;

    inst_node_ptr = newBasicTrie(CTXTc EncodeTriePSC(psc),ASSERT_TRIE_TT);
    Instr(inst_node_ptr) = trie_assert_inst;

    *(Trie_Asserted_Clref +3) = (Cell)inst_node_ptr;

    db_addbuff((byte)(get_arity(psc) + 1),(ClRef)Trie_Asserted_Clref,(PrRef)Prref,1,TRUE,2);
  }
  else
    inst_node_ptr = (BTNptr)*(Trie_Asserted_Clref +3);

  one_term_chk_ins(CTXTc (CPtr)Clause,inst_node_ptr,&found);
  SYS_MUTEX_UNLOCK( MUTEX_DYNAMIC );
  switch_from_trie_assert;	
  ctop_int(CTXTc 5,found);
  return TRUE;
}

/* 
   Note 1: In trie_assert, the ClRef is a dummy node, whose first cell
   is its buffer size (actually, only the size for the dummy ClRef),
   and whose second is the previous ClRef (0, since all info will be
   in the trie)

   ------------
   | BuffLength: 6*sizeof(Cell)+2  (??)
   ------------
   | Previous: 0
   ------------
   |         :                      <-- Trie_Asserted_Clref
   ------------
   |         : 
   ------------
   |         : jump
   ------------
   |         : inst_node_ptr
   ------------

   However, I dont presently know why 6 cells must be allocated?
 */
/*-----------------------------------------------------------------*/

int trie_retract(CTXTdecl)
{
  CPtr Clref;
  BTNptr inst_node_ptr;

  Clref = (CPtr)ptoc_int(CTXTc 1);
  if (Clref == NULL) {
    Last_Nod_Sav = NULL;
    return TRUE;
  }
  else if (Last_Nod_Sav == NULL) {
    xsb_dbgmsg((LOG_DEBUG,"Last_Nod_Sav is NULL "));
    return FALSE;
  }
  else {
    inst_node_ptr = (BTNptr)*(Clref +3);
    xsb_dbgmsg((LOG_DEBUG, " Deleting from Instrn Node %p",  inst_node_ptr ));
    xsb_dbgmsg((LOG_DEBUG, 
	       " Before: Child of Instrn Node %p", Child(inst_node_ptr)));
    switch_to_trie_assert;
    delete_branch(CTXTc Last_Nod_Sav, &(Child(inst_node_ptr)));
    switch_from_trie_assert;
    xsb_dbgmsg((LOG_DEBUG,
	       " After : Child of Instrn Node %p", Child(inst_node_ptr)));
    return TRUE;
  }
}

/*-----------------------------------------------------------------*/

/* Only mark the nodes in the branch as deleted. */

int trie_retract_safe(CTXTdecl)
{ 
  if (Last_Nod_Sav == NULL)
    return FALSE;
  else {
    safe_delete_branch(Last_Nod_Sav);
    return TRUE;
  }
}

