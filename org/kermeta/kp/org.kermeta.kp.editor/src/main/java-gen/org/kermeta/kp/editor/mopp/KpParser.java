// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "SL_COMMENT", "ML_COMMENT", "FLOAT", "TEXT", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "'groupId'", "'='", "'defaultMainClass'", "'defaultMainOperation'", "'dependencies'", "'{'", "'}'", "'sources'", "'options'", "'weaveDirectives'", "'require'", "'source'", "'byteCodeFromADependency'", "'dependency'", "'URLs'", "','", "'ignoreByteCode'", "'sourceOnly'", "'weaver-directive'", "'option'", "'value'", "'('", "')'"
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
            this.state.ruleMemo = new HashMap[28+1];
             
             
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
    		int followSetID = 81;
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
    // Kp.g:481:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Kp.g:482:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // Kp.g:483:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Kp.g:488:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // Kp.g:489:3: c0= parse_org_kermeta_kp_KermetaProject
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
    // Kp.g:497:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) ) )* ;
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
        org.kermeta.kp.Dependency a14_0 = null;

        org.kermeta.kp.Source a19_0 = null;

        org.kermeta.kp.Option a24_0 = null;

        org.kermeta.kp.WeaveDirective a29_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:500:1: (a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) ) )* )
            // Kp.g:501:2: a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) ) )*
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
            // Kp.g:515:2: (a1= QUOTED_34_34 )
            // Kp.g:516:3: a1= QUOTED_34_34
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
              	
            }
            // Kp.g:557:2: ( ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||(LA6_0>=14 && LA6_0<=16)||(LA6_0>=19 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Kp.g:558:3: ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) )
            	    {
            	    // Kp.g:558:3: ( ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) ) )
            	    // Kp.g:559:4: ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) )
            	    {
            	    // Kp.g:559:4: ( (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) ) | (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) ) | (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) ) | (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' ) | (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' ) | (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' ) | (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' ) )
            	    int alt5=7;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt5=5;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt5=6;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt5=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // Kp.g:560:5: (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:560:5: (a2= 'groupId' a3= '=' (a4= QUOTED_34_34 ) )
            	            // Kp.g:561:6: a2= 'groupId' a3= '=' (a4= QUOTED_34_34 )
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 3);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 4);
            	              					
            	            }
            	            // Kp.g:589:6: (a4= QUOTED_34_34 )
            	            // Kp.g:590:7: a4= QUOTED_34_34
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
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Kp.g:644:10: (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:644:10: (a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 ) )
            	            // Kp.g:645:6: a5= 'defaultMainClass' a6= '=' (a7= QUOTED_34_34 )
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 7);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 8);
            	              					
            	            }
            	            // Kp.g:673:6: (a7= QUOTED_34_34 )
            	            // Kp.g:674:7: a7= QUOTED_34_34
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
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Kp.g:728:10: (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) )
            	            {
            	            // Kp.g:728:10: (a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 ) )
            	            // Kp.g:729:6: a8= 'defaultMainOperation' a9= '=' (a10= QUOTED_34_34 )
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 11);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 12);
            	              					
            	            }
            	            // Kp.g:757:6: (a10= QUOTED_34_34 )
            	            // Kp.g:758:7: a10= QUOTED_34_34
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
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Kp.g:812:10: (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' )
            	            {
            	            // Kp.g:812:10: (a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}' )
            	            // Kp.g:813:6: a11= 'dependencies' a12= '=' a13= '{' ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )* a15= '}'
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 15);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 16);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 17);
            	              					
            	            }
            	            // Kp.g:856:6: ( ( (a14_0= parse_org_kermeta_kp_Dependency ) ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( (LA1_0==25) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // Kp.g:857:7: ( (a14_0= parse_org_kermeta_kp_Dependency ) )
            	            	    {
            	            	    // Kp.g:857:7: ( (a14_0= parse_org_kermeta_kp_Dependency ) )
            	            	    // Kp.g:858:8: (a14_0= parse_org_kermeta_kp_Dependency )
            	            	    {
            	            	    // Kp.g:858:8: (a14_0= parse_org_kermeta_kp_Dependency )
            	            	    // Kp.g:859:9: a14_0= parse_org_kermeta_kp_Dependency
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
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 18);
            	            	      							
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 19);
            	              					
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
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Kp.g:926:10: (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' )
            	            {
            	            // Kp.g:926:10: (a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}' )
            	            // Kp.g:927:6: a16= 'sources' a17= '=' a18= '{' ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )* a20= '}'
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 22);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 23);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 24, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 24, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 24);
            	              					
            	            }
            	            // Kp.g:971:6: ( ( (a19_0= parse_org_kermeta_kp_Source ) ) )*
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( ((LA2_0>=22 && LA2_0<=23)) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // Kp.g:972:7: ( (a19_0= parse_org_kermeta_kp_Source ) )
            	            	    {
            	            	    // Kp.g:972:7: ( (a19_0= parse_org_kermeta_kp_Source ) )
            	            	    // Kp.g:973:8: (a19_0= parse_org_kermeta_kp_Source )
            	            	    {
            	            	    // Kp.g:973:8: (a19_0= parse_org_kermeta_kp_Source )
            	            	    // Kp.g:974:9: a19_0= parse_org_kermeta_kp_Source
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject940);
            	            	    a19_0=parse_org_kermeta_kp_Source();

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
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, value);
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
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 25, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
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
            	              				
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Kp.g:1043:10: (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' )
            	            {
            	            // Kp.g:1043:10: (a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}' )
            	            // Kp.g:1044:6: a21= 'options' a22= '=' a23= '{' ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )* a25= '}'
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 31);
            	              					
            	            }
            	            // Kp.g:1087:6: ( ( (a24_0= parse_org_kermeta_kp_Option ) ) )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==31) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // Kp.g:1088:7: ( (a24_0= parse_org_kermeta_kp_Option ) )
            	            	    {
            	            	    // Kp.g:1088:7: ( (a24_0= parse_org_kermeta_kp_Option ) )
            	            	    // Kp.g:1089:8: (a24_0= parse_org_kermeta_kp_Option )
            	            	    {
            	            	    // Kp.g:1089:8: (a24_0= parse_org_kermeta_kp_Option )
            	            	    // Kp.g:1090:9: a24_0= parse_org_kermeta_kp_Option
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject1185);
            	            	    a24_0=parse_org_kermeta_kp_Option();

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
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, value);
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
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 32);
            	            	      							
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 33);
            	              					
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
            	              				
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // Kp.g:1157:10: (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' )
            	            {
            	            // Kp.g:1157:10: (a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}' )
            	            // Kp.g:1158:6: a26= 'weaveDirectives' a27= '=' a28= '{' ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a30= '}'
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 36);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 37);
            	              					
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 38);
            	              					
            	            }
            	            // Kp.g:1201:6: ( ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) ) )*
            	            loop4:
            	            do {
            	                int alt4=2;
            	                int LA4_0 = input.LA(1);

            	                if ( (LA4_0==30) ) {
            	                    alt4=1;
            	                }


            	                switch (alt4) {
            	            	case 1 :
            	            	    // Kp.g:1202:7: ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) )
            	            	    {
            	            	    // Kp.g:1202:7: ( (a29_0= parse_org_kermeta_kp_WeaveDirective ) )
            	            	    // Kp.g:1203:8: (a29_0= parse_org_kermeta_kp_WeaveDirective )
            	            	    {
            	            	    // Kp.g:1203:8: (a29_0= parse_org_kermeta_kp_WeaveDirective )
            	            	    // Kp.g:1204:9: a29_0= parse_org_kermeta_kp_WeaveDirective
            	            	    {
            	            	    pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject1430);
            	            	    a29_0=parse_org_kermeta_kp_WeaveDirective();

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
            	            	      											addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, value);
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
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 39);
            	            	      							
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
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 40);
            	              					
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
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 43);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 43);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 44);
              	
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
    // Kp.g:1297:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? ) ;
    public final org.kermeta.kp.Source parse_org_kermeta_kp_Source() throws RecognitionException {
        org.kermeta.kp.Source element =  null;
        int parse_org_kermeta_kp_Source_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:1300:1: ( (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? ) )
            // Kp.g:1301:2: (a0= 'require' | a1= 'source' ) (a2= QUOTED_34_34 ) ( (a3= 'byteCodeFromADependency' )? )
            {
            // Kp.g:1301:2: (a0= 'require' | a1= 'source' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Kp.g:1302:3: a0= 'require'
                    {
                    a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_Source1598); if (state.failed) return element;
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
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 45);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1322:6: a1= 'source'
                    {
                    a1=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_Source1621); if (state.failed) return element;
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
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 46);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 47);
              	
            }
            // Kp.g:1347:2: (a2= QUOTED_34_34 )
            // Kp.g:1348:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source1649); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 48);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 48);
              	
            }
            // Kp.g:1391:2: ( (a3= 'byteCodeFromADependency' )? )
            // Kp.g:1392:3: (a3= 'byteCodeFromADependency' )?
            {
            // Kp.g:1392:3: (a3= 'byteCodeFromADependency' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Kp.g:1393:4: a3= 'byteCodeFromADependency'
                    {
                    a3=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_Source1679); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 49);
              	
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


    // $ANTLR start "parse_org_kermeta_kp_Dependency"
    // Kp.g:1421:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) ) )? ;
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
        Token a11=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1424:1: (a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) ) )? )
            // Kp.g:1425:2: a0= 'dependency' (a1= QUOTED_34_34 ) ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) ) (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ( ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) ) )?
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_Dependency1715); if (state.failed) return element;
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
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 50);
              	
            }
            // Kp.g:1449:2: (a1= QUOTED_34_34 )
            // Kp.g:1450:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1733); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 51);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 51);
              	
            }
            // Kp.g:1496:2: ( (a2= '=' ) | (a3= 'URLs' a4= '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Kp.g:1497:3: (a2= '=' )
                    {
                    // Kp.g:1497:3: (a2= '=' )
                    // Kp.g:1498:4: a2= '='
                    {
                    a2=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Dependency1763); if (state.failed) return element;
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
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 52);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 53);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1529:6: (a3= 'URLs' a4= '=' )
                    {
                    // Kp.g:1529:6: (a3= 'URLs' a4= '=' )
                    // Kp.g:1530:4: a3= 'URLs' a4= '='
                    {
                    a3=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_Dependency1804); if (state.failed) return element;
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
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_1_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_38, 54);
                      			
                    }
                    a4=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Dependency1824); if (state.failed) return element;
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
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_1_0_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 55);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 56);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 57);
              	
            }
            // Kp.g:1590:2: (a5= QUOTED_34_34 )
            // Kp.g:1591:3: a5= QUOTED_34_34
            {
            a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1865); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 58);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 58);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 58);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 58);
              	
            }
            // Kp.g:1640:2: ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Kp.g:1641:3: (a6= ',' (a7= QUOTED_34_34 ) )
            	    {
            	    // Kp.g:1641:3: (a6= ',' (a7= QUOTED_34_34 ) )
            	    // Kp.g:1642:4: a6= ',' (a7= QUOTED_34_34 )
            	    {
            	    a6=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_Dependency1895); if (state.failed) return element;
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
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_5_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_42, 59);
            	      			
            	    }
            	    // Kp.g:1666:4: (a7= QUOTED_34_34 )
            	    // Kp.g:1667:5: a7= QUOTED_34_34
            	    {
            	    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1921); if (state.failed) return element;
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
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_5_0_0_1, resolved, true);
            	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 60);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 60);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 60);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 60);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 61);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 61);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 61);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 61);
              	
            }
            // Kp.g:1727:2: ( ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=28 && LA12_0<=29)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Kp.g:1728:3: ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) )
                    {
                    // Kp.g:1728:3: ( ( (a8= 'ignoreByteCode' ) ) | ( (a11= 'sourceOnly' ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==28) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==29) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // Kp.g:1729:4: ( (a8= 'ignoreByteCode' ) )
                            {
                            // Kp.g:1729:4: ( (a8= 'ignoreByteCode' ) )
                            // Kp.g:1730:5: (a8= 'ignoreByteCode' )
                            {
                            // Kp.g:1730:5: (a8= 'ignoreByteCode' )
                            // Kp.g:1731:6: a8= 'ignoreByteCode'
                            {
                            a8=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency1989); if (state.failed) return element;
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
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_6_0_0_0, true, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                              						// set value of boolean attribute
                              						Object value = true;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE), value);
                              						completedElement(value, false);
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 62);
                              			
                            }

                            }
                            break;
                        case 2 :
                            // Kp.g:1763:8: ( (a11= 'sourceOnly' ) )
                            {
                            // Kp.g:1763:8: ( (a11= 'sourceOnly' ) )
                            // Kp.g:1764:5: (a11= 'sourceOnly' )
                            {
                            // Kp.g:1764:5: (a11= 'sourceOnly' )
                            // Kp.g:1765:6: a11= 'sourceOnly'
                            {
                            a11=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_Dependency2041); if (state.failed) return element;
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
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_6_0_1_0, true, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                              						// set value of boolean attribute
                              						Object value = true;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY), value);
                              						completedElement(value, false);
                              					
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {

                              				// expected elements (follow set)
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 63);
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 64);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_Dependency_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Dependency"


    // $ANTLR start "parse_org_kermeta_kp_WeaveDirective"
    // Kp.g:1806:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
    public final org.kermeta.kp.WeaveDirective parse_org_kermeta_kp_WeaveDirective() throws RecognitionException {
        org.kermeta.kp.WeaveDirective element =  null;
        int parse_org_kermeta_kp_WeaveDirective_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.Expression a3_0 = null;

        org.kermeta.kp.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1809:1: (a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // Kp.g:1810:2: a0= 'weaver-directive' (a1= QUOTED_34_34 ) a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_WeaveDirective2100); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_43, 65);
              	
            }
            // Kp.g:1824:2: (a1= QUOTED_34_34 )
            // Kp.g:1825:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective2118); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_44, 66);
              	
            }
            a2=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_WeaveDirective2139); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:1875:2: (a3_0= parse_org_kermeta_kp_Expression )
            // Kp.g:1876:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2157);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_4, a3_0, true);
              				copyLocalizationInfos(a3_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }
            // Kp.g:1902:2: (a4_0= parse_org_kermeta_kp_Expression )
            // Kp.g:1903:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2179);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_5, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_WeaveDirective_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_WeaveDirective"


    // $ANTLR start "parse_org_kermeta_kp_Option"
    // Kp.g:1931:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:1934:1: (a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 ) )
            // Kp.g:1935:2: a0= 'option' (a1= QUOTED_34_34 ) ( (a2= 'value' ) )? a3= '=' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_Option2212); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 70);
              	
            }
            // Kp.g:1949:2: (a1= QUOTED_34_34 )
            // Kp.g:1950:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2230); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 71);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 71);
              	
            }
            // Kp.g:1986:2: ( (a2= 'value' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Kp.g:1987:3: (a2= 'value' )
                    {
                    // Kp.g:1987:3: (a2= 'value' )
                    // Kp.g:1988:4: a2= 'value'
                    {
                    a2=(Token)match(input,32,FOLLOW_32_in_parse_org_kermeta_kp_Option2260); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 72);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 73);
              	
            }
            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_Option2293); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 74);
              	
            }
            // Kp.g:2023:2: (a4= QUOTED_34_34 )
            // Kp.g:2024:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2311); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_5, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 75);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Option"


    // $ANTLR start "parse_org_kermeta_kp_StringExpression"
    // Kp.g:2062:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kp.g:2065:1: ( (a0= QUOTED_34_34 ) )
            // Kp.g:2066:2: (a0= QUOTED_34_34 )
            {
            // Kp.g:2066:2: (a0= QUOTED_34_34 )
            // Kp.g:2067:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2351); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_StringExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_StringExpression"


    // $ANTLR start "parse_org_kermeta_kp_MixExpression"
    // Kp.g:2105:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kp.g:2108:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // Kp.g:2109:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_org_kermeta_kp_MixExpression2387); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 77, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 77, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }
            // Kp.g:2124:2: (a1_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2125:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2405);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              	
            }
            // Kp.g:2151:2: (a2_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2152:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2427);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 79);
              	
            }
            a3=(Token)match(input,34,FOLLOW_34_in_parse_org_kermeta_kp_MixExpression2445); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 80, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 80, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_MixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_MixExpression"


    // $ANTLR start "parse_org_kermeta_kp_Expression"
    // Kp.g:2194:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Kp.g:2195:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUOTED_34_34) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // Kp.g:2196:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2470);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2197:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2480);
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
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject133 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject236 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject374 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject452 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject512 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject590 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject616 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject642 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject695 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject776 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject887 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject940 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1021 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject1080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1106 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1132 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject1185 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1266 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_KermetaProject1325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject1351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject1377 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject1430 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject1511 = new BitSet(new long[]{0x000000000039D002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_Source1598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_Source1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source1649 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_Source1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_Dependency1715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1733 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Dependency1763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_Dependency1804 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Dependency1824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1865 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_Dependency1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1921 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_Dependency2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_WeaveDirective2100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective2118 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_WeaveDirective2139 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2157 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_Option2212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2230 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_32_in_parse_org_kermeta_kp_Option2260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_Option2293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_org_kermeta_kp_MixExpression2387 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2405 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2427 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_org_kermeta_kp_MixExpression2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2480 = new BitSet(new long[]{0x0000000000000002L});

}