grammar Directives;

options {
  language = Java;
  k=4;
}
@header {
package org.kermeta.kompose.core.parser;

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
  ('MODE' (UNION {c.setMode(Modes.UNION);} | INTER {c.setMode(Modes.INTERSECTION);}))?
  'PM' pm=STRING_LITERAL
  'AM' am=STRING_LITERAL
  'CM' cm=STRING_LITERAL
  
  'PMPre' LCURLY pmpre=directives RCURLY
  'AMPre' LCURLY ampre=directives RCURLY

  'Post' LCURLY post=directives RCURLY
;

directives returns [ArrayList<ElementDirective> lst = new ArrayList<ElementDirective>()]:
  (d=directive {lst.add(d);})*
;

directive returns [ElementDirective c] :
  (destroyD{$c=$destroyD.d;} | propertyD {$c=$propertyD.c;} | stringD {$c=$stringD.c;} | createD{$c=$createD.d;} | mergeD{$c=$mergeD.d;})
;

createD returns [Create d = factory.createCreate()]
  @init{
    System.out.println("CREATE "+$id.text+" AS $"+$var.text);
  } 
  @after{
    d.setClassName($id.text);
    d.setIdentifier($var.text);
  }
  :
  CREATE id=ID AS DOLLAR var=ID
;

mergeD returns [Merge d = factory.createMerge()]
  @init{
    System.out.println("MERGED ");
  }
  @after{
    System.out.println("MERGE ");
  }
  :
  MERGE LP refL=nameRef {d.setLeft(refL);} COMMA refR=nameRef {d.setRight(refR);} RP
;

destroyD returns [Destroy d = factory.createDestroy()]
	@init{
    System.out.println("DESTROYD ");
  }
  @after{
    System.out.println("DESTROY "+ref.getQname());
  }
  :
  DESTROY ref=nameRef {d.setValue(ref);}
;
propertyD returns [ElementDirective c = null]
  @init{
    System.out.println("PROPERTYD ");
  }
  @after{
    System.out.println(" PROP "+ref.toString());
  }
  :
  ref=refObj DOT prop=ID (changeD[$prop.text, ref]{$c=$changeD.d;} | concatD[$prop.text, ref]{$c=$concatD.d;})
;

stringD returns [ElementDirective c = null]
	@init{
	  System.out.println("STRINGD "+$ref.text);
	}
  :
  ref=stringL concatD[$ref.text,null]{$c=$concatD.d;}
;

changeD [String prop, ElementRef ref] returns [Change d = null]
	@init{
	  System.out.println("CHANGED "+$prop);
	}
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
    System.out.println("CONCAT "+$prop+" to "+$ref);
  }
  @after{
    d.setValue($target.ref);
    d.getPropertyNames().addAll(list);
    d.setTarget($ref);
  }
  :
  (COMMA property=concat_property {list.add($property.text);})* CONCAT target=concat_property
;

fragment concat_property returns [ElementRef ref = null]
  @init{
    System.out.println("FRAGMENT CONCAT");
  }
  :
  (nameRef DOT ID) {$ref=$nameRef.ref;} | stringL {$ref=$stringL.ref;}
;

setD returns [Set d = factory.createSet()]
  @init{
    System.out.println("SETD ");
  }
  @after{
    System.out.println("SET "+ref.toString());
  }
  :
  EQUALS ref=refObj {d.setValue(ref);}
;

addD returns [Add d = factory.createAdd()]
  @init{
    System.out.println("ADDD ");
  }
  @after{
    System.out.println("ADD "+ref.toString());
  }
  :
  PLUS ref=refObj {d.setValue(ref);}
;

removeD returns [Remove d = factory.createRemove()]
  @init{
    System.out.println("REMOVED ");
  }
  @after{
    System.out.println("REMOVE "+ref.toString());
  }
  :
  MINUS ref=refObj {d.setValue(ref);}
;

refObj returns [ElementRef ref = null]
  @init{
    System.out.println("REFOBJ ");
  }
  @after{
    System.out.println("REFOBJ "+$ref.toString());
  }
  :
  nameRef {$ref=$nameRef.ref;} | idRef {$ref=$idRef.ref;} |
  stringL {$ref=$stringL.ref;} | booleanL {$ref=$booleanL.ref;} | 
  integerL {$ref=$integerL.ref;}
;
  
nameRef returns [NameRef ref = factory.createNameRef()]
  @init{
    System.out.println("NAMEREF ");
  }
  @after{
    ref.setQname(qname);
    System.out.println("NAMEREF "+qname);
  }
  :
	  qname=qualifiedID
;

idRef returns [IDRef ref = factory.createIDRef()]
  @init{
    System.out.println("IDREF "+$id.text);
  }
  @after{
    ref.setIdentifier($id.text);
  }
  :
	  DOLLAR id=ID
;

stringL returns [StringLiteral ref = factory.createStringLiteral()]
  @init{
    System.out.println("STRINGL "+v);
  }
  @after{
    $ref.setValue($v.text.substring(1, $v.text.length()-1));
  }
  :
    v=STRING_LITERAL
;

integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()]
  @init{
    System.out.println("INTL "+str);
  }
  @after{
    ref.setValue(Integer.parseInt($str.text));
  }
  :
  str=integer
;

integer returns [Integer str = null]
  @init{
    System.out.println("INT ");
  }
  :
  (MINUS)? INT_LITERAL
;

booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()]
  @init{
    boolean val = false;
    System.out.println("BOOL "+val);
  }
  @after{
    ref.setValue(val);
  }
  :
    (TRUE { val = true; }| FALSE)
;

qualifiedID returns [String val = ""]
  @init{
    System.out.println("QID ");
  }
  @after{
    System.out.println("QUALID "+$str1.text);
  }
:
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
AS      : 'as';
CREATE  : 'create';
TRUE    : 'true';
FALSE   : 'false';
COMMA   : ',';
UNION   : 'UNION';
INTER   : 'INTERSECTION';
DESTROY : 'destroy'|'DESTROY';
MERGE   : 'merge'|'MERGE';
LP      : '(';
RP      : ')';

STRING_LITERAL : '"' (ESC | ~('"'|'\\'))* '"' ;
INT_LITERAL: (DIGIT)*;
ID : ('~')? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | DIGIT)* ;
protected ESC : '\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) );
fragment DIGIT : '0'..'9';




WS : (' ' | '\t' | '\f' | '\n')+ {$channel=HIDDEN;}; 
SingleLineComment : '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
MultiLineComment : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};