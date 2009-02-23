/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Constraint.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EAnnotation;

import kermeta.language.behavior.Expression;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Constraint#getId <em>Id</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getConstraint()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Constraint is part of a contract implementation in a Class definition or an operation.\nThree kinds of constraints are available : pre, post, and inv (invariant constraint)'"
 * @generated
 */
public interface Constraint extends NamedElement, Traceability<EAnnotation> {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Id()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Body()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 *        annotation="kermeta documentation='Body of the constraint, expressed as a KerMeta expression'"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Pre Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Owner</em>' container reference.
	 * @see #setPreOwner(Operation)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_PreOwner()
	 * @see kermeta.language.structure.Operation#getPre
	 * @model opposite="pre" transient="false"
	 *        annotation="kermeta documentation='Owning Operation if Constraint corresponds to pre-condition'"
	 * @generated
	 */
	Operation getPreOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Owner</em>' container reference.
	 * @see #getPreOwner()
	 * @generated
	 */
	void setPreOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link kermeta.language.structure.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see kermeta.language.structure.ConstraintType
	 * @see #setStereotype(ConstraintType)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Stereotype()
	 * @model transient="true"
	 *        annotation="kermeta documentation='Type of the Constraint (precond/postcond/inv)'"
	 * @generated
	 */
	ConstraintType getStereotype();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see kermeta.language.structure.ConstraintType
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Post Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Owner</em>' container reference.
	 * @see #setPostOwner(Operation)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_PostOwner()
	 * @see kermeta.language.structure.Operation#getPost
	 * @model opposite="post" transient="false"
	 *        annotation="kermeta documentation='Owning Operation if Constraint corresponds to post-condition'"
	 * @generated
	 */
	Operation getPostOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Owner</em>' container reference.
	 * @see #getPostOwner()
	 * @generated
	 */
	void setPostOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link kermeta.language.structure.ConstraintLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see kermeta.language.structure.ConstraintLanguage
	 * @see #setLanguage(ConstraintLanguage)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Language()
	 * @model transient="true"
	 *        annotation="kermeta documentation='Language in which the constraint is expressed'"
	 * @generated
	 */
	ConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see kermeta.language.structure.ConstraintLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ConstraintLanguage value);

	/**
	 * Returns the value of the '<em><b>Inv Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Owner</em>' container reference.
	 * @see #setInvOwner(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_InvOwner()
	 * @see kermeta.language.structure.ClassDefinition#getInv
	 * @model opposite="inv" transient="false"
	 *        annotation="kermeta documentation='Owning ClassDefinition if Constraint corresponds to invariant'"
	 * @generated
	 */
	ClassDefinition getInvOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Owner</em>' container reference.
	 * @see #getInvOwner()
	 * @generated
	 */
	void setInvOwner(ClassDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_306 = false;\n\tidIfCond_306 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"));\n\n\tif( idIfCond_306 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.getBody().createBehaviorJava(context));\n}\n else {\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setIsLastExpression(true);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.getBody().createExpression(context, ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStringBuffer()))).toString());\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tsimk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForInvariant(this, context);\n\n\tjava.lang.Boolean idIfCond_307 = false;\n\tidIfCond_307 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(smContext));\n\n\tif( idIfCond_307 ) {\n\n\tsimk.SMMethod staticMethod = ((simk.SMMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMMethod()));\n\n\tstaticMethod.setName(kermeta.standard.helper.StringWrapper.plus(\"checkInvariant_\", this.getId()));\n\n\tstaticMethod.setBody(\"java.lang.Boolean result = false;\\n\");\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result = \", context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tjava.lang.Boolean staticOperationMode_backup = context.getStaticOperationMode();\n\n\tcontext.setStaticOperationMode(true);\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), this.createBehaviorJava(context)));\n\n\tcontext.setStaticOperationMode(staticOperationMode_backup);\n\n\tstaticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), \"\\nreturn result;\"));\n\n\tcontext.getResultLastStatementStack().pop();\n\n\tstaticMethod.setUsages(simk.SMUsage.getByName(\"Invariant\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(context.getSimkModel().getSMMethods()).add(staticMethod);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMMethod>convertAsOrderedSet(smContext.getSMMethods()).add(staticMethod);\n\n\tsimk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMReturn()));\n\n\tsmReturn.setType(\"java.lang.Boolean\");\n\n\tstaticMethod.setSMReturn(smReturn);\n\n\tsimk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(simk.SimkPackage.eINSTANCE.getSMParameter()));\n\n\tdefault_param.setName(\"self\");\n\n\tdefault_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).qualifiedName(), context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);\n}\n\n'"
	 * @generated
	 */
	void setSimkForInvariant(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Object c = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this);\n\n\tkermeta.language.structure.Property p = c.getPropertyValue(\"ecoreModelElement\");\n\n\tjava.lang.Boolean idIfCond_308 = false;\n\tidIfCond_308 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p, null);\n\n\tif( idIfCond_308 ) {\n\n\tecore.EModelElement ecoreModelElement = ((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(c, p), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EModelElement\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreModelElement.getEAnnotations()).add(ecoreAnnotation);\n}\n\n\n\tthis.setEcoreModelElement(ecoreAnnotation);\n\n\tthis.setId(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(this)), \"__\"), this.getName()));\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EAnnotation result = null;\n\n\tjava.lang.String body = \"\";\n\n\tjava.lang.Boolean idIfCond_309 = false;\n\tidIfCond_309 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"inv\"));\n\n\tif( idIfCond_309 ) {\n\n\tresult = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).create(\"kermeta.inv\", this.getName(), body);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_310 = false;\n\tidIfCond_310 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"pre\"));\n\n\tif( idIfCond_310 ) {\n\n\tresult = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).create(\"kermeta.pre\", this.getName(), body);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_311 = false;\n\tidIfCond_311 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"post\"));\n\n\tif( idIfCond_311 ) {\n\n\tresult = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).create(\"kermeta.post\", this.getName(), body);\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	EAnnotation createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used for the moment\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"pre\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPre(Constraint c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Not used for the moment\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"post\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPost(Constraint c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_312 = false;\n\tidIfCond_312 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getStereotype(), kermeta.language.structure.ConstraintType.getByName(\"inv\"));\n\n\tif( idIfCond_312 ) {\n\n\tthis.setSimkForInvariant(context);\n}\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Constraint
