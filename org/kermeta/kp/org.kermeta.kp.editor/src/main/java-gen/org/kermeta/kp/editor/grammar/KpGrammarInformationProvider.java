/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KpGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public static class Rule extends org.kermeta.kp.editor.grammar.KpSyntaxElement {
		
		private final org.eclipse.emf.ecore.EClass metaclass;
		
		public Rule(org.eclipse.emf.ecore.EClass metaclass, org.kermeta.kp.editor.grammar.KpChoice choice, org.kermeta.kp.editor.grammar.KpCardinality cardinality) {
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
	
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("KermetaProject", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("version", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_0_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_0_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0_0_0_0, KP_0_0_0_4_0_0_0_0_0_0_0_0_1, KP_0_0_0_4_0_0_0_0_0_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_1_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("group", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_1_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_1_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0_0_0_0, KP_0_0_0_4_0_0_0_0_1_0_0_0_1, KP_0_0_0_4_0_0_0_0_1_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_1_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_1_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_1_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_2_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("defaultMainClass", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_2_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_2_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0_0_0_0, KP_0_0_0_4_0_0_0_0_2_0_0_0_1, KP_0_0_0_4_0_0_0_0_2_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_2_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("defaultMainOperation", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_3_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0_0, KP_0_0_0_4_0_0_0_0_3_0_0_0_1, KP_0_0_0_4_0_0_0_0_3_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_3_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0, KP_0_0_0_4_0_0_0_0_1, KP_0_0_0_4_0_0_0_0_2, KP_0_0_0_4_0_0_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0, KP_0_0_0_4_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_6_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_0_2 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_6_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_0_0, KP_0_0_0_6_0_0_1, KP_0_0_0_6_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_1_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_6_0_1_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_1_2 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_6_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_1_0, KP_0_0_0_6_0_1_1, KP_0_0_0_6_0_1_2);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_2_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_6_0_2_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_2_2 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_6_0_2 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_2_0, KP_0_0_0_6_0_2_1, KP_0_0_0_6_0_2_2);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_3_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_6_0_3_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_6_0_3 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_3_0, KP_0_0_0_6_0_3_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_6_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_0, KP_0_0_0_6_0_1, KP_0_0_0_6_0_2, KP_0_0_0_6_0_3);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_6 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_6_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_7 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_8 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_9 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_10_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("ref", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_10_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_10_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_10_0_0_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_10_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_10_0_0_2_0_0_0, KP_0_0_0_10_0_0_2_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_10_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_10_0_0_2_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_10_0_0_2 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_10_0_0_2_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_10_0_0_3 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_10_0_0_4 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_10_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_10_0_0_0, KP_0_0_0_10_0_0_1, KP_0_0_0_10_0_0_2, KP_0_0_0_10_0_0_3, KP_0_0_0_10_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_10_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_10_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_10 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_10_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0, KP_0_0_0_1, KP_0_0_0_2, KP_0_0_0_3, KP_0_0_0_4, KP_0_0_0_5, KP_0_0_0_6, KP_0_0_0_7, KP_0_0_0_8, KP_0_0_0_9, KP_0_0_0_10);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0);
	public final static Rule KP_0 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(), KP_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("source", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_1_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSource().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_0, KP_1_0_0_1, KP_1_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_1_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0);
	public final static Rule KP_1 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSource(), KP_1_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("srcDir", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_2_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_2_0_1_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_2_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_2_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_2_0_0, KP_2_0_0_2_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_2 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_2_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_0, KP_2_0_0_1, KP_2_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0);
	public final static Rule KP_2 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder(), KP_2_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("srcFile", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_3_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_3_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_2_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_3_0_0_2_0_1_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_3_0_0_2_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_2_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_3_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_2_0_0, KP_3_0_0_2_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpCompound(KP_3_0_0_2_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_0, KP_3_0_0_1, KP_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0);
	public final static Rule KP_3 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile(), KP_3_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("srcNSURI", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_4_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("from", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_4_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_4_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_3_0_0_0, KP_4_0_0_3_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_4_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_4_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_4_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_0, KP_4_0_0_1, KP_4_0_0_2, KP_4_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0);
	public final static Rule KP_4 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI(), KP_4_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("srcQuery", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("from", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_3_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("URL", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_3_0_0_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_3_0_0_2_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0_3_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_3_0_0_2_0_0_0, KP_5_0_0_3_0_0_2_0_0_1, KP_5_0_0_3_0_0_2_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0_0_3_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_3_0_0_2_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_5_0_0_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpCompound(KP_5_0_0_3_0_0_2_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_3_0_0_0, KP_5_0_0_3_0_0_1, KP_5_0_0_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_5_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_5_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_0, KP_5_0_0_1, KP_5_0_0_2, KP_5_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0);
	public final static Rule KP_5 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery(), KP_5_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("dependency", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("URL", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_0_3 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_0_4 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_6_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_6_0_0_0, KP_6_0_0_1, KP_6_0_0_2, KP_6_0_0_3, KP_6_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_1_0 = new org.kermeta.kp.editor.grammar.KpKeyword("dependency", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_1_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_1_2 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_1_3 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_1_4 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_6_0_1_5 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_6_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_6_0_1_0, KP_6_0_1_1, KP_6_0_1_2, KP_6_0_1_3, KP_6_0_1_4, KP_6_0_1_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_6_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_6_0_0, KP_6_0_1);
	public final static Rule KP_6 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getDependency(), KP_6_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_7_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("weaver-directive", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_7_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_7_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_7_0_0_3 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_7_0_0_4 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_7_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_7_0_0_0, KP_7_0_0_1, KP_7_0_0_2, KP_7_0_0_3, KP_7_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_7_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_7_0_0);
	public final static Rule KP_7 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective(), KP_7_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_8_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("merger-option", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_8_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_8_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_8_0_0_3 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_8_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_8_0_0_0, KP_8_0_0_1, KP_8_0_0_2, KP_8_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_8_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_8_0_0);
	public final static Rule KP_8 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getOption(), KP_8_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_9_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_9_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_9_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_9_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_9_0_0);
	public final static Rule KP_9 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression(), KP_9_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_10_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("(", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_10_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_10_0_0_2 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_10_0_0_3 = new org.kermeta.kp.editor.grammar.KpKeyword(")", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_10_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_10_0_0_0, KP_10_0_0_1, KP_10_0_0_2, KP_10_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_10_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_10_0_0);
	public final static Rule KP_10 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression(), KP_10_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_11_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_11_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword(":", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_11_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_11_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("URL", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_11_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_11_0_0_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_11_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0_3_0_0_0, KP_11_0_0_3_0_0_1, KP_11_0_0_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_11_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_11_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_11_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_11_0_0_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("[", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_11_0_0_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_11_0_0_4_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("]", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_11_0_0_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0_4_0_0_0, KP_11_0_0_4_0_0_1, KP_11_0_0_4_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_11_0_0_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_11_0_0_4 = new org.kermeta.kp.editor.grammar.KpCompound(KP_11_0_0_4_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_11_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0_0, KP_11_0_0_1, KP_11_0_0_2, KP_11_0_0_3, KP_11_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_11_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_11_0_0);
	public final static Rule KP_11 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef(), KP_11_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
}
