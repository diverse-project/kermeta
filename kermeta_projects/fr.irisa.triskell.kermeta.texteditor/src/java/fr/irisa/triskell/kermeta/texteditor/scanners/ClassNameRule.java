/**
 * 
 */
package fr.irisa.triskell.kermeta.texteditor.scanners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author ftanguy
 *
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
