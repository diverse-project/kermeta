/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintHelper.java,v 1.3 2008-09-22 14:49:02 cfaucher Exp $
 */
package km2ecore.helper.kermeta;

import kermeta.language.structure.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.kermeta.KermetaPackage#getConstraintHelper()
 * @model
 * @generated
 */
public interface ConstraintHelper extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(c), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_1014 = false;\n\tidIfCond_1014 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(op, null);\n\n\tif( idIfCond_1014 ) {\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(op.getPre()).contains(c);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPre(Constraint c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(c), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_1015 = false;\n\tidIfCond_1015 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(op, null);\n\n\tif( idIfCond_1015 ) {\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(op.getPost()).contains(c);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isPost(Constraint c);

} // ConstraintHelper
