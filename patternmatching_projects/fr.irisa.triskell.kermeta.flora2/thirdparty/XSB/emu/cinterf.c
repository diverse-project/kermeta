/* File:      cinterf.c
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
** $Id: cinterf.c,v 1.66 2006/05/05 21:38:02 dwarren Exp $
** 
*/

#include "xsb_config.h"
#include "xsb_debug.h"

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#if !defined(WIN_NT) || defined(CYGWIN)
#include <unistd.h>
#endif
#include <errno.h>

#include "auxlry.h"
#include "cell_xsb.h"
#include "memory_xsb.h"
#include "register.h"
#include "psc_xsb.h"
#include "flags_xsb.h"
#include "deref.h"
#include "heap_xsb.h"
#include "binding.h"
#include "tries.h"
#include "choice.h"
#include "subp.h"
#include "emuloop.h"
#include "cinterf.h"
#include "error_xsb.h"
#include "orient_xsb.h"
#include "loader_xsb.h"
#include "context.h"

/*
  This was the old test for being a kosher Prolog string
#define PRINTABLE_OR_ESCAPED_CHAR(Ch) (Ch <= 255 || Ch >= 0)
*/
#define PRINTABLE_OR_ESCAPED_CHAR(Ch) \
  ((Ch >= (int)' ' && Ch <= (int)'~') || (Ch >= (int)'\a' && Ch <= (int)'\r'))

/* the following really belongs somewhere else */
extern char *expand_filename(char *);
extern void xsb_sprint_variable(CTXTdeclc char *sptr, CPtr var);


char *p_charlist_to_c_string(CTXTdeclc prolog_term term, VarString *buf,
			     char *in_func, char *where);
void c_string_to_p_charlist(CTXTdeclc char *name, prolog_term list,
			    int regs_to_protect, char *in_func, char *where);

/*======================================================================*/
/* Low level C interface						*/
/*======================================================================*/

DllExport xsbBool call_conv is_var(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isref(t);
}

DllExport xsbBool call_conv is_int(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return (isinteger(t) | isboxedinteger(t));
}

DllExport xsbBool call_conv is_float(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isofloat(t);
}

DllExport xsbBool call_conv is_string(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isstring(t);
}

DllExport xsbBool call_conv is_atom(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isatom(t);
}

DllExport xsbBool call_conv is_list(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return islist(t);
}

DllExport xsbBool call_conv is_nil(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isnil(t);
}

DllExport xsbBool call_conv is_functor(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isconstr(t);
}

DllExport xsbBool call_conv is_attv(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return isattv(t);
}

DllExport prolog_term call_conv reg_term(CTXTdeclc reg_num regnum)
{
    register Cell addr;

    addr = cell(reg+regnum);
    XSB_Deref(addr);
    return (prolog_term)addr;
}

DllExport xsbBool call_conv c2p_int(CTXTdeclc Integer val, prolog_term var)
{
    Cell v = (Cell)var;
    if (is_var(v)) {
      bind_oint(vptr(v), val);
      return TRUE;
    } else {
      xsb_warn("[C2P_INT] Argument 2 must be a variable");
      return FALSE;
    }
}

DllExport xsbBool call_conv c2p_float(CTXTdeclc double val, prolog_term var)
{
    Cell v = (Cell)var;
    if (is_var(v)) {
	bind_boxedfloat(vptr(v), (Float)(val));
	return TRUE;
    } else {
	xsb_warn("[C2P_FLOAT] Argument 2 must be a variable");
	return FALSE;
    }
}

DllExport xsbBool call_conv c2p_string(CTXTdeclc char *val, prolog_term var)
{
    Cell v = (Cell)var;
    if (is_var(v)) {
	bind_string(vptr(v), (char *)string_find(val, 1));
	return TRUE;
    } else {
	xsb_warn("[C2P_STRING] Argument 2 must be a variable");
	return FALSE;
    }
}

DllExport xsbBool call_conv c2p_list(CTXTdeclc prolog_term var)
{
    Cell v = (Cell)var;
    if (is_var(v)) {
	sreg = hreg;
	new_heap_free(hreg);
	new_heap_free(hreg);
	bind_list(vptr(v), sreg);
	return TRUE;
    } else {
	xsb_warn("[C2P_LIST] Argument must be a variable");
	return FALSE;
    }
}

DllExport xsbBool call_conv c2p_nil(CTXTdeclc prolog_term var)
{
    Cell v = (Cell)var;
    if (is_var(v)) {
       bind_nil(vptr(v));
       return TRUE;
    } else {
	xsb_warn("[C2P_NIL] Argument must be a variable");
	return FALSE;
    }
}

DllExport void call_conv c2p_setfree(prolog_term var)
{
    CPtr v = (CPtr)var;
    bld_free(v);
}

/* space is space in words required; regcnt is number of registers to protect */
DllExport void call_conv ensure_heap_space(CTXTdeclc int space, int regcnt) {
  check_glstack_overflow(regcnt,pcreg,space);
}

DllExport xsbBool call_conv c2p_functor(CTXTdeclc char *functor, int arity, 
					prolog_term var)
{
    Cell v = (Cell)var;
    Pair sym;
    int i;
    if (is_var(v)) {
	sym = (Pair)insert(functor, (byte)arity, (Psc)flags[CURRENT_MODULE], &i);
	sreg = hreg;
	hreg += arity + 1;
	bind_cs(vptr(v), sreg);
	new_heap_functor(sreg, sym->psc_ptr);
	for (i=0; i<arity; sreg++,i++) { bld_free(sreg); }
	return TRUE;
    } else {
	xsb_warn("[C2P_FUNCTOR] Argument 3 must be a variable");
	return FALSE;
    }
}

DllExport Integer call_conv p2c_int(prolog_term term)
{
    Cell t = (Cell)term;
    return oint_val(t);
}

DllExport double call_conv p2c_float(prolog_term term)
{
    Cell t = (Cell)term;
    return (double)(ofloat_val(t));
}

DllExport char* call_conv p2c_string(prolog_term term)
{
    Cell t = (Cell)term;
    return string_val(t);
}

DllExport char* call_conv p2c_functor(prolog_term term)
{
    Cell t = (Cell)term;
    return get_name(get_str_psc(t));
}

