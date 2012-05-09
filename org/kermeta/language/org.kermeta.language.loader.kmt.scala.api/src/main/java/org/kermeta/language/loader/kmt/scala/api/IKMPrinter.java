
/**
 * @author suresh
 * Used in the TreeViewer for the outline
 */
package org.kermeta.language.loader.kmt.scala.api;

import org.eclipse.emf.ecore.EObject;

public interface IKMPrinter {
	public String convertToText(EObject obj);
}
