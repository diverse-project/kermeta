/* $Id: KermetaRemotePort.java,v 1.1 2005-11-04 17:01:09 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaRemotePort.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * 
 * This class implements the server side of the debugger plugin.
 * 
 */
public class KermetaRemotePort {
	
	public ServerSocket server;
	// The service socket is the socket created when the client got connected to the server.
	public Socket service;
	public Socket client;

	public OutputStreamWriter writer;

	public BufferedReader reader;

	// public int mServer.getLocalPort();
	private Thread connectionThread;

	private volatile boolean stop;

	public static int waitOK = 1;

	public static int waitTerminate = 2;

	public static int waitError = 3;

	final static int startPortSearch = 5000;

	final static int endPortSearch = 10000;

	private DebugInterpreter interpreter;

	private static final Random fgRandom= new Random(System.currentTimeMillis());
	
	public KermetaRemotePort() {
		reset();
		// mServer.getLocalPort() = -1;

		
	}

	void reset() {
		shutdown();
		stop = false;
		server = null;
		service = null;
		writer = null;
		reader = null;
		connectionThread = null;

	}

	public void shutdown() {
		try {
			stop = true;
			if (reader != null)
				reader.close();
			if (writer != null)
				writer.close();
			if (service != null)
				service.close();
			if (server != null)
				server.close();

		} catch (IOException e) {
			RunnerPlugin.log(e);
		}
	}

	/***************************************************************************
	 * Start the connection of the server
	 * 
	 * @return
	 * @exception IOException : see findfreeport
	 */
	public boolean startConnect() throws IOException {
		reset();
		// Try to connect until a free port is found
		int debugPort = findFreePort();
		server = new ServerSocket(debugPort);
		System.out.println("I created a server on port : " + debugPort);
		service = null;
		// Create the connection thread
		// PyDev : see connectThread variable in RemoteDebugger
		connectionThread = new Thread() {
			public void run() {
				int port = server.getLocalPort();

				try {
					server.setSoTimeout(5000); //FIXME not hard-code
					System.out.println("Trying to Accept on Port : "
							+ server.getLocalPort());
					service = server.accept();
					System.err.println("OK Accept on Port "
							+ server.getLocalPort() + "!!!!!!!\n");
				} catch (IOException e) {
					System.out.println("Accept failed: " + port);
				}
			}
		};
		// Start it
		connectionThread.start();
		return true;
	}

	/**
	 * Wait for a connection from the service until 
	 * @param fTimeOut
	 * @return
	 */
	public int waitForConnect(boolean fTimeOut) {
		int port = server.getLocalPort();
		try {
			// synchronized (this)
			{
				for (int x = 0; ((x < 1000) || (!fTimeOut)) && (service == null); ++x) {
					System.out.println("service:" + service);
					if (stop)
						break;
					/*
					 * System.out.println( "Waiting for connect Port " + port +
					 * "(Try " + x + " of 100)\n");
					 */
					Thread.sleep(100);

				}
			}

			if (service == null) {
				shutdown();
				if (stop)
					return (waitTerminate);
				else
					return waitError;
			}
			
			// Create the socket reader and writer
			writer = new OutputStreamWriter(service.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(service.getInputStream()));
		} catch (IOException e) {
			RunnerPlugin.log(new InstantiationException(
					"Failing establish Communication with Debug Process  !!!"));
			return waitError;
		} catch (InterruptedException e) {
			RunnerPlugin.log(new InstantiationException(
					"Failing establish Communication with Debug Process  !!!"));
			return waitError;
		}

		return waitOK;
	}

	public boolean isConnected() {
		return (service != null);
	}

	public OutputStreamWriter getWriter() {
		return writer;
	}
	
	public BufferedReader getReader() {
		return reader;
	}

	public int getServerPort() {
		return server.getLocalPort();
	}

	/** Find a free port 
	 *  Loosely picked from Pydev
	 * */
	public static int findFreePort() {
		for (int i= 0; i < 10; i++) {
			Socket s= null;
			int port= getRandomPort(startPortSearch, endPortSearch);
			try {
				s= new Socket("localhost", port);
			} catch (ConnectException e) {
				return port;
			} catch (IOException e) {
			} finally {
				if (s != null) {
					System.err.println("FINALLY BLOCK in KERMERTAREMOTEPORT");
					try {
						s.close();
					} catch (IOException ioe) {
					}
				}
			}
		}
		return -1;
	}
	
	private static int getRandomPort(int low, int high) {
		return (int)(fgRandom.nextFloat() * (high-low)) + low;
	}

    /** 
     * Pseudo-command pattern implementation.
     * Post a command to the server.
     * 
     */
    public void sendKermetaDebugCommand(String cmd) {
    	try {
    		writer.write(cmd);
        	writer.write("\n"); // coz we readLine
        	writer.flush();
        	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
	
	/**
	 * @param interpreter
	 */
	public void setInterpreter(DebugInterpreter pinterpreter) {
		interpreter = pinterpreter;
	}

	public DebugInterpreter getInterpreter() {
		return interpreter;
	}
	
	

}