DllExport int call_conv p2c_arity(prolog_term term)
{
    Cell t = (Cell)term;
    return get_arity(get_str_psc(t));
}

DllExport prolog_term call_conv p2p_arg(prolog_term term, int argno)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    t = cell(clref_val(t)+argno);
    XSB_Deref(t);
    return (prolog_term)t;
}

DllExport prolog_term call_conv p2p_car(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    t = cell(clref_val(t));
    XSB_Deref(t);
    return (prolog_term)t;
}

DllExport prolog_term call_conv p2p_cdr(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    t = cell(clref_val(t)+1);
    XSB_Deref(t);
    return (prolog_term)t;
}

DllExport prolog_term call_conv p2p_new(CTXTdecl)
{
    CPtr t = hreg;
    new_heap_free(hreg);
    return (prolog_term)(cell(t));
}

DllExport xsbBool call_conv p2p_unify(CTXTdeclc prolog_term term1, prolog_term term2)
{
    return unify(CTXTc term1, term2);
}

DllExport prolog_term call_conv p2p_deref(prolog_term term)
{
    Cell t = (Cell)term;
    XSB_Deref(t);
    return (prolog_term)t;
}


/* convert Arg 1 -- prolog list of characters (a.k.a. prolog string) into C
   string and return this string. A character is an integer 1 through 255
   (i.e., not necessarily printable)
   Arg 2: ptr to string buffer where the result is to be returned.
          Space for this buffer must already be allocated.
   Arg 3: which function was called from.
   Arg 4: where in the call this happened.
   Args 3 and 4 are used for error reporting.
   This function converts escape sequences in the Prolog string
   (except octal/hexadecimal escapes) into the corresponding real characters.
*/
char *p_charlist_to_c_string(CTXTdeclc prolog_term term, VarString *buf,
			     char *in_func, char *where)
{
  Integer head_val;
  char head_char[1];
  int escape_mode=FALSE;
  prolog_term list = term, list_head;

  if (!is_list(list) && !is_nil(list)) {
    xsb_abort("[%s] %s is not a list of characters", in_func, where);
  }

  XSB_StrSet(buf, "");

  while (is_list(list)) {
    if (is_nil(list)) break;
    list_head = p2p_car(list);
    if (!is_int(list_head)) {
      xsb_abort("[%s] A Prolog string (a character list) expected, %s",
		in_func, where);
    }
    head_val = int_val(list_head);
    if (! PRINTABLE_OR_ESCAPED_CHAR(head_val) ) {
      xsb_abort("[%s] A Prolog string (a character list) expected, %s",
		in_func, where);
    }

    *head_char = (char) head_val;
    /* convert ecape sequences */
    if (escape_mode)
      switch (*head_char) {
      case 'a':
	XSB_StrAppendBlk(buf, "\a", 1);
	break;
      case 'b':
	XSB_StrAppendBlk(buf, "\b", 1);
	break;
      case 'f':
	XSB_StrAppendBlk(buf, "\f", 1);
	break;
      case 'n':
	XSB_StrAppendBlk(buf, "\n", 1);
	break;
      case 'r':
	XSB_StrAppendBlk(buf, "\r", 1);
	break;
      case 't':
	XSB_StrAppendBlk(buf, "\t", 1);
	break;
      case 'v':
	XSB_StrAppendBlk(buf, "\v", 1);
	break;
      default:
	XSB_StrAppendBlk(buf, head_char, 1);
      }
    else
      XSB_StrAppendBlk(buf, head_char, 1);

    if (*head_char == '\\' && !escape_mode) {
      escape_mode = TRUE;
      buf->length--; /* backout the last char */
    }
    else {
      escape_mode = FALSE;
    }
    list = p2p_cdr(list);
  } /* while */

  XSB_StrNullTerminate(buf);

  return (buf->string);
}


/* convert a C string into a prolog list of characters. 
   (codelist might be a better suffix.)
   LIST must be a Prolog variable. IN_FUNC is a string that should indicate the
   high-level function from this c_string_to_p_charlist was called.
   regs_to_protect is the number of registers with values (needed for stack expansion)
   WHERE is another string with additional info. These two are used to provide
   informative error messages to the user. */
void c_string_to_p_charlist(CTXTdeclc char *name, prolog_term list,
			    int regs_to_protect, char *in_func, char *where)
{
  Cell new_list;
  CPtr top = 0;
  int len=strlen(name), i;

  if (isnonvar(list)) {
    xsb_abort("[%s] A variable expected, %s", in_func, where);
  }
  if (len == 0) {
    bind_nil((CPtr)(list));
  } else {
    check_glstack_overflow(regs_to_protect, pcreg, 2*len*sizeof(Cell));
    new_list = makelist(hreg);
    for (i = 0; i < len; i++) {
      follow(hreg++) = makeint(*(unsigned char *)name);
      name++;
      top = hreg++;
      follow(top) = makelist(hreg);
    } follow(top) = makenil;
    unify(CTXTc list, new_list);
  } 
}


/* The following function checks if a given term is a prolog string of
   printable characters.
   It also counts the size of the list.
   It deals with the same escape sequences as p_charlist_to_c_string.
*/

DllExport xsbBool call_conv is_charlist(prolog_term term, int *size)
{
  int escape_mode=FALSE, head_char;
  prolog_term list, head;

  list = term;
  *size = 0;
  
  /* apparently, is_nil can be true and is_list false?? */
  if(is_nil(list))
    return TRUE;

  if (!is_list(list)) 
    return FALSE;

  while (is_list(list)) {
    if (is_nil(list)) break;

    head = p2p_car(list);
    if (!is_int(head)) 
      return FALSE;
    
    head_char = (char) int_val(head);
    /* ' ' is the lowest printable ascii and '~' is the highest */
    if (! PRINTABLE_OR_ESCAPED_CHAR(head_char) )
      return FALSE;

    if (escape_mode)
      switch (head_char) {
      case 'a':
      case 'b':
      case 'f':
      case 'n':
      case 'r':
      case 't':
      case 'v':
	(*size)++;
	escape_mode=FALSE;
	break;
      default:
	(*size) += 2;
      }
    else
      if (head_char == '\\') 
	escape_mode = TRUE;
      else
	(*size)++;
    list = p2p_cdr(list);
  }
  return TRUE;
}

/* the following two functions were introduced by Luis Castro */
/* they extend the c interface to allow for an easy interface for 
lists of characters */

