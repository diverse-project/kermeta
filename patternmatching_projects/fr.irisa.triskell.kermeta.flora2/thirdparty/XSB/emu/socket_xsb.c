/* File:      socket_xsb.c
** Author(s): juliana, davulcu, kifer, songmei yu
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
** $Id: socket_xsb.c,v 1.35 2005/12/22 23:33:58 tswift Exp $
** 
*/

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <signal.h>


/* wind2unix.h must be included after sys/stat.h */
#include "wind2unix.h"

#include "xsb_time.h"

/* The socket material */
#ifdef WIN_NT
#include <windows.h>
#include <winuser.h>
#include <winbase.h>
#include <process.h>
#include <tchar.h>
#include <io.h>
#include <stdarg.h>
#include <winsock.h>
#include "wsipx.h"
#else /* UNIX */
#include <sys/socket.h>
#include <sys/uio.h>
#include <netdb.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h> 
#include <fcntl.h> 
#endif 

#include "xsb_config.h"
#include "xsb_debug.h"
#include "socket_xsb.h"
#include "flags_xsb.h"
#include "thread_xsb.h"
#include "thread_defs_xsb.h"
#include "timer_xsb.h" 

#include "auxlry.h"
#include "cell_xsb.h"
#include "error_xsb.h"
#include "cinterf.h"
#include "basictypes.h"

#include "io_builtins_xsb.h"
#include "socket_xsb.h"
#include "psc_xsb.h"
#include "register.h"
#include "memory_xsb.h"

#ifdef WIN_NT
typedef int socklen_t;
#elif defined(SOLARIS)
typedef unsigned int socklen_t;
#endif

static u_long block_true = 1;
static u_long block_false = 0;

/* return error code handling */
static xsbBool set_error_code(CTXTdeclc int ErrCode, int ErrCodeArgNumber,char *Where);

/* In WIN_NT, this gets redefined into _fdopen by configs/special.h */
extern FILE *fdopen(int fildes, const char *type);

/* declare the utility functions for select calls (bodies of these functions are below) */
static void init_connections(CTXTdecl);
static void set_sockfd(int count);
static xsbBool list_sockfd(prolog_term list, fd_set *fdset, int *max_fd,
			   int **fds, int * size);
static void test_ready(CTXTdeclc prolog_term *avail_sockfds, fd_set *fdset,
		       int *fds, int size);
static void select_destroy(char *connection_name);
static int getsize (prolog_term list);
static int checkslot (void);

/* define the structure for select call */
static struct connection_t {
     char *connection_name;
     int maximum_fd;
     int empty_flag;
     int sizer;	/* size of read fds */
     int sizew;	/* size of write fds */
     int sizee;	/* size of exception fds */
     fd_set readset;	
     fd_set writeset;
     fd_set exceptionset;
     int *read_fds;	/* array of read fds */ 
     int *write_fds;	/* array of write fds */
     int *exception_fds; 	/* array of exception fds */
} connections[MAXCONNECT];

static char *get_host_IP(char *host_name_or_IP) {
     struct hostent *host_struct;
     struct in_addr *ptr;
     char **listptr;
 
     /* if host_name_or_IP is an IP addr, then just return; else use 
	gethostbyname */
     if (IS_IP_ADDR(host_name_or_IP))
	  return(host_name_or_IP);
     host_struct = gethostbyname(host_name_or_IP);
  
     listptr = host_struct->h_addr_list;

     if ((ptr = (struct in_addr *) *listptr++) != NULL) {
	  xsb_mesg(" IP address: %s", inet_ntoa(*ptr));
	  return(inet_ntoa(*ptr));
     }
     return NULL;
}

/**
 * Translates from the XSB-defined value for a socket domains
 * specified by xsb_domain to system-specific value for that socket
 * domains and stores this system-specific value in socket_domain.
 * Returns TRUE if the conversion was successful, FALSE otherwise.
 */
static int translate_domain(int xsb_domain, int *socket_domain) {
     if (xsb_domain == 0) {
	  *socket_domain = AF_INET;
	  return TRUE;
     } else if (xsb_domain == 1) {
	  *socket_domain = AF_UNIX;
	  xsb_abort("[SOCKET_REQUEST] domain AF_INET is not implemented");
	  return TRUE;
     } else {
	  xsb_abort("[SOCKET_REQUEST] Invalid domain (%d). Valid domains are: 0 - AF_INET, 1 - AF_UNIX", xsb_domain);
	  return FALSE;
     }    
}

/**
 * Calls select() on the socked specified by sock_handle, waiting
 * for at most timeout seconds.  Returns non-zero if a call to read()
 * will return immediately, zero otherwise.
 */
