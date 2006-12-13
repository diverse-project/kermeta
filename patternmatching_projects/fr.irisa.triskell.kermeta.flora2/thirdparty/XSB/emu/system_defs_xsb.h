/* File:      system_defs_xsb.h
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
** $Id: system_defs_xsb.h,v 1.8 2005/01/14 18:31:33 ruim Exp $
** 
*/

#define PLAIN_SYSTEM_CALL    	 0
#define SPAWN_PROCESS	         1
#define SHELL		         2
#define GET_PROCESS_TABLE    	 3
#define PROCESS_STATUS    	 4
#define PROCESS_CONTROL    	 5
#define SLEEP_FOR_SECS	      	 6

#define IS_PLAIN_FILE	     	 7
#define IS_DIRECTORY	     	 8

#define STAT_FILE_TIME           9
#define STAT_FILE_SIZE           10
#define EXEC                     11
#define GET_TMP_FILENAME         12
#define LIST_DIRECTORY           13