DllExport char *call_conv p2c_chars(CTXTdeclc prolog_term term, char *buf, int bsize)
{
  XSB_StrDefine(bufvar);

  p_charlist_to_c_string(CTXTc term, &bufvar, "p2c_chars", "list -> char*");
  
  if (strlen(bufvar.string) > (size_t) bsize) {
    xsb_abort("Buffer overflow in p2c_chars");
  }

  return strcpy(buf,bufvar.string);
}

DllExport void call_conv c2p_chars(CTXTdeclc char *str, int regs_to_protect, prolog_term term)
{
  c_string_to_p_charlist(CTXTc str,term,regs_to_protect,"c2p_chars", "char* -> list");
}


/*
** Constaints and internal data structures
**
*/

#include "setjmp_xsb.h"

static char *c_dataptr_rest;

#ifndef MULTI_THREAD
static jmp_buf cinterf_env;
#endif

/*
** procedure cppc_error
**
*/

static void cppc_error(CTXTdeclc int num)
{
    longjmp(cinterf_env, num);
}

/*
** procedure skip_subfmt
**
*/

static char *skip_subfmt(CTXTdeclc char *ptr, char quote)
{
    while (*ptr) {
	if (*ptr == quote) return ++ptr;
	else if (*ptr == '[') ptr = skip_subfmt(CTXTc ++ptr, ']');
	else if (*ptr == '(') ptr = skip_subfmt(CTXTc ++ptr, ')');
	else ptr++;
    }
    cppc_error(CTXTc 6);
    return ptr;	/* never reach here */
}

/*
** procedure count_arity
**
** count Prolog term size (arity). Ignored fields are not counted
*/

static int count_arity(CTXTdeclc char *ptr, int quote)
{
    int arity = 0;

    while (*ptr && arity <= MAX_ARITY) {
	if (*ptr == quote) return arity;
	else if (*ptr == '%') {
	    if (*(++ptr)!='*') arity++;
	} else if (*ptr == '[') ptr = skip_subfmt(CTXTc ++ptr, ']');
	else if (*ptr == '(') ptr = skip_subfmt(CTXTc ++ptr, ')');
	else ptr++;
    }
    cppc_error(CTXTc 5);
    return -1;	/* never reach here */
}

/*
** procedure count_fields
**
** count number of fields in the primary structure.
** should be the same as arity + ignored fields.
*/

static int count_fields(CTXTdeclc char *ptr, int quote)
{
    int fields = 0;

    while (*ptr && fields <= MAX_ARITY) {
	if (*ptr == quote) return fields;
	else if (*ptr == '%') { fields++; ptr++; }
	else if (*ptr == '[') ptr = skip_subfmt(CTXTc ++ptr, ']');
	else if (*ptr == '(') ptr = skip_subfmt(CTXTc ++ptr, ')');
	else ptr++;
    }
    cppc_error(CTXTc 5);
    return -1;	/* never reach here */
}

/*
** procedure count_csize
**
** count C struct size (number of bytes). Ignored fields are also counted
*/

static int count_csize(CTXTdeclc char *ptr, int quote)
{
    int size = 0;

    while (*ptr) {
	if (*ptr == quote) return size;
	else if (*ptr == '%') {
	    if (*(++ptr)=='*') ptr++;
	    switch (*ptr) {
		case 'f': size += sizeof(float); ptr++; break;
		case 'd': size += sizeof(double); ptr++; break;
		case 'i': size += sizeof(int); ptr++; break;
		case 'c': size += 1; ptr++; break;
		case 's': size += sizeof(char *); ptr++; break;
		case 'z': ptr++; size += 4 * (*ptr-'0'); ptr++; break;
		case 't': size += sizeof(int *);
		    ptr += 2;
		    skip_subfmt(CTXTc ptr, ')');
		    break;
		case 'l': size += sizeof(int *);
		    ptr += 2;
		    skip_subfmt(CTXTc ptr, ')');
		    break;
		case '[': 
		    size += count_csize(CTXTc ++ptr, ']');
		    skip_subfmt(CTXTc ptr, ']');
		    break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		    size += sizeof(int *); ptr++; break;
		default: cppc_error(CTXTc 7); break;
	    }
	}
    }
    cppc_error(CTXTc 8);
    return -1;	/* never reach here */
}

/*
** procedure ctop_term0
**
*/

