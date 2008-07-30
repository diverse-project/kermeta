/**
 * <copyright>
 * </copyright>
 *
 * $Id: Processor.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.Processor#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends NativeCodeDirective {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute. The
	 * literals are from the enumeration {@link option.ProcessorEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see option.ProcessorEnum
	 * @see #setProcessor(ProcessorEnum)
	 * @see option.OptionPackage#getProcessor_Processor()
	 * @model required="true"
	 * @generated
	 */
	ProcessorEnum getProcessor();

	/**
	 * Sets the value of the '{@link option.Processor#getProcessor <em>Processor</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Processor</em>' attribute.
	 * @see option.ProcessorEnum
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(ProcessorEnum value);

} // Processor
