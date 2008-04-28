
header
{
package fr.irisa.triskell.kermeta.parser.gen.parser;
import fr.irisa.triskell.kermeta.parser.gen.ast.*;
import org.eclipse.gymnast.runtime.core.parser.*;
import org.eclipse.gymnast.runtime.core.ast.*;
}

class KermetaParser extends Parser;

options {
  k=3;
defaultErrorHandler=false;
}
{
    private ParseError createParseError(RecognitionException ex) {
        return KermetaParserDriver.createParseError(ex);
    }

private TokenInfo createTokenInfo(Token tok) {
	if (tok == null) return null;
	else {
		if ( tok instanceof TokenWithIndex ) {
			TokenWithIndex t = (TokenWithIndex) tok;
			int offset = t.getIndex();
			return new TokenInfo(t.getText(), t.getLine(), t.getColumn(), offset, t.getType());
		} else {
			return new TokenInfo(tok.getText(), tok.getLine(), tok.getColumn(), -1, tok.getType());
		}
	}
}


	private ParseContext _parseContext;
	public void setParseContext(ParseContext parseContext) {
		_parseContext = parseContext;
	}
	
    public void reportError(RecognitionException ex) {
        if (_parseContext != null) {
        	_parseContext.addParseMessage(createParseError(ex));
        }
    }

    public void reportError(String s) {
        if (_parseContext != null) {
        	_parseContext.addParseMessage(new ParseError(s, -1));
        }
    }

    public void reportWarning(String s) {
    	if (_parseContext != null) {
        	_parseContext.addParseMessage(new ParseWarning(s, -1));
        }
    }

}

scompUnit [ Annotations postAnnotations ]  returns [ ScompUnit retVal = null ]
:
{ PackageDecl packageDecl = null; ImportStmts importStmts = null; UsingStmts usingStmts = null; TopLevelDecls topLevelDecls = null; }
  packageDecl=packageDecl importStmts=importStmts usingStmts=usingStmts topLevelDecls=topLevelDecls 
{ retVal = new ScompUnit(postAnnotations, packageDecl, importStmts, usingStmts, topLevelDecls); }
;

compUnit returns [ CompUnit retVal = null ]
:
{ Annotations postAnnotations = null; }
  ( retVal=scompUnit[postAnnotations]
  )
postAnnotations=annotations ;

packageDecl returns [ PackageDecl retVal = null ]
:
{ Annotations annotations = null; QualifiedID name = null; }
  annotations=annotations package_KW:"package" name=qualifiedID semi:SEMI 
{ retVal = new PackageDecl(annotations, createTokenInfo(package_KW), name, createTokenInfo(semi)); }
;

qualifiedID returns [ QualifiedID retVal = new QualifiedID() ]
:
{ QidSeparator qidSeparator = null; }
  id1:ID { retVal.addChild(createTokenInfo(id1)); } 
  ( qidSeparator=qidSeparator idn:ID { retVal.addChild(qidSeparator); retVal.addChild(createTokenInfo(idn)); } )*
;

kwOrNamedQualifiedID returns [ KwOrNamedQualifiedID retVal = null ]
:
  ( retVal=aspectModifier
  | retVal=squalifiedID
  )
;

squalifiedID returns [ SqualifiedID retVal = null ]
:
{ QualifiedID qualifiedID = null; }
  qualifiedID=qualifiedID 
{ retVal = new SqualifiedID(qualifiedID); }
;

qidSeparator returns [ QidSeparator retVal = null ]
{ Token tok = LT(1); }
: ( COL_COL
  )
{ retVal = new QidSeparator(createTokenInfo(tok)); }
;

stringLiteralOrQualifiedID returns [ StringLiteralOrQualifiedID retVal = null ]
:
  ( retVal=stringLiteralContainer
  | retVal=qualifiedID
  )
;

stringLiteralContainer returns [ StringLiteralContainer retVal = null ]
:
  string_literal:STRING_LITERAL 
{ retVal = new StringLiteralContainer(createTokenInfo(string_literal)); }
;

annotations returns [ Annotations retVal = new Annotations() ]
:
{ Annotation annotation = null; }
  ( annotation=annotation { retVal.addChild(annotation); } )*
;

annotation returns [ Annotation retVal = null ]
:
  ( retVal=tag
  | retVal=contextMultiLineComment
  )
;

tag returns [ Tag retVal = null ]
:
{ KwOrNamedQualifiedID name = null; }
  at:AT name=kwOrNamedQualifiedID val:STRING_LITERAL 
{ retVal = new Tag(createTokenInfo(at), name, createTokenInfo(val)); }
;

