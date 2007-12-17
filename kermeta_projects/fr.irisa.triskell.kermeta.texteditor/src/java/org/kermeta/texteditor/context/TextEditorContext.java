

/*$Id: TextEditorContext.java,v 1.1 2007-12-17 14:05:12 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	TextEditorContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor.context;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;

import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class TextEditorContext {

	static private TextEditorContext instance = null;
	
	static public TextEditorContext getDefault() {
		if ( instance == null )
			instance = new TextEditorContext();
		return instance;
	}
	
	private KermetaUnitStorer storer = IoFactory.eINSTANCE.createKermetaUnitStorer();

	public KermetaUnit getKermetaUnit(String uri) {
		return storer.find(uri);
	}
	
	public void addKermetaUnit(KermetaUnit newUnit) {
		KermetaUnit existingUnit = getKermetaUnit(newUnit.getUri());
		if ( existingUnit != null )
			storer.unload( newUnit.getUri() );
		storer.getKermetaUnits().add( newUnit );
	}
	
	public KermetaUnit loadKermetaUnit(String uri, String content) {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put("content", content);
		KermetaUnit unit = null;
		try {
			storer.load(uri, options, new NullProgressMonitor());
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
		return unit;
	}
}


