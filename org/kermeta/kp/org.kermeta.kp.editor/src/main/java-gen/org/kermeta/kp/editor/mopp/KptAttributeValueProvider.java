/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * This class provides sets of values for attributes. It is used by the code
 * completion processor.
 */
public class KptAttributeValueProvider {
	
	public java.lang.Object[] getDefaultValues(org.eclipse.emf.ecore.EAttribute attribute) {
		String typeName = attribute.getEType().getName();
		if ("EString".equals(typeName)) {
			return new java.lang.Object[] {"some" + org.kermeta.kp.editor.util.KptStringUtil.capitalize(attribute.getName())};
		}
		if ("EBoolean".equals(typeName)) {
			return new java.lang.Object[] {Boolean.TRUE, Boolean.FALSE};
		}
		return new java.lang.Object[] {attribute.getDefaultValue()};
	}
	
}
