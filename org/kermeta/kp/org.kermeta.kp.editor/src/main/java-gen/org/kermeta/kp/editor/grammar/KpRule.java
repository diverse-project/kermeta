/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class KpRule extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public KpRule(org.eclipse.emf.ecore.EClass metaclass, org.kermeta.kp.editor.grammar.KpChoice choice, org.kermeta.kp.editor.grammar.KpCardinality cardinality) {
		super(cardinality, new org.kermeta.kp.editor.grammar.KpSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.kermeta.kp.editor.grammar.KpChoice getDefinition() {
		return (org.kermeta.kp.editor.grammar.KpChoice) getChildren()[0];
	}
	
}

