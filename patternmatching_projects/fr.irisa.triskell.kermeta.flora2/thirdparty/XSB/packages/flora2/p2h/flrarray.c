/* File:      flrarray.c
** Author(s): kifer
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
** $Id: flrarray.c,v 1.1 2002/05/18 23:17:10 kifer Exp $
** 
*/


#include "xsb_config.h"

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#ifdef WIN_NT
#define XSB_DLL
#endif

#include "auxlry.h"
#include "cell_xsb.h"
#include "error_xsb.h"
#include "cinterf.h"


#if 0
#define ARRAYDEBUG
#endif

#define ARRAY_CHUNKSIZE 1024
#define DIRECTORY_SIZE  4096

typedef prolog_term BlockType[];

static BlockType *Directory[DIRECTORY_SIZE];
static void allocate_new_block(long dir_index);


/*
  array_put(+index,+term)
  Always succeeds unless gives an error on array overflow.
*/
DllExport xsbBool call_conv array_put () {
  long position = ptoc_int(1);
  prolog_term pterm = reg_term(2);
  long dir_index   = position / ARRAY_CHUNKSIZE;
  int  chunk_index = position % ARRAY_CHUNKSIZE;

  if (Directory[dir_index] == NULL)
    allocate_new_block(dir_index);

  (*Directory[dir_index])[chunk_index] = pterm;

  return TRUE;
}


/*
  Allocate new block at directory index dir_index
*/
static void allocate_new_block(long dir_index)
{
  if (dir_index >= DIRECTORY_SIZE)
    xsb_abort("ARRAY_PUT: Cannot put term in array, directory size exceeded");

  if (Directory[dir_index] != NULL)
    xsb_abort("ARRAY_PUT: Internal bug, trying to change non-NULL directory entry");

  Directory[dir_index] =
    (BlockType *)calloc(sizeof (prolog_term *), ARRAY_CHUNKSIZE);
}


/*
  destroy_array/0
  Deallocates memory for the entire array
*/
DllExport xsbBool call_conv destroy_array()
{
  long i;
  for (i=0; i < DIRECTORY_SIZE; i++) {
    if (Directory[i] != NULL) {
      free(Directory[i]);
      Directory[i] = NULL;
    }
  }
  return TRUE;
}


/*
  array_get(+index, -term)
  If array doesn't have an entry at the given index, fail
  Otherwise, return term.
*/
DllExport xsbBool call_conv array_get()
{
  long index = ptoc_int(1);
  long dir_index   = index / ARRAY_CHUNKSIZE;
  int  chunk_index = index % ARRAY_CHUNKSIZE;
  prolog_term  pterm, out_term = reg_term(2);
  BlockType *block = Directory[dir_index];

  if (block == NULL) return FALSE;

  pterm = (*block)[chunk_index];
  if (pterm == (prolog_term)0) return FALSE;

  p2p_unify(out_term,pterm);
  return TRUE;
}

