/* File:      cinterf.h
** Author(s): Jiyang Xu
** Contact:   xsb-contact@cs.sunysb.edu
** 
** Copyright (C) The Research Foundation of SUNY, 1986, 1993-1999
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
** $Id: cinterf.h,v 1.32 2006/07/02 18:36:28 tswift Exp $
** 
*/

#include "context.h"

#ifndef __XSB_CINTERF_H__
#define __XSB_CINTERF_H__

#ifdef __cplusplus
extern "C" {
#endif

#ifndef CELL_DEFS_INCLUDED
#include "cell_def_xsb.h"
#endif


/*
**  
**  XSB provides three different levels of C interfaces.
**  
**  (1) Minimal Interface
**  
**  This is a simple interface that can be described by the   
**  following specifications:
**  
**  	types:	reg_num ( integer)
**  		prolog_int ( int  on 32 bits architectures,
**  			     long on 64 bits architectures )
**  		prolog_float ( double )
**  
**  	functions:
**  	   Prolog (register) to C:
**  		ptoc_int:	reg_num -> prolog_int
**  		ptoc_float:	reg_num -> prolog_float
**  		ptoc_string:	reg_num -> string
**  	   C  to Prolog:
**  		ctop_int:	reg_num x prolog_int -> void
**  		ctop_float:	reg_num x prolog_float -> void
**  		ctop_string:	reg_num x string -> void
**  
**  The procedures assume correct modes and types being passed down by
**  Prolog level.
**  
**  (2) Low level interface
**  
**  Low level interface does not assume types and modes, and allows
**  user to access prolog term structures.
**  Both the minimal interface above and the high level interface below
**  can be implemented by this set of low level interface routines.
**  
**  	types:	prolog_term
**  		reg_num  ( integer )
**  
**  	functions:
**  	    Register to Prolog term:
**  		reg_term:	reg_num -> prolog_term
**  	    C to Prolog:		
**  		c2p_int:	prolog_int x prolog_term -> xsbBool
**  		c2p_float: 	prolog_float x prolog_term -> xsbBool
**  		c2p_string:	string x prolog_term -> xsbBool
**  		c2p_list: 	prolog_term -> xsbBool
**  		c2p_functor:	string x int x prolog_term -> xsbBool
**  		c2p_nil:	prolog_term -> xsbBool
**  		c2p_setfree:	prolog_term -> void  !! Dangerous
**  	    Prolog to C:
**  		p2c_int:	prolog_term -> prolog_int
**  		p2c_float:	prolog_term -> prolog_float
**  		p2c_string:	prolog_term -> string
**  		p2c_functor:	prolog_term -> string
**  		p2c_arity:	prolog_term -> int
**  	    Prolog to Prolog:
**  		p2p_arg:	prolog_term x int -> prolog_term
**  		p2p_car:	prolog_term -> prolog_term
**  		p2p_cdr:	prolog_term -> prolog_term
**  		p2p_new:	void -> prolog_term
**  		p2p_unify:	prolog_term x prolog_term -> xsbBool
**  		p2p_call:	prolog_term -> xsbBool
**   		p2p_funtrail:	val x fun -> void
**  		p2p_deref:	prolog_term -> prolog_term   !! uncommon
**  	    Type/Mode checking:
**  		is_var:		prolog_term -> xsbBool
**  		is_int:		prolog_term -> xsbBool
**  		is_float:	prolog_term -> xsbBool
**  		is_string:	prolog_term -> xsbBool
**  		is_list:	prolog_term -> xsbBool
**  		is_nil:		prolog_term -> xsbBool
**  		is_functor:	prolog_term -> xsbBool
**  
**  (3) High level Interface
**     This can be viewed as an extention of the minimal interface above.
**  
**  	types:	reg_num  ( integer )
**  		format ( string )
**  		caddr ( C data address )
**  		errno ( int )
**  
**  	functions:
**  		ctop_term:	format x caddr x reg_num -> errno
**  		ptoc_term:	format x caddr x reg_num -> errno
**  		c2p_term:	format x caddr x prolog_term -> errno
**  		p2c_term:	format x caddr x prolog_term -> errno
**  
**  where format (similar to that of printf/scanf) is a string controlling the 
**  the conversion. The interface is so general that you can even convert
**  recursive data structure between C and Prolog with a single function call.
**  The format is a string containing a format descriptor (fmt) which can
**  be of the following forms (fmts is a sequence of fmt; # is a digit in
**  0-9):
**  
**  	fmt			Prolog term type	C data type
**  	----------		----------------	-----------
**  	%i			integer			int
**  	%c			integer			char
**  	%f			float			float
**  	%d			float			double
**  	%s			constant		string
**  	%[fmts] 		structure		nested struct
**  	%t#(fmts)		structure		pointer to struct
**  	%l#(fmt fmt)		list			pointer to struct
**  	%#			recursive structure	pointer to struct
**  
**  (4) other facilities:
**  
**     type:  vfile (char *, opaque pointer)
**  
**  	vfile_open:  obj x v_fprintf x v_fclose x v_putc x v_getc 
**  			x v_ungetc -> vfile
**  	vfile_obj:  vfile -> obj		
**  		both file and obj are opaque pointers of type char*
*/

#include "basicdefs.h"
#include "basictypes.h"


/*======================================================================*/
/* High level C interface						*/
/*======================================================================*/

#include "export.h"
#include "varstring_xsb.h"

#define extern_ctop_abs(reg_num,val) ctop_abs(CTXTc reg_num,val) 
#define extern_ctop_float(reg_num, val) ctop_float(CTXTc reg_num, val) 
#define extern_ctop_int(reg_num,val) ctop_int(CTXTc reg_num,val) 

#define extern_ptoc_abs(reg_num) ptoc_abs(CTXTc reg_num) 
#define extern_ptoc_float(reg_num) ptoc_float(CTXTc reg_num) 
#define extern_ptoc_int(reg_num) ptoc_int(CTXTc reg_num) 
#define extern_ptoc_longstring(reg_num) ptoc_longstring(CTXTc reg_num) 
#define extern_ptoc_string(reg_num) ptoc_string(CTXTc reg_num) 

#define extern_c2p_chars(cstr, regs_to_protect, pterm) \
  c2p_chars(CTXTc cstr, regs_to_protect, pterm) 
#define extern_c2p_float(dbl, pterm)  c2p_float(CTXTc dbl, pterm)
#define extern_c2p_functor(functor,arity,var) \
  c2p_functor(CTXTc functor,arity,var)
#define extern_c2p_int(pint,pterm) c2p_int(CTXTc pint, pterm)
#define extern_c2p_list(var) c2p_list(CTXTc var)
#define extern_c2p_nil(var) c2p_nil(CTXTc var)
#define extern_c2p_string(val,var) c2p_string(CTXTc val,var)

#define extern_p2c_arity(term) p2c_arity(term)
#define extern_p2c_chars(term,cptr,pint) p2c_chars(CTXTc term,cptr,pint)
#define extern_p2c_float(term) p2c_float(term)
#define extern_p2c_functor(term) p2c_functor(term)
#define extern_p2c_int(term) p2c_int(term)
#define extern_p2c_string(term) p2c_string(term)

#define extern_p2p_arg(term,argno) p2p_arg(term,argno)
#define extern_p2p_car(term) p2p_car(term)
#define extern_p2p_cdr(term) p2p_cdr(term)
#define extern_p2p_deref(term) p2p_deref(term)
#define extern_p2p_new() p2p_new(CTXT)
#define extern_p2p_unify(term1, term2) p2p_unify(CTXTc term1, term2)

#define extern_print_pterm(Cell, int, VS) print_pterm(CTXTc Cell, int, VS)

#define extern_reg_term(regnum) reg_term(CTXTc regnum)

/*======================================================================*/

DllExport extern prolog_int call_conv ptoc_int(CTXTdeclc reg_num);	
						/* defined in builtin.c */
DllExport extern prolog_float call_conv ptoc_float(CTXTdeclc reg_num);
						/* defined in builtin.c */
DllExport extern char* call_conv ptoc_string(CTXTdeclc reg_num);
						/* defined in builtin.c */
DllExport extern char* call_conv ptoc_longstring(CTXTdeclc reg_num);
						/* defined in builtin.c */
DllExport extern char* call_conv ptoc_abs(reg_num);

DllExport extern void  call_conv ctop_int(CTXTdeclc reg_num, prolog_int);
						/* defined in builtin.c */
DllExport extern void  call_conv ctop_float(CTXTdeclc reg_num, double);
						/* def in builtin.c */
DllExport extern void  call_conv ctop_string(CTXTdeclc reg_num, char*);
						/* def in builtin.c */
DllExport extern void  call_conv extern_ctop_string(CTXTdeclc reg_num, char*);
						/* def in builtin.c */
DllExport extern int   call_conv ctop_abs(reg_num, char*);

extern char* string_find(char*, int);		/* defined in psc.c	*/

extern int   ctop_term(CTXTdeclc char*, char*, reg_num);
extern int   ptoc_term(CTXTdeclc char*, char*, reg_num);

/*======================================================================*/
/* Low level C interface						*/
/*======================================================================*/


DllExport extern prolog_term call_conv reg_term(CTXTdeclc reg_num);

DllExport extern xsbBool call_conv c2p_int(CTXTdeclc prolog_int, prolog_term);
DllExport extern xsbBool call_conv c2p_float(CTXTdeclc double, prolog_term);
DllExport extern xsbBool call_conv c2p_string(CTXTdeclc char *, prolog_term);
DllExport extern xsbBool call_conv c2p_list(CTXTdeclc prolog_term);
DllExport extern xsbBool call_conv c2p_nil(CTXTdeclc prolog_term);
DllExport extern void call_conv ensure_heap_space(CTXTdeclc int, int);
DllExport extern xsbBool call_conv c2p_functor(CTXTdeclc char *, int, prolog_term);
DllExport extern void call_conv c2p_setfree(prolog_term);
DllExport extern void call_conv c2p_chars(CTXTdeclc char *str, int regs_to_protect, prolog_term term);


DllExport extern prolog_int   call_conv p2c_int(prolog_term);
DllExport extern double   call_conv p2c_float(prolog_term);
DllExport extern char*    call_conv p2c_string(prolog_term);
DllExport extern char*    call_conv p2c_functor(prolog_term);
DllExport extern int      call_conv p2c_arity(prolog_term);
DllExport extern char*    call_conv p2c_chars(CTXTdeclc prolog_term,char *,int);

DllExport extern prolog_term call_conv p2p_arg(prolog_term, int);
DllExport extern prolog_term call_conv p2p_car(prolog_term);
DllExport extern prolog_term call_conv p2p_cdr(prolog_term);
DllExport extern prolog_term call_conv p2p_new(CTXTdecl);
DllExport extern xsbBool        call_conv p2p_unify(CTXTdeclc prolog_term, prolog_term);
DllExport extern xsbBool        call_conv p2p_call(prolog_term);
DllExport extern void	     call_conv p2p_funtrail(/*val, fun*/);
DllExport extern prolog_term call_conv p2p_deref(prolog_term);

DllExport extern xsbBool call_conv is_var(prolog_term);
DllExport extern xsbBool call_conv is_int(prolog_term);
DllExport extern xsbBool call_conv is_float(prolog_term);
DllExport extern xsbBool call_conv is_string(prolog_term);
DllExport extern xsbBool call_conv is_atom(prolog_term);
DllExport extern xsbBool call_conv is_list(prolog_term);
DllExport extern xsbBool call_conv is_nil(prolog_term);
DllExport extern xsbBool call_conv is_functor(prolog_term);
DllExport extern xsbBool call_conv is_charlist(prolog_term,int*);
DllExport extern xsbBool call_conv is_attv(prolog_term);

extern int   c2p_term(CTXTdeclc char*, char*, prolog_term);
extern int   p2c_term(CTXTdeclc char*, char*, prolog_term);

/*======================================================================*/
/* Other utilities							*/
/*======================================================================*/

typedef char *vfile;

extern char *vfile_open(/* vfile, func, func, func, func, func */);
extern char *vfile_obj(/* vfile */);

/*======================================================================*/
/* Routines to call xsb from C						*/
/*======================================================================*/

DllExport extern int call_conv xsb_init(CTXTdeclc int, char **);
DllExport extern int call_conv xsb_init_string(CTXTdeclc char *);
DllExport extern int call_conv xsb_command(CTXTdecl);
DllExport extern int call_conv xsb_command_string(CTXTdeclc char *);
DllExport extern int call_conv xsb_query(CTXTdecl);
DllExport extern int call_conv xsb_query_string(CTXTdeclc char *);
DllExport extern int call_conv xsb_query_string_string(CTXTdeclc char*,VarString*,char*);
DllExport extern int call_conv xsb_query_string_string_b(CTXTdeclc char*,char*,int,int*,char*);
DllExport extern int call_conv xsb_next(CTXTdecl);
DllExport extern int call_conv xsb_next_string(CTXTdeclc VarString*,char*);
DllExport extern int call_conv xsb_next_string_b(CTXTdeclc char*,int,int*,char*);
DllExport extern int call_conv xsb_get_last_answer_string(CTXTdeclc char*,int,int*);
DllExport extern int call_conv xsb_close_query(CTXTdecl);
DllExport extern int call_conv xsb_close(CTXTdecl);
DllExport extern int call_conv xsb_get_last_error_string(char*,int,int*);

DllExport extern void call_conv print_pterm(CTXTdeclc Cell, int, VarString*);
extern char *p_charlist_to_c_string(CTXTdeclc prolog_term term, VarString *buf,
				    char *in_func, char *where);

/* macros for constructing answer terms and setting and retrieving atomic
values in them. To pass or retrieve complex arguments, you must use
the lower-level ctop_* routines directly. */

/* build an answer term of arity i in reg 2 */
#define xsb_make_vars(i)   c2p_functor("ret",i,reg_term(2))

/* set argument i of answer term to integer value v, for filtering */
#define xsb_set_var_int(v,i) c2p_int(v,p2p_arg(reg_term(2),i))

/* set argument i of answer term to atom value s, for filtering */
#define xsb_set_var_string(s,i) c2p_string(s,p2p_arg(reg_term(2),i))

/* set argument i of answer term to atom value f, for filtering */
#define xsb_set_var_float(f,i) c2p_float(f,p2p_arg(reg_term(2),i))


/* return integer argument i of answer term */
#define xsb_var_int(i) (p2c_int(p2p_arg(reg_term(2),i)))

/* return string (atom) argument i of answer term */
#define xsb_var_string(i) (p2c_string(p2p_arg(reg_term(2),i)))

/* return float argument i of answer term */
#define xsb_var_float(i) (p2c_float(p2p_arg(reg_term(2),i)))

#ifdef __cplusplus
}
#endif

#endif /* __XSB_CINTERF_H__ */
