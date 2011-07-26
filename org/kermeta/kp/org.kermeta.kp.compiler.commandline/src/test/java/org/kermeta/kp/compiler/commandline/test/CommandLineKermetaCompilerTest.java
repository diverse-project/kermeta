/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.test;

import java.io.IOException;

import junit.framework.TestCase;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;


public class CommandLineKermetaCompilerTest extends TestCase {
	String kpFile;
	String targetFolder;


    public CommandLineKermetaCompilerTest(String kpFile, String targetFolder) {
		super();
		this.kpFile = kpFile;
		this.targetFolder = targetFolder;
	}



	public void test() throws IOException  {
        System.out.println("Test compiling " + kpFile);
        System.out.println("            to " + targetFolder);
        
        // Phase 1 : compiles without crashing
        KermetaCompiler compiler = new KermetaCompiler(true, new StdioSimpleMessagingSystem(),false);
		compiler.kp2bytecode(kpFile, targetFolder, targetFolder, targetFolder,new java.util.ArrayList<String>(), false);
		
		assert(!compiler.hasFailed);
		// TODO add more phase and assertions, ex: run the result if runnable ?
		
        //assert(true);
    }

    
    @Override
    public String getName() {
        return kpFile;
    }

    @Override
    public void runTest() throws Throwable  {
        test();
    }

    @Override
    protected void tearDown() throws Exception {
        //
    }
}