int read_select(SOCKET sock_handle, int timeout) {
     int rc = 0;
     fd_set fds;
     struct timeval tv;

     FD_ZERO(&fds);
     FD_SET(sock_handle, &fds);
     tv.tv_sec = timeout;
     tv.tv_usec = 0;

     if (tv.tv_sec > 0) {
	  rc = select(sock_handle+1, &fds, NULL, NULL, &tv);
	  if (rc < 0) {
	       rc = 0;
	  } else {
	       rc = FD_ISSET(sock_handle, &fds);
	  }
     } else {
	  rc = 1;
     }
     return rc;
}
  
/**
 * Calls select() on the socked specified by sock_handle, waiting
 * for at most timeout seconds.  Returns non-zero if a call to write()
 * will return immediately, zero otherwise.
 */
int write_select(SOCKET sock_handle, int timeout) {
     int rc = 0;
     fd_set fds;
     struct timeval tv;

     FD_ZERO(&fds);
     FD_SET(sock_handle, &fds);
     tv.tv_sec = timeout;
     tv.tv_usec = 0;

     if (tv.tv_sec > 0) {
	  rc = select(sock_handle+1, NULL, &fds, NULL, &tv);
	  if (rc < 0) {
	       rc = 0;
	  } else {
	       rc = FD_ISSET(sock_handle, &fds);
	  }
     } else {
	  rc = 1;
     }

     return rc;
}
  
/* Returns:
   normal:  SOCK_OK
   EOF:     SOCK_READMSG_EOF
   error:   SOCK_READMSG_FAILED
   Read message header, then read the message itself.
*/
static int readmsg(SOCKET sock_handle, char **msg_buff, unsigned long *msg_len)	
{
     int actual_len;
     /* 4-char buf that keeps the length of the subsequent msg */
     char lenbuf[XSB_MSG_HEADER_LENGTH];
     unsigned int msglen, net_encoded_len;

     actual_len
	  = (long)recvfrom(sock_handle,lenbuf,XSB_MSG_HEADER_LENGTH,0,NULL,0);

     if (SOCKET_OP_FAILED(actual_len)) return SOCK_READMSG_FAILED;
     if (actual_len == 0) {
	  *msg_buff = NULL;
	  return SOCK_READMSG_EOF;
     }

     memcpy((void *) &net_encoded_len, (void *) lenbuf, XSB_MSG_HEADER_LENGTH);
     msglen = ntohl(net_encoded_len);
     *msg_len = (msglen+1)*sizeof(char);

     if ((*msg_buff = (char *)mem_calloc(msglen+1, sizeof(char),OTHER_SPACE)) == NULL) {
	  xsb_abort("[SOCKET_RECV] Can't allocate memory for the message buffer");
     }

     actual_len = (long) recvfrom(sock_handle,*msg_buff,msglen,0,NULL,0);
     if (SOCKET_OP_FAILED(actual_len)) return SOCK_READMSG_FAILED;

     /* The following should never arise. Points to a bug: some kind of mismatch
	between the communicating machines. */
     if ((unsigned int)actual_len != msglen)
	  xsb_warn("[SOCKET_RECV] Message length %ld differs from the header value %ld",
		   msglen, actual_len);

     return SOCK_OK;
}

static int socket_accept(CTXTdeclc SOCKET *sock_handle, int timeout) {     
     SOCKET sock_handle_in = (SOCKET) ptoc_int(CTXTc 2);
     if (read_select(sock_handle_in, timeout)) {
	  *sock_handle = accept(sock_handle_in, NULL, NULL);
	  return NORMAL_TERMINATION;
     } else {
	  return TIMED_OUT;
     }
}

