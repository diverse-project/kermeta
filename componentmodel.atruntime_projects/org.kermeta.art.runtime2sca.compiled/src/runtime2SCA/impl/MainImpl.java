/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package runtime2SCA.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.persistence.EMFRepository;

import org.eclipse.emf.ecore.EClass;

import runtime2SCA.Main;
import runtime2SCA.Runtime2SCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MainImpl extends ObjectImpl implements Main {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Runtime2SCAPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public art.System loadModel(EMFRepository repository, String model) {

		art.System result = null;

		kermeta.persistence.Resource resource = repository.createResource(
				model, "http://art");

		resource.load();

		result = (art.System) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(resource.instances().one(), "art.System");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mainWithParameter(String modelURI, String file) {

		java.lang.String content = null;

		art.System system = this
				.loadModel(
						((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
										.getEMFRepository())), modelURI);

		sca.SCA generator = ((sca.SCA) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(sca.ScaPackage.eINSTANCE.getSCA()));

		content = generator.generate(system);

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(
				"Generating base configuration...");

		kermeta.io.FileIO fileWriter = ((kermeta.io.FileIO) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.io.IoPackage.eINSTANCE.getFileIO()));

		fileWriter.writeTextFile(file, content);

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(
				"OK!");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {

		java.lang.String modelURI = "platform:/resource/SmartAdapters/examples/serviceDiscovery/model/woven/DAModel.art";

		java.lang.String file = "C:/Documents and Settings/bmorin/workspace/SCA_example/src/test.composite";

		this.mainWithParameter(modelURI, file);

	}

} //MainImpl
