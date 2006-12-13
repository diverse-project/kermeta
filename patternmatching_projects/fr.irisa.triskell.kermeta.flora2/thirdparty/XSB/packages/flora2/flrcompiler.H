/* File:      flrcompiler.H
**
** Author(s): Guizhen Yang
**
** Contact:   flora-users@lists.sourceforge.net
**
** Copyright (C) The Research Foundation of SUNY, 1999-2001
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
** $Id: flrcompiler.H,v 1.19 2006/05/04 19:52:38 hwan Exp $
**
*/


:- import
	flora_increment_counter/4,
	flora_set_counter/2,
	flora_get_counter/2,
	flora_concat_atoms/2,
        flora_match_substring/3
    from flrporting.

:- import
	member/2,
	append/3,
	flatten/2,
	length/2
   from basics.

:- import
        concat_atom/2
    from string.

:- import sort/2, keysort/2, findall/3 from setof.

:- import flora_define_operator/3 from flroperator.

:- import
	flora_define_prolog/2,
	flora_prlgdef/2
   from flrprolog.

:- import
	flora_token_text/6
    from flrlexer.

:- import
	flora_nth_token/2
   from flrcomposer.

:- import
	flora_compiler_environment/2
   from flrutils.

:- import
        is_prvariable/3,
        is_prtransactionalvariable/3,
        is_pratom/3,
        is_prnumber/3,
        is_pruri/3,
        is_prurisq/3,
        is_prtransactionalnumber/3,
        is_prstring/3,
        is_prfact/2
   from flrcoder.
        
:- import flora_error_line/2 from flrprint.

:- import fldirective_struct/3 from flrparser.

:- dynamic compile_with_var_module(_).

:- dynamic dynrule_warnings(_).

:- export 
        reset_newvar/0,
        new_varobj/2,
	flora_compile_add/4,
	flora_reset_compiler/0, 
	flora_compile/4.
