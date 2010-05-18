/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language

class LexicalWords {
	
	  def keywords = List("package","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var","from","until","loop","if","then","else","init")
  	  def delimiters = List("=",";","::","@","{","}","(",")",":",":=",".",",")

}

object Lexical extends LexicalWords


