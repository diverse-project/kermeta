

/*$Id: EditorCompletionHelper.java,v 1.1 2007-12-17 14:05:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	EditorCompletionHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

public class EditorCompletionHelper {

	
	static public List <ICompletionProposal> getProposalsForTypeDefinitions(KermetaUnit kermetaUnit, String text, int offset) {
		List <ICompletionProposal> proposals = new ArrayList<ICompletionProposal> ();
		List<String> qualifiedNames = new ArrayList<String> ();
        for ( Package p : kermetaUnit.getPackages() ) {
            for (TypeDefinition td: p.getOwnedTypeDefinition()) {
                String qualifiedName = NamedElementHelper.getQualifiedName(td);
                if ( ! qualifiedNames.contains(qualifiedName) ) {
                	qualifiedNames.add(qualifiedName);
                	CompletionItem ci = new NamedElementCompletionItem(td, kermetaUnit);
                	if (ci.getCompletionText().toLowerCase().startsWith( text.toLowerCase()) )
                		proposals.add(ci.getCompletionProposal(offset, text.length() ));
                }
            }
            String qualifiedName = NamedElementHelper.getQualifiedName(p);
            if ( ! qualifiedNames.contains(qualifiedName) ) {
            	qualifiedNames.add(qualifiedName);
            	CompletionItem ci = new NamedElementCompletionItem(p, kermetaUnit);
            	if (ci.getCompletionText().toLowerCase().startsWith(text.toLowerCase()))
            		proposals.add(ci.getCompletionProposal(offset, text.length() ));
            }
        }
        return proposals;
	}
	
	
}