contextMultiLineComment returns [ ContextMultiLineComment retVal = null ]
:
  context_multi_line_comment:CONTEXT_MULTI_LINE_COMMENT 
{ retVal = new ContextMultiLineComment(createTokenInfo(context_multi_line_comment)); }
;

importStmts returns [ ImportStmts retVal = new ImportStmts() ]
:
{ ImportStmt importStmt = null; }
  ( importStmt=importStmt { retVal.addChild(importStmt); } )*
;

importStmt returns [ ImportStmt retVal = null ]
:
{ StringLiteralOrQualifiedID uri = null; ExcludeFilter excludeFilter = null; IncludeFilter includeFilter = null; }
  require_KW:"require" uri=stringLiteralOrQualifiedID ( excludeFilter=excludeFilter )? ( includeFilter=includeFilter )? 
{ retVal = new ImportStmt(createTokenInfo(require_KW), uri, excludeFilter, includeFilter); }
;

excludeFilter returns [ ExcludeFilter retVal = null ]
:
{ Filters filters = null; }
  excludeFilter_KW:"excludeFilter" lparen:LPAREN ( filters=filters )? rparen:RPAREN 
{ retVal = new ExcludeFilter(createTokenInfo(excludeFilter_KW), createTokenInfo(lparen), filters, createTokenInfo(rparen)); }
;

includeFilter returns [ IncludeFilter retVal = null ]
:
{ Filters filters = null; }
  includeFilter_KW:"includeFilter" lparen:LPAREN ( filters=filters )? rparen:RPAREN 
{ retVal = new IncludeFilter(createTokenInfo(includeFilter_KW), createTokenInfo(lparen), filters, createTokenInfo(rparen)); }
;

filters returns [ Filters retVal = new Filters() ]
:
{ Filter f1 = null; Filter fn = null; }
  f1=filter { retVal.addChild(f1); } 
  ( comma:COMMA fn=filter { retVal.addChild(createTokenInfo(comma)); retVal.addChild(fn); } )*
;

filter returns [ Filter retVal = null ]
:
  string_literal:STRING_LITERAL 
{ retVal = new Filter(createTokenInfo(string_literal)); }
;

usingStmts returns [ UsingStmts retVal = new UsingStmts() ]
:
{ UsingStmt usingStmt = null; }
  ( usingStmt=usingStmt { retVal.addChild(usingStmt); } )*
;

usingStmt returns [ UsingStmt retVal = null ]
:
{ QualifiedID name = null; }
  using_KW:"using" name=qualifiedID 
{ retVal = new UsingStmt(createTokenInfo(using_KW), name); }
;

topLevelDecls returns [ TopLevelDecls retVal = new TopLevelDecls() ]
:
{ TopLevelDecl topLevelDecl = null; }
  ( topLevelDecl=topLevelDecl { retVal.addChild(topLevelDecl); } )*
;

topLevelDecl returns [ TopLevelDecl retVal = null ]
:
{ Annotations annotations = null; AnnotableElement annotableElement = null; }
  annotations=annotations annotableElement=annotableElement 
{ retVal = new TopLevelDecl(annotations, annotableElement); }
;

annotableElement returns [ AnnotableElement retVal = null ]
:
  ( retVal=subPackageDecl
  | retVal=modelTypeDecl
  | retVal=classDecl
  | retVal=enumDecl
  | retVal=dataTypeDecl
  )
;

subPackageDecl returns [ SubPackageDecl retVal = null ]
:
{ TopLevelDecls topLevelDecls = null; }
  package_KW:"package" name:ID lcurly:LCURLY topLevelDecls=topLevelDecls rcurly:RCURLY 
{ retVal = new SubPackageDecl(createTokenInfo(package_KW), createTokenInfo(name), createTokenInfo(lcurly), topLevelDecls, createTokenInfo(rcurly)); }
;

modelTypeDecl returns [ ModelTypeDecl retVal = null ]
:
{ QualifiedIDlst included = null; }
  modeltype_KW:"modeltype" name:ID lcurly:LCURLY included=qualifiedIDlst rcurly:RCURLY 
{ retVal = new ModelTypeDecl(createTokenInfo(modeltype_KW), createTokenInfo(name), createTokenInfo(lcurly), included, createTokenInfo(rcurly)); }
;

qualifiedIDlst returns [ QualifiedIDlst retVal = new QualifiedIDlst() ]
:
{ QualifiedID id1 = null; QualifiedID idn = null; }
  id1=qualifiedID { retVal.addChild(id1); } 
  ( comma:COMMA idn=qualifiedID { retVal.addChild(createTokenInfo(comma)); retVal.addChild(idn); } )*
;