static char *ctop_term0(CTXTdeclc char *ptr, char *c_dataptr, char **subformat,
			prolog_term variable, int ignore)
{
    char ch;
    int fmtnum;
    char *cdptr2;
    int  argno, fields, i;
    int ignore1;

    if (*ptr++!= '%') cppc_error(CTXTc 1);
    ch = *ptr++;
    if (ch=='*') ch = *ptr++;
    switch (ch) {
	case 'i':			/* int */
	
	if (!ignore) c2p_int(CTXTc *((int *)(c_dataptr)), variable);
	c_dataptr_rest = c_dataptr + sizeof(int);
	break;

	case 'c':

	if (!ignore) c2p_int(CTXTc (int)(*(char *)(c_dataptr)), variable);
	c_dataptr_rest = c_dataptr + 1;
	break;

	case 's':

	if (!ignore) c2p_string(CTXTc *(char **)(c_dataptr), variable);
	c_dataptr_rest = c_dataptr + sizeof(char*);
	break;

	case 'z':

	if (!ignore) c2p_string(CTXTc c_dataptr, variable);
	ch = *ptr++;
	c_dataptr_rest = c_dataptr + (ch -'0')*4;
	break;

	case 'f':

	if (!ignore) c2p_float(CTXTc (double)(*((float *)(c_dataptr))), variable);
	c_dataptr_rest = c_dataptr + sizeof(float);
	break;

	case 'd':

	if (!ignore) c2p_float(CTXTc *((double *)(c_dataptr)), variable);
	c_dataptr_rest = c_dataptr + sizeof(double);
	break;

	case '[':

	fields = count_fields(CTXTc ptr, ']');
	if (!ignore) {
	    argno = count_arity(CTXTc ptr, ']');
	    if (!is_functor(variable)) c2p_functor(CTXTc "c2p", argno, variable);
	}
	argno = 0;
	for (i = 1; i <= fields; i++) {
	    if (*(ptr+1)=='*') ignore1 = 1;
	    else { ignore1 = ignore; argno++; }
	    ptr = ctop_term0(CTXTc ptr,c_dataptr,subformat,p2p_arg(variable,argno),ignore1);
	    c_dataptr = c_dataptr_rest;
	}
	ptr = skip_subfmt(CTXTc ptr, ']');
	break;

	case 't':

	if (!ignore) {
	    if (*(char **)(c_dataptr)) {
		fmtnum = (int)(*ptr-'0');
		subformat[fmtnum] = ptr-2;
		ptr++;
		if (*(ptr++) !='(') cppc_error(CTXTc 2);
		argno = count_arity(CTXTc ptr, ')');
		fields = count_fields(CTXTc ptr, ')');
		if (!is_functor(variable)) c2p_functor(CTXTc "c2p", argno, variable);
		cdptr2 = * (char **)(c_dataptr);
		argno = 0;
		for (i = 1; i <= fields; i++) {
		    if (*(ptr+1)=='*') ignore = 1;
		    else { ignore = 0; argno++; }
		    ptr = ctop_term0(CTXTc ptr,cdptr2,subformat,p2p_arg(variable,argno),ignore);
		    cdptr2 = c_dataptr_rest;
		}
	    } else c2p_nil(CTXTc variable);
	}
	ptr = skip_subfmt(CTXTc ptr, ')');
	c_dataptr_rest = c_dataptr + 4;
	break;

	case 'l':
	if (!ignore) {
	    if (*(char **)(c_dataptr)) {
		fmtnum = (int)(*ptr-'0');
		subformat[fmtnum] = ptr-2;
		ptr++;
		if (*(ptr++) != '(') cppc_error(CTXTc 3);
		argno = count_arity(CTXTc ptr, ')');
		fields = count_fields(CTXTc ptr, ')');
		if (!is_list(variable)) c2p_list(CTXTc variable);
		cdptr2 = * (char **)(c_dataptr);
		argno = 0;
		for (i = 1; i <= fields; i++) {
		    if (*(ptr+1)=='*') ignore = 1;
		    else { ignore = 0; argno++; }
		    if (argno==1) 
		       ptr = ctop_term0(CTXTc ptr,cdptr2,subformat,p2p_car(variable),ignore);
		    else if (argno==2)
		       ptr = ctop_term0(CTXTc ptr,cdptr2,subformat,p2p_cdr(variable),ignore);
		    else if (argno==0)
		       ptr = ctop_term0(CTXTc ptr,cdptr2,subformat,p2p_car(variable),ignore);
		       /* always ignored */
		    else cppc_error(CTXTc 30);
		    cdptr2 = c_dataptr_rest;
		}
	    } else c2p_nil(CTXTc variable);
	}
	ptr = skip_subfmt(CTXTc ptr, ')');
	c_dataptr_rest = c_dataptr + 4;
	break;

	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':

	if (!ignore) {
	    if (*(char **)(c_dataptr)) {
		ctop_term0(CTXTc subformat[ch-'0'], c_dataptr, subformat,variable, 0);
	    } else c2p_nil(CTXTc variable);
	}
	c_dataptr_rest = c_dataptr + 4;
	break;

	default: cppc_error(CTXTc 4);
    }
    return ptr;
}

/*
** procedure ptoc_term0
**
*/

static char *ptoc_term0(CTXTdeclc char *ptr, char *c_dataptr, char **subformat,
			prolog_term variable, int ignore)
{
    char ch;
    int fmtnum;
    char *cdptr2;
    int  argno, fields, i, size;
    int ignore1;

    if (*ptr++!= '%') cppc_error(CTXTc 9);
    ch = *ptr++;
    if (ch=='*') ch = *ptr++;
    switch (ch) {
	case 'i':			/* int */

	if (!ignore) {
	    if (is_int(variable)) *((int *)(c_dataptr)) = p2c_int(variable);
	    else cppc_error(CTXTc 10);
	}
	c_dataptr_rest = c_dataptr + sizeof(int);
	break;

	case 'c':

	if (!ignore) {
	    if (is_int(variable)) *((char *)(c_dataptr)) = 
	       (char)p2c_int(variable);
	    else cppc_error(CTXTc 11);
	}
	c_dataptr_rest = c_dataptr + 1;
	break;

	case 's':

	if (!ignore) {
	    if (is_string(variable)) *((char **)(c_dataptr)) =
	       p2c_string(variable);		/* should make a copy??? */
	    else cppc_error(CTXTc 12);
	}
	c_dataptr_rest = c_dataptr + 4;
	break;

	case 'z':

	ch = *ptr++;
	size = 4 * (ch - '0');
	if (!ignore) {
	    if (is_string(variable)) 
	       strncpy(c_dataptr, p2c_string(variable), size);
	    else cppc_error(CTXTc 12);
	}
	c_dataptr_rest = c_dataptr + size;
	break;

	case 'f':

	if (!ignore) {
	    if (is_float(variable)) 
	      *((float *)(c_dataptr)) = (float)p2c_float(variable);
	    else cppc_error(CTXTc 13);
	}
	c_dataptr_rest = c_dataptr + sizeof(float);
	break;

	case 'd':

	if (!ignore) {
	    if (is_float(variable)) *((double *)(c_dataptr)) =
	       p2c_float(variable);
	    else cppc_error(CTXTc 14);
	}
	c_dataptr_rest = c_dataptr + sizeof(double);
	break;

	case '[':

	fields = count_fields(CTXTc ptr, ']');
	argno = 0;
	for (i = 1; i <= fields; i++) {
	    if (*(ptr+1)=='*') ignore1 = 1;
	    else { ignore1 = ignore; argno++; }
	    ptr = ptoc_term0(CTXTc ptr, c_dataptr,subformat,p2p_arg(variable,argno),ignore1);
	    c_dataptr = c_dataptr_rest;
	}
	ptr = skip_subfmt(CTXTc ptr, ']');
	break;

	case 't':

	if (!ignore) {
	    fmtnum = (int)(*ptr-'0');
	    subformat[fmtnum] = ptr-2;
	    ptr++;
	    if (*(ptr++) != '(') cppc_error(CTXTc 15);
	    fields = count_fields(CTXTc ptr, ')');
	    size = count_csize(CTXTc ptr, ')');
	    cdptr2 = (char *)mem_alloc(size,OTHER_SPACE);  /* leak */
	    *((char **)c_dataptr) = cdptr2;
	    argno = 0;
	    for (i = 1; i <= fields; i++) {
		if (*(ptr+1)=='*') ignore = 1;
		else { ignore = 0; argno++; }
		ptr = ptoc_term0(CTXTc ptr,cdptr2,subformat,p2p_arg(variable,argno),ignore);
		cdptr2 = c_dataptr_rest;
	    }
	}
	ptr = skip_subfmt(CTXTc ptr, ')');
	c_dataptr_rest = c_dataptr + 4;
	break;

	case 'l':
	if (!ignore) {
	    fmtnum = (int)(*ptr-'0');
	    subformat[fmtnum] = ptr-2;
	    ptr++;
	    if (*(ptr++)!='(') cppc_error(CTXTc 16);
	    fields = count_fields(CTXTc ptr, ')');
	    size = count_csize(CTXTc ptr, ')');
	    cdptr2 = (char *)mem_alloc(size,OTHER_SPACE);  /* leak */
	    *((char **)c_dataptr) = cdptr2;
	    argno = 0;
	    for (i = 1; i <= fields; i++) {
		if (*(ptr+1)=='*') ignore = 1;
		else { ignore = 0; argno++; }
		if (argno==1)
		   ptr = ptoc_term0(CTXTc ptr,cdptr2,subformat,p2p_car(variable),ignore);
		else if (argno==2)
		   ptr = ptoc_term0(CTXTc ptr,cdptr2,subformat,p2p_cdr(variable),ignore);
		else cppc_error(CTXTc 31);
		cdptr2 = c_dataptr_rest;
	    }
	}
	ptr = skip_subfmt(CTXTc ptr, ')');
	c_dataptr_rest = c_dataptr + 4;
	break;

	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':

	if (!ignore) {
	    if (!is_nil(variable)) {
		ptoc_term0(CTXTc subformat[ch-'0'], c_dataptr, subformat, variable, 0);
	    } else *(int *)(c_dataptr) = 0;
	}
	c_dataptr_rest = c_dataptr + 4;
	break;

	default: cppc_error(CTXTc 17);
    }
    return ptr;
}

