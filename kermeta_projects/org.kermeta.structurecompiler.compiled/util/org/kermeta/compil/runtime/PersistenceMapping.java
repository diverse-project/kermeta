package org.kermeta.compil.runtime;

import java.util.HashMap;

import org.eclipse.emf.ecore.EPackage;

final public class PersistenceMapping {

	/**
	 * @generated
	 */
	private PersistenceMapping() {
		initialize();
	}

	static private PersistenceMapping _instance;

	/**
	 * @generated
	 */
	public static PersistenceMapping getInstance() {
		if (_instance == null)
			_instance = new PersistenceMapping();
		return _instance;
	}

	/**
	 * @generated
	 * Initialize the EPackage registry for the generated EPackages that are not deployed 
	 */
	public void initialize() {

		initializeMap();

		//The following source code comes from Simk
		EPackage.Registry.INSTANCE.put(ecore.EcorePackage.eNS_URI,
				ecore.EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.KermetaPackage.eNS_URI,
				kermeta.KermetaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.language.LanguagePackage.eNS_URI,
				kermeta.language.LanguagePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.language.behavior.BehaviorPackage.eNS_URI,
				kermeta.language.behavior.BehaviorPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.language.structure.StructurePackage.eNS_URI,
				kermeta.language.structure.StructurePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.exceptions.ExceptionsPackage.eNS_URI,
				kermeta.exceptions.ExceptionsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.interpreter.InterpreterPackage.eNS_URI,
				kermeta.interpreter.InterpreterPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.kunit.KunitPackage.eNS_URI,
				kermeta.kunit.KunitPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.standard.StandardPackage.eNS_URI,
				kermeta.standard.StandardPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.utils.UtilsPackage.eNS_URI,
				kermeta.utils.UtilsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.persistence.PersistencePackage.eNS_URI,
				kermeta.persistence.PersistencePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.xmltype.XmltypePackage.eNS_URI,
				kermeta.xmltype.XmltypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.ecore.EcorePackage.eNS_URI,
				kermeta.ecore.EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(kermeta.io.IoPackage.eNS_URI,
				kermeta.io.IoPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				kermeta.compiler.CompilerPackage.eNS_URI,
				kermeta.compiler.CompilerPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(simk.SimkPackage.eNS_URI,
				simk.SimkPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(km2ecore.Km2ecorePackage.eNS_URI,
				km2ecore.Km2ecorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				km2ecore.helper.ecore.EcorePackage.eNS_URI,
				km2ecore.helper.ecore.EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				km2ecore.helper.kermeta.KermetaPackage.eNS_URI,
				km2ecore.helper.kermeta.KermetaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				km2ecore.helper.java.JavaPackage.eNS_URI,
				km2ecore.helper.java.JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(km2ecore.common.CommonPackage.eNS_URI,
				km2ecore.common.CommonPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				km2ecore.common.exception.ExceptionPackage.eNS_URI,
				km2ecore.common.exception.ExceptionPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(
				traceability.TraceabilityPackage.eNS_URI,
				traceability.TraceabilityPackage.eINSTANCE);

	}

	/**
	 * @generated
	 */
	public HashMap<String, String> uri_ePackageClass = new HashMap<String, String>();

	/**
	 * @generated
	 */
	private void initializeMap() {
		uri_ePackageClass.put("http://www.eclipse.org/emf/2002/Ecore",
				"org.eclipse.emf.ecore.EcorePackage");
		uri_ePackageClass.put("http://www.kermeta.org/kermeta/1_2_0//kermeta",
				"fr.irisa.triskell.kermeta.KmPackage");
		uri_ePackageClass.put(
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/language",
				"fr.irisa.triskell.kermeta.language.LanguagePackage");
		uri_ePackageClass
				.put(
						"http://www.kermeta.org/kermeta/1_2_0//kermeta/language/behavior",
						"fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage");
		uri_ePackageClass
				.put(
						"http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure",
						"fr.irisa.triskell.kermeta.language.structure.StructurePackage");
		uri_ePackageClass.put("http://www.kermeta.org/simk",
				"org.kermeta.simk.SimkPackage");
		uri_ePackageClass.put("http://www.kermeta.org/Traceability",
				"fr.irisa.triskell.traceability.TraceabilityPackage");

	}

}