classDecl returns [ ClassDecl retVal = null ]
:
{ AspectModifier aspectModifier = null; AbstractModifier abstractModifier = null; ClassKind classKind = null; TypeVarDecllst typeVarDecllst = null; Typelst superTypes = null; ClassMemberDecls classMemberDecls = null; }
  ( aspectModifier=aspectModifier )? ( abstractModifier=abstractModifier )? classKind=classKind name:ID ( lt:LT typeVarDecllst=typeVarDecllst gt:GT )? ( inherits_KW:"inherits" superTypes=typelst )? lcurly:LCURLY classMemberDecls=classMemberDecls rcurly:RCURLY 
{ retVal = new ClassDecl(aspectModifier, abstractModifier, classKind, createTokenInfo(name), createTokenInfo(lt), typeVarDecllst, createTokenInfo(gt), createTokenInfo(inherits_KW), superTypes, createTokenInfo(lcurly), classMemberDecls, createTokenInfo(rcurly)); }
;

classKind returns [ ClassKind retVal = null ]
{ Token tok = LT(1); }
: ( "class"
  )
{ retVal = new ClassKind(createTokenInfo(tok)); }
;

abstractModifier returns [ AbstractModifier retVal = null ]
{ Token tok = LT(1); }
: ( "abstract"
  )
{ retVal = new AbstractModifier(createTokenInfo(tok)); }
;

aspectModifier returns [ AspectModifier retVal = null ]
:
  aspect_KW:"aspect" 
{ retVal = new AspectModifier(createTokenInfo(aspect_KW)); }
;

typelst returns [ Typelst retVal = new Typelst() ]
:
{ Type t1 = null; Type tn = null; }
  t1=type { retVal.addChild(t1); } 
  ( comma:COMMA tn=type { retVal.addChild(createTokenInfo(comma)); retVal.addChild(tn); } )*
;

typeVarDecllst returns [ TypeVarDecllst retVal = new TypeVarDecllst() ]
:
{ TypeVarDecl tv1 = null; TypeVarDecl tvn = null; }
  tv1=typeVarDecl { retVal.addChild(tv1); } 
  ( comma:COMMA tvn=typeVarDecl { retVal.addChild(createTokenInfo(comma)); retVal.addChild(tvn); } )*
;

typeVarDecl returns [ TypeVarDecl retVal = null ]
:
{ Type supertype = null; }
  name:ID ( colon:COLON supertype=type )? 
{ retVal = new TypeVarDecl(createTokenInfo(name), createTokenInfo(colon), supertype); }
;

type returns [ Type retVal = null ]
:
  ( retVal=basictype
  | retVal=functype
  | retVal=prodtype
  | retVal=voidType
  )
;

basictype returns [ Basictype retVal = null ]
:
{ QualifiedID name = null; Typelst params = null; }
  name=qualifiedID ( lt:LT params=typelst gt:GT )? 
{ retVal = new Basictype(name, createTokenInfo(lt), params, createTokenInfo(gt)); }
;

prodtype returns [ Prodtype retVal = null ]
:
{ Typelst typelst = null; }
  lsquare:LSQUARE typelst=typelst rsquare:RSQUARE 
{ retVal = new Prodtype(createTokenInfo(lsquare), typelst, createTokenInfo(rsquare)); }
;

functype returns [ Functype retVal = null ]
:
{ Type left = null; Type right = null; }
  lt:LT left=type minus_gt:MINUS_GT right=type gt:GT 
{ retVal = new Functype(createTokenInfo(lt), left, createTokenInfo(minus_gt), right, createTokenInfo(gt)); }
;

voidType returns [ VoidType retVal = null ]
:
  Void_KW:"Void" 
{ retVal = new VoidType(createTokenInfo(Void_KW)); }
;

classMemberDecls returns [ ClassMemberDecls retVal = new ClassMemberDecls() ]
:
{ AnnotableClassMemberDecl annotableClassMemberDecl = null; }
  ( annotableClassMemberDecl=annotableClassMemberDecl { retVal.addChild(annotableClassMemberDecl); } )*
;

annotableClassMemberDecl returns [ AnnotableClassMemberDecl retVal = null ]
:
{ Annotations annotations = null; ClassMemberDecl classMemberDecl = null; }
  annotations=annotations classMemberDecl=classMemberDecl 
{ retVal = new AnnotableClassMemberDecl(annotations, classMemberDecl); }
;

classMemberDecl returns [ ClassMemberDecl retVal = null ]
:
  ( retVal=invariant
  | retVal=operation
  | retVal=property
  )
;

invariant returns [ Invariant retVal = null ]
:
{ FExpression body = null; }
  inv_KW:"inv" name:ID is_KW:"is" body=fExpression 
{ retVal = new Invariant(createTokenInfo(inv_KW), createTokenInfo(name), createTokenInfo(is_KW), body); }
;