/*
** procedure ctop_term
**
*/

int ctop_term(CTXTdeclc char *fmt, char *c_dataptr, reg_num regnum)
{
    prolog_term variable;
    int my_errno;
    char *subformat[10];

    variable = reg_term(CTXTc regnum);
    if ((my_errno = setjmp(cinterf_env))) return my_errno;  /* catch an exception */
    ctop_term0(CTXTc fmt, c_dataptr, subformat, variable, 0);
    return 0;
}

/*
** procedure ptoc_term
**
*/

int ptoc_term(CTXTdeclc char *fmt, char *c_dataptr, reg_num regnum)
{
    prolog_term variable;
    int my_errno;
    char *subformat[10];

    variable = reg_term(CTXTc regnum);
    if ((my_errno = setjmp(cinterf_env))) return my_errno;  /* catch an exception */
    ptoc_term0(CTXTc fmt, c_dataptr, subformat, variable, 0);
    return 0;
}

/*
** procedure c2p_term
**
*/

int c2p_term(CTXTdeclc char *fmt, char *c_dataptr, prolog_term variable)
{
    int my_errno;
    char *subformat[10];

    if ((my_errno = setjmp(cinterf_env))) return my_errno;  /* catch an exception */
    ctop_term0(CTXTc fmt, c_dataptr, subformat, variable, 0);
    return 0;
}

/*
** procedure p2c_term
**
*/

int p2c_term(CTXTdeclc char *fmt, char *c_dataptr, prolog_term variable)
{
    int my_errno;
    char *subformat[10];

    if ((my_errno = setjmp(cinterf_env))) return my_errno;  /* catch an exception */
    ptoc_term0(CTXTc fmt, c_dataptr, subformat, variable, 0);
    return 0;
}
/* quick test to see whether atom must be quoted */
int mustquote(char *atom)
{
    int i;

    if (!(atom[0] >= 'a' && atom[0] <= 'z')) return TRUE;
    for (i=1; atom[i] != '\0'; i++) {
        if (!((atom[i] >= 'a' && atom[i] <= 'z') ||
             (atom[i] >= 'A' && atom[i] <= 'Z') ||
             (atom[i] == '_') ||
             (atom[i] >= '0' && atom[i] <= '9')
             )) return TRUE;
    }
    return FALSE;
}

/* copy a string (quoted if !toplevel and necessary) into a buffer.  */
void printpstring(char *atom, int toplevel, VarString *straddr)
{
    int i;
   
    if (toplevel || !mustquote(atom)) {
      XSB_StrAppend(straddr,atom);
    } else {
      XSB_StrAppendBlk(straddr, "'", 1);
      for (i = 0; atom[i] != '\0'; i++) {
	XSB_StrAppendBlk(straddr, atom+i, 1);
	if (atom[i] == '\'')
	  /* double the quotes in a quoted string */
	  XSB_StrAppendBlk(straddr, "'", 1);
      }
      XSB_StrAppend(straddr, "'");
    }
}
    
/* calculate approximate length of a printed term.  For space alloc. */
int clenpterm(prolog_term term)
{
  int i, clen;

  if (is_var(term)) return 11;
  else if (is_int(term)) return 12;
  else if (is_float(term)) return 12;
  else if (is_nil(term)) return 2;
  else if (is_string(term)) return strlen(p2c_string(term))+5;
  else if (is_list(term)) {
      clen = 1;
      clen += clenpterm(p2p_car(term)) + 1;
      while (is_list(term)) {
          clen += clenpterm(p2p_car(term)) + 1;
          term = p2p_cdr(term);
      }
      if (!is_nil(term)) {
          clen += clenpterm(term) + 1;
      }
      return clen+1;
  } else if (is_functor(term)) {
      clen = strlen(p2c_functor(term))+5;
      if (p2c_arity(term) > 0) {
          clen += clenpterm(p2p_arg(term,1)) + 1;
          for (i = 2; i <= p2c_arity(term); i++) {
              clen += clenpterm(p2p_arg(term,i)) + 1;
          }
          return clen + 1;
      } else return clen;
  } else {
      xsb_warn("Unrecognized prolog term type");
      return 0;
  }
}

