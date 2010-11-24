/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.grammar;

public class KptGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public static class Rule extends org.kermeta.kp.editor.grammar.KptSyntaxElement {
		
		private final org.eclipse.emf.ecore.EClass metaclass;
		
		public Rule(org.eclipse.emf.ecore.EClass metaclass, org.kermeta.kp.editor.grammar.KptChoice choice, org.kermeta.kp.editor.grammar.KptCardinality cardinality) {
			super(cardinality, new org.kermeta.kp.editor.grammar.KptSyntaxElement[] {choice});
			this.metaclass = metaclass;
		}
		
		public org.eclipse.emf.ecore.EClass getMetaclass() {
			return metaclass;
		}
		
		public org.kermeta.kp.editor.grammar.KptChoice getDefinition() {
			return (org.kermeta.kp.editor.grammar.KptChoice) getChildren()[0];
		}
	}
	
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("KermetaProject", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword(":", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_0_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_3 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_4 = new org.kermeta.kp.editor.grammar.KptKeyword("version", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_5 = new org.kermeta.kp.editor.grammar.KptKeyword(": ", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_0_0_0_6 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_7 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_8 = new org.kermeta.kp.editor.grammar.KptKeyword("group", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_9 = new org.kermeta.kp.editor.grammar.KptKeyword(":", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_0_0_0_10 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_11 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_12 = new org.kermeta.kp.editor.grammar.KptKeyword("{", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_0_0 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_0_0_0_13_0_0_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_0_2 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0_13_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_13_0_0_0, KPT_0_0_0_13_0_0_1, KPT_0_0_0_13_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_1_0 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_0_0_0_13_0_1_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_1_2 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0_13_0_1 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_13_0_1_0, KPT_0_0_0_13_0_1_1, KPT_0_0_0_13_0_1_2);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_2_0 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_0_0_0_13_0_2_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_2_2 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0_13_0_2 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_13_0_2_0, KPT_0_0_0_13_0_2_1, KPT_0_0_0_13_0_2_2);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_13_0_3_0 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_0_0_0_13_0_3_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0_13_0_3 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_13_0_3_0, KPT_0_0_0_13_0_3_1);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_0_0_0_13_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_13_0_0, KPT_0_0_0_13_0_1, KPT_0_0_0_13_0_2, KPT_0_0_0_13_0_3);
	public final static org.kermeta.kp.editor.grammar.KptCompound KPT_0_0_0_13 = new org.kermeta.kp.editor.grammar.KptCompound(KPT_0_0_0_13_0, org.kermeta.kp.editor.grammar.KptCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_14 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_15 = new org.kermeta.kp.editor.grammar.KptKeyword("}", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_16 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_17 = new org.kermeta.kp.editor.grammar.KptKeyword("ref", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_18 = new org.kermeta.kp.editor.grammar.KptKeyword("{", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_19_0_0_0 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 1);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_0_0_0_19_0_0_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0_19_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_19_0_0_0, KPT_0_0_0_19_0_0_1);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_0_0_0_19_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_19_0_0);
	public final static org.kermeta.kp.editor.grammar.KptCompound KPT_0_0_0_19 = new org.kermeta.kp.editor.grammar.KptCompound(KPT_0_0_0_19_0, org.kermeta.kp.editor.grammar.KptCardinality.STAR);
	public final static org.kermeta.kp.editor.grammar.KptLineBreak KPT_0_0_0_20 = new org.kermeta.kp.editor.grammar.KptLineBreak(org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_0_0_0_21 = new org.kermeta.kp.editor.grammar.KptKeyword("}", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_0_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0_0, KPT_0_0_0_1, KPT_0_0_0_2, KPT_0_0_0_3, KPT_0_0_0_4, KPT_0_0_0_5, KPT_0_0_0_6, KPT_0_0_0_7, KPT_0_0_0_8, KPT_0_0_0_9, KPT_0_0_0_10, KPT_0_0_0_11, KPT_0_0_0_12, KPT_0_0_0_13, KPT_0_0_0_14, KPT_0_0_0_15, KPT_0_0_0_16, KPT_0_0_0_17, KPT_0_0_0_18, KPT_0_0_0_19, KPT_0_0_0_20, KPT_0_0_0_21);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_0_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_0_0_0);
	public final static Rule KPT_0 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProject(), KPT_0_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_1_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("source", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_1_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_1_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_1_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_1_0_0_0, KPT_1_0_0_1, KPT_1_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_1_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_1_0_0);
	public final static Rule KPT_1 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFolder(), KPT_1_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_2_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("source", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_2_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_2_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_2_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_2_0_0_0, KPT_2_0_0_1, KPT_2_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_2_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_2_0_0);
	public final static Rule KPT_2 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceFile(), KPT_2_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_3_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("source", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_3_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_3_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), "NSURI", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_3_0_0_3 = new org.kermeta.kp.editor.grammar.KptKeyword("from", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_3_0_0_4 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_3_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_3_0_0_0, KPT_3_0_0_1, KPT_3_0_0_2, KPT_3_0_0_3, KPT_3_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_3_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_3_0_0);
	public final static Rule KPT_3 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceNSURI(), KPT_3_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_4_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("source", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_4_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_4_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_4_0_0_3 = new org.kermeta.kp.editor.grammar.KptKeyword("from", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_4_0_0_4 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_4_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_4_0_0_0, KPT_4_0_0_1, KPT_4_0_0_2, KPT_4_0_0_3, KPT_4_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_4_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_4_0_0);
	public final static Rule KPT_4 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getSourceQuery(), KPT_4_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_5_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("dependency", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_5_0_0_1 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_5_0_0_2 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_5_0_0_3 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_5_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_5_0_0_0, KPT_5_0_0_1, KPT_5_0_0_2, KPT_5_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_5_0_1_0 = new org.kermeta.kp.editor.grammar.KptKeyword("dependency", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_5_0_1_1 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getDependency().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_5_0_1 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_5_0_1_0, KPT_5_0_1_1);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_5_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_5_0_0, KPT_5_0_1);
	public final static Rule KPT_5 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getDependency(), KPT_5_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_6_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("weaver-directive", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_6_0_0_1 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_6_0_0_2 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_6_0_0_3 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_6_0_0_4 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_6_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_6_0_0_0, KPT_6_0_0_1, KPT_6_0_0_2, KPT_6_0_0_3, KPT_6_0_0_4);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_6_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_6_0_0);
	public final static Rule KPT_6 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getWeaveDirective(), KPT_6_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_7_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("merger-option", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_7_0_0_1 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.QUESTIONMARK, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_7_0_0_2 = new org.kermeta.kp.editor.grammar.KptKeyword("=", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_7_0_0_3 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getOption().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_7_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_7_0_0_0, KPT_7_0_0_1, KPT_7_0_0_2, KPT_7_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_7_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_7_0_0);
	public final static Rule KPT_7 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getOption(), KPT_7_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_8_0_0_0 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_8_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_8_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_8_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_8_0_0);
	public final static Rule KPT_8 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getStringExpression(), KPT_8_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_9_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("(", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_9_0_0_1 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptContainment KPT_9_0_0_2 = new org.kermeta.kp.editor.grammar.KptContainment(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_9_0_0_3 = new org.kermeta.kp.editor.grammar.KptKeyword(")", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_9_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_9_0_0_0, KPT_9_0_0_1, KPT_9_0_0_2, KPT_9_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_9_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_9_0_0);
	public final static Rule KPT_9 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getMixExpression(), KPT_9_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_10_0_0_0 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getNamedElement().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), "TEXT", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_10_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_10_0_0_0);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_10_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_10_0_0);
	public final static Rule KPT_10 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getNamedElement(), KPT_10_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_11_0_0_0 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_11_0_0_1 = new org.kermeta.kp.editor.grammar.KptKeyword(":", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_11_0_0_2 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_11_0_0_3_0_0_0 = new org.kermeta.kp.editor.grammar.KptKeyword("[", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptPlaceholder KPT_11_0_0_3_0_0_1 = new org.kermeta.kp.editor.grammar.KptPlaceholder(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), "QUOTED_34_34", org.kermeta.kp.editor.grammar.KptCardinality.ONE, 0);
	public final static org.kermeta.kp.editor.grammar.KptKeyword KPT_11_0_0_3_0_0_2 = new org.kermeta.kp.editor.grammar.KptKeyword("]", org.kermeta.kp.editor.grammar.KptCardinality.ONE);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_11_0_0_3_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_11_0_0_3_0_0_0, KPT_11_0_0_3_0_0_1, KPT_11_0_0_3_0_0_2);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_11_0_0_3_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_11_0_0_3_0_0);
	public final static org.kermeta.kp.editor.grammar.KptCompound KPT_11_0_0_3 = new org.kermeta.kp.editor.grammar.KptCompound(KPT_11_0_0_3_0, org.kermeta.kp.editor.grammar.KptCardinality.QUESTIONMARK);
	public final static org.kermeta.kp.editor.grammar.KptSequence KPT_11_0_0 = new org.kermeta.kp.editor.grammar.KptSequence(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_11_0_0_0, KPT_11_0_0_1, KPT_11_0_0_2, KPT_11_0_0_3);
	public final static org.kermeta.kp.editor.grammar.KptChoice KPT_11_0 = new org.kermeta.kp.editor.grammar.KptChoice(org.kermeta.kp.editor.grammar.KptCardinality.ONE, KPT_11_0_0);
	public final static Rule KPT_11 = new Rule(org.kermeta.kp.KpPackage.eINSTANCE.getKermetaProjectRef(), KPT_11_0, org.kermeta.kp.editor.grammar.KptCardinality.ONE);
}
