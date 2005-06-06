// $Id : $

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

STRING_LITERAL : '"' (ESC | ~('"'|'\\'))* '"' ;
CHAR_LITERAL   : '\'' (ESC | ~'\'') '\'';

// TODO: The (DIGIT DIGIT DIGIT) is cheesy it should be something like
//       ( options { warnWhenFollowAmbig = false; } : (DIGIT)+ )
//       but I don't want to deal with parsing that yet.
protected ESC :
'\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) )
;

ID options { testLiterals=true; }
: ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;

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


WS : (' ' | '\t' | '\f' | '\r' | '\n')+ 
{ $setType(Token.SKIP); }
;

SINGLE_LINE_COMMENT : "//" (~('\n'|'\r'))* ('\n'|'\r'('\n')?) 		{$setType(Token.SKIP); };

CONTEXT_MULTI_LINE_COMMENT : 
	"/**"
	(
		{ LA(2)!='/' }? '*'
		|	'\r' '\n'
		|	'\r'	
		|	'\n'	
		|	~('*'|'\n'|'\r')
		)*
		"*/"
;

MULTI_LINE_COMMENT : 
	"/*" 
	~('*')
	(
		{ LA(2)!='/' }? '*'
		|	'\r' '\n'  
		|	'\r'	   
		|	'\n'	  
		|	~('*'|'\n'|'\r')
		)*
		"*/"
	{$setType(Token.SKIP);}
;




//
//
//WS : (' ' | '\t' | '\f' | '\r' | '\n' )+ //{newline();}
//{ $setType(Token.SKIP); };