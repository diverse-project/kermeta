/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class KptBooleanTerminal extends org.kermeta.kp.editor.grammar.KptTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public KptBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, org.kermeta.kp.editor.grammar.KptCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
