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
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.compiler.commandline.KermetaCompiler;
import org.kermeta.language.structure.ModelingUnit;
//import org.kermeta.scala.parser.art2.impl.Art2ComponentKMTLoader;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;



/**
 *
 */
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
        KermetaCompiler compiler = new KermetaCompiler(targetFolder, targetFolder,false,true, new StdioSimpleMessagingSystem());
		compiler.kp2bytecode(kpFile);
		
		
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
        

    }
}
