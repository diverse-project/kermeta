// $ANTLR : "DirectiveParser.g" -> "DirectiveParser.java"$

package org.kermeta.kompose.core.parser; 

import java.io.FileInputStream;
import java.util.ArrayList;

import kompose.*;
import kompose.impl.KomposePackageImpl;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class DirectiveParser extends antlr.LLkParser implements DirectiveParserTokenTypes
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

protected DirectiveParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public DirectiveParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected DirectiveParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public DirectiveParser(TokenStream lexer) {
  this(lexer,1);
}

public DirectiveParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final Composer  dirUnit() throws RecognitionException, TokenStreamException {
		Composer c = factory.createComposer();
		
		Token  pm = null;
		Token  am = null;
		Token  cm = null;
		
		try {      // for error handling
			
				ArrayList pmpre, ampre, post;	
			
			match(LITERAL_PM);
			pm = LT(1);
			match(STRING_LITERAL);
			match(LITERAL_AM);
			am = LT(1);
			match(STRING_LITERAL);
			match(LITERAL_CM);
			cm = LT(1);
			match(STRING_LITERAL);
			match(LITERAL_PMPre);
			match(LCURLY);
			pmpre=directives();
			match(RCURLY);
			match(LITERAL_AMPre);
			match(LCURLY);
			ampre=directives();
			match(RCURLY);
			match(LITERAL_Post);
			match(LCURLY);
			post=directives();
			match(RCURLY);
			
				c.getPredirectivesPM().addAll(pmpre);
				c.getPredirectivesAM().addAll(ampre);
				c.getPostdirectives().addAll(post);
				c.setAspectModelURI(am.getText().substring(1, am.getText().length()-1));
				c.setPrimaryModelURI(pm.getText().substring(1, pm.getText().length()-1));
				c.setComposedModelURI(cm.getText().substring(1, cm.getText().length()-1));
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return c;
	}
	
	public final ArrayList  directives() throws RecognitionException, TokenStreamException {
		ArrayList lst = new ArrayList();
		
		
		try {      // for error handling
			
				ElementDirective d = null;
			
			{
			_loop4:
			do {
				if ((_tokenSet_1.member(LA(1)))) {
					d=directive();
					lst.add(d);
				}
				else {
					break _loop4;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
		return lst;
	}
	
	public final ElementDirective  directive() throws RecognitionException, TokenStreamException {
		ElementDirective c = null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case CREATE:
			{
				c=createD();
				break;
			}
			case STRING_LITERAL:
			case ID:
			case DOLLAR:
			case INT_LITERAL:
			case TRUE:
			case FALSE:
			{
				c=changeD();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return c;
	}
	
	public final Create  createD() throws RecognitionException, TokenStreamException {
		Create d = factory.createCreate();
		
		Token  id = null;
		Token  var = null;
		
		try {      // for error handling
			match(CREATE);
			id = LT(1);
			match(ID);
			match(AS);
			match(DOLLAR);
			var = LT(1);
			match(ID);
			
				d.setClassName(id.getText());
				d.setIdentifier(var.getText());	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return d;
	}
	
	public final Change  changeD() throws RecognitionException, TokenStreamException {
		Change d = null;
		
		Token  prop = null;
		
		try {      // for error handling
			
				ElementRef ref;
			
			ref=refObj();
			match(DOT);
			prop = LT(1);
			match(ID);
			{
			switch ( LA(1)) {
			case EQUALS:
			{
				d=setD();
				break;
			}
			case PLUS:
			{
				d=addD();
				break;
			}
			case MINUS:
			{
				d=removeD();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
				d.setPropertyName(prop.getText());
				d.setTarget(ref);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return d;
	}
	
	public final ElementRef  refObj() throws RecognitionException, TokenStreamException {
		ElementRef ref = null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				ref=nameRef();
				break;
			}
			case DOLLAR:
			{
				ref=idRef();
				break;
			}
			case STRING_LITERAL:
			{
				ref=stringL();
				break;
			}
			case TRUE:
			case FALSE:
			{
				ref=booleanL();
				break;
			}
			case INT_LITERAL:
			{
				ref=integerL();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final Set  setD() throws RecognitionException, TokenStreamException {
		Set d = factory.createSet();
		
		
		try {      // for error handling
			
				ElementRef ref;	
			
			match(EQUALS);
			ref=refObj();
			
				d.setValue(ref);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return d;
	}
	
	public final Add  addD() throws RecognitionException, TokenStreamException {
		Add d = factory.createAdd();
		
		
		try {      // for error handling
			
				ElementRef ref;	
			
			match(PLUS);
			ref=refObj();
			
				d.setValue(ref);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return d;
	}
	
	public final Remove  removeD() throws RecognitionException, TokenStreamException {
		Remove d = factory.createRemove();
		
		
		try {      // for error handling
			
				ElementRef ref;	
			
			match(MINUS);
			ref=refObj();
			
				d.setValue(ref);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return d;
	}
	
	public final NameRef  nameRef() throws RecognitionException, TokenStreamException {
		NameRef ref = factory.createNameRef();
		
		
		try {      // for error handling
			
				String qname;	
			
			qname=qualifiedID();
			
				ref.setQname(qname);
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final IDRef  idRef() throws RecognitionException, TokenStreamException {
		IDRef ref = factory.createIDRef();
		
		Token  id = null;
		
		try {      // for error handling
			match(DOLLAR);
			id = LT(1);
			match(ID);
			
				ref.setIdentifier(id.getText());
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final StringLiteral  stringL() throws RecognitionException, TokenStreamException {
		StringLiteral ref = factory.createStringLiteral();
		
		Token  v = null;
		
		try {      // for error handling
			v = LT(1);
			match(STRING_LITERAL);
			
				ref.setValue(v.getText().substring(1, v.getText().length()-1));	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final BooleanLiteral  booleanL() throws RecognitionException, TokenStreamException {
		BooleanLiteral ref = factory.createBooleanLiteral();
		
		
		try {      // for error handling
			
				boolean val = false;	
			
			{
			switch ( LA(1)) {
			case TRUE:
			{
				match(TRUE);
				val = true;
				break;
			}
			case FALSE:
			{
				match(FALSE);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
				ref.setValue(val);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final IntegerLiteral  integerL() throws RecognitionException, TokenStreamException {
		IntegerLiteral ref = factory.createIntegerLiteral();
		
		Token  str = null;
		
		try {      // for error handling
			str = LT(1);
			match(INT_LITERAL);
			
				ref.setValue(Integer.parseInt(str.getText()));
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ref;
	}
	
	public final String  qualifiedID() throws RecognitionException, TokenStreamException {
		String val = "";
		
		Token  str1 = null;
		Token  strn = null;
		
		try {      // for error handling
			str1 = LT(1);
			match(ID);
			val+=str1.getText();
			{
			_loop21:
			do {
				if ((LA(1)==COL_COL)) {
					match(COL_COL);
					strn = LT(1);
					match(ID);
					val+="::"+strn.getText();
				}
				else {
					break _loop21;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return val;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"PM\"",
		"STRING_LITERAL",
		"\"AM\"",
		"\"CM\"",
		"\"PMPre\"",
		"LCURLY",
		"RCURLY",
		"\"AMPre\"",
		"\"Post\"",
		"CREATE",
		"ID",
		"AS",
		"DOLLAR",
		"DOT",
		"EQUALS",
		"PLUS",
		"MINUS",
		"INT_LITERAL",
		"TRUE",
		"FALSE",
		"COL_COL",
		"PRE",
		"POST",
		"CHAR_LITERAL",
		"ESC",
		"REAL_LITERAL",
		"EXPONENT",
		"DIGIT",
		"WS",
		"SINGLE_LINE_COMMENT",
		"CONTEXT_MULTI_LINE_COMMENT",
		"EMPTY_LINE_COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 14770208L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 1024L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 14771232L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 14902304L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	
	}
