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
            this.state.ruleMemo = new HashMap[38+1];
             
             
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
    		int followSetID = 89;
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
    // Kp.g:639:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ;
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
            // Kp.g:642:1: (a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' )
            // Kp.g:643:2: a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) ) )? ( (a6= 'group' a7= ':' (a8= QUOTED_34_34 ) ) )? a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}'
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
            a15=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject580); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_11, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 19);
              	
            }
            a16=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject594); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_12, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 20);
              	
            }
            // Kp.g:1084:2: ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==QUOTED_34_34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Kp.g:1085:3: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
            	    {
            	    // Kp.g:1085:3: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
            	    // Kp.g:1086:4: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
            	    {
            	    // Kp.g:1086:4: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
            	    // Kp.g:1087:5: a17_0= parse_org_kermeta_kp_KermetaProjectRef
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject623);
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
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_13_0_0_1, a17_0, true);
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
            a18=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject664); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_15, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a18, element);
              	
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
    // Kp.g:1136:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) | c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery );
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
            // Kp.g:1139:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) | c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
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
                    // Kp.g:1140:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_Source693); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 24);
                      	
                    }
                    a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Source707); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 25);
                      	
                    }
                    // Kp.g:1168:2: (a2= QUOTED_34_34 )
                    // Kp.g:1169:3: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source725); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 26);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1215:2: c0= parse_org_kermeta_kp_SourceFolder
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source751);
                    c0=parse_org_kermeta_kp_SourceFolder();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Kp.g:1216:4: c1= parse_org_kermeta_kp_SourceFile
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source761);
                    c1=parse_org_kermeta_kp_SourceFile();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Kp.g:1217:4: c2= parse_org_kermeta_kp_SourceNSURI
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source771);
                    c2=parse_org_kermeta_kp_SourceNSURI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Kp.g:1218:4: c3= parse_org_kermeta_kp_SourceQuery
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source781);
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
    // Kp.g:1222:1: parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null] : a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) ;
    public final org.kermeta.kp.SourceFolder parse_org_kermeta_kp_SourceFolder() throws RecognitionException {
        org.kermeta.kp.SourceFolder element =  null;
        int parse_org_kermeta_kp_SourceFolder_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kp.g:1225:1: (a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) )
            // Kp.g:1226:2: a0= 'srcDir' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder806); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 27);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder820); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 28);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 28);
              	
            }
            // Kp.g:1255:2: ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUOTED_34_34) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred12_Kp()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Kp.g:1256:3: (a2= QUOTED_34_34 )
                    {
                    // Kp.g:1256:3: (a2= QUOTED_34_34 )
                    // Kp.g:1257:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder843); if (state.failed) return element;
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
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 29, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 29);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1302:6: (a3= QUOTED_34_34 )
                    {
                    // Kp.g:1302:6: (a3= QUOTED_34_34 )
                    // Kp.g:1303:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder881); if (state.failed) return element;
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
    // Kp.g:1364:1: parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null] : a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) ;
    public final org.kermeta.kp.SourceFile parse_org_kermeta_kp_SourceFile() throws RecognitionException {
        org.kermeta.kp.SourceFile element =  null;
        int parse_org_kermeta_kp_SourceFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kp.g:1367:1: (a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) ) )
            // Kp.g:1368:2: a0= 'srcFile' a1= '=' ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceFile930); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 32);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceFile944); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_30, 33);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_31, 33);
              	
            }
            // Kp.g:1397:2: ( (a2= QUOTED_34_34 ) | (a3= QUOTED_34_34 ) )
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
                    // Kp.g:1398:3: (a2= QUOTED_34_34 )
                    {
                    // Kp.g:1398:3: (a2= QUOTED_34_34 )
                    // Kp.g:1399:4: a2= QUOTED_34_34
                    {
                    a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile967); if (state.failed) return element;
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
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 34, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 34);
                      		
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:1444:6: (a3= QUOTED_34_34 )
                    {
                    // Kp.g:1444:6: (a3= QUOTED_34_34 )
                    // Kp.g:1445:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1005); if (state.failed) return element;
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
    // Kp.g:1506:1: parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null] : a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )? ;
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
            // Kp.g:1509:1: (a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )? )
            // Kp.g:1510:2: a0= 'srcNSURI' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI1054); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_32, 37);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI1068); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_33, 38);
              	
            }
            // Kp.g:1538:2: (a2= QUOTED_34_34 )
            // Kp.g:1539:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1086); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_34, 39);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 39);
              	
            }
            // Kp.g:1584:2: ( (a3= 'from' (a4= QUOTED_34_34 ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Kp.g:1585:3: (a3= 'from' (a4= QUOTED_34_34 ) )
                    {
                    // Kp.g:1585:3: (a3= 'from' (a4= QUOTED_34_34 ) )
                    // Kp.g:1586:4: a3= 'from' (a4= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_SourceNSURI1116); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_35, 40);
                      			
                    }
                    // Kp.g:1600:4: (a4= QUOTED_34_34 )
                    // Kp.g:1601:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1142); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 41, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 41);
                      			
                    }

                    }


                    }
                    break;

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
    // Kp.g:1667:1: parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null] : a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )? ;
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
            // Kp.g:1670:1: (a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )? )
            // Kp.g:1671:2: a0= 'srcQuery' a1= '=' (a2= QUOTED_34_34 ) ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )?
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_SourceQuery1203); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_36, 43);
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1217); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_37, 44);
              	
            }
            // Kp.g:1699:2: (a2= QUOTED_34_34 )
            // Kp.g:1700:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1235); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_38, 45);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 45);
              	
            }
            // Kp.g:1745:2: ( (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Kp.g:1746:3: (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? )
                    {
                    // Kp.g:1746:3: (a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )? )
                    // Kp.g:1747:4: a3= 'from' (a4= QUOTED_34_34 ) ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )?
                    {
                    a3=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_SourceQuery1265); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_39, 46);
                      			
                    }
                    // Kp.g:1761:4: (a4= QUOTED_34_34 )
                    // Kp.g:1762:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1291); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_40, 47);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 47);
                      			
                    }
                    // Kp.g:1811:4: ( (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==27) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Kp.g:1812:5: (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) )
                            {
                            // Kp.g:1812:5: (a5= 'URL' a6= '=' (a7= QUOTED_34_34 ) )
                            // Kp.g:1813:6: a5= 'URL' a6= '=' (a7= QUOTED_34_34 )
                            {
                            a5=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_SourceQuery1337); if (state.failed) return element;
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
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_41, 48);
                              					
                            }
                            a6=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1363); if (state.failed) return element;
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
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_42, 49);
                              					
                            }
                            // Kp.g:1841:6: (a7= QUOTED_34_34 )
                            // Kp.g:1842:7: a7= QUOTED_34_34
                            {
                            a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1397); if (state.failed) return element;
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
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 50, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                              						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 50);
                              					
                            }

                            }


                            }
                            break;

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
    // Kp.g:1920:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : (a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 ) | a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )? );
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
            // Kp.g:1923:1: (a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 ) | a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )? )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==QUOTED_34_34) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==27) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==21) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // Kp.g:1924:2: a0= 'dependency' (a1= QUOTED_34_34 ) a2= 'URL' a3= '=' (a4= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency1493); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_43, 53);
                      	
                    }
                    // Kp.g:1938:2: (a1= QUOTED_34_34 )
                    // Kp.g:1939:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1511); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_44, 54);
                      	
                    }
                    a2=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_Dependency1532); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_45, 55);
                      	
                    }
                    a3=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Dependency1546); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_46, 56);
                      	
                    }
                    // Kp.g:2002:2: (a4= QUOTED_34_34 )
                    // Kp.g:2003:3: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1564); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 57, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 57);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2048:4: a5= 'dependency' (a6= QUOTED_34_34 ) a7= '=' (a8= QUOTED_34_34 ) ( (a9= QUOTED_34_34 ) )? ( (a10= QUOTED_34_34 ) )?
                    {
                    a5=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_Dependency1589); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_47, 58);
                      	
                    }
                    // Kp.g:2062:2: (a6= QUOTED_34_34 )
                    // Kp.g:2063:3: a6= QUOTED_34_34
                    {
                    a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1607); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_48, 59);
                      	
                    }
                    a7=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Dependency1628); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_49, 60);
                      	
                    }
                    // Kp.g:2112:2: (a8= QUOTED_34_34 )
                    // Kp.g:2113:3: a8= QUOTED_34_34
                    {
                    a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1646); if (state.failed) return element;
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
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_50, 61);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_51, 61);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 61, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
                      		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 61);
                      	
                    }
                    // Kp.g:2163:2: ( (a9= QUOTED_34_34 ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==QUOTED_34_34) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred18_Kp()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // Kp.g:2164:3: (a9= QUOTED_34_34 )
                            {
                            // Kp.g:2164:3: (a9= QUOTED_34_34 )
                            // Kp.g:2165:4: a9= QUOTED_34_34
                            {
                            a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1676); if (state.failed) return element;
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
                    // Kp.g:2211:2: ( (a10= QUOTED_34_34 ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==QUOTED_34_34) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Kp.g:2212:3: (a10= QUOTED_34_34 )
                            {
                            // Kp.g:2212:3: (a10= QUOTED_34_34 )
                            // Kp.g:2213:4: a10= QUOTED_34_34
                            {
                            a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1715); if (state.failed) return element;
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
    // Kp.g:2260:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
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
            // Kp.g:2263:1: (a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // Kp.g:2264:2: a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_WeaveDirective1760); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_52, 64);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 64);
              	
            }
            // Kp.g:2279:2: ( (a1= QUOTED_34_34 ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==QUOTED_34_34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Kp.g:2280:3: (a1= QUOTED_34_34 )
                    {
                    // Kp.g:2280:3: (a1= QUOTED_34_34 )
                    // Kp.g:2281:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1783); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_53, 65);
              	
            }
            a2=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_WeaveDirective1813); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 66, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 66, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
              	
            }
            // Kp.g:2332:2: (a3_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2333:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1831);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 67, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
            }
            // Kp.g:2359:2: (a4_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2360:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1853);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 68, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 68);
              	
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
    // Kp.g:2396:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Kp.g:2399:1: (a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) )
            // Kp.g:2400:2: a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_Option1886); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_56, 69);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 69);
              	
            }
            // Kp.g:2415:2: ( (a1= QUOTED_34_34 ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==QUOTED_34_34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Kp.g:2416:3: (a1= QUOTED_34_34 )
                    {
                    // Kp.g:2416:3: (a1= QUOTED_34_34 )
                    // Kp.g:2417:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1909); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_57, 70);
              	
            }
            a2=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_Option1939); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_58, 71);
              	
            }
            // Kp.g:2467:2: (a3= QUOTED_34_34 )
            // Kp.g:2468:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1957); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 72, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 72);
              	
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
    // Kp.g:2514:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Kp.g:2517:1: ( (a0= QUOTED_34_34 ) )
            // Kp.g:2518:2: (a0= QUOTED_34_34 )
            {
            // Kp.g:2518:2: (a0= QUOTED_34_34 )
            // Kp.g:2519:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1997); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 73, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
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
    // Kp.g:2557:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Kp.g:2560:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // Kp.g:2561:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_MixExpression2033); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 74, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_7);
              	
            }
            // Kp.g:2576:2: (a1_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2577:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2051);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 75, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_8);
              	
            }
            // Kp.g:2603:2: (a2_0= parse_org_kermeta_kp_Expression )
            // Kp.g:2604:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2073);
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_59, 76);
              	
            }
            a3=(Token)match(input,32,FOLLOW_32_in_parse_org_kermeta_kp_MixExpression2091); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_54, 77, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_55, 77, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_6);
              	
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
    // Kp.g:2646:1: parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null] : (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )? ;
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
            // Kp.g:2649:1: ( (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )? )
            // Kp.g:2650:2: (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )? ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )?
            {
            // Kp.g:2650:2: (a0= QUOTED_34_34 )
            // Kp.g:2651:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2124); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_60, 78);
              	
            }
            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_kermeta_kp_KermetaProjectRef2145); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_61, 79);
              	
            }
            // Kp.g:2700:2: (a2= QUOTED_34_34 )
            // Kp.g:2701:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2163); if (state.failed) return element;
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
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_62, 80);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 80);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 80, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 80);
              	
            }
            // Kp.g:2739:2: ( (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Kp.g:2740:3: (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Kp.g:2740:3: (a3= 'URL' a4= '=' (a5= QUOTED_34_34 ) )
                    // Kp.g:2741:4: a3= 'URL' a4= '=' (a5= QUOTED_34_34 )
                    {
                    a3=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_KermetaProjectRef2193); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_64, 81);
                      			
                    }
                    a4=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_KermetaProjectRef2213); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_65, 82);
                      			
                    }
                    // Kp.g:2769:4: (a5= QUOTED_34_34 )
                    // Kp.g:2770:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2239); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 83);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 83, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 83);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_63, 84);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 84, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 84);
              	
            }
            // Kp.g:2816:2: ( (a6= '[' (a7= QUOTED_34_34 ) a8= ']' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Kp.g:2817:3: (a6= '[' (a7= QUOTED_34_34 ) a8= ']' )
                    {
                    // Kp.g:2817:3: (a6= '[' (a7= QUOTED_34_34 ) a8= ']' )
                    // Kp.g:2818:4: a6= '[' (a7= QUOTED_34_34 ) a8= ']'
                    {
                    a6=(Token)match(input,33,FOLLOW_33_in_parse_org_kermeta_kp_KermetaProjectRef2294); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_66, 85);
                      			
                    }
                    // Kp.g:2832:4: (a7= QUOTED_34_34 )
                    // Kp.g:2833:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2320); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_67, 86);
                      			
                    }
                    a8=(Token)match(input,34,FOLLOW_34_in_parse_org_kermeta_kp_KermetaProjectRef2353); if (state.failed) return element;
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
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 87, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
                      				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 87);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 88, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
              		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 88);
              	
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
    // Kp.g:2893:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Kp.g:2894:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==QUOTED_34_34) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Kp.g:2895:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2397);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kp.g:2896:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2407);
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

    // $ANTLR start synpred12_Kp
    public final void synpred12_Kp_fragment() throws RecognitionException {   
        Token a2=null;

        // Kp.g:1256:3: ( (a2= QUOTED_34_34 ) )
        // Kp.g:1256:3: (a2= QUOTED_34_34 )
        {
        // Kp.g:1256:3: (a2= QUOTED_34_34 )
        // Kp.g:1257:4: a2= QUOTED_34_34
        {
        a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred12_Kp843); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_Kp

    // $ANTLR start synpred13_Kp
    public final void synpred13_Kp_fragment() throws RecognitionException {   
        Token a2=null;

        // Kp.g:1398:3: ( (a2= QUOTED_34_34 ) )
        // Kp.g:1398:3: (a2= QUOTED_34_34 )
        {
        // Kp.g:1398:3: (a2= QUOTED_34_34 )
        // Kp.g:1399:4: a2= QUOTED_34_34
        {
        a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred13_Kp967); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_Kp

    // $ANTLR start synpred18_Kp
    public final void synpred18_Kp_fragment() throws RecognitionException {   
        Token a9=null;

        // Kp.g:2164:3: ( (a9= QUOTED_34_34 ) )
        // Kp.g:2164:3: (a9= QUOTED_34_34 )
        {
        // Kp.g:2164:3: (a9= QUOTED_34_34 )
        // Kp.g:2165:4: a9= QUOTED_34_34
        {
        a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_synpred18_Kp1676); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_Kp

    // Delegated rules

    public final boolean synpred12_Kp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Kp_fragment(); // can never throw exception
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
    public final boolean synpred18_Kp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Kp_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject566 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject594 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject623 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_Source693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Source707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Source725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFolder820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceFile930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceFile944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI1054 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceNSURI1068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1086 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_SourceNSURI1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_SourceQuery1203 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1235 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_SourceQuery1265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1291 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_SourceQuery1337 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_SourceQuery1363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1511 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_Dependency1532 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Dependency1546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_Dependency1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1607 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Dependency1628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1646 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1676 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_WeaveDirective1760 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1783 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_WeaveDirective1813 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1831 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_Option1886 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1909 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_Option1939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_MixExpression2033 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2051 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression2073 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_kermeta_kp_MixExpression2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_kermeta_kp_KermetaProjectRef2145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2163 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_KermetaProjectRef2193 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_KermetaProjectRef2213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2239 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parse_org_kermeta_kp_KermetaProjectRef2294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef2320 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_org_kermeta_kp_KermetaProjectRef2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred12_Kp843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred13_Kp967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_synpred18_Kp1676 = new BitSet(new long[]{0x0000000000000002L});

}