/**
 * 
 */
package org.kermeta.language.loader.kmt.scala;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.loader.kmt.scala.internal.printer.PrettyPrinter;

/**
 * @author suresh
 *
 */
public class KMPrinter implements org.kermeta.language.loader.kmt.scala.api.IKMPrinter {

	@Override
	public String convertToText(EObject obj) {
		StringBuffer res = new StringBuffer();
		PrettyPrinter.printOutline(obj, res);
		return res.toString();
	}
}