char tempstring[MAXBUFSIZE];

/* print a prolog_term into a buffer.
   Atoms are quoted if !toplevel -- necessary for Prolog reading 
   Buffer is a VarString. If the VarString is non-empty, the term is appended
   to the current contents of the VarString.
*/
DllExport void call_conv print_pterm(CTXTdeclc prolog_term term, int toplevel, 
				     VarString *straddr)
{
  int i;

  if (is_var(term)) {
    xsb_sprint_variable(CTXTc tempstring, (CPtr) term);
    XSB_StrAppend(straddr,tempstring);
  } else if (is_attv(term)) {
    xsb_sprint_variable(CTXTc tempstring, (CPtr) dec_addr(term));
    XSB_StrAppend(straddr,tempstring);
  } else if (is_int(term)) {
    sprintf(tempstring,"%d", (int) p2c_int(term));
    XSB_StrAppend(straddr,tempstring);
  } else if (is_float(term)) {
    sprintf(tempstring,"%f", (float) p2c_float(term));
    XSB_StrAppend(straddr,tempstring);
  } else if (is_nil(term)) {
    XSB_StrAppend(straddr,"[]");
  } else if (is_string(term)) {
    printpstring(p2c_string(term),toplevel,straddr);
  } else if (is_list(term)) {
    XSB_StrAppend(straddr, "[");
    print_pterm(CTXTc p2p_car(term),FALSE,straddr);
    term = p2p_cdr(term);
    while (is_list(term)) {
      XSB_StrAppend(straddr, ",");
      print_pterm(CTXTc p2p_car(term),FALSE,straddr);
      term = p2p_cdr(term);
    }
    if (!is_nil(term)) {
      XSB_StrAppend(straddr, "|");
      print_pterm(CTXTc term,FALSE,straddr);
    }
    XSB_StrAppend(straddr, "]");
  } else if (is_functor(term)) {
    printpstring(p2c_functor(term),FALSE,straddr);
    if (p2c_arity(term) > 0) {
      XSB_StrAppend(straddr, "(");
      print_pterm(CTXTc p2p_arg(term,1),FALSE,straddr);
      for (i = 2; i <= p2c_arity(term); i++) {
	XSB_StrAppend(straddr, ",");
	print_pterm(CTXTc p2p_arg(term,i),FALSE,straddr);
      }
      XSB_StrAppend(straddr, ")");
    }
  } else xsb_warn("[PRINT_PTERM] Unrecognized prolog term type");
}

/************************************************************************/
/*                                                                      */
/*	xsb_answer_string copies an answer from reg 2 into ans.		*/
/*                                                                      */
/************************************************************************/
int xsb_answer_string(CTXTdeclc VarString *ans, char *sep) 
{
  int i;
  
  if (!is_string(reg_term(CTXTc 2))) {
    for (i=1; i<p2c_arity(reg_term(CTXTc 2)); i++) {
      print_pterm(CTXTc p2p_arg(reg_term(CTXTc 2),i),TRUE,ans);
      XSB_StrAppend(ans,sep);
    }
    print_pterm(CTXTc p2p_arg(reg_term(CTXTc 2),p2c_arity(reg_term(CTXTc 2))),TRUE,ans);
  }
  return 0;
}


static long lastWarningStart = 0L;
static inline void updateWarningStart(void)
{
  if(flags[STDERR_BUFFERED])
  	lastWarningStart = ftell(stderr);
}

/************************************************************************/
/*                                                                      */
/* xsb_init(argc,argv) initializes XSB to be called from C.             */
/* argc and argv are the arg count and arg vector as passed from the    */
/* command line.  The parameters are used to set space sizes in xsb.    */
/* The parameters MUST include -i, which indicates that the main        */
/* interpreter is to be loaded, AND -n, which indicates that the        */
/* interpreter should not enter the usual read-eval-print loop, but     */
/* instead support the interface to the C caller.                       */
/*   If xsb has been previously initialized, nothing is done and 1 is   */
/* returned.                                                            */
/*                                                                      */
/************************************************************************/

static int xsb_initted_gl = 0;   /* if xsb has been called */
static int xsb_inquery_gl = 0;   

DllExport int call_conv xsb_init(CTXTdeclc int argc, char *argv[])
{
int rc = 1;
char executable1[MAXPATHLEN];
 char *expfilename;

updateWarningStart();
if (!xsb_initted_gl)
	{
	/* we rely on the caller to tell us in argv[0]
	the absolute or relative path name to the XSB installation directory */
	sprintf(executable1, "%s%cconfig%c%s%cbin%cxsb",
	argv[0], SLASH, SLASH, FULL_CONFIG_NAME, SLASH, SLASH);
	expfilename = expand_filename(executable1);
	strcpy(executable_path_gl, expfilename);
	mem_dealloc(expfilename,MAXPATHLEN,OTHER_SPACE);

	if (0 == (rc = xsb(CTXTc 0,argc,argv)))     /* initialize xsb */
		{
		if (0 == (rc = xsb(CTXTc 1,0,0)))       /* enter xsb to set up regs */
		xsb_initted_gl = 1;
		}
	}
return(rc);
}

/************************************************************************/
/*								        */
/*  int xsb_cmd_string(char *cmdline, char **argv) takes a		*/
/*  command line string in cmdline, and parses it to return an argv	*/
/*  vector in its second argument, and the argc count as the value of   */
/*	the function.  (Will handle a max of 19 args.)			*/
/*									*/
/************************************************************************/
/*FILE *stream_err, *stream_out;*/

