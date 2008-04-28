// $ANTLR : "Kermeta.g" -> "KermetaParser.java"$

package fr.irisa.triskell.kermeta.parser.gen.parser;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;
import org.eclipse.gymnast.runtime.core.parser.ParseContext;
import org.eclipse.gymnast.runtime.core.parser.ParseError;
import org.eclipse.gymnast.runtime.core.parser.ParseWarning;

import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.TokenWithIndex;
import antlr.collections.impl.BitSet;
import fr.irisa.triskell.kermeta.parser.gen.ast.*;

public class KermetaParser extends antlr.LLkParser       implements KermetaParserTokenTypes
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


protected KermetaParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public KermetaParser(TokenBuffer tokenBuf) {
  this(tokenBuf,3);
}

protected KermetaParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public KermetaParser(TokenStream lexer) {
  this(lexer,3);
}

public KermetaParser(ParserSharedInputState state) {
  super(state,3);
  tokenNames = _tokenNames;
}

	public final ScompUnit  scompUnit(
		 Annotations postAnnotations 
	) throws RecognitionException, TokenStreamException {
		 ScompUnit retVal = null ;
		
		
		PackageDecl packageDecl = null; ImportStmts importStmts = null; UsingStmts usingStmts = null; TopLevelDecls topLevelDecls = null;
		packageDecl=packageDecl();
		importStmts=importStmts();
		usingStmts=usingStmts();
		topLevelDecls=topLevelDecls();
		retVal = new ScompUnit(postAnnotations, packageDecl, importStmts, usingStmts, topLevelDecls);
		return retVal;
	}
	
	public final PackageDecl  packageDecl() throws RecognitionException, TokenStreamException {
		 PackageDecl retVal = null ;
		
		Token  package_KW = null;
		Token  semi = null;
		
		Annotations annotations = null; QualifiedID name = null;
		annotations=annotations();
		package_KW = LT(1);
		match(LITERAL_package);
		name=qualifiedID();
		semi = LT(1);
		match(SEMI);
		retVal = new PackageDecl(annotations, createTokenInfo(package_KW), name, createTokenInfo(semi));
		return retVal;
	}
	
	public final ImportStmts  importStmts() throws RecognitionException, TokenStreamException {
		 ImportStmts retVal = new ImportStmts() ;
		
		
		ImportStmt importStmt = null;
		{
		_loop336:
		do {
			if ((LA(1)==LITERAL_require)) {
				importStmt=importStmt();
				retVal.addChild(importStmt);
			}
			else {
				break _loop336;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final UsingStmts  usingStmts() throws RecognitionException, TokenStreamException {
		 UsingStmts retVal = new UsingStmts() ;
		
		
		UsingStmt usingStmt = null;
		{
		_loop350:
		do {
			if ((LA(1)==LITERAL_using)) {
				usingStmt=usingStmt();
				retVal.addChild(usingStmt);
			}
			else {
				break _loop350;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final TopLevelDecls  topLevelDecls() throws RecognitionException, TokenStreamException {
		 TopLevelDecls retVal = new TopLevelDecls() ;
		
		
		TopLevelDecl topLevelDecl = null;
		{
		_loop354:
		do {
			if ((_tokenSet_0.member(LA(1))) && (_tokenSet_1.member(LA(2))) && (_tokenSet_2.member(LA(3)))) {
				topLevelDecl=topLevelDecl();
				retVal.addChild(topLevelDecl);
			}
			else {
				break _loop354;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final CompUnit  compUnit() throws RecognitionException, TokenStreamException {
		 CompUnit retVal = null ;
		
		
		Annotations postAnnotations = null;
		{
		retVal=scompUnit(postAnnotations);
		}
		postAnnotations=annotations();
		return retVal;
	}
	
	public final Annotations  annotations() throws RecognitionException, TokenStreamException {
		 Annotations retVal = new Annotations() ;
		
		
		Annotation annotation = null;
		{
		_loop329:
		do {
			if ((LA(1)==AT||LA(1)==CONTEXT_MULTI_LINE_COMMENT) && (_tokenSet_3.member(LA(2))) && (_tokenSet_4.member(LA(3)))) {
				annotation=annotation();
				retVal.addChild(annotation);
			}
			else {
				break _loop329;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final QualifiedID  qualifiedID() throws RecognitionException, TokenStreamException {
		 QualifiedID retVal = new QualifiedID() ;
		
		Token  id1 = null;
		Token  idn = null;
		
		QidSeparator qidSeparator = null;
		id1 = LT(1);
		match(ID);
		retVal.addChild(createTokenInfo(id1));
		{
		_loop318:
		do {
			if ((LA(1)==COL_COL)) {
				qidSeparator=qidSeparator();
				idn = LT(1);
				match(ID);
				retVal.addChild(qidSeparator); retVal.addChild(createTokenInfo(idn));
			}
			else {
				break _loop318;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final QidSeparator  qidSeparator() throws RecognitionException, TokenStreamException {
		 QidSeparator retVal = null ;
		
		Token tok = LT(1);
		
		{
		match(COL_COL);
		}
		retVal = new QidSeparator(createTokenInfo(tok));
		return retVal;
	}
	
	public final KwOrNamedQualifiedID  kwOrNamedQualifiedID() throws RecognitionException, TokenStreamException {
		 KwOrNamedQualifiedID retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LITERAL_aspect:
		{
			retVal=aspectModifier();
			break;
		}
		case ID:
		{
			retVal=squalifiedID();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final AspectModifier  aspectModifier() throws RecognitionException, TokenStreamException {
		 AspectModifier retVal = null ;
		
		Token  aspect_KW = null;
		
		aspect_KW = LT(1);
		match(LITERAL_aspect);
		retVal = new AspectModifier(createTokenInfo(aspect_KW));
		return retVal;
	}
	
	public final SqualifiedID  squalifiedID() throws RecognitionException, TokenStreamException {
		 SqualifiedID retVal = null ;
		
		
		QualifiedID qualifiedID = null;
		qualifiedID=qualifiedID();
		retVal = new SqualifiedID(qualifiedID);
		return retVal;
	}
	
	public final StringLiteralOrQualifiedID  stringLiteralOrQualifiedID() throws RecognitionException, TokenStreamException {
		 StringLiteralOrQualifiedID retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case STRING_LITERAL:
		{
			retVal=stringLiteralContainer();
			break;
		}
		case ID:
		{
			retVal=qualifiedID();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final StringLiteralContainer  stringLiteralContainer() throws RecognitionException, TokenStreamException {
		 StringLiteralContainer retVal = null ;
		
		Token  string_literal = null;
		
		string_literal = LT(1);
		match(STRING_LITERAL);
		retVal = new StringLiteralContainer(createTokenInfo(string_literal));
		return retVal;
	}
	
	public final Annotation  annotation() throws RecognitionException, TokenStreamException {
		 Annotation retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case AT:
		{
			retVal=tag();
			break;
		}
		case CONTEXT_MULTI_LINE_COMMENT:
		{
			retVal=contextMultiLineComment();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Tag  tag() throws RecognitionException, TokenStreamException {
		 Tag retVal = null ;
		
		Token  at = null;
		Token  val = null;
		
		KwOrNamedQualifiedID name = null;
		at = LT(1);
		match(AT);
		name=kwOrNamedQualifiedID();
		val = LT(1);
		match(STRING_LITERAL);
		retVal = new Tag(createTokenInfo(at), name, createTokenInfo(val));
		return retVal;
	}
	
	public final ContextMultiLineComment  contextMultiLineComment() throws RecognitionException, TokenStreamException {
		 ContextMultiLineComment retVal = null ;
		
		Token  context_multi_line_comment = null;
		
		context_multi_line_comment = LT(1);
		match(CONTEXT_MULTI_LINE_COMMENT);
		retVal = new ContextMultiLineComment(createTokenInfo(context_multi_line_comment));
		return retVal;
	}
	
	public final ImportStmt  importStmt() throws RecognitionException, TokenStreamException {
		 ImportStmt retVal = null ;
		
		Token  require_KW = null;
		
		StringLiteralOrQualifiedID uri = null; ExcludeFilter excludeFilter = null; IncludeFilter includeFilter = null;
		require_KW = LT(1);
		match(LITERAL_require);
		uri=stringLiteralOrQualifiedID();
		{
		switch ( LA(1)) {
		case LITERAL_excludeFilter:
		{
			excludeFilter=excludeFilter();
			break;
		}
		case EOF:
		case LITERAL_package:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LITERAL_require:
		case LITERAL_includeFilter:
		case LITERAL_using:
		case LITERAL_modeltype:
		case LITERAL_class:
		case LITERAL_abstract:
		case LITERAL_aspect:
		case LITERAL_alias:
		case LITERAL_enumeration:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_includeFilter:
		{
			includeFilter=includeFilter();
			break;
		}
		case EOF:
		case LITERAL_package:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LITERAL_require:
		case LITERAL_using:
		case LITERAL_modeltype:
		case LITERAL_class:
		case LITERAL_abstract:
		case LITERAL_aspect:
		case LITERAL_alias:
		case LITERAL_enumeration:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new ImportStmt(createTokenInfo(require_KW), uri, excludeFilter, includeFilter);
		return retVal;
	}
	
	public final ExcludeFilter  excludeFilter() throws RecognitionException, TokenStreamException {
		 ExcludeFilter retVal = null ;
		
		Token  excludeFilter_KW = null;
		Token  lparen = null;
		Token  rparen = null;
		
		Filters filters = null;
		excludeFilter_KW = LT(1);
		match(LITERAL_excludeFilter);
		lparen = LT(1);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case STRING_LITERAL:
		{
			filters=filters();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rparen = LT(1);
		match(RPAREN);
		retVal = new ExcludeFilter(createTokenInfo(excludeFilter_KW), createTokenInfo(lparen), filters, createTokenInfo(rparen));
		return retVal;
	}
	
	public final IncludeFilter  includeFilter() throws RecognitionException, TokenStreamException {
		 IncludeFilter retVal = null ;
		
		Token  includeFilter_KW = null;
		Token  lparen = null;
		Token  rparen = null;
		
		Filters filters = null;
		includeFilter_KW = LT(1);
		match(LITERAL_includeFilter);
		lparen = LT(1);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case STRING_LITERAL:
		{
			filters=filters();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rparen = LT(1);
		match(RPAREN);
		retVal = new IncludeFilter(createTokenInfo(includeFilter_KW), createTokenInfo(lparen), filters, createTokenInfo(rparen));
		return retVal;
	}
	
	public final Filters  filters() throws RecognitionException, TokenStreamException {
		 Filters retVal = new Filters() ;
		
		Token  comma = null;
		
		Filter f1 = null; Filter fn = null;
		f1=filter();
		retVal.addChild(f1);
		{
		_loop346:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				fn=filter();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(fn);
			}
			else {
				break _loop346;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final Filter  filter() throws RecognitionException, TokenStreamException {
		 Filter retVal = null ;
		
		Token  string_literal = null;
		
		string_literal = LT(1);
		match(STRING_LITERAL);
		retVal = new Filter(createTokenInfo(string_literal));
		return retVal;
	}
	
	public final UsingStmt  usingStmt() throws RecognitionException, TokenStreamException {
		 UsingStmt retVal = null ;
		
		Token  using_KW = null;
		
		QualifiedID name = null;
		using_KW = LT(1);
		match(LITERAL_using);
		name=qualifiedID();
		retVal = new UsingStmt(createTokenInfo(using_KW), name);
		return retVal;
	}
	
	public final TopLevelDecl  topLevelDecl() throws RecognitionException, TokenStreamException {
		 TopLevelDecl retVal = null ;
		
		
		Annotations annotations = null; AnnotableElement annotableElement = null;
		annotations=annotations();
		annotableElement=annotableElement();
		retVal = new TopLevelDecl(annotations, annotableElement);
		return retVal;
	}
	
	public final AnnotableElement  annotableElement() throws RecognitionException, TokenStreamException {
		 AnnotableElement retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LITERAL_package:
		{
			retVal=subPackageDecl();
			break;
		}
		case LITERAL_modeltype:
		{
			retVal=modelTypeDecl();
			break;
		}
		case LITERAL_class:
		case LITERAL_abstract:
		case LITERAL_aspect:
		{
			retVal=classDecl();
			break;
		}
		case LITERAL_enumeration:
		{
			retVal=enumDecl();
			break;
		}
		case LITERAL_alias:
		{
			retVal=dataTypeDecl();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final SubPackageDecl  subPackageDecl() throws RecognitionException, TokenStreamException {
		 SubPackageDecl retVal = null ;
		
		Token  package_KW = null;
		Token  name = null;
		Token  lcurly = null;
		Token  rcurly = null;
		
		TopLevelDecls topLevelDecls = null;
		package_KW = LT(1);
		match(LITERAL_package);
		name = LT(1);
		match(ID);
		lcurly = LT(1);
		match(LCURLY);
		topLevelDecls=topLevelDecls();
		rcurly = LT(1);
		match(RCURLY);
		retVal = new SubPackageDecl(createTokenInfo(package_KW), createTokenInfo(name), createTokenInfo(lcurly), topLevelDecls, createTokenInfo(rcurly));
		return retVal;
	}
	
	public final ModelTypeDecl  modelTypeDecl() throws RecognitionException, TokenStreamException {
		 ModelTypeDecl retVal = null ;
		
		Token  modeltype_KW = null;
		Token  name = null;
		Token  lcurly = null;
		Token  rcurly = null;
		
		QualifiedIDlst included = null;
		modeltype_KW = LT(1);
		match(LITERAL_modeltype);
		name = LT(1);
		match(ID);
		lcurly = LT(1);
		match(LCURLY);
		included=qualifiedIDlst();
		rcurly = LT(1);
		match(RCURLY);
		retVal = new ModelTypeDecl(createTokenInfo(modeltype_KW), createTokenInfo(name), createTokenInfo(lcurly), included, createTokenInfo(rcurly));
		return retVal;
	}
	
	public final ClassDecl  classDecl() throws RecognitionException, TokenStreamException {
		 ClassDecl retVal = null ;
		
		Token  name = null;
		Token  lt = null;
		Token  gt = null;
		Token  inherits_KW = null;
		Token  lcurly = null;
		Token  rcurly = null;
		
		AspectModifier aspectModifier = null; AbstractModifier abstractModifier = null; ClassKind classKind = null; TypeVarDecllst typeVarDecllst = null; Typelst superTypes = null; ClassMemberDecls classMemberDecls = null;
		{
		switch ( LA(1)) {
		case LITERAL_aspect:
		{
			aspectModifier=aspectModifier();
			break;
		}
		case LITERAL_class:
		case LITERAL_abstract:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		{
			abstractModifier=abstractModifier();
			break;
		}
		case LITERAL_class:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		classKind=classKind();
		name = LT(1);
		match(ID);
		{
		switch ( LA(1)) {
		case LT:
		{
			lt = LT(1);
			match(LT);
			typeVarDecllst=typeVarDecllst();
			gt = LT(1);
			match(GT);
			break;
		}
		case LCURLY:
		case LITERAL_inherits:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_inherits:
		{
			inherits_KW = LT(1);
			match(LITERAL_inherits);
			superTypes=typelst();
			break;
		}
		case LCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		lcurly = LT(1);
		match(LCURLY);
		classMemberDecls=classMemberDecls();
		rcurly = LT(1);
		match(RCURLY);
		retVal = new ClassDecl(aspectModifier, abstractModifier, classKind, createTokenInfo(name), createTokenInfo(lt), typeVarDecllst, createTokenInfo(gt), createTokenInfo(inherits_KW), superTypes, createTokenInfo(lcurly), classMemberDecls, createTokenInfo(rcurly));
		return retVal;
	}
	
	public final EnumDecl  enumDecl() throws RecognitionException, TokenStreamException {
		 EnumDecl retVal = null ;
		
		Token  enumeration_KW = null;
		Token  name = null;
		Token  lcurly = null;
		Token  rcurly = null;
		
		EnumLiterals enumLiterals = null;
		enumeration_KW = LT(1);
		match(LITERAL_enumeration);
		name = LT(1);
		match(ID);
		lcurly = LT(1);
		match(LCURLY);
		enumLiterals=enumLiterals();
		rcurly = LT(1);
		match(RCURLY);
		retVal = new EnumDecl(createTokenInfo(enumeration_KW), createTokenInfo(name), createTokenInfo(lcurly), enumLiterals, createTokenInfo(rcurly));
		return retVal;
	}
	
	public final DataTypeDecl  dataTypeDecl() throws RecognitionException, TokenStreamException {
		 DataTypeDecl retVal = null ;
		
		Token  alias_KW = null;
		Token  name = null;
		Token  colon = null;
		Token  semi = null;
		
		Type instanceClass = null;
		alias_KW = LT(1);
		match(LITERAL_alias);
		name = LT(1);
		match(ID);
		colon = LT(1);
		match(COLON);
		instanceClass=type();
		semi = LT(1);
		match(SEMI);
		retVal = new DataTypeDecl(createTokenInfo(alias_KW), createTokenInfo(name), createTokenInfo(colon), instanceClass, createTokenInfo(semi));
		return retVal;
	}
	
	public final QualifiedIDlst  qualifiedIDlst() throws RecognitionException, TokenStreamException {
		 QualifiedIDlst retVal = new QualifiedIDlst() ;
		
		Token  comma = null;
		
		QualifiedID id1 = null; QualifiedID idn = null;
		id1=qualifiedID();
		retVal.addChild(id1);
		{
		_loop362:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				idn=qualifiedID();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(idn);
			}
			else {
				break _loop362;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final AbstractModifier  abstractModifier() throws RecognitionException, TokenStreamException {
		 AbstractModifier retVal = null ;
		
		Token tok = LT(1);
		
		{
		match(LITERAL_abstract);
		}
		retVal = new AbstractModifier(createTokenInfo(tok));
		return retVal;
	}
	
	public final ClassKind  classKind() throws RecognitionException, TokenStreamException {
		 ClassKind retVal = null ;
		
		Token tok = LT(1);
		
		{
		match(LITERAL_class);
		}
		retVal = new ClassKind(createTokenInfo(tok));
		return retVal;
	}
	
	public final TypeVarDecllst  typeVarDecllst() throws RecognitionException, TokenStreamException {
		 TypeVarDecllst retVal = new TypeVarDecllst() ;
		
		Token  comma = null;
		
		TypeVarDecl tv1 = null; TypeVarDecl tvn = null;
		tv1=typeVarDecl();
		retVal.addChild(tv1);
		{
		_loop378:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				tvn=typeVarDecl();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(tvn);
			}
			else {
				break _loop378;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final Typelst  typelst() throws RecognitionException, TokenStreamException {
		 Typelst retVal = new Typelst() ;
		
		Token  comma = null;
		
		Type t1 = null; Type tn = null;
		t1=type();
		retVal.addChild(t1);
		{
		_loop375:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				tn=type();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(tn);
			}
			else {
				break _loop375;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final ClassMemberDecls  classMemberDecls() throws RecognitionException, TokenStreamException {
		 ClassMemberDecls retVal = new ClassMemberDecls() ;
		
		
		AnnotableClassMemberDecl annotableClassMemberDecl = null;
		{
		_loop390:
		do {
			if ((_tokenSet_5.member(LA(1)))) {
				annotableClassMemberDecl=annotableClassMemberDecl();
				retVal.addChild(annotableClassMemberDecl);
			}
			else {
				break _loop390;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final Type  type() throws RecognitionException, TokenStreamException {
		 Type retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case ID:
		{
			retVal=basictype();
			break;
		}
		case LT:
		{
			retVal=functype();
			break;
		}
		case LSQUARE:
		{
			retVal=prodtype();
			break;
		}
		case LITERAL_Void:
		{
			retVal=voidType();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final TypeVarDecl  typeVarDecl() throws RecognitionException, TokenStreamException {
		 TypeVarDecl retVal = null ;
		
		Token  name = null;
		Token  colon = null;
		
		Type supertype = null;
		name = LT(1);
		match(ID);
		{
		switch ( LA(1)) {
		case COLON:
		{
			colon = LT(1);
			match(COLON);
			supertype=type();
			break;
		}
		case COMMA:
		case GT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new TypeVarDecl(createTokenInfo(name), createTokenInfo(colon), supertype);
		return retVal;
	}
	
	public final Basictype  basictype() throws RecognitionException, TokenStreamException {
		 Basictype retVal = null ;
		
		Token  lt = null;
		Token  gt = null;
		
		QualifiedID name = null; Typelst params = null;
		name=qualifiedID();
		{
		if ((LA(1)==LT) && (_tokenSet_6.member(LA(2))) && (_tokenSet_7.member(LA(3)))) {
			lt = LT(1);
			match(LT);
			params=typelst();
			gt = LT(1);
			match(GT);
		}
		else if ((_tokenSet_8.member(LA(1))) && (_tokenSet_9.member(LA(2))) && (_tokenSet_10.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new Basictype(name, createTokenInfo(lt), params, createTokenInfo(gt));
		return retVal;
	}
	
	public final Functype  functype() throws RecognitionException, TokenStreamException {
		 Functype retVal = null ;
		
		Token  lt = null;
		Token  minus_gt = null;
		Token  gt = null;
		
		Type left = null; Type right = null;
		lt = LT(1);
		match(LT);
		left=type();
		minus_gt = LT(1);
		match(MINUS_GT);
		right=type();
		gt = LT(1);
		match(GT);
		retVal = new Functype(createTokenInfo(lt), left, createTokenInfo(minus_gt), right, createTokenInfo(gt));
		return retVal;
	}
	
	public final Prodtype  prodtype() throws RecognitionException, TokenStreamException {
		 Prodtype retVal = null ;
		
		Token  lsquare = null;
		Token  rsquare = null;
		
		Typelst typelst = null;
		lsquare = LT(1);
		match(LSQUARE);
		typelst=typelst();
		rsquare = LT(1);
		match(RSQUARE);
		retVal = new Prodtype(createTokenInfo(lsquare), typelst, createTokenInfo(rsquare));
		return retVal;
	}
	
	public final VoidType  voidType() throws RecognitionException, TokenStreamException {
		 VoidType retVal = null ;
		
		Token  Void_KW = null;
		
		Void_KW = LT(1);
		match(LITERAL_Void);
		retVal = new VoidType(createTokenInfo(Void_KW));
		return retVal;
	}
	
	public final AnnotableClassMemberDecl  annotableClassMemberDecl() throws RecognitionException, TokenStreamException {
		 AnnotableClassMemberDecl retVal = null ;
		
		
		Annotations annotations = null; ClassMemberDecl classMemberDecl = null;
		annotations=annotations();
		classMemberDecl=classMemberDecl();
		retVal = new AnnotableClassMemberDecl(annotations, classMemberDecl);
		return retVal;
	}
	
	public final ClassMemberDecl  classMemberDecl() throws RecognitionException, TokenStreamException {
		 ClassMemberDecl retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LITERAL_inv:
		{
			retVal=invariant();
			break;
		}
		case LITERAL_operation:
		case LITERAL_method:
		{
			retVal=operation();
			break;
		}
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		{
			retVal=property();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Invariant  invariant() throws RecognitionException, TokenStreamException {
		 Invariant retVal = null ;
		
		Token  inv_KW = null;
		Token  name = null;
		Token  is_KW = null;
		
		FExpression body = null;
		inv_KW = LT(1);
		match(LITERAL_inv);
		name = LT(1);
		match(ID);
		is_KW = LT(1);
		match(LITERAL_is);
		body=fExpression();
		retVal = new Invariant(createTokenInfo(inv_KW), createTokenInfo(name), createTokenInfo(is_KW), body);
		return retVal;
	}
	
	public final Operation  operation() throws RecognitionException, TokenStreamException {
		 Operation retVal = null ;
		
		Token  name = null;
		Token  lt = null;
		Token  gt = null;
		Token  lparen = null;
		Token  rparen = null;
		Token  colon = null;
		Token  from_KW = null;
		Token  raises_KW = null;
		Token  is_KW = null;
		
		OperationKind operationKind = null; TypeVarDecllst typeVarDecllst = null; Params params = null; TypeRef typeRef = null; QualifiedID superSelection = null; Typelst exceptions = null; Assertions assertions = null; OperationBody operationBody = null;
		operationKind=operationKind();
		name = LT(1);
		match(ID);
		{
		switch ( LA(1)) {
		case LT:
		{
			lt = LT(1);
			match(LT);
			typeVarDecllst=typeVarDecllst();
			gt = LT(1);
			match(GT);
			break;
		}
		case LPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		lparen = LT(1);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case ID:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		{
			params=params();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rparen = LT(1);
		match(RPAREN);
		{
		switch ( LA(1)) {
		case COLON:
		{
			colon = LT(1);
			match(COLON);
			typeRef=typeRef();
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LITERAL_is:
		case LITERAL_from:
		case LITERAL_raises:
		case LITERAL_pre:
		case LITERAL_post:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_from:
		{
			from_KW = LT(1);
			match(LITERAL_from);
			superSelection=qualifiedID();
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LITERAL_is:
		case LITERAL_raises:
		case LITERAL_pre:
		case LITERAL_post:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_raises:
		{
			raises_KW = LT(1);
			match(LITERAL_raises);
			exceptions=typelst();
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LITERAL_is:
		case LITERAL_pre:
		case LITERAL_post:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		assertions=assertions();
		is_KW = LT(1);
		match(LITERAL_is);
		operationBody=operationBody();
		retVal = new Operation(operationKind, createTokenInfo(name), createTokenInfo(lt), typeVarDecllst, createTokenInfo(gt), createTokenInfo(lparen), params, createTokenInfo(rparen), createTokenInfo(colon), typeRef, createTokenInfo(from_KW), superSelection, createTokenInfo(raises_KW), exceptions, assertions, createTokenInfo(is_KW), operationBody);
		return retVal;
	}
	
	public final Property  property() throws RecognitionException, TokenStreamException {
		 Property retVal = null ;
		
		Token  name = null;
		Token  colon = null;
		Token  hash = null;
		Token  oppositeName = null;
		
		PropertyKind propertyKind = null; ReadOnlyModifier readOnlyModifier = null; TypeRef typeRef = null; GetterBody getterBody = null; SetterBody setterBody = null;
		propertyKind=propertyKind();
		{
		switch ( LA(1)) {
		case LITERAL_readonly:
		{
			readOnlyModifier=readOnlyModifier();
			break;
		}
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		name = LT(1);
		match(ID);
		colon = LT(1);
		match(COLON);
		typeRef=typeRef();
		{
		switch ( LA(1)) {
		case HASH:
		{
			hash = LT(1);
			match(HASH);
			oppositeName = LT(1);
			match(ID);
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case RCURLY:
		case LITERAL_inv:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_getter:
		case LITERAL_setter:
		case LITERAL_operation:
		case LITERAL_method:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_getter:
		{
			getterBody=getterBody();
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case RCURLY:
		case LITERAL_inv:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_setter:
		case LITERAL_operation:
		case LITERAL_method:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_setter:
		{
			setterBody=setterBody();
			break;
		}
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case RCURLY:
		case LITERAL_inv:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_operation:
		case LITERAL_method:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new Property(propertyKind, readOnlyModifier, createTokenInfo(name), createTokenInfo(colon), typeRef, createTokenInfo(hash), createTokenInfo(oppositeName), getterBody, setterBody);
		return retVal;
	}
	
	public final FExpression  fExpression() throws RecognitionException, TokenStreamException {
		 FExpression retVal = null ;
		
		
		{
		retVal=fAssignement();
		}
		return retVal;
	}
	
	public final PropertyKind  propertyKind() throws RecognitionException, TokenStreamException {
		 PropertyKind retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_attribute:
		{
			match(LITERAL_attribute);
			break;
		}
		case LITERAL_reference:
		{
			match(LITERAL_reference);
			break;
		}
		case LITERAL_property:
		{
			match(LITERAL_property);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new PropertyKind(createTokenInfo(tok));
		return retVal;
	}
	
	public final ReadOnlyModifier  readOnlyModifier() throws RecognitionException, TokenStreamException {
		 ReadOnlyModifier retVal = null ;
		
		Token tok = LT(1);
		
		{
		match(LITERAL_readonly);
		}
		retVal = new ReadOnlyModifier(createTokenInfo(tok));
		return retVal;
	}
	
	public final TypeRef  typeRef() throws RecognitionException, TokenStreamException {
		 TypeRef retVal = null ;
		
		
		CollectionType collectionType = null; Type reftype = null; Multiplicity multiplicity = null;
		{
		switch ( LA(1)) {
		case LITERAL_bag:
		case LITERAL_set:
		case LITERAL_seq:
		case LITERAL_oset:
		{
			collectionType=collectionType();
			break;
		}
		case ID:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		reftype=type();
		{
		if ((LA(1)==LSQUARE) && (_tokenSet_11.member(LA(2))) && (_tokenSet_12.member(LA(3)))) {
			multiplicity=multiplicity();
		}
		else if ((_tokenSet_13.member(LA(1))) && (_tokenSet_14.member(LA(2))) && (_tokenSet_15.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new TypeRef(collectionType, reftype, multiplicity);
		return retVal;
	}
	
	public final GetterBody  getterBody() throws RecognitionException, TokenStreamException {
		 GetterBody retVal = null ;
		
		Token  getter_KW = null;
		Token  is_KW = null;
		
		FExpression getterbody = null;
		getter_KW = LT(1);
		match(LITERAL_getter);
		is_KW = LT(1);
		match(LITERAL_is);
		getterbody=fExpression();
		retVal = new GetterBody(createTokenInfo(getter_KW), createTokenInfo(is_KW), getterbody);
		return retVal;
	}
	
	public final SetterBody  setterBody() throws RecognitionException, TokenStreamException {
		 SetterBody retVal = null ;
		
		Token  setter_KW = null;
		Token  is_KW = null;
		
		FExpression setterbody = null;
		setter_KW = LT(1);
		match(LITERAL_setter);
		is_KW = LT(1);
		match(LITERAL_is);
		setterbody=fExpression();
		retVal = new SetterBody(createTokenInfo(setter_KW), createTokenInfo(is_KW), setterbody);
		return retVal;
	}
	
	public final OperationKind  operationKind() throws RecognitionException, TokenStreamException {
		 OperationKind retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_operation:
		{
			match(LITERAL_operation);
			break;
		}
		case LITERAL_method:
		{
			match(LITERAL_method);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new OperationKind(createTokenInfo(tok));
		return retVal;
	}
	
	public final Params  params() throws RecognitionException, TokenStreamException {
		 Params retVal = new Params() ;
		
		Token  comma = null;
		
		Param p1 = null; Param pn = null;
		p1=param();
		retVal.addChild(p1);
		{
		_loop428:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				pn=param();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn);
			}
			else {
				break _loop428;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final Assertions  assertions() throws RecognitionException, TokenStreamException {
		 Assertions retVal = new Assertions() ;
		
		
		Annotableassertion annotableassertion = null;
		{
		_loop416:
		do {
			if ((_tokenSet_16.member(LA(1)))) {
				annotableassertion=annotableassertion();
				retVal.addChild(annotableassertion);
			}
			else {
				break _loop416;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final OperationBody  operationBody() throws RecognitionException, TokenStreamException {
		 OperationBody retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LITERAL_abstract:
		{
			retVal=operationEmptyBody();
			break;
		}
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_from:
		case INT_LITERAL:
		case MINUS:
		case LITERAL_not:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_function:
		case LITERAL_if:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			retVal=operationExpressionBody();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Annotableassertion  annotableassertion() throws RecognitionException, TokenStreamException {
		 Annotableassertion retVal = null ;
		
		
		Annotations annotations = null; Assertion assertion = null;
		annotations=annotations();
		assertion=assertion();
		retVal = new Annotableassertion(annotations, assertion);
		return retVal;
	}
	
	public final Assertion  assertion() throws RecognitionException, TokenStreamException {
		 Assertion retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LITERAL_pre:
		{
			retVal=precondition();
			break;
		}
		case LITERAL_post:
		{
			retVal=postcondition();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Precondition  precondition() throws RecognitionException, TokenStreamException {
		 Precondition retVal = null ;
		
		Token  pre_KW = null;
		Token  name = null;
		Token  is_KW = null;
		
		FExpression body = null;
		pre_KW = LT(1);
		match(LITERAL_pre);
		name = LT(1);
		match(ID);
		is_KW = LT(1);
		match(LITERAL_is);
		body=fExpression();
		retVal = new Precondition(createTokenInfo(pre_KW), createTokenInfo(name), createTokenInfo(is_KW), body);
		return retVal;
	}
	
	public final Postcondition  postcondition() throws RecognitionException, TokenStreamException {
		 Postcondition retVal = null ;
		
		Token  post_KW = null;
		Token  name = null;
		Token  is_KW = null;
		
		FExpression body = null;
		post_KW = LT(1);
		match(LITERAL_post);
		name = LT(1);
		match(ID);
		is_KW = LT(1);
		match(LITERAL_is);
		body=fExpression();
		retVal = new Postcondition(createTokenInfo(post_KW), createTokenInfo(name), createTokenInfo(is_KW), body);
		return retVal;
	}
	
	public final OperationEmptyBody  operationEmptyBody() throws RecognitionException, TokenStreamException {
		 OperationEmptyBody retVal = null ;
		
		Token  abstract_KW = null;
		
		abstract_KW = LT(1);
		match(LITERAL_abstract);
		retVal = new OperationEmptyBody(createTokenInfo(abstract_KW));
		return retVal;
	}
	
	public final OperationExpressionBody  operationExpressionBody() throws RecognitionException, TokenStreamException {
		 OperationExpressionBody retVal = null ;
		
		
		Annotations bodyAnnotations = null; FExpression fExpression = null;
		bodyAnnotations=annotations();
		fExpression=fExpression();
		retVal = new OperationExpressionBody(bodyAnnotations, fExpression);
		return retVal;
	}
	
	public final Param  param() throws RecognitionException, TokenStreamException {
		 Param retVal = null ;
		
		Token  name = null;
		Token  colon = null;
		
		Annotations annotations = null; TypeRef typeRef = null;
		annotations=annotations();
		name = LT(1);
		match(ID);
		colon = LT(1);
		match(COLON);
		typeRef=typeRef();
		retVal = new Param(annotations, createTokenInfo(name), createTokenInfo(colon), typeRef);
		return retVal;
	}
	
	public final CollectionType  collectionType() throws RecognitionException, TokenStreamException {
		 CollectionType retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_bag:
		{
			match(LITERAL_bag);
			break;
		}
		case LITERAL_set:
		{
			match(LITERAL_set);
			break;
		}
		case LITERAL_seq:
		{
			match(LITERAL_seq);
			break;
		}
		case LITERAL_oset:
		{
			match(LITERAL_oset);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new CollectionType(createTokenInfo(tok));
		return retVal;
	}
	
	public final Multiplicity  multiplicity() throws RecognitionException, TokenStreamException {
		 Multiplicity retVal = null ;
		
		Token  lsquare = null;
		Token  rsquare = null;
		
		MultiplicityExpr multiplicityExpr = null;
		lsquare = LT(1);
		match(LSQUARE);
		{
		switch ( LA(1)) {
		case STAR:
		case PLUS:
		case QMARK:
		case INT_LITERAL:
		{
			multiplicityExpr=multiplicityExpr();
			break;
		}
		case RSQUARE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rsquare = LT(1);
		match(RSQUARE);
		retVal = new Multiplicity(createTokenInfo(lsquare), multiplicityExpr, createTokenInfo(rsquare));
		return retVal;
	}
	
	public final MultiplicityExpr  multiplicityExpr() throws RecognitionException, TokenStreamException {
		 MultiplicityExpr retVal = null ;
		
		Token  dot_dot = null;
		
		SimpleMultiplicityExpr lowerBound = null; SimpleMultiplicityExpr upperBound = null;
		lowerBound=simpleMultiplicityExpr();
		{
		switch ( LA(1)) {
		case DOT_DOT:
		{
			dot_dot = LT(1);
			match(DOT_DOT);
			upperBound=simpleMultiplicityExpr();
			break;
		}
		case RSQUARE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new MultiplicityExpr(lowerBound, createTokenInfo(dot_dot), upperBound);
		return retVal;
	}
	
	public final SimpleMultiplicityExpr  simpleMultiplicityExpr() throws RecognitionException, TokenStreamException {
		 SimpleMultiplicityExpr retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case STAR:
		{
			match(STAR);
			break;
		}
		case PLUS:
		{
			match(PLUS);
			break;
		}
		case QMARK:
		{
			match(QMARK);
			break;
		}
		case INT_LITERAL:
		{
			match(INT_LITERAL);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new SimpleMultiplicityExpr(createTokenInfo(tok));
		return retVal;
	}
	
	public final EnumLiterals  enumLiterals() throws RecognitionException, TokenStreamException {
		 EnumLiterals retVal = new EnumLiterals() ;
		
		
		EnumLiteral enumLiteral = null;
		{
		_loop445:
		do {
			if ((LA(1)==ID||LA(1)==AT||LA(1)==CONTEXT_MULTI_LINE_COMMENT)) {
				enumLiteral=enumLiteral();
				retVal.addChild(enumLiteral);
			}
			else {
				break _loop445;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final EnumLiteral  enumLiteral() throws RecognitionException, TokenStreamException {
		 EnumLiteral retVal = null ;
		
		Token  name = null;
		Token  semi = null;
		
		Annotations annotations = null;
		annotations=annotations();
		name = LT(1);
		match(ID);
		semi = LT(1);
		match(SEMI);
		retVal = new EnumLiteral(annotations, createTokenInfo(name), createTokenInfo(semi));
		return retVal;
	}
	
	public final FExpressionLst  fExpressionLst() throws RecognitionException, TokenStreamException {
		 FExpressionLst retVal = new FExpressionLst() ;
		
		
		FExpression fExpression = null;
		{
		_loop449:
		do {
			if ((_tokenSet_17.member(LA(1)))) {
				fExpression=fExpression();
				retVal.addChild(fExpression);
			}
			else {
				break _loop449;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final AsingleExpression  asingleExpression() throws RecognitionException, TokenStreamException {
		 AsingleExpression retVal = null ;
		
		
		FExpression fExpression = null;
		fExpression=fExpression();
		retVal = new AsingleExpression(fExpression);
		return retVal;
	}
	
	public final FAssignement  fAssignement() throws RecognitionException, TokenStreamException {
		 FAssignement retVal = null ;
		
		Token  equals = null;
		
		Annotations annotations = null; LogicalExpression expression = null; AssignementOp assignementOp = null; LogicalExpression newvalue = null;
		annotations=annotations();
		expression=logicalExpression();
		{
		if ((LA(1)==COLON||LA(1)==QMARK) && (LA(2)==EQUALS) && (_tokenSet_18.member(LA(3)))) {
			assignementOp=assignementOp();
			equals = LT(1);
			match(EQUALS);
			newvalue=logicalExpression();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new FAssignement(annotations, expression, assignementOp, createTokenInfo(equals), newvalue);
		return retVal;
	}
	
	public final LogicalExpression  logicalExpression() throws RecognitionException, TokenStreamException {
		 LogicalExpression retVal = new LogicalExpression() ;
		
		
		RelationalExpression exp1 = null; LogicalOp logicalOp = null; RelationalExpression expn = null;
		exp1=relationalExpression();
		retVal.addChild(exp1);
		{
		_loop459:
		do {
			if ((LA(1)==LITERAL_and||LA(1)==LITERAL_or) && (_tokenSet_18.member(LA(2))) && (_tokenSet_22.member(LA(3)))) {
				logicalOp=logicalOp();
				expn=relationalExpression();
				retVal.addChild(logicalOp); retVal.addChild(expn);
			}
			else {
				break _loop459;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final AssignementOp  assignementOp() throws RecognitionException, TokenStreamException {
		 AssignementOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case COLON:
		{
			match(COLON);
			break;
		}
		case QMARK:
		{
			match(QMARK);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new AssignementOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final RelationalExpression  relationalExpression() throws RecognitionException, TokenStreamException {
		 RelationalExpression retVal = null ;
		
		
		AdditiveExpression left = null; RelationalOp relationalOp = null; AdditiveExpression right = null;
		left=additiveExpression();
		{
		if ((_tokenSet_23.member(LA(1))) && (_tokenSet_18.member(LA(2))) && (_tokenSet_22.member(LA(3)))) {
			relationalOp=relationalOp();
			right=additiveExpression();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new RelationalExpression(left, relationalOp, right);
		return retVal;
	}
	
	public final LogicalOp  logicalOp() throws RecognitionException, TokenStreamException {
		 LogicalOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_and:
		{
			match(LITERAL_and);
			break;
		}
		case LITERAL_or:
		{
			match(LITERAL_or);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new LogicalOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final AdditiveExpression  additiveExpression() throws RecognitionException, TokenStreamException {
		 AdditiveExpression retVal = new AdditiveExpression() ;
		
		
		MultiplicativeExpression exp1 = null; AdditiveOp additiveOp = null; MultiplicativeExpression expn = null;
		exp1=multiplicativeExpression();
		retVal.addChild(exp1);
		{
		_loop468:
		do {
			if ((LA(1)==PLUS||LA(1)==MINUS) && (_tokenSet_18.member(LA(2))) && (_tokenSet_22.member(LA(3)))) {
				additiveOp=additiveOp();
				expn=multiplicativeExpression();
				retVal.addChild(additiveOp); retVal.addChild(expn);
			}
			else {
				break _loop468;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final RelationalOp  relationalOp() throws RecognitionException, TokenStreamException {
		 RelationalOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case EQEQ:
		{
			match(EQEQ);
			break;
		}
		case NEQ:
		{
			match(NEQ);
			break;
		}
		case GT:
		{
			match(GT);
			break;
		}
		case LT:
		{
			match(LT);
			break;
		}
		case GTE:
		{
			match(GTE);
			break;
		}
		case LTE:
		{
			match(LTE);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new RelationalOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final MultiplicativeExpression  multiplicativeExpression() throws RecognitionException, TokenStreamException {
		 MultiplicativeExpression retVal = new MultiplicativeExpression() ;
		
		
		UnaryExpression exp1 = null; MultiplicativeOp multiplicativeOp = null; UnaryExpression expn = null;
		exp1=unaryExpression();
		retVal.addChild(exp1);
		{
		_loop473:
		do {
			if ((LA(1)==STAR||LA(1)==DIV) && (_tokenSet_18.member(LA(2))) && (_tokenSet_22.member(LA(3)))) {
				multiplicativeOp=multiplicativeOp();
				expn=unaryExpression();
				retVal.addChild(multiplicativeOp); retVal.addChild(expn);
			}
			else {
				break _loop473;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final AdditiveOp  additiveOp() throws RecognitionException, TokenStreamException {
		 AdditiveOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case PLUS:
		{
			match(PLUS);
			break;
		}
		case MINUS:
		{
			match(MINUS);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new AdditiveOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final UnaryExpression  unaryExpression() throws RecognitionException, TokenStreamException {
		 UnaryExpression retVal = null ;
		
		
		UnaryOp unaryOp = null; PostfixExp postfixExp = null;
		{
		switch ( LA(1)) {
		case MINUS:
		case LITERAL_not:
		{
			unaryOp=unaryOp();
			break;
		}
		case ID:
		case STRING_LITERAL:
		case LPAREN:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_from:
		case INT_LITERAL:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_function:
		case LITERAL_if:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		postfixExp=postfixExp();
		retVal = new UnaryExpression(unaryOp, postfixExp);
		return retVal;
	}
	
	public final MultiplicativeOp  multiplicativeOp() throws RecognitionException, TokenStreamException {
		 MultiplicativeOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case STAR:
		{
			match(STAR);
			break;
		}
		case DIV:
		{
			match(DIV);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new MultiplicativeOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final UnaryOp  unaryOp() throws RecognitionException, TokenStreamException {
		 UnaryOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_not:
		{
			match(LITERAL_not);
			break;
		}
		case MINUS:
		{
			match(MINUS);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new UnaryOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final PostfixExp  postfixExp() throws RecognitionException, TokenStreamException {
		 PostfixExp retVal = null ;
		
		
		PrimitiveExpression target = null; Postfixlst postfixlst = null;
		target=primitiveExpression();
		postfixlst=postfixlst();
		retVal = new PostfixExp(target, postfixlst);
		return retVal;
	}
	
	public final PrimitiveExpression  primitiveExpression() throws RecognitionException, TokenStreamException {
		 PrimitiveExpression retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case ID:
		case STRING_LITERAL:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		case INT_LITERAL:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			retVal=fLiteral();
			break;
		}
		case LPAREN:
		{
			retVal=parentExp();
			break;
		}
		case LITERAL_self:
		{
			retVal=fSelfCall();
			break;
		}
		case LITERAL_super:
		{
			retVal=fSuperCall();
			break;
		}
		case LITERAL_result:
		{
			retVal=resultCall();
			break;
		}
		case LITERAL_extern:
		{
			retVal=fJavaStaticCall();
			break;
		}
		case LITERAL_do:
		{
			retVal=fBlock();
			break;
		}
		case LITERAL_if:
		{
			retVal=fConditional();
			break;
		}
		case LITERAL_raise:
		{
			retVal=fRaiseException();
			break;
		}
		case LITERAL_var:
		{
			retVal=fVariableDecl();
			break;
		}
		case LITERAL_function:
		{
			retVal=fLambdaExpression();
			break;
		}
		case LITERAL_from:
		{
			retVal=fLoop();
			break;
		}
		case LITERAL_value:
		{
			retVal=valueCall();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Postfixlst  postfixlst() throws RecognitionException, TokenStreamException {
		 Postfixlst retVal = null ;
		
		
		Postfix postfix = null;
		{
		if ((LA(1)==LPAREN||LA(1)==LCURLY||LA(1)==DOT) && (_tokenSet_24.member(LA(2))) && (_tokenSet_25.member(LA(3)))) {
			postfix=postfix();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new Postfixlst(postfix);
		return retVal;
	}
	
	public final Postfix  postfix() throws RecognitionException, TokenStreamException {
		 Postfix retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case LCURLY:
		case DOT:
		{
			retVal=call();
			break;
		}
		case LPAREN:
		{
			retVal=paramPostfix();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final Call  call() throws RecognitionException, TokenStreamException {
		 Call retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case DOT:
		{
			retVal=callPostfix();
			break;
		}
		case LCURLY:
		{
			retVal=lambdaPostfix();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final ParamPostfix  paramPostfix() throws RecognitionException, TokenStreamException {
		 ParamPostfix retVal = null ;
		
		Token  lparen = null;
		Token  rparen = null;
		
		ActualParameterList parameters = null; Call call = null;
		lparen = LT(1);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_from:
		case INT_LITERAL:
		case MINUS:
		case LITERAL_not:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_function:
		case LITERAL_if:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			parameters=actualParameterList();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rparen = LT(1);
		match(RPAREN);
		{
		if ((LA(1)==LCURLY||LA(1)==DOT) && (LA(2)==ID) && (_tokenSet_26.member(LA(3)))) {
			call=call();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new ParamPostfix(createTokenInfo(lparen), parameters, createTokenInfo(rparen), call);
		return retVal;
	}
	
	public final CallPostfix  callPostfix() throws RecognitionException, TokenStreamException {
		 CallPostfix retVal = null ;
		
		Token  dot = null;
		Token  name = null;
		
		AtpreOp atp = null; Postfix postfix = null;
		dot = LT(1);
		match(DOT);
		name = LT(1);
		match(ID);
		{
		switch ( LA(1)) {
		case ATPRE:
		{
			atp=atpreOp();
			break;
		}
		case EOF:
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case RPAREN:
		case COMMA:
		case LCURLY:
		case RCURLY:
		case LT:
		case GT:
		case COLON:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_inv:
		case LITERAL_is:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_setter:
		case LITERAL_from:
		case LITERAL_operation:
		case LITERAL_method:
		case LITERAL_pre:
		case LITERAL_post:
		case STAR:
		case PLUS:
		case QMARK:
		case INT_LITERAL:
		case LITERAL_and:
		case LITERAL_or:
		case EQEQ:
		case NEQ:
		case GTE:
		case LTE:
		case MINUS:
		case DIV:
		case LITERAL_not:
		case DOT:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_end:
		case LITERAL_function:
		case LITERAL_rescue:
		case LITERAL_until:
		case LITERAL_loop:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		if ((LA(1)==LPAREN||LA(1)==LCURLY||LA(1)==DOT) && (_tokenSet_24.member(LA(2))) && (_tokenSet_25.member(LA(3)))) {
			postfix=postfix();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new CallPostfix(createTokenInfo(dot), createTokenInfo(name), atp, postfix);
		return retVal;
	}
	
	public final LambdaPostfix  lambdaPostfix() throws RecognitionException, TokenStreamException {
		 LambdaPostfix retVal = null ;
		
		Token  lcurly = null;
		Token  pipe = null;
		Token  rcurly = null;
		
		LambdaPostfixParamLst params = null; FExpressionLst expression = null; Call call = null;
		lcurly = LT(1);
		match(LCURLY);
		params=lambdaPostfixParamLst();
		pipe = LT(1);
		match(PIPE);
		expression=fExpressionLst();
		rcurly = LT(1);
		match(RCURLY);
		{
		if ((LA(1)==LCURLY||LA(1)==DOT) && (LA(2)==ID) && (_tokenSet_26.member(LA(3)))) {
			call=call();
		}
		else if ((_tokenSet_19.member(LA(1))) && (_tokenSet_20.member(LA(2))) && (_tokenSet_21.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		retVal = new LambdaPostfix(createTokenInfo(lcurly), params, createTokenInfo(pipe), expression, createTokenInfo(rcurly), call);
		return retVal;
	}
	
	public final AtpreOp  atpreOp() throws RecognitionException, TokenStreamException {
		 AtpreOp retVal = null ;
		
		Token tok = LT(1);
		
		{
		match(ATPRE);
		}
		retVal = new AtpreOp(createTokenInfo(tok));
		return retVal;
	}
	
	public final ActualParameterList  actualParameterList() throws RecognitionException, TokenStreamException {
		 ActualParameterList retVal = new ActualParameterList() ;
		
		Token  comma = null;
		
		ActualParameter p1 = null; ActualParameter pn = null;
		p1=actualParameter();
		retVal.addChild(p1);
		{
		_loop495:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				pn=actualParameter();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn);
			}
			else {
				break _loop495;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final ActualParameter  actualParameter() throws RecognitionException, TokenStreamException {
		 ActualParameter retVal = null ;
		
		
		FExpression expression = null;
		expression=fExpression();
		retVal = new ActualParameter(expression);
		return retVal;
	}
	
	public final LambdaPostfixParamLst  lambdaPostfixParamLst() throws RecognitionException, TokenStreamException {
		 LambdaPostfixParamLst retVal = new LambdaPostfixParamLst() ;
		
		Token  comma = null;
		
		LambdaPostfixParam p1 = null; LambdaPostfixParam pn = null;
		p1=lambdaPostfixParam();
		retVal.addChild(p1);
		{
		_loop501:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				pn=lambdaPostfixParam();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn);
			}
			else {
				break _loop501;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final LambdaPostfixParam  lambdaPostfixParam() throws RecognitionException, TokenStreamException {
		 LambdaPostfixParam retVal = null ;
		
		Token  name = null;
		
		name = LT(1);
		match(ID);
		retVal = new LambdaPostfixParam(createTokenInfo(name));
		return retVal;
	}
	
	public final FLiteral  fLiteral() throws RecognitionException, TokenStreamException {
		 FLiteral retVal = null ;
		
		
		{
		switch ( LA(1)) {
		case STRING_LITERAL:
		{
			retVal=fStringLiteral();
			break;
		}
		case LITERAL_true:
		case LITERAL_false:
		{
			retVal=fBooleanLiteral();
			break;
		}
		case INT_LITERAL:
		{
			retVal=fIntegerLiteral();
			break;
		}
		case LITERAL_void:
		{
			retVal=fVoidLiteral();
			break;
		}
		case ID:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		{
			retVal=fTypeOrVarLiteral();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return retVal;
	}
	
	public final ParentExp  parentExp() throws RecognitionException, TokenStreamException {
		 ParentExp retVal = null ;
		
		Token  lparen = null;
		Token  rparen = null;
		
		FExpression fExpression = null;
		lparen = LT(1);
		match(LPAREN);
		fExpression=fExpression();
		rparen = LT(1);
		match(RPAREN);
		retVal = new ParentExp(createTokenInfo(lparen), fExpression, createTokenInfo(rparen));
		return retVal;
	}
	
	public final FSelfCall  fSelfCall() throws RecognitionException, TokenStreamException {
		 FSelfCall retVal = null ;
		
		Token  self_KW = null;
		
		self_KW = LT(1);
		match(LITERAL_self);
		retVal = new FSelfCall(createTokenInfo(self_KW));
		return retVal;
	}
	
	public final FSuperCall  fSuperCall() throws RecognitionException, TokenStreamException {
		 FSuperCall retVal = null ;
		
		Token  super_KW = null;
		
		super_KW = LT(1);
		match(LITERAL_super);
		retVal = new FSuperCall(createTokenInfo(super_KW));
		return retVal;
	}
	
	public final ResultCall  resultCall() throws RecognitionException, TokenStreamException {
		 ResultCall retVal = null ;
		
		Token  result_KW = null;
		
		result_KW = LT(1);
		match(LITERAL_result);
		retVal = new ResultCall(createTokenInfo(result_KW));
		return retVal;
	}
	
	public final FJavaStaticCall  fJavaStaticCall() throws RecognitionException, TokenStreamException {
		 FJavaStaticCall retVal = null ;
		
		Token  extern_KW = null;
		Token  dot = null;
		Token  mname = null;
		Token  lparen = null;
		Token  rparen = null;
		
		QualifiedID cname = null; ActualParameterList parameters = null;
		extern_KW = LT(1);
		match(LITERAL_extern);
		cname=qualifiedID();
		dot = LT(1);
		match(DOT);
		mname = LT(1);
		match(ID);
		lparen = LT(1);
		match(LPAREN);
		{
		switch ( LA(1)) {
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case LT:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_from:
		case INT_LITERAL:
		case MINUS:
		case LITERAL_not:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_function:
		case LITERAL_if:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			parameters=actualParameterList();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rparen = LT(1);
		match(RPAREN);
		retVal = new FJavaStaticCall(createTokenInfo(extern_KW), cname, createTokenInfo(dot), createTokenInfo(mname), createTokenInfo(lparen), parameters, createTokenInfo(rparen));
		return retVal;
	}
	
	public final FBlock  fBlock() throws RecognitionException, TokenStreamException {
		 FBlock retVal = null ;
		
		Token  do_KW = null;
		Token  end_KW = null;
		
		Annotations annotations = null; FExpressionLst fExpressionLst = null; FRescueLst fRescueLst = null;
		do_KW = LT(1);
		match(LITERAL_do);
		annotations=annotations();
		fExpressionLst=fExpressionLst();
		fRescueLst=fRescueLst();
		end_KW = LT(1);
		match(LITERAL_end);
		retVal = new FBlock(createTokenInfo(do_KW), annotations, fExpressionLst, fRescueLst, createTokenInfo(end_KW));
		return retVal;
	}
	
	public final FConditional  fConditional() throws RecognitionException, TokenStreamException {
		 FConditional retVal = null ;
		
		Token  if_KW = null;
		Token  then_KW = null;
		Token  else_KW = null;
		Token  end_KW = null;
		
		FExpression condition = null; FExpressionLst ifblock = null; FExpressionLst elseblock = null;
		if_KW = LT(1);
		match(LITERAL_if);
		condition=fExpression();
		then_KW = LT(1);
		match(LITERAL_then);
		ifblock=fExpressionLst();
		{
		switch ( LA(1)) {
		case LITERAL_else:
		{
			else_KW = LT(1);
			match(LITERAL_else);
			elseblock=fExpressionLst();
			break;
		}
		case LITERAL_end:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		end_KW = LT(1);
		match(LITERAL_end);
		retVal = new FConditional(createTokenInfo(if_KW), condition, createTokenInfo(then_KW), ifblock, createTokenInfo(else_KW), elseblock, createTokenInfo(end_KW));
		return retVal;
	}
	
	public final FRaiseException  fRaiseException() throws RecognitionException, TokenStreamException {
		 FRaiseException retVal = null ;
		
		Token  raise_KW = null;
		
		FExpression fExpression = null;
		raise_KW = LT(1);
		match(LITERAL_raise);
		fExpression=fExpression();
		retVal = new FRaiseException(createTokenInfo(raise_KW), fExpression);
		return retVal;
	}
	
	public final FVariableDecl  fVariableDecl() throws RecognitionException, TokenStreamException {
		 FVariableDecl retVal = null ;
		
		Token  var_KW = null;
		Token  name = null;
		Token  colon = null;
		Token  init_KW = null;
		
		TypeRef typeRef = null; FExpression init = null;
		var_KW = LT(1);
		match(LITERAL_var);
		name = LT(1);
		match(ID);
		colon = LT(1);
		match(COLON);
		typeRef=typeRef();
		{
		switch ( LA(1)) {
		case LITERAL_init:
		{
			init_KW = LT(1);
			match(LITERAL_init);
			init=fExpression();
			break;
		}
		case EOF:
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case RPAREN:
		case COMMA:
		case LCURLY:
		case RCURLY:
		case LT:
		case GT:
		case COLON:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_inv:
		case LITERAL_is:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_setter:
		case LITERAL_from:
		case LITERAL_operation:
		case LITERAL_method:
		case LITERAL_pre:
		case LITERAL_post:
		case STAR:
		case PLUS:
		case QMARK:
		case INT_LITERAL:
		case LITERAL_and:
		case LITERAL_or:
		case EQEQ:
		case NEQ:
		case GTE:
		case LTE:
		case MINUS:
		case DIV:
		case LITERAL_not:
		case DOT:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_end:
		case LITERAL_function:
		case LITERAL_rescue:
		case LITERAL_until:
		case LITERAL_loop:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new FVariableDecl(createTokenInfo(var_KW), createTokenInfo(name), createTokenInfo(colon), typeRef, createTokenInfo(init_KW), init);
		return retVal;
	}
	
	public final FLambdaExpression  fLambdaExpression() throws RecognitionException, TokenStreamException {
		 FLambdaExpression retVal = null ;
		
		Token  function_KW = null;
		Token  lcurly = null;
		Token  pipe = null;
		Token  rcurly = null;
		
		FLambdaparamlst params = null; FExpressionLst expression = null;
		function_KW = LT(1);
		match(LITERAL_function);
		lcurly = LT(1);
		match(LCURLY);
		params=fLambdaparamlst();
		pipe = LT(1);
		match(PIPE);
		expression=fExpressionLst();
		rcurly = LT(1);
		match(RCURLY);
		retVal = new FLambdaExpression(createTokenInfo(function_KW), createTokenInfo(lcurly), params, createTokenInfo(pipe), expression, createTokenInfo(rcurly));
		return retVal;
	}
	
	public final FLoop  fLoop() throws RecognitionException, TokenStreamException {
		 FLoop retVal = null ;
		
		Token  from_KW = null;
		Token  until_KW = null;
		Token  loop_KW = null;
		Token  end_KW = null;
		
		FExpression init = null; FExpression condition = null; FExpressionLst body = null;
		from_KW = LT(1);
		match(LITERAL_from);
		init=fExpression();
		until_KW = LT(1);
		match(LITERAL_until);
		condition=fExpression();
		loop_KW = LT(1);
		match(LITERAL_loop);
		body=fExpressionLst();
		end_KW = LT(1);
		match(LITERAL_end);
		retVal = new FLoop(createTokenInfo(from_KW), init, createTokenInfo(until_KW), condition, createTokenInfo(loop_KW), body, createTokenInfo(end_KW));
		return retVal;
	}
	
	public final ValueCall  valueCall() throws RecognitionException, TokenStreamException {
		 ValueCall retVal = null ;
		
		Token  value_KW = null;
		
		value_KW = LT(1);
		match(LITERAL_value);
		retVal = new ValueCall(createTokenInfo(value_KW));
		return retVal;
	}
	
	public final FRescueLst  fRescueLst() throws RecognitionException, TokenStreamException {
		 FRescueLst retVal = new FRescueLst() ;
		
		
		FRescue fRescue = null;
		{
		_loop518:
		do {
			if ((LA(1)==LITERAL_rescue)) {
				fRescue=fRescue();
				retVal.addChild(fRescue);
			}
			else {
				break _loop518;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final FLambdaparamlst  fLambdaparamlst() throws RecognitionException, TokenStreamException {
		 FLambdaparamlst retVal = new FLambdaparamlst() ;
		
		Token  comma = null;
		
		FLambdaparam p1 = null; FLambdaparam pn = null;
		p1=fLambdaparam();
		retVal.addChild(p1);
		{
		_loop514:
		do {
			if ((LA(1)==COMMA)) {
				comma = LT(1);
				match(COMMA);
				pn=fLambdaparam();
				retVal.addChild(createTokenInfo(comma)); retVal.addChild(pn);
			}
			else {
				break _loop514;
			}
			
		} while (true);
		}
		return retVal;
	}
	
	public final FLambdaparam  fLambdaparam() throws RecognitionException, TokenStreamException {
		 FLambdaparam retVal = null ;
		
		Token  name = null;
		Token  colon = null;
		
		TypeRef typeRef = null;
		name = LT(1);
		match(ID);
		colon = LT(1);
		match(COLON);
		typeRef=typeRef();
		retVal = new FLambdaparam(createTokenInfo(name), createTokenInfo(colon), typeRef);
		return retVal;
	}
	
	public final FRescue  fRescue() throws RecognitionException, TokenStreamException {
		 FRescue retVal = null ;
		
		Token  rescue_KW = null;
		Token  lparen = null;
		Token  varName = null;
		Token  colon = null;
		Token  rparen = null;
		
		TypeRef exTypeRef = null; FExpressionLst rescstmts = null;
		rescue_KW = LT(1);
		match(LITERAL_rescue);
		{
		if ((LA(1)==LPAREN) && (LA(2)==ID) && (LA(3)==COLON)) {
			lparen = LT(1);
			match(LPAREN);
			varName = LT(1);
			match(ID);
			colon = LT(1);
			match(COLON);
			exTypeRef=typeRef();
			rparen = LT(1);
			match(RPAREN);
		}
		else if ((_tokenSet_27.member(LA(1))) && (_tokenSet_28.member(LA(2))) && (_tokenSet_29.member(LA(3)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		rescstmts=fExpressionLst();
		retVal = new FRescue(createTokenInfo(rescue_KW), createTokenInfo(lparen), createTokenInfo(varName), createTokenInfo(colon), exTypeRef, createTokenInfo(rparen), rescstmts);
		return retVal;
	}
	
	public final FStringLiteral  fStringLiteral() throws RecognitionException, TokenStreamException {
		 FStringLiteral retVal = null ;
		
		Token  string_literal = null;
		
		string_literal = LT(1);
		match(STRING_LITERAL);
		retVal = new FStringLiteral(createTokenInfo(string_literal));
		return retVal;
	}
	
	public final FBooleanLiteral  fBooleanLiteral() throws RecognitionException, TokenStreamException {
		 FBooleanLiteral retVal = null ;
		
		
		TrueOrFalse trueOrFalse = null;
		trueOrFalse=trueOrFalse();
		retVal = new FBooleanLiteral(trueOrFalse);
		return retVal;
	}
	
	public final FIntegerLiteral  fIntegerLiteral() throws RecognitionException, TokenStreamException {
		 FIntegerLiteral retVal = null ;
		
		Token  int_literal = null;
		
		int_literal = LT(1);
		match(INT_LITERAL);
		retVal = new FIntegerLiteral(createTokenInfo(int_literal));
		return retVal;
	}
	
	public final FVoidLiteral  fVoidLiteral() throws RecognitionException, TokenStreamException {
		 FVoidLiteral retVal = null ;
		
		Token  void_KW = null;
		
		void_KW = LT(1);
		match(LITERAL_void);
		retVal = new FVoidLiteral(createTokenInfo(void_KW));
		return retVal;
	}
	
	public final FTypeOrVarLiteral  fTypeOrVarLiteral() throws RecognitionException, TokenStreamException {
		 FTypeOrVarLiteral retVal = null ;
		
		
		Type literal = null; AtpreOp atp = null;
		literal=type();
		{
		switch ( LA(1)) {
		case ATPRE:
		{
			atp=atpreOp();
			break;
		}
		case EOF:
		case ID:
		case STRING_LITERAL:
		case AT:
		case CONTEXT_MULTI_LINE_COMMENT:
		case LPAREN:
		case RPAREN:
		case COMMA:
		case LCURLY:
		case RCURLY:
		case LT:
		case GT:
		case COLON:
		case LSQUARE:
		case LITERAL_Void:
		case LITERAL_inv:
		case LITERAL_is:
		case LITERAL_attribute:
		case LITERAL_reference:
		case LITERAL_property:
		case LITERAL_setter:
		case LITERAL_from:
		case LITERAL_operation:
		case LITERAL_method:
		case LITERAL_pre:
		case LITERAL_post:
		case STAR:
		case PLUS:
		case QMARK:
		case INT_LITERAL:
		case LITERAL_and:
		case LITERAL_or:
		case EQEQ:
		case NEQ:
		case GTE:
		case LTE:
		case MINUS:
		case DIV:
		case LITERAL_not:
		case DOT:
		case LITERAL_self:
		case LITERAL_super:
		case LITERAL_result:
		case LITERAL_value:
		case LITERAL_do:
		case LITERAL_end:
		case LITERAL_function:
		case LITERAL_rescue:
		case LITERAL_until:
		case LITERAL_loop:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_raise:
		case LITERAL_var:
		case LITERAL_extern:
		case LITERAL_true:
		case LITERAL_false:
		case LITERAL_void:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new FTypeOrVarLiteral(literal, atp);
		return retVal;
	}
	
	public final TrueOrFalse  trueOrFalse() throws RecognitionException, TokenStreamException {
		 TrueOrFalse retVal = null ;
		
		Token tok = LT(1);
		
		{
		switch ( LA(1)) {
		case LITERAL_true:
		{
			match(LITERAL_true);
			break;
		}
		case LITERAL_false:
		{
			match(LITERAL_false);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		retVal = new TrueOrFalse(createTokenInfo(tok));
		return retVal;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"package\"",
		"SEMI",
		"ID",
		"COL_COL",
		"STRING_LITERAL",
		"AT",
		"CONTEXT_MULTI_LINE_COMMENT",
		"\"require\"",
		"\"excludeFilter\"",
		"LPAREN",
		"RPAREN",
		"\"includeFilter\"",
		"COMMA",
		"\"using\"",
		"LCURLY",
		"RCURLY",
		"\"modeltype\"",
		"LT",
		"GT",
		"\"inherits\"",
		"\"class\"",
		"\"abstract\"",
		"\"aspect\"",
		"COLON",
		"LSQUARE",
		"RSQUARE",
		"MINUS_GT",
		"\"Void\"",
		"\"inv\"",
		"\"is\"",
		"HASH",
		"\"attribute\"",
		"\"reference\"",
		"\"property\"",
		"\"readonly\"",
		"\"getter\"",
		"\"setter\"",
		"\"from\"",
		"\"raises\"",
		"\"operation\"",
		"\"method\"",
		"\"pre\"",
		"\"post\"",
		"\"bag\"",
		"\"set\"",
		"\"seq\"",
		"\"oset\"",
		"DOT_DOT",
		"STAR",
		"PLUS",
		"QMARK",
		"INT_LITERAL",
		"\"alias\"",
		"\"enumeration\"",
		"EQUALS",
		"\"and\"",
		"\"or\"",
		"EQEQ",
		"NEQ",
		"GTE",
		"LTE",
		"MINUS",
		"DIV",
		"\"not\"",
		"DOT",
		"PIPE",
		"\"self\"",
		"\"super\"",
		"\"result\"",
		"\"value\"",
		"\"do\"",
		"\"end\"",
		"\"function\"",
		"\"rescue\"",
		"\"until\"",
		"\"loop\"",
		"\"if\"",
		"\"then\"",
		"\"else\"",
		"\"raise\"",
		"\"var\"",
		"\"init\"",
		"\"extern\"",
		"\"true\"",
		"\"false\"",
		"\"void\"",
		"ATPRE",
		"BANG",
		"DOLLAR",
		"GT_LT",
		"LT_GT",
		"CHAR_LITERAL",
		"END_COMMENT",
		"ESC",
		"REAL_LITERAL",
		"EXPONENT",
		"DIGIT",
		"WS",
		"SINGLE_LINE_COMMENT",
		"EMPTY_LINE_COMMENT",
		"MULTI_LINE_COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 216172782232274448L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 216172782232274512L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 216172782377240528L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 252335966900987730L, 64569290L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { -292598204892092430L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 26633092204032L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 2418016320L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 2422276288L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { -508766295409465502L, 134217727L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { -4362862139185166L, 134217727L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { -169998L, 134217727L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 67553994947428352L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { -506514496669522110L, 67108863L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { -508766297020078270L, 67108863L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { -4363430693869614L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { -2251817002113070L, 132120575L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 105553116268032L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 36030998460245824L, 64559050L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 36030998460244288L, 64559050L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { -508771262002272446L, 65011679L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { -4367828740380718L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { -4367827129767982L, 132120575L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = { -508771262002272318L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = { -2305843009207402496L, 1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = { 36030998460262208L, 64559050L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	private static final long[] mk_tokenSet_25() {
		long[] data = { -508771261935163454L, 132120575L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
	private static final long[] mk_tokenSet_26() {
		long[] data = { -508771262002272446L, 132120575L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());
	private static final long[] mk_tokenSet_27() {
		long[] data = { 36030998460245824L, 64569290L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_27 = new BitSet(mk_tokenSet_27());
	private static final long[] mk_tokenSet_28() {
		long[] data = { -508771261935163454L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_28 = new BitSet(mk_tokenSet_28());
	private static final long[] mk_tokenSet_29() {
		long[] data = { -4367827129767982L, 132120543L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_29 = new BitSet(mk_tokenSet_29());
	
	}
