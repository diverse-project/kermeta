/* File:      flag_defs_xsb.h
** Author(s): Jiyang Xu, Kostis Sagonas, Ernie Johnson
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
** $Id: flag_defs_xsb.h,v 1.18 2006/07/08 18:49:11 tswift Exp $
** 
*/


/* -------- system flags --------------------------------------------------*/

/*	used by interpreter ->  Y/N ; read only -> R/W/N (no access)	   */

/* Thread private flags */

#define STACK_REALLOC    1      /* 1 = allow realloc of stacks on Oflow YW */
#define CURRENT_INPUT	 2	/* current input file descriptor	NW */
#define CURRENT_OUTPUT	 3	/* current output file descriptor	NW */
#define SYS_TIMER        4      /* XSB Timer	    	    	    	MK */
#define VERBOSENESS_LEVEL 5     /* how verbose debug messages should be    */
#define GARBAGE_COLLECT  6      /* type of garbage collection employed:    */
                                /* 0 = none; 1 = sliding; 2 = copying.  NW */
#define CLAUSE_INT	 7	/* for clause interrupt			YW */
#define BACKTRACE	 8	/* for backtracing on error      Y/N       */
/* the following three flags are only in effect when
   the system is compiled with --enable-debug         --lfcastro           */
#define VERBOSE_GC       9      /* be verbose on garbage collection        */
#define COUNT_CHAINS    10      /* count size of chains on GC              */
#define EXAMINE_DATA    11      /* examine data on GC                      */
#define PROFFLAG        12
#define TABLING_METHOD	13      /* Default method used to evaluate tabled */
#define CLAUSE_GARBAGE_COLLECT 14 /* Turn clause gc on or off */
/* Flags 14-24 are open to use */

/*
 *  Flags 25-41 are reserved for Interrupt Handler PSCs.
 */
#define INT_HANDLERS_FLAGS_START   25  /* the first interrupt flag */

/* ----------------------------------------------------------------------------
   The following exist/are defined in sig_xsb.h:

 MYSIG_UNDEF      0    // _$load_undef
 MYSIG_KEYB       1    // _$keyboard_int
 MYSIG_SPY        3    // _$deb_spy
 MYSIG_TRACE      4    // _$deb_trace
 MYSIG_ATTV       8    // _$attv_int
 MYSIG_CLAUSE    16    // _$clause_int

These values are added to INT_HANDLERS_FLAGS_START to obtain the actual
interrupt flag
---------------------------------------------------------------------------- */
#define MAX_PRIVATE_FLAGS 42

/* Thread shared flags */

#define TRACE_STA	42	/* 1 = keep max stack size stats	YW */
#define CURRENT_MODULE	43	/* current module. USERMOD_PSC=usermod  YW */
#define MOD_LIST	44	/* the list of module (Psc) entries	YR */
#define BANNER_CTL      45      /* Controls whether banner, "loaded" msgs
				   are displayed; passed to Prolog side.
				   Check BANNER_CTL values at the end      */
#define CMD_LINE_GOAL  	46	/* The Prolog goal passed on cmd 
				   line with -e	       	       	           */
#define USER_HOME  	47	/* $HOME, if not null. Else INSTALL_DIR    */
#define INSTALL_DIR	48	/* set dynamically in orient_xsb.c         */
#define CONFIG_FILE	49	/* Where xsb_configuration.P lives	   */
/* loader uses CONFIG_NAME flag before xsb_configuration is loaded */
#define CONFIG_NAME	50	/* this looks like this: cpu-vendor-os	   */
#define LETTER_VARS	51      /* For printing vars in the interpreter */
#define BOOT_MODULE     52      /* First file loaded; usually loader.P  */
#define CMD_LOOP_DRIVER 53      /* File that contains top-level command
				     loop driver */
#define NUM_THREADS     54      /* always 1 in the sequential system     NW*/
#define THREAD_RUN	55      /* PSC for the thread handler predicate  NN*/
#define STDERR_BUFFERED	56      /* Allow Cinterface to read Stderr back from buffer*/

/* The following flags may be made private in the future */

#define PIL_TRACE 	57	/* 0 = pil trace off, 1 = on		YW */
#define HITRACE		58	/* 0 = hitrace off, 1 = on		YW */
#define DEBUG_ON	59	/* 1 = debug on; 0 = off 		YW */
#define HIDE_STATE	60	/* 0 = no hide, >0 = hide level 	YW */
#define TRACE		61	/* 1 = trace on, 0 = trace off	    	YW */
#define INVOKE_NUM	62	/* debugger, the ordinal invoke number 	NW */
#define SKIPPING	63	/* debugger, 1 = skip, 0 = not	   	NW */
#define QUASI_SKIPPING	64	/* debugger, 1 = quasi skip, 0 = not	NW */

/* The following flags may be obsolete */

#define DCG_MODE        65      /* DGC mode: standard or xsb	           */

/* This flag is used by the loader to tell itself whether it should look into
   user-supplied library search paths or not. If 0, the loader will look only
   in lib/syslib/cmplib. If 1, the loader will look in library_directory/1
   before checking the standard places. */
#define LIBS_LOADED	  66

#define ORA_INPUTARRAY_LENGTH     67   /* max # simultaneous input tuples */
#define ORA_INPUTARRAY_WIDTH      68   /* max size of each input value    */
#define ORA_OUTPUTARRAY_LENGTH    69   /* max # simultaneous output tuples */



#define MAX_FLAGS		75

#define MAXTOINDEX 5              /* depth in term to go when using deep indexing */

/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

/* Banner control values recognized on the Prolog side. 
   MUST BE PRIME NUMBERS */
#define NOBANNER          2   /* don't display XSB banner */
#define QUIETLOAD    	  3   /* don't display "module loaded" msgs */
#define NOPROMPT    	  5   /* display no prompt--useful in spawned
				 subprocesses */
