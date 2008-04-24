/*$Id: EscapeChars.java,v 1.1 2008-04-24 09:45:10 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	HTMLStringUtil.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*      Copied from internet  (well a rewritting is quite easy but a waste of time for such function that should be in java API ! )
*      http://www.javapractices.com/topic/TopicAction.do?Id=96
*      An alternative is probably org.apache.commons.lang.StringEscapeUtils  but doesn't seem to be included in eclipse by default :-(
*/

package fr.irisa.triskell.string;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.regex.Matcher;


/**
* Convenience methods for escaping special characters related to HTML, XML, 
* and regular expressions.
* 
*/
public class EscapeChars {
	/**
	   * Escape characters for text appearing in HTML markup.
	   * 	
	   * <P>The following characters are replaced with corresponding HTML 
	   * character entities : 
	   * <table border='1' cellpadding='3' cellspacing='0'>
	   * <tr><th> Character </th><th> Encoding </th></tr>
	   * <tr><td> < </td><td> &lt; </td></tr>
	   * <tr><td> > </td><td> &gt; </td></tr>
	   * <tr><td> & </td><td> &amp; </td></tr>
	   * <tr><td> " </td><td> &quot;</td></tr>
	   * <tr><td> ' </td><td> &#039;</td></tr>
	   * <tr><td> ( </td><td> &#040;</td></tr> 
	   * <tr><td> ) </td><td> &#041;</td></tr>
	   * <tr><td> # </td><td> &#035;</td></tr>
	   * <tr><td> % </td><td> &#037;</td></tr>
	   * <tr><td> ; </td><td> &#059;</td></tr>
	   * <tr><td> + </td><td> &#043; </td></tr>
	   * <tr><td> - </td><td> &#045; </td></tr>
	   * </table>
	   * 
	   * <P>Note that JSTL's {@code <c:out>} escapes <em>only the first 
	   * five</em> of the above characters.
	   */
	   public static String forHTML(String aText){
	     final StringBuilder result = new StringBuilder();
	     final StringCharacterIterator iterator = new StringCharacterIterator(aText);
	     char character =  iterator.current();
	     while (character != CharacterIterator.DONE ){
	       if (character == '<') {
	         result.append("&lt;");
	       }
	       else if (character == '>') {
	         result.append("&gt;");
	       }
	       else if (character == '&') {
	         result.append("&amp;");
	      }
	       else if (character == '\"') {
	         result.append("&quot;");
	       }
	       else if (character == '\'') {
	         result.append("&#039;");
	       }
	       else if (character == '(') {
	         result.append("&#040;");
	       }
	       else if (character == ')') {
	         result.append("&#041;");
	       }
	       else if (character == '#') {
	         result.append("&#035;");
	       }
	       else if (character == '%') {
	         result.append("&#037;");
	       }
	       else if (character == ';') {
	         result.append("&#059;");
	       }
	       else if (character == '+') {
	         result.append("&#043;");
	       }
	       else if (character == '-') {
	         result.append("&#045;");
	       }
	       else {
	         //the char is not a special one
	         //add it to the result as is
	         result.append(character);
	       }
	       character = iterator.next();
	     }
	     return result.toString();
	  }
	  
	  
	  /**
	   * Synonym for <tt>URLEncoder.encode(String, "UTF-8")</tt>.
	   *
	   * <P>Used to ensure that HTTP query strings are in proper form, by escaping
	   * special characters such as spaces.
	   *
	   * <P>It is important to note that if a query string appears in an <tt>HREF</tt>
	   * attribute, then there are two issues - ensuring the query string is valid HTTP
	   * (it is URL-encoded), and ensuring it is valid HTML (ensuring the 
	   * ampersand is escaped).
	   */
	   public static String forURL(String aURLFragment){
	     String result = null;
	     try {
	       result = URLEncoder.encode(aURLFragment, "UTF-8");
	     }
	     catch (UnsupportedEncodingException ex){
	       throw new RuntimeException("UTF-8 not supported", ex);
	     }
	     return result;
	   }

