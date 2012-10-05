// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "TEXT", "SL_COMMENT", "ML_COMMENT", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "'defaultMainClass'", "'defaultMainOperation'", "'javaBasePackage'", "'packageEquivalence'", "'='", "'extends'", "','", "'{'", "'}'", "'importFile'", "'withBytecodeFrom'", "'importProjectJar'", "'importProjectSource'", "'importBytecodeJar'", "'alternative'"
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
    public static final int T__24=24;
    public static final int T__25=25;
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
            this.state.ruleMemo = new HashMap[24+1];
             
             
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
    			if (type.getInstanceClass() == org.kermeta.kp.Metamodel.class) {
    				return parse_org_kermeta_kp_Metamodel();
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
    		int followSetID = 61;
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
    // Kp.g:500:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )* ;
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
        org.kermeta.kp.Metamodel a8_0 = null;

        org.kermeta.kp.ImportProjectJar a9_0 = null;

        org.kermeta.kp.ImportProjectSources a10_0 = null;

        org.kermeta.kp.ImportBytecodeJar a11_0 = null;

        org.kermeta.kp.ReusableResource a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:503:1: (a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )* )
            // Kp.g:504:2: a0= 'KermetaProject' (a1= QUOTED_34_34 ) ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )? ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )? ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )? ( ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )*
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
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__ECLIPSE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__ECLIPSE_NAME), value);
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
            // Kp.g:561:2: ( (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Kp.g:562:3: (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) )
                    {
                    // Kp.g:562:3: (a2= 'defaultMainClass' (a3= QUOTED_34_34 ) )
                    // Kp.g:563:4: a2= 'defaultMainClass' (a3= QUOTED_34_34 )
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
                    // Kp.g:577:4: (a3= QUOTED_34_34 )
                    // Kp.g:578:5: a3= QUOTED_34_34
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
            // Kp.g:632:2: ( (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Kp.g:633:3: (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) )
                    {
                    // Kp.g:633:3: (a4= 'defaultMainOperation' (a5= QUOTED_34_34 ) )
                    // Kp.g:634:4: a4= 'defaultMainOperation' (a5= QUOTED_34_34 )
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
                    // Kp.g:648:4: (a5= QUOTED_34_34 )
                    // Kp.g:649:5: a5= QUOTED_34_34
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
            // Kp.g:701:2: ( (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Kp.g:702:3: (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) )
                    {
                    // Kp.g:702:3: (a6= 'javaBasePackage' (a7= QUOTED_34_34 ) )
                    // Kp.g:703:4: a6= 'javaBasePackage' (a7= QUOTED_34_34 )
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
                    // Kp.g:717:4: (a7= QUOTED_34_34 )
                    // Kp.g:718:5: a7= QUOTED_34_34
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
            // Kp.g:768:2: ( ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT||(LA5_0>=22 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Kp.g:769:3: ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) )
            	    {
            	    // Kp.g:769:3: ( ( (a8_0= parse_org_kermeta_kp_Metamodel ) ) | ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) ) | ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) ) | ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) ) | (a12_0= parse_org_kermeta_kp_ReusableResource ) )
            	    int alt4=5;
            	    switch ( input.LA(1) ) {
            	    case TEXT:
            	        {
            	        int LA4_1 = input.LA(2);

            	        if ( (LA4_1==16||LA4_1==18) ) {
            	            alt4=1;
            	        }
            	        else if ( (LA4_1==15) ) {
            	            alt4=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return element;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=4;
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
            	            // Kp.g:770:4: ( (a8_0= parse_org_kermeta_kp_Metamodel ) )
            	            {
            	            // Kp.g:770:4: ( (a8_0= parse_org_kermeta_kp_Metamodel ) )
            	            // Kp.g:771:5: (a8_0= parse_org_kermeta_kp_Metamodel )
            	            {
            	            // Kp.g:771:5: (a8_0= parse_org_kermeta_kp_Metamodel )
            	            // Kp.g:772:6: a8_0= parse_org_kermeta_kp_Metamodel
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Metamodel_in_parse_org_kermeta_kp_KermetaProject419);
            	            a8_0=parse_org_kermeta_kp_Metamodel();

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
            	              								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODELS, value);
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
            	            // Kp.g:812:8: ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) )
            	            {
            	            // Kp.g:812:8: ( (a9_0= parse_org_kermeta_kp_ImportProjectJar ) )
            	            // Kp.g:813:5: (a9_0= parse_org_kermeta_kp_ImportProjectJar )
            	            {
            	            // Kp.g:813:5: (a9_0= parse_org_kermeta_kp_ImportProjectJar )
            	            // Kp.g:814:6: a9_0= parse_org_kermeta_kp_ImportProjectJar
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
            	            // Kp.g:854:8: ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) )
            	            {
            	            // Kp.g:854:8: ( (a10_0= parse_org_kermeta_kp_ImportProjectSources ) )
            	            // Kp.g:855:5: (a10_0= parse_org_kermeta_kp_ImportProjectSources )
            	            {
            	            // Kp.g:855:5: (a10_0= parse_org_kermeta_kp_ImportProjectSources )
            	            // Kp.g:856:6: a10_0= parse_org_kermeta_kp_ImportProjectSources
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
            	            // Kp.g:896:8: ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) )
            	            {
            	            // Kp.g:896:8: ( (a11_0= parse_org_kermeta_kp_ImportBytecodeJar ) )
            	            // Kp.g:897:5: (a11_0= parse_org_kermeta_kp_ImportBytecodeJar )
            	            {
            	            // Kp.g:897:5: (a11_0= parse_org_kermeta_kp_ImportBytecodeJar )
            	            // Kp.g:898:6: a11_0= parse_org_kermeta_kp_ImportBytecodeJar
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
            	            // Kp.g:938:8: (a12_0= parse_org_kermeta_kp_ReusableResource )
            	            {
            	            // Kp.g:938:8: (a12_0= parse_org_kermeta_kp_ReusableResource )
            	            // Kp.g:939:5: a12_0= parse_org_kermeta_kp_ReusableResource
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
    // Kp.g:981:1: parse_org_kermeta_kp_PackageEquivalence returns [org.kermeta.kp.PackageEquivalence element = null] : a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.PackageEquivalence parse_org_kermeta_kp_PackageEquivalence() throws RecognitionException {
        org.kermeta.kp.PackageEquivalence element =  null;
        int parse_org_kermeta_kp_PackageEquivalence_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:984:1: (a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 ) )
            // Kp.g:985:2: a0= 'packageEquivalence' (a1= QUOTED_34_34 ) (a2= '=' ) (a3= QUOTED_34_34 )
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
            // Kp.g:999:2: (a1= QUOTED_34_34 )
            // Kp.g:1000:3: a1= QUOTED_34_34
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
            // Kp.g:1035:2: (a2= '=' )
            // Kp.g:1036:3: a2= '='
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
            // Kp.g:1056:2: (a3= QUOTED_34_34 )
            // Kp.g:1057:3: a3= QUOTED_34_34
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 26);
              	
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


    // $ANTLR start "parse_org_kermeta_kp_Metamodel"
    // Kp.g:1096:1: parse_org_kermeta_kp_Metamodel returns [org.kermeta.kp.Metamodel element = null] : (a0= TEXT ) ( (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) ) )? a5= '{' ( ( (a6_0= parse_org_kermeta_kp_ImportFile ) ) )* a7= '}' ;
    public final org.kermeta.kp.Metamodel parse_org_kermeta_kp_Metamodel() throws RecognitionException {
        org.kermeta.kp.Metamodel element =  null;
        int parse_org_kermeta_kp_Metamodel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        org.kermeta.kp.ImportFile a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1099:1: ( (a0= TEXT ) ( (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) ) )? a5= '{' ( ( (a6_0= parse_org_kermeta_kp_ImportFile ) ) )* a7= '}' )
            // Kp.g:1100:2: (a0= TEXT ) ( (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) ) )? a5= '{' ( ( (a6_0= parse_org_kermeta_kp_ImportFile ) ) )* a7= '}'
            {
            // Kp.g:1100:2: (a0= TEXT )
            // Kp.g:1101:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel847); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__METAMODEL_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__METAMODEL_NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 27);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 27);
              	
            }
            // Kp.g:1137:2: ( (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Kp.g:1138:3: (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )
                    {
                    // Kp.g:1138:3: (a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )
                    // Kp.g:1139:4: a1= 'extends' ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_Metamodel877); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 28);
                      			
                    }
                    // Kp.g:1153:4: ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* )
                    // Kp.g:1154:5: (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )*
                    {
                    // Kp.g:1154:5: (a2= TEXT )
                    // Kp.g:1155:6: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel910); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      						if (terminateParsing) {
                      							throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      						}
                      						if (element == null) {
                      							element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                      							incompleteObjects.push(element);
                      						}
                      						if (a2 != null) {
                      							org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      							tokenResolver.setOptions(getOptions());
                      							org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), result);
                      							Object resolvedObject = result.getResolvedToken();
                      							if (resolvedObject == null) {
                      								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
                      							}
                      							String resolved = (String) resolvedObject;
                      							org.kermeta.kp.Metamodel proxy = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                      							collectHiddenTokens(element);
                      							registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.Metamodel, org.kermeta.kp.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMetamodelExtendsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), resolved, proxy);
                      							if (proxy != null) {
                      								Object value = proxy;
                      								addObjectToList(element, org.kermeta.kp.KpPackage.METAMODEL__EXTENDS, value);
                      								completedElement(value, false);
                      							}
                      							collectHiddenTokens(element);
                      							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_1_0_0_0, proxy, true);
                      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
                      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
                      						}
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 29);
                      					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 29);
                      				
                    }
                    // Kp.g:1195:5: ( (a3= ',' (a4= TEXT ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Kp.g:1196:6: (a3= ',' (a4= TEXT ) )
                    	    {
                    	    // Kp.g:1196:6: (a3= ',' (a4= TEXT ) )
                    	    // Kp.g:1197:7: a3= ',' (a4= TEXT )
                    	    {
                    	    a3=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_Metamodel964); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (element == null) {
                    	      								element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                    	      								incompleteObjects.push(element);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_1_0_0_1_0_0_0, null, true);
                    	      							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							// expected elements (follow set)
                    	      							addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 30);
                    	      						
                    	    }
                    	    // Kp.g:1211:7: (a4= TEXT )
                    	    // Kp.g:1212:8: a4= TEXT
                    	    {
                    	    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel1002); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      								if (terminateParsing) {
                    	      									throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                    	      								}
                    	      								if (element == null) {
                    	      									element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                    	      									incompleteObjects.push(element);
                    	      								}
                    	      								if (a4 != null) {
                    	      									org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      									tokenResolver.setOptions(getOptions());
                    	      									org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                    	      									tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), result);
                    	      									Object resolvedObject = result.getResolvedToken();
                    	      									if (resolvedObject == null) {
                    	      										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                    	      									}
                    	      									String resolved = (String) resolvedObject;
                    	      									org.kermeta.kp.Metamodel proxy = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
                    	      									collectHiddenTokens(element);
                    	      									registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.Metamodel, org.kermeta.kp.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMetamodelExtendsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), resolved, proxy);
                    	      									if (proxy != null) {
                    	      										Object value = proxy;
                    	      										addObjectToList(element, org.kermeta.kp.KpPackage.METAMODEL__EXTENDS, value);
                    	      										completedElement(value, false);
                    	      									}
                    	      									collectHiddenTokens(element);
                    	      									retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_1_0_0_1_0_0_1, proxy, true);
                    	      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                    	      									copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
                    	      								}
                    	      							
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      							// expected elements (follow set)
                    	      							addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 31);
                    	      							addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 31);
                    	      						
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
                      					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 32);
                      					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 32);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 33);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 34);
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_Metamodel1107); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 35);
              	
            }
            // Kp.g:1288:2: ( ( (a6_0= parse_org_kermeta_kp_ImportFile ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Kp.g:1289:3: ( (a6_0= parse_org_kermeta_kp_ImportFile ) )
            	    {
            	    // Kp.g:1289:3: ( (a6_0= parse_org_kermeta_kp_ImportFile ) )
            	    // Kp.g:1290:4: (a6_0= parse_org_kermeta_kp_ImportFile )
            	    {
            	    // Kp.g:1290:4: (a6_0= parse_org_kermeta_kp_ImportFile )
            	    // Kp.g:1291:5: a6_0= parse_org_kermeta_kp_ImportFile
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_Metamodel1136);
            	    a6_0=parse_org_kermeta_kp_ImportFile();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a6_0 != null) {
            	      						if (a6_0 != null) {
            	      							Object value = a6_0;
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.METAMODEL__IMPORTED_FILES, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_4_0_0_0, a6_0, true);
            	      						copyLocalizationInfos(a6_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
            	      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 36);
            	      			
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 37);
              	
            }
            a7=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_Metamodel1177); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMetamodel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 38, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_Metamodel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Metamodel"


    // $ANTLR start "parse_org_kermeta_kp_ImportFile"
    // Kp.g:1345:1: parse_org_kermeta_kp_ImportFile returns [org.kermeta.kp.ImportFile element = null] : a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )? ;
    public final org.kermeta.kp.ImportFile parse_org_kermeta_kp_ImportFile() throws RecognitionException {
        org.kermeta.kp.ImportFile element =  null;
        int parse_org_kermeta_kp_ImportFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        org.kermeta.kp.PackageEquivalence a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1348:1: (a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )? )
            // Kp.g:1349:2: a0= 'importFile' (a1= QUOTED_34_34 ) ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )?
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_ImportFile1206); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 39);
              	
            }
            // Kp.g:1363:2: (a1= QUOTED_34_34 )
            // Kp.g:1364:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile1224); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 40);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 40);
              	
            }
            // Kp.g:1401:2: ( (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Kp.g:1402:3: (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* )
                    {
                    // Kp.g:1402:3: (a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )* )
                    // Kp.g:1403:4: a2= 'withBytecodeFrom' (a3= TEXT ) ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
                    {
                    a2=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_ImportFile1254); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 41);
                      			
                    }
                    // Kp.g:1417:4: (a3= TEXT )
                    // Kp.g:1418:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportFile1280); if (state.failed) return element;
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
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 42);
                      			
                    }
                    // Kp.g:1459:4: ( ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Kp.g:1460:5: ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) )
                    	    {
                    	    // Kp.g:1460:5: ( (a4_0= parse_org_kermeta_kp_PackageEquivalence ) )
                    	    // Kp.g:1461:6: (a4_0= parse_org_kermeta_kp_PackageEquivalence )
                    	    {
                    	    // Kp.g:1461:6: (a4_0= parse_org_kermeta_kp_PackageEquivalence )
                    	    // Kp.g:1462:7: a4_0= parse_org_kermeta_kp_PackageEquivalence
                    	    {
                    	    pushFollow(FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile1334);
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
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_3_0_0_2_0_0_0, a4_0, true);
                    	      								copyLocalizationInfos(a4_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 43);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 44, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 44, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 44);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 45);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_ImportFile_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportFile"


    // $ANTLR start "parse_org_kermeta_kp_ImportProjectJar"
    // Kp.g:1508:1: parse_org_kermeta_kp_ImportProjectJar returns [org.kermeta.kp.ImportProjectJar element = null] : a0= 'importProjectJar' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportProjectJar parse_org_kermeta_kp_ImportProjectJar() throws RecognitionException {
        org.kermeta.kp.ImportProjectJar element =  null;
        int parse_org_kermeta_kp_ImportProjectJar_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:1511:1: (a0= 'importProjectJar' (a1= QUOTED_34_34 ) )
            // Kp.g:1512:2: a0= 'importProjectJar' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_ImportProjectJar1423); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectJar();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 46);
              	
            }
            // Kp.g:1526:2: (a1= QUOTED_34_34 )
            // Kp.g:1527:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectJar1441); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_ImportProjectJar_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportProjectJar"


    // $ANTLR start "parse_org_kermeta_kp_ImportProjectSources"
    // Kp.g:1568:1: parse_org_kermeta_kp_ImportProjectSources returns [org.kermeta.kp.ImportProjectSources element = null] : a0= 'importProjectSource' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportProjectSources parse_org_kermeta_kp_ImportProjectSources() throws RecognitionException {
        org.kermeta.kp.ImportProjectSources element =  null;
        int parse_org_kermeta_kp_ImportProjectSources_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kp.g:1571:1: (a0= 'importProjectSource' (a1= QUOTED_34_34 ) )
            // Kp.g:1572:2: a0= 'importProjectSource' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_ImportProjectSources1477); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 48);
              	
            }
            // Kp.g:1586:2: (a1= QUOTED_34_34 )
            // Kp.g:1587:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectSources1495); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

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
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_ImportProjectSources_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportProjectSources"


    // $ANTLR start "parse_org_kermeta_kp_ImportBytecodeJar"
    // Kp.g:1628:1: parse_org_kermeta_kp_ImportBytecodeJar returns [org.kermeta.kp.ImportBytecodeJar element = null] : a0= 'importBytecodeJar' (a1= QUOTED_34_34 ) ;
    public final org.kermeta.kp.ImportBytecodeJar parse_org_kermeta_kp_ImportBytecodeJar() throws RecognitionException {
        org.kermeta.kp.ImportBytecodeJar element =  null;
        int parse_org_kermeta_kp_ImportBytecodeJar_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kp.g:1631:1: (a0= 'importBytecodeJar' (a1= QUOTED_34_34 ) )
            // Kp.g:1632:2: a0= 'importBytecodeJar' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_ImportBytecodeJar1531); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportBytecodeJar();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 50);
              	
            }
            // Kp.g:1646:2: (a1= QUOTED_34_34 )
            // Kp.g:1647:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportBytecodeJar1549); if (state.failed) return element;
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_ImportBytecodeJar_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ImportBytecodeJar"


    // $ANTLR start "parse_org_kermeta_kp_ReusableResource"
    // Kp.g:1688:1: parse_org_kermeta_kp_ReusableResource returns [org.kermeta.kp.ReusableResource element = null] : (a0= TEXT ) a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* ) )? ;
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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Kp.g:1691:1: ( (a0= TEXT ) a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* ) )? )
            // Kp.g:1692:2: (a0= TEXT ) a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* ) )?
            {
            // Kp.g:1692:2: (a0= TEXT )
            // Kp.g:1693:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1589); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 52);
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_ReusableResource1610); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 53);
              	
            }
            // Kp.g:1742:2: (a2= QUOTED_34_34 )
            // Kp.g:1743:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1628); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 54);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 54, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }
            // Kp.g:1783:2: ( (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Kp.g:1784:3: (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* )
                    {
                    // Kp.g:1784:3: (a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )* )
                    // Kp.g:1785:4: a3= 'alternative' (a4= QUOTED_34_34 ) ( (a5= ',' (a6= QUOTED_34_34 ) ) )*
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_ReusableResource1658); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 55);
                      			
                    }
                    // Kp.g:1799:4: (a4= QUOTED_34_34 )
                    // Kp.g:1800:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1684); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String) resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 56);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 56, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }
                    // Kp.g:1840:4: ( (a5= ',' (a6= QUOTED_34_34 ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Kp.g:1841:5: (a5= ',' (a6= QUOTED_34_34 ) )
                    	    {
                    	    // Kp.g:1841:5: (a5= ',' (a6= QUOTED_34_34 ) )
                    	    // Kp.g:1842:6: a5= ',' (a6= QUOTED_34_34 )
                    	    {
                    	    a5=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_ReusableResource1730); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4_0_0_3_0_0_0, null, true);
                    	      						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 57);
                    	      					
                    	    }
                    	    // Kp.g:1856:6: (a6= QUOTED_34_34 )
                    	    // Kp.g:1857:7: a6= QUOTED_34_34
                    	    {
                    	    a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1764); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
                    	      								incompleteObjects.push(element);
                    	      							}
                    	      							if (a6 != null) {
                    	      								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
                    	      								Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
                    	      								}
                    	      								java.lang.String resolved = (java.lang.String) resolvedObject;
                    	      								if (resolved != null) {
                    	      									Object value = resolved;
                    	      									addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
                    	      									completedElement(value, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4_0_0_3_0_0_1, resolved, true);
                    	      								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 58);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 59);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 59, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 59, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 59, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 59, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 59, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 60, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_ReusableResource_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_ReusableResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_parse_org_kermeta_kp_KermetaProject115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject133 = new BitSet(new long[]{0x0000000001C03822L});
    public static final BitSet FOLLOW_11_in_parse_org_kermeta_kp_KermetaProject163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject189 = new BitSet(new long[]{0x0000000001C03022L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject270 = new BitSet(new long[]{0x0000000001C02022L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject351 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Metamodel_in_parse_org_kermeta_kp_KermetaProject419 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectJar_in_parse_org_kermeta_kp_KermetaProject486 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportProjectSources_in_parse_org_kermeta_kp_KermetaProject553 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportBytecodeJar_in_parse_org_kermeta_kp_KermetaProject620 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ReusableResource_in_parse_org_kermeta_kp_KermetaProject680 = new BitSet(new long[]{0x0000000001C00022L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_PackageEquivalence736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence754 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_PackageEquivalence779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_PackageEquivalence807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel847 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_Metamodel877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel910 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_Metamodel964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_Metamodel1002 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_Metamodel1107 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_ImportFile_in_parse_org_kermeta_kp_Metamodel1136 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_Metamodel1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_ImportFile1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportFile1224 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_ImportFile1254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ImportFile1280 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_PackageEquivalence_in_parse_org_kermeta_kp_ImportFile1334 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_ImportProjectJar1423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectJar1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_ImportProjectSources1477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportProjectSources1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_ImportBytecodeJar1531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ImportBytecodeJar1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_ReusableResource1589 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_ReusableResource1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1628 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_ReusableResource1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1684 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_ReusableResource1730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_ReusableResource1764 = new BitSet(new long[]{0x0000000000020002L});

}