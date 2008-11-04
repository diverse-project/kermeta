header {
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

}

class DirectiveParser extends Parser;

{
	
	private static KomposeFactory factory = KomposePackageImpl.init().getKomposeFactory();
	
	public static void main(String[] args) throws Exception {
		 DirectiveLexer lexer = new DirectiveLexer(new FileInputStream("src/directives/parser/dir1.cd"));
	     DirectiveParser parser = new DirectiveParser(lexer);
	     try {
			parser.dirUnit();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TokenStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //AST t = parser.getAST();
	     //System.out.println(t.toStringTree());
	    
	     
	}
	public ArrayList<String> errors = new ArrayList<String>();
	public ArrayList<String> warnings = new ArrayList<String>();
	
	public boolean hasErrors() {
		return !errors.isEmpty();	
	}
	
	public void reportError(RecognitionException ex) {
		super.reportError(ex);
		errors.add(ex.toString());
	}
}

dirUnit returns [Composer c = factory.createComposer()] :
{
	ArrayList pmpre, ampre, post;	
}
	"PM" pm:STRING_LITERAL
	"AM" am:STRING_LITERAL
	"CM" cm:STRING_LITERAL
	
	"PMPre" LCURLY pmpre=directives RCURLY
	"AMPre" LCURLY ampre=directives RCURLY
	"Post" LCURLY post=directives RCURLY
{
	c.getPredirectivesPM().addAll(pmpre);
	c.getPredirectivesAM().addAll(ampre);
	c.getPostdirectives().addAll(post);
	c.setAspectModelURI(am.getText().substring(1, am.getText().length()-1));
	c.setPrimaryModelURI(pm.getText().substring(1, pm.getText().length()-1));
	c.setComposedModelURI(cm.getText().substring(1, cm.getText().length()-1));
}
	;

directives returns [ArrayList lst = new ArrayList()] :
{
	ElementDirective d = null;
}
	( d=directive {lst.add(d);} )*
	;

directive returns [ElementDirective c = null] :
	c=createD | c=changeD
	;

createD returns [Create d = factory.createCreate()]:
	CREATE id:ID AS DOLLAR var:ID
{
	d.setClassName(id.getText());
	d.setIdentifier(var.getText());	
}
	;

changeD returns [Change d = null]:
{
	ElementRef ref;
}
	ref=refObj DOT prop:ID ( d=setD | d=addD | d=removeD )
{
	d.setPropertyName(prop.getText());
	d.setTarget(ref);	
}
	;
	
setD returns [Set d = factory.createSet()]:
{
	ElementRef ref;	
}
	EQUALS ref=refObj
{
	d.setValue(ref);	
}
	;
	
addD returns [Add d = factory.createAdd()]:
{
	ElementRef ref;	
}
	PLUS ref=refObj
{
	d.setValue(ref);	
}
	;

removeD returns [Remove d = factory.createRemove()]:
{
	ElementRef ref;	
}
	MINUS ref=refObj
{
	d.setValue(ref);	
}
	;
	
refObj returns [ElementRef ref = null]:
	ref=nameRef | ref=idRef | ref=stringL | ref=booleanL | ref=integerL
	;

nameRef returns [NameRef ref = factory.createNameRef()]:
{
	String qname;	
}	
	qname=qualifiedID
{
	ref.setQname(qname);
}
	;

idRef returns [IDRef ref = factory.createIDRef()]:	
	DOLLAR id:ID
{
	ref.setIdentifier(id.getText());
}
	;
	
stringL returns [StringLiteral ref = factory.createStringLiteral()]: 
	v:STRING_LITERAL
{
	ref.setValue(v.getText().substring(1, v.getText().length()-1));	
}
	;

integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()]: 
	str:INT_LITERAL
{
	ref.setValue(Integer.parseInt(str.getText()));
}
	;

booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()]: 
{
	boolean val = false;	
}
	(TRUE { val = true; }| FALSE)
{
	ref.setValue(val);	
}
	;
	
qualifiedID returns [String val = ""]:
	str1:ID {val+=str1.getText();} (COL_COL strn:ID {val+="::"+strn.getText();} )*
	;

	
class DirectiveLexer extends Lexer;

options
{
	testLiterals=true;
	k=4;
	// charVocabulary='\003'..'\377';
	//charVocabulary='\u0000'..'\uFFFE';
}

PRE		: "pre";
POST	: "post";
DOT  : '.';
LCURLY  : '{';
RCURLY  : '}';
PLUS    : '+';
MINUS   : '-';
EQUALS  : '=';
DOLLAR  : '$';
COL_COL  : "::";
AS		: "as" ;
CREATE	: "create";
TRUE	: "true";
FALSE	: "false";

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

EMPTY_LINE_COMMENT : "/**/"
MULTI_LINE_COMMENT : 
	EMPTY_LINE_COMMENT 
	|
	(
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
	)
;




	