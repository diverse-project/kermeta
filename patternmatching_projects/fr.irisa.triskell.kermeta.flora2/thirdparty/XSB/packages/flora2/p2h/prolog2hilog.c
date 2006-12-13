/* File:      prolog2hilog.c
** Author(s): kifer
** Contact:   flora-users@lists.sourceforge.net
** 
** Copyright (C) The Research Foundation of SUNY, 2000
** 
** FLORA-2 is free software; you can redistribute it and/or modify it under the
** terms of the GNU Library General Public License as published by the Free
** Software Foundation; either version 2 of the License, or (at your option)
** any later version.
** 
** FLORA-2 is distributed in the hope that it will be useful, but WITHOUT ANY
** WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
** FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
** more details.
** 
** You should have received a copy of the GNU Library General Public License
** along with FLORA-2; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
**
** $Id: prolog2hilog.c,v 1.8 2006/08/18 04:19:47 kifer Exp $
** 
*/


#include "xsb_config.h"

#include <stdio.h>
#include <string.h>

#ifdef WIN_NT
#define XSB_DLL
#endif

#include "auxlry.h"
#include "cell_xsb.h"
#include "error_xsb.h"
#include "cinterf.h"
#include "context.h"

#define FLORA_META_PREFIX      "_$_$_flora'mod"
#define FLORA_LIB_PREFIX       "fllib"
#define FLORA_META_PREFIX_LEN  14
#define FLORA_LIB_PREFIX_LEN    5


#if 0
#define P2HDEBUG
#define P2HDEBUG_VERBOSE
#endif

/* take hilog term and a hilog apply op and return prolog term.
   If the apply term is != the one used in the hilog term, assume it is already
   a prolog term and don't convert */
static prolog_term hilog2prolog(CTXTdeclc prolog_term hterm, char *apply, int unify_vars);
/* take prolog term and a symbol name of the apply operator and return hilog
   term. If prolog term already has the main functor==hilog apply, then don't
   convert. */
static prolog_term prolog2hilog(CTXTdeclc prolog_term pterm, char *apply, int unify_vars);
static char *pterm2string(CTXTdeclc prolog_term term);
inline static int is_hilog(prolog_term term, char *apply_funct);
inline static int is_special_form(prolog_term term);
inline static int is_formula(prolog_term term);
static prolog_term map_special_form(CTXTdeclc prolog_term (*func)(), prolog_term term, char *apply, int unify_vars);
static prolog_term map_list(CTXTdeclc prolog_term func(), prolog_term term, char *apply, int unify_vars);

static char errormessage[300];

/*
  When called from Prolog, takes 3 args:
  - Pterm:  Prolog term
  - Hterm:  HiLog term
  - Apply:  Symbol name for the HiLog apply predicate
  - UnifyGlag: If true, unify if both Pterm and Hterm are variables

  If Pterm is a variable, then it is unified with Hterm.
  If Hterm is a variable, then it is unified with Pterm.
  If both Pterm and Hterm are scalar (int, float, string), then they are
  unified. 

  If Pterm or Hterm is a list or a commalist (a,b,c,), then the function is
  applied to each element and the results are returned as a list or a commalist
  (whichever applies).

  If Hterm is term (and not a list or a commalist), then Hterm is assumed to be
  a HiLog term of the kind that converts to Prolog. Hterm is then converted to
  Prolog and the result is unified with Pterm.  If the main functor is !=
  Apply, then it is assumed to be a prolog term and the term is returned
  without conversion.

  If Pterm is a term that is not a list or a commalist, then it is assumed to
  be a prolog term. It is converted to HiLog using the apply-functor name given
  in Apply (which must be an atom).  The result then unifies with Hterm.  If
  the main functor is = Apply, then we assume that the term is already a HiLog
  term and the term is simply returned without change.

  For instance,
      flora_plg2hlg(f(a,g(b,X)),Y,abc)
      Y = abc(f,a,abc(g,b,_h123))

      flora_plg2hlg(X, cde(f,a,cde(g,b,Y))),Z)
      X = abc(f,a,abc(g,b,_h123))
      Z = abc

  Doesn't do occur-check!!! Something like
      flora_plg2hlg(X, cde(f,a,cde(g,b,X))),Z)
  Will loop and eventually crash because X occurs in Pterm and in Hterm.
 */
DllExport xsbBool call_conv flora_plg2hlg (CTXTdecl) {
  prolog_term pterm = extern_reg_term(1);
  prolog_term hterm = extern_reg_term(2);
  prolog_term apply_t = extern_reg_term(3);
  int unify_vars = extern_ptoc_int(4); /* whether to unify if both args are vars */
  prolog_term temp_term;
  char *apply;

#ifdef P2HDEBUG_VERBOSE
  xsb_dbgmsg("flora_plg2hlg: Arg1=%s", pterm2string(CTXTc pterm));
  xsb_dbgmsg("flora_plg2hlg: Arg2=%s", pterm2string(CTXTc hterm));
  xsb_dbgmsg("flora_plg2hlg: Arg3=%s", pterm2string(CTXTc apply_t));
#endif

#ifdef P2HDEBUG
  if (!is_atom(apply_t)) {
    sprintf(errormessage,
	    "p2h{?Plg,?Hlg}: The apply functor=%s is not an atom.",
	    pterm2string(CTXTc apply_t));
    abort_xsb(errormessage);
  }
#endif

  apply = string_val(apply_t);

  /* both are variables */
  if (is_var(pterm) && is_var(hterm)) {
    if (unify_vars)
      return extern_p2p_unify(pterm,hterm);
    else
      return TRUE;
  }

  /* if hilog is instantiated, convert from hilog to prolog
     and unify, because hilog->prolog conversion is more accurate */
  if (!is_var(hterm)) {
    temp_term = hilog2prolog(CTXTc hterm, apply,unify_vars);
    return extern_p2p_unify(temp_term, pterm);
  }

  /* hterm is a variable and pterm is not */
  temp_term = prolog2hilog(CTXTc pterm, apply, unify_vars);

  return extern_p2p_unify(temp_term, hterm);
}

static inline xsbBool is_scalar(prolog_term pterm)
{
  if (is_atom(pterm) || is_int(pterm) || is_float(pterm))
    return TRUE;
  return FALSE;
}


static prolog_term hilog2prolog(CTXTdeclc prolog_term hterm, char *apply, int unify_vars)
{
  prolog_term pterm = extern_p2p_new();
  prolog_term pfunctor;
  int arity, i;

  if (is_var(hterm)){
    if (unify_vars)
      return hterm;
    else
      return pterm; /* don't reuse input vars: make new ones */
  }
  if (is_scalar(hterm)) return hterm;

  if (is_list(hterm))
    return map_list(CTXTc hilog2prolog,hterm,apply,unify_vars);
  else if (is_special_form(hterm))
    return map_special_form(CTXTc hilog2prolog,hterm,apply,unify_vars);

#ifdef P2HDEBUG
  if (!is_functor(hterm)) {
    sprintf(errormessage,
	    "p2h{?Plg,?Hlg}: ?Hlg=%s must be a HiLog term.",
	    pterm2string(CTXTc hterm));
    abort_xsb(errormessage);
  }
#endif

  /* Don't convert if already Prolog */
  if (!is_hilog(hterm,apply)) return hterm;
  /* Don't convert if formula (predicate or molecule) */
  if (is_formula(hterm)) return hterm;

  arity=extern_p2c_arity(hterm);

  pfunctor = extern_p2p_arg(hterm,1);
  if (!is_atom(pfunctor)) {
    sprintf(errormessage,
	    "p2h{?Plg,?Hlg}: ?Hlg=%s is not convertible to Prolog.",
	    pterm2string(CTXTc hterm));
    abort_xsb(errormessage);
  }
  if (arity > 1)
    extern_c2p_functor(string_val(pfunctor), arity-1, pterm);
  else
    return pfunctor;

#ifdef P2HDEBUG_VERBOSE
  xsb_dbgmsg("h2p start: Pterm=%s", pterm2string(CTXTc pterm));
  xsb_dbgmsg("h2p start: Hterm=%s", pterm2string(CTXTc hterm));
  xsb_dbgmsg("h2p start: Apply=%s", apply);
#endif

  for (i=2; i<=arity; i++) {
    extern_p2p_unify(hilog2prolog(CTXTc extern_p2p_arg(hterm,i), apply,unify_vars),
	      extern_p2p_arg(pterm, i-1));
#ifdef P2HDEBUG_VERBOSE
    xsb_dbgmsg("h2p loop: Pterm=%s", pterm2string(CTXTc pterm));
#endif
  }
  return pterm;
}


static prolog_term prolog2hilog(CTXTdeclc prolog_term pterm, char *apply, int unify_vars)
{
  prolog_term hterm = extern_p2p_new();
  int arity, i;

  if (is_var(pterm)) {
    if (unify_vars)
      return pterm;
    else
      return hterm; /* don't reuse input vars: create new */
  }
  if (is_scalar(pterm)) return pterm;

  if (is_list(pterm))
    return map_list(CTXTc prolog2hilog,pterm,apply, unify_vars);
  else if (is_special_form(pterm))
    return map_special_form(CTXTc prolog2hilog,pterm,apply, unify_vars);

  if (!is_functor(pterm)) {
    sprintf(errormessage,
	    "p2h{?Plg,?Hlg}: ?Plg=%s must be a Prolog term.",
	    pterm2string(CTXTc pterm));
    abort_xsb(errormessage);
  }

  /* Don't convert if already HiLog */
  if (is_hilog(pterm,apply)) return pterm;
  /* Don't convert if formula (predicate or molecule) */
  if (is_formula(pterm)) return pterm;

  arity = extern_p2c_arity(pterm);
  extern_c2p_functor(apply,arity+1,hterm);
  extern_c2p_string(extern_p2c_functor(pterm), extern_p2p_arg(hterm,1)); /* set the functor arg */

#ifdef P2HDEBUG_VERBOSE
  xsb_dbgmsg("p2h start: Pterm=%s", pterm2string(CTXTc pterm));
  xsb_dbgmsg("p2h start: Hterm=%s", pterm2string(CTXTc hterm));
  xsb_dbgmsg("p2h start: Apply=%s", apply);
#endif

  /* set the rest of the args */
  for (i=1; i<=arity; i++) {
    extern_p2p_unify(prolog2hilog(CTXTc extern_p2p_arg(pterm,i),apply, unify_vars), extern_p2p_arg(hterm,i+1));
#ifdef P2HDEBUG_VERBOSE
  xsb_dbgmsg("p2h loop: Hterm=%s", pterm2string(CTXTc hterm));
#endif
  }
  return hterm;
}


static prolog_term map_list(CTXTdeclc prolog_term func(), prolog_term termList, char *apply, int unify_vars)
{
  prolog_term listHead, listTail;
  prolog_term outList=extern_p2p_new(), outListHead, outListTail;
  prolog_term temp_term;
  xsbBool mustExit=FALSE;


  listTail = termList;
  outListTail = outList;

  while (!is_nil(listTail) && !mustExit) {
    if (is_list(listTail)) {
      extern_c2p_list(outListTail);
      listHead = extern_p2p_car(listTail);
      outListHead = extern_p2p_car(outListTail);
      temp_term = func(CTXTc listHead,apply, unify_vars);
      extern_p2p_unify(outListHead, temp_term);
      listTail = extern_p2p_cdr(listTail);
      outListTail = extern_p2p_cdr(outListTail);
    } else {
      extern_p2p_unify(listTail,outListTail);
      mustExit = TRUE;
    }
  }

 if (is_nil(listTail)) 
   extern_c2p_nil(outListTail); /* bind tail to nil */
  
  return outList;
}

static prolog_term map_special_form(CTXTdeclc prolog_term (*func)(), prolog_term special_form, char *apply, int unify_vars)
{
  prolog_term formArg1_temp, formArg2_temp;
  prolog_term out_form=extern_p2p_new(), formArg1_out, formArg2_out;
  char *functor = extern_p2c_functor(special_form);

  extern_c2p_functor(functor, 2, out_form);
  formArg1_out = extern_p2p_arg(out_form,1);
  formArg2_out = extern_p2p_arg(out_form,2);
  formArg1_temp = func(extern_p2p_arg(special_form,1),apply, unify_vars);
  formArg2_temp = func(extern_p2p_arg(special_form,2),apply, unify_vars);
  extern_p2p_unify(formArg1_out,formArg1_temp);
  extern_p2p_unify(formArg2_out,formArg2_temp);

  return out_form;
}


static char *pterm2string(CTXTdeclc prolog_term term)
{ 
  static VarString *StrArgBuf;
  prolog_term term2 = extern_p2p_deref(term);

  XSB_StrCreate(&StrArgBuf);
  XSB_StrSet(StrArgBuf,"");
  extern_print_pterm(term2, 1, StrArgBuf); 
  return StrArgBuf->string;
} 


/* This detects both HiLog terms and predicates, but we really need to check
   for HiLog terms only */
static int is_hilog(prolog_term term, char *apply_funct)
{
  size_t length_diff;
  char *func = extern_p2c_functor(term); /* term functor */
  
  length_diff = strlen(func) - strlen(apply_funct);
  
  if (0 > length_diff) return FALSE;

  /* Match apply_funct to the end of the term functor.
     HiLog terms have functor=apply_functor.
     HiLog predicates have complex functor, whose tail matches flapply */
  return (strcmp(apply_funct, func+length_diff)==0);
}


/* Check if term represents a formula rather than a term */
static int is_formula(prolog_term term)
{
  char *functor;
  if (is_scalar(term) || is_list(term)) return FALSE;

  functor = extern_p2c_functor(term);
  return
    (strncmp(functor, FLORA_META_PREFIX, FLORA_META_PREFIX_LEN)==0)
    ||
    (strncmp(functor, FLORA_LIB_PREFIX, FLORA_LIB_PREFIX_LEN)==0);
}


/* Note: this only treats 2-ary 1-character functors that are treated as
   prolog in Flora. We don't do it for others due to speed considerations. */
