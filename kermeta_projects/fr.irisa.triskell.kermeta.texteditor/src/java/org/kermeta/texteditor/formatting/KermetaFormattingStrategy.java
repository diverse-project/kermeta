

/*$Id: KermetaFormattingStrategy.java,v 1.1 2007-12-17 14:05:07 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaFormattingStrategy.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor.formatting;

import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;
import org.eclipse.jface.text.formatter.IFormattingContext;

public class KermetaFormattingStrategy extends ContextBasedFormattingStrategy {

	@Override
	public String format(String content, boolean start, String indentation, int[] positions) {
		return super.format(content, start, indentation, positions);
	}
	
	@Override
	public void formatterStarts(IFormattingContext context) {
		// TODO Auto-generated method stub
		//super.formatterStarts(context);
	}
	
	@Override
	public void formatterStarts(String indentation) {
		// TODO Auto-generated method stub
		//super.formatterStarts(indentation);
	}
	
	@Override
	public void formatterStops() {
		// TODO Auto-generated method stub
		//super.formatterStops();
	}
	
	@Override
	public void format() {
		// TODO Auto-generated method stub
		//super.format();
	}
}