static int socket_connect(CTXTdeclc int *rc, int timeout) {
     int error;
     socklen_t len;
     SOCKET sock_handle;
     int domain, portnum;
     SOCKADDR_IN socket_addr;
    
     domain = ptoc_int(CTXTc 2);
     sock_handle = (SOCKET) ptoc_int(CTXTc 3);
     portnum = ptoc_int(CTXTc 4);

     /** this may not set domain to a valid value; in this case the connect() will fail */
     translate_domain(domain, &domain);
    
     /*** prepare to connect ***/
     FillWithZeros(socket_addr);
     socket_addr.sin_port = htons((unsigned short)portnum);
     socket_addr.sin_family = AF_INET;
     socket_addr.sin_addr.s_addr =
	  inet_addr((char*)get_host_IP(ptoc_string(CTXTc 5)));

     
     if (timeout > 0) {
	  /* Set up timeout */
	  

	  if(! SET_SOCKET_BLOCKING(sock_handle, block_false)) {
	       xsb_error("Can't save options");
	       return TIMER_SETUP_ERR;
	  }
	  
	  /* This will return immediately */
	  *rc = connect(sock_handle,(PSOCKADDR)&socket_addr,sizeof(socket_addr));
	  error = XSB_SOCKET_ERRORCODE;

	  /* restore flags */
	  if(! SET_SOCKET_BLOCKING(sock_handle, block_true)) {
	       xsb_error("Can't restore the flags: %d (0x%x)", XSB_SOCKET_ERRORCODE, XSB_SOCKET_ERRORCODE);
	       return TIMER_SETUP_ERR;
	  }
	  
	  /* return and indicate an error immediately unless the connection
	   * was successful or the connect is still in progress. */
	  if(*rc < 0 && error != EINPROGRESS && error != EWOULDBLOCK) {
	       *rc = error;
	       return NORMAL_TERMINATION; /* Since it didn't time out */
	  }
	  
	  /* Wait until the connect is completed (or a timeout occurs) */
	  error = write_select(sock_handle, timeout);
	  
	  if(error == 0) {
	       closesocket(sock_handle);
               *rc = XSB_SOCKET_ERRORCODE;
	       return TIMED_OUT;
	  }
	  
	  /* Get the return code from the connect */
	  len=sizeof(error);
	  error = GETSOCKOPT(sock_handle, SOL_SOCKET, SO_ERROR, &error, &len);
	  if(error < 0) {
	       xsb_error("GETSOCKOPT failed");
	       *rc = error;
	       return NORMAL_TERMINATION; /* Since it didn't time out */
	  }
	  
	  /* error=0 means success, otherwise it contains the errno */
	  if(error) {
	       *rc = error;
	       return NORMAL_TERMINATION; /* Since it didn't time out */
	  }
	  
	  *rc = sock_handle;
	  return NORMAL_TERMINATION;
     } else {
	  *rc = connect(sock_handle,(PSOCKADDR)&socket_addr,sizeof(socket_addr));
	  return NORMAL_TERMINATION;
     }
}

static int socket_recv(CTXTdeclc int *rc, char** buffer, unsigned long *buffer_len, int timeout) {
     SOCKET sock_handle = (SOCKET) ptoc_int(CTXTc 2);
     if (read_select(sock_handle, timeout)) {
	  *rc = readmsg(sock_handle, buffer, buffer_len);
	  return NORMAL_TERMINATION;
     } else {
	  return TIMED_OUT;
     }
}

static int socket_send(CTXTdeclc int *rc, int timeout) {
     SOCKET sock_handle = (SOCKET) ptoc_int(CTXTc 2);
     char *send_msg_aux = ptoc_string(CTXTc 3);
     unsigned int msg_body_len, network_encoded_len;
     char *message_buffer;

     if (!write_select(sock_handle, timeout)) {
	  return TIMED_OUT;
     }

     msg_body_len = strlen(send_msg_aux);

     /* We use the first XSB_MSG_HEADER_LENGTH bytes for the message size.*/
     message_buffer = mem_calloc(msg_body_len + XSB_MSG_HEADER_LENGTH + 1, sizeof(char),LEAK_SPACE);
     if (message_buffer == NULL) {
	  xsb_abort("[SOCKET_SEND] Can't allocate memory for the message buffer");
     }

     network_encoded_len = (unsigned int) htonl((unsigned long int) msg_body_len); 
     memcpy((void*) (message_buffer), (void *) &network_encoded_len, XSB_MSG_HEADER_LENGTH);
     strcpy(message_buffer + XSB_MSG_HEADER_LENGTH, send_msg_aux);

     *rc = sendto(sock_handle, message_buffer, msg_body_len+XSB_MSG_HEADER_LENGTH, 0, NULL, 0);
     mem_dealloc(message_buffer,(msg_body_len + XSB_MSG_HEADER_LENGTH + 1)*sizeof(char),LEAK_SPACE);

     return NORMAL_TERMINATION;
}

static int socket_get0(CTXTdeclc int *rc, char* message_read, int timeout) {
     SOCKET sock_handle;
     sock_handle = (SOCKET) ptoc_int(CTXTc 2);
     if (read_select(sock_handle, timeout)) {
	  *rc = recvfrom(sock_handle, message_read, 1, 0, NULL, 0);
	  return NORMAL_TERMINATION;
     } else {
	  return TIMED_OUT;
     }
}
  
static int socket_put(CTXTdeclc int *rc, int timeout) {
     SOCKET sock_handle;
     char tmpch;	
    
     sock_handle = (SOCKET) ptoc_int(CTXTc 2);
     tmpch = (char)ptoc_int(CTXTc 3);

     if (write_select(sock_handle, timeout)) {
        *rc = sendto(sock_handle, &tmpch, 1, 0, NULL,0);
	  return NORMAL_TERMINATION;
     } else {
	  return TIMED_OUT;
     }
}

/* in order to save builtin numbers, create a single socket function with
 * options socket_request(SockOperation,....)  */
