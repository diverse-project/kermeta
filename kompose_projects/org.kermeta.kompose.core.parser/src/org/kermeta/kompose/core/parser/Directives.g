grammar Directives;

options {
  language = Java;
}
@header {
package org.kermeta.kompose.core.parser;

import java.util.ArrayList;

import kompose.*;
import kompose.impl.KomposePackageImpl;
}
@members {
  private static KomposeFactory factory = KomposePackageImpl.init().getKomposeFactory();
  
  public static void main(String[] args) throws Exception {
    DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream("/home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/kompose.kompt"));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    DirectivesParser parser = new DirectivesParser(tokens);
    try {
      parser.dirUnit();
    } catch (RecognitionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
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
@lexer::header {
package org.kermeta.kompose.core.parser;
}

/*
emptyRule: int_rule  
;

MINUS : '-' {System.out.println("found MINUS -");};
*/

dirUnit returns [Composer c = factory.createComposer()]:
  'EXT' ext=STRING_LITERAL
  'PM' pm=STRING_LITERAL
  'AM' am=STRING_LITERAL
  'CM' cm=STRING_LITERAL
  
  'PMPre' LCURLY pmpre=directives RCURLY
  'AMPre' LCURLY ampre=directives RCURLY
  'Post' LCURLY post=directives RCURLY
;

directives returns [ArrayList lst = new ArrayList()]:
  (d=directive {lst.add(d);})*
;

directive returns [ElementDirective c] :
  (changeD {$c=$changeD.d;}| createD{$c=$createD.d;})
;

createD returns [Create d = factory.createCreate()]:
  CREATE id=ID AS DOLLAR var=ID
{
  d.setClassName(id.getText());
  d.setIdentifier(var.getText()); 
}
;

changeD returns [Change d = null] :
  ref=setD
;

setD returns [Set d = factory.createSet()]:
  EQUALS ref=integerL {d.setValue(ref);}
;
/*returns [Set d = factory.createSet()]:
	{
	  ElementRef ref; 
	}
	  EQUALS ref=stringL
	{
	  d.setValue(ref);  
	}
;*/

integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()]:
  //v=STRING_LITERAL
  str=integer
	{
	  ref.setValue(Integer.parseInt($str.text));
	  System.out.println(ref.getValue());
	}
;

integer returns [Integer str = null]: 
  (MINUS)? INT_LITERAL
;

/*stringL returns [StringLiteral ref = factory.createStringLiteral()]: 
  v=STRING_LITERAL
	{
	  ref.setValue(v.getText().substring(1, v.getText().length()-1)); 
	}
;*/
 

PRE     : 'pre';
POST    : 'post';
DOT     : '.';
LCURLY  : '{';
RCURLY  : '}';
PLUS    : '+';
MINUS   : '-';
EQUALS  : '=';
DOLLAR  : '$';
COL_COL : '::';
AS      : 'as' ;
CREATE  : 'create';
TRUE    : 'true';
FALSE   : 'false';

STRING_LITERAL : '"' (ESC | ~('"'|'\\'))* '"' ;
INT_LITERAL: (DIGIT)*;
ID : ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;
protected ESC : '\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) );
fragment DIGIT : '0'..'9';




WS : (' ' | '\t' | '\f' | '\n')+ {$channel=HIDDEN;}; 
SingleLineComment : '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
MultiLineComment : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};