/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpContainment extends org.kermeta.kp.editor.grammar.KpTerminal {
	
	public KpContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kp.editor.grammar.KpCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
