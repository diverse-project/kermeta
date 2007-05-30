
header
{
package fr.irisa.triskell.kermeta.parser;
import fr.irisa.triskell.kermeta.ast.*;
import com.ibm.eclipse.ldt.core.parser.*;
}

class KermetaParser extends Parser;

options {
  k=3;

  defaultErrorHandler=false;

}
{
	private ParseContext _parseContext;
	public void setParseContext(ParseContext parseContext) {
		_parseContext = parseContext;
	}
	
    public void reportError(RecognitionException ex) {
        if (_parseContext != null) {
        	_parseContext.addParseMessage(new ParseError(ex));
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
{ retVal = new PackageDecl(annotations, package_KW, name, semi); }
;

qualifiedID returns [ QualifiedID retVal = new QualifiedID() ]
:
{ QidSeparator qidSeparator = null; }
  id1:ID { retVal.addChild(id1); } 
  ( qidSeparator=qidSeparator idn:ID { retVal.addChild(qidSeparator); retVal.addChild(idn); } )*
;

qidSeparator returns [ QidSeparator retVal = null ]
{ Token tok = LT(1); }
: ( COL_COL
  )
{ retVal = new QidSeparator(tok); }
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
{ retVal = new StringLiteralContainer(string_literal); }
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
{ QualifiedID name = null; }
  at:AT name=qualifiedID val:STRING_LITERAL 
{ retVal = new Tag(at, name, val); }
;

contextMultiLineComment returns [ ContextMultiLineComment retVal = null ]
:
  context_multi_line_comment:CONTEXT_MULTI_LINE_COMMENT 
{ retVal = new ContextMultiLineComment(context_multi_line_comment); }
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
{ retVal = new ImportStmt(require_KW, uri, excludeFilter, includeFilter); }
;

excludeFilter returns [ ExcludeFilter retVal = null ]
:
{ Filters filters = null; }
  excludeFilter_KW:"excludeFilter" lparen:LPAREN ( filters=filters )? rparen:RPAREN 
{ retVal = new ExcludeFilter(excludeFilter_KW, lparen, filters, rparen); }
;

includeFilter returns [ IncludeFilter retVal = null ]
:
{ Filters filters = null; }
  includeFilter_KW:"includeFilter" lparen:LPAREN ( filters=filters )? rparen:RPAREN 
{ retVal = new IncludeFilter(includeFilter_KW, lparen, filters, rparen); }
;

filters returns [ Filters retVal = new Filters() ]
:
{ Filter f1 = null; Filter fn = null; }
  f1=filter { retVal.addChild(f1); } 
  ( comma:COMMA fn=filter { retVal.addChild(comma); retVal.addChild(fn); } )*
;

filter returns [ Filter retVal = null ]
:
  string_literal:STRING_LITERAL 
{ retVal = new Filter(string_literal); }
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
{ retVal = new UsingStmt(using_KW, name); }
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
{ retVal = new SubPackageDecl(package_KW, name, lcurly, topLevelDecls, rcurly); }
;

modelTypeDecl returns [ ModelTypeDecl retVal = null ]
:
{ QualifiedIDlst included = null; }
  modeltype_KW:"modeltype" name:ID lcurly:LCURLY included=qualifiedIDlst rcurly:RCURLY 
{ retVal = new ModelTypeDecl(modeltype_KW, name, lcurly, included, rcurly); }
;

qualifiedIDlst returns [ QualifiedIDlst retVal = new QualifiedIDlst() ]
:
{ QualifiedID id1 = null; QualifiedID idn = null; }
  id1=qualifiedID { retVal.addChild(id1); } 
  ( comma:COMMA idn=qualifiedID { retVal.addChild(comma); retVal.addChild(idn); } )*
;

classDecl returns [ ClassDecl retVal = null ]
:
{ AbstractModifier abstractModifier = null; ClassKind classKind = null; TypeVarDecllst typeVarDecllst = null; Typelst superTypes = null; ClassMemberDecls classMemberDecls = null; }
  ( abstractModifier=abstractModifier )? classKind=classKind name:ID ( lt:LT typeVarDecllst=typeVarDecllst gt:GT )? ( inherits_KW:"inherits" superTypes=typelst )? lcurly:LCURLY classMemberDecls=classMemberDecls rcurly:RCURLY 
{ retVal = new ClassDecl(abstractModifier, classKind, name, lt, typeVarDecllst, gt, inherits_KW, superTypes, lcurly, classMemberDecls, rcurly); }
;

classKind returns [ ClassKind retVal = null ]
{ Token tok = LT(1); }
: ( "class"
  )
{ retVal = new ClassKind(tok); }
;

abstractModifier returns [ AbstractModifier retVal = null ]
{ Token tok = LT(1); }
: ( "abstract"
  )
{ retVal = new AbstractModifier(tok); }
;

typelst returns [ Typelst retVal = new Typelst() ]
:
{ Type t1 = null; Type tn = null; }
  t1=type { retVal.addChild(t1); } 
  ( comma:COMMA tn=type { retVal.addChild(comma); retVal.addChild(tn); } )*
;

typeVarDecllst returns [ TypeVarDecllst retVal = new TypeVarDecllst() ]
:
{ TypeVarDecl tv1 = null; TypeVarDecl tvn = null; }
  tv1=typeVarDecl { retVal.addChild(tv1); } 
  ( comma:COMMA tvn=typeVarDecl { retVal.addChild(comma); retVal.addChild(tvn); } )*
;

typeVarDecl returns [ TypeVarDecl retVal = null ]
:
{ Type supertype = null; }
  name:ID ( colon:COLON supertype=type )? 
{ retVal = new TypeVarDecl(name, colon, supertype); }
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
{ retVal = new Basictype(name, lt, params, gt); }
;

prodtype returns [ Prodtype retVal = null ]
:
{ Typelst typelst = null; }
  lsquare:LSQUARE typelst=typelst rsquare:RSQUARE 
{ retVal = new Prodtype(lsquare, typelst, rsquare); }
;

functype returns [ Functype retVal = null ]
:
{ Type left = null; Type right = null; }
  lt:LT left=type minus_gt:MINUS_GT right=type gt:GT 
{ retVal = new Functype(lt, left, minus_gt, right, gt); }
;

voidType returns [ VoidType retVal = null ]
:
  Void_KW:"Void" 
{ retVal = new VoidType(Void_KW); }
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
{ retVal = new Invariant(inv_KW, name, is_KW, body); }
;

property returns [ Property retVal = null ]
:
{ PropertyKind propertyKind = null; ReadOnlyModifier readOnlyModifier = null; TypeRef typeRef = null; PropertyBody propertyBody = null; }
  propertyKind=propertyKind ( readOnlyModifier=readOnlyModifier )? name:ID colon:COLON typeRef=typeRef ( hash:HASH oppositeName:ID )? ( propertyBody=propertyBody )? 
{ retVal = new Property(propertyKind, readOnlyModifier, name, colon, typeRef, hash, oppositeName, propertyBody); }
;

propertyKind returns [ PropertyKind retVal = null ]
{ Token tok = LT(1); }
: ( "attribute"
  | "reference"
  | "property"
  )
{ retVal = new PropertyKind(tok); }
;

readOnlyModifier returns [ ReadOnlyModifier retVal = null ]
{ Token tok = LT(1); }
: ( "readonly"
  )
{ retVal = new ReadOnlyModifier(tok); }
;

propertyBody returns [ PropertyBody retVal = null ]
:
{ GetterBody getterBody = null; SetterBody setterBody = null; }
  getterBody=getterBody ( setterBody=setterBody )? 
{ retVal = new PropertyBody(getterBody, setterBody); }
;

getterBody returns [ GetterBody retVal = null ]
:
{ FExpression getterbody = null; }
  getter_KW:"getter" is_KW:"is" getterbody=fExpression 
{ retVal = new GetterBody(getter_KW, is_KW, getterbody); }
;

setterBody returns [ SetterBody retVal = null ]
:
{ FExpression setterbody = null; }
  setter_KW:"setter" is_KW:"is" setterbody=fExpression 
{ retVal = new SetterBody(setter_KW, is_KW, setterbody); }
;

operation returns [ Operation retVal = null ]
:
{ OperationKind operationKind = null; TypeVarDecllst typeVarDecllst = null; Params params = null; TypeRef typeRef = null; QualifiedID superSelection = null; Typelst exceptions = null; Assertions assertions = null; OperationBody operationBody = null; }
  operationKind=operationKind name:ID ( lt:LT typeVarDecllst=typeVarDecllst gt:GT )? lparen:LPAREN ( params=params )? rparen:RPAREN ( colon:COLON typeRef=typeRef )? ( from_KW:"from" superSelection=qualifiedID )? ( raises_KW:"raises" exceptions=typelst )? assertions=assertions is_KW:"is" operationBody=operationBody 
{ retVal = new Operation(operationKind, name, lt, typeVarDecllst, gt, lparen, params, rparen, colon, typeRef, from_KW, superSelection, raises_KW, exceptions, assertions, is_KW, operationBody); }
;

operationKind returns [ OperationKind retVal = null ]
{ Token tok = LT(1); }
: ( "operation"
  | "method"
  )
{ retVal = new OperationKind(tok); }
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
{ retVal = new Precondition(pre_KW, name, is_KW, body); }
;

postcondition returns [ Postcondition retVal = null ]
:
{ FExpression body = null; }
  post_KW:"post" name:ID is_KW:"is" body=fExpression 
{ retVal = new Postcondition(post_KW, name, is_KW, body); }
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
{ retVal = new OperationEmptyBody(abstract_KW); }
;

params returns [ Params retVal = new Params() ]
:
{ Param p1 = null; Param pn = null; }
  p1=param { retVal.addChild(p1); } 
  ( comma:COMMA pn=param { retVal.addChild(comma); retVal.addChild(pn); } )*
;

param returns [ Param retVal = null ]
:
{ Annotations annotations = null; TypeRef typeRef = null; }
  annotations=annotations name:ID colon:COLON typeRef=typeRef 
{ retVal = new Param(annotations, name, colon, typeRef); }
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
{ retVal = new CollectionType(tok); }
;

multiplicity returns [ Multiplicity retVal = null ]
:
{ MultiplicityExpr multiplicityExpr = null; }
  lsquare:LSQUARE ( multiplicityExpr=multiplicityExpr )? rsquare:RSQUARE 
{ retVal = new Multiplicity(lsquare, multiplicityExpr, rsquare); }
;

multiplicityExpr returns [ MultiplicityExpr retVal = null ]
:
{ SimpleMultiplicityExpr lowerBound = null; SimpleMultiplicityExpr upperBound = null; }
  lowerBound=simpleMultiplicityExpr ( dot_dot:DOT_DOT upperBound=simpleMultiplicityExpr )? 
{ retVal = new MultiplicityExpr(lowerBound, dot_dot, upperBound); }
;

simpleMultiplicityExpr returns [ SimpleMultiplicityExpr retVal = null ]
{ Token tok = LT(1); }
: ( STAR
  | PLUS
  | QMARK
  | INT_LITERAL
  )
{ retVal = new SimpleMultiplicityExpr(tok); }
;

dataTypeDecl returns [ DataTypeDecl retVal = null ]
:
{ Type instanceClass = null; }
  alias_KW:"alias" name:ID colon:COLON instanceClass=type semi:SEMI 
{ retVal = new DataTypeDecl(alias_KW, name, colon, instanceClass, semi); }
;

enumDecl returns [ EnumDecl retVal = null ]
:
{ EnumLiterals enumLiterals = null; }
  enumeration_KW:"enumeration" name:ID lcurly:LCURLY enumLiterals=enumLiterals rcurly:RCURLY 
{ retVal = new EnumDecl(enumeration_KW, name, lcurly, enumLiterals, rcurly); }
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
{ retVal = new EnumLiteral(annotations, name, semi); }
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
{ retVal = new FAssignement(annotations, expression, assignementOp, equals, newvalue); }
;

assignementOp returns [ AssignementOp retVal = null ]
{ Token tok = LT(1); }
: ( COLON
  | QMARK
  )
{ retVal = new AssignementOp(tok); }
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
{ retVal = new LogicalOp(tok); }
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
{ retVal = new RelationalOp(tok); }
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
{ retVal = new AdditiveOp(tok); }
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
{ retVal = new MultiplicativeOp(tok); }
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
{ retVal = new UnaryOp(tok); }
;

postfixExp returns [ PostfixExp retVal = null ]
:
{ PrimitiveExpression target = null; Postfixlst postfixlst = null; }
  target=primitiveExpression postfixlst=postfixlst 
{ retVal = new PostfixExp(target, postfixlst); }
;

postfixlst returns [ Postfixlst retVal = new Postfixlst() ]
:
{ Postfix postfix = null; }
  ( postfix=postfix { retVal.addChild(postfix); } )*
;

postfix returns [ Postfix retVal = null ]
:
  ( retVal=callPostfix
  | retVal=lambdaPostfix
  | retVal=paramPostfix
  )
;

callPostfix returns [ CallPostfix retVal = null ]
:
  dot:DOT name:ID 
{ retVal = new CallPostfix(dot, name); }
;

paramPostfix returns [ ParamPostfix retVal = null ]
:
{ ActualParameterList parameters = null; }
  lparen:LPAREN ( parameters=actualParameterList )? rparen:RPAREN 
{ retVal = new ParamPostfix(lparen, parameters, rparen); }
;

actualParameterList returns [ ActualParameterList retVal = new ActualParameterList() ]
:
{ ActualParameter p1 = null; ActualParameter pn = null; }
  p1=actualParameter { retVal.addChild(p1); } 
  ( comma:COMMA pn=actualParameter { retVal.addChild(comma); retVal.addChild(pn); } )*
;

actualParameter returns [ ActualParameter retVal = null ]
:
{ FExpression expression = null; }
  expression=fExpression 
{ retVal = new ActualParameter(expression); }
;

lambdaPostfix returns [ LambdaPostfix retVal = null ]
:
{ LambdaPostfixParamLst params = null; FExpressionLst expression = null; }
  lcurly:LCURLY params=lambdaPostfixParamLst pipe:PIPE expression=fExpressionLst rcurly:RCURLY 
{ retVal = new LambdaPostfix(lcurly, params, pipe, expression, rcurly); }
;

lambdaPostfixParamLst returns [ LambdaPostfixParamLst retVal = new LambdaPostfixParamLst() ]
:
{ LambdaPostfixParam p1 = null; LambdaPostfixParam pn = null; }
  p1=lambdaPostfixParam { retVal.addChild(p1); } 
  ( comma:COMMA pn=lambdaPostfixParam { retVal.addChild(comma); retVal.addChild(pn); } )*
;

lambdaPostfixParam returns [ LambdaPostfixParam retVal = null ]
:
  name:ID 
{ retVal = new LambdaPostfixParam(name); }
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
{ retVal = new ParentExp(lparen, fExpression, rparen); }
;

fSelfCall returns [ FSelfCall retVal = null ]
:
  self_KW:"self" 
{ retVal = new FSelfCall(self_KW); }
;

fSuperCall returns [ FSuperCall retVal = null ]
:
  super_KW:"super" 
{ retVal = new FSuperCall(super_KW); }
;

resultCall returns [ ResultCall retVal = null ]
:
  result_KW:"result" 
{ retVal = new ResultCall(result_KW); }
;

valueCall returns [ ValueCall retVal = null ]
:
  value_KW:"value" 
{ retVal = new ValueCall(value_KW); }
;

fBlock returns [ FBlock retVal = null ]
:
{ Annotations annotations = null; FExpressionLst fExpressionLst = null; FRescueLst fRescueLst = null; }
  do_KW:"do" annotations=annotations fExpressionLst=fExpressionLst fRescueLst=fRescueLst end_KW:"end" 
{ retVal = new FBlock(do_KW, annotations, fExpressionLst, fRescueLst, end_KW); }
;

fLambdaExpression returns [ FLambdaExpression retVal = null ]
:
{ FLambdaparamlst params = null; FExpressionLst expression = null; }
  function_KW:"function" lcurly:LCURLY params=fLambdaparamlst pipe:PIPE expression=fExpressionLst rcurly:RCURLY 
{ retVal = new FLambdaExpression(function_KW, lcurly, params, pipe, expression, rcurly); }
;

fLambdaparamlst returns [ FLambdaparamlst retVal = new FLambdaparamlst() ]
:
{ FLambdaparam p1 = null; FLambdaparam pn = null; }
  p1=fLambdaparam { retVal.addChild(p1); } 
  ( comma:COMMA pn=fLambdaparam { retVal.addChild(comma); retVal.addChild(pn); } )*
;

fLambdaparam returns [ FLambdaparam retVal = null ]
:
{ TypeRef typeRef = null; }
  name:ID colon:COLON typeRef=typeRef 
{ retVal = new FLambdaparam(name, colon, typeRef); }
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
{ retVal = new FRescue(rescue_KW, lparen, varName, colon, exTypeRef, rparen, rescstmts); }
;

fLoop returns [ FLoop retVal = null ]
:
{ FExpression init = null; FExpression condition = null; FExpressionLst body = null; }
  from_KW:"from" init=fExpression until_KW:"until" condition=fExpression loop_KW:"loop" body=fExpressionLst end_KW:"end" 
{ retVal = new FLoop(from_KW, init, until_KW, condition, loop_KW, body, end_KW); }
;

fConditional returns [ FConditional retVal = null ]
:
{ FExpression condition = null; FExpressionLst ifblock = null; FExpressionLst elseblock = null; }
  if_KW:"if" condition=fExpression then_KW:"then" ifblock=fExpressionLst ( else_KW:"else" elseblock=fExpressionLst )? end_KW:"end" 
{ retVal = new FConditional(if_KW, condition, then_KW, ifblock, else_KW, elseblock, end_KW); }
;

fRaiseException returns [ FRaiseException retVal = null ]
:
{ FExpression fExpression = null; }
  raise_KW:"raise" fExpression=fExpression 
{ retVal = new FRaiseException(raise_KW, fExpression); }
;

fVariableDecl returns [ FVariableDecl retVal = null ]
:
{ TypeRef typeRef = null; FExpression init = null; }
  var_KW:"var" name:ID colon:COLON typeRef=typeRef ( init_KW:"init" init=fExpression )? 
{ retVal = new FVariableDecl(var_KW, name, colon, typeRef, init_KW, init); }
;

fJavaStaticCall returns [ FJavaStaticCall retVal = null ]
:
{ QualifiedID cname = null; ActualParameterList parameters = null; }
  extern_KW:"extern" cname=qualifiedID dot:DOT mname:ID lparen:LPAREN ( parameters=actualParameterList )? rparen:RPAREN 
{ retVal = new FJavaStaticCall(extern_KW, cname, dot, mname, lparen, parameters, rparen); }
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
{ retVal = new TrueOrFalse(tok); }
;

fIntegerLiteral returns [ FIntegerLiteral retVal = null ]
:
  int_literal:INT_LITERAL 
{ retVal = new FIntegerLiteral(int_literal); }
;

fStringLiteral returns [ FStringLiteral retVal = null ]
:
  string_literal:STRING_LITERAL 
{ retVal = new FStringLiteral(string_literal); }
;

fVoidLiteral returns [ FVoidLiteral retVal = null ]
:
  void_KW:"void" 
{ retVal = new FVoidLiteral(void_KW); }
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
{ retVal = new AtpreOp(tok); }
;


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




