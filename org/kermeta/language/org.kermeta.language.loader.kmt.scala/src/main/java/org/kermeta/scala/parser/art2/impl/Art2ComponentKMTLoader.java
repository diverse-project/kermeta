/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */
package org.kermeta.scala.parser.art2.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.ktoken.IKToken;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.port.PortLexer;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.scala.parser.KParser;
import org.kermeta.scala.parser.ParserUtil;
import org.kermeta.language.lexer.KMLexer;
import org.kermeta.scala.parser.ParseException;
import org.kermeta.traceability.TextReference;
import org.kermeta.traceability.TraceabilityFactory;
import org.osgi.framework.Bundle;
import scala.Option;

/**
 *
 * @author ffouquet
 */
@Provides({
    @ProvidedPort(name = "KMTloader", type = PortType.SERVICE, className = PortResourceLoader.class),
    @ProvidedPort(name = "KMTlexer", type = PortType.SERVICE, className = PortLexer.class)
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.kp.model", url = "mvn:org.kermeta.kp/kp.model"),
    @ThirdParty(name = "org.kermeta.language.traceability.model", url = "mvn:org.kermeta.traceability/traceability.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
//@ThirdParty(name="org.kermeta.language.loader.scala", url="mvn:org.kermeta.language/language.loader.scala")
})
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKMTLoader extends AbstractComponentType implements org.kermeta.language.api.port.PortResourceLoader {


    protected SimpleLogger logger;
    
    @Port(name = "KMTloader", method = "load")
    public ModelingUnit load(String uri, org.kermeta.language.api.port.PortResourceLoader.URIType type, String optionalContent) {
    	logger.debug("load called " + uri );
        KParser parser = new KParser();

        String content = optionalContent;
        if (content.equals("")) {
        	
        	if(uri.startsWith("jar:") && uri.contains("!")){
        		try{
        	        logger.debug("Loading content from jar " + uri + " ...");
	        		// ParserUtil isn't able to load from inside a jar, so use the stream instead
	    	    	URL jarUrl =  new URL(uri);
	    	    	JarURLConnection juc = (JarURLConnection) jarUrl.openConnection();
	    	    	InputStream is =  juc.getJarFile().getName().getClass().getResourceAsStream(uri.substring(uri.indexOf("!")+1));
	    	    	BufferedReader br = new BufferedReader(new InputStreamReader(is));	    	
	    	    	String thisLine;
	    	    	StringBuffer sb = new StringBuffer();
	    	        while ((thisLine = br.readLine()) != null) {
	    	        	sb.append(thisLine+"\n");
	    	        }
	    	        content = sb.toString();
	    	        logger.debug("Content loaded. " + uri);
        		}
        		catch(IOException e){
        	        logger.error(e.getMessage(),e); 
        		}
        	}
        	else{
    	        logger.debug("Loading content from " + uri + " ..."); 
        		content = ParserUtil.loadFile(uri);
    	        logger.debug("Content loaded. " + uri);
        	}
        }

        Option result = parser.parseSynch(content);
        logger.debug("Content parsed. ");
        if (result.isEmpty()) {

            //SEND ERROR LOG
            if (!parser.getErrors().isEmpty()) {

                ParseException pe = parser.getErrors().get();

                TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
                textRef.setFileURI(uri);

                textRef.setCharBeginOffset(pe.offsetBegin());
                textRef.setCharEndOffset(pe.offsetEnd());

                //textRef.setLineBeginAt(pe.line());
                //textRef.setLineEndAt(pe.line());//TODO
                //textRef.setCharBeginOffset(pe.getErrorOffset());
                //textRef.setCharBeginOffset(pe.line);
                //textRef.setCharEndOffset(pe.colonne);
                if (isPortBinded("log")) {
                    getPortByName("log", MessagePort.class).process(UnifiedMessageFactory.getInstance().createErrorMessage(pe.errMsg(), bundleSymbolicName, null, textRef));
                }
            }
            return null;
        } else {

            TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
            textRef.setFileURI(uri);
            textRef.setCharBeginOffset(0);
            textRef.setCharEndOffset(content.length());
            if (isPortBinded("log")) {
                getPortByName("log", MessagePort.class).process(UnifiedMessageFactory.getInstance().createOkMessage("File URI(" + uri + ") is clear ", bundleSymbolicName, null, textRef));
            }

            return (ModelingUnit) result.get();
        }

    }

    @Port(name = "KMTlexer", method = "lex")
    public List<IKToken> lex(String content) {

        List<IKToken> result = new ArrayList<IKToken>();

        KMLexer lexer = new KMLexer(content);

        while (!lexer.atEnd()) {
            Object t = lexer.nextToken();
            result.add((IKToken) t);
        }

        return result;

    }
    private String bundleSymbolicName = "";

    protected Bundle bundle;

    @Start
    public void start() {

        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        //logger.debug("Successfully started "+bundleSymbolicName);
    }

    /*
     * This opertion should pass everything that ART2 initialize before calling the usual start method
     * This is used for test purpose
     */
    public void simulatedStart(String bundleSymbolicName) {
        //bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        this.bundleSymbolicName = bundleSymbolicName;
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started "+bundleSymbolicName);
    }

    @Stop
    public void stop() {
    }
    
    
 // --- Port accessors ---

    public MessagePort getLogPort() {
		return getPortByName("log", MessagePort.class);
	}
    
    
    
    // --- GETTERS and SETTERS ---
    public SimpleLogger getLogger() {
		return logger;
	}

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    public Bundle getBundle() {
        return bundle;
    }
    
}
