/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Message.java,v 1.11 2009-02-10 17:51:56 cfaucher Exp $
 */
package traceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.Message#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.Message#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.Message#getValue <em>Value</em>}</li>
 *   <li>{@link traceability.Message#getLanguage <em>Language</em>}</li>
 *   <li>{@link traceability.Message#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getMessage()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace message, used to add some information to traces.\r\n * Typically, in order to known what had generated a given trace or provide a user\r\n * friendly message to the user.\r\n \052/'"
 * @generated
 */
public interface Message extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link traceability.TraceModel#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TraceModel)
	 * @see traceability.TraceabilityPackage#getMessage_TraceMdl()
	 * @see traceability.TraceModel#getMessages
	 * @model opposite="messages" required="true" transient="false"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TraceModel getTraceMdl();

	/**
	 * Sets the value of the '{@link traceability.Message#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TraceModel value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' reference list.
	 * The list contents are of type {@link traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link traceability.Trace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' reference list.
	 * @see traceability.TraceabilityPackage#getMessage_Traces()
	 * @see traceability.Trace#getDescription
	 * @model opposite="description"
	 *        annotation="kermeta documentation='/** Link to the traces the message is associated with \052/'"
	 * @generated
	 */
	EList<Trace> getTraces();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see traceability.TraceabilityPackage#getMessage_Value()
	 * @model dataType="traceability.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link traceability.Message#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see traceability.TraceabilityPackage#getMessage_Language()
	 * @model dataType="traceability.String"
	 *        annotation="kermeta documentation='/** Language of the message (english, french, etc.) \052/'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link traceability.Message#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see traceability.TraceabilityPackage#getMessage_Type()
	 * @model dataType="traceability.String"
	 *        annotation="kermeta documentation='/** Message kind \052/'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link traceability.Message#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Message
