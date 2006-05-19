/* $Id: KermetaValidatorStartup.java,v 1.3 2006-05-19 16:21:34 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : KermetaConstraintValidator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 10, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

public class KermetaValidatorStartup implements IStartup {

	public KermetaValidatorStartup()
	{
		System.out.println("Construction of KemretaValidatorStartup");
	}
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(
				StructurePackage.eINSTANCE,
				new KermetaValidatorAdapter());
	}
}
