// $ANTLR : "DirectiveParser.g" -> "DirectiveParser.java"$

package org.kermeta.kompose.core.parser; 

import java.io.FileInputStream;
import java.util.ArrayList;

import kompose.*;
import kompose.impl.KomposePackageImpl;


public interface DirectiveParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LITERAL_EXT = 4;
	int STRING_LITERAL = 5;
	int LITERAL_PM = 6;
	int LITERAL_AM = 7;
	int LITERAL_CM = 8;
	int LITERAL_PMPre = 9;
	int LCURLY = 10;
	int RCURLY = 11;
	int LITERAL_AMPre = 12;
	int LITERAL_Post = 13;
	int CREATE = 14;
	int ID = 15;
	int AS = 16;
	int DOLLAR = 17;
	int DOT = 18;
	int EQUALS = 19;
	int PLUS = 20;
	int MINUS = 21;
	int INT_LITERAL = 22;
	int TRUE = 23;
	int FALSE = 24;
	int COL_COL = 25;
	int PRE = 26;
	int POST = 27;
	int CHAR_LITERAL = 28;
	int ESC = 29;
	int REAL_LITERAL = 30;
	int EXPONENT = 31;
	int DIGIT = 32;
	int WS = 33;
	int SINGLE_LINE_COMMENT = 34;
	int CONTEXT_MULTI_LINE_COMMENT = 35;
	int EMPTY_LINE_COMMENT = 36;
}
