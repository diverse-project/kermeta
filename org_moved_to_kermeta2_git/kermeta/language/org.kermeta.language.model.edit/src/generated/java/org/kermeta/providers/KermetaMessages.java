/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.providers;

import org.eclipse.osgi.util.NLS;

/**
 * @author Didier Vojtisek
 * 
 */
public class KermetaMessages extends NLS {
	
	private static final String BUNDLE_NAME = "org.kermeta.providers.kermetaMessages"; //$NON-NLS-1$




	
	public static String PropertiesEditionPart_DocumentationLabel;

	
	public static String PropertiesEditionPart_IntegerValueMessage;

	
	public static String PropertiesEditionPart_FloatValueMessage;

	
	public static String PropertiesEditionPart_ShortValueMessage;

	
	public static String PropertiesEditionPart_LongValueMessage;

	
	public static String PropertiesEditionPart_ByteValueMessage;

	
	public static String PropertiesEditionPart_BigIntegerValueMessage;

	
	public static String PropertiesEditionPart_BigDecimalValueMessage;

	
	public static String PropertiesEditionPart_DoubleValueMessage;

	
	public static String PropertiesEditionPart_PropertiesGroupLabel;

	
	public static String PropertiesEditionPart_RequiredFeatureMessage;

	
	public static String PropertiesEditionPart_AddTableViewerLabel;

	
	public static String PropertiesEditionPart_EditTableViewerLabel;

	
	public static String PropertiesEditionPart_RemoveTableViewerLabel;

	
	public static String PropertiesEditionPart_AddListViewerLabel;

	
	public static String PropertiesEditionPart_RemoveListViewerLabel;

	// Start of user code for additionnal NLS Constants
	
	// End of user code

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, KermetaMessages.class);
	}

	
	private KermetaMessages() {
		//protect instanciation
	}
}