DllExport int call_conv xsb_init_string(CTXTdeclc char *cmdline_param) {
	int i = 0, argc = 0;
	char **argv, delim;
	char cmdline[2*MAXPATHLEN+1];

  updateWarningStart();

	/*stream_err = freopen("XSB_errlog", "w", stderr);
	  stream_out = freopen("XSB_outlog", "w", stdout);*/

	if (strlen(cmdline_param) > 2*MAXPATHLEN) {
	    xsb_warn("**************************************************************************");
	    xsb_warn("[XSB_INIT_STRING] %18s...: command used to call XSB server is too long",
		    cmdline_param);
	    xsb_warn("**************************************************************************");
	    exit(1);
	}
	strncpy(cmdline, cmdline_param, 2*MAXPATHLEN - 1);
	argv = (char **) mem_alloc(20*sizeof(char *),OTHER_SPACE);  /* count space even if never released */

	while (cmdline[i] == ' ') i++;
	while (cmdline[i] != '\0') {
		if ((cmdline[i] == '"') || (cmdline[i] == '\'')) {
			delim = cmdline[i];
			i++;
		} else delim = ' ';
		argv[argc] = &(cmdline[i]);
		argc++;
		if (argc >= 19) {argc--; break;}
		while ((cmdline[i] != delim) && (cmdline[i] != '\0')) i++;
		if (cmdline[i] == '\0') break;
		cmdline[i] = '\0';
		i++;
		while (cmdline[i] == ' ') i++;
	}
	argv[argc] = 0;
	return xsb_init(CTXTc argc,argv);
}

/************************************************************************/
/*                                                                      */
/* xsb_command() passes the command (i.e. query with no variables) to   */
/* xsb.  The command must be put into xsb's register 1 as a term, by    */
/* the caller who uses the c2p_* (and perhaps p2p_*) functions.         */
/*   It returns 0 if it succeeds, 1 if it fails, in either case         */
/* resetting register 1 back to a free variable.  It returns 2 if there */
/* is an error.                                                         */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_command(CTXTdecl)
{
  if (xsb_inquery_gl) return(2);  /* error */
  updateWarningStart();
  c2p_int(CTXTc 0,reg_term(CTXTc 3));  /* command for calling a goal */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(1);  /* goal failed, so return 1 */
  c2p_int(CTXTc 1,reg_term(CTXTc 3));  /* command for next answer */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(0);  /* goal succeeded */
  (void) xsb_close_query(CTXT);
  return(2);
}

/************************************************************************/
/*                                                                      */
/* xsb_command_string(char *goal) passes the command (e.g. a query      */
/* which only succeeds or fails) to xsb.  The command must a string     */
/* passed in the argument.  It returns 0 if it succeeds, 1 if it        */
/* fails, in either case resetting register 1 back to a free            */
/* variable.  It returns 2 if there is an error.                        */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_command_string(CTXTdeclc char *goal)
{
  if (xsb_inquery_gl) return(2);  /* error */
  updateWarningStart();
  c2p_string(CTXTc goal,reg_term(CTXTc 1));
  c2p_int(CTXTc 2,reg_term(CTXTc 3));  /* command for calling a string goal */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(1);  /* goal failed, so return 1 */
  c2p_int(CTXTc 1,reg_term(CTXTc 3));  /* command for next answer */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(0);  /* goal succeeded */
  (void) xsb_close_query(CTXT);
  return(2);
}

/************************************************************************/
/*                                                                      */ 
/* xsb_query() submits a query to xsb. The query must have been put into*/
/* xsb's register 1 by the caller, using p2c_* (and perhaps p2p_*).  Xsb*/
/* will evaluate the query and return with the variables in the query   */
/* bound to the first answer.  In addition, register 2 will contain a   */
/* Prolog term of the form ret(V1,V2,..,Vn) with as many Vi's as        */
/* variables in the original query and with Vi bound to the value for   */
/* that variable in the first answer.  If the query fails, it returns 1.*/
/* If the query succeeds, it returns 0. If there is an error, it returns*/
/* 2.                                                                   */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_query(CTXTdecl)
{
  if (xsb_inquery_gl) return(2);
  updateWarningStart();
  c2p_int(CTXTc 0,reg_term(CTXTc 3));  /* set command for calling a goal */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(1);
  xsb_inquery_gl = 1;
  return(0);
}

/************************************************************************/
/*                                                                      */ 
/* xsb_query_string(char *) submits a query to xsb.  The string must
   be a goal that will be correctly read by xsb's reader, and it must
   be terminated with a period (.).  Register 2 may be a variable or
   it may be a term of the form ret(X1,X2,...,Xn), where n is the
   number of variables in the query.  The query will be parsed, and an
   answer term of the form ret(Y1,Y2,...,Yn) will be constructed where
   Y1, .... Yn are the variables in the parsed goal (in left-to-right
   order).  This answer term is unified with the argument in register
   2.  Then the goal is called.  If the goal succeeds,
   xsb_query_string returns 0 and the first answer is in register 2.
   If it fails, xsb_query_string returns 1.                             */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_query_string(CTXTdeclc char *goal)
{
  if (xsb_inquery_gl) return(2);
  updateWarningStart();
  c2p_chars(CTXTc goal,2,reg_term(CTXTc 1));
  c2p_int(CTXTc 2,reg_term(CTXTc 3));  /* set command for calling a string goal */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) return(1);
  xsb_inquery_gl = 1;
  return(0);
}

/************************************************************************/
/*                                                                      */
/*  xsb_query_string_string calls xsb_query_string and returns          */
/*	the answer in a string.  The answer is copied into ans,	        */
/*	a VarString provided by the caller.  Variable	    	    	*/
/*	values are separated by the string sep.				*/
/*                                                                      */
/************************************************************************/

int call_conv xsb_query_string_string(CTXTdeclc char *goal, 
				      VarString *ans, char *sep) 
{
  int rc;
  
  rc = xsb_query_string(CTXTc goal);
  if (rc > 0) return rc;
  return xsb_answer_string(CTXTc ans,sep);
}

/************************************************************************/
/*                                                                      */
/*  xsb_query_string_string_b calls xsb_query_string and returns        */
/*	the answer in a string.  The caller provides a buffer and its   */
/*      length.  If the answer fits in the buffer, it is returned       */
/*      there, and its length is returned.  If not, then the length is  */ 
/*      returned, and the answer can be obtained by calling             */
/*      xsb_get_last_answer.                                            */
/*                                                                      */
/************************************************************************/
#ifndef MULTI_THREAD
static XSB_StrDefine(last_answer_lc);
#define last_answer (&last_answer_lc)
#endif

int call_conv xsb_query_string_string_b(CTXTdeclc
	     char *goal, char *buff, int buflen, int *anslen, char *sep) 
{
  int rc;
  
  XSB_StrSet(last_answer,"");
  rc = xsb_query_string_string(CTXTc goal,last_answer,sep); 
  if (rc > 0) return rc;
  *anslen = last_answer->length;
  XSB_StrNullTerminate(last_answer);
  if (last_answer->length < buflen) {
    strcpy(buff,last_answer->string);
    return rc;
  } else return(3);
}

