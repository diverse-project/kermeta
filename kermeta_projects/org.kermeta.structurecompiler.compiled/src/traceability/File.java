/**
 * <copyright>
 * </copyright>
 *
 * $Id: File.java,v 1.7 2008-10-29 08:29:22 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\ntraceability.File result = null;\n\n\ttraceability.File file = null;\n//BIft:detect\n\ntraceability.File result_ft253 = null;\n\n\ttraceability.File elem_ft253 = null;\n\n\tresult_ft253 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<traceability.File> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).iterator();\n\tjava.lang.Boolean idLoopCond_1103 = false;\n\twhile( !idLoopCond_1103 ) {\n\tidLoopCond_1103 = kermeta.standard.helper.BooleanWrapper.or(it_ft253.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft253, null));\n\tif ( idLoopCond_1103 ) {\n\t} else {\n\n\telem_ft253 = it_ft253.next();\n\n\tjava.lang.Boolean idIfCond_1104 = false;\n//BIle:detector\ntraceability.File f_lbdExp253 = elem_ft253;\n\n\tidIfCond_1104 = kermeta.standard.helper.StringWrapper.equals(f_lbdExp253.getUri(), uri_toFind);\n//EIle:detector\n\n\n\tif( idIfCond_1104 ) {\n\n\tresult_ft253 = elem_ft253;\n}\n\n}\n\t}\n}\n\n\n//CE\nfile = result_ft253;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_1105 = false;\n\tidIfCond_1105 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(file);\n\n\tif( idIfCond_1105 ) {\n\n\tfile = ((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"traceability.File\"));\n\n\tfile.setUri(uri_toFind);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).add(file);\n\n\tfile.setId(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.File>convertAsOrderedSet(traceModel.getFiles()).size());\n}\n\n\n\tresult = file;\n\nreturn result;\n'"
	 * @generated
	 */
	File getFile(TraceModel traceModel, String uri_toFind);

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
