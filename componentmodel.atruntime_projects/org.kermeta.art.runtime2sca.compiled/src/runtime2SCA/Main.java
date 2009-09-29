/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package runtime2SCA;

import kermeta.persistence.EMFRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see runtime2SCA.Runtime2SCAPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nart.System result = null;\n\n\tkermeta.persistence.Resource resource = null;\n\n\t{\ntry {\n\tresource = repository.createResource(model, \"http://art\");\n\n\tresource.load();\n\n\tresult = (art.System) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(resource.instances().one(), \"art.System\");\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {\nboolean caught_5 = false;\n\nif( !caught_5 ) { throw ex_switcher_5; }\n\n}\n}\n\nreturn result;\n'"
	 * @generated
	 */
	art.System loadModel(EMFRepository repository, String model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelURIDataType="kermeta.standard.JavaString" fileDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.String content = null;\n\n\tart.System system = this.loadModel(((kermeta.persistence.EMFRepository) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.persistence.PersistencePackage.eINSTANCE.getEMFRepository())), modelURI);\n\n\tsca.SCA generator = ((sca.SCA) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(sca.ScaPackage.eINSTANCE.getSCA()));\n\n\tcontent = generator.generate(system);\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(\"Generating base configuration...\");\n\n\tkermeta.io.FileIO fileWriter = ((kermeta.io.FileIO) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.io.IoPackage.eINSTANCE.getFileIO()));\n\n\tfileWriter.writeTextFile(file, content);\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().write(\"OK!\");\n'"
	 * @generated
	 */
	void mainWithParameter(String modelURI, String file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.String modelURI = \"platform:/resource/org.kermeta.art.Runtime2SCA/model/diagram.art\";\n\n\tjava.lang.String file = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.substring(modelURI, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(modelURI), 3)), \"composite\");\n\n\tthis.mainWithParameter(modelURI, file);\n'"
	 * @generated
	 */
	void main();

} // Main