xsbBool xsb_socket_request(CTXTdecl)
{
     int ecode = 0;  /* error code for socket ops */
     int timeout_flag;
     SOCKET sock_handle;
     int domain, portnum;
     SOCKADDR_IN socket_addr;
     struct linger sock_linger_opt;
     int rc;
     char *message_buffer;
     unsigned long msg_len;
     char char_read;

     switch (ptoc_int(CTXTc 1)) {
     case SOCKET_ROOT: /* this is the socket() request */
	  /* socket_request(SOCKET_ROOT,+domain,-socket_fd,-Error,_,_,_) 
	     Currently only AF_INET domain */
	  domain = ptoc_int(CTXTc 2); 
	  if (!translate_domain(domain, &domain)) {
	       return FALSE;
	  }
    
	  sock_handle = socket(domain, SOCK_STREAM, IPPROTO_TCP);
	
	  /* error handling */
	  if (BAD_SOCKET(sock_handle)) {
	       ecode = XSB_SOCKET_ERRORCODE;
	       perror("SOCKET_REQUEST");
	  } else {
	       ecode = SOCK_OK;
	  }

	  ctop_int(CTXTc 3, (SOCKET) sock_handle);
	
	  return set_error_code(CTXTc ecode, 4, "SOCKET_REQUEST");

     case SOCKET_BIND:
	  /* socket_request(SOCKET_BIND,+domain,+sock_handle,+port,-Error,_,_) 
	     Currently only supports AF_INET */
	  sock_handle = (SOCKET) ptoc_int(CTXTc 3);
	  portnum = ptoc_int(CTXTc 4);
	  domain = ptoc_int(CTXTc 2);

	  if (!translate_domain(domain, &domain)) {
	       return FALSE;
	  }
    
	  /* Bind server to the agreed upon port number.
	  ** See commdef.h for the actual port number. */
	  FillWithZeros(socket_addr);
	  socket_addr.sin_port = htons((unsigned short)portnum);
	  socket_addr.sin_family = AF_INET;
#ifndef WIN_NT
	  socket_addr.sin_addr.s_addr = htonl(INADDR_ANY);
#endif
    
	  rc = bind(sock_handle, (PSOCKADDR) &socket_addr, sizeof(socket_addr));
	
	  /* error handling */
	  if (SOCKET_OP_FAILED(rc)) {
	       ecode = XSB_SOCKET_ERRORCODE;
	       perror("SOCKET_BIND");
	  } else
	       ecode = SOCK_OK;

	  return set_error_code(CTXTc ecode, 5, "SOCKET_BIND");

     case SOCKET_LISTEN: 
	  /* socket_request(SOCKET_LISTEN,+sock_handle,+length,-Error,_,_,_) */
	  sock_handle = (SOCKET) ptoc_int(CTXTc 2);
	  rc = listen(sock_handle, ptoc_int(CTXTc 3));

	  /* error handling */
	  if (SOCKET_OP_FAILED(rc)) {
	       ecode = XSB_SOCKET_ERRORCODE;
	       perror("SOCKET_LISTEN");
	  } else
	       ecode = SOCK_OK;

	  return set_error_code(CTXTc ecode, 4, "SOCKET_LISTEN");

     case SOCKET_ACCEPT:
	  timeout_flag = socket_accept(CTXTc &rc, (int)pflags[SYS_TIMER]);
	  
	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 4, "SOCKET_SEND");
	  } else {
	       /* error handling */ 
	       if (BAD_SOCKET(rc)) {
		    ecode = XSB_SOCKET_ERRORCODE;
		    perror("SOCKET_ACCEPT");
		    sock_handle = rc; /* shut up warning */
	       } else {
		    sock_handle = rc; /* accept() returns sock_out */
		    ecode = SOCK_OK;
	       }
	       
	       ctop_int(CTXTc 3, (SOCKET) sock_handle);
	       
	       return set_error_code(CTXTc ecode,  4,  "SOCKET_ACCEPT");	  
	  }
     case SOCKET_CONNECT: {
	  /* socket_request(SOCKET_CONNECT,+domain,+sock_handle,+port,
	     +hostname,-Error) */
	  timeout_flag = socket_connect(CTXTc &rc, (int)pflags[SYS_TIMER]);

	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 6, "SOCKET_CONNECT");
	  } else if (timeout_flag == TIMER_SETUP_ERR) {
	       return set_error_code(CTXTc TIMER_SETUP_ERR, 6, "SOCKET_CONNECT");
	  } else {
	       /* error handling */
	       if (SOCKET_OP_FAILED(rc)) {
		    ecode = XSB_SOCKET_ERRORCODE;
		    perror("SOCKET_CONNECT");
		    /* close, because if connect() fails then socket becomes unusable */
		    closesocket(ptoc_int(CTXTc 3));
	       } else {
		    ecode = SOCK_OK;
	       }
	       return set_error_code(CTXTc ecode,  6,  "SOCKET_CONNECT");
	  }
     }

     case SOCKET_CLOSE: 
	  /* socket_request(SOCKET_CLOSE,+sock_handle,-Error,_,_,_,_) */
    
	  sock_handle = (SOCKET)ptoc_int(CTXTc 2);
    
	  /* error handling */
	  rc = closesocket(sock_handle);
	  if (SOCKET_OP_FAILED(rc)) {
	       ecode = XSB_SOCKET_ERRORCODE;
	       perror("SOCKET_CLOSE");
	  } else
	       ecode = SOCK_OK;
    
	  return set_error_code(CTXTc ecode, 3, "SOCKET_CLOSE");
    
     case SOCKET_RECV:
	  /* socket_request(SOCKET_RECV,+Sockfd, -Msg, -Error,_,_,_) */
	  timeout_flag = socket_recv(CTXTc &rc, &message_buffer, &msg_len, (int)pflags[SYS_TIMER]);
	  
	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 4, "SOCKET_SEND");
	  } else {
	       /* error handling */
	       switch (rc) {
	       case SOCK_OK:
		    ecode = SOCK_OK;
		    break;
	       case SOCK_READMSG_FAILED:
		    ecode = XSB_SOCKET_ERRORCODE;
		    perror("SOCKET_RECV");
		    break;
	       case SOCK_READMSG_EOF:
		    ecode = SOCK_EOF;
		    break;
	       default:
		    xsb_abort("[SOCKET_RECV] XSB bug: invalid return code from readmsg");
	       }
	       
	       if (message_buffer != NULL) {
		    ctop_string(CTXTc 3, (char*)string_find(message_buffer, 1));
		    mem_dealloc(message_buffer,msg_len,OTHER_SPACE);
	       } else {  /* this happens at end of file */
		    ctop_string(CTXTc 3, (char*)string_find("", 1));
	       }
	       
	       return set_error_code(CTXTc ecode, 4, "SOCKET_RECV");  
	  }
	       
     case SOCKET_SEND:
	  /* socket_request(SOCKET_SEND,+Sockfd, +Msg, -Error,_,_,_) */
	  timeout_flag = socket_send(CTXTc &rc, (int)pflags[SYS_TIMER]);
    
	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 4, "SOCKET_SEND");
	  } else {
	       /* error handling */
	       if (SOCKET_OP_FAILED(rc)) {
		    ecode = XSB_SOCKET_ERRORCODE;
		    perror("SOCKET_SEND");
	       } else {
		    ecode = SOCK_OK;
	       }
	       return set_error_code(CTXTc ecode,  4,  "SOCKET_SEND"); 
	  }

     case SOCKET_GET0:
	  /* socket_request(SOCKET_GET0,+Sockfd,-C,-Error,_,_,_) */
	  message_buffer = &char_read;
	  timeout_flag = socket_get0(CTXTc &rc, message_buffer, (int)pflags[SYS_TIMER]);
	  
	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 4, "SOCKET_SEND");
	  } else {
	       /*error handling */ 
	       switch (rc) {
	       case 1:
		    ctop_int(CTXTc 3,(unsigned char)message_buffer[0]);
		    ecode = SOCK_OK;
		    break;
	       case 0:
		    ecode = SOCK_EOF;
		    break;
	       default:
		    ctop_int(CTXTc 3,-1);
		    perror("SOCKET_GET0");
		    ecode = XSB_SOCKET_ERRORCODE;
	       }
	       
	       return set_error_code(CTXTc ecode,  4,  "SOCKET_GET0");
	  }    
     case SOCKET_PUT:
	  /* socket_request(SOCKET_PUT,+Sockfd,+C,-Error_,_,_) */
	  timeout_flag = socket_put(CTXTc &rc, (int)pflags[SYS_TIMER]);
	       
	  if (timeout_flag == TIMED_OUT) {
	       return set_error_code(CTXTc TIMEOUT_ERR, 4, "SOCKET_SEND");
	  } else {
	       /* error handling */
	       if (rc == 1) {
		    ecode = SOCK_OK;
	       } else if (SOCKET_OP_FAILED(rc)) {
		    ecode = XSB_SOCKET_ERRORCODE;
		    perror("SOCKET_PUT");
	       }
	       
	       return set_error_code(CTXTc ecode,  4,  "SOCKET_PUT");
	  }
     case SOCKET_SET_OPTION: {
	  /* socket_request(SOCKET_SET_OPTION,+Sockfd,+OptionName,+Value,_,_,_) */
    
	  char *option_name = ptoc_string(CTXTc 3);
    
	  sock_handle = (SOCKET)ptoc_int(CTXTc 2);

	  /* Set the "linger" parameter to a small number of seconds */
	  if (0==strcmp(option_name,"linger")) {
	       int  linger_time=ptoc_int(CTXTc 4);
      
	       if (linger_time < 0) {
		    sock_linger_opt.l_onoff = FALSE;
		    sock_linger_opt.l_linger = 0;
	       } else {
		    sock_linger_opt.l_onoff = TRUE;
		    sock_linger_opt.l_linger = linger_time;
	       }
      
	       if (SETSOCKOPT(sock_handle, SOL_SOCKET, SO_LINGER,
			      &sock_linger_opt, sizeof(sock_linger_opt))
		   < 0) {
		    xsb_warn("[SOCKET_SET_OPTION] Cannot set socket linger time");
		    return FALSE;
	       } 
	  }else {
	       xsb_warn("[SOCKET_SET_OPTION] Invalid option, `%s'", option_name);
	       return FALSE;
	  }
    
	  return TRUE;
     }

     case SOCKET_SET_SELECT:  {  
	  /*socket_request(SOCKET_SET_SELECT,+connection_name,
	    +R_sockfd,+W_sockfd,+E_sockfd) */
	  prolog_term R_sockfd, W_sockfd, E_sockfd;
	  int i, connection_count;
	  int rmax_fd=0, wmax_fd=0, emax_fd=0; 
	  char *connection_name = ptoc_string(CTXTc 2);
    
	  /* bind fds to input arguments */
	  R_sockfd = reg_term(CTXTc 3);
	  W_sockfd = reg_term(CTXTc 4);
	  E_sockfd = reg_term(CTXTc 5);	
    
	  /* initialize the array of connect_t structure for select call */	
	  init_connections(CTXT); 
    
	  /* check whether the same connection name exists */
	  for (i=0;i<MAXCONNECT;i++) {
	       if ((connections[i].empty_flag==FALSE) &&
		   (strcmp(connection_name,connections[i].connection_name)==0)) 	
		    xsb_abort("[SOCKET_SET_SELECT] Connection `%s' already exists!",
			      connection_name);
	  }
    
	  /* check whether there is empty slot left for connection */	
	  if ((connection_count=checkslot())<MAXCONNECT) {
	       if (connections[connection_count].connection_name == NULL) {
		    connections[connection_count].connection_name = connection_name;
		    connections[connection_count].empty_flag = FALSE;
	
		    /* call the utility function separately to take the fds in */
		    list_sockfd(R_sockfd, &connections[connection_count].readset,
				&rmax_fd, &connections[connection_count].read_fds,
				&connections[connection_count].sizer);
		    list_sockfd(W_sockfd, &connections[connection_count].writeset,
				&wmax_fd, &connections[connection_count].write_fds,
				&connections[connection_count].sizew);
		    list_sockfd(E_sockfd, &connections[connection_count].exceptionset, 
				&emax_fd,&connections[connection_count].exception_fds,
				&connections[connection_count].sizee);
	
		    connections[connection_count].maximum_fd =
			 xsb_max(xsb_max(rmax_fd,wmax_fd), emax_fd);
	       } else 
		    /* if this one is reached, it is probably a bug */
		    xsb_abort("[SOCKET_SET_SELECT] All connections are busy!");
	  } else
	       xsb_abort("[SOCKET_SET_SELECT] Max number of collections exceeded!");
    
	  return TRUE;
     }
  
     case SOCKET_SELECT: {
	  /* socket_request(SOCKET_SELECT,+connection_name, +timeout
	     -avail_rsockfds,-avail_wsockfds,
	     -avail_esockfds,-ecode)
	     Returns 3 prolog_terms for available socket fds */

	  prolog_term Avail_rsockfds, Avail_wsockfds, Avail_esockfds;
	  prolog_term Avail_rsockfds_tail, Avail_wsockfds_tail, Avail_esockfds_tail;

	  int maxfd;
	  int i;       /* index for connection_count */
	  char *connection_name = ptoc_string(CTXTc 2);
	  struct timeval *tv;
	  prolog_term timeout_term;
	  int timeout =0;
	  int connectname_found = FALSE;
	  int count=0;			

	  /* specify the time out */
	  timeout_term = reg_term(CTXTc 3);
	  if (isinteger(timeout_term)|isboxedinteger(timeout_term)) {
	       timeout = oint_val(timeout_term);
	       /* initialize tv */
	       tv = (struct timeval *)mem_alloc(sizeof(struct timeval),LEAK_SPACE);
	       tv->tv_sec = timeout;
	       tv->tv_usec = 0;
	  } else
	       tv = NULL; /* no timeouts */

	  /* initialize the prolog term */ 
	  Avail_rsockfds = p2p_new(CTXT);
	  Avail_wsockfds = p2p_new(CTXT);
	  Avail_esockfds = p2p_new(CTXT); 

	  /* bind to output arguments */
	  Avail_rsockfds = reg_term(CTXTc 4);
	  Avail_wsockfds = reg_term(CTXTc 5);
	  Avail_esockfds = reg_term(CTXTc 6);

	  Avail_rsockfds_tail = Avail_rsockfds;
	  Avail_wsockfds_tail = Avail_wsockfds;
	  Avail_esockfds_tail = Avail_esockfds;

	  c2p_list(CTXTc Avail_rsockfds_tail);
	  c2p_list(CTXTc Avail_wsockfds_tail);	
	  c2p_list(CTXTc Avail_esockfds_tail); 
    
	  for (i=0; i < MAXCONNECT; i++) {
	       /* find the matching connection_name to select */
	       if(connections[i].empty_flag==FALSE) {
		    if (strcmp(connection_name, connections[i].connection_name) == 0) {
			 connectname_found = TRUE;
			 count = i;
			 break;
		    } 
	       }
	  }
	  if( i >= MAXCONNECT )  /* if no matching connection_name */
	       xsb_abort("[SOCKET_SELECT] connection `%s' doesn't exist",
			 connection_name); 
    
	  /* compute maxfd for select call */
	  maxfd = connections[count].maximum_fd + 1;

	  /* FD_SET all sockets */
	  set_sockfd( count );

	  /* test whether the socket fd is available */
	  rc = select(maxfd, &connections[count].readset, 
		      &connections[count].writeset,
		      &connections[count].exceptionset, tv);
    
	  /* error handling */	
	  if (rc == 0)     /* timed out */
	       ecode = TIMEOUT_ERR;
	  else if (SOCKET_OP_FAILED(rc)) {
	       perror("SOCKET_SELECT");
	       ecode = XSB_SOCKET_ERRORCODE;
	  } else {      /* no error */
	       ecode = SOCK_OK;
	 
	       /* call the utility function to return the available socket fds */
	       test_ready(CTXTc &Avail_rsockfds_tail, &connections[count].readset,
			  connections[count].read_fds,connections[count].sizer);

	       test_ready(CTXTc &Avail_wsockfds_tail, &connections[count].writeset,
			  connections[count].write_fds,connections[count].sizew);

	       test_ready(CTXTc &Avail_esockfds_tail,&connections[count].exceptionset,
			  connections[count].exception_fds,connections[count].sizee);
	  }

	  if (tv) mem_dealloc((struct timeval *)tv,sizeof(struct timeval),LEAK_SPACE);
	  return set_error_code(CTXTc ecode, 7, "SOCKET_SELECT");
     }

     case SOCKET_SELECT_DESTROY:  { 
	  /*socket_request(SOCKET_SELECT_DESTROY, +connection_name) */
	  char *connection_name = ptoc_string(CTXTc 2);
	  select_destroy(connection_name);
	  return TRUE;
     }

     default:
	  xsb_warn("[SOCKET_REQUEST] Invalid socket request %d", (int) ptoc_int(CTXTc 1));
	  return FALSE;
     }

     /* This trick would report a bug, if a newly added case
	doesn't have a return clause */
     xsb_bug("SOCKET_REQUEST case %d has no return clause", ptoc_int(CTXTc 1));
}


