// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class KpParser extends KpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "SL_COMMENT", "ML_COMMENT", "INTEGER", "FLOAT", "TEXT", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "':'", "'version'", "': '", "'group'", "'{'", "'}'", "'ref'", "'source'", "'='", "'srcDir'", "'srcFile'", "'srcNSURI'", "'from'", "'srcQuery'", "'URL'", "'dependency'", "'weaver-directive'", "'merger-option'", "'('", "')'", "'['", "']'"
    };
    public static final int INTEGER=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=10;
    public static final int FLOAT=8;
    public static final int TEXT=9;
    public static final int EOF=-1;
    public static final int ML_COMMENT=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int SL_COMMENT=5;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=11;

    // delegates
    // delegators


        public KpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public KpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[39+1];
             
             
        }
        

    public String[] getTokenNames() { return KpParser.tokenNames; }
    public String getGrammarFileName() { return "Kp.g"; }


    	private org.kermeta.kp.editor.IKpTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	private org.kermeta.kp.editor.mopp.KpTokenResolveResult tokenResolveResult = new org.kermeta.kp.editor.mopp.KpTokenResolveResult();
    	
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
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
    	
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
    	/**
    	 * A flag to indicate that the parser should stop parsing as soon as possible. The
    	 * flag is set to false before parsing starts. It can be set to true by invoking
    	 * the terminateParsing() method from another thread. This feature is used, when
    	 * documents are parsed in the background (i.e., while editing them). In order to
    	 * cancel running parsers, the parsing process can be terminated. This is done
    	 * whenever a document changes, because the previous content of the document is
    	 * not valid anymore and parsing the old content is not necessary any longer.
    	 */
    	private boolean terminateParsing;
    	
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
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kp.editor.mopp.KpDummyEObject dummy) {
    		Object value = element.eGet(structuralFeature);
    		Object mapKey = dummy.getValueByName("key");
    		Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = org.kermeta.kp.editor.util.KpMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
    		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
    		return ((java.util.List<Object>) container.eGet(feature)).add(object);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof org.kermeta.kp.editor.mopp.KpDummyEObject);
    			org.kermeta.kp.editor.mopp.KpDummyEObject dummy = (org.kermeta.kp.editor.mopp.KpDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
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
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
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
    				return new KpParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new KpParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
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
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
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
    			if (type.getInstanceClass() == org.kermeta.kp.SourceFolder.class) {
    				return parse_org_kermeta_kp_SourceFolder();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceFile.class) {
    				return parse_org_kermeta_kp_SourceFile();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceNSURI.class) {
    				return parse_org_kermeta_kp_SourceNSURI();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.SourceQuery.class) {
    				return parse_org_kermeta_kp_SourceQuery();
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
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProjectRef.class) {
    				return parse_org_kermeta_kp_KermetaProjectRef();
    			}
    		}
    		throw new org.kermeta.kp.editor.mopp.KpUnexpectedContentTypeException(typeObject);
    	}
    	
    	private org.kermeta.kp.editor.mopp.KpTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public org.kermeta.kp.editor.mopp.KpMetaInformation getMetaInformation() {
    		return new org.kermeta.kp.editor.mopp.KpMetaInformation();
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
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
    		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
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
    		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
    		org.kermeta.kp.editor.IKpParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
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
    		int followSetID = 90;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
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
    			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
    			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
    			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private String formatTokenName(int tokenType)  {
    		String tokenName = "<unknown>";
    		if (tokenType == org.antlr.runtime3_2_0.Token.EOF) {
    			tokenName = "EOF";
    		} else {
    			if (tokenType < 0) {
    				return tokenName;
    			}
    			tokenName = getTokenNames()[tokenType];
    			tokenName = org.kermeta.kp.editor.util.KpStringUtil.formatTokenName(tokenName);
    		}
    		return tokenName;
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
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
    	
    	/**
    	 * Creates a dynamic Java proxy that mimics the interface of the given class.
    	 */
    	@SuppressWarnings("unchecked")
    	
    	public <T> T createDynamicProxy(Class<T> clazz) {
    		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
    			
    			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
    			
    			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
    				// search in dummyObject for the requested method
    				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
    				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
    					boolean matches = true;
    					if (methodInDummy.getName().equals(method.getName())) {
    						Class<?>[] parameterTypes = method.getParameterTypes();
    						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
    						if (parameterTypes.length == parameterTypesInDummy.length) {
    							for (int p = 0; p < parameterTypes.length; p++) {
    								Class<?> parameterType = parameterTypes[p];
    								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
    								if (!parameterType.equals(parameterTypeInDummy)) {
    									matches = false;
    								}
    							}
    						} else {
    							matches = false;
    						}
    					} else {
    						matches = false;
    					}
    					if (matches) {
    						return methodInDummy.invoke(dummyObject, args);
    					}
    				}
    				return null;
    			}
    		});
    		return (T) proxy;
    	}
    	



    // $ANTLR start "start"
    // Kp.g:623:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Kp.g:624:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // Kp.g:625:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Kp.g:630:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // Kp.g:631:3: c0= parse_org_kermeta_kp_KermetaProject
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
    // Kp.g:639:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' ( (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ) )? ;
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
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a18=null;
        org.kermeta.kp.Source a10_0 = null;

        org.kermeta.kp.Dependency a11_0 = null;

        org.kermeta.kp.Option a12_0 = null;

        org.kermeta.kp.WeaveDirective a13_0 = null;

        org.kermeta.kp.KermetaProjectRef a17_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Kp.g:642:1: (a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' ( (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ) )? )
            // Kp.g:643:2: a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' ( (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ) )?
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 1);
              	
            }
            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject129); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 2);
              	
            }
            // Kp.g:671:2: (a2= QUOTED_34_34 )
            // Kp.g:672:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject147); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 3);
              	
            }
            // Kp.g:709:2: ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Kp.g:710:3: (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) )
                    {
                    // Kp.g:710:3: (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) )
                    // Kp.g:711:4: a3= 'version' a4= ': ' (a5= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject177); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 4);
                      			
                    }
                    a4=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject197); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 5);
                      			
                    }
                    // Kp.g:739:4: (a5= QUOTED_34_34 )
                    // Kp.g:740:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject223); if (state.failed) return element;
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
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 6);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 6);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 7);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 7);
              	
            }
            // Kp.g:784:2: ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Kp.g:785:3: (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) )
                    {
                    // Kp.g:785:3: (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) )
                    // Kp.g:786:4: a6= 'group' a7= ':' (a8= QUOTED_34_34 )
                    {
                    a6=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject278); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 8);
                      			
                    }
                    a7=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject298); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 9);
                      			
                    }
                    // Kp.g:814:4: (a8= QUOTED_34_34 )
                    // Kp.g:815:5: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject324); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      						incompleteObjects.push(element);
                      					}
                      					if (a8 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 11);
              	
            }
            a9=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject370); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 12);
              	
            }
            // Kp.g:880:2: ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||(LA4_0>=22 && LA4_0<=24)||LA4_0==26||(LA4_0>=28 && LA4_0<=30)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Kp.g:881:3: ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) )
            	    {
            	    // Kp.g:881:3: ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) )
            	    int alt3=4;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	    case 22:
            	    case 23:
            	    case 24:
            	    case 26:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // Kp.g:882:4: (a10_0= parse_org_kermeta_kp_Source )
            	            {
            	            // Kp.g:882:4: (a10_0= parse_org_kermeta_kp_Source )
            	            // Kp.g:883:5: a10_0= parse_org_kermeta_kp_Source
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject399);
            	            a10_0=parse_org_kermeta_kp_Source();

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
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_0_1, a10_0, true);
            	              						copyLocalizationInfos(a10_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 13);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Kp.g:918:8: (a11_0= parse_org_kermeta_kp_Dependency )
            	            {
            	            // Kp.g:918:8: (a11_0= parse_org_kermeta_kp_Dependency )
            	            // Kp.g:919:5: a11_0= parse_org_kermeta_kp_Dependency
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject441);
            	            a11_0=parse_org_kermeta_kp_Dependency();

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
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_1_1, a11_0, true);
            	              						copyLocalizationInfos(a11_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 14);
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Kp.g:954:8: (a12_0= parse_org_kermeta_kp_Option )
            	            {
            	            // Kp.g:954:8: (a12_0= parse_org_kermeta_kp_Option )
            	            // Kp.g:955:5: a12_0= parse_org_kermeta_kp_Option
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject483);
            	            a12_0=parse_org_kermeta_kp_Option();

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
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_2_1, a12_0, true);
            	              						copyLocalizationInfos(a12_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 15);
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Kp.g:990:8: (a13_0= parse_org_kermeta_kp_WeaveDirective )
            	            {
            	            // Kp.g:990:8: (a13_0= parse_org_kermeta_kp_WeaveDirective )
            	            // Kp.g:991:5: a13_0= parse_org_kermeta_kp_WeaveDirective
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject525);
            	            a13_0=parse_org_kermeta_kp_WeaveDirective();

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
            	              					if (a13_0 != null) {
            	              						if (a13_0 != null) {
            	              							Object value = a13_0;
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, value);
            	              							completedElement(value, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_7_0_3_1, a13_0, true);
            	              						copyLocalizationInfos(a13_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
            	              				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 16);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 17);
              	
            }
            a14=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject566); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_9, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a14, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 18);
              	
            }
            // Kp.g:1055:2: ( (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kp.g:1056:3: (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' )
                    {
                    // Kp.g:1056:3: (a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' )
                    // Kp.g:1057:4: a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}'
                    {
                    a15=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject589); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 19);
                      			
                    }
                    a16=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject609); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 20);
                      			
                    }
                    // Kp.g:1086:4: ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==QUOTED_34_34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Kp.g:1087:5: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
                    	    {
                    	    // Kp.g:1087:5: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
                    	    // Kp.g:1088:6: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
                    	    {
                    	    // Kp.g:1088:6: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
                    	    // Kp.g:1089:7: a17_0= parse_org_kermeta_kp_KermetaProjectRef
                    	    {
                    	    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject650);
                    	    a17_0=parse_org_kermeta_kp_KermetaProjectRef();

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
                    	      							if (a17_0 != null) {
                    	      								if (a17_0 != null) {
                    	      									Object value = a17_0;
                    	      									addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, value);
                    	      									completedElement(value, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_2_0_0_1, a17_0, true);
                    	      								copyLocalizationInfos(a17_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                    	      						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 21);
                    	      					
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 22, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 22);
                      			
                    }
                    a18=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject711); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a18, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      			
                    }

                    }


                    }
                    break;

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


    // $ANTLR start "parse_org_kermeta_kp_Source"
    // Kp.g:1144:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) | c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery );
    public final org.kermeta.kp.Source parse_org_kermeta_kp_Source() throws RecognitionException {
        org.kermeta.kp.Source element =  null;
        int parse_org_kermeta_kp_Source_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.SourceFolder c0 = null;

        org.kermeta.kp.SourceFile c1 = null;

        org.kermeta.kp.SourceNSURI c2 = null;

        org.kermeta.kp.SourceQuery c3 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kp.g:1147:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) | c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // Kp.g:1148:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_Source759); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 25);
                      	
                    }
                    a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Source773); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 26);
                      	
                    }
                    // Kp.g:1176:2: (a2= QUOTED_34_34 )
                    // Kp.g:1177:3: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source791); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createSource();
                      				incompleteObjects.push(element);
                      			}
                      			if (a2 != null) {
                      				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_2, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 27, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 27);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1223:2: c0= parse_org_kermeta_kp_SourceFolder
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source817);
                    c0=parse_org_kermeta_kp_SourceFolder();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Kp.g:1224:4: c1= parse_org_kermeta_kp_SourceFile
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source827);
                    c1=parse_org_kermeta_kp_SourceFile();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Kp.g:1225:4: c2= parse_org_kermeta_kp_SourceNSURI
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source837);
                    c2=parse_org_kermeta_kp_SourceNSURI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Kp.g:1226:4: c3= parse_org_kermeta_kp_SourceQuery
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source847);
                    c3=parse_org_kermeta_kp_SourceQuery();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_kermeta_kp_Source_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Source"


    // $ANTLR start "parse_org_kermeta_kp_SourceFolder"
    // Kp.g:1230:1: parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null] : a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) ;
    public final org.kermeta.kp.SourceFolder parse_org_kermeta_kp_SourceFolder() throws RecognitionException {
        org.kermeta.kp.SourceFolder element =  null;
        int parse_org_kermeta_kp_SourceFolder_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1233:1: (a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) )
            // Kp.g:1234:2: a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder872); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 28);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder886); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 29);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 29);
              	
            }
            // Kp.g:1263:2: ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==QUOTED_34_34) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred13_Kp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Kp.g:1264:3: (a2= QUOTED_34_34 )
                    {
                    // Kp.g:1264:3: (a2= QUOTED_34_34 )
                    // Kp.g:1265:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder909); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 30);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1310:6: (a3= QUOTED_34_34 )
                    {
                    // Kp.g:1310:6: (a3= QUOTED_34_34 )
                    // Kp.g:1311:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder947); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 31);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 32);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_SourceFolder_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFolder"


    // $ANTLR start "parse_org_kermeta_kp_SourceFile"
    // Kp.g:1372:1: parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null] : a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) ;
    public final org.kermeta.kp.SourceFile parse_org_kermeta_kp_SourceFile() throws RecognitionException {
        org.kermeta.kp.SourceFile element =  null;
        int parse_org_kermeta_kp_SourceFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1375:1: (a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) )
            // Kp.g:1376:2: a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceFile996); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 33);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFile1010); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 34);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 34);
              	
            }
            // Kp.g:1405:2: ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUOTED_34_34) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred14_Kp()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Kp.g:1406:3: (a2= QUOTED_34_34 )
                    {
                    // Kp.g:1406:3: (a2= QUOTED_34_34 )
                    // Kp.g:1407:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1033); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
                      					incompleteObjects.push(element);
                      				}
                      				if (a2 != null) {
                      					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2_0_0_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 35);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1452:6: (a3= QUOTED_34_34 )
                    {
                    // Kp.g:1452:6: (a3= QUOTED_34_34 )
                    // Kp.g:1453:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1071); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
                      					incompleteObjects.push(element);
                      				}
                      				if (a3 != null) {
                      					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2_0_1_0, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 36, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 36);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 37);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_SourceFile_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFile"


    // $ANTLR start "parse_org_kermeta_kp_SourceNSURI"
    // Kp.g:1514:1: parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null] : a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )? ;
    public final org.kermeta.kp.SourceNSURI parse_org_kermeta_kp_SourceNSURI() throws RecognitionException {
        org.kermeta.kp.SourceNSURI element =  null;
        int parse_org_kermeta_kp_SourceNSURI_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kp.g:1517:1: (a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )? )
            // Kp.g:1518:2: a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI1120); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 38);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI1134); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 39);
              	
            }
            // Kp.g:1546:2: (a2= QUOTED_34_34 )
            // Kp.g:1547:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1152); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 40);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 40, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 40);
              	
            }
            // Kp.g:1592:2: ( (a3= 'from' (a4= QUOTED_34_34 ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Kp.g:1593:3: (a3= 'from' (a4= QUOTED_34_34 ) )
                    {
                    // Kp.g:1593:3: (a3= 'from' (a4= QUOTED_34_34 ) )
                    // Kp.g:1594:4: a3= 'from' (a4= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_SourceNSURI1182); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 41);
                      			
                    }
                    // Kp.g:1608:4: (a4= QUOTED_34_34 )
                    // Kp.g:1609:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1208); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 42, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 42);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 43);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_SourceNSURI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceNSURI"


    // $ANTLR start "parse_org_kermeta_kp_SourceQuery"
    // Kp.g:1675:1: parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null] : a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )? ;
    public final org.kermeta.kp.SourceQuery parse_org_kermeta_kp_SourceQuery() throws RecognitionException {
        org.kermeta.kp.SourceQuery element =  null;
        int parse_org_kermeta_kp_SourceQuery_StartIndex = input.index();
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
            // Kp.g:1678:1: (a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )? )
            // Kp.g:1679:2: a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )?
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_SourceQuery1269); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 44);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1283); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 45);
              	
            }
            // Kp.g:1707:2: (a2= QUOTED_34_34 )
            // Kp.g:1708:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1301); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_38, 46);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 46, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 46);
              	
            }
            // Kp.g:1753:2: ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Kp.g:1754:3: (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? )
                    {
                    // Kp.g:1754:3: (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? )
                    // Kp.g:1755:4: a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )?
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_SourceQuery1331); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 47);
                      			
                    }
                    // Kp.g:1769:4: (a4= QUOTED_34_34 )
                    // Kp.g:1770:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1357); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
                      						incompleteObjects.push(element);
                      					}
                      					if (a4 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), resolved, proxy);
                      						if (proxy != null) {
                      							Object value = proxy;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_1, proxy, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 48);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 48);
                      			
                    }
                    // Kp.g:1819:4: ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Kp.g:1820:5: (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) )
                            {
                            // Kp.g:1820:5: (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) )
                            // Kp.g:1821:6: a5= 'URL' a6= '=' (a7= QUOTED_34_34 )
                            {
                            a5=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_SourceQuery1403); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_0, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 49);
                              					
                            }
                            a6=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1429); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_1, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_42, 50);
                              					
                            }
                            // Kp.g:1849:6: (a7= QUOTED_34_34 )
                            // Kp.g:1850:7: a7= QUOTED_34_34
                            {
                            a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1463); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              							if (terminateParsing) {
                              								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                              							}
                              							if (element == null) {
                              								element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
                              								incompleteObjects.push(element);
                              							}
                              							if (a7 != null) {
                              								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                              								tokenResolver.setOptions(getOptions());
                              								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                              								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), result);
                              								Object resolvedObject = result.getResolvedToken();
                              								if (resolvedObject == null) {
                              									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
                              								}
                              								java.lang.String resolved = (java.lang.String)resolvedObject;
                              								if (resolved != null) {
                              									Object value = resolved;
                              									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), value);
                              									completedElement(value, false);
                              								}
                              								collectHiddenTokens(element);
                              								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_3_0_0_2_0_0_2, resolved, true);
                              								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 51, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 51);
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 52, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 52);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 53, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 53);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_SourceQuery_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceQuery"


    // $ANTLR start "parse_org_kermeta_kp_Dependency"
    // Kp.g:1928:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : (a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 ) | a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )? );
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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kp.g:1931:1: (a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 ) | a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==QUOTED_34_34) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==21) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==27) ) {
                        alt15=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // Kp.g:1932:2: a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency1559); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_43, 54);
                      	
                    }
                    // Kp.g:1946:2: (a1= QUOTED_34_34 )
                    // Kp.g:1947:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1577); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      				incompleteObjects.push(element);
                      			}
                      			if (a1 != null) {
                      				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_44, 55);
                      	
                    }
                    a2=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_Dependency1598); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 56);
                      	
                    }
                    a3=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Dependency1612); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_3, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 57);
                      	
                    }
                    // Kp.g:2010:2: (a4= QUOTED_34_34 )
                    // Kp.g:2011:3: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1630); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      				incompleteObjects.push(element);
                      			}
                      			if (a4 != null) {
                      				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_4, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 58, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 58);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2056:4: a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )?
                    {
                    a5=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency1655); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 59);
                      	
                    }
                    // Kp.g:2070:2: (a6= QUOTED_34_34 )
                    // Kp.g:2071:3: a6= QUOTED_34_34
                    {
                    a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1673); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      				incompleteObjects.push(element);
                      			}
                      			if (a6 != null) {
                      				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					Object value = resolved;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_1, resolved, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 60);
                      	
                    }
                    a7=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Dependency1694); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 61);
                      	
                    }
                    // Kp.g:2120:2: (a8= QUOTED_34_34 )
                    // Kp.g:2121:3: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1712); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      				incompleteObjects.push(element);
                      			}
                      			if (a8 != null) {
                      				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
                      				Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
                      				}
                      				String resolved = (String) resolvedObject;
                      				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      				collectHiddenTokens(element);
                      				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
                      				if (proxy != null) {
                      					Object value = proxy;
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), value);
                      					completedElement(value, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_3, proxy, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, proxy);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 62);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 62);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 62, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 62);
                      	
                    }
                    // Kp.g:2171:2: ( (a9= QUOTED_34_34 ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==QUOTED_34_34) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred19_Kp()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // Kp.g:2172:3: (a9= QUOTED_34_34 )
                            {
                            // Kp.g:2172:3: (a9= QUOTED_34_34 )
                            // Kp.g:2173:4: a9= QUOTED_34_34
                            {
                            a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1742); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                              					incompleteObjects.push(element);
                              				}
                              				if (a9 != null) {
                              					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                              					tokenResolver.setOptions(getOptions());
                              					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String)resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_4, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a9, element);
                              				}
                              			
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 63);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 63, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 63);
                      	
                    }
                    // Kp.g:2219:2: ( (a10= QUOTED_34_34 ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==QUOTED_34_34) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Kp.g:2220:3: (a10= QUOTED_34_34 )
                            {
                            // Kp.g:2220:3: (a10= QUOTED_34_34 )
                            // Kp.g:2221:4: a10= QUOTED_34_34
                            {
                            a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1781); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (terminateParsing) {
                              					throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                              				}
                              				if (element == null) {
                              					element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                              					incompleteObjects.push(element);
                              				}
                              				if (a10 != null) {
                              					org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                              					tokenResolver.setOptions(getOptions());
                              					org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                              					tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), result);
                              					Object resolvedObject = result.getResolvedToken();
                              					if (resolvedObject == null) {
                              						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStopIndex());
                              					}
                              					java.lang.String resolved = (java.lang.String)resolvedObject;
                              					if (resolved != null) {
                              						Object value = resolved;
                              						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), value);
                              						completedElement(value, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_1_5, resolved, true);
                              					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a10, element);
                              				}
                              			
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 64, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 64);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_Dependency_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Dependency"


    // $ANTLR start "parse_org_kermeta_kp_WeaveDirective"
    // Kp.g:2268:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
    public final org.kermeta.kp.WeaveDirective parse_org_kermeta_kp_WeaveDirective() throws RecognitionException {
        org.kermeta.kp.WeaveDirective element =  null;
        int parse_org_kermeta_kp_WeaveDirective_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.Expression a3_0 = null;

        org.kermeta.kp.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Kp.g:2271:1: (a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // Kp.g:2272:2: a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_WeaveDirective1826); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_52, 65);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 65);
              	
            }
            // Kp.g:2287:2: ( (a1= QUOTED_34_34 ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==QUOTED_34_34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Kp.g:2288:3: (a1= QUOTED_34_34 )
                    {
                    // Kp.g:2288:3: (a1= QUOTED_34_34 )
                    // Kp.g:2289:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1849); if (state.failed) return element;
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
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_1, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 66);
              	
            }
            a2=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_WeaveDirective1879); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }
            // Kp.g:2340:2: (a3_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2341:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1897);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_3, a3_0, true);
              				copyLocalizationInfos(a3_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }
            // Kp.g:2367:2: (a4_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2368:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1919);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_7_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 69, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 69);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_WeaveDirective_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_WeaveDirective"


    // $ANTLR start "parse_org_kermeta_kp_Option"
    // Kp.g:2404:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Kp.g:2407:1: (a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) )
            // Kp.g:2408:2: a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_Option1952); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_56, 70);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 70);
              	
            }
            // Kp.g:2423:2: ( (a1= QUOTED_34_34 ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==QUOTED_34_34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Kp.g:2424:3: (a1= QUOTED_34_34 )
                    {
                    // Kp.g:2424:3: (a1= QUOTED_34_34 )
                    // Kp.g:2425:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1975); if (state.failed) return element;
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
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						Object value = resolved;
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), value);
                      						completedElement(value, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_1, resolved, true);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 71);
              	
            }
            a2=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Option2005); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 72);
              	
            }
            // Kp.g:2475:2: (a3= QUOTED_34_34 )
            // Kp.g:2476:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2023); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              				incompleteObjects.push(element);
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_8_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 73);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_kermeta_kp_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Option"


    // $ANTLR start "parse_org_kermeta_kp_StringExpression"
    // Kp.g:2522:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Kp.g:2525:1: ( (a0= QUOTED_34_34 ) )
            // Kp.g:2526:2: (a0= QUOTED_34_34 )
            {
            // Kp.g:2526:2: (a0= QUOTED_34_34 )
            // Kp.g:2527:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2063); if (state.failed) return element;
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
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_9_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_kermeta_kp_StringExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_StringExpression"


    // $ANTLR start "parse_org_kermeta_kp_MixExpression"
    // Kp.g:2565:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Kp.g:2568:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // Kp.g:2569:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_MixExpression2099); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              	
            }
            // Kp.g:2584:2: (a1_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2585:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2117);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_1, a1_0, true);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 76, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              	
            }
            // Kp.g:2611:2: (a2_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2612:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2139);
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
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_59, 77);
              	
            }
            a3=(Token)match(input,32,FOLLOW_32_in_parse_org_kermeta_kp_MixExpression2157); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_10_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 78, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_kermeta_kp_MixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_MixExpression"


    // $ANTLR start "parse_org_kermeta_kp_KermetaProjectRef"
    // Kp.g:2654:1: parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null] : (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )? ;
    public final org.kermeta.kp.KermetaProjectRef parse_org_kermeta_kp_KermetaProjectRef() throws RecognitionException {
        org.kermeta.kp.KermetaProjectRef element =  null;
        int parse_org_kermeta_kp_KermetaProjectRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Kp.g:2657:1: ( (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )? )
            // Kp.g:2658:2: (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )?
            {
            // Kp.g:2658:2: (a0= QUOTED_34_34 )
            // Kp.g:2659:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2190); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_60, 79);
              	
            }
            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProjectRef2211); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 80);
              	
            }
            // Kp.g:2708:2: (a2= QUOTED_34_34 )
            // Kp.g:2709:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2229); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_62, 81);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 81);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 81, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 81);
              	
            }
            // Kp.g:2747:2: ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Kp.g:2748:3: (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Kp.g:2748:3: (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) )
                    // Kp.g:2749:4: a3= 'URL' a4= '=' (a5= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_KermetaProjectRef2259); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_64, 82);
                      			
                    }
                    a4=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_KermetaProjectRef2279); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_65, 83);
                      			
                    }
                    // Kp.g:2777:4: (a5= QUOTED_34_34 )
                    // Kp.g:2778:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2305); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      						incompleteObjects.push(element);
                      					}
                      					if (a5 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_3_0_0_2, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 84);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 84, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 84);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 85);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 85, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 85);
              	
            }
            // Kp.g:2824:2: ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Kp.g:2825:3: (a6= '[' (a7= QUOTED_34_34 ) a8= ']' )
                    {
                    // Kp.g:2825:3: (a6= '[' (a7= QUOTED_34_34 ) a8= ']' )
                    // Kp.g:2826:4: a6= '[' (a7= QUOTED_34_34 ) a8= ']'
                    {
                    a6=(Token)match(input,33,FOLLOW_33_in_parse_org_kermeta_kp_KermetaProjectRef2360); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_66, 86);
                      			
                    }
                    // Kp.g:2840:4: (a7= QUOTED_34_34 )
                    // Kp.g:2841:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2386); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      						incompleteObjects.push(element);
                      					}
                      					if (a7 != null) {
                      						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							Object value = resolved;
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), value);
                      							completedElement(value, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_1, resolved, true);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_67, 87);
                      			
                    }
                    a8=(Token)match(input,34,FOLLOW_34_in_parse_org_kermeta_kp_KermetaProjectRef2419); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_11_0_0_4_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 88, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 88);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 89, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 89);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_kermeta_kp_KermetaProjectRef_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_KermetaProjectRef"


    // $ANTLR start "parse_org_kermeta_kp_Expression"
    // Kp.g:2901:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Kp.g:2902:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==QUOTED_34_34) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // Kp.g:2903:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2463);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2904:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2473);
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
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_kermeta_kp_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Expression"

    // $ANTLR start synpred13_Kp
    public final void synpred13_Kp_fragment() throws RecognitionException {   
        Token a2=null;

        // Kp.g:1264:3: ( (a2= QUOTED_34_34 ) )
        // Kp.g:1264:3: (a2= QUOTED_34_34 )
        {
        // Kp.g:1264:3: (a2= QUOTED_34_34 )
        // Kp.g:1265:4: a2= QUOTED_34_34
        {
        a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred13_Kp909); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_Kp

    // $ANTLR start synpred14_Kp
    public final void synpred14_Kp_fragment() throws RecognitionException {   
        Token a2=null;

        // Kp.g:1406:3: ( (a2= QUOTED_34_34 ) )
        // Kp.g:1406:3: (a2= QUOTED_34_34 )
        {
        // Kp.g:1406:3: (a2= QUOTED_34_34 )
        // Kp.g:1407:4: a2= QUOTED_34_34
        {
        a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred14_Kp1033); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_Kp

    // $ANTLR start synpred19_Kp
    public final void synpred19_Kp_fragment() throws RecognitionException {   
        Token a9=null;

        // Kp.g:2172:3: ( (a9= QUOTED_34_34 ) )
        // Kp.g:2172:3: (a9= QUOTED_34_34 )
        {
        // Kp.g:2172:3: (a9= QUOTED_34_34 )
        // Kp.g:2173:4: a9= QUOTED_34_34
        {
        a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred19_Kp1742); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_Kp

    // Delegated rules

    public final boolean synpred19_Kp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Kp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Kp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Kp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Kp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Kp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_org_kermeta_kp_KermetaProject115 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject147 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject223 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject278 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProject298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject324 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject370 = new BitSet(new long[]{0x0000000075D40000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject399 = new BitSet(new long[]{0x0000000075D40000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject441 = new BitSet(new long[]{0x0000000075D40000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject483 = new BitSet(new long[]{0x0000000075D40000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject525 = new BitSet(new long[]{0x0000000075D40000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject566 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject589 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject609 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject650 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_Source759 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Source773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder872 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceFile996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFile1010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI1120 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI1134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1152 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_SourceNSURI1182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_SourceQuery1269 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1301 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_SourceQuery1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1357 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_SourceQuery1403 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency1559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1577 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_Dependency1598 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Dependency1612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency1655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1673 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Dependency1694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1712 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1742 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_WeaveDirective1826 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1849 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_WeaveDirective1879 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1897 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_Option1952 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1975 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Option2005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_MixExpression2099 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2117 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2139 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_kermeta_kp_MixExpression2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProjectRef2211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2229 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_KermetaProjectRef2259 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_KermetaProjectRef2279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2305 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parse_org_kermeta_kp_KermetaProjectRef2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2386 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_org_kermeta_kp_KermetaProjectRef2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred13_Kp909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred14_Kp1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred19_Kp1742 = new BitSet(new long[]{0x0000000000000002L});

}