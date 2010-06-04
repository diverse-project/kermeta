/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.util;

// A utility class that can be used to work with EObjects.
// While many similar methods are provided by EMF's own
// EcoreUtil class, the missing ones are collected here.
//
// @see org.eclipse.emf.ecore.util.EcoreUtil
public class ArtextEObjectUtil {
	
	public static <T> java.util.Collection<T> getObjectsByType(java.util.Iterator<?> iterator,
	org.eclipse.emf.ecore.EClassifier type) {
		java.util.Collection<T> result = new java.util.ArrayList<T>();
		while (iterator.hasNext()) {
			java.lang.Object object = iterator.next();
			if (type.isInstance(object)) {
				@SuppressWarnings("unchecked")				T t = (T) object;
				result.add(t);
			}
		}
		return result;
	}
	
	public static org.eclipse.emf.ecore.EObject findRootContainer(org.eclipse.emf.ecore.EObject object) {
		org.eclipse.emf.ecore.EObject container = object.eContainer();
		if (container != null) {
			return findRootContainer(container);
		} else {
			return object;
		}
	}
	
	public static java.lang.Object invokeOperation(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EOperation o) {
		java.lang.reflect.Method method;
		try {
			method = element.getClass().getMethod(o.getName(), new Class[]{});
			if (method != null) {
				java.lang.Object result = method.invoke(element, new java.lang.Object[]{});
				return result;
			}
		} catch (SecurityException e) {
			art.resource.artext.mopp.ArtextPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (NoSuchMethodException e) {
			art.resource.artext.mopp.ArtextPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (IllegalArgumentException e) {
			art.resource.artext.mopp.ArtextPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (IllegalAccessException e) {
			art.resource.artext.mopp.ArtextPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		} catch (java.lang.reflect.InvocationTargetException e) {
			art.resource.artext.mopp.ArtextPlugin.logError("java.lang.Exception while matching proxy URI.", e);
		}
		return null;
	}
}
