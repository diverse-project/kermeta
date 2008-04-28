// $Id : $

class KermetaLexer extends Lexer;

options
{
	testLiterals=false;
	k=3;
	defaultErrorHandler=false;
	// charVocabulary='\003'..'\377';
	charVocabulary='\u0000'..'\uFFFE';
}

{
	public int column = 1;
	
	public int line = 1;
	
	public int offset = 0;
	
	public void newline2() {
		// Reseting the column number
 		column = 1;
		// Incrementing the line number
		line++;
		//TokenWithIndex ti = (TokenWithIndex) _returnToken;
		if ( _returnToken != null ) {
			offset++; // For the new line
			setColumn(offset);
		} else { 
			// Special case when there is comments at the top of the file...
			if ( offset == 0 )
				offset += getColumn() -1 - offset;
			else {
				// Maybe we should backtrack...
				// Because of the rule WS, if the input looks like ' \t  \t\r', we performed a offsetPlusPlus for each non line terminal.
				// So, the only character to add is the line terminal. 
				boolean backtrack = true;
				int index = 0;
				while ( backtrack && index < text.length() ) {
					char current = text.getBuffer()[index++];
					if ( ! Character.isWhitespace(current) )
						backtrack = false;
				}
				if ( backtrack )
					offset += 1;
				else
					offset += text.length();
			}
			setColumn(offset);
			text.setLength(0);
		}
	}
	
	public void offsetPlusPlus() {
		offset++;
		setColumn( offset );
	}
	
	/**
	 * Overriding this method to add the offset.
	 */
	protected Token makeToken(int t) {
		Token token = super.makeToken(t);
		if ( token instanceof TokenWithIndex ) {
				((TokenWithIndex) token).setIndex( offset );
				token.setLine(line);
				token.setColumn(column);
				offset += text.length();
				column += text.length();
				setColumn(offset);
				int cpt = 0;
				for (int i=0; i<text.length(); i++)
					if ( text.charAt(i) == '\n' )
						cpt++;
				line += cpt;
		}
		return token;
	}

}

LCURLY  : '{';
RCURLY  : '}';
LSQUARE : '[';
RSQUARE : ']';
LPAREN  : '(';
RPAREN  : ')';

DOT     : '.';
COMMA   : ',';
COLON   : ':';
SEMI    : ';';

STAR    : '*';
PLUS    : '+';
MINUS   : '-';
EQUALS  : '=';

QMARK   : '?';
BANG    : '!';
DOLLAR  : '$';
HASH    : '#';
AT      : '@';
ATPRE	: "@pre";

DOT_DOT  : "..";
MINUS_GT : "->";
GT_LT    : "><";
LT_GT    : "<>";
COL_COL  : "::";
PIPE	 : "|";


/*CASTEQ : "?=";
ASSIGNEQ : ":=";
*/
EQEQ            : "==";
NEQ				: "!=" ;
LT         		: '<'  ;
LTE        		: "<=" ;
GT         		: '>'  ;
GTE        		: ">=" ;
DIV        		: '/'  ;  

STRING_LITERAL : '"' (ESC | ~('"'|'\\'))* '"' ;
CHAR_LITERAL   : '\'' (ESC | ~'\'') '\'';

END_COMMENT : "*/";

// TODO: The (DIGIT DIGIT DIGIT) is cheesy it should be something like
//       ( options { warnWhenFollowAmbig = false; } : (DIGIT)+ )
//       but I don't want to deal with parsing that yet.
protected ESC :
'\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) )
;

ID options { testLiterals=true; }
: ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;

// same as ID but doesn't check for literals=true 
//UNPROTECTEDID : ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;

// INT_LITERAL completed on 08/04/2005
// INT_LITERAL : (DIGIT)+ ;
INT_LITERAL	:	('-')?(DIGIT)+	;

protected
REAL_LITERAL  : INT_LITERAL '.' INT_LITERAL (EXPONENT)? ;



// need to add floating point
// a couple protected methods to assist in matching floating point numbers
protected
EXPONENT
 : ('e') ('+'|'-')? (DIGIT)+
 ;

protected DIGIT : '0'..'9';


WS		: 
			(
				' ' 	{ offsetPlusPlus(); }
			|	'\t' 	{ offsetPlusPlus(); }
			|	'\f' 	
			|	'\r' '\n'	{ offsetPlusPlus(); newline2(); } 
			|	'\r'	{ newline2(); } 	
			| 	'\n'	{ newline2(); }
			)+
			{ $setType(Token.SKIP); };


