package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public interface RuntimeObject {

	public static final String STRING_VALUE = "StringValue";
	public static final String STRING_BUFFER_VALUE = "StringBufferValue";
	public static final String BOOLEAN_VALUE = "BooleanValue";
	public static final String NUMERIC_VALUE = "NumericValue";
	public static final String COLLECTION_VALUE = "CollectionArrayList";
	public static final String JAVA_OBJECT = "javaObject";
	public static final String CHARACTER_VALUE = "CharacterValue";
	public static final String ITERATOR_VALUE = "Iterator";
	public static final String HASHTABLE_VALUE = "Hashtable";

	/**
	 * quick fix patch for #bug 137 
	 * see http://gforge.inria.fr/tracker/index.php?func=detail&aid=137&group_id=32&atid=205
	 * @return Returns the container in the mof meaning (black diamond).
	 */
	public abstract RuntimeObject getContainer();

	/**
	 * @param container The container to set.
	 */
	public abstract void setContainer(RuntimeObject container);

	/**
	 * Returns the data, which contains different kinds of objects according to
	 * the Kermeta type that is represented.
	 * Here is the currently exhaustive list of available keys in this hashtable, and a description
	 * of the corresponding values: 
	 * (i.e : How to access the internal structure of a RuntimeObject):
	 *  
	 *   - <b>kcoreObject</b> : the Kermeta Object represented by this runtime object. Note that if the runtime object is an 
	 *     <em>instance</em> (by opposition to a model) then there is no kcoreObject.<br>
	 *     Common uses of data :<br>
	 *     - <code>Class a_fclass = (Class)a_runtimeobject.getMetaclass().getData().get("kcoreObject")</code>;
	 *     gets the class (in its "model representation") of which the given runtimeobject is an instance.
	 *     - <cod0e>Property a_fprop = (Property)a_ro_property.getData().get("kcoreObject")</code>;
	 *     gets the model representation of the given runtime property.
	 *   - <b>[String|Numeric|Boolean|Character]Value</b> : the java primitive type corresponding to this
	 *     RuntimeObject. Only provided for runtime object that represents primitive types!
	 *   - <b>CollectionArrayList</b> : if the RuntimeObject represents a Collection (Set, OrderedSet or any inheriting
	 *   class of Collection in kermeta side), then this entry's value is a java Collection of RuntimeObjects.
	 *   (Collection&lt;RuntimeObject&gt;)
	 *   - <b>Hashtable</b> : used to store a java Hashtable in a RuntimeObject representing a Kermeta hashtable
	 *   - <b>r2e.emfResource</b> : used to store an EMF Resource in a RuntimeObject representing a Kermeta EMFResource
	 *   Typically used while loading a model
	 *   - <b>r2e.emfResourceset</b> : used to store EMF ResourceSet in the kermeta RuntimeObject representing an EMFRepository
	 *   - <b>emfObject</b> : used to store the EObject that this RuntimeObject represents; may not be present if the object was created from kermeta
	 *   in this case, the Runtime2EMF class is in charge to fill it when saving the Runtime Object
	 *   - <b>r2e.emfObject</b> : used when serializing RuntimeObject to EObject: As far as I know it is used only in Runtime2EMF class, but I am not able to explain its full purpose :-(
	 * @return Returns the data represented by this runtime object.
	 */
	/*public Hashtable<String,Object> getData() {
		return data;
	}*/
	/**
	 * @param data The data to set.
	 */
	/*	public void setData(Hashtable<String,Object> data) {
			this.data = data;
		}*/
	/**
	 * @return Returns true if the RuntimeObject is not modifiable, false otherwise.
	 */
	public abstract boolean isFrozen();

	/**
	 * @param frozen The frozen to set.
	 */
	public abstract void setFrozen(boolean frozen);

	/**
	 * @return Returns the metaclass of this runtime object.
	 */
	public abstract RuntimeObject getMetaclass();

	/**
	 * @param metaclass The metaclass to set.
	 */
	public abstract void setMetaclass(RuntimeObject metaclass);

	/**
	 * Returns the properties of this runtime object.
	 * Indexed by the name (a String) of the property
	 * <pre>class X
	 * { 
	 *    attribute y : Y 
	 *    attribute z : Z
	 * }
	 * </pre>
	 * 
	 * The properties hashtable of the RuntimeObject representation of an instance of X : 
	 * <pre>{ "y" : a_RuntimeObject_as_instance_of_Y, "z" : a_RuntimeObject_as_instance_of_z }</pre>
	 * @return Returns the properties.
	 */
	public abstract Hashtable<String, RuntimeObject> getProperties();

	/**
	 * @return Returns the factory used to create RuntimeObjects.
	 */
	public abstract RuntimeObjectFactory getFactory();

	/**
	 * @return A string representation of this runtime object : <code>[ class_name : oId ]</code>, or
	 * <code>[ class_name : oId = &lt;a_printable_value&gt;</code> for primitive types.
	 */
	public abstract String toString();

	/**
	 * @return A simplified string representation of this runtime object : <code>[ class_name : oId ]</code>,
	 * or a printable value for primitive types..
	 */
	public abstract String toUserString();

	/** @return the ID of this runtime object */
	public abstract long getOId();

	public abstract fr.irisa.triskell.kermeta.language.structure.Object getKCoreObject();

	public abstract void setKCoreObject(
			fr.irisa.triskell.kermeta.language.structure.Object coreObject);

	public abstract Object getJavaNativeObject();

	public abstract void setJavaNativeObject(Object javaNativeObject);

	public abstract String getPrimitiveType();

	public abstract void setPrimitiveType(String primitiveType);

	public abstract boolean isJarProxy();

	public abstract void setJarProxy(boolean isJarProxy);

	public abstract EObject getR2eEmfObject();

	public abstract void setR2eEmfObject(EObject emfObject);

	public abstract ResourceSet getR2eEmfResourceset();

	public abstract void setR2eEmfResourceset(ResourceSet emfResourceset);

	public abstract Resource getR2eEmfResource();

	public abstract void setR2eEmfResource(Resource emfResource);

	public abstract RuntimeObject getModelType();

	public abstract void setModelType(RuntimeObject modelType);

	public abstract DynamicExpressionUnit getDynamicExpressionUnit();

	public abstract void setDynamicExpressionUnit(
			DynamicExpressionUnit dynamicExpressionUnit);

	public abstract RuntimeObject getResourceRO();

	public abstract void setResourceRO(RuntimeObject resourceRO);

	public abstract RuntimeObject getRObject();

	public abstract void setRObject(RuntimeObject object);

	public abstract RuntimeObject getRProperty();

	public abstract void setRProperty(RuntimeObject property);

	public abstract Object getEmfObject();

	public abstract void setEmfObject(Object emfObject);

}