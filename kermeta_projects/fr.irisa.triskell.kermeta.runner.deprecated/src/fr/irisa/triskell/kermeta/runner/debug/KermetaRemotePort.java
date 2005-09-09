/* $Id: KermetaRemotePort.java,v 1.1 2005-09-09 17:57:41 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaRemotePort.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 7, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;


/**
 * 
 * This class implements the server side of the debugger plugin.
 *
 */
public class KermetaRemotePort
{
	public ServerSocket server;
	public Socket client;
	public PrintWriter writer;
	public BufferedReader reader;
	public OutputStream outputStream;
	public InputStream inputStream;
	//public int mServer.getLocalPort();
	private Thread connectionThread;
	private volatile boolean stop;
	
	public static int waitOK = 1;
	public static int waitTerminate = 2;
	public static int waitError = 3;
	final static int startPortSearch = 5000;
	final static int endPortSearch = 10000;
    private DebugInterpreter interpreter;
	
	public KermetaRemotePort()
	{
		reset();
		//mServer.getLocalPort() = -1;

	}

	

	void reset()
	{
		shutdown();
		stop = false;
		server = null;
		client = null;
		writer = null;
		reader = null;
		inputStream = null;
		outputStream = null;
		connectionThread = null;

	}
	public void shutdown()
	{
		try
		{
			stop = true;
			if (reader != null)
				reader.close();
			if (writer != null)
				writer.close();
			if (client != null)
				client.close();
			if (server != null)
				server.close();

		} catch (IOException e)
		{
			RunnerPlugin.log(e);
		}
	}

	/** *
	 * Start the connection of the server
	 * @return
	 */
	public boolean startConnect()
	{
		boolean found;
		reset();
		found= false;
		// Try to connect until a free port is found
		for (int i = startPortSearch;(i < endPortSearch) && !found; i++)
		{
		    found = true;
		    try
		    {
		        server = new ServerSocket(i);
		    }
		    catch (IOException e)
		    {
		        found = false;
		        System.err.println("Kermeta debugger error : "+ e);
		        e.printStackTrace();
		    }
		}
		if (!found)
		{
		    RunnerPlugin.log(
		            new InstantiationException("Couldn't not listen on server port ! No free port available!"));
		    return false;
		}
		
		client = null;

		// Create the connection thread
		connectionThread = new Thread()
		{
			public void run()
			{
				int port = server.getLocalPort();
				
				try
				{
					System.out.println(
						"Trying to Accept on Port" + server.getLocalPort());
					client = server.accept();
					System.out.println(
						"Accept on Port "
							+ server.getLocalPort()
							+ "!!!!!!!\n");
				} catch (IOException e)
				{
					System.out.println(
						"Accept failed: " + port);
				}
			}
		};
		// Start it
		connectionThread.start();

		return true;
	}

	public int waitForConnect(boolean fTimeOut)
	{
		int port =  server.getLocalPort();
		try
		{
			//synchronized (this)
			{
				for (int x = 0;
					((x < 1000) || (!fTimeOut)) && (client == null);
					++x)
				{
					if (stop)
						break;
					/*System.out.println(
						"Waiting for connect Port "
							+ port
							+ "(Try "
							+ x
							+ " of 100)\n");
							*/
					Thread.sleep(100);
					
				}
			}

			if (client == null)
			{
				shutdown();
				if (stop)
					return (waitTerminate);
				else
					return waitError;
			}

			writer = new PrintWriter(client.getOutputStream(), true);
			reader =
				new BufferedReader(
					new InputStreamReader(client.getInputStream()));
		} catch (IOException e)
		{
			RunnerPlugin.log(
				new InstantiationException("Failing establish Communication with Debug Process  !!!"));
			return waitError;
		} catch (InterruptedException e)
		{
			RunnerPlugin.log(
				new InstantiationException("Failing establish Communication with Debug Process  !!!"));
			return waitError;
		}

		return waitOK;
	}

	public boolean isConnected()
	{
		return (client != null);
	}

	public OutputStream getOutputStream()
	{
		if (!isConnected())
			return null;

		if (outputStream == null)
			try
			{
				outputStream = client.getOutputStream();
			} catch (IOException e)
			{
				RunnerPlugin.log(e);
			}

		return outputStream;
	}
	public PrintWriter getWriteStream()
	{
		if (!isConnected())
			return null;

		if (writer == null)
			writer = new PrintWriter(getOutputStream(), true);

		return writer;
	}

	public InputStream getInputStream()
	{
		if (!isConnected())
			return null;

		if (inputStream == null)
			try
			{
				inputStream = client.getInputStream();
			} catch (IOException e)
			{
				RunnerPlugin.log(e);
			}
		return inputStream;

	}

	public BufferedReader getReadStream()
	{
		if (!isConnected())	return null;
		if (reader == null)
			reader = new BufferedReader(new InputStreamReader(getInputStream()));
		return reader;
	}
	

	public int getServerPort()
	{
		return server.getLocalPort();
	}
	
	/** Find a free port*/
	public static int findFreePort() 
	{
		boolean found;
		ServerSocket s = null;
		found= false;
					for (int i = startPortSearch;(i < endPortSearch) && !found; i++)
					{
						found = true;
						try
						{
							s = new ServerSocket(i);
						} catch (IOException e)
						{
							found = false;
						}
					}

					if (!found)
					{
						RunnerPlugin.log(
							new InstantiationException("Couldn't not listen on server port ! No free port available!"));
						return -1;
					}
		int port = 	s.getLocalPort();
		try
		{
			s.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return port;
	}



    /**
     * @param interpreter
     */
    public void setInterpreter(DebugInterpreter pinterpreter) {
        interpreter = pinterpreter;
    }
	
    public DebugInterpreter getInterpreter() { return interpreter; }
	
}
