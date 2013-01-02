// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "QUOTED_34_34", "QUOTED_40_41", "SL_COMMENT", "ML_COMMENT", "WHITESPACE", "LINEBREAK", "'project'", "'extends'", "','", "'{'", "'mainClass'", "'mainOperation'", "'javaBasePackage'", "'}'", "'packageEquivalence'", "'='", "'import'", "'using'", "'EMFBytecode'", "'importProject'", "'resource'", "'alternative'"
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
    public static final int TEXT=4;
    public static final int QUOTED_34_34=5;
    public static final int QUOTED_40_41=6;
    public static final int SL_COMMENT=7;
    public static final int ML_COMMENT=8;
    public static final int WHITESPACE=9;
    public static final int LINEBREAK=10;

    // delegates
    // delegators


        public KpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public KpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[20+1];
             
             
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
    			if (type.getInstanceClass() == org.kermeta.kp.PackageEquivalence.class) {
    				return parse_org_kermeta_kp_PackageEquivalence();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ImportFile.class) {
    				return parse_org_kermeta_kp_ImportFile();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ImportProject.class) {
    				return parse_org_kermeta_kp_ImportProject();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ImportProjectSources.class) {
    				return parse_org_kermeta_kp_ImportProjectSources();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ReusableResource.class) {
    				return parse_org_kermeta_kp_ReusableResource();
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
    		int followSetID = 55;
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
    // Kp.g:478:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Kp.g:479:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // Kp.g:480:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 0, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Kp.g:487:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // Kp.g:488:3: c0= parse_org_kermeta_kp_KermetaProject
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
    // Kp.g:496:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : ( ( (a0_0= parse_org_kermeta_kp_ReusableResource ) ) )* ( ( (a1_0= parse_org_kermeta_kp_ImportProject ) ) )* a2= 'project' (a3= TEXT ) ( (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* ) )? a8= '{' ( (a9= 'mainClass' (a10= QUOTED_34_34 ) ) )? ( (a11= 'mainOperation' (a12= QUOTED_34_34 ) ) )? ( (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) ) )? ( ( (a15_0= parse_org_kermeta_kp_ImportFile ) ) )* a16= '}' ;
    public final org.kermeta.kp.KermetaProject parse_org_kermeta_kp_KermetaProject() throws RecognitionException {
        org.kermeta.kp.KermetaProject element =  null;
        int parse_org_kermeta_kp_KermetaProject_StartIndex = input.index();
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a16=null;
        org.kermeta.kp.ReusableResource a0_0 = null;

        org.kermeta.kp.ImportProject a1_0 = null;

        org.kermeta.kp.ImportProjectSources a5_0 = null;

        org.kermeta.kp.ImportProjectSources a7_0 = null;

        org.kermeta.kp.ImportFile a15_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:499:1: ( ( ( (a0_0= parse_org_kermeta_kp_ReusableResource ) ) )* ( ( (a1_0= parse_org_kermeta_kp_ImportProject ) ) )* a2= 'project' (a3= TEXT ) ( (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* ) )? a8= '{' ( (a9= 'mainClass' (a10= QUOTED_34_34 ) ) )? ( (a11= 'mainOperation' (a12= QUOTED_34_34 ) ) )? ( (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) ) )? ( ( (a15_0= parse_org_kermeta_kp_ImportFile ) ) )* a16= '}' )
            // Kp.g:500:2: ( ( (a0_0= parse_org_kermeta_kp_ReusableResource ) ) )* ( ( (a1_0= parse_org_kermeta_kp_ImportProject ) ) )* a2= 'project' (a3= TEXT ) ( (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* ) )? a8= '{' ( (a9= 'mainClass' (a10= QUOTED_34_34 ) ) )? ( (a11= 'mainOperation' (a12= QUOTED_34_34 ) ) )? ( (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) ) )? ( ( (a15_0= parse_org_kermeta_kp_ImportFile ) ) )* a16= '}'
            {
            // Kp.g:500:2: ( ( (a0_0= parse_org_kermeta_kp_ReusableResource ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kp.g:501:3: ( (a0_0= parse_org_kermeta_kp_ReusableResource ) )
            	    {
            	    // Kp.g:501:3: ( (a0_0= parse_org_kermeta_kp_ReusableResource ) )
            	    // Kp.g:502:4: (a0_0= parse_org_kermeta_kp_ReusableResource )
            	    {
            	    // Kp.g:502:4: (a0_0= parse_org_kermeta_kp_ReusableResource )
            	    // Kp.g:503:5: a0_0= parse_org_kermeta_kp_ReusableResource
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_ReusableResource_in_parse_org_kermeta_kp_KermetaProject130);
            	    a0_0=parse_org_kermeta_kp_ReusableResource();

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
            	      					if (a0_0 != null) {
            	      						if (a0_0 != null) {
            	      							Object value = a0_0;
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_0_0_0_0, a0_0, true);
            	      						copyLocalizationInfos(a0_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 1, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 1, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 1);
            	      			
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 2);
              	
            }
            // Kp.g:539:2: ( ( (a1_0= parse_org_kermeta_kp_ImportProject ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Kp.g:540:3: ( (a1_0= parse_org_kermeta_kp_ImportProject ) )
            	    {
            	    // Kp.g:540:3: ( (a1_0= parse_org_kermeta_kp_ImportProject ) )
            	    // Kp.g:541:4: (a1_0= parse_org_kermeta_kp_ImportProject )
            	    {
            	    // Kp.g:541:4: (a1_0= parse_org_kermeta_kp_ImportProject )
            	    // Kp.g:542:5: a1_0= parse_org_kermeta_kp_ImportProject
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_ImportProject_in_parse_org_kermeta_kp_KermetaProject186);
            	    a1_0=parse_org_kermeta_kp_ImportProject();

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
            	      					if (a1_0 != null) {
            	      						if (a1_0 != null) {
            	      							Object value = a1_0;
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECTS, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_1_0_0_0, a1_0, true);
            	      						copyLocalizationInfos(a1_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 3, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 3);
            	      			
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 4);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject227); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 5);
              	
            }
            // Kp.g:590:2: (a3= TEXT )
            // Kp.g:591:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_KermetaProject245); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              				incompleteObjects.push(element);
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 6);
              	
            }
            // Kp.g:627:2: ( (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Kp.g:628:3: (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* )
                    {
                    // Kp.g:628:3: (a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )* )
                    // Kp.g:629:4: a4= 'extends' (a5_0= parse_org_kermeta_kp_ImportProjectSources ) ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )*
                    {
                    a4=(Token)match(input,12,FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject275); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			
                    }
                    // Kp.g:643:4: (a5_0= parse_org_kermeta_kp_ImportProjectSources )
                    // Kp.g:644:5: a5_0= parse_org_kermeta_kp_ImportProjectSources
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject301);
                    a5_0=parse_org_kermeta_kp_ImportProjectSources();

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
                      					if (a5_0 != null) {
                      						if (a5_0 != null) {
                      							Object value = a5_0;
                      							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES, value);
                      							completedElement(value, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_2, a5_0, true);
                      						copyLocalizationInfos(a5_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 8);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 8);
                      			
                    }
                    // Kp.g:670:4: ( (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Kp.g:671:5: (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) )
                    	    {
                    	    // Kp.g:671:5: (a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources ) )
                    	    // Kp.g:672:6: a6= ',' (a7_0= parse_org_kermeta_kp_ImportProjectSources )
                    	    {
                    	    a6=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject342); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 9, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                    	      					
                    	    }
                    	    // Kp.g:686:6: (a7_0= parse_org_kermeta_kp_ImportProjectSources )
                    	    // Kp.g:687:7: a7_0= parse_org_kermeta_kp_ImportProjectSources
                    	    {
                    	    pushFollow(FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject376);
                    	    a7_0=parse_org_kermeta_kp_ImportProjectSources();

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
                    	      							if (a7_0 != null) {
                    	      								if (a7_0 != null) {
                    	      									Object value = a7_0;
                    	      									addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES, value);
                    	      									completedElement(value, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_3_0_0_2, a7_0, true);
                    	      								copyLocalizationInfos(a7_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 10);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 11);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 11);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 12);
              	
            }
            a8=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject450); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 13);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 13);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 13);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 13);
              	
            }
            // Kp.g:746:2: ( (a9= 'mainClass' (a10= QUOTED_34_34 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Kp.g:747:3: (a9= 'mainClass' (a10= QUOTED_34_34 ) )
                    {
                    // Kp.g:747:3: (a9= 'mainClass' (a10= QUOTED_34_34 ) )
                    // Kp.g:748:4: a9= 'mainClass' (a10= QUOTED_34_34 )
                    {
                    a9=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject473); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 14);
                      			
                    }
                    // Kp.g:762:4: (a10= QUOTED_34_34 )
                    // Kp.g:763:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject499); if (state.failed) return element;
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
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 15);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 15);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 15);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 16);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 16);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 16);
              	
            }
            // Kp.g:811:2: ( (a11= 'mainOperation' (a12= QUOTED_34_34 ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kp.g:812:3: (a11= 'mainOperation' (a12= QUOTED_34_34 ) )
                    {
                    // Kp.g:812:3: (a11= 'mainOperation' (a12= QUOTED_34_34 ) )
                    // Kp.g:813:4: a11= 'mainOperation' (a12= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject554); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_8_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 17);
                      			
                    }
                    // Kp.g:827:4: (a12= QUOTED_34_34 )
                    // Kp.g:828:5: a12= QUOTED_34_34
                    {
                    a12=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject580); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      						incompleteObjects.push(element);
                      					}
                      					if (a12 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a12).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_8_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a12, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 18);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 18);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 19);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 19);
              	
            }
            // Kp.g:874:2: ( (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Kp.g:875:3: (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) )
                    {
                    // Kp.g:875:3: (a13= 'javaBasePackage' (a14= QUOTED_34_34 ) )
                    // Kp.g:876:4: a13= 'javaBasePackage' (a14= QUOTED_34_34 )
                    {
                    a13=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject635); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_9_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 20);
                      			
                    }
                    // Kp.g:890:4: (a14= QUOTED_34_34 )
                    // Kp.g:891:5: a14= QUOTED_34_34
                    {
                    a14=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject661); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      						incompleteObjects.push(element);
                      					}
                      					if (a14 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a14).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_9_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a14, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 21);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 22, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 22);
              	
            }
            // Kp.g:935:2: ( ( (a15_0= parse_org_kermeta_kp_ImportFile ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Kp.g:936:3: ( (a15_0= parse_org_kermeta_kp_ImportFile ) )
            	    {
            	    // Kp.g:936:3: ( (a15_0= parse_org_kermeta_kp_ImportFile ) )
            	    // Kp.g:937:4: (a15_0= parse_org_kermeta_kp_ImportFile )
            	    {
            	    // Kp.g:937:4: (a15_0= parse_org_kermeta_kp_ImportFile )
            	    // Kp.g:938:5: a15_0= parse_org_kermeta_kp_ImportFile
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_KermetaProject722);
            	    a15_0=parse_org_kermeta_kp_ImportFile();

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
            	      					if (a15_0 != null) {
            	      						if (a15_0 != null) {
            	      							Object value = a15_0;
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_FILES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_10_0_0_0, a15_0, true);
            	      						copyLocalizationInfos(a15_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 23, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 23);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 24, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 24);
              	
            }
            a16=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject763); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a16, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
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


    // $ANTLR start "parse_org_kermeta_kp_PackageEquivalence"
    // Kp.g:987:1: parse_org_kermeta_kp_PackageEquivalence returns [org.kermeta.kp.PackageEquivalence element = null] : a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.PackageEquivalence parse_org_kermeta_kp_PackageEquivalence() throws RecognitionException {
        org.kermeta.kp.PackageEquivalence element =  null;
        int parse_org_kermeta_kp_PackageEquivalence_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:990:1: (a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) )
            // Kp.g:991:2: a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_PackageEquivalence792); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 26);
              	
            }
            // Kp.g:1005:2: (a1= QUOTED_34_34 )
            // Kp.g:1006:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence810); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 27);
              	
            }
            // Kp.g:1041:2: (a2= '=' )
            // Kp.g:1042:3: a2= '='
            {
            a2=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_PackageEquivalence835); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              				incompleteObjects.push(element);
              			}
              			collectHiddenTokens(element);
              			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_4_0_0_0, null, true);
              			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              		
            }
            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 28);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 29);
              	
            }
            // Kp.g:1062:2: (a3= QUOTED_34_34 )
            // Kp.g:1063:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence863); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_5, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 30);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_kermeta_kp_PackageEquivalence_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_PackageEquivalence"


    // $ANTLR start "parse_org_kermeta_kp_ImportFile"
    // Kp.g:1101:1: parse_org_kermeta_kp_ImportFile returns [org.kermeta.kp.ImportFile element = null] : a0= 'import' (a1= QUOTED_34_34 ) ( (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? ) )? ;
    public final org.kermeta.kp.ImportFile parse_org_kermeta_kp_ImportFile() throws RecognitionException {
        org.kermeta.kp.ImportFile element =  null;
        int parse_org_kermeta_kp_ImportFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        org.kermeta.kp.PackageEquivalence a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1104:1: (a0= 'import' (a1= QUOTED_34_34 ) ( (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? ) )? )
            // Kp.g:1105:2: a0= 'import' (a1= QUOTED_34_34 ) ( (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? ) )?
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_ImportFile899); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 31);
              	
            }
            // Kp.g:1119:2: (a1= QUOTED_34_34 )
            // Kp.g:1120:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile917); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 32);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 32);
              	
            }
            // Kp.g:1157:2: ( (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Kp.g:1158:3: (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? )
                    {
                    // Kp.g:1158:3: (a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )? )
                    // Kp.g:1159:4: a2= 'using' a3= 'EMFBytecode' (a4= QUOTED_40_41 ) ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )?
                    {
                    a2=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_ImportFile947); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 33);
                      			
                    }
                    a3=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_ImportFile967); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 34);
                      			
                    }
                    // Kp.g:1187:4: (a4= QUOTED_40_41 )
                    // Kp.g:1188:5: a4= QUOTED_40_41
                    {
                    a4=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_org_kermeta_kp_ImportFile993); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						org.kermeta.kp.ReusableResource proxy = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportFile, org.kermeta.kp.ReusableResource>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportFileBytecodeFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_2, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 35);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 35);
                      			
                    }
                    // Kp.g:1229:4: ( (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==14) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Kp.g:1230:5: (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' )
                            {
                            // Kp.g:1230:5: (a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}' )
                            // Kp.g:1231:6: a5= '{' ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* a7= '}'
                            {
                            a5=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_ImportFile1039); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_3_0_0_0, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 36);
                              					
                            }
                            // Kp.g:1246:6: ( ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==19) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // Kp.g:1247:7: ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) )
                            	    {
                            	    // Kp.g:1247:7: ( (a6_0= parse_org_kermeta_kp_PackageEquivalence ) )
                            	    // Kp.g:1248:8: (a6_0= parse_org_kermeta_kp_PackageEquivalence )
                            	    {
                            	    // Kp.g:1248:8: (a6_0= parse_org_kermeta_kp_PackageEquivalence )
                            	    // Kp.g:1249:9: a6_0= parse_org_kermeta_kp_PackageEquivalence
                            	    {
                            	    pushFollow(FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile1092);
                            	    a6_0=parse_org_kermeta_kp_PackageEquivalence();

                            	    state._fsp--;
                            	    if (state.failed) return element;
                            	    if ( state.backtracking==0 ) {

                            	      									if (terminateParsing) {
                            	      										throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                            	      									}
                            	      									if (element == null) {
                            	      										element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                            	      										incompleteObjects.push(element);
                            	      									}
                            	      									if (a6_0 != null) {
                            	      										if (a6_0 != null) {
                            	      											Object value = a6_0;
                            	      											addObjectToList(element, org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES, value);
                            	      											completedElement(value, true);
                            	      										}
                            	      										collectHiddenTokens(element);
                            	      										retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_3_0_0_1_0_0_0, a6_0, true);
                            	      										copyLocalizationInfos(a6_0, element);
                            	      									}
                            	      								
                            	    }

                            	    }

                            	    if ( state.backtracking==0 ) {

                            	      								// expected elements (follow set)
                            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                            	      								addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 37);
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 38);
                              					
                            }
                            a7=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_ImportFile1173); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_3_0_0_2, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 39);
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 40);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 41);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_ImportFile_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportFile"


    // $ANTLR start "parse_org_kermeta_kp_ImportProject"
    // Kp.g:1316:1: parse_org_kermeta_kp_ImportProject returns [org.kermeta.kp.ImportProject element = null] : a0= 'importProject' (a1= TEXT ) ;
    public final org.kermeta.kp.ImportProject parse_org_kermeta_kp_ImportProject() throws RecognitionException {
        org.kermeta.kp.ImportProject element =  null;
        int parse_org_kermeta_kp_ImportProject_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1319:1: (a0= 'importProject' (a1= TEXT ) )
            // Kp.g:1320:2: a0= 'importProject' (a1= TEXT )
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_ImportProject1250); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 42);
              	
            }
            // Kp.g:1334:2: (a1= TEXT )
            // Kp.g:1335:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportProject1268); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProject();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.ReusableResource proxy = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportProject, org.kermeta.kp.ReusableResource>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportProjectProjectResourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE), resolved, proxy);
              				if (proxy != null) {
              					Object value = proxy;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3, proxy, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 43);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_ImportProject_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportProject"


    // $ANTLR start "parse_org_kermeta_kp_ImportProjectSources"
    // Kp.g:1377:1: parse_org_kermeta_kp_ImportProjectSources returns [org.kermeta.kp.ImportProjectSources element = null] : (a0= TEXT ) ;
    public final org.kermeta.kp.ImportProjectSources parse_org_kermeta_kp_ImportProjectSources() throws RecognitionException {
        org.kermeta.kp.ImportProjectSources element =  null;
        int parse_org_kermeta_kp_ImportProjectSources_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:1380:1: ( (a0= TEXT ) )
            // Kp.g:1381:2: (a0= TEXT )
            {
            // Kp.g:1381:2: (a0= TEXT )
            // Kp.g:1382:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportProjectSources1308); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.ReusableResource proxy = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportProjectSources, org.kermeta.kp.ReusableResource>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportProjectSourcesProjectResourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE), resolved, proxy);
              				if (proxy != null) {
              					Object value = proxy;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__PROJECT_RESOURCE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_0, proxy, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 44);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 44);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_ImportProjectSources_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportProjectSources"


    // $ANTLR start "parse_org_kermeta_kp_ReusableResource"
    // Kp.g:1424:1: parse_org_kermeta_kp_ReusableResource returns [org.kermeta.kp.ReusableResource element = null] : a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )? ;
    public final org.kermeta.kp.ReusableResource parse_org_kermeta_kp_ReusableResource() throws RecognitionException {
        org.kermeta.kp.ReusableResource element =  null;
        int parse_org_kermeta_kp_ReusableResource_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kp.g:1427:1: (a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )? )
            // Kp.g:1428:2: a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )?
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_ReusableResource1344); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 45);
              	
            }
            // Kp.g:1442:2: (a1= TEXT )
            // Kp.g:1443:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1362); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 46);
              	
            }
            a2=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_ReusableResource1383); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 47);
              	
            }
            // Kp.g:1492:2: (a3= QUOTED_34_34 )
            // Kp.g:1493:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1401); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				incompleteObjects.push(element);
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_7, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 48);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 48);
              	
            }
            // Kp.g:1531:2: ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Kp.g:1532:3: (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* )
                    {
                    // Kp.g:1532:3: (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* )
                    // Kp.g:1533:4: a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
                    {
                    a4=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_ReusableResource1431); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_8_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 49);
                      			
                    }
                    // Kp.g:1547:4: (a5= QUOTED_34_34 )
                    // Kp.g:1548:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1457); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      						incompleteObjects.push(element);
                      					}
                      					if (a5 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_8_0_0_3, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 50);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 50);
                      			
                    }
                    // Kp.g:1586:4: ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Kp.g:1587:5: (a6= ',' (a7= QUOTED_34_34 ) )
                    	    {
                    	    // Kp.g:1587:5: (a6= ',' (a7= QUOTED_34_34 ) )
                    	    // Kp.g:1588:6: a6= ',' (a7= QUOTED_34_34 )
                    	    {
                    	    a6=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_ReusableResource1503); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_8_0_0_4_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 51);
                    	      					
                    	    }
                    	    // Kp.g:1602:6: (a7= QUOTED_34_34 )
                    	    // Kp.g:1603:7: a7= QUOTED_34_34
                    	    {
                    	    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1537); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                    	      								incompleteObjects.push(element);
                    	      							}
                    	      							if (a7 != null) {
                    	      								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
                    	      								Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                    	      								}
                    	      								java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      								if (resolved != null) {
                    	      									Object value = resolved;
                    	      									addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
                    	      									completedElement(value, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_8_0_0_4_0_0_2, resolved, true);
                    	      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 52);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 52);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 53);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 53);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 54);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_ReusableResource_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ReusableResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ReusableResource_in_parse_org_kermeta_kp_KermetaProject130 = new BitSet(new long[]{0x0000000003000800L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProject_in_parse_org_kermeta_kp_KermetaProject186 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_KermetaProject245 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject301 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject376 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject450 = new BitSet(new long[]{0x0000000000278000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject499 = new BitSet(new long[]{0x0000000000270000L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject580 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject661 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_KermetaProject722 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_PackageEquivalence792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_PackageEquivalence835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_ImportFile899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile917 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_ImportFile947 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_ImportFile967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_org_kermeta_kp_ImportFile993 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_ImportFile1039 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile1092 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_ImportFile1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_ImportProject1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportProject1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportProjectSources1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_ReusableResource1344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1362 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_ReusableResource1383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1401 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_ReusableResource1431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1457 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_ReusableResource1503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1537 = new BitSet(new long[]{0x0000000000002002L});

}