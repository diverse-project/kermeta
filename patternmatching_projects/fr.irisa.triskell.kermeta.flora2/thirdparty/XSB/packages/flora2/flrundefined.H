/* File:      flrundefined.H
**
** Author(s): Chang Zhao
**
** Contact:   flora-users@lists.sourceforge.net
**
** Copyright (C) The Research Foundation of SUNY, 2002
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
** $Id: flrundefined.H,v 1.18 2006/05/03 05:37:31 kifer Exp $
**
*/


:- compiler_options([xpp_on]).

#include "flora_porting.flh"

:- dynamic term_seen(_).

:- import length/2 from basics.

:- import
	flora_db_find_base/2,
	flora_db_insert_base/2
   from flrstoragebase.

:- import
	flora_concat_atoms/2,
	flora_concat_items/2
   from flrporting.

:- import 
        flora_abort/1,
        flora_coder_error/1
   from flrutils.

:- import flora_disabled_undefinedness_check_registry/3 from flrregistry.

:- import flora_prlgdef/2 from flrprolog.

:- import
	is_flogic/4,
	is_prrule/3,
	is_prfact/2,
	is_pratom/3,
	is_prvariable/3,
	is_prtransactionalvariable/3,
	is_prterm/4,
	is_pratomlit/3,
	is_prtransactionalatomlit/3,
        is_prtermlit/4,
        is_prtransactionaltermlit/4,
        flora_write_struct/3
   from flrcoder.

:- import
        reset_newvar/0,
        new_varobj/2
   from flrcompiler.

:- import 
        flora_decode_predicate/6,
        flora_module_predicate/4,
	flora_module_name/3,
	flora_fdb_storage_name/2,
	flora_fld_storage_name/2,
        is_flora_callable_literal/1
   from flrwrapper.

:- import flora_decode_goal_as_atom/2 from flrdecode.

:- import 
        flora_add_last/3,
        flora_trim_last/2
   from flrtrim.

:- import term_to_atom/2 from string.

:- export
	flora_debug_code/2,
	flora_temp_protect_call/2,
	flora_temp_unprotect_call/1,
	flora_define_predicate/1,
	flora_error_undefined/1,
	flora_error_notexported/1,
	flora_error_invalid_export/1.
