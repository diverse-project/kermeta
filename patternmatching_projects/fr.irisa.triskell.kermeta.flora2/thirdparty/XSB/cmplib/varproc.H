/* File:      varproc.H
** Author(s): Jiyang Xu, Terrance Swift, Kostis F. Sagonas
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
** $Id: varproc.H,v 1.6 2005/01/14 18:30:48 ruim Exp $
** 
*/



:- export force_varproc_loaded/0.
:- export varproc/3, vprag_common/2, vprag_argno/2, vprag_level/2,
	  vprag_context/2, vprag_loc/2, vprag_occ/2, vprag_type/2, 
	  vprag_use/2, vprag_nouse/2, vprag_lastchunk/2, vprag_type1/2.

:- import member/2, append/3, memberchk/2 from basics.
:- import closetail/1, length/2, member2/2 from listutil.

