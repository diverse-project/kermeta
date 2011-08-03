/* $Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.loader.kmt.scala.internal.parser;

import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;

import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.helpers.FileHelpers;
import java.io.File;


public class ScalaKMTParserTest extends TestCase {
	File kmtFile;
	boolean mustBeValid;


    public ScalaKMTParserTest(File kpFile, boolean mustBeValid) {
		super();
		this.kmtFile = kpFile;
		this.mustBeValid = mustBeValid;
	}



	public void test() throws IOException  {
        System.out.println("Test parsing "+ (mustBeValid ? "valid " : "invalid ") + kmtFile);
        
        //java.net.URL url = kmtFile.toURI().toURL();
       // FileHelpers fileHelper = new FileHelpers();
        java.net.URL url = FileHelpers.FileToURL(kmtFile);
        KMTparser parser = new KMTparser();
        ErrorAwareMessagingSystem messagingSystem = new ErrorAwareMessagingSystem();
        ModelingUnit mu = parser.load(url, "", messagingSystem);
                
		if(mustBeValid){
	        if(!messagingSystem.errorTrace.isEmpty()){
	        	assertTrue(messagingSystem.errorTrace.get(0), messagingSystem.errorTrace.isEmpty());
	        }
			assertTrue("Failure: ModelingUnit is null ", mu != null);
		}
		else{
			assertTrue("Expecting parse error but none found", !messagingSystem.errorTrace.isEmpty());
		}
    }
    
    @Override
    public String getName() {
        return kmtFile.getParentFile().getParentFile().getName() + kmtFile.getParentFile().getName()  + kmtFile.getName();
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