SINGLE_LINE_COMMENT : "//" (~('\n'|'\r'))* ('\n'|'\r'('\n')?) 		{$setType(Token.SKIP); newline2(); };

CONTEXT_MULTI_LINE_COMMENT : 
	"/**"
	(
		{ LA(2)!='/' }? '*'
		|	'\r' '\n'	//{ newline2(); }
		|	'\r'		//{ newline2(); }
		|	'\n'		//{ newline2(); }
		|	~('*'|'\n'|'\r')
		)*
		END_COMMENT
;

EMPTY_LINE_COMMENT : "/*" END_COMMENT;

MULTI_LINE_COMMENT : 
		
		EMPTY_LINE_COMMENT 
			{
				$setType(Token.SKIP);
			}
	|

	(
		"/*" { offsetPlusPlus(); offsetPlusPlus(); }
		(
			'\n'	  			{ offsetPlusPlus(); line++; column=0; }
			| '\r'	  			{ offsetPlusPlus(); line++; column=0; }
			| '\r' '\n'			{ offsetPlusPlus(); offsetPlusPlus(); line++; column=0; }
			| ~('*') { offsetPlusPlus(); }
		)
		(
			{ LA(2)!='/' }? '*' 	{ offsetPlusPlus(); }
			|	'\r' '\n'  			{ offsetPlusPlus(); offsetPlusPlus(); line++; column=0; }//{ newline2(); }
			|	'\r'	   			{ offsetPlusPlus(); line++; column=0; }//{ newline2(); }
			|	'\n'	  			{ offsetPlusPlus(); line++; column=0; }//{ newline2(); }
			|	~('*'|'\n'|'\r') 	{ offsetPlusPlus(); }
			)*
			END_COMMENT { offsetPlusPlus(); offsetPlusPlus(); }
		{
			$setType(Token.SKIP);
		}
	)
;




/*	PACKAGE_KW			:	"package";

	REQUIRE_KW 			: 	"require";

	EXCLUDE_FILTER_KW	:	"excludeFilter";

	INCLUDE_FILTER_KW	:	"includeFilter";
	
	USING_KW			:	"using";

	MODEL_TYPE_KW		:	"modeltype";

	INHERITS_KW			:	"inherits";

	CLASS_KW			:	"class";

	ABSTRACT_KW			:	"abstract";

	ASPECT_KW			:	"aspect";

	VOID_TYPE_KW		:	"Void";
	
	INV_KW				:	"inv";
	
	IS_KW				:	"is";
	
	ATTRIBUTE_KW		:	"attribute";
	
	REFERENCE_KW		:	"reference";
	
	PROPERTY_KW			:	"property";
	
	READ_ONLY_KW		:	"readonly";
	
	GETTER_KW			:	"getter";
	
	SETTER_KW			:	"setter";
	
	OPERATION_KW		:	"operation";
	
	METHOD_KW			:	"method";
	
	FROM_KW				:	"from";
	
	RAISES_KW			:	"raises";
	
	PRE_KW				:	"pre";
	
	POST_KW				:	"post";
	
	BAG_KW				:	"bag";
	
	SET_KW				:	"set";
	
	SEQ_KW				:	"seq";
	
	OSET_KW				:	"oset";
	
	ALIAS_KW			:	"alias";
	
	ENUMERATION_KW		:	"enumeration";
	
	AND_KW				:	"and";
	
	OR_KW				:	"or";
	
	NOT_KW				:	"not";
	
	SELF_KW				:	"self";
	
	SUPER_KW			:	"super";
	
	RESULT_KW			:	"result";
	
	VALUE_KW			:	"value";
	
	DO_KW				:	"do";
	
	END_KW				:	"end";
	
	FUNCTION_KW			:	"function";
	
	RESCUE_KW			:	"rescue";
	
	UNTIL_KW			:	"until";
	
	LOOP_KW				:	"loop";
	
	IF_KW				:	"if";
	
	THEN_KW				:	"then";
	
	ELSE_KW				:	"else";
	
	RAISE_KW			:	"raise";
	
	VAR_KW				:	"var";
	
	INIT_KW				:	"init";
	
	EXTERN_KW			:	"extern";
	
	TRUE_KW				:	"true";
	
	FALSE_KW			:	"false";
	
	VOID_KW				:	"void";*/
	
