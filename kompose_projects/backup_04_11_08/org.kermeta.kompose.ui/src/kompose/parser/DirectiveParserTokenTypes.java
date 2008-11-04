// $ANTLR : "DirectiveParser.g" -> "DirectiveParser.java"$

package kompose.parser; 

import java.io.FileInputStream;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import antlr.*;
import antlr.collections.*;

import kompose.*;
import kompose.impl.KomposeFactoryImpl;
import kompose.impl.KomposePackageImpl;


public interface DirectiveParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LITERAL_PM = 4;
	int STRING_LITERAL = 5;
	int LITERAL_AM = 6;
	int LITERAL_CM = 7;
	int LITERAL_PMPre = 8;
	int LCURLY = 9;
	int RCURLY = 10;
	int LITERAL_AMPre = 11;
	int LITERAL_Post = 12;
	int CREATE = 13;
	int ID = 14;
	int AS = 15;
	int DOLLAR = 16;
	int DOT = 17;
	int EQUALS = 18;
	int PLUS = 19;
	int MINUS = 20;
	int INT_LITERAL = 21;
	int TRUE = 22;
	int FALSE = 23;
	int COL_COL = 24;
	int PRE = 25;
	int POST = 26;
	int CHAR_LITERAL = 27;
	int ESC = 28;
	int REAL_LITERAL = 29;
	int EXPONENT = 30;
	int DIGIT = 31;
	int WS = 32;
	int SINGLE_LINE_COMMENT = 33;
	int CONTEXT_MULTI_LINE_COMMENT = 34;
	int EMPTY_LINE_COMMENT = 35;
}