static xsbBool set_error_code(CTXTdeclc int ErrCode, int ErrCodeArgNumber, char *Where)
{
     prolog_term ecode_value_term, ecode_arg_term = p2p_new(CTXT);
  
     ecode_value_term = reg_term(CTXTc ErrCodeArgNumber);
     if (!isref(ecode_value_term) && 
	 !(isinteger(ecode_value_term)|isboxedinteger(ecode_value_term)))
	  xsb_abort("[%s] Arg %d (the error code) must be a variable or an integer!",
		    Where, ErrCodeArgNumber);

     c2p_int(CTXTc ErrCode, ecode_arg_term);
     return p2p_unify(CTXTc ecode_arg_term, ecode_value_term);
}

/* initialize the array of the structure */
static void init_connections(CTXTdecl) 
{
     int i;  
     static int initialized = FALSE; /* This is only initialized once. */

     SYS_MUTEX_LOCK(MUTEX_SOCKETS);

     if (!initialized) {
	  for (i=0; i<MAXCONNECT; i++) {
	       connections[i].connection_name = NULL; 
	       connections[i].maximum_fd=0;
	       connections[i].empty_flag=TRUE;
	       /*clear all FD_SET */
	       FD_ZERO(&connections[i].readset);
	       FD_ZERO(&connections[i].writeset);
	       FD_ZERO(&connections[i].exceptionset);
      
	       connections[i].read_fds = 0;
	       connections[i].write_fds = 0 ;
	       connections[i].exception_fds = 0; 
	       connections[i].sizer= 0;
	       connections[i].sizew = 0 ;
	       connections[i].sizee = 0 ;
	  }
	  initialized = TRUE;
     }

     SYS_MUTEX_UNLOCK(MUTEX_SOCKETS);
}