	  /**
	  * Escape characters for text appearing as XML data, between tags.
	  * 
	  * <P>The following characters are replaced with corresponding character entities : 
	  * <table border='1' cellpadding='3' cellspacing='0'>
	  * <tr><th> Character </th><th> Encoding </th></tr>
	  * <tr><td> < </td><td> &lt; </td></tr>
	  * <tr><td> > </td><td> &gt; </td></tr>
	  * <tr><td> & </td><td> &amp; </td></tr>
	  * <tr><td> " </td><td> &quot;</td></tr>
	  * <tr><td> ' </td><td> &#039;</td></tr>
	  * </table>
	  * 
	  * <P>Note that JSTL's {@code <c:out>} escapes the exact same set of 
	  * characters as this method. <span class='highlight'>That is, {@code <c:out>}
	  *  is good for escaping to produce valid XML, but not for producing safe HTML.</span>
	  */
	  public static String forXML(String aText){
	    final StringBuilder result = new StringBuilder();
	    final StringCharacterIterator iterator = new StringCharacterIterator(aText);
	    char character =  iterator.current();
	    while (character != CharacterIterator.DONE ){
	      if (character == '<') {
	        result.append("&lt;");
	      }
	      else if (character == '>') {
	        result.append("&gt;");
	      }
	      else if (character == '\"') {
	        result.append("&quot;");
	      }
	      else if (character == '\'') {
	        result.append("&#039;");
	      }
	      else if (character == '&') {
	         result.append("&amp;");
	      }
	      else {
	        //the char is not a special one
	        //add it to the result as is
	        result.append(character);
	      }
	      character = iterator.next();
	    }
	    return result.toString();
	  }

	  /**
	   * Replace characters having special meaning in regular expressions
	   * with their escaped equivalents, preceded by a '\' character.
	   *
	   * <P>The escaped characters include :
	   *<ul>
	   *<li>.
	   *<li>\
	   *<li>?, * , and +
	   *<li>&
	   *<li>:
	   *<li>{ and }
	   *<li>[ and ]
	   *<li>( and )
	   *<li>^ and $
	   *</ul>
	   *
	   */
	   public static String forRegex(String aRegexFragment){
	     final StringBuilder result = new StringBuilder();

	     final StringCharacterIterator iterator = new StringCharacterIterator(aRegexFragment);
	     char character =  iterator.current();
	     while (character != CharacterIterator.DONE ){
	       /*
	       * All literals need to have backslashes doubled.
	       */
	       if (character == '.') {
	         result.append("\\.");
	       }
	       else if (character == '\\') {
	         result.append("\\\\");
	       }
	       else if (character == '?') {
	         result.append("\\?");
	       }
	       else if (character == '*') {
	         result.append("\\*");
	       }
	       else if (character == '+') {
	         result.append("\\+");
	       }
	       else if (character == '&') {
	         result.append("\\&");
	       }
	       else if (character == ':') {
	         result.append("\\:");
	       }
	       else if (character == '{') {
	         result.append("\\{");
	       }
	       else if (character == '}') {
	         result.append("\\}");
	       }
	       else if (character == '[') {
	         result.append("\\[");
	       }
	       else if (character == ']') {
	         result.append("\\]");
	       }
	       else if (character == '(') {
	         result.append("\\(");
	       }
	       else if (character == ')') {
	         result.append("\\)");
	       }
	       else if (character == '^') {
	         result.append("\\^");
	       }
	       else if (character == '$') {
	         result.append("\\$");
	       }
	       else {
	         //the char is not a special one
	         //add it to the result as is
	         result.append(character);
	       }
	       character = iterator.next();
	     }
	     return result.toString();
	   }
	   
	   /**
	    * Escape <tt>'$'</tt> and <tt>'\'</tt> characters in replacement strings. 
	    * 
	    * <P>Synonym for <tt>Matcher.quoteReplacement(String)</tt>.
	    * 
	    * <P>The following methods use replacement strings which treat 
	    * <tt>'$'</tt> and <tt>'\'</tt> as special characters:
	    * <ul>
	    * <li><tt>String.replaceAll(String, String)</tt>
	    * <li><tt>String.replaceFirst(String, String)</tt>
	    * <li><tt>Matcher.appendReplacement(StringBuffer, String)</tt>
	    * </ul>
	    * 
	    * <P>If replacement text can contain arbitrary characters, then you will usually need 
	    * to escape that text, to ensure special characters are interpreted literally.
	    */
	    public static String forReplacementString(String aInput){
	      return Matcher.quoteReplacement(aInput);
	    }
	    
	    
	 // PRIVATE //
	    
	    private EscapeChars(){
	      //empty - prevent construction
	    }
}
