package org.kermeta.kompren.parser.sub


trait BlockParser extends KomprenAbstractParser {
	def parseBlock : Parser[String] = blockCode ^^ {
	  case code =>
	    code
	}
}
