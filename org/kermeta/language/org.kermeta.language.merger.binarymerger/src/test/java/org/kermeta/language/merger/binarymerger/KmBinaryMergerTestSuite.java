/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.port.PortKmBinaryMergerTestSuite;
import org.kermeta.language.merger.binarymerger.art2.impl.Art2ComponentKmBinaryMerger;
import runner.MainRunner;

/**
 *
 * @author ffouquet
 */
public class KmBinaryMergerTestSuite extends TestSuite {

   // @Override
    public static Test suite() {

        initRegistry();

        PortKmBinaryMergerTestSuite.mergerClass = Art2ComponentKmBinaryMerger.class;
        return PortKmBinaryMergerTestSuite.suite();
    }

    public  static void initRegistry(){
        org.OrgPackage pack = org.impl.OrgPackageImpl.init();
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.OrgPackage.eNS_URI, pack);
	//kermeta.persistence.EcorePackages().getPacks().put(org.OrgPackage.eNS_URI, pack);
	pack.setEFactoryInstance(org.RichFactory);



/*
	var pack : org.kermeta.KmPackage = org.kermeta.impl.KmPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.KmPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.kermeta.KmPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.org.kermeta.RichFactory)




	var pack : org.kermeta.language.LanguagePackage = org.kermeta.language.impl.LanguagePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.org.kermeta.language.RichFactory)




	var pack : org.kermeta.language.behavior.BehaviorPackage = org.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.org.kermeta.language.behavior.RichFactory)




	var pack : org.kermeta.language.structure.StructurePackage = org.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(org.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.org.kermeta.language.structure.RichFactory)




	var pack : fr.irisa.triskell.kermeta.KmPackage = fr.irisa.triskell.kermeta.impl.KmPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.KmPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.KmPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.RichFactory)




	var pack : fr.irisa.triskell.kermeta.language.LanguagePackage = fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.LanguagePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.RichFactory)




	var pack : fr.irisa.triskell.kermeta.language.structure.StructurePackage = fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.structure.StructurePackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory)




	var pack : fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage = fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl.init
	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	kermeta.persistence.EcorePackages.getPacks().put(fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage.`eNS_URI`, pack)
	pack.setEFactoryInstance(ScalaAspect.fr.irisa.triskell.kermeta.language.behavior.RichFactory)
*/
    }

    
}
