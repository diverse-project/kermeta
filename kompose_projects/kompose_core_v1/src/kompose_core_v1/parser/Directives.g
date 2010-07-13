grammar Directives;

options {
  language = Java;
  k=1;
}
@header {
package kompose_core_v1.parser;

import directives.*;
import directives.impl.DirectivesPackageImpl;

import kompose.*;
import kompose.impl.KomposePackageImpl;
}
@members {
  private static DirectivesFactory directives_factory = DirectivesPackageImpl.init().getDirectivesFactory();
  private static KomposeFactory kompose_factory = KomposePackageImpl.init().getKomposeFactory();
  
  public static void main(String[] args) throws Exception {
    DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream("/home/mclavreu/main_workspace/kompose_directives/tests/kompose.kompt"));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    DirectivesParser parser = new DirectivesParser(tokens);
    try {
      parser.start();
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
  
  public String getString(ElementRef r) {
    if (r instanceof Literal){
      return ("\""+((Literal)r).toString()+"\"");
    }
    else {
      if (r instanceof PropRef){
        String s = getString(((PropRef)r).getObject());
        s += "::"+((PropRef)r).getProperty();
        return s;
      }
      else {
        if (r instanceof NameRef)
          return ((NameRef)r).getQname();
        else
          return "$"+((IDRef)r).getIdentifier();
      }
    }
  }
}
@lexer::header {
package kompose_core_v1.parser;
}

start returns [Context ctx = kompose_factory.createContext();]
  @init{
    System.out.println("Starting parser...");
  }
  @after{
    ctx.setMetamodelName($ext.text.substring(1, $ext.text.length()-1));
    ctx.setAspectModelURI($am.text.substring(1, $am.text.length()-1));
    ctx.setPrimaryModelURI($pm.text.substring(1, $pm.text.length()-1));
    ctx.setComposedModelURI($cm.text.substring(1, $cm.text.length()-1));
    ctx.getPredirectivesPM().addAll(pmpre);
    ctx.getPredirectivesAM().addAll(ampre);
    ctx.getPostdirectives().addAll(post);
  }
  :
  'EXT' ext=STRING_LITERAL
  ('MODE' (UNION {ctx.setMode(Modes.UNION);} | INTER {ctx.setMode(Modes.INTERSECTION);}))?
  'PM' pm=STRING_LITERAL
  'AM' am=STRING_LITERAL
  'CM' cm=STRING_LITERAL
  
  'PMPre' LCURLY pmpre=directives RCURLY
  'AMPre' LCURLY ampre=directives RCURLY

  'Post' LCURLY post=directives RCURLY
;

directives returns [ArrayList<ElementDirective> lst = new ArrayList<ElementDirective>()]
  @init{
    System.out.println("Directives");
  }
  @after{
    System.out.println("End Directives");
  }
  :
  (d=directive {lst.add(d);})*
;

directive returns [ElementDirective d]
  @init{
    System.out.println("Directive");
  }
  @after{
    System.out.println("End Directive");
  }
  :
  unaryDirective {$d=$unaryDirective.d;} | binaryDirective {$d=$binaryDirective.d;}
;

unaryDirective returns [UnaryDirective d]
  @init{
    System.out.println("UnaryDirective");
  }
  @after{
    System.out.println("End UnaryDirective");
  }
  :
  createD {$d=$createD.d;}  | destroyD {$d=$destroyD.d;} 
;

binaryDirective returns [BinaryDirective d]
  @init{
    System.out.println("BinaryDirective");
  }
  @after{
    System.out.println("End BinaryDirective");
  }
  :
  targetD {$d=$targetD.d;}  | mergeD {$d=$mergeD.d;}
;

//unaryDirectives
createD returns [Create d = directives_factory.createCreate()]
  @init{
    System.out.println("Create");
  }
  @after{
    d.setClassName(meta.getName());
    System.out.println("End Create");
  }
  :
  CREATE meta=metaRefD {d.setType(meta);} AS target=idRefD {d.setTarget(target);}
;

destroyD returns [Destroy d = directives_factory.createDestroy()]
  @init{
    System.out.println("Destroy");
  }
  @after{
    System.out.println("End Destroy");
  }
  :
  DESTROY target=nameRefD {d.setTarget(target);}
;

//binaryDirectives
mergeD returns [Merge d = directives_factory.createMerge()]
  @init{
    System.out.println("Merge");
  }
  @after{
    System.out.println("End Merge");
  }
  :
  MERGE LP target=nameRefD {d.setTarget(target);} COMMA value=nameRefD {d.getValue().add(value);} RP 
;

targetD returns [BinaryDirective d]
  @init{
    System.out.println("TargetD");
  }
  @after{
    System.out.println("End TargetD");
    d.setTarget(target);
  }
  :
  target=targetRefD (concatD {d=$concatD.d;} | changeD {d=$changeD.d; ((Change)d).setPropertyName(getString(target));})
;

concatD returns [Concat d = directives_factory.createConcat()]
  @init{
    ArrayList<ElementRef> list = new ArrayList<ElementRef>();
    System.out.println("Concat");
  }
  @after{
    for (ElementRef r: list) {
      d.getPropertyNames().add(getString(r));
      d.getValue().add(r);
    }
    //d.getPropertyNames().addAll(ElementRef);
    System.out.println("End Concat");
  }
  :
  CONCAT r1=eltRefD_valueRefD_mandatory
  { list.add($r1.ref); }
  (COMMA (rn=eltRefD_valueRefD_mandatory { list.add($rn.ref); } ))*
  
  
  /*CONCAT (str1=stringD {list.add("\""+$str1.l.getValue()+"\"");} | 
  name1=nameRefD (prop=propRefD)? {
    String s = $name1.ref.getQname();
    if ($prop.ref != null){
      s+= '.'+((PropRef)$prop.ref).getProperty();
    }
    list.add(s);
  }) 
  (COMMA (strn=stringD {list.add("\""+$strn.l.getValue()+"\"");} | 
  namen=nameRefD (prop=propRefD)? {
    String s = $namen.ref.getQname();
    if ($prop.ref != null){
      s+= '.'+((PropRef)$prop.ref).getProperty();
    }
    list.add(s);
  }))*
  */
;

changeD returns [Change d]
  @init{
    System.out.println("Change");
  }
  @after{
    System.out.println("End Change");
  }
  :
  setD {$d=$setD.d;} | addD {$d=$addD.d;} | removeD {$d=$removeD.d;}
;

setD returns [Set d = directives_factory.createSet()]
  @init{
    System.out.println("Set");
  }
  @after{
    System.out.println("End Set");
  }
  :
  EQUALS valueO=eltRefD {d.getValue().add(valueO);}
;

addD returns [Add d = directives_factory.createAdd()]
  @init{
    System.out.println("Add");
  }
  @after{
    System.out.println("End Add");
  }
  :
  PLUS value=eltRefD {d.getValue().add(value);}
;

removeD returns [Remove d = directives_factory.createRemove()]
  @init{
    System.out.println("Remove");
  }
  @after{
    System.out.println("End Remove");
  }
  :
  MINUS value=eltRefD {d.getValue().add(value);}
;

//Refs
targetRefD returns [ElementRef ref]
  @init{
    System.out.println("TargetRef");
  }
  @after{
    System.out.println("End TargetRef");
  }
  :
  valueRefD {$ref=$valueRefD.ref;}
;

eltRefD returns [ElementRef ref]
  @init{
    System.out.println("ElementRef");
  }
  @after{
    System.out.println("End ElementRef");
    
  }
  :
  valueRefD {$ref=$valueRefD.ref;} | literalD {$ref=$literalD.l;}
;

eltRefD_valueRefD_mandatory returns [ElementRef ref]
  @init{
    System.out.println("eltRefD_valueRefD_mandatory");
  }
  @after{
    System.out.println("End eltRefD_valueRefD_mandatory");
    
  }
  :
  valueRefD_prop_mandatory {$ref=$valueRefD_prop_mandatory.ref;} | literalD {$ref=$literalD.l;}
;

valueRefD returns [ElementRef ref]
  @init{
    System.out.println("valueRefD");
  }
  @after{
    System.out.println("End valueRefD");
    if (refP != null){
      System.out.println("propRef");
      ref = $refP.ref;
      ((PropRef)ref).setObject($refO.ref);
    }
    else {
      System.out.println("objRef only");
      ref = $refO.ref;
     }
  }
  :
  refO=objectRefD (refP=propRefD)?
;

valueRefD_prop_mandatory returns [ElementRef ref]
  @init{
    System.out.println("valueRefD_prop_mandatory");
  }
  @after{
    System.out.println("End valueRefD_prop_mandatory");
    ref = $refP.ref;
    ((PropRef)ref).setObject($refO.ref);
  }
  :
  refO=objectRefD refP=propRefD
;


objectRefD returns [ObjectRef ref]
  @init{
    System.out.println("ObjectRef");
  }
  @after{
    System.out.println("End ObjectRef");
  }
  :
  (nameRefD {$ref=$nameRefD.ref;} | idRefD {$ref=$idRefD.ref;})
;

metaRefD returns [MetaRef ref = directives_factory.createMetaRef()]
  @init{
    System.out.println("MetaRef");
  }
  @after{
    System.out.println("End MetaRef");
  }
  :
  name=META_ID {ref.setName($name.text.substring(1, $name.text.length()-1));}
;

idRefD returns [IDRef ref = directives_factory.createIDRef()]
  @init{
    System.out.println("IDRef");
  }
  @after{
    System.out.println("End IDRef");
  }
  :
  DOLLAR id=ID {ref.setIdentifier($id.text);}
;

nameRefD returns [NameRef ref = directives_factory.createNameRef()]
  @init{
    System.out.println("NameRef");
  }
  @after{
    System.out.println("End NameRef "+$qname.text);
  }
  :
  qname=qualifiedID {ref.setQname($qname.text);}
;

qualifiedID returns [String v = ""]
  @init{
    System.out.println("QualifiedID");
  }
  @after{
    System.out.println("End QualifiedID ");
  }
  :
  qid=ID {$v=$qid.text;} (COL_COL strn=ID {$v="::"+$strn.text;})*
;

propRefD returns [PropRef ref = directives_factory.createPropRef()]
  @init{
    System.out.println("PropRef");
  }
  @after{
    System.out.println("End PropRef");
  }
  :
  DOT prop=ID {ref.setProperty($prop.text);}
;

//Literals
literalD returns [Literal l]
  @init{
    System.out.println("Literal");
  }
  @after{
    System.out.println("End Literal");
  }
  :
  boolD {$l=$boolD.l;} | stringD {$l=$stringD.l;} | intD {$l=$intD.l;}
;

boolD returns [BooleanLiteral l = directives_factory.createBooleanLiteral()]
  @init{
    l.setValue(false);
    System.out.println("BooleanLiteral");
  }
  @after{
    System.out.println("End BooleanLiteral");
  }
  :
  (TRUE {l.setValue(true);} | FALSE) 
;

stringD returns [StringLiteral l = directives_factory.createStringLiteral()]
  @init{
    System.out.println("StringLiteral");
  }
  @after{
    System.out.println("End StringLiteral");
  }
  :
  value=STRING_LITERAL {l.setValue($value.text.substring(1, $value.text.length()-1));}
;

intD returns [IntegerLiteral l = directives_factory.createIntegerLiteral()]
  @init{
    System.out.println("IntegerLiteral");
  }
  @after{
    if (sign != null){
      System.out.println("Negative value= "+$sign.text+$value.text);
      l.setValue(Integer.parseInt($sign.text+$value.text));
      System.out.println("End IntegerLiteral");
    }
  }
  :
  (sign=MINUS)? value=INT_LITERAL {l.setValue(Integer.parseInt($value.text));}
;

//Tokens
PRE     : 'pre'|'PRE';
POST    : 'post'|'POST';
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
CREATE  : 'create'|'CREATE';
TRUE    : 'true'|'TRUE';
FALSE   : 'false'|'FALSE';
COMMA   : ',';
UNION   : 'union'|'UNION';
INTER   : 'intersection'|'INTERSECTION';
DESTROY : 'destroy'|'DESTROY';
MERGE   : 'merge'|'MERGE';
LP      : '(';
RP      : ')';

STRING_LITERAL
  @init{
    System.out.println("STRING_LITERAL");
  }
  @after{
    System.out.println("End STRING_LITERAL");
  } 
  : 
  '"' (ESC | ~('"'|'\\'))* '"'
;
INT_LITERAL
  @init{
    System.out.println("INT_LITERAL");
  }
  @after{
    System.out.println("End INT_LITERAL");
  }
  : 
  (DIGIT)*
;
ID
  @init{
    System.out.println("ID");
  }
  @after{
    System.out.println("End ID");
  }
  : 
  ('~')? ('a'..'z' | 'A'..'Z' | '_' | DIGIT)+
;
protected ESC : '\\' ('t' | 'f' | 'r' | 'n' | '"' | '\'' | '\\' | (DIGIT DIGIT DIGIT) );
fragment DIGIT : '0'..'9';
META_ID 
  @init{
    System.out.println("META_ID");
  }
  @after{
    System.out.println("End META_ID");
  }
  :
  '\''('a'..'z' | 'A'..'Z' | '_' | DIGIT)+'\''
;



WS : (' ' | '\t' | '\f' | '\n')+ {$channel=HIDDEN;}; 
SingleLineComment : '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
MultiLineComment : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};