/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectValidator.java,v 1.1 2009-01-22 20:26:53 mclavreu Exp $
 */
package kompose.validation;

import kompose.ElementRef;
import kompose.Equals;


/**
 * A sample validator interface for {@link kompose.Select}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SelectValidator {
	boolean validate();

	boolean validatePropertyName(String value);

	boolean validateContainer(String value);
	boolean validateProperty(String value);
	boolean validateExpression(String value);

	boolean validateIdentifier(String value);

	boolean validateExpr(Equals value);

	boolean validateSelectTarget(ElementRef value);
}
