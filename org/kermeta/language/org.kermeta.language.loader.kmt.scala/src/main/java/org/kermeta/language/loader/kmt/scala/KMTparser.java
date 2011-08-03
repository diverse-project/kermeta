package org.kermeta.language.loader.kmt.scala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.loader.kmt.scala.internal.parser.*;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.TextReference;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

import scala.Option;

public class KMTparser implements org.kermeta.language.loader.kmt.scala.api.KMTparser {

    public ModelingUnit load(URL url, String optionalContent, MessagingSystem logger) {
        KParser parser = new KParser();

        String content = optionalContent;
        if (content.equals("")) {
        	if(url.getProtocol().equals("jar")){
        		try{
	        		// ParserUtil isn't able to load from inside a jar, so use the stream instead
	    	    	JarURLConnection juc = (JarURLConnection) url.openConnection();
	    	    	InputStream is =  juc.getJarFile().getName().getClass().getResourceAsStream(url.getFile().substring(url.getFile().indexOf("!")+1));
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
        		System.out.println("    url.getFile() ="+url.getFile());
        		content = ParserUtil.loadFile(url.getFile());
        	}
        }

        Option result = parser.parse(content);
        if (result.isEmpty()) {
            //SEND ERROR LOG
            if (!parser.getErrors().isEmpty()) {

                ParseException pe = parser.getErrors().get();
              	
            	TextReference textRef = new TextReference(url,pe.offsetBegin(),pe.offsetEnd());

            	textRef.setBeginLine(pe.line());
            	textRef.setEndLine(pe.line());//TODO
            	//textRef.setCharBeginOffset(pe.getErrorOffset());
            	//textRef.setCharBeginOffset(pe.line);
            	//textRef.setCharEndOffset(pe.colonne);
            	
            	logger.logProblem(Kind.UserERROR, pe.errMsg(), KMTparser.LOG_MESSAGE_GROUP, pe , textRef);
            }
            return null;
        }
        //TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
        //textRef.setFileURI(uri);
        //textRef.setCharBeginOffset(0);
        //textRef.setCharEndOffset(content.length());
    	
    	// Add file URL to tag source.location for all contents
    	
    	ModelingUnit mu = (ModelingUnit)result.get();
    	
    	TreeIterator<EObject> tit = mu.eAllContents();
    	while(tit.hasNext()) {
    		KermetaModelElement kme = (KermetaModelElement) tit.next();
    		for (Tag tag : kme.getKOwnedTags()) {
    			if (tag.getName().equals("traceability_text_reference")) {
    				tag.setValue(url.toString() + ";" + tag.getValue());
    			}
    		}
    	}

        //return (ModelingUnit) result.get();
    	return mu;
    }
}

