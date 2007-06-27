/* $Id: ClassNameRule.java,v 1.3 2007-06-27 13:19:27 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	ClassNameRule.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package fr.irisa.triskell.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author ftanguy
 */
public class ClassNameRule implements IRule {


	private IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.TYPE_ATTRIBUTE));

	private KermetaUnit unit = null;
	
	public ClassNameRule(KermetaUnit unit) {
		this.unit = unit;
	}	
	
	public IToken evaluate(ICharacterScanner scanner) {
		
		int size = 0;
		int c;
		String word = "";
		
		c = scanner.read();
		size ++;

		if ( Character.isWhitespace(c) ) {
			while ( (c = scanner.read()) != ICharacterScanner.EOF ) {
			
				size ++;
				
				if ( Character.isLetter(c) ) {		
					String temp = new String( new char[] { (char) c } );
					word = word.concat( temp );
					TypeDefinition td = unit.getTypeDefinitionByName(word);
					if ( td != null ) {
						
						c = scanner.read();
						
						if ( Character.isWhitespace(c) || ! Character.isLetter(c) ) {
							scanner.unread();
							return token;
						} else {
							temp = new String( new char[] { (char) c } );
							word = word.concat( temp );
						}
					}
				} else {
					while ( size > 0 ) {
						scanner.unread();
						size--;
					}
					return Token.UNDEFINED;
				}
			}
			
		}
		
		while ( size > 0 ) {
			scanner.unread();
			size--;
		}
		
		return Token.UNDEFINED;
	}

}
