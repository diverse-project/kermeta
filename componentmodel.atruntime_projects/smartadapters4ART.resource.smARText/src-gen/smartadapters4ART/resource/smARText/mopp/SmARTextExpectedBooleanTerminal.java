/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class SmARTextExpectedBooleanTerminal extends smartadapters4ART.resource.smARText.mopp.SmARTextAbstractExpectedElement {
	
	private smartadapters4ART.resource.smARText.grammar.SmARTextBooleanTerminal booleanTerminal;
	
	public SmARTextExpectedBooleanTerminal(smartadapters4ART.resource.smARText.grammar.SmARTextBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public smartadapters4ART.resource.smARText.grammar.SmARTextBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SmARTextExpectedBooleanTerminal) {
			return getFeature().equals(((SmARTextExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