/************************************************************************/
/*                                                                      */
/*	xsb_get_last_answer_string returns previous answer.             */
/*                                                                      */
/************************************************************************/
DllExport int call_conv 
   xsb_get_last_answer_string(CTXTdeclc char *buff, int buflen, int *anslen) {

 *anslen = last_answer->length;
  if (last_answer->length < buflen) {
    strcpy(buff,last_answer->string);
    return 0;
  } else 
    return(3);
}    

/************************************************************************/
/*                                                                      */
/* xsb_next() causes xsb to return the next answer.  It (or             */
/* xsb_close_query) must be called after xsb_query.  If there is        */
/* another answer, xsb_next returns 0 and the variables in goal term    */
/* (in xsb register 1) are bound to the answer values.  In addition     */
/* xsb register 2 will contain a term of the form ret(V1,V2,...,Vn)     */
/* where the Vi's are the values for the variables for the next         */
/* answer.                                                              */
/* xsb_next returns 0 if the next is found, 1 if there are no more      */
/* answers, and 3 if an error is encountered. If 1 is returned, then    */
/* the query is automatically closed.                                   */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_next(CTXTdecl)
{
  if (!xsb_inquery_gl) return(2);
  updateWarningStart();
  c2p_int(CTXTc 0,reg_term(CTXTc 3));  /* set command for next answer */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) {
    xsb_inquery_gl = 0;
    return(1);
  } else return(0);
}

/************************************************************************/
/*                                                                      */
/*	xsb_next_string(ans,sep) calls xsb_next() and returns the       */
/*	answer in the VarString ans, provided by the caller.            */
/*	sep is a separator for the fields of the answer.        	*/
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_next_string(CTXTdeclc VarString *ans, char *sep) 
{
  int rc = xsb_next(CTXT);
  if (rc > 0) return rc;
  return xsb_answer_string(CTXTc ans,sep);
}

/************************************************************************/
/*                                                                      */
/*	xsb_next_string_b(buff,buflen,anslen,sep) calls xsb_next() and  */
/*      returns the answer in buff, provided by the caller.  The length */
/*      of buff is buflen.  The length of the answer is put in anslen.  */
/*      If the buffer is too small for the answer, nothing is put in    */
/*      the buffer.  In this case the caller can allocate a larger      */
/*      and retrieve the buffer using xsb_get_last_answer.              */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_next_string_b(CTXTdeclc
		     char *buff, int buflen, int *anslen, char *sep) 
{
  int rc;

  XSB_StrSet(last_answer,"");
  rc = xsb_next_string(CTXTc last_answer,sep);
  if (rc > 0) return rc;
  *anslen = last_answer->length;
  XSB_StrNullTerminate(last_answer);
  if (last_answer->length < buflen) {
    strcpy(buff,last_answer->string);
    return rc;
  } else return(3);
}

/************************************************************************/
/*                                                                      */
/* xsb_close_query() closes the current query, so that no more answers  */
/* will be returned, and another query can be opened.                   */
/* If the query was correctly closed, it resets xsb registers 1 and 2   */
/* to be variables, and returns 0.  If there is some error, it returns  */
/* 2.                                                                   */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_close_query(CTXTdecl)
{
  updateWarningStart();
  if (!xsb_inquery_gl) return(2);
  c2p_int(CTXTc 1,reg_term(CTXTc 3));  /* set command for cut */
  xsb(CTXTc 1,0,0);
  if (is_var(reg_term(CTXTc 1))) {
    xsb_inquery_gl = 0;
    return(0);
  } else return(2);
}

/************************************************************************/
/*                                                                      */
/*  xsb_close() is currently just a noop, since it doesn't clean        */
/*  anything up, to allow a re-init.                                    */
/*                                                                      */
/************************************************************************/

DllExport int call_conv xsb_close(CTXTdecl)
{
  updateWarningStart();
  if (xsb_initted_gl) return(0);
  else return(1);
}

#if defined(WIN_NT)
//
// From: UNIX Application Migration Guide
// http://msdn.microsoft.com/library/default.asp?url=/library/en-us/dnucmg/html/UCMGch10.asp
//
// The version there won't compile as is, but it can be fixed...
//
#include <io.h>
#include <Basetsd.h>
#if !defined(CYGWIN)
typedef SSIZE_T	ssize_t;
#endif
static inline ssize_t pread(int fd, void *buf, size_t count, long offset)
{
if (-1 == lseek(fd,offset,SEEK_SET))
	return(-1);
return(read(fd,buf,count));
}
#else
//
// For concurrent access to a file (required for asynchronous I/O (AIO) support)
// requires the pread() and pwrite() system calls to actually work
// so let's use the real thing that way we can safely be multi-threaded.
//
#include <unistd.h>
#endif

/************************************************************************/
/*                                                                      */
/*	xsb_get_last_error_string returns previous answer.             */
/*                                                                      */
/************************************************************************/
DllExport int call_conv xsb_get_last_error_string(char *buff, int buflen, int *anslen)
{
int rc = 2;
ssize_t bytesRead = 1;
ssize_t totalBytesRead = 0;

if(!flags[STDERR_BUFFERED])
	xsb_warn("[xsb_get_last_error_string] This feature must be activated with the -q option");
else
	{
	rc = 1;				// Assume failure on the ftell or read
	errno = 0;			// Setup to detect error in ftell
	*anslen = (int)(ftell(stderr) - lastWarningStart);
	if((0 == errno) && (-1 < *anslen))
		{				// ftell worked
		if (*anslen >= buflen)
			rc = 3;		// Not enough room in the target buffer
		else
			{
			while ((totalBytesRead < *anslen) && (0 < bytesRead) && !ferror(stderr))
				{
 		   		bytesRead = pread(fileno(stderr),&buff[totalBytesRead],(*anslen - totalBytesRead),(lastWarningStart + totalBytesRead));
 		   		totalBytesRead += bytesRead;
 		   		}
			if (!ferror(stderr))
				{
				rc = 0;
				if (-1 == bytesRead)
					*anslen = totalBytesRead + 1;
				else
					*anslen = totalBytesRead;
				buff[*anslen] = 0x00;
				}
			}
		}
	}
return(rc);
}    