property returns [ Property retVal = null ]
:
{ PropertyKind propertyKind = null; ReadOnlyModifier readOnlyModifier = null; TypeRef typeRef = null; GetterBody getterBody = null; SetterBody setterBody = null; }
  propertyKind=propertyKind ( readOnlyModifier=readOnlyModifier )? name:ID colon:COLON typeRef=typeRef ( hash:HASH oppositeName:ID )? ( getterBody=getterBody )? ( setterBody=setterBody )? 
{ retVal = new Property(propertyKind, readOnlyModifier, createTokenInfo(name), createTokenInfo(colon), typeRef, createTokenInfo(hash), createTokenInfo(oppositeName), getterBody, setterBody); }
;

propertyKind returns [ PropertyKind retVal = null ]
{ Token tok = LT(1); }
: ( "attribute"
  | "reference"
  | "property"
  )
{ retVal = new PropertyKind(createTokenInfo(tok)); }
;

readOnlyModifier returns [ ReadOnlyModifier retVal = null ]
{ Token tok = LT(1); }
: ( "readonly"
  )
{ retVal = new ReadOnlyModifier(createTokenInfo(tok)); }
;

getterBody returns [ GetterBody retVal = null ]
:
{ FExpression getterbody = null; }
  getter_KW:"getter" is_KW:"is" getterbody=fExpression 
{ retVal = new GetterBody(createTokenInfo(getter_KW), createTokenInfo(is_KW), getterbody); }
;

setterBody returns [ SetterBody retVal = null ]
:
{ FExpression setterbody = null; }
  setter_KW:"setter" is_KW:"is" setterbody=fExpression 
{ retVal = new SetterBody(createTokenInfo(setter_KW), createTokenInfo(is_KW), setterbody); }
;

operation returns [ Operation retVal = null ]
:
{ OperationKind operationKind = null; TypeVarDecllst typeVarDecllst = null; Params params = null; TypeRef typeRef = null; QualifiedID superSelection = null; Typelst exceptions = null; Assertions assertions = null; OperationBody operationBody = null; }
  operationKind=operationKind name:ID ( lt:LT typeVarDecllst=typeVarDecllst gt:GT )? lparen:LPAREN ( params=params )? rparen:RPAREN ( colon:COLON typeRef=typeRef )? ( from_KW:"from" superSelection=qualifiedID )? ( raises_KW:"raises" exceptions=typelst )? assertions=assertions is_KW:"is" operationBody=operationBody 
{ retVal = new Operation(operationKind, createTokenInfo(name), createTokenInfo(lt), typeVarDecllst, createTokenInfo(gt), createTokenInfo(lparen), params, createTokenInfo(rparen), createTokenInfo(colon), typeRef, createTokenInfo(from_KW), superSelection, createTokenInfo(raises_KW), exceptions, assertions, createTokenInfo(is_KW), operationBody); }
;

operationKind returns [ OperationKind retVal = null ]
{ Token tok = LT(1); }
: ( "operation"
  | "method"
  )
{ retVal = new OperationKind(createTokenInfo(tok)); }
;

assertions returns [ Assertions retVal = new Assertions() ]
:
{ Annotableassertion annotableassertion = null; }
  ( annotableassertion=annotableassertion { retVal.addChild(annotableassertion); } )*
;

annotableassertion returns [ Annotableassertion retVal = null ]
:
{ Annotations annotations = null; Assertion assertion = null; }
  annotations=annotations assertion=assertion 
{ retVal = new Annotableassertion(annotations, assertion); }
;

assertion returns [ Assertion retVal = null ]
:
  ( retVal=precondition
  | retVal=postcondition
  )
;

precondition returns [ Precondition retVal = null ]
:
{ FExpression body = null; }
  pre_KW:"pre" name:ID is_KW:"is" body=fExpression 
{ retVal = new Precondition(createTokenInfo(pre_KW), createTokenInfo(name), createTokenInfo(is_KW), body); }
;

postcondition returns [ Postcondition retVal = null ]
:
{ FExpression body = null; }
  post_KW:"post" name:ID is_KW:"is" body=fExpression 
{ retVal = new Postcondition(createTokenInfo(post_KW), createTokenInfo(name), createTokenInfo(is_KW), body); }
;

operationBody returns [ OperationBody retVal = null ]
:
  ( retVal=operationEmptyBody
  | retVal=operationExpressionBody
  )
;

operationExpressionBody returns [ OperationExpressionBody retVal = null ]
:
{ Annotations bodyAnnotations = null; FExpression fExpression = null; }
  bodyAnnotations=annotations fExpression=fExpression 
{ retVal = new OperationExpressionBody(bodyAnnotations, fExpression); }
;

