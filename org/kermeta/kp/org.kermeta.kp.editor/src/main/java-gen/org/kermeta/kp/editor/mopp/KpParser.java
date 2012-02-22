// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "SL_COMMENT", "ML_COMMENT", "FLOAT", "TEXT", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "'groupId'", "'='", "'defaultMainClass'", "'defaultMainOperation'", "'dependencies'", "'{'", "'}'", "'packageEquivalences'", "'sources'", "'options'", "'weaveDirectives'", "'require'", "'source'", "'byteCodeFromADependency'", "'packageEquivalence'", "'dependency'", "'URLs'", "','", "'genmodel'", "'ignoreByteCode'", "'sourceOnly'", "'byteCodeOnly'", "'weaver-directive'", "'option'", "'value'", "'('", "')'"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int QUOTED_34_34=4;
    public static final int SL_COMMENT=5;
    public static final int ML_COMMENT=6;
    public static final int FLOAT=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;
    public static final int LINEBREAK=10;

    // delegates
    // delegators


        public KpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public KpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[33+1];
             
             
        }
        

    public String[] getTokenNames() { return KpParser.tokenNames; }
    public String getGrammarFileName() { return "Kp.g"; }


    	private org.kermeta.kp.editor.IKpTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.kermeta.kp.editor.IKpProblem() {
    					public org.kermeta.kp.editor.KpEProblemSeverity getSeverity() {
    						return org.kermeta.kp.editor.KpEProblemSeverity.ERROR;
    					}
    					public org.kermeta.kp.editor.KpEProblemType getType() {
    						return org.kermeta.kp.editor.KpEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.kermeta.kp.editor.IKpExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
    				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
    				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
    				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.kermeta.kp.editor.IKpTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new KpParser(new org.antlr.runtime3_3_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new KpParser(new org.antlr.runtime3_3_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.kermeta.kp.editor.mopp.KpPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public KpParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((KpLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((KpLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
    				return parse_org_kermeta_kp_KermetaProject();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.Source.class) {
    				return parse_org_kermeta_kp_Source();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.PackageEquivalence.class) {
    				return parse_org_kermeta_kp_PackageEquivalence();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.Dependency.class) {
    				return parse_org_kermeta_kp_Dependency();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.WeaveDirective.class) {
    				return parse_org_kermeta_kp_WeaveDirective();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.Option.class) {
    				return parse_org_kermeta_kp_Option();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.StringExpression.class) {
    				return parse_org_kermeta_kp_StringExpression();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.MixExpression.class) {
    				return parse_org_kermeta_kp_MixExpression();
    			}
    		}
    		throw new org.kermeta.kp.editor.mopp.KpUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.kermeta.kp.editor.IKpOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.kermeta.kp.editor.IKpParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>>();
    		org.kermeta.kp.editor.mopp.KpParseResult parseResult = new org.kermeta.kp.editor.mopp.KpParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKpTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		org.kermeta.kp.editor.IKpParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.kermeta.kp.editor.mopp.KpExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
    		java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 98;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							org.kermeta.kp.editor.IKpExpectedElement newFollower = newFollowerPair.getLeft();
    							org.kermeta.kp.editor.mopp.KpExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
    			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
    			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	



    // $ANTLR start "start"
    // Kp.g:484:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Kp.g:485:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // Kp.g:486:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Kp.g:491:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // Kp.g:492:3: c0= parse_org_kermeta_kp_KermetaProject
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82);
            c0=parse_org_kermeta_kp_KermetaProject();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_org_kermeta_kp_KermetaProject"
    // Kp.g:500:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) ) )* ;
    public final org.kermeta.kp.KermetaProject parse_org_kermeta_kp_KermetaProject() throws RecognitionException {
        org.kermeta.kp.KermetaProject element =  null;
        int parse_org_kermeta_kp_KermetaProject_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        Token a23=null;
        Token a25=null;
        Token a26=null;
        Token a27=null;
        Token a28=null;
        Token a30=null;
        Token a31=null;
        Token a32=null;
        Token a33=null;
        Token a35=null;
        org.kermeta.kp.Dependency a14_0 = null;

        org.kermeta.kp.PackageEquivalence a19_0 = null;

        org.kermeta.kp.Source a24_0 = null;

        org.kermeta.kp.Option a29_0 = null;

        org.kermeta.kp.WeaveDirective a34_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:503:1: (a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) ) )* )
            // Kp.g:504:2: a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) ) )*
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 1);
              	
            }
            // Kp.g:518:2: (a1= QUOTED_34_34 )
            // Kp.g:519:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 2);
              	
            }
            // Kp.g:561:2: ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0>=14 && LA7_0<=16)||(LA7_0>=19 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Kp.g:562:3: ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) )
            	    {
            	    // Kp.g:562:3: ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) ) )
            	    // Kp.g:563:4: ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) )
            	    {
            	    // Kp.g:563:4: ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' ) | (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' ) | (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' ) | (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' ) )
            	    int alt6=8;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt6=6;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt6=7;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt6=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // Kp.g:564:5: (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:564:5: (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) )
            	            // Kp.g:565:6: a2= 'groupId' a3= '=' (a4= QUOTED_34_34 )
            	            {
            	            a2=(Token)match(input,12,FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject176); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_0_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 3);
            	              					
            	            }
            	            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject202); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_0_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 4);
            	              					
            	            }
            	            // Kp.g:593:6: (a4= QUOTED_34_34 )
            	            // Kp.g:594:7: a4= QUOTED_34_34
            	            {
            	            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject236); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              							if (terminateParsing) {
            	              								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	              							}
            	              							if (element == null) {
            	              								element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              								incompleteObjects.push(element);
            	              							}
            	              							if (a4 != null) {
            	              								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	              								tokenResolver.setOptions(getOptions());
            	              								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
            	              								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
            	              								Object resolvedObject = result.getResolvedToken();
            	              								if (resolvedObject == null) {
            	              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
            	              								}
            	              								java.lang.String resolved = (java.lang.String) resolvedObject;
            	              								if (resolved != null) {
            	              									Object value = resolved;
            	              									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), value);
            	              									completedElement(value, false);
            	              								}
            	              								collectHiddenTokens(element);
            	              								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_0_0_0_0_2, resolved, true);
            	              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
            	              							}
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 5);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 5);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 6);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 6);
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Kp.g:650:10: (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:650:10: (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) )
            	            // Kp.g:651:6: a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 )
            	            {
            	            a5=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject314); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_1_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 7);
            	              					
            	            }
            	            a6=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject340); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_1_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 8);
            	              					
            	            }
            	            // Kp.g:679:6: (a7= QUOTED_34_34 )
            	            // Kp.g:680:7: a7= QUOTED_34_34
            	            {
            	            a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject374); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              							if (terminateParsing) {
            	              								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	              							}
            	              							if (element == null) {
            	              								element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              								incompleteObjects.push(element);
            	              							}
            	              							if (a7 != null) {
            	              								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	              								tokenResolver.setOptions(getOptions());
            	              								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
            	              								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), result);
            	              								Object resolvedObject = result.getResolvedToken();
            	              								if (resolvedObject == null) {
            	              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	              								}
            	              								java.lang.String resolved = (java.lang.String) resolvedObject;
            	              								if (resolved != null) {
            	              									Object value = resolved;
            	              									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), value);
            	              									completedElement(value, false);
            	              								}
            	              								collectHiddenTokens(element);
            	              								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_1_0_0_0_2, resolved, true);
            	              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	              							}
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 9);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 9);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 10);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 10);
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Kp.g:736:10: (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:736:10: (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) )
            	            // Kp.g:737:6: a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 )
            	            {
            	            a8=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject452); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_2_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 11);
            	              					
            	            }
            	            a9=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject478); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_2_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 12);
            	              					
            	            }
            	            // Kp.g:765:6: (a10= QUOTED_34_34 )
            	            // Kp.g:766:7: a10= QUOTED_34_34
            	            {
            	            a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject512); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              							if (terminateParsing) {
            	              								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	              							}
            	              							if (element == null) {
            	              								element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              								incompleteObjects.push(element);
            	              							}
            	              							if (a10 != null) {
            	              								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	              								tokenResolver.setOptions(getOptions());
            	              								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
            	              								tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), result);
            	              								Object resolvedObject = result.getResolvedToken();
            	              								if (resolvedObject == null) {
            	              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
            	              								}
            	              								java.lang.String resolved = (java.lang.String) resolvedObject;
            	              								if (resolved != null) {
            	              									Object value = resolved;
            	              									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), value);
            	              									completedElement(value, false);
            	              								}
            	              								collectHiddenTokens(element);
            	              								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_2_0_0_0_2, resolved, true);
            	              								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
            	              							}
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 13);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 13);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 14);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 14);
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Kp.g:822:10: (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' )
            	            {
            	            // Kp.g:822:10: (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' )
            	            // Kp.g:823:6: a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}'
            	            {
            	            a11=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject590); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_3_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 15);
            	              					
            	            }
            	            a12=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject616); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_3_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 16);
            	              					
            	            }
            	            a13=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject642); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_3_0_0_0_2, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 17);
            	              					
            	            }
            	            // Kp.g:866:6: ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( (LA1_0==27) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // Kp.g:867:7: ( (a14_0= parse_org_kermeta_kp_Dependency ) )
            	            	    {
            	            	    // Kp.g:867:7: ( (a14_0= parse_org_kermeta_kp_Dependency ) )
            	            	    // Kp.g:868:8: (a14_0= parse_org_kermeta_kp_Dependency )
            	            	    {
            	            	    // Kp.g:868:8: (a14_0= parse_org_kermeta_kp_Dependency )
            	            	    // Kp.g:869:9: a14_0= parse_org_kermeta_kp_Dependency
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject695);
            	            	    a14_0=parse_org_kermeta_kp_Dependency();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (terminateParsing) {
            	            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	            	      									}
            	            	      									if (element == null) {
            	            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	            	      										incompleteObjects.push(element);
            	            	      									}
            	            	      									if (a14_0 != null) {
            	            	      										if (a14_0 != null) {
            	            	      											Object value = a14_0;
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, value);
            	            	      											completedElement(value, true);
            	            	      										}
            	            	      										collectHiddenTokens(element);
            	            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_3_0_0_0_3_0_0_0, a14_0, true);
            	            	      										copyLocalizationInfos(a14_0, element);
            	            	      									}
            	            	      								
            	            	    }

            	            	    }

            	            	    if ( state.backtracking==0 ) {

            	            	      								// expected elements (follow set)
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 18);
            	            	      							
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop1;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 19);
            	              					
            	            }
            	            a15=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject776); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_3_0_0_0_5, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a15, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 20);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 20);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 21);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 21);
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Kp.g:938:10: (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' )
            	            {
            	            // Kp.g:938:10: (a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}' )
            	            // Kp.g:939:6: a16= 'packageEquivalences' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a20= '}'
            	            {
            	            a16=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject835); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_4_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a16, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 22);
            	              					
            	            }
            	            a17=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject861); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_4_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a17, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 23);
            	              					
            	            }
            	            a18=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject887); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_4_0_0_0_2, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a18, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 24, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 24);
            	              					
            	            }
            	            // Kp.g:982:6: ( ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( (LA2_0==26) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // Kp.g:983:7: ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) )
            	            	    {
            	            	    // Kp.g:983:7: ( (a19_0= parse_org_kermeta_kp_PackageEquivalence ) )
            	            	    // Kp.g:984:8: (a19_0= parse_org_kermeta_kp_PackageEquivalence )
            	            	    {
            	            	    // Kp.g:984:8: (a19_0= parse_org_kermeta_kp_PackageEquivalence )
            	            	    // Kp.g:985:9: a19_0= parse_org_kermeta_kp_PackageEquivalence
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_KermetaProject940);
            	            	    a19_0=parse_org_kermeta_kp_PackageEquivalence();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (terminateParsing) {
            	            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	            	      									}
            	            	      									if (element == null) {
            	            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	            	      										incompleteObjects.push(element);
            	            	      									}
            	            	      									if (a19_0 != null) {
            	            	      										if (a19_0 != null) {
            	            	      											Object value = a19_0;
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__PACKAGE_EQUIVALENCES, value);
            	            	      											completedElement(value, true);
            	            	      										}
            	            	      										collectHiddenTokens(element);
            	            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_4_0_0_0_3_0_0_0, a19_0, true);
            	            	      										copyLocalizationInfos(a19_0, element);
            	            	      									}
            	            	      								
            	            	    }

            	            	    }

            	            	    if ( state.backtracking==0 ) {

            	            	      								// expected elements (follow set)
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 25, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 25);
            	            	      							
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop2;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 26);
            	              					
            	            }
            	            a20=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1021); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_4_0_0_0_5, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a20, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 27);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 27);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 28);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 28);
            	              				
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Kp.g:1054:10: (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' )
            	            {
            	            // Kp.g:1054:10: (a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}' )
            	            // Kp.g:1055:6: a21= 'sources' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )* a25= '}'
            	            {
            	            a21=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject1080); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_5_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a21, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 29);
            	              					
            	            }
            	            a22=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1106); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_5_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a22, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 30);
            	              					
            	            }
            	            a23=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1132); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_5_0_0_0_2, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a23, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 31);
            	              					
            	            }
            	            // Kp.g:1099:6: ( ( (a24_0= parse_org_kermeta_kp_Source ) ) )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( ((LA3_0>=23 && LA3_0<=24)) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // Kp.g:1100:7: ( (a24_0= parse_org_kermeta_kp_Source ) )
            	            	    {
            	            	    // Kp.g:1100:7: ( (a24_0= parse_org_kermeta_kp_Source ) )
            	            	    // Kp.g:1101:8: (a24_0= parse_org_kermeta_kp_Source )
            	            	    {
            	            	    // Kp.g:1101:8: (a24_0= parse_org_kermeta_kp_Source )
            	            	    // Kp.g:1102:9: a24_0= parse_org_kermeta_kp_Source
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject1185);
            	            	    a24_0=parse_org_kermeta_kp_Source();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (terminateParsing) {
            	            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	            	      									}
            	            	      									if (element == null) {
            	            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	            	      										incompleteObjects.push(element);
            	            	      									}
            	            	      									if (a24_0 != null) {
            	            	      										if (a24_0 != null) {
            	            	      											Object value = a24_0;
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, value);
            	            	      											completedElement(value, true);
            	            	      										}
            	            	      										collectHiddenTokens(element);
            	            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_5_0_0_0_3_0_0_0, a24_0, true);
            	            	      										copyLocalizationInfos(a24_0, element);
            	            	      									}
            	            	      								
            	            	    }

            	            	    }

            	            	    if ( state.backtracking==0 ) {

            	            	      								// expected elements (follow set)
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 32);
            	            	      							
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop3;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 33);
            	              					
            	            }
            	            a25=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1266); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_5_0_0_0_5, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a25, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 34);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 34);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 35);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 35);
            	              				
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // Kp.g:1173:10: (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' )
            	            {
            	            // Kp.g:1173:10: (a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}' )
            	            // Kp.g:1174:6: a26= 'options' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )* a30= '}'
            	            {
            	            a26=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_KermetaProject1325); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_6_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a26, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 36);
            	              					
            	            }
            	            a27=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1351); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_6_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a27, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 37);
            	              					
            	            }
            	            a28=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1377); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_6_0_0_0_2, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a28, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 38);
            	              					
            	            }
            	            // Kp.g:1217:6: ( ( (a29_0= parse_org_kermeta_kp_Option ) ) )*
            	            loop4:
            	            do {
            	                int alt4=2;
            	                int LA4_0 = input.LA(1);

            	                if ( (LA4_0==35) ) {
            	                    alt4=1;
            	                }


            	                switch (alt4) {
            	            	case 1 :
            	            	    // Kp.g:1218:7: ( (a29_0= parse_org_kermeta_kp_Option ) )
            	            	    {
            	            	    // Kp.g:1218:7: ( (a29_0= parse_org_kermeta_kp_Option ) )
            	            	    // Kp.g:1219:8: (a29_0= parse_org_kermeta_kp_Option )
            	            	    {
            	            	    // Kp.g:1219:8: (a29_0= parse_org_kermeta_kp_Option )
            	            	    // Kp.g:1220:9: a29_0= parse_org_kermeta_kp_Option
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject1430);
            	            	    a29_0=parse_org_kermeta_kp_Option();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (terminateParsing) {
            	            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	            	      									}
            	            	      									if (element == null) {
            	            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	            	      										incompleteObjects.push(element);
            	            	      									}
            	            	      									if (a29_0 != null) {
            	            	      										if (a29_0 != null) {
            	            	      											Object value = a29_0;
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, value);
            	            	      											completedElement(value, true);
            	            	      										}
            	            	      										collectHiddenTokens(element);
            	            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_6_0_0_0_3_0_0_0, a29_0, true);
            	            	      										copyLocalizationInfos(a29_0, element);
            	            	      									}
            	            	      								
            	            	    }

            	            	    }

            	            	    if ( state.backtracking==0 ) {

            	            	      								// expected elements (follow set)
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 39);
            	            	      							
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop4;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 40);
            	              					
            	            }
            	            a30=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1511); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_6_0_0_0_5, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a30, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 41);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 41);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 42);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 42);
            	              				
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // Kp.g:1289:10: (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' )
            	            {
            	            // Kp.g:1289:10: (a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}' )
            	            // Kp.g:1290:6: a31= 'weaveDirectives' a32= '=' a33= '{' ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a35= '}'
            	            {
            	            a31=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_KermetaProject1570); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_7_0_0_0_0, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a31, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 43);
            	              					
            	            }
            	            a32=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1596); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_7_0_0_0_1, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a32, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 44);
            	              					
            	            }
            	            a33=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1622); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_7_0_0_0_2, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a33, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 45);
            	              					
            	            }
            	            // Kp.g:1333:6: ( ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) ) )*
            	            loop5:
            	            do {
            	                int alt5=2;
            	                int LA5_0 = input.LA(1);

            	                if ( (LA5_0==34) ) {
            	                    alt5=1;
            	                }


            	                switch (alt5) {
            	            	case 1 :
            	            	    // Kp.g:1334:7: ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) )
            	            	    {
            	            	    // Kp.g:1334:7: ( (a34_0= parse_org_kermeta_kp_WeaveDirective ) )
            	            	    // Kp.g:1335:8: (a34_0= parse_org_kermeta_kp_WeaveDirective )
            	            	    {
            	            	    // Kp.g:1335:8: (a34_0= parse_org_kermeta_kp_WeaveDirective )
            	            	    // Kp.g:1336:9: a34_0= parse_org_kermeta_kp_WeaveDirective
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject1675);
            	            	    a34_0=parse_org_kermeta_kp_WeaveDirective();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (terminateParsing) {
            	            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	            	      									}
            	            	      									if (element == null) {
            	            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	            	      										incompleteObjects.push(element);
            	            	      									}
            	            	      									if (a34_0 != null) {
            	            	      										if (a34_0 != null) {
            	            	      											Object value = a34_0;
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, value);
            	            	      											completedElement(value, true);
            	            	      										}
            	            	      										collectHiddenTokens(element);
            	            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_7_0_0_0_3_0_0_0, a34_0, true);
            	            	      										copyLocalizationInfos(a34_0, element);
            	            	      									}
            	            	      								
            	            	    }

            	            	    }

            	            	    if ( state.backtracking==0 ) {

            	            	      								// expected elements (follow set)
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 46);
            	            	      							
            	            	    }

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop5;
            	                }
            	            } while (true);

            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 47);
            	              					
            	            }
            	            a35=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1756); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (element == null) {
            	              							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              							incompleteObjects.push(element);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0_0_7_0_0_0_5, null, true);
            	              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a35, element);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						// expected elements (follow set)
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 48);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 48);
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 49);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 49);
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 50);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 50);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 51);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_kermeta_kp_KermetaProject_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_KermetaProject"


    // $ANTLR start "parse_org_kermeta_kp_Source"
    // Kp.g:1433:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? ) ;
    public final org.kermeta.kp.Source parse_org_kermeta_kp_Source() throws RecognitionException {
        org.kermeta.kp.Source element =  null;
        int parse_org_kermeta_kp_Source_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:1436:1: ( (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? ) )
            // Kp.g:1437:2: (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? )
            {
            // Kp.g:1437:2: (a0= 'require' | a1= 'source' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Kp.g:1438:3: a0= 'require'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_Source1843); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      				incompleteObjects.push(element);
                      				// initialize boolean attribute
                      				{
                      					Object value = false;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), value);
                      				}
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1_0_0_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 52);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1458:6: a1= 'source'
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_Source1866); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      				incompleteObjects.push(element);
                      				// initialize boolean attribute
                      				{
                      					Object value = false;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), value);
                      				}
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1_0_1_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 53);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 54);
              	
            }
            // Kp.g:1483:2: (a2= QUOTED_34_34 )
            // Kp.g:1484:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source1894); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), value);
              				}
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_38, 55);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 55, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 55, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 55);
              	
            }
            // Kp.g:1527:2: ( (a3= 'byteCodeFromADependency' )? )
            // Kp.g:1528:3: (a3= 'byteCodeFromADependency' )?
            {
            // Kp.g:1528:3: (a3= 'byteCodeFromADependency' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Kp.g:1529:4: a3= 'byteCodeFromADependency'
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_Source1924); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_3, true, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      				// set value of boolean attribute
                      				Object value = true;
                      				element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY), value);
                      				completedElement(value, false);
                      			
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 56);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_kermeta_kp_Source_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Source"


    // $ANTLR start "parse_org_kermeta_kp_PackageEquivalence"
    // Kp.g:1557:1: parse_org_kermeta_kp_PackageEquivalence returns [org.kermeta.kp.PackageEquivalence element = null] : a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.PackageEquivalence parse_org_kermeta_kp_PackageEquivalence() throws RecognitionException {
        org.kermeta.kp.PackageEquivalence element =  null;
        int parse_org_kermeta_kp_PackageEquivalence_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1560:1: (a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) )
            // Kp.g:1561:2: a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_PackageEquivalence1960); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 57);
              	
            }
            // Kp.g:1575:2: (a1= QUOTED_34_34 )
            // Kp.g:1576:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence1978); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 58);
              	
            }
            // Kp.g:1611:2: (a2= '=' )
            // Kp.g:1612:3: a2= '='
            {
            a2=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_PackageEquivalence2003); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              				incompleteObjects.push(element);
              			}
              			collectHiddenTokens(element);
              			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_0, null, true);
              			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              		
            }
            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 59);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 60);
              	
            }
            // Kp.g:1632:2: (a3= QUOTED_34_34 )
            // Kp.g:1633:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence2031); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              				incompleteObjects.push(element);
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 61);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_PackageEquivalence_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_PackageEquivalence"


    // $ANTLR start "parse_org_kermeta_kp_Dependency"
    // Kp.g:1671:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) ) )? ( ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) ) )? ;
    public final org.kermeta.kp.Dependency parse_org_kermeta_kp_Dependency() throws RecognitionException {
        org.kermeta.kp.Dependency element =  null;
        int parse_org_kermeta_kp_Dependency_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a14=null;
        Token a17=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1674:1: (a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) ) )? ( ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) ) )? )
            // Kp.g:1675:2: a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) ) )? ( ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) ) )?
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_Dependency2067); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              			incompleteObjects.push(element);
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
              			}
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
              			}
              			// initialize boolean attribute
              			{
              				Object value = false;
              				element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
              			}
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_42, 62);
              	
            }
            // Kp.g:1704:2: (a1= QUOTED_34_34 )
            // Kp.g:1705:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2085); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
              				}
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
              				}
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
              				}
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_43, 63);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_44, 63);
              	
            }
            // Kp.g:1756:2: ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Kp.g:1757:3: (a2= '=' )
                    {
                    // Kp.g:1757:3: (a2= '=' )
                    // Kp.g:1758:4: a2= '='
                    {
                    a2=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Dependency2115); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_0_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 64);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 65);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1794:6: (a3= 'URLs' a4= '=' )
                    {
                    // Kp.g:1794:6: (a3= 'URLs' a4= '=' )
                    // Kp.g:1795:4: a3= 'URLs' a4= '='
                    {
                    a3=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency2156); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_1_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 66);
                      			
                    }
                    a4=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Dependency2176); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_1_0_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 67);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 68);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 69);
              	
            }
            // Kp.g:1865:2: (a5= QUOTED_34_34 )
            // Kp.g:1866:3: a5= QUOTED_34_34
            {
            a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2217); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				incompleteObjects.push(element);
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
              				}
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
              				}
              				// initialize boolean attribute
              				{
              					Object value = false;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
              				}
              			}
              			if (a5 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					addObjectToList(element, org.kermeta.kp.KpPackage.DEPENDENCY__URL, value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 70, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 70);
              	
            }
            // Kp.g:1922:2: ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Kp.g:1923:3: (a6= ',' (a7= QUOTED_34_34 ) )
            	    {
            	    // Kp.g:1923:3: (a6= ',' (a7= QUOTED_34_34 ) )
            	    // Kp.g:1924:4: a6= ',' (a7= QUOTED_34_34 )
            	    {
            	    a6=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_Dependency2247); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
            	      					incompleteObjects.push(element);
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
            	      					}
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
            	      					}
            	      					// initialize boolean attribute
            	      					{
            	      						Object value = false;
            	      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
            	      					}
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_5_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_52, 71);
            	      			
            	    }
            	    // Kp.g:1953:4: (a7= QUOTED_34_34 )
            	    // Kp.g:1954:5: a7= QUOTED_34_34
            	    {
            	    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2273); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
            	      						incompleteObjects.push(element);
            	      						// initialize boolean attribute
            	      						{
            	      							Object value = false;
            	      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
            	      						}
            	      						// initialize boolean attribute
            	      						{
            	      							Object value = false;
            	      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
            	      						}
            	      						// initialize boolean attribute
            	      						{
            	      							Object value = false;
            	      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
            	      						}
            	      					}
            	      					if (a7 != null) {
            	      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	      						tokenResolver.setOptions(getOptions());
            	      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
            	      						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), result);
            	      						Object resolvedObject = result.getResolvedToken();
            	      						if (resolvedObject == null) {
            	      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
            	      						}
            	      						java.lang.String resolved = (java.lang.String) resolvedObject;
            	      						if (resolved != null) {
            	      							Object value = resolved;
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.DEPENDENCY__URL, value);
            	      							completedElement(value, false);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_5_0_0_1, resolved, true);
            	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 72);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 72);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 72);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 72);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 72);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 72);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 73);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 73);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 73);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 73);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 73);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 73);
              	
            }
            // Kp.g:2023:2: ( (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Kp.g:2024:3: (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) )
                    {
                    // Kp.g:2024:3: (a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 ) )
                    // Kp.g:2025:4: a8= 'genmodel' a9= '=' (a10= QUOTED_34_34 )
                    {
                    a8=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_Dependency2328); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_6_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 74);
                      			
                    }
                    a9=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Dependency2348); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      					incompleteObjects.push(element);
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      					}
                      					// initialize boolean attribute
                      					{
                      						Object value = false;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      					}
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_6_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 75);
                      			
                    }
                    // Kp.g:2083:4: (a10= QUOTED_34_34 )
                    // Kp.g:2084:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2374); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      						incompleteObjects.push(element);
                      						// initialize boolean attribute
                      						{
                      							Object value = false;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                      						}
                      						// initialize boolean attribute
                      						{
                      							Object value = false;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                      						}
                      						// initialize boolean attribute
                      						{
                      							Object value = false;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                      						}
                      					}
                      					if (a10 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GENMODEL), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GENMODEL), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_6_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 76);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 76);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 76);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 76);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 77);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 77);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 77);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 77, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 77);
              	
            }
            // Kp.g:2149:2: ( ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Kp.g:2150:3: ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) )
                    {
                    // Kp.g:2150:3: ( ( (a11= 'ignoreByteCode' ) ) | ( (a14= 'sourceOnly' ) ) | ( (a17= 'byteCodeOnly' ) ) )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt13=1;
                        }
                        break;
                    case 32:
                        {
                        alt13=2;
                        }
                        break;
                    case 33:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // Kp.g:2151:4: ( (a11= 'ignoreByteCode' ) )
                            {
                            // Kp.g:2151:4: ( (a11= 'ignoreByteCode' ) )
                            // Kp.g:2152:5: (a11= 'ignoreByteCode' )
                            {
                            // Kp.g:2152:5: (a11= 'ignoreByteCode' )
                            // Kp.g:2153:6: a11= 'ignoreByteCode'
                            {
                            a11=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_Dependency2442); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                              							incompleteObjects.push(element);
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                              							}
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_7_0_0_0, true, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                              						// set value of boolean attribute
                              						Object value = true;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                              						completedElement(value, false);
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 78);
                              			
                            }

                            }
                            break;
                        case 2 :
                            // Kp.g:2190:8: ( (a14= 'sourceOnly' ) )
                            {
                            // Kp.g:2190:8: ( (a14= 'sourceOnly' ) )
                            // Kp.g:2191:5: (a14= 'sourceOnly' )
                            {
                            // Kp.g:2191:5: (a14= 'sourceOnly' )
                            // Kp.g:2192:6: a14= 'sourceOnly'
                            {
                            a14=(Token)match(input,32,FOLLOW_32_in_parse_org_kermeta_kp_Dependency2494); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                              							incompleteObjects.push(element);
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                              							}
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_7_0_1_0, true, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a14, element);
                              						// set value of boolean attribute
                              						Object value = true;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                              						completedElement(value, false);
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 79, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 79);
                              			
                            }

                            }
                            break;
                        case 3 :
                            // Kp.g:2229:8: ( (a17= 'byteCodeOnly' ) )
                            {
                            // Kp.g:2229:8: ( (a17= 'byteCodeOnly' ) )
                            // Kp.g:2230:5: (a17= 'byteCodeOnly' )
                            {
                            // Kp.g:2230:5: (a17= 'byteCodeOnly' )
                            // Kp.g:2231:6: a17= 'byteCodeOnly'
                            {
                            a17=(Token)match(input,33,FOLLOW_33_in_parse_org_kermeta_kp_Dependency2546); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                              							incompleteObjects.push(element);
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                              							}
                              							// initialize boolean attribute
                              							{
                              								Object value = false;
                              								element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                              							}
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_7_0_2_0, true, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a17, element);
                              						// set value of boolean attribute
                              						Object value = true;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY), value);
                              						completedElement(value, false);
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 80, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 80);
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 81, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 81);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_Dependency_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Dependency"


    // $ANTLR start "parse_org_kermeta_kp_WeaveDirective"
    // Kp.g:2277:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
    public final org.kermeta.kp.WeaveDirective parse_org_kermeta_kp_WeaveDirective() throws RecognitionException {
        org.kermeta.kp.WeaveDirective element =  null;
        int parse_org_kermeta_kp_WeaveDirective_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.Expression a3_0 = null;

        org.kermeta.kp.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:2280:1: (a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // Kp.g:2281:2: a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_org_kermeta_kp_WeaveDirective2605); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 82);
              	
            }
            // Kp.g:2295:2: (a1= QUOTED_34_34 )
            // Kp.g:2296:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective2623); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_56, 83);
              	
            }
            a2=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_WeaveDirective2644); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 84, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 84, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }
            // Kp.g:2346:2: (a3_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2347:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2662);
            a3_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              				incompleteObjects.push(element);
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					Object value = a3_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_4, a3_0, true);
              				copyLocalizationInfos(a3_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 85, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 85, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }
            // Kp.g:2373:2: (a4_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2374:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2684);
            a4_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              				incompleteObjects.push(element);
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					Object value = a4_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_5, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 86, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 86);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_WeaveDirective_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_WeaveDirective"


    // $ANTLR start "parse_org_kermeta_kp_Option"
    // Kp.g:2402:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kp.g:2405:1: (a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 ) )
            // Kp.g:2406:2: a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_org_kermeta_kp_Option2717); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_59, 87);
              	
            }
            // Kp.g:2420:2: (a1= QUOTED_34_34 )
            // Kp.g:2421:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2735); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_60, 88);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 88);
              	
            }
            // Kp.g:2457:2: ( (a2= 'value' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Kp.g:2458:3: (a2= 'value' )
                    {
                    // Kp.g:2458:3: (a2= 'value' )
                    // Kp.g:2459:4: a2= 'value'
                    {
                    a2=(Token)match(input,36,FOLLOW_36_in_parse_org_kermeta_kp_Option2765); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 89);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 90);
              	
            }
            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Option2798); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_62, 91);
              	
            }
            // Kp.g:2494:2: (a4= QUOTED_34_34 )
            // Kp.g:2495:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2816); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a4 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_5, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 92, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 92);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Option"


    // $ANTLR start "parse_org_kermeta_kp_StringExpression"
    // Kp.g:2533:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kp.g:2536:1: ( (a0= QUOTED_34_34 ) )
            // Kp.g:2537:2: (a0= QUOTED_34_34 )
            {
            // Kp.g:2537:2: (a0= QUOTED_34_34 )
            // Kp.g:2538:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2856); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createStringExpression();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 93, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 93, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_StringExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_StringExpression"


    // $ANTLR start "parse_org_kermeta_kp_MixExpression"
    // Kp.g:2576:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Kp.g:2579:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // Kp.g:2580:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_org_kermeta_kp_MixExpression2892); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 94, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 94, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              	
            }
            // Kp.g:2595:2: (a1_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2596:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2910);
            a1_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              				incompleteObjects.push(element);
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					Object value = a1_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 95, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 95, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              	
            }
            // Kp.g:2622:2: (a2_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2623:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2932);
            a2_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              				incompleteObjects.push(element);
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					Object value = a2_0;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), value);
              					completedElement(value, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 96);
              	
            }
            a3=(Token)match(input,38,FOLLOW_38_in_parse_org_kermeta_kp_MixExpression2950); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 97, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 97, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_MixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_MixExpression"


    // $ANTLR start "parse_org_kermeta_kp_Expression"
    // Kp.g:2665:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Kp.g:2666:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==QUOTED_34_34) ) {
                alt16=1;
            }
            else if ( (LA16_0==37) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Kp.g:2667:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2975);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2668:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2985);
                    c1=parse_org_kermeta_kp_MixExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_kermeta_kp_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject133 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject236 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject374 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject452 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject512 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject590 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject616 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject642 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject695 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject776 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject887 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_KermetaProject940 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1021 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject1080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1106 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1132 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject1185 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1266 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_KermetaProject1325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1377 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject1430 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1511 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_KermetaProject1570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1596 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1622 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject1675 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1756 = new BitSet(new long[]{0x000000000079D002L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_Source1843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_Source1866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source1894 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_Source1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_PackageEquivalence1960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence1978 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_PackageEquivalence2003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_Dependency2067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2085 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Dependency2115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency2156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Dependency2176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2217 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_Dependency2247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2273 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_Dependency2328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Dependency2348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency2374 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_Dependency2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_org_kermeta_kp_Dependency2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_org_kermeta_kp_Dependency2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_org_kermeta_kp_WeaveDirective2605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective2623 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_WeaveDirective2644 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2662 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_kermeta_kp_Option2717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2735 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_36_in_parse_org_kermeta_kp_Option2765 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Option2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_org_kermeta_kp_MixExpression2892 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2910 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2932 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_org_kermeta_kp_MixExpression2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2985 = new BitSet(new long[]{0x0000000000000002L});

}