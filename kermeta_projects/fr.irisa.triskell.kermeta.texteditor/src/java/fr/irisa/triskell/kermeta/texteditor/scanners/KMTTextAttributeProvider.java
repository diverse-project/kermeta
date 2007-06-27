/* $Id: KMTTextAttributeProvider.java,v 1.5 2007-06-27 13:19:27 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KMTTextAttributeProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package fr.irisa.triskell.kermeta.texteditor.scanners;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class KMTTextAttributeProvider {
	
	public static final Color ROYAL_BLUE 	= 	new Color(Display.getCurrent(), new RGB(24, 116, 205));
	public static final Color LIGHT_BLUE 	= 	new Color(Display.getCurrent(), new RGB(63, 95, 190));
	public static final Color BLUE_GREEN 	= 	new Color(Display.getCurrent(),	new RGB(65, 130, 90));
	public static final Color BLUE 			= 	new Color(Display.getCurrent(), new RGB(0, 0, 100));
	public static final Color BLACK 		= 	new Color( Display.getCurrent(), new RGB(0,0,0) );
	public static final Color FUSHIA 		= 	new Color(Display.getCurrent(), new RGB(127, 0, 85));
	public static final Color RED 			= new Color(Display.getCurrent(), new RGB(150, 0, 0));
	public static final Color GREEN 		= 	new Color(Display.getCurrent(), new RGB(0, 255, 0) );
	public static final Color PINK	 		= 	new Color(Display.getCurrent(), new RGB(255, 20, 147) );
	public static final Color SEASHELL	 	= 	new Color(Display.getCurrent(), new RGB(139, 134, 130) );
	

	
	
	public static final String COMMENT_ATTRIBUTE 	= 	"__kmt_comment_attribute";
	public static final String TAG_ATTRIBUTE 		= 	"__kmt_tag_attribute";
	public static final String KEYWORD_ATTRIBUTE 	= 	"__kmt_keyword_attribute";
	public static final String CONTROL_ATTRIBUTE 	= 	"__kmt_control_attribute";
	public static final String UNDEFINED_ATTRIBUTE 	= 	"__kmt_undefined_attribute";
	public static final String TYPE_ATTRIBUTE 		= 	"__kmt_type_attribute";
	public static final String SPECIAL_ATTRIBUTE 	= 	"__kmt_special_attribute";	
	public static final String LITERAL_ATTRIBUTE 	= 	"__kmt_literal_attribute";	
	public static final String OPERATOR_ATTRIBUTE 	= 	"__kmt_operator_attribute";	
	public static final String STRING_ATTRIBUTE 	= 	"__kmt_string_attribute";	
	
	
	private Map <String, TextAttribute> attributes = new HashMap <String, TextAttribute> ();

	
	static private KMTTextAttributeProvider instance = null;
	
	static private KMTTextAttributeProvider getInstance() {
		if ( instance == null ) {
			instance = new KMTTextAttributeProvider();
			instance.attributes.put(	COMMENT_ATTRIBUTE, 		new TextAttribute(BLUE_GREEN)			);
			instance.attributes.put(	TAG_ATTRIBUTE, 			new TextAttribute(LIGHT_BLUE)			);
			instance.attributes.put(	UNDEFINED_ATTRIBUTE, 	new TextAttribute( BLACK )				);
			instance.attributes.put(	KEYWORD_ATTRIBUTE, 		new TextAttribute( BLUE, null, 3 )		);
			instance.attributes.put(	CONTROL_ATTRIBUTE, 		new TextAttribute( BLUE, null, 3 )	);
			instance.attributes.put(	TYPE_ATTRIBUTE, 		new TextAttribute( BLACK, null, 1 )		);
			instance.attributes.put(	LITERAL_ATTRIBUTE, 		new TextAttribute( FUSHIA, null, 3 )	);
			instance.attributes.put(	SPECIAL_ATTRIBUTE, 		new TextAttribute( RED, null, 1 )		);
			instance.attributes.put(	OPERATOR_ATTRIBUTE, 	new TextAttribute( BLACK, null, 1 )		);
			instance.attributes.put(	STRING_ATTRIBUTE, 		new TextAttribute( LIGHT_BLUE )			);
		}
		return instance;
	}
	
	static TextAttribute getTextAttribute(String attributeID) {
		return getInstance().attributes.get(attributeID);
	}

}