operationEmptyBody returns [ OperationEmptyBody retVal = null ]
:
  abstract_KW:"abstract" 
{ retVal = new OperationEmptyBody(createTokenInfo(abstract_KW)); }
;

params returns [ Params retVal = new Params() ]
:
{ Param p1 = null; Param pn = null; }
  p1=param { retVal.addChild(p1); } 
  ( comma:COMMA pn=param { retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn); } )*
;

param returns [ Param retVal = null ]
:
{ Annotations annotations = null; TypeRef typeRef = null; }
  annotations=annotations name:ID colon:COLON typeRef=typeRef 
{ retVal = new Param(annotations, createTokenInfo(name), createTokenInfo(colon), typeRef); }
;

typeRef returns [ TypeRef retVal = null ]
:
{ CollectionType collectionType = null; Type reftype = null; Multiplicity multiplicity = null; }
  ( collectionType=collectionType )? reftype=type ( multiplicity=multiplicity )? 
{ retVal = new TypeRef(collectionType, reftype, multiplicity); }
;

collectionType returns [ CollectionType retVal = null ]
{ Token tok = LT(1); }
: ( "bag"
  | "set"
  | "seq"
  | "oset"
  )
{ retVal = new CollectionType(createTokenInfo(tok)); }
;

multiplicity returns [ Multiplicity retVal = null ]
:
{ MultiplicityExpr multiplicityExpr = null; }
  lsquare:LSQUARE ( multiplicityExpr=multiplicityExpr )? rsquare:RSQUARE 
{ retVal = new Multiplicity(createTokenInfo(lsquare), multiplicityExpr, createTokenInfo(rsquare)); }
;

multiplicityExpr returns [ MultiplicityExpr retVal = null ]
:
{ SimpleMultiplicityExpr lowerBound = null; SimpleMultiplicityExpr upperBound = null; }
  lowerBound=simpleMultiplicityExpr ( dot_dot:DOT_DOT upperBound=simpleMultiplicityExpr )? 
{ retVal = new MultiplicityExpr(lowerBound, createTokenInfo(dot_dot), upperBound); }
;

simpleMultiplicityExpr returns [ SimpleMultiplicityExpr retVal = null ]
{ Token tok = LT(1); }
: ( STAR
  | PLUS
  | QMARK
  | INT_LITERAL
  )
{ retVal = new SimpleMultiplicityExpr(createTokenInfo(tok)); }
;

dataTypeDecl returns [ DataTypeDecl retVal = null ]
:
{ Type instanceClass = null; }
  alias_KW:"alias" name:ID colon:COLON instanceClass=type semi:SEMI 
{ retVal = new DataTypeDecl(createTokenInfo(alias_KW), createTokenInfo(name), createTokenInfo(colon), instanceClass, createTokenInfo(semi)); }
;

enumDecl returns [ EnumDecl retVal = null ]
:
{ EnumLiterals enumLiterals = null; }
  enumeration_KW:"enumeration" name:ID lcurly:LCURLY enumLiterals=enumLiterals rcurly:RCURLY 
{ retVal = new EnumDecl(createTokenInfo(enumeration_KW), createTokenInfo(name), createTokenInfo(lcurly), enumLiterals, createTokenInfo(rcurly)); }
;

enumLiterals returns [ EnumLiterals retVal = new EnumLiterals() ]
:
{ EnumLiteral enumLiteral = null; }
  ( enumLiteral=enumLiteral { retVal.addChild(enumLiteral); } )*
;

enumLiteral returns [ EnumLiteral retVal = null ]
:
{ Annotations annotations = null; }
  annotations=annotations name:ID semi:SEMI 
{ retVal = new EnumLiteral(annotations, createTokenInfo(name), createTokenInfo(semi)); }
;

fExpressionLst returns [ FExpressionLst retVal = new FExpressionLst() ]
:
{ FExpression fExpression = null; }
  ( fExpression=fExpression { retVal.addChild(fExpression); } )*
;

asingleExpression returns [ AsingleExpression retVal = null ]
:
{ FExpression fExpression = null; }
  fExpression=fExpression 
{ retVal = new AsingleExpression(fExpression); }
;

fExpression returns [ FExpression retVal = null ]
:
  ( retVal=fAssignement
  )
;

fAssignement returns [ FAssignement retVal = null ]
:
{ Annotations annotations = null; LogicalExpression expression = null; AssignementOp assignementOp = null; LogicalExpression newvalue = null; }
  annotations=annotations expression=logicalExpression ( assignementOp=assignementOp equals:EQUALS newvalue=logicalExpression )? 
{ retVal = new FAssignement(annotations, expression, assignementOp, createTokenInfo(equals), newvalue); }
;

