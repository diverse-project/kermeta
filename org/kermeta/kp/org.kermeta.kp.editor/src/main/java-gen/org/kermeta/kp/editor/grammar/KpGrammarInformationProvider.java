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
	
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECTS), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_0_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_0_0_1_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0_0_1_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0_0_0, KP_0_0_0_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_0 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_0_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("project", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpWhiteSpace KP_0_0_0_2 = new org.kermeta.kp.editor.grammar.KpWhiteSpace(1, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_3 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), "TEXT", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("extends", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_4_0_0_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword(",", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_4_0_0_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_2_0_0_0, KP_0_0_0_4_0_0_2_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0_0_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_2_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4_0_0_2 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0_0_2_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0_0, KP_0_0_0_4_0_0_1, KP_0_0_0_4_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_4 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_4_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_5 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_6_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_6_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("mainClass", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_6_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_6_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_0_0, KP_0_0_0_6_0_0_1, KP_0_0_0_6_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_6_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_6_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_6 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_6_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_7_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_7_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("mainOperation", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_7_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_7_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_7_0_0_0, KP_0_0_0_7_0_0_1, KP_0_0_0_7_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_7_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_7_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_7 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_7_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_0_0_0_8_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_8_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("javaBasePackage", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_0_0_0_8_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_8_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_8_0_0_0, KP_0_0_0_8_0_0_1, KP_0_0_0_8_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_8_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_8_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_8 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_8_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_0_0_0_9_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_FILES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0_9_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_9_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0_0_9_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_9_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_0_0_0_9 = new org.kermeta.kp.editor.grammar.KpCompound(KP_0_0_0_9_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_0_0_0_10 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_0_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0_0, KP_0_0_0_1, KP_0_0_0_2, KP_0_0_0_3, KP_0_0_0_4, KP_0_0_0_5, KP_0_0_0_6, KP_0_0_0_7, KP_0_0_0_8, KP_0_0_0_9, KP_0_0_0_10);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_0_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_0 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(), KP_0_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 3);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("packageEquivalence", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_1_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getPackageEquivalence().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_1_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_3_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_1_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_1_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_1_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_1_0_0_4 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getPackageEquivalence().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_1_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0_0, KP_1_0_0_1, KP_1_0_0_2, KP_1_0_0_3, KP_1_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_1_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_1_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_1 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getPackageEquivalence(), KP_1_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_2_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("import", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getImportFile().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("using", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("EMFBytecode", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_2_0_0_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getImportFile().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), "QUOTED_40_41", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword("{", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpContainment KP_2_0_0_3_0_0_3_0_0_1_0_0_0 = new org.kermeta.kp.editor.grammar.KpContainment(org.kermeta.kp.KpPackage.eINSTANCE.getImportFile().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES), org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_0_3_0_0_1_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_3_0_0_1_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0_0_3_0_0_1_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_3_0_0_1_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0_0_3_0_0_1_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_2_0_0_3_0_0_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpKeyword("}", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_3_0_0_0, KP_2_0_0_3_0_0_3_0_0_1, KP_2_0_0_3_0_0_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0_0, KP_2_0_0_3_0_0_1, KP_2_0_0_3_0_0_2, KP_2_0_0_3_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_2_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_2_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_2_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0_0, KP_2_0_0_1, KP_2_0_0_2, KP_2_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_2_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_2_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_2 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getImportFile(), KP_2_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("importProject", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_3_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getImportProject().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE), "TEXT", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0_0, KP_3_0_0_1, KP_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_3 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getImportProject(), KP_3_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_4_0_0_0 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE), "TEXT", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_4_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_4_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_4_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_4 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getImportProjectSources(), KP_4_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("resource", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), "TEXT", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_3 = new org.kermeta.kp.editor.grammar.KpKeyword("=", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_4 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpLineBreak KP_5_0_0_5_0_0_0 = new org.kermeta.kp.editor.grammar.KpLineBreak(org.kermeta.kp.editor.grammar.KpCardinality.ONE, 2);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_5_0_0_1 = new org.kermeta.kp.editor.grammar.KpKeyword("alternative", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_5_0_0_2 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpKeyword KP_5_0_0_5_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KpKeyword(",", org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KpPlaceholder KP_5_0_0_5_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KpPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KpCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0_5_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_5_0_0_3_0_0_0, KP_5_0_0_5_0_0_3_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0_0_5_0_0_3_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_5_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_5_0_0_5_0_0_3 = new org.kermeta.kp.editor.grammar.KpCompound(KP_5_0_0_5_0_0_3_0, org.kermeta.kp.editor.grammar.KpCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0_5_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_5_0_0_0, KP_5_0_0_5_0_0_1, KP_5_0_0_5_0_0_2, KP_5_0_0_5_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0_0_5_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_5_0_0);
	public final static org.kermeta.kp.editor.grammar.KpCompound KP_5_0_0_5 = new org.kermeta.kp.editor.grammar.KpCompound(KP_5_0_0_5_0, org.kermeta.kp.editor.grammar.KpCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KpSequence KP_5_0_0 = new org.kermeta.kp.editor.grammar.KpSequence(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0_0, KP_5_0_0_1, KP_5_0_0_2, KP_5_0_0_3, KP_5_0_0_4, KP_5_0_0_5);
	public final static org.kermeta.kp.editor.grammar.KpChoice KP_5_0 = new org.kermeta.kp.editor.grammar.KpChoice(org.kermeta.kp.editor.grammar.KpCardinality.ONE, KP_5_0_0);
	public final static org.kermeta.kp.editor.grammar.KpRule KP_5 = new org.kermeta.kp.editor.grammar.KpRule(org.kermeta.kp.KpPackage.eINSTANCE.getReusableResource(), KP_5_0, org.kermeta.kp.editor.grammar.KpCardinality.ONE);
	
	public final static org.kermeta.kp.editor.grammar.KpRule[] RULES = new org.kermeta.kp.editor.grammar.KpRule[] {
		KP_0,
		KP_1,
		KP_2,
		KP_3,
		KP_4,
		KP_5,
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