static int is_special_form(prolog_term term)
{
  char *functor;
  if (is_scalar(term) || is_list(term)) return FALSE;

  functor = extern_p2c_functor(term);
  if (strlen(functor)==1) {
    switch (*functor) {
    case ',':
    case ';':
    case '+':
    case '-':
    case '/':
    case '*':
    case '>':
    case '<':
    case '~': return TRUE;
    default: return FALSE;
    }
  }
  return FALSE;
}



/* 
   flora_plg2hlg(a(qq,b(c,4),b(c,5,d(X,U))),Y,aaa,1).
     Y = aaa(a,qq,aaa(b,c,4),aaa(b,c,5,aaa(d,_h312,_h313)))
   flora_plg2hlg(aaa(qq,b(c,4)),X,aaa,1).
     X = aaa(qq,b(c,4))
   flora_plg2hlg(X, aaa(qq,b(c,4),aaa(kkk,Bbb,aaa(ppp,aaa(uuu,Aaa),Ooo))),aaa,1).
     X = qq(b(c,4),kkk(_h356,ppp(uuu(_h365),_h362)))
   flora_plg2hlg(X, aaa(qq,aaa(aaa,4)),aaa,1).
     X = qq(aaa(4))
   flora_plg2hlg(X, [], aaa,1).
     X = []
   flora_plg2hlg([], X, aaa,1).
     X = []
   flora_plg2hlg(X, [aaa(qq,b(c,4)), f(abc), aaa(b,c(K),aaa(bbb,aaa(ccc,aaa(ddd))))],aaa,1).
     X = [qq(b(c,4)),f(abc),b(c(_h185),bbb(ccc(ddd)))]
   flora_plg2hlg(X, [aaa(qq,b(c,4)), f(abc), aaa(b,c(K))],aaa,1).
     X = [qq(b(c,4)),f(abc),b(c(_h185))]
   flora_plg2hlg(X, [[aaa(qq,b(c,4)), f(abc)], aaa(b,c(K))],aaa,1).
     X = [[qq(b(c,4)),f(abc)],b(c(_h193))]
   flora_plg2hlg([aaa(qq,b(c,4)), a(qq,b(c,4)), f(q(a),b,c(p,q(Y)))], X, aaa,1).
     X = [aaa(qq,b(c,4)),aaa(a,qq,aaa(b,c,4)),aaa(f,aaa(q,a),b,aaa(c,p,aaa(q,_h423)))]
   flora_plg2hlg([aaa(qq,b(c,4)), [a(qq,b(c,4))], [f(q(a),b,c(p,q(Y))), b(_)]], X, aaa,1).
     X = [aaa(qq,b(c,4)),[aaa(a,qq,aaa(b,c,4))],[aaa(f,aaa(q,a),b,aaa(c,p,aaa(q,_h480))),aaa(b,_h487)]]
   flora_plg2hlg(X, (aaa(qq,b(c,4)), f(abc), aaa(b,c(K),aaa(bbb,aaa(ccc,aaa(ddd))))),aaa,1).
     X = (qq(b(c,4))  ','  f(abc)  ','  b(c(_h185),bbb(ccc(ddd))))
   flora_plg2hlg(X, (aaa(qq,b(c,4)), f(abc), aaa(b,c(K))),aaa,1).
     X = (qq(b(c,4))  ','  f(abc)  ','  b(c(_h185)))
   flora_plg2hlg(X, ((aaa(qq,b(c,4)); f(abc)), aaa(b,c(K))),aaa,1).
     X = ((qq(b(c,4))  ';'  f(abc))  ','  b(c(_h193)))
   flora_plg2hlg((aaa(qq,b(c,4)); a(qq,b(c,4)), f(q(a),b,c(p,q(Y)))), X,aaa,1).
     X = (aaa(qq,b(c,4))  ';'  aaa(a,qq,aaa(b,c,4))  ','  aaa(f,aaa(q,a),b,aaa(c,p,aaa(q,_h427))))
   flora_plg2hlg((aaa(qq,b(c,4)), a(qq,b(c,4)), f(q(a),b,c(p,q(Y)))), X,aaa,1).
     X = (aaa(qq,b(c,4))  ','  aaa(a,qq,aaa(b,c,4))  ','  aaa(f,aaa(q,a),b,aaa(c,p,aaa(q,_h427))))
   flora_plg2hlg(((aaa(qq,b(c,4)), a(qq,b(c,4))); (f(q(a),b,c(p,q(Y))), b(_))), X, aaa,1).
     X= (aaa(qq,b(c,4))  ','  aaa(a,qq,aaa(b,c,4))  ';' aaa(f,aaa(q,a),b,aaa(c,p,aaa(q,_h480)))  ','  aaa(b,_h485))
*/
