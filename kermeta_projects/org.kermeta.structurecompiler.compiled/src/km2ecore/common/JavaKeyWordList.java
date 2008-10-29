/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaKeyWordList.java,v 1.7 2008-10-29 08:29:38 cfaucher Exp $
 */
package km2ecore.common;

import kermeta.utils.Hashtable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Key Word List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link km2ecore.common.JavaKeyWordList#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @see km2ecore.common.CommonPackage#getJavaKeyWordList()
 * @model
 * @generated
 */
public interface JavaKeyWordList extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference.
	 * @see #setKeywords(Hashtable)
	 * @see km2ecore.common.CommonPackage#getJavaKeyWordList_Keywords()
	 * @model type="kermeta.utils.Hashtable<kermeta.standard.JavaString, kermeta.standard.JavaString>" containment="true" resolveProxies="true"
	 * @generated
	 */
	Hashtable<String, String> getKeywords();

	/**
	 * Sets the value of the '{@link km2ecore.common.JavaKeyWordList#getKeywords <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' containment reference.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(Hashtable<String, String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" strDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getKeywords().getValue(str)));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKeyword(String str);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kwDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.getKeywords().put(kw, kw);\n'"
	 * @generated
	 */
	void addKeyword(String kw);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** This list has been created from the content of the web page: http://java.sun.com/docs/books/tutorial/java/nutsandbolts/_keywords.html \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setKeywords(((kermeta.utils.Hashtable<java.lang.String, java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.Hashtable<java.lang.String, java.lang.String>\")));\n\n\tthis.addKeyword(\"abstract\");\n\n\tthis.addKeyword(\"continue\");\n\n\tthis.addKeyword(\"for\");\n\n\tthis.addKeyword(\"new\");\n\n\tthis.addKeyword(\"switch\");\n\n\tthis.addKeyword(\"assert\");\n\n\tthis.addKeyword(\"default\");\n\n\tthis.addKeyword(\"goto\");\n\n\tthis.addKeyword(\"package\");\n\n\tthis.addKeyword(\"synchronized\");\n\n\tthis.addKeyword(\"boolean\");\n\n\tthis.addKeyword(\"do\");\n\n\tthis.addKeyword(\"if\");\n\n\tthis.addKeyword(\"private\");\n\n\tthis.addKeyword(\"this\");\n\n\tthis.addKeyword(\"break\");\n\n\tthis.addKeyword(\"double\");\n\n\tthis.addKeyword(\"implements\");\n\n\tthis.addKeyword(\"protected\");\n\n\tthis.addKeyword(\"throw\");\n\n\tthis.addKeyword(\"byte\");\n\n\tthis.addKeyword(\"else\");\n\n\tthis.addKeyword(\"import\");\n\n\tthis.addKeyword(\"public\");\n\n\tthis.addKeyword(\"throws\");\n\n\tthis.addKeyword(\"case\");\n\n\tthis.addKeyword(\"enum\");\n\n\tthis.addKeyword(\"instanceof\");\n\n\tthis.addKeyword(\"return\");\n\n\tthis.addKeyword(\"transient\");\n\n\tthis.addKeyword(\"catch\");\n\n\tthis.addKeyword(\"extends\");\n\n\tthis.addKeyword(\"int\");\n\n\tthis.addKeyword(\"short\");\n\n\tthis.addKeyword(\"try\");\n\n\tthis.addKeyword(\"char\");\n\n\tthis.addKeyword(\"final\");\n\n\tthis.addKeyword(\"interface\");\n\n\tthis.addKeyword(\"static\");\n\n\tthis.addKeyword(\"void\");\n\n\tthis.addKeyword(\"class\");\n\n\tthis.addKeyword(\"finally\");\n\n\tthis.addKeyword(\"long\");\n\n\tthis.addKeyword(\"strictfp\");\n\n\tthis.addKeyword(\"volatile\");\n\n\tthis.addKeyword(\"const\");\n\n\tthis.addKeyword(\"float\");\n\n\tthis.addKeyword(\"native\");\n\n\tthis.addKeyword(\"super\");\n\n\tthis.addKeyword(\"while\");\n\n\tthis.addKeyword(\"true\");\n\n\tthis.addKeyword(\"false\");\n\n\tthis.addKeyword(\"null\");\n\n\tthis.addKeyword(\"result\");\n'"
	 * @generated
	 */
	void initialize();

} // JavaKeyWordList