assignementOp returns [ AssignementOp retVal = null ]
{ Token tok = LT(1); }
: ( COLON
  | QMARK
  )
{ retVal = new AssignementOp(createTokenInfo(tok)); }
;

logicalExpression returns [ LogicalExpression retVal = new LogicalExpression() ]
:
{ RelationalExpression exp1 = null; LogicalOp logicalOp = null; RelationalExpression expn = null; }
  exp1=relationalExpression { retVal.addChild(exp1); } 
  ( logicalOp=logicalOp expn=relationalExpression { retVal.addChild(logicalOp); retVal.addChild(expn); } )*
;

logicalOp returns [ LogicalOp retVal = null ]
{ Token tok = LT(1); }
: ( "and"
  | "or"
  )
{ retVal = new LogicalOp(createTokenInfo(tok)); }
;

relationalExpression returns [ RelationalExpression retVal = null ]
:
{ AdditiveExpression left = null; RelationalOp relationalOp = null; AdditiveExpression right = null; }
  left=additiveExpression ( relationalOp=relationalOp right=additiveExpression )? 
{ retVal = new RelationalExpression(left, relationalOp, right); }
;

relationalOp returns [ RelationalOp retVal = null ]
{ Token tok = LT(1); }
: ( EQEQ
  | NEQ
  | GT
  | LT
  | GTE
  | LTE
  )
{ retVal = new RelationalOp(createTokenInfo(tok)); }
;

additiveExpression returns [ AdditiveExpression retVal = new AdditiveExpression() ]
:
{ MultiplicativeExpression exp1 = null; AdditiveOp additiveOp = null; MultiplicativeExpression expn = null; }
  exp1=multiplicativeExpression { retVal.addChild(exp1); } 
  ( additiveOp=additiveOp expn=multiplicativeExpression { retVal.addChild(additiveOp); retVal.addChild(expn); } )*
;

additiveOp returns [ AdditiveOp retVal = null ]
{ Token tok = LT(1); }
: ( PLUS
  | MINUS
  )
{ retVal = new AdditiveOp(createTokenInfo(tok)); }
;

multiplicativeExpression returns [ MultiplicativeExpression retVal = new MultiplicativeExpression() ]
:
{ UnaryExpression exp1 = null; MultiplicativeOp multiplicativeOp = null; UnaryExpression expn = null; }
  exp1=unaryExpression { retVal.addChild(exp1); } 
  ( multiplicativeOp=multiplicativeOp expn=unaryExpression { retVal.addChild(multiplicativeOp); retVal.addChild(expn); } )*
;

multiplicativeOp returns [ MultiplicativeOp retVal = null ]
{ Token tok = LT(1); }
: ( STAR
  | DIV
  )
{ retVal = new MultiplicativeOp(createTokenInfo(tok)); }
;

unaryExpression returns [ UnaryExpression retVal = null ]
:
{ UnaryOp unaryOp = null; PostfixExp postfixExp = null; }
  ( unaryOp=unaryOp )? postfixExp=postfixExp 
{ retVal = new UnaryExpression(unaryOp, postfixExp); }
;

unaryOp returns [ UnaryOp retVal = null ]
{ Token tok = LT(1); }
: ( "not"
  | MINUS
  )
{ retVal = new UnaryOp(createTokenInfo(tok)); }
;

postfixExp returns [ PostfixExp retVal = null ]
:
{ PrimitiveExpression target = null; Postfixlst postfixlst = null; }
  target=primitiveExpression postfixlst=postfixlst 
{ retVal = new PostfixExp(target, postfixlst); }
;

postfixlst returns [ Postfixlst retVal = null ]
:
{ Postfix postfix = null; }
  ( postfix=postfix )? 
{ retVal = new Postfixlst(postfix); }
;

postfix returns [ Postfix retVal = null ]
:
  ( retVal=call
  | retVal=paramPostfix
  )
;

call returns [ Call retVal = null ]
:
  ( retVal=callPostfix
  | retVal=lambdaPostfix
  )
;

callPostfix returns [ CallPostfix retVal = null ]
:
{ AtpreOp atp = null; Postfix postfix = null; }
  dot:DOT name:ID ( atp=atpreOp )? ( postfix=postfix )? 
{ retVal = new CallPostfix(createTokenInfo(dot), createTokenInfo(name), atp, postfix); }
;

paramPostfix returns [ ParamPostfix retVal = null ]
:
{ ActualParameterList parameters = null; Call call = null; }
  lparen:LPAREN ( parameters=actualParameterList )? rparen:RPAREN ( call=call )? 
{ retVal = new ParamPostfix(createTokenInfo(lparen), parameters, createTokenInfo(rparen), call); }
;

