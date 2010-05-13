grammar Directives;

options {
  language = Java;
  k=4;
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

dirUnit returns [Composer c = factory.createComposer();]
  @after{
    c.setMetamodelName($ext.text.substring(1, $ext.text.length()-1));
    c.setAspectModelURI($am.text.substring(1, $am.text.length()-1));
    c.setPrimaryModelURI($pm.text.substring(1, $pm.text.length()-1));
    c.setComposedModelURI($cm.text.substring(1, $cm.text.length()-1));
    c.getPredirectivesPM().addAll(pmpre);
    c.getPredirectivesAM().addAll(ampre);
    c.getPostdirectives().addAll(post);
  }
  :
  'EXT' ext=STRING_LITERAL
  ('MODE' mode=(UNION {c.setMode(Modes.UNION);} | INTER {c.setMode(Modes.INTERSECTION);}))?
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

/*directive returns [ElementDirective c] :
  (changeD {$c=$changeD.d;} | concatD {$c=$concatD.d;} | createD{$c=$createD.d;})
;*/

directive returns [ElementDirective c] :
  (propertyD {$c=$propertyD.c;} | stringD {$c=$stringD.c;} | createD{$c=$createD.d;})
;

createD returns [Create d = factory.createCreate()]
  @after{
    d.setClassName($id.text);
    d.setIdentifier($var.text);
  }
  :
  CREATE id=ID AS DOLLAR var=ID
;

propertyD returns [ElementDirective c = null]:
  ref=refObj DOT prop=ID (changeD[$prop.text, ref]{$c=$changeD.d;} | concatD[$prop.text, ref]{$c=$concatD.d;})
;

stringD returns [ElementDirective c = null]:
  ref=stringL concatD[$ref.text,null]{$c=$concatD.d;}
;

changeD [String prop, ElementRef ref] returns [Change d = null]
  @after{
    d.setPropertyName($prop);
    d.setTarget($ref);
  }
  :
  (setD {$d=$setD.d;} | addD {$d=$addD.d;} | removeD {$d=$removeD.d;})
;

concatD [String prop, ElementRef ref] returns [Concat d = factory.createConcat()]
  @init{
    ArrayList<String> list = new ArrayList<String>();
    list.add($prop);
  }
  @after{
    d.setValue($target.ref);
    d.getPropertyNames().addAll(list);
    d.setTarget($ref);
  }
  :
  (COMMA property=concat_property {list.add($property.text);})* CONCAT target=concat_property
;

fragment concat_property returns [ElementRef ref = null]:
  (nameRef DOT prop=ID) {$ref=$nameRef.ref;} | stringL {$ref=$stringL.ref;}
;

setD returns [Set d = factory.createSet()]:
  EQUALS ref=refObj {d.setValue(ref);}
;

addD returns [Add d = factory.createAdd()]:
  PLUS ref=refObj {d.setValue(ref);}
;

removeD returns [Remove d = factory.createRemove()]:
  MINUS ref=refObj {d.setValue(ref);}
;

refObj returns [ElementRef ref = null]:
  nameRef {$ref=$nameRef.ref;} | idRef {$ref=$idRef.ref;} |
  stringL {$ref=$stringL.ref;} | booleanL {$ref=$booleanL.ref;} | 
  integerL {$ref=$integerL.ref;}
;
  
nameRef returns [NameRef ref = factory.createNameRef()]
  @after{
    ref.setQname(qname);
  }
  :
	  qname=qualifiedID
;

idRef returns [IDRef ref = factory.createIDRef()]
  @after{
    ref.setIdentifier($id.text);
  }
  :
	  DOLLAR id=ID
;

stringL returns [StringLiteral ref = factory.createStringLiteral()]
  @after{
    $ref.setValue($v.text.substring(1, $v.text.length()-1));
  }
  :
    v=STRING_LITERAL
;

integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()]
  @after{
    ref.setValue(Integer.parseInt($str.text));
  }
  :
  str=integer
;

integer returns [Integer str = null]: 
  (MINUS)? INT_LITERAL
;

booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()]
  @init{
    boolean val = false;
  }
  @after{
    ref.setValue(val);
  }
  :
    (TRUE { val = true; }| FALSE)
;

qualifiedID returns [String val = ""]:
  str1=ID {val+=$str1.text;} (COL_COL strn=ID {val+="::"+$strn.text;} )*
;


PRE     : 'pre';
POST    : 'post';
DOT     : '.';
LCURLY  : '{';
RCURLY  : '}';
PLUS    : '+';
MINUS   : '-';
CONCAT  : '+=';
EQUALS  : '=';
DOLLAR  : '$';
COL_COL : '::';
AS      : 'as' ;
CREATE  : 'create';
TRUE    : 'true';
FALSE   : 'false';
COMMA   : ',';
UNION   : 'UNION';
INTER   : 'INTERSECTION';

STRING_LITERAL : '"' (ESC | ~('"'|'\\'))* '"' ;
INT_LITERAL: (DIGIT)*;
ID : ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;
protected ESC : '\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) );
fragment DIGIT : '0'..'9';




WS : (' ' | '\t' | '\f' | '\n')+ {$channel=HIDDEN;}; 
SingleLineComment : '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
MultiLineComment : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};