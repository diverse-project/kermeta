/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentAttachment.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fragment Attachment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link option.FragmentAttachment#getFragmentAttachment <em>Fragment Attachment</em>}</li>
 * </ul>
 * </p>
 * 
 * @see option.OptionPackage#getFragmentAttachment()
 * @model
 * @generated
 */
public interface FragmentAttachment extends SymbolicNameDirective {
	/**
	 * Returns the value of the '<em><b>Fragment Attachment</b></em>'
	 * attribute. The literals are from the enumeration
	 * {@link option.FragmentAttachmentEnum}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Attachment</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fragment Attachment</em>' attribute.
	 * @see option.FragmentAttachmentEnum
	 * @see #setFragmentAttachment(FragmentAttachmentEnum)
	 * @see option.OptionPackage#getFragmentAttachment_FragmentAttachment()
	 * @model required="true"
	 * @generated
	 */
	FragmentAttachmentEnum getFragmentAttachment();

	/**
	 * Sets the value of the '{@link option.FragmentAttachment#getFragmentAttachment <em>Fragment Attachment</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Fragment Attachment</em>'
	 *            attribute.
	 * @see option.FragmentAttachmentEnum
	 * @see #getFragmentAttachment()
	 * @generated
	 */
	void setFragmentAttachment(FragmentAttachmentEnum value);

} // FragmentAttachment
