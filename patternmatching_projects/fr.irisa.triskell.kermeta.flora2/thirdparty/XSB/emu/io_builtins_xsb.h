/* File:      io_builtins_xsb.h
** Author(s): kifer
** Contact:   xsb-contact@cs.sunysb.edu
** 
** Copyright (C) The Research Foundation of SUNY, 1999
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
** $Id: io_builtins_xsb.h,v 1.13 2005/12/31 01:43:34 tswift Exp $
** 
*/

#include "io_defs_xsb.h"
#include "token_xsb.h"

#define ERROR_ON_EOF         0 
#define EOF_CODE_ON_EOF   1
#define RESET_ON_EOF          2

typedef struct  {
  FILE *file_ptr;
  char *file_name;
  char io_mode;
  int stream_type;
  int reposition;
  int eof_action;
#ifdef MULTI_THREAD
  pthread_mutex_t stream_mutex;
#endif  
} stream_record;

extern stream_record open_files[];      /* Table of file pointers for open files */

#define OPENFILES_MUTEX(i) &(open_files[i].stream_mutex) 

extern int xsb_intern_fileptr(FILE *file,char *c,char *c2,char *c3);
extern int xsb_intern_file(char *c1,char *c2,int *i,char *strmode,int opennew);

extern void write_quotedname(FILE *file, char *string);
extern void double_quotes(char *string, char *new_string);
extern xsbBool quotes_are_needed(char *string);

int read_canonical_term(CTXTdeclc FILE *, STRFILE *, int);

void print_term_canonical(CTXTdeclc FILE *, Cell, int);

extern int get_more_chunk(CTXTdecl);
extern void findall_copy_to_heap(CTXTdeclc Cell, CPtr, CPtr *);
extern int findall_init_c(CTXTdecl);
extern void findall_free(CTXTdeclc int);
