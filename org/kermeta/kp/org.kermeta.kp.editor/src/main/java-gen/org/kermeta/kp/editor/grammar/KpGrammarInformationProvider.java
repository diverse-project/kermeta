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
	
	public final static KpGrammarInformationProvider INSTANCE = new KpGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("KermetaProject", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpWhiteSpace KP_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpWhiteSpace(1, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("groupId", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_0_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_0_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0_0_0_0, KP_0_0_0_4_0_0_0_0_0_0_0_0_1, KP_0_0_0_4_0_0_0_0_0_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_1_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("defaultMainClass", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_1_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_1_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0_0_0_0, KP_0_0_0_4_0_0_0_0_1_0_0_0_1, KP_0_0_0_4_0_0_0_0_1_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_1_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_1_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_1_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_2_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("defaultMainOperation", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_2_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_4_0_0_0_0_2_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0_0_0_0, KP_0_0_0_4_0_0_0_0_2_0_0_0_1, KP_0_0_0_4_0_0_0_0_2_0_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_2_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_2_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("dependencies", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_3_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_0_0_3_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_3_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0_0, KP_0_0_0_4_0_0_0_0_3_0_0_0_1, KP_0_0_0_4_0_0_0_0_3_0_0_0_2, KP_0_0_0_4_0_0_0_0_3_0_0_0_3, KP_0_0_0_4_0_0_0_0_3_0_0_0_4, KP_0_0_0_4_0_0_0_0_3_0_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_3_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_3_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_4_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("sources", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_4_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_4_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_4_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_0_0_4_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_4_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_4_0_0_0_0, KP_0_0_0_4_0_0_0_0_4_0_0_0_1, KP_0_0_0_4_0_0_0_0_4_0_0_0_2, KP_0_0_0_4_0_0_0_0_4_0_0_0_3, KP_0_0_0_4_0_0_0_0_4_0_0_0_4, KP_0_0_0_4_0_0_0_0_4_0_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_4_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_4_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_4_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_4_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_4_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_5_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("options", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_5_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_5_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_5_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_0_0_5_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_5_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_5_0_0_0_0, KP_0_0_0_4_0_0_0_0_5_0_0_0_1, KP_0_0_0_4_0_0_0_0_5_0_0_0_2, KP_0_0_0_4_0_0_0_0_5_0_0_0_3, KP_0_0_0_4_0_0_0_0_5_0_0_0_4, KP_0_0_0_4_0_0_0_0_5_0_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_5_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_5_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_5_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_5_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_5_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_6_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("weaveDirectives", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_6_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_6_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_6_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_0_0_6_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0_0_6_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_6_0_0_0_0, KP_0_0_0_4_0_0_0_0_6_0_0_0_1, KP_0_0_0_4_0_0_0_0_6_0_0_0_2, KP_0_0_0_4_0_0_0_0_6_0_0_0_3, KP_0_0_0_4_0_0_0_0_6_0_0_0_4, KP_0_0_0_4_0_0_0_0_6_0_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0_6_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_6_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0_0_6_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0_6_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_0_0_6 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_6_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0_0_0, KP_0_0_0_4_0_0_0_0_1, KP_0_0_0_4_0_0_0_0_2, KP_0_0_0_4_0_0_0_0_3, KP_0_0_0_4_0_0_0_0_4, KP_0_0_0_4_0_0_0_0_5, KP_0_0_0_4_0_0_0_0_6);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0, KP_0_0_0_4_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0, KP_0_0_0_1, KP_0_0_0_2, KP_0_0_0_3, KP_0_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_0 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(), KP_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("require", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0_1_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_1_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_1_0_1_0 = new org.kermeta.kp.editor.grammar.KpKeyword("source", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0_1_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_1_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_1_0_0_1_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_1_0_0, KP_1_0_0_1_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_1_0_0_1 = new org.kermeta.kp.editor.grammar.KpCompound(KP_1_0_0_1_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_1_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSource().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpBooleanTerminal KP_1_0_0_3 = new org.kermeta.kp.editor.grammar.KpBooleanTerminal(org.kermeta.kp.KpPackage.eINSTANCE.getSource().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), "byteCodeFromADependency", "", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_0, KP_1_0_0_1, KP_1_0_0_2, KP_1_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_1_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_1 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getSource(), KP_1_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("dependency", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_1_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("URLs", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_1_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_1_0_0_0_0, KP_2_0_0_3_0_1_0_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0_1_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_1_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3_0_1_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0_1_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0, KP_2_0_0_3_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_4 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword(",", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_5_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_5_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_5_0_0_0, KP_2_0_0_5_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_5_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_5_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_5 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_5_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpBooleanTerminal KP_2_0_0_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpBooleanTerminal(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), "ignoreByteCode", "", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_6_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_6_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpBooleanTerminal KP_2_0_0_6_0_1_0 = new org.kermeta.kp.editor.grammar.KpBooleanTerminal(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), "sourceOnly", "", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_6_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_6_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_6_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_6_0_0, KP_2_0_0_6_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_6 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_6_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_0, KP_2_0_0_1, KP_2_0_0_2, KP_2_0_0_3, KP_2_0_0_4, KP_2_0_0_5, KP_2_0_0_6);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_2 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getDependency(), KP_2_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("weaver-directive", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_3_0_0_3 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_3_0_0_4 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_3_0_0_5 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_0, KP_3_0_0_1, KP_3_0_0_2, KP_3_0_0_3, KP_3_0_0_4, KP_3_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_3 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective(), KP_3_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("option", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_4_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_4_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("value", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_4_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_3_0_0_0, KP_4_0_0_3_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_4_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_4_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_4_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_4_0_0_4 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_4_0_0_5 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_0, KP_4_0_0_1, KP_4_0_0_2, KP_4_0_0_3, KP_4_0_0_4, KP_4_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_4 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getOption(), KP_4_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_5 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression(), KP_5_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("(", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_6_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_6_0_0_2 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_6_0_0_3 = new org.kermeta.kp.editor.grammar.KpKeyword(")", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_6_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_6_0_0_0, KP_6_0_0_1, KP_6_0_0_2, KP_6_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_6_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_6_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_6 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression(), KP_6_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	
	public final static org.kermeta.kp.editor.grammar.KpRule[] RULES = new org.kermeta.kp.editor.grammar.KpRule[] {
		KP_0,
		KP_1,
		KP_2,
		KP_3,
		KP_4,
		KP_5,
		KP_6,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.kermeta.kp.editor.grammar.KpRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.kermeta.kp.editor.grammar.KpSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.kermeta.kp.editor.grammar.KpKeyword) {
			keywords.add(((org.kermeta.kp.editor.grammar.KpKeyword) element).getValue());
		} else if (element instanceof org.kermeta.kp.editor.grammar.KpBooleanTerminal) {
			keywords.add(((org.kermeta.kp.editor.grammar.KpBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.kermeta.kp.editor.grammar.KpBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.kermeta.kp.editor.grammar.KpEnumerationTerminal) {
			org.kermeta.kp.editor.grammar.KpEnumerationTerminal terminal = (org.kermeta.kp.editor.grammar.KpEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.kermeta.kp.editor.grammar.KpSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