/* FD_SET the socket fds */
static void set_sockfd(int count)
{
     int i;
  
     FD_ZERO(&connections[count].readset);
     FD_ZERO(&connections[count].writeset);
     FD_ZERO(&connections[count].exceptionset);
  
     for (i=0; i< connections[count].sizer; i++) {
	  /* turn on the bit in the fd_set */
	  FD_SET(connections[count].read_fds[i], &connections[count].readset);
     }

     for (i=0; i< connections[count].sizew; i++) {
	  /* turn on the bit in the fd_set */
	  FD_SET(connections[count].write_fds[i], &connections[count].writeset);
     }

     for (i=0; i< connections[count].sizee; i++) {
	  /* turn on the bit in the fd_set */
	  FD_SET(connections[count].exception_fds[i],
		 &connections[count].exceptionset);
     }
}

/* utility function to take the user specified fds in and prepare for
   select call */

static xsbBool list_sockfd(prolog_term list, fd_set *fdset, int *max_fd,
			   int **fds, int * size)
{
     int i=0;
     prolog_term local=list;
     prolog_term head;

     *size = getsize(local);
     *fds = (int*)mem_alloc(sizeof(int)*(*size),OTHER_SPACE);

     while (!isnil(list)) {
	  head = p2p_car(list);
	  (*fds)[i++] = p2c_int(head);
	  list = p2p_cdr(list);
     }

     for (i=0; i<(*size); i++) {
	  /* turn on the bit in the fd_set */
	  FD_SET((*fds)[i], fdset);
	  *max_fd = xsb_max(*max_fd, (*fds)[i]);
     }

     return TRUE;
}

