

/*$Id: KMTOutputBuilder.java,v 1.7 2008-04-28 11:50:20 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io2
* File : 	KMTOutputBuilder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 juin 07
* Authors : paco
*/

package org.kermeta.io.printer;


import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.core.helper.FileHelper;
import org.kermeta.io.KermetaUnit;

public class KMTOutputBuilder {

	private Hashtable <String, String> contents = new Hashtable <String, String> ();
	
	private Hashtable <KermetaUnit, String> uris = new Hashtable <KermetaUnit, String> ();

	private String pathToRemove = "";

	public void print(KermetaUnit kermetaUnit, String rep, String fileName) {

		setUri(kermetaUnit, rep != null ? rep + "/" : "", fileName);
		internalPrint(kermetaUnit);
		
	}
	
	public void print(KermetaUnit kermetaUnit, String rep) {
		print(kermetaUnit, rep, null);
	}
		
	private void internalPrint(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isFramework() )
			return;
		
		if ( ! contents.containsKey( uris.get(kermetaUnit) ) )
			contents.put( uris.get(kermetaUnit), kermetaUnit.print() );
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			String uri = uris.get(current);
			if ( ! current.isFramework() && (uri != null) && ! contents.containsKey( uri ) )
				internalPrint( current );
		}
			
	}
	
	public void flush() {
		for ( String uri : contents.keySet() ) {
			String content = contents.get( uri );
		//	File file = new File( uri );
			try {
				URI realURI = URI.createURI(uri);
				URIConverter converter = new URIConverterImpl();
				OutputStream os = converter.createOutputStream(realURI);
				
				OutputStreamWriter writer = new OutputStreamWriter( os );
				writer.write( content );
				writer.flush();
				writer.close();
				
/*				FileWriter writer = new FileWriter(file);
				writer.write( content );
				writer.close();*/
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private void setUri(KermetaUnit kermetaUnit, String rep, String fileName) {
		if ( uris.containsKey(kermetaUnit) )
			return;
		
		if ( kermetaUnit.isFramework() ) {
			uris.put(kermetaUnit, kermetaUnit.getUri());
			return;
		}
		
		String uri = kermetaUnit.getUri();
		
		if ( pathToRemove.equals("") ) {
			int index = uri.lastIndexOf("/");
			if ( index != -1 ) {
				pathToRemove = uri.substring(0, index);
				uri = rep + uri.substring(index+1);
			}
		} else if (kermetaUnit.getUri().startsWith("http://")) {
			int index = kermetaUnit.getUri().lastIndexOf("/");
			uri = rep + kermetaUnit.getUri().substring(index+1) + ".km";
		} else if ( kermetaUnit.getUri().startsWith("platform:/resource") ) {
			uri = kermetaUnit.getUri();			
		} else {
			uri = uri.replace(pathToRemove + "/", "");
			uri = rep + uri;
		}
			
		if ( fileName != null )
			uris.put(kermetaUnit, fileName);
		else {
			uri = FileHelper.replaceExtension(uri, "kmt");
			uris.put(kermetaUnit, uri);
		}
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit current = iterator.next();
			setUri(current, rep, null);
		}
		
	}
		
}


