/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReference.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EReference#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link ecore.EReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link ecore.EReference#isContainer <em>Container</em>}</li>
 *   <li>{@link ecore.EReference#getEKeys <em>EKeys</em>}</li>
 *   <li>{@link ecore.EReference#isContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEReference()
 * @model annotation="kermeta aspect='true'"
 * @generated
 */
public interface EReference extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOpposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOpposite</em>' reference.
	 * @see #setEOpposite(EReference)
	 * @see ecore.EcorePackage#getEReference_EOpposite()
	 * @model
	 * @generated
	 */
	EReference getEOpposite();

	/**
	 * Sets the value of the '{@link ecore.EReference#getEOpposite <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOpposite</em>' reference.
	 * @see #getEOpposite()
	 * @generated
	 */
	void setEOpposite(EReference value);

	/**
	 * Returns the value of the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Type</em>' reference.
	 * @see ecore.EcorePackage#getEReference_EReferenceType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tjava.lang.Boolean idIfCond_922 = false;\n\tidIfCond_922 = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this.getEType()).equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_922 ) {\n\n\tresult = (ecore.EClass) this.getEType();\n}\n else {\n\n\tkermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.Exception\"));\n\n\texception.setMessage(\"The EClassifer pointed by this EReference must be of type EClass\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tjava.lang.Boolean idIfCond_923 = false;\n\tidIfCond_923 = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this.getEType()).equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"));\n\n\tif( idIfCond_923 ) {\n\n\tresult = (ecore.EClass) this.getEType();\n}\n else {\n\n\tkermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.Exception\"));\n\n\texception.setMessage(\"The EClassifer pointed by this EReference must be of type EClass\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n\n}'"
	 * @generated
	 */
	EClass getEReferenceType();

	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Proxies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see ecore.EcorePackage#getEReference_ResolveProxies()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see ecore.EcorePackage#getEReference_Container()
	 * @model default="false" dataType="ecore.EBoolean" transient="true" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kompiledderivedProp.setter body=''"
	 *        annotation="kompiledderivedProp.getter body=''"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Returns the value of the '<em><b>EKeys</b></em>' reference list.
	 * The list contents are of type {@link ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EKeys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EKeys</em>' reference list.
	 * @see ecore.EcorePackage#getEReference_EKeys()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getEKeys();

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see ecore.EcorePackage#getEReference_Containment()
	 * @model default="false" dataType="ecore.EBoolean"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link ecore.EReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model booleanValueDataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cls = null;\n\n\tcls = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).getTypeDefinition();\n\n\t//Beginning of the Inlining of the function type: detect\n\nkermeta.language.structure.Property result_ft216 = null;\n\n\tkermeta.language.structure.Property elem_ft216 = null;\n\n\tresult_ft216 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft216 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cls.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_924 = false;\n\twhile( !idLoopCond_924 ) {\n\tidLoopCond_924 = kermeta.standard.helper.BooleanWrapper.or(it_ft216.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft216, null));\n\tif ( idLoopCond_924 ) {\n\t} else {\n\n\telem_ft216 = it_ft216.next();\n\n\tjava.lang.Boolean idIfCond_925 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.structure.Property p = elem_ft216;\n\n\tidIfCond_925 = kermeta.standard.helper.StringWrapper.equals(p.getName(), \"container\");\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_925 ) {\n\n\tresult_ft216 = elem_ft216;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\norg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, result_ft216, booleanValue);\n'"
	 * @generated
	 */
	void setContainerValue(boolean booleanValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.EBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tkermeta.language.structure.ClassDefinition cls = null;\n\n\tcls = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).getTypeDefinition();\n\n\t//Beginning of the Inlining of the function type: detect\n\nkermeta.language.structure.Property result_ft217 = null;\n\n\tkermeta.language.structure.Property elem_ft217 = null;\n\n\tresult_ft217 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cls.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_926 = false;\n\twhile( !idLoopCond_926 ) {\n\tidLoopCond_926 = kermeta.standard.helper.BooleanWrapper.or(it_ft217.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft217, null));\n\tif ( idLoopCond_926 ) {\n\t} else {\n\n\telem_ft217 = it_ft217.next();\n\n\tjava.lang.Boolean idIfCond_927 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.structure.Property p = elem_ft217;\n\n\tidIfCond_927 = kermeta.standard.helper.StringWrapper.equals(p.getName(), \"container\");\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_927 ) {\n\n\tresult_ft217 = elem_ft217;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\norg.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, result = (java.lang.Boolean) result_ft217);\n\nreturn result;\n'"
	 * @generated
	 */
	boolean getContainerValue();

} // EReference
