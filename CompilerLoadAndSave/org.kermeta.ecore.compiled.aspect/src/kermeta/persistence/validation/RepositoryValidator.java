/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryValidator.java,v 1.1 2008-07-02 09:43:40 ftanguy Exp $
 */
package kermeta.persistence.validation;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kermeta.persistence.Repository}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RepositoryValidator {
	boolean validate();

	boolean validateResources(EList<Resource> value);
}
