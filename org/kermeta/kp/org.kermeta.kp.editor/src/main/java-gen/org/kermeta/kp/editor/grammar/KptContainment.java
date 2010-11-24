/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptContainment extends org.kermeta.kp.editor.grammar.KptTerminal {
	
	public KptContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kermeta.kp.editor.grammar.KptCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
