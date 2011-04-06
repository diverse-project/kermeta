/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.util;

/**
 * Utility class that provides a method to cast objects to type parameterized
 * classes without a warning.
 */
public class KpCastUtil {
	
	@SuppressWarnings("unchecked")	
	public static <T> T cast(Object temp) {
		return (T) temp;
	}
}
