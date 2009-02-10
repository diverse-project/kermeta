/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: File.java,v 1.11 2009-02-10 17:51:57 cfaucher Exp $
 */
package traceability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.File#getId <em>Id</em>}</li>
 *   <li>{@link traceability.File#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getFile()
 * @model
 * @generated
 */
public interface File extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see traceability.TraceabilityPackage#getFile_Id()
	 * @model dataType="traceability.Integer"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link traceability.File#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see traceability.TraceabilityPackage#getFile_Uri()
	 * @model dataType="traceability.String" required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link traceability.File#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uri_toFindDataType="traceability.String"
	 *        annotation="kermeta EMF_renameAs='getFileEMF_renameAs'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.File result = null;\n\n\ttraceability.File file = null;\n//BIft:detect\n\ntraceability.File result_ft258 = null;\n\n\ttraceability.File elem_ft258 = null;\n\n\tresult_ft258 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.File> it_ft258 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).iterator();\n\tjava.lang.Boolean idLoopCond_1142 = false;\n\twhile( !idLoopCond_1142 ) {\n\tidLoopCond_1142 = kermeta.standard.helper.BooleanWrapper.or(it_ft258.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft258, null));\n\tif ( idLoopCond_1142 ) {\n\t} else {\n\n\telem_ft258 = it_ft258.next();\n\n\tjava.lang.Boolean idIfCond_1143 = false;\n//BIle:detector\ntraceability.File f_lbdExp258 = elem_ft258;\n\n\tidIfCond_1143 = kermeta.standard.helper.StringWrapper.equals(f_lbdExp258.getUri(), uri_toFind);\n//EIle:detector\n\n\n\tif( idIfCond_1143 ) {\n\n\tresult_ft258 = elem_ft258;\n}\n\n}\n\t}\n}\n\n\n//CE\nfile = result_ft258;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1144 = false;\n\tidIfCond_1144 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(file);\n\n\tif( idIfCond_1144 ) {\n\n\tfile = ((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(traceability.TraceabilityPackage.eINSTANCE.getFile()));\n\n\tfile.setUri(uri_toFind);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).add(file);\n\n\tfile.setId(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).size());\n}\n\n\n\tresult = file;\n\nreturn result;\n'"
	 * @generated
	 */
	File getFileEMF_renameAs(TraceModel traceModel, String uri_toFind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="traceability.String"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"self.uri: \", this.getUri()), \" - self.id: \"), kermeta.standard.helper.IntegerWrapper.toString(this.getId()));\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // File