actualParameterList returns [ ActualParameterList retVal = new ActualParameterList() ]
:
{ ActualParameter p1 = null; ActualParameter pn = null; }
  p1=actualParameter { retVal.addChild(p1); } 
  ( comma:COMMA pn=actualParameter { retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn); } )*
;

actualParameter returns [ ActualParameter retVal = null ]
:
{ FExpression expression = null; }
  expression=fExpression 
{ retVal = new ActualParameter(expression); }
;

lambdaPostfix returns [ LambdaPostfix retVal = null ]
:
{ LambdaPostfixParamLst params = null; FExpressionLst expression = null; Call call = null; }
  lcurly:LCURLY params=lambdaPostfixParamLst pipe:PIPE expression=fExpressionLst rcurly:RCURLY ( call=call )? 
{ retVal = new LambdaPostfix(createTokenInfo(lcurly), params, createTokenInfo(pipe), expression, createTokenInfo(rcurly), call); }
;

lambdaPostfixParamLst returns [ LambdaPostfixParamLst retVal = new LambdaPostfixParamLst() ]
:
{ LambdaPostfixParam p1 = null; LambdaPostfixParam pn = null; }
  p1=lambdaPostfixParam { retVal.addChild(p1); } 
  ( comma:COMMA pn=lambdaPostfixParam { retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn); } )*
;

lambdaPostfixParam returns [ LambdaPostfixParam retVal = null ]
:
  name:ID 
{ retVal = new LambdaPostfixParam(createTokenInfo(name)); }
;

primitiveExpression returns [ PrimitiveExpression retVal = null ]
:
  ( retVal=fLiteral
  | retVal=parentExp
  | retVal=fSelfCall
  | retVal=fSuperCall
  | retVal=resultCall
  | retVal=fJavaStaticCall
  | retVal=fBlock
  | retVal=fConditional
  | retVal=fRaiseException
  | retVal=fVariableDecl
  | retVal=fLambdaExpression
  | retVal=fLoop
  | retVal=valueCall
  )
;

parentExp returns [ ParentExp retVal = null ]
:
{ FExpression fExpression = null; }
  lparen:LPAREN fExpression=fExpression rparen:RPAREN 
{ retVal = new ParentExp(createTokenInfo(lparen), fExpression, createTokenInfo(rparen)); }
;

fSelfCall returns [ FSelfCall retVal = null ]
:
  self_KW:"self" 
{ retVal = new FSelfCall(createTokenInfo(self_KW)); }
;

fSuperCall returns [ FSuperCall retVal = null ]
:
  super_KW:"super" 
{ retVal = new FSuperCall(createTokenInfo(super_KW)); }
;

resultCall returns [ ResultCall retVal = null ]
:
  result_KW:"result" 
{ retVal = new ResultCall(createTokenInfo(result_KW)); }
;

valueCall returns [ ValueCall retVal = null ]
:
  value_KW:"value" 
{ retVal = new ValueCall(createTokenInfo(value_KW)); }
;

fBlock returns [ FBlock retVal = null ]
:
{ Annotations annotations = null; FExpressionLst fExpressionLst = null; FRescueLst fRescueLst = null; }
  do_KW:"do" annotations=annotations fExpressionLst=fExpressionLst fRescueLst=fRescueLst end_KW:"end" 
{ retVal = new FBlock(createTokenInfo(do_KW), annotations, fExpressionLst, fRescueLst, createTokenInfo(end_KW)); }
;

fLambdaExpression returns [ FLambdaExpression retVal = null ]
:
{ FLambdaparamlst params = null; FExpressionLst expression = null; }
  function_KW:"function" lcurly:LCURLY params=fLambdaparamlst pipe:PIPE expression=fExpressionLst rcurly:RCURLY 
{ retVal = new FLambdaExpression(createTokenInfo(function_KW), createTokenInfo(lcurly), params, createTokenInfo(pipe), expression, createTokenInfo(rcurly)); }
;

fLambdaparamlst returns [ FLambdaparamlst retVal = new FLambdaparamlst() ]
:
{ FLambdaparam p1 = null; FLambdaparam pn = null; }
  p1=fLambdaparam { retVal.addChild(p1); } 
  ( comma:COMMA pn=fLambdaparam { retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn); } )*
;

fLambdaparam returns [ FLambdaparam retVal = null ]
:
{ TypeRef typeRef = null; }
  name:ID colon:COLON typeRef=typeRef 
{ retVal = new FLambdaparam(createTokenInfo(name), createTokenInfo(colon), typeRef); }
;

fRescueLst returns [ FRescueLst retVal = new FRescueLst() ]
:
{ FRescue fRescue = null; }
  ( fRescue=fRescue { retVal.addChild(fRescue); } )*
