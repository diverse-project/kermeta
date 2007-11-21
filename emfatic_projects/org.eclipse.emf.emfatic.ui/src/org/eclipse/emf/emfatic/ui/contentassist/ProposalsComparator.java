package org.eclipse.emf.emfatic.ui.contentassist;

import java.util.Comparator;

import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class ProposalsComparator implements Comparator<ICompletionProposal> {
    
    /**
     * Compares two ICompletionProposals according to their display Strings
     * 
     * @return same as String.compareToIgnoreCase()
     */
    public int compare(ICompletionProposal p1, ICompletionProposal p2) {
        return p1.getDisplayString().compareToIgnoreCase(p2.getDisplayString());
    }
}
