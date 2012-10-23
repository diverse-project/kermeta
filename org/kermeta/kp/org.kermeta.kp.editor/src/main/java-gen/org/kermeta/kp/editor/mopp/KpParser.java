// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "TEXT", "SL_COMMENT", "ML_COMMENT", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "'defaultMainClass'", "'defaultMainOperation'", "'javaBasePackage'", "'packageEquivalence'", "'='", "'importFile'", "'withBytecodeFrom'", "'importProjectJar'", "'importProjectSource'", "'importBytecodeJar'", "'resource'", "'alternative'", "','"
    };
    public static final int EOF=-1;
    public static final int T__10=10;
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
    public static final int QUOTED_34_34=4;
    public static final int TEXT=5;
    public static final int SL_COMMENT=6;
    public static final int ML_COMMENT=7;
    public static final int WHITESPACE=8;
    public static final int LINEBREAK=9;

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
    			if (type.getInstanceClass() == org.kermeta.kp.ImportProjectJar.class) {
    				return parse_org_kermeta_kp_ImportProjectJar();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ImportProjectSources.class) {
    				return parse_org_kermeta_kp_ImportProjectSources();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.ImportBytecodeJar.class) {
    				return parse_org_kermeta_kp_ImportBytecodeJar();
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
    		int followSetID = 50;
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
    // Kp.g:497:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )* ;
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
        org.kermeta.kp.ImportFile a8_0 = null;

        org.kermeta.kp.ImportProjectJar a9_0 = null;

        org.kermeta.kp.ImportProjectSources a10_0 = null;

        org.kermeta.kp.ImportBytecodeJar a11_0 = null;

        org.kermeta.kp.ReusableResource a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:500:1: (a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )* )
            // Kp.g:501:2: a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )*
            {
            a0=(Token)match(input,10,FOLLOW_10_in_parse_org_kermeta_kp_KermetaProject115); if (state.failed) return element;
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
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), value);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:558:2: ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Kp.g:559:3: (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) )
                    {
                    // Kp.g:559:3: (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) )
                    // Kp.g:560:4: a2= 'defaultMainClass' (a3= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,11,FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject163); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_3_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 3);
                      			
                    }
                    // Kp.g:574:4: (a3= QUOTED_34_34 )
                    // Kp.g:575:5: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject189); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_3_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:629:2: ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Kp.g:630:3: (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) )
                    {
                    // Kp.g:630:3: (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) )
                    // Kp.g:631:4: a4= 'defaultMainOperation' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,12,FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject244); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 6);
                      			
                    }
                    // Kp.g:645:4: (a5= QUOTED_34_34 )
                    // Kp.g:646:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject270); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      						incompleteObjects.push(element);
                      					}
                      					if (a5 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 7);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 8);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:698:2: ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Kp.g:699:3: (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) )
                    {
                    // Kp.g:699:3: (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) )
                    // Kp.g:700:4: a6= 'javaBasePackage' (a7= QUOTED_34_34 )
                    {
                    a6=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject325); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 9);
                      			
                    }
                    // Kp.g:714:4: (a7= QUOTED_34_34 )
                    // Kp.g:715:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject351); if (state.failed) return element;
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
                      						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:765:2: ( ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||(LA5_0>=18 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Kp.g:766:3: ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) )
            	    {
            	    // Kp.g:766:3: ( ( (a8_0= parse_org_kermeta_kp_ImportFile ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) )
            	    int alt4=5;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt4=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // Kp.g:767:4: ( (a8_0= parse_org_kermeta_kp_ImportFile ) )
            	            {
            	            // Kp.g:767:4: ( (a8_0= parse_org_kermeta_kp_ImportFile ) )
            	            // Kp.g:768:5: (a8_0= parse_org_kermeta_kp_ImportFile )
            	            {
            	            // Kp.g:768:5: (a8_0= parse_org_kermeta_kp_ImportFile )
            	            // Kp.g:769:6: a8_0= parse_org_kermeta_kp_ImportFile
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_KermetaProject419);
            	            a8_0=parse_org_kermeta_kp_ImportFile();

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
            	              						if (a8_0 != null) {
            	              							if (a8_0 != null) {
            	              								Object value = a8_0;
            	              								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_FILES, value);
            	              								completedElement(value, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_0_0_0_0_0, a8_0, true);
            	              							copyLocalizationInfos(a8_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Kp.g:809:8: ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) )
            	            {
            	            // Kp.g:809:8: ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) )
            	            // Kp.g:810:5: (a9_0= parse_org_kermeta_kp_ImportProjectJar )
            	            {
            	            // Kp.g:810:5: (a9_0= parse_org_kermeta_kp_ImportProjectJar )
            	            // Kp.g:811:6: a9_0= parse_org_kermeta_kp_ImportProjectJar
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_ImportProjectJar_in_parse_org_kermeta_kp_KermetaProject486);
            	            a9_0=parse_org_kermeta_kp_ImportProjectJar();

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
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								Object value = a9_0;
            	              								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS, value);
            	              								completedElement(value, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_1_0_0_0_0, a9_0, true);
            	              							copyLocalizationInfos(a9_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Kp.g:851:8: ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) )
            	            {
            	            // Kp.g:851:8: ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) )
            	            // Kp.g:852:5: (a10_0= parse_org_kermeta_kp_ImportProjectSources )
            	            {
            	            // Kp.g:852:5: (a10_0= parse_org_kermeta_kp_ImportProjectSources )
            	            // Kp.g:853:6: a10_0= parse_org_kermeta_kp_ImportProjectSources
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject553);
            	            a10_0=parse_org_kermeta_kp_ImportProjectSources();

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
            	              						if (a10_0 != null) {
            	              							if (a10_0 != null) {
            	              								Object value = a10_0;
            	              								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES, value);
            	              								completedElement(value, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_2_0_0_0_0, a10_0, true);
            	              							copyLocalizationInfos(a10_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Kp.g:893:8: ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) )
            	            {
            	            // Kp.g:893:8: ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) )
            	            // Kp.g:894:5: (a11_0= parse_org_kermeta_kp_ImportBytecodeJar )
            	            {
            	            // Kp.g:894:5: (a11_0= parse_org_kermeta_kp_ImportBytecodeJar )
            	            // Kp.g:895:6: a11_0= parse_org_kermeta_kp_ImportBytecodeJar
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_ImportBytecodeJar_in_parse_org_kermeta_kp_KermetaProject620);
            	            a11_0=parse_org_kermeta_kp_ImportBytecodeJar();

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
            	              						if (a11_0 != null) {
            	              							if (a11_0 != null) {
            	              								Object value = a11_0;
            	              								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS, value);
            	              								completedElement(value, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_3_0_0_0_0, a11_0, true);
            	              							copyLocalizationInfos(a11_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              			
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Kp.g:935:8: (a12_0= parse_org_kermeta_kp_ReusableResource )
            	            {
            	            // Kp.g:935:8: (a12_0= parse_org_kermeta_kp_ReusableResource )
            	            // Kp.g:936:5: a12_0= parse_org_kermeta_kp_ReusableResource
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_ReusableResource_in_parse_org_kermeta_kp_KermetaProject680);
            	            a12_0=parse_org_kermeta_kp_ReusableResource();

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
            	              					if (a12_0 != null) {
            	              						if (a12_0 != null) {
            	              							Object value = a12_0;
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_4_0, a12_0, true);
            	              						copyLocalizationInfos(a12_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
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
    // Kp.g:978:1: parse_org_kermeta_kp_PackageEquivalence returns [org.kermeta.kp.PackageEquivalence element = null] : a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.PackageEquivalence parse_org_kermeta_kp_PackageEquivalence() throws RecognitionException {
        org.kermeta.kp.PackageEquivalence element =  null;
        int parse_org_kermeta_kp_PackageEquivalence_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:981:1: (a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) )
            // Kp.g:982:2: a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_PackageEquivalence736); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 22);
              	
            }
            // Kp.g:996:2: (a1= QUOTED_34_34 )
            // Kp.g:997:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence754); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 23);
              	
            }
            // Kp.g:1032:2: (a2= '=' )
            // Kp.g:1033:3: a2= '='
            {
            a2=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_PackageEquivalence779); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
              				incompleteObjects.push(element);
              			}
              			collectHiddenTokens(element);
              			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_3_0_0_0, null, true);
              			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              		
            }
            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 24);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 25);
              	
            }
            // Kp.g:1053:2: (a3= QUOTED_34_34 )
            // Kp.g:1054:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence807); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
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
    // Kp.g:1096:1: parse_org_kermeta_kp_ImportFile returns [org.kermeta.kp.ImportFile element = null] : a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )? ;
    public final org.kermeta.kp.ImportFile parse_org_kermeta_kp_ImportFile() throws RecognitionException {
        org.kermeta.kp.ImportFile element =  null;
        int parse_org_kermeta_kp_ImportFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        org.kermeta.kp.PackageEquivalence a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1099:1: (a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )? )
            // Kp.g:1100:2: a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )?
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_ImportFile843); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 27);
              	
            }
            // Kp.g:1114:2: (a1= QUOTED_34_34 )
            // Kp.g:1115:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile861); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 28);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:1155:2: ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Kp.g:1156:3: (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* )
                    {
                    // Kp.g:1156:3: (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* )
                    // Kp.g:1157:4: a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
                    {
                    a2=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_ImportFile891); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 29);
                      			
                    }
                    // Kp.g:1171:4: (a3= TEXT )
                    // Kp.g:1172:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportFile917); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      						incompleteObjects.push(element);
                      					}
                      					if (a3 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
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
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }
                    // Kp.g:1216:4: ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Kp.g:1217:5: ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) )
                    	    {
                    	    // Kp.g:1217:5: ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) )
                    	    // Kp.g:1218:6: (a4_0= parse_org_kermeta_kp_PackageEquivalence )
                    	    {
                    	    // Kp.g:1218:6: (a4_0= parse_org_kermeta_kp_PackageEquivalence )
                    	    // Kp.g:1219:7: a4_0= parse_org_kermeta_kp_PackageEquivalence
                    	    {
                    	    pushFollow(FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile971);
                    	    a4_0=parse_org_kermeta_kp_PackageEquivalence();

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
                    	      							if (a4_0 != null) {
                    	      								if (a4_0 != null) {
                    	      									Object value = a4_0;
                    	      									addObjectToList(element, org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES, value);
                    	      									completedElement(value, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_2_0_0_0, a4_0, true);
                    	      								copyLocalizationInfos(a4_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
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


    // $ANTLR start "parse_org_kermeta_kp_ImportProjectJar"
    // Kp.g:1274:1: parse_org_kermeta_kp_ImportProjectJar returns [org.kermeta.kp.ImportProjectJar element = null] : a0= 'importProjectJar' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportProjectJar parse_org_kermeta_kp_ImportProjectJar() throws RecognitionException {
        org.kermeta.kp.ImportProjectJar element =  null;
        int parse_org_kermeta_kp_ImportProjectJar_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1277:1: (a0= 'importProjectJar' (a1= QUOTED_34_34 ) )
            // Kp.g:1278:2: a0= 'importProjectJar' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_ImportProjectJar1060); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectJar();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 34);
              	
            }
            // Kp.g:1292:2: (a1= QUOTED_34_34 )
            // Kp.g:1293:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectJar1078); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectJar();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL), value);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_ImportProjectJar_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportProjectJar"


    // $ANTLR start "parse_org_kermeta_kp_ImportProjectSources"
    // Kp.g:1334:1: parse_org_kermeta_kp_ImportProjectSources returns [org.kermeta.kp.ImportProjectSources element = null] : a0= 'importProjectSource' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportProjectSources parse_org_kermeta_kp_ImportProjectSources() throws RecognitionException {
        org.kermeta.kp.ImportProjectSources element =  null;
        int parse_org_kermeta_kp_ImportProjectSources_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:1337:1: (a0= 'importProjectSource' (a1= QUOTED_34_34 ) )
            // Kp.g:1338:2: a0= 'importProjectSource' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_ImportProjectSources1114); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 36);
              	
            }
            // Kp.g:1352:2: (a1= QUOTED_34_34 )
            // Kp.g:1353:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectSources1132); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL), value);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
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


    // $ANTLR start "parse_org_kermeta_kp_ImportBytecodeJar"
    // Kp.g:1394:1: parse_org_kermeta_kp_ImportBytecodeJar returns [org.kermeta.kp.ImportBytecodeJar element = null] : a0= 'importBytecodeJar' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportBytecodeJar parse_org_kermeta_kp_ImportBytecodeJar() throws RecognitionException {
        org.kermeta.kp.ImportBytecodeJar element =  null;
        int parse_org_kermeta_kp_ImportBytecodeJar_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kp.g:1397:1: (a0= 'importBytecodeJar' (a1= QUOTED_34_34 ) )
            // Kp.g:1398:2: a0= 'importBytecodeJar' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_ImportBytecodeJar1168); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportBytecodeJar();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 38);
              	
            }
            // Kp.g:1412:2: (a1= QUOTED_34_34 )
            // Kp.g:1413:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportBytecodeJar1186); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportBytecodeJar();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL), value);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_ImportBytecodeJar_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportBytecodeJar"


    // $ANTLR start "parse_org_kermeta_kp_ReusableResource"
    // Kp.g:1454:1: parse_org_kermeta_kp_ReusableResource returns [org.kermeta.kp.ReusableResource element = null] : a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kp.g:1457:1: (a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )? )
            // Kp.g:1458:2: a0= 'resource' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )?
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_ReusableResource1222); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 40);
              	
            }
            // Kp.g:1472:2: (a1= TEXT )
            // Kp.g:1473:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1240); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 41);
              	
            }
            a2=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_ReusableResource1261); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 42);
              	
            }
            // Kp.g:1522:2: (a3= QUOTED_34_34 )
            // Kp.g:1523:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1279); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 43);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:1563:2: ( (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Kp.g:1564:3: (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* )
                    {
                    // Kp.g:1564:3: (a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )* )
                    // Kp.g:1565:4: a4= 'alternative' (a5= QUOTED_34_34 ) ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
                    {
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_ReusableResource1309); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 44);
                      			
                    }
                    // Kp.g:1579:4: (a5= QUOTED_34_34 )
                    // Kp.g:1580:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1335); if (state.failed) return element;
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
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 45);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }
                    // Kp.g:1620:4: ( (a6= ',' (a7= QUOTED_34_34 ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Kp.g:1621:5: (a6= ',' (a7= QUOTED_34_34 ) )
                    	    {
                    	    // Kp.g:1621:5: (a6= ',' (a7= QUOTED_34_34 ) )
                    	    // Kp.g:1622:6: a6= ',' (a7= QUOTED_34_34 )
                    	    {
                    	    a6=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_ReusableResource1381); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 46);
                    	      					
                    	    }
                    	    // Kp.g:1636:6: (a7= QUOTED_34_34 )
                    	    // Kp.g:1637:7: a7= QUOTED_34_34
                    	    {
                    	    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1415); if (state.failed) return element;
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
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_3_0_0_1, resolved, true);
                    	      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 47);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 48);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_ReusableResource_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ReusableResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_org_kermeta_kp_KermetaProject115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject133 = new BitSet(new long[]{0x00000000003D3802L});
    public static final BitSet FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject189 = new BitSet(new long[]{0x00000000003D3002L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject270 = new BitSet(new long[]{0x00000000003D2002L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject351 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_KermetaProject419 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectJar_in_parse_org_kermeta_kp_KermetaProject486 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject553 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportBytecodeJar_in_parse_org_kermeta_kp_KermetaProject620 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ReusableResource_in_parse_org_kermeta_kp_KermetaProject680 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_PackageEquivalence736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence754 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_PackageEquivalence779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_ImportFile843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile861 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_ImportFile891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportFile917 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile971 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_ImportProjectJar1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectJar1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_ImportProjectSources1114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectSources1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_ImportBytecodeJar1168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportBytecodeJar1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_ReusableResource1222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1240 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_ReusableResource1261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1279 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_ReusableResource1309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1335 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_ReusableResource1381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1415 = new BitSet(new long[]{0x0000000000800002L});

}