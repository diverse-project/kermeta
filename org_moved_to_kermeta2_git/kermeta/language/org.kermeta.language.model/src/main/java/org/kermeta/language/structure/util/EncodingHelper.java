/* $Id: EncodingHelper.java,v 1.2 2007-07-24 13:47:31 ftanguy Exp $
 * Project: fr.irisa.triskell.kermeta.model
 * File: EncodingHelper.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: June 05, 2007
 * Authors: cfaucher
 */

package org.kermeta.language.structure.util;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EModelElementImpl;

/**
 * Encoding helper used to encode the string representing a path in a xmi file
 */
public class EncodingHelper {

	private static final String [] ESCAPE =
	   {
	     "%00",
	     "%01",
	     "%02",
	     "%03",
	     "%04",
	     "%05",
	     "%06",
	     "%07",
	     "%08",
	     "%09",
	     "%0A",
	     "%0B",
	     "%0C",
	     "%0D",
	     "%0E",
	     "%0F",
	     "%10",
	     "%11",
	     "%12",
	     "%13",
	     "%14",
	     "%15",
	     "%16",
	     "%17",
	     "%18",
	     "%19",
	     "%1A",
	     "%1B",
	     "%1C",
	     "%1D",
	     "%1E",
	     "%1F",
	     "%20",
	     null,
	     "%22",
	     "%23",
	     null,
	     "%25",
	     "%26",
	     "%27",
	     null,
	     null,
	     null,
	     null,
	     "%2C",
	     null,
	     null,
	     "%2F",
	     null,
	     null,
	     null,
	     null,
	     null,
	     null,
	     null,
	     null,
	     null,
	     null,
	     "%3A",
	     null,
	     "%3C",
	     null,
	     "%3E",
	     null,
	   };
	  
	  private static void eEncodeValue(StringBuilder result, EFactory eFactory, EDataType eDataType, Object value)
	  {
	    String stringValue = eFactory.convertToString(eDataType, value);
	    if (stringValue == null)
	    {
	      result.append("null");
	    }
	    else
	    {
	      int length = stringValue.length();
	      result.ensureCapacity(result.length() + length + 2);
	      result.append('\'');
	      for (int i = 0; i < length; ++i)
	      {
	        char character = stringValue.charAt(i);
	        if (character < ESCAPE.length)
	        {
	          String escape = ESCAPE[character];
	          if (escape != null)
	          {
	            result.append(escape);
	            continue;
	          }
	        }
	        result.append(character);
	      }
	      result.append('\'');
	    }
	  }
	  
	  /**
	   * Returns the encoded value or the original, if no encoding was needed.
	   * @see EModelElementImpl#eURIFragmentSegment(EStructuralFeature, EObject)
	   * @param value the value to be encoded.
	   * @return the encoded value or the original, if no encoding was needed.
	   */
	  public static String eEncodeValue(String value)
	  {
	    int length = value.length();
	    StringBuilder result = null;
	    for (int i = 0; i < length; ++i)
	    {
	      char character = value.charAt(i);
	      if (character < ESCAPE.length)
	      {
	        String escape = ESCAPE[character];
	        if (escape != null)
	        {
	          if (result == null)
	          {
	            result = new StringBuilder(length + 2);
	            result.append(value, 0, i);
	          }
	          result.append(escape);
	          continue;
	        }
	      }
	      if (result != null)
	      {
	        result.append(character);
	      }
	    }
	    return result == null ? value : result.toString();
	  }
}