;

fRescue returns [ FRescue retVal = null ]
:
{ TypeRef exTypeRef = null; FExpressionLst rescstmts = null; }
  rescue_KW:"rescue" ( lparen:LPAREN varName:ID colon:COLON exTypeRef=typeRef rparen:RPAREN )? rescstmts=fExpressionLst 
{ retVal = new FRescue(createTokenInfo(rescue_KW), createTokenInfo(lparen), createTokenInfo(varName), createTokenInfo(colon), exTypeRef, createTokenInfo(rparen), rescstmts); }
;

fLoop returns [ FLoop retVal = null ]
:
{ FExpression init = null; FExpression condition = null; FExpressionLst body = null; }
  from_KW:"from" init=fExpression until_KW:"until" condition=fExpression loop_KW:"loop" body=fExpressionLst end_KW:"end" 
{ retVal = new FLoop(createTokenInfo(from_KW), init, createTokenInfo(until_KW), condition, createTokenInfo(loop_KW), body, createTokenInfo(end_KW)); }
;

fConditional returns [ FConditional retVal = null ]
:
{ FExpression condition = null; FExpressionLst ifblock = null; FExpressionLst elseblock = null; }
  if_KW:"if" condition=fExpression then_KW:"then" ifblock=fExpressionLst ( else_KW:"else" elseblock=fExpressionLst )? end_KW:"end" 
{ retVal = new FConditional(createTokenInfo(if_KW), condition, createTokenInfo(then_KW), ifblock, createTokenInfo(else_KW), elseblock, createTokenInfo(end_KW)); }
;

fRaiseException returns [ FRaiseException retVal = null ]
:
{ FExpression fExpression = null; }
  raise_KW:"raise" fExpression=fExpression 
{ retVal = new FRaiseException(createTokenInfo(raise_KW), fExpression); }
;

fVariableDecl returns [ FVariableDecl retVal = null ]
:
{ TypeRef typeRef = null; FExpression init = null; }
  var_KW:"var" name:ID colon:COLON typeRef=typeRef ( init_KW:"init" init=fExpression )? 
{ retVal = new FVariableDecl(createTokenInfo(var_KW), createTokenInfo(name), createTokenInfo(colon), typeRef, createTokenInfo(init_KW), init); }
;

fJavaStaticCall returns [ FJavaStaticCall retVal = null ]
:
{ QualifiedID cname = null; ActualParameterList parameters = null; }
  extern_KW:"extern" cname=qualifiedID dot:DOT mname:ID lparen:LPAREN ( parameters=actualParameterList )? rparen:RPAREN 
{ retVal = new FJavaStaticCall(createTokenInfo(extern_KW), cname, createTokenInfo(dot), createTokenInfo(mname), createTokenInfo(lparen), parameters, createTokenInfo(rparen)); }
;

fLiteral returns [ FLiteral retVal = null ]
:
  ( retVal=fStringLiteral
  | retVal=fBooleanLiteral
  | retVal=fIntegerLiteral
  | retVal=fVoidLiteral
  | retVal=fTypeOrVarLiteral
  )
;

fBooleanLiteral returns [ FBooleanLiteral retVal = null ]
:
{ TrueOrFalse trueOrFalse = null; }
  trueOrFalse=trueOrFalse 
{ retVal = new FBooleanLiteral(trueOrFalse); }
;

trueOrFalse returns [ TrueOrFalse retVal = null ]
{ Token tok = LT(1); }
: ( "true"
  | "false"
  )
{ retVal = new TrueOrFalse(createTokenInfo(tok)); }
;

fIntegerLiteral returns [ FIntegerLiteral retVal = null ]
:
  int_literal:INT_LITERAL 
{ retVal = new FIntegerLiteral(createTokenInfo(int_literal)); }
;

fStringLiteral returns [ FStringLiteral retVal = null ]
:
  string_literal:STRING_LITERAL 
{ retVal = new FStringLiteral(createTokenInfo(string_literal)); }
;

fVoidLiteral returns [ FVoidLiteral retVal = null ]
:
  void_KW:"void" 
{ retVal = new FVoidLiteral(createTokenInfo(void_KW)); }
;

fTypeOrVarLiteral returns [ FTypeOrVarLiteral retVal = null ]
:
{ Type literal = null; AtpreOp atp = null; }
  literal=type ( atp=atpreOp )? 
{ retVal = new FTypeOrVarLiteral(literal, atp); }
;

atpreOp returns [ AtpreOp retVal = null ]
{ Token tok = LT(1); }
: ( ATPRE
  )
{ retVal = new AtpreOp(createTokenInfo(tok)); }
;


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
			|	'\r' '\n'	{ newline2(); } 
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
	