/* utility function to return the available socket descriptors after testing */
static void test_ready(CTXTdeclc prolog_term *avail_sockfds, fd_set *fdset,
		       int *fds, int size) 
{
     prolog_term head;
     int i=0;

     for (i=0;i<size;i++) {
	  if (FD_ISSET(fds[i], fdset)) {
	       head = p2p_car(*avail_sockfds);
	       c2p_int(CTXTc fds[i], head);
	       *avail_sockfds = p2p_cdr(*avail_sockfds);
	       c2p_list(CTXTc *avail_sockfds);
	  } 
     }
     c2p_nil(CTXTc *avail_sockfds);
     return;
}

/* utility function to destroy a select call */
static void select_destroy(char *connection_name)
{
     int i;
     int connectname_found = FALSE;

     for (i=0; i < MAXCONNECT; i++) {
	  if(connections[i].empty_flag==FALSE) {
	       /* find the matching connection_name to destroy */
	       if (strcmp(connection_name, connections[i].connection_name) == 0) {
		    connectname_found = TRUE;
	      
		    /* destroy the corresponding structure */
		    FD_ZERO(&connections[i].readset);
		    FD_ZERO(&connections[i].writeset);
		    FD_ZERO(&connections[i].exceptionset);

		    connections[i].connection_name = NULL;
		    connections[i].maximum_fd = 0;

		    /* free the fds obtained by mem_alloc() */
		    mem_dealloc(connections[i].read_fds,connections[i].sizer,OTHER_SPACE);
		    mem_dealloc(connections[i].write_fds,connections[i].sizew,OTHER_SPACE);
		    mem_dealloc(connections[i].exception_fds,connections[i].sizee,OTHER_SPACE); 
      
		    connections[i].sizer = 0;
		    connections[i].sizew = 0 ;
		    connections[i].sizee = 0 ;

		    connections[i].empty_flag = TRUE; /* set the destroyed slot to empty */
		    break;
	       }
	  }
     }
  
     /* if no matching connection_name */
     if (!connectname_found)
	  xsb_abort("[SOCKET_SELECT_DESTROY] connection `%s' doesn't exist", 
		    connection_name);
  
}

/* utility function to check whether there is empty slot left to connect */
static int checkslot (void) {
     int i;
     for (i=0; i<MAXCONNECT;i++) {
	  if (connections[i].empty_flag == TRUE) break;
     }
     return i;
}

/* get the size of the list input from prolog side */
static int getsize (prolog_term list)
{
     int size = 0;
     prolog_term head;

     while (!isnil(list)) {
	  head = p2p_car(list);
	  if(!(isinteger(head)|isboxedinteger(head))) 
	       xsb_abort("A non-integer socket descriptor encountered in a socket operation");
	  list = p2p_cdr(list);
	  size++;
     }

     return size;
}
