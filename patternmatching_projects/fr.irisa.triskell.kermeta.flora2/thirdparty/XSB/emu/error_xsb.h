/* File:      error_xsb.h
** Author(s): Kostis F. Sagonas
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
** $Id: error_xsb.h,v 1.28 2006/05/31 21:28:09 crojo Exp $
** 
*/

#include "basictypes.h"
#include "setjmp_xsb.h"
#include "export.h"
#include "context.h"
#include "psc_xsb.h"

/*----------------------------------------------------------------------*/
/* The following is a list of errors as defined by the Prolog ISO	*/
/* standard.  It is clear that today (October 1993), XSB does NOT	*/
/* catch all of them.  In fact it does not even report half of them.	*/
/* However, one fine day it might!  The following list tries to become	*/
/* a first step towards the uniform treatment of errors by XSB.		*/
/*----------------------------------------------------------------------*/

#define CALCULATION	 0
#define DATABASE	 1
#define EVALUATION	 2
#define IMPLEMENTATION	 3
#define INSTANTIATION	 4
#define IO_CONTROL	 5
#define IO_END_OF_FILE	 6
#define IO_FORMATTING	 7
#define OPERATOR	 8
#define XSBOVERFLOW	 9  /* renamed from OVERFLOW. This def isn't used, but
			       OVERFLOW clashes with some C compilers */
#define RANGE		10
#define SYNTAX		11
#define TYPE		12
#define UNDEFINED_PRED	13
#define UNDEFINED_VAL	14
#define XSBUNDERFLOW	15  /* renamed from UNDERFLOW. This def isn't used, but
			       UNDERFLOW clashes with some C compilers */
#define ZERO_DIVIDE	16 

/* TLS: used for determing the offset of a putpvar + call so that
   the pc register can be saved so that the proper choice point can be
   (in a necessarily roundabout manner) determined. 
*/
#ifdef BITS64
#define THROWPAD 24
#else 
#define THROWPAD 12
#endif 


DllExport extern void call_conv xsb_exit(char *, ...);
DllExport extern void call_conv exit_xsb(char *);

DllExport extern void call_conv xsb_abort(char *, ...);
DllExport extern void call_conv abort_xsb(char *);

DllExport extern void call_conv xsb_bug(char *, ...);
DllExport extern void call_conv bug_xsb(char *);
void call_conv xsb_basic_abort(char *);

DllExport extern void call_conv xsb_warn(char *, ...);
DllExport extern void call_conv warn_xsb(char *);

DllExport extern void call_conv xsb_mesg(char *, ...);
DllExport extern void call_conv mesg_xsb(char *);

DllExport extern void call_conv xsb_error(char *, ...);
DllExport extern void call_conv error_xsb(char *);

DllExport extern void call_conv xsb_dbgmsg1(int, char *, ...);
DllExport extern void call_conv dbgmsg1_xsb(int, char *);

extern void arithmetic_abort1(CTXTdeclc char *, Cell);
extern void arithmetic_abort(CTXTdeclc Cell, char *, Cell);
extern void arithmetic_comp_abort(CTXTdeclc Cell, char *, int);
extern void err_handle(CTXTdeclc int, int, char *, int, char *, Cell);

extern FILE *stdmsg;	    	/* Stream for XSB messages     	         */
extern FILE *stdwarn;	    	/* Stream for XSB warnings     	         */
extern FILE *stddbg;	    	/* Stream for XSB debugging msgs         */
extern FILE *stdfdbk;	    	/* Stream for XSB feedback msgs         */

#define err(d, a, f, ar)	err_handle(CTXTc d, a, f, ar, NULL, (Cell)NULL)

extern char *xsb_default_segfault_msg;

extern char *xsb_segfault_message; /* Put your segfault message here prior to
				      executing the command that might
				      segfault. Then restore it to
				      xsb_default_segfault_message */ 

extern void (*xsb_default_segfault_handler)(int); /* where the previous value
						     of the SIGSEGV handler is
						     saved */ 

extern int print_xsb_backtrace(CTXTdecl);

/* SIGSEGV handler that catches segfaults; used unless configured with DEBUG */
extern void xsb_segfault_catcher (int);
extern void xsb_segfault_quitter(int);

int unwind_stack(CTXTdecl);

void call_conv xsb_domain_error(CTXTdeclc char *, Cell, char *, int, int) ;
void call_conv xsb_existence_error(CTXTdeclc char *,Cell, char *,int, int) ;
void call_conv xsb_instantiation_error(CTXTdeclc char *, int, int, char *) ;
void call_conv xsb_permission_error(CTXTdeclc char *,char *,Cell,char *,int) ;
void call_conv xsb_resource_error(CTXTdeclc char *,char *, int) ;
void call_conv xsb_resource_error_nopred(CTXTdeclc char *,char *) ;
void call_conv xsb_table_error(CTXTdeclc char *) ;
void call_conv xsb_type_error(CTXTdeclc char *,Cell , char *,int, int) ;

extern void call_conv xsb_memory_error(char *, char *);

DllExport void call_conv xsb_throw(CTXTdeclc prolog_term, unsigned long);

extern prolog_term build_xsb_backtrace(CTXTdecl);
