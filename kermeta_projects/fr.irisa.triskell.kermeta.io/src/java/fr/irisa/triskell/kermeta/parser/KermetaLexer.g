class KermetaLexer extends Lexer;

options
{
	testLiterals=false;
	k=3;
	// charVocabulary='\003'..'\377';
	charVocabulary='\u0000'..'\uFFFE';
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

DOT_DOT  : "..";
MINUS_GT : "->";
GT_LT    : "><";
LT_GT    : "<>";
COL_COL  : "::";
PIPE	 : "|";

EQEQ            : "==";
NEQ				: "!=" ;
LT         		: '<'  ;
LTE        		: "<=" ;
GT         		: '>'  ;
GTE        		: ">=" ;
DIV        		: '/'  ;  


STRING_LITERAL : '"' (ESC | ~'"')* '"' ;
CHAR_LITERAL   : '\'' (ESC | ~'\'') '\'';

// TODO: The (DIGIT DIGIT DIGIT) is cheesy it should be something like
//       ( options { warnWhenFollowAmbig = false; } : (DIGIT)+ )
//       but I don't want to deal with parsing that yet.
protected ESC :
'\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) )
;

ID options { testLiterals=true; }
: ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;

INT_LITERAL : (DIGIT)+ ;

protected DIGIT : '0'..'9';


WS : (' ' | '\t' | '\f' | '\r' | '\n')+ 
{ $setType(Token.SKIP); }
;

SINGLE_LINE_COMMENT : "//" (~('\n'|'\r'))* ('\n'|'\r')?
{ $setType(Token.SKIP); }
;

MULTI_LINE_COMMENT : "/*" ("*/" | (~'!' (~'*' | '*' ~'/')* "*/"))
{ $setType(Token.SKIP); }
;
//
//
//WS : (' ' | '\t' | '\f' | '\r' | '\n' )+ //{newline();}
//{ $setType(Token.SKIP); }
//;
//
//SINGLE_LINE_COMMENT : ("--" | "//" ) (~('\n'|'\r'))* ('\n'|'\r')? //{newline();}
//{ $setType(Token.SKIP); }
//;
//
//// multiple-line comments
//MULTI_LINE_COMMENT
//	:	"/*"
//		(	/*	'\r' '\n' can be matched in one alternative or by matching
//				'\r' in one iteration and '\n' in another.  I am trying to
//				handle any flavor of newline that comes in, but the language
//				that allows both "\r\n" and "\r" and "\n" to all be valid
//				newline is ambiguous.  Consequently, the resulting grammar
//				must be ambiguous.  I'm shutting this warning off.
//			 */
//			options {
//				generateAmbigWarnings=false;
//			}
//		:
//			{ LA(2)!='/' }? '*'
//		|	'\r' '\n'		//{newline();}
//		|	'\r'			//{newline();}
//		|	'\n'			//{newline();}
//		|	~('*'|'\n'|'\r')
//		)*
//		"*/"
//	{ $setType(Token.SKIP); }
//	;
//
