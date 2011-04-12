package org.kermeta.language.loader.kmt.scala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.URL;

//import org.kermeta.art2.framework.MessagePort;
//import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.loader.kmt.scala.internal.parser.*;
//import org.kermeta.traceability.TextReference;
//import org.kermeta.traceability.TraceabilityFactory;

import scala.Option;

public class KMTparser implements org.kermeta.language.loader.kmt.scala.api.KMTparser {

    public ModelingUnit load(String uri, String optionalContent) {
        KParser parser = new KParser();

        String content = optionalContent;
        if (content.equals("")) {
        	
        	if(uri.startsWith("jar:") && uri.contains("!")){
        		try{
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
        		}
        		catch(IOException e){
        	        System.err.println(e.getMessage());
        		}
        	}
        	else{
        		content = ParserUtil.loadFile(uri);
        	}
        }

        Option result = parser.parseSynch(content);
        if (result.isEmpty()) {
            return null;
        } else {

            //TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
            //textRef.setFileURI(uri);
            //textRef.setCharBeginOffset(0);
            //textRef.setCharEndOffset(content.length());

            return (ModelingUnit) result.get();
        }

    }
	
}
