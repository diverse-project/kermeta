// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class KptParser extends KptANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUOTED_34_34", "NSURI", "TEXT", "SL_COMMENT", "ML_COMMENT", "INTEGER", "FLOAT", "MAVEN", "WHITESPACE", "LINEBREAK", "'KermetaProject'", "':'", "'version'", "': '", "'group'", "'{'", "'}'", "'ref'", "'source'", "'='", "'from'", "'dependency'", "'weaver-directive'", "'merger-option'", "'('", "')'", "'['", "']'"
    };
    public static final int MAVEN=11;
    public static final int INTEGER=9;
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
    public static final int WHITESPACE=12;
    public static final int FLOAT=10;
    public static final int TEXT=6;
    public static final int EOF=-1;
    public static final int ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int SL_COMMENT=7;
    public static final int NSURI=5;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=13;

    // delegates
    // delegators


        public KptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public KptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[33+1];
             
             
        }
        

    public String[] getTokenNames() { return KptParser.tokenNames; }
    public String getGrammarFileName() { return "Kpt.g"; }


    	private org.kermeta.kp.editor.IKptTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	@SuppressWarnings("unused")
    	private int lastPosition;
    	
    	/**
    	 * the index of the last token that was handled by retrieveLayoutInformation()
    	 */
    	private int lastPosition2;
    	
    	private org.kermeta.kp.editor.mopp.KptTokenResolveResult tokenResolveResult = new org.kermeta.kp.editor.mopp.KptTokenResolveResult();
    	
    	/**
    	 * A flag that indicateds whether the parser should remember all expected
    	 * elements. This flag is set to true when using the parse for code completion.
    	 * Otherwise it is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private java.lang.Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used only when the parser is used
    	 * for code completion. Whenever the parser starts to read an object it is pushed
    	 * on the stack. Once the element was parser completely it is popped for the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	/**
    	 * A collection that is filled with commands to be exectued after parsing. This
    	 * collection is cleared before parsing starts and returned as part of the parse
    	 * result object.
    	 */
    	private java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> postParseCommands;
    	
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
    	 * a collection to store all anonymous tokens
    	 */
    	private java.util.List<org.antlr.runtime.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime.CommonToken>();
    	
    	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.kermeta.kp.editor.IKptProblem() {
    					public org.kermeta.kp.editor.KptEProblemType getType() {
    						return org.kermeta.kp.editor.KptEProblemType.ERROR;
    					}
    					public java.lang.String getMessage() {
    						return errorMessage;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		setPosition(expectedElement, input.index());
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kp.editor.mopp.KptDummyEObject dummy) {
    		java.lang.Object value = element.eGet(structuralFeature);
    		java.lang.Object mapKey = dummy.getValueByName("key");
    		java.lang.Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.kermeta.kp.editor.util.KptMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
    		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof org.kermeta.kp.editor.mopp.KptDummyEObject);
    			org.kermeta.kp.editor.mopp.KptDummyEObject dummy = (org.kermeta.kp.editor.mopp.KptDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
    	
    	public org.kermeta.kp.editor.IKptTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
    		try {
    			if (encoding == null) {
    				return new KptParser(new org.antlr.runtime.CommonTokenStream(new KptLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new KptParser(new org.antlr.runtime.CommonTokenStream(new KptLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			org.kermeta.kp.editor.mopp.KptPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public KptParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((KptLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((KptLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		java.lang.Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
    				return parse_org_kermeta_kp_KermetaProject();
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
    			if (type.getInstanceClass() == org.kermeta.kp.NamedElement.class) {
    				return parse_org_kermeta_kp_NamedElement();
    			}
    			if (type.getInstanceClass() == org.kermeta.kp.KermetaProjectRef.class) {
    				return parse_org_kermeta_kp_KermetaProjectRef();
    			}
    		}
    		throw new org.kermeta.kp.editor.mopp.KptUnexpectedContentTypeException(typeObject);
    	}
    	
    	private org.kermeta.kp.editor.mopp.KptTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public java.lang.Object getMissingSymbol(org.antlr.runtime.IntStream arg0, org.antlr.runtime.RecognitionException arg1, int arg2, org.antlr.runtime.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public org.kermeta.kp.editor.mopp.KptMetaInformation getMetaInformation() {
    		return new org.kermeta.kp.editor.mopp.KptMetaInformation();
    	}
    	
    	public java.lang.Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected java.lang.Object getTypeObject() {
    		java.lang.Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.kermeta.kp.editor.IKptOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.kermeta.kp.editor.IKptParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>>();
    		org.kermeta.kp.editor.mopp.KptParseResult parseResult = new org.kermeta.kp.editor.mopp.KptParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKptTextResource dummyResource) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
    		org.kermeta.kp.editor.IKptParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime.Lexer lexer = (org.antlr.runtime.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.kermeta.kp.editor.mopp.KptExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    		java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 66;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							org.kermeta.kp.editor.IKptExpectedElement newFollower = newFollowerPair.getLeft();
    							org.kermeta.kp.editor.mopp.KptExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KptExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    		for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = java.lang.Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime.IntStream input, int ttype, org.antlr.runtime.BitSet follow) throws org.antlr.runtime.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
    			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = e.getMessage();
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = org.kermeta.kp.editor.util.KptStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime.MismatchedTreeNodeException) {
    			org.antlr.runtime.MismatchedTreeNodeException mtne = (org.antlr.runtime.MismatchedTreeNodeException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: " + "xxx" + "; expecting " + tokenName;
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final java.lang.String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime.CommonToken) {
    			final org.antlr.runtime.CommonToken ct = (org.antlr.runtime.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = "";
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			org.antlr.runtime.EarlyExitException eee = (org.antlr.runtime.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedRangeException) {
    			org.antlr.runtime.MismatchedRangeException mre = (org.antlr.runtime.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
    	}
    	
    	protected void completedElement(java.lang.Object object, boolean isContainment) {
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
    	
    	public <T> T createDynamicProxy(java.lang.Class<T> clazz) {
    		java.lang.Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new java.lang.Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
    			
    			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
    			
    			public java.lang.Object invoke(java.lang.Object object, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
    				// search in dummyObject for the requested method
    				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
    				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
    					boolean matches = true;
    					if (methodInDummy.getName().equals(method.getName())) {
    						java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
    						java.lang.Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
    						if (parameterTypes.length == parameterTypesInDummy.length) {
    							for (int p = 0; p < parameterTypes.length; p++) {
    								java.lang.Class<?> parameterType = parameterTypes[p];
    								java.lang.Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
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
    	
    	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, org.kermeta.kp.editor.grammar.KptSyntaxElement syntaxElement, java.lang.Object object) {
    		if (!(syntaxElement instanceof org.kermeta.kp.editor.grammar.KptPlaceholder) && !(syntaxElement instanceof org.kermeta.kp.editor.grammar.KptKeyword)) {
    			return;
    		}
    		org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
    		for (org.antlr.runtime.CommonToken anonymousToken : anonymousTokens) {
    			layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KptLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), ""));
    		}
    		anonymousTokens.clear();
    		int currentPos = getTokenStream().index();
    		if (currentPos == 0) {
    			return;
    		}
    		int endPos = currentPos - 1;
    		for (; endPos >= this.lastPosition2; endPos--) {
    			org.antlr.runtime.Token token = getTokenStream().get(endPos);
    			int _channel = token.getChannel();
    			if (_channel != 99) {
    				break;
    			}
    		}
    		java.lang.StringBuilder hiddenTokenText = new java.lang.StringBuilder();
    		java.lang.StringBuilder visibleTokenText = new java.lang.StringBuilder();
    		org.antlr.runtime.CommonToken firstToken = null;
    		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
    			org.antlr.runtime.Token token = getTokenStream().get(pos);
    			if (firstToken == null) {
    				firstToken = (org.antlr.runtime.CommonToken) token;
    			}
    			int _channel = token.getChannel();
    			if (_channel == 99) {
    				hiddenTokenText.append(token.getText());
    			} else {
    				visibleTokenText.append(token.getText());
    			}
    		}
    		int offset = -1;
    		if (firstToken != null) {
    			offset = firstToken.getStartIndex();
    		}
    		layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KptLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
    		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
    	}
    	
    	protected org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
    		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
    			if (adapter instanceof org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter) {
    				return (org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter) adapter;
    			}
    		}
    		org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter newAdapter = new org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter();
    		element.eAdapters().add(newAdapter);
    		return newAdapter;
    	}
    	



    // $ANTLR start "start"
    // Kpt.g:671:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_kermeta_kp_KermetaProject ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        org.kermeta.kp.KermetaProject c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Kpt.g:672:1: ( (c0= parse_org_kermeta_kp_KermetaProject ) EOF )
            // Kpt.g:673:2: (c0= parse_org_kermeta_kp_KermetaProject ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Kpt.g:678:2: (c0= parse_org_kermeta_kp_KermetaProject )
            // Kpt.g:679:3: c0= parse_org_kermeta_kp_KermetaProject
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
    // Kpt.g:684:1: parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null] : a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' ;
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
            // Kpt.g:687:1: (a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}' )
            // Kpt.g:688:2: a0= 'KermetaProject' a1= ':' (a2= QUOTED_34_34 ) a3= 'version' a4= ': ' (a5= QUOTED_34_34 ) a6= 'group' a7= ':' (a8= QUOTED_34_34 ) a9= '{' ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )* a14= '}' a15= 'ref' a16= '{' ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )* a18= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_1, 1));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_2, 2));
              	
            }
            // Kpt.g:716:2: (a2= QUOTED_34_34 )
            // Kpt.g:717:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject144); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_3, 3));
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject165); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_4, 4));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject179); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_5, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_5, 5));
              	
            }
            // Kpt.g:778:2: (a5= QUOTED_34_34 )
            // Kpt.g:779:3: a5= QUOTED_34_34
            {
            a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject197); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a5 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_6, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_6, 6));
              	
            }
            a6=(Token)match(input,18,FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject218); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_7, 7));
              	
            }
            a7=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject232); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_8, 8));
              	
            }
            // Kpt.g:840:2: (a8= QUOTED_34_34 )
            // Kpt.g:841:3: a8= QUOTED_34_34
            {
            a8=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject250); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			}
              			if (a8 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_10, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_9, 9));
              	
            }
            a9=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject271); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_12, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 10));
              	
            }
            // Kpt.g:896:2: ( ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22||(LA2_0>=25 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Kpt.g:897:3: ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) )
            	    {
            	    // Kpt.g:897:3: ( (a10_0= parse_org_kermeta_kp_Source ) | (a11_0= parse_org_kermeta_kp_Dependency ) | (a12_0= parse_org_kermeta_kp_Option ) | (a13_0= parse_org_kermeta_kp_WeaveDirective ) )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // Kpt.g:898:4: (a10_0= parse_org_kermeta_kp_Source )
            	            {
            	            // Kpt.g:898:4: (a10_0= parse_org_kermeta_kp_Source )
            	            // Kpt.g:899:5: a10_0= parse_org_kermeta_kp_Source
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject300);
            	            a10_0=parse_org_kermeta_kp_Source();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a10_0 != null) {
            	              						if (a10_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, a10_0);
            	              							completedElement(a10_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_0_1, a10_0);
            	              						copyLocalizationInfos(a10_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 11));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Kpt.g:931:8: (a11_0= parse_org_kermeta_kp_Dependency )
            	            {
            	            // Kpt.g:931:8: (a11_0= parse_org_kermeta_kp_Dependency )
            	            // Kpt.g:932:5: a11_0= parse_org_kermeta_kp_Dependency
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject342);
            	            a11_0=parse_org_kermeta_kp_Dependency();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a11_0 != null) {
            	              						if (a11_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, a11_0);
            	              							completedElement(a11_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_1_1, a11_0);
            	              						copyLocalizationInfos(a11_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 12));
            	              			
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Kpt.g:964:8: (a12_0= parse_org_kermeta_kp_Option )
            	            {
            	            // Kpt.g:964:8: (a12_0= parse_org_kermeta_kp_Option )
            	            // Kpt.g:965:5: a12_0= parse_org_kermeta_kp_Option
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject384);
            	            a12_0=parse_org_kermeta_kp_Option();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a12_0 != null) {
            	              						if (a12_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, a12_0);
            	              							completedElement(a12_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_2_1, a12_0);
            	              						copyLocalizationInfos(a12_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 13));
            	              			
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Kpt.g:997:8: (a13_0= parse_org_kermeta_kp_WeaveDirective )
            	            {
            	            // Kpt.g:997:8: (a13_0= parse_org_kermeta_kp_WeaveDirective )
            	            // Kpt.g:998:5: a13_0= parse_org_kermeta_kp_WeaveDirective
            	            {
            	            pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject426);
            	            a13_0=parse_org_kermeta_kp_WeaveDirective();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	              					}
            	              					if (a13_0 != null) {
            	              						if (a13_0 != null) {
            	              							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, a13_0);
            	              							completedElement(a13_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_3_1, a13_0);
            	              						copyLocalizationInfos(a13_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
            	              				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 14));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 15));
              	
            }
            a14=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject467); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_15, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_19, 16));
              	
            }
            a15=(Token)match(input,21,FOLLOW_21_in_parse_org_kermeta_kp_KermetaProject481); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_17, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_20, 17));
              	
            }
            a16=(Token)match(input,19,FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject495); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_18, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 18, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 18));
              	
            }
            // Kpt.g:1087:2: ( ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==QUOTED_34_34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Kpt.g:1088:3: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
            	    {
            	    // Kpt.g:1088:3: ( (a17_0= parse_org_kermeta_kp_KermetaProjectRef ) )
            	    // Kpt.g:1089:4: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
            	    {
            	    // Kpt.g:1089:4: (a17_0= parse_org_kermeta_kp_KermetaProjectRef )
            	    // Kpt.g:1090:5: a17_0= parse_org_kermeta_kp_KermetaProjectRef
            	    {
            	    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject524);
            	    a17_0=parse_org_kermeta_kp_KermetaProjectRef();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
            	      					}
            	      					if (a17_0 != null) {
            	      						if (a17_0 != null) {
            	      							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, a17_0);
            	      							completedElement(a17_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_19_0_0_1, a17_0);
            	      						copyLocalizationInfos(a17_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 19, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
            	      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 19));
            	      			
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
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 20, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 20));
              	
            }
            a18=(Token)match(input,20,FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject565); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_21, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a18, element);
              	
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


    // $ANTLR start "parse_org_kermeta_kp_SourceFolder"
    // Kpt.g:1137:1: parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceFolder parse_org_kermeta_kp_SourceFolder() throws RecognitionException {
        org.kermeta.kp.SourceFolder element =  null;
        int parse_org_kermeta_kp_SourceFolder_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Kpt.g:1140:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) )
            // Kpt.g:1141:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder594); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_23, 22));
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceFolder608); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_24, 23));
              	
            }
            // Kpt.g:1169:2: (a2= QUOTED_34_34 )
            // Kpt.g:1170:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder626); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 24));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_kermeta_kp_SourceFolder_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFolder"


    // $ANTLR start "parse_org_kermeta_kp_SourceFile"
    // Kpt.g:1213:1: parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceFile parse_org_kermeta_kp_SourceFile() throws RecognitionException {
        org.kermeta.kp.SourceFile element =  null;
        int parse_org_kermeta_kp_SourceFile_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Kpt.g:1216:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) )
            // Kpt.g:1217:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceFile662); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_25, 25));
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceFile676); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_26, 26));
              	
            }
            // Kpt.g:1245:2: (a2= QUOTED_34_34 )
            // Kpt.g:1246:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile694); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 27));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_kermeta_kp_SourceFile_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceFile"


    // $ANTLR start "parse_org_kermeta_kp_SourceNSURI"
    // Kpt.g:1289:1: parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null] : a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceNSURI parse_org_kermeta_kp_SourceNSURI() throws RecognitionException {
        org.kermeta.kp.SourceNSURI element =  null;
        int parse_org_kermeta_kp_SourceNSURI_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Kpt.g:1292:1: (a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 ) )
            // Kpt.g:1293:2: a0= 'source' a1= '=' (a2= NSURI ) a3= 'from' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceNSURI730); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_27, 28));
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceNSURI744); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_28, 29));
              	
            }
            // Kpt.g:1321:2: (a2= NSURI )
            // Kpt.g:1322:3: a2= NSURI
            {
            a2=(Token)match(input,NSURI,FOLLOW_NSURI_in_parse_org_kermeta_kp_SourceNSURI762); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NSURI");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_29, 30));
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI783); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_30, 31));
              	
            }
            // Kpt.g:1369:2: (a4= QUOTED_34_34 )
            // Kpt.g:1370:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI801); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
              			}
              			if (a4 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_4, proxy);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 32));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_kermeta_kp_SourceNSURI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceNSURI"


    // $ANTLR start "parse_org_kermeta_kp_SourceQuery"
    // Kpt.g:1417:1: parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null] : a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 ) ;
    public final org.kermeta.kp.SourceQuery parse_org_kermeta_kp_SourceQuery() throws RecognitionException {
        org.kermeta.kp.SourceQuery element =  null;
        int parse_org_kermeta_kp_SourceQuery_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Kpt.g:1420:1: (a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 ) )
            // Kpt.g:1421:2: a0= 'source' a1= '=' (a2= QUOTED_34_34 ) a3= 'from' (a4= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_kermeta_kp_SourceQuery837); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_31, 33));
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_SourceQuery851); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_32, 34));
              	
            }
            // Kpt.g:1449:2: (a2= QUOTED_34_34 )
            // Kpt.g:1450:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery869); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_33, 35));
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_org_kermeta_kp_SourceQuery890); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_34, 36));
              	
            }
            // Kpt.g:1497:2: (a4= QUOTED_34_34 )
            // Kpt.g:1498:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery908); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
              			}
              			if (a4 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_4, proxy);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 37));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_kermeta_kp_SourceQuery_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_SourceQuery"


    // $ANTLR start "parse_org_kermeta_kp_Dependency"
    // Kpt.g:1545:1: parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null] : (a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 ) | a4= 'dependency' (a5= QUOTED_34_34 ) );
    public final org.kermeta.kp.Dependency parse_org_kermeta_kp_Dependency() throws RecognitionException {
        org.kermeta.kp.Dependency element =  null;
        int parse_org_kermeta_kp_Dependency_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Kpt.g:1548:1: (a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 ) | a4= 'dependency' (a5= QUOTED_34_34 ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==QUOTED_34_34) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==23) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==EOF||LA4_2==20||LA4_2==22||(LA4_2>=25 && LA4_2<=27)) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Kpt.g:1549:2: a0= 'dependency' (a1= QUOTED_34_34 ) a2= '=' (a3= QUOTED_34_34 )
                    {
                    a0=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_Dependency944); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_0, null);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_35, 38));
                      	
                    }
                    // Kpt.g:1563:2: (a1= QUOTED_34_34 )
                    // Kpt.g:1564:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency962); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a1 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), resolved);
                      					completedElement(resolved, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_1, resolved);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_36, 39));
                      	
                    }
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_Dependency983); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_2, null);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_37, 40));
                      	
                    }
                    // Kpt.g:1611:2: (a3= QUOTED_34_34 )
                    // Kpt.g:1612:3: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1001); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a3 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
                      				}
                      				String resolved = (String) resolvedObject;
                      				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      				collectHiddenTokens(element);
                      				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
                      				if (proxy != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
                      					completedElement(proxy, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_3, proxy);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 41));
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kpt.g:1658:4: a4= 'dependency' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,25,FOLLOW_25_in_parse_org_kermeta_kp_Dependency1026); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_1_0, null);
                      		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_38, 42));
                      	
                    }
                    // Kpt.g:1672:2: (a5= QUOTED_34_34 )
                    // Kpt.g:1673:3: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1044); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
                      			}
                      			if (a5 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
                      				}
                      				String resolved = (String) resolvedObject;
                      				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      				collectHiddenTokens(element);
                      				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
                      				if (proxy != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
                      					completedElement(proxy, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_1_1, proxy);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
                      		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 43));
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_kermeta_kp_Dependency_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Dependency"


    // $ANTLR start "parse_org_kermeta_kp_WeaveDirective"
    // Kpt.g:1720:1: parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null] : a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) ;
    public final org.kermeta.kp.WeaveDirective parse_org_kermeta_kp_WeaveDirective() throws RecognitionException {
        org.kermeta.kp.WeaveDirective element =  null;
        int parse_org_kermeta_kp_WeaveDirective_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.kermeta.kp.Expression a3_0 = null;

        org.kermeta.kp.Expression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Kpt.g:1723:1: (a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression ) )
            // Kpt.g:1724:2: a0= 'weaver-directive' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3_0= parse_org_kermeta_kp_Expression ) (a4_0= parse_org_kermeta_kp_Expression )
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_kermeta_kp_WeaveDirective1080); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_39, 44));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_40, 44));
              	
            }
            // Kpt.g:1739:2: ( (a1= QUOTED_34_34 ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QUOTED_34_34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Kpt.g:1740:3: (a1= QUOTED_34_34 )
                    {
                    // Kpt.g:1740:3: (a1= QUOTED_34_34 )
                    // Kpt.g:1741:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1103); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
                      				}
                      				if (a1 != null) {
                      					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), result);
                      					java.lang.Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_1, resolved);
                      					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_40, 45));
              	
            }
            a2=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_WeaveDirective1133); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 46, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_5));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 46, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_5));
              	
            }
            // Kpt.g:1790:2: (a3_0= parse_org_kermeta_kp_Expression )
            // Kpt.g:1791:3: a3_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1151);
            a3_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), a3_0);
              					completedElement(a3_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_3, a3_0);
              				copyLocalizationInfos(a3_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 47, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 47, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              	
            }
            // Kpt.g:1815:2: (a4_0= parse_org_kermeta_kp_Expression )
            // Kpt.g:1816:3: a4_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1173);
            a4_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), a4_0);
              					completedElement(a4_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_4, a4_0);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 48));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_kermeta_kp_WeaveDirective_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_WeaveDirective"


    // $ANTLR start "parse_org_kermeta_kp_Option"
    // Kpt.g:1849:1: parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null] : a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) ;
    public final org.kermeta.kp.Option parse_org_kermeta_kp_Option() throws RecognitionException {
        org.kermeta.kp.Option element =  null;
        int parse_org_kermeta_kp_Option_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Kpt.g:1852:1: (a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 ) )
            // Kpt.g:1853:2: a0= 'merger-option' ( (a1= QUOTED_34_34 ) )? a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_kermeta_kp_Option1206); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_43, 49));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_44, 49));
              	
            }
            // Kpt.g:1868:2: ( (a1= QUOTED_34_34 ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==QUOTED_34_34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kpt.g:1869:3: (a1= QUOTED_34_34 )
                    {
                    // Kpt.g:1869:3: (a1= QUOTED_34_34 )
                    // Kpt.g:1870:4: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1229); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
                      				}
                      				if (a1 != null) {
                      					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      					tokenResolver.setOptions(getOptions());
                      					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), result);
                      					java.lang.Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_1, resolved);
                      					copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_44, 50));
              	
            }
            a2=(Token)match(input,23,FOLLOW_23_in_parse_org_kermeta_kp_Option1259); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_45, 51));
              	
            }
            // Kpt.g:1918:2: (a3= QUOTED_34_34 )
            // Kpt.g:1919:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1277); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
              			}
              			if (a3 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 52));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_kermeta_kp_Option_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Option"


    // $ANTLR start "parse_org_kermeta_kp_StringExpression"
    // Kpt.g:1962:1: parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null] : (a0= QUOTED_34_34 ) ;
    public final org.kermeta.kp.StringExpression parse_org_kermeta_kp_StringExpression() throws RecognitionException {
        org.kermeta.kp.StringExpression element =  null;
        int parse_org_kermeta_kp_StringExpression_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Kpt.g:1965:1: ( (a0= QUOTED_34_34 ) )
            // Kpt.g:1966:2: (a0= QUOTED_34_34 )
            {
            // Kpt.g:1966:2: (a0= QUOTED_34_34 )
            // Kpt.g:1967:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1317); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createStringExpression();
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_8_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 53, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 53, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_kermeta_kp_StringExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_StringExpression"


    // $ANTLR start "parse_org_kermeta_kp_MixExpression"
    // Kpt.g:2003:1: parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null] : a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' ;
    public final org.kermeta.kp.MixExpression parse_org_kermeta_kp_MixExpression() throws RecognitionException {
        org.kermeta.kp.MixExpression element =  null;
        int parse_org_kermeta_kp_MixExpression_StartIndex = input.index();
        Token a0=null;
        Token a3=null;
        org.kermeta.kp.Expression a1_0 = null;

        org.kermeta.kp.Expression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Kpt.g:2006:1: (a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')' )
            // Kpt.g:2007:2: a0= '(' (a1_0= parse_org_kermeta_kp_Expression ) (a2_0= parse_org_kermeta_kp_Expression ) a3= ')'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_org_kermeta_kp_MixExpression1353); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 54, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_7));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 54, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_7));
              	
            }
            // Kpt.g:2022:2: (a1_0= parse_org_kermeta_kp_Expression )
            // Kpt.g:2023:3: a1_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1371);
            a1_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), a1_0);
              					completedElement(a1_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_1, a1_0);
              				copyLocalizationInfos(a1_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 55, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_8));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 55, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_8));
              	
            }
            // Kpt.g:2047:2: (a2_0= parse_org_kermeta_kp_Expression )
            // Kpt.g:2048:3: a2_0= parse_org_kermeta_kp_Expression
            {
            pushFollow(FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1393);
            a2_0=parse_org_kermeta_kp_Expression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), a2_0);
              					completedElement(a2_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_2, a2_0);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_46, 56));
              	
            }
            a3=(Token)match(input,29,FOLLOW_29_in_parse_org_kermeta_kp_MixExpression1411); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 57, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 57, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_kermeta_kp_MixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_MixExpression"


    // $ANTLR start "parse_org_kermeta_kp_NamedElement"
    // Kpt.g:2088:1: parse_org_kermeta_kp_NamedElement returns [org.kermeta.kp.NamedElement element = null] : ( (a0= TEXT ) | c0= parse_org_kermeta_kp_KermetaProject | c1= parse_org_kermeta_kp_Dependency | c2= parse_org_kermeta_kp_WeaveDirective | c3= parse_org_kermeta_kp_Option | c4= parse_org_kermeta_kp_KermetaProjectRef );
    public final org.kermeta.kp.NamedElement parse_org_kermeta_kp_NamedElement() throws RecognitionException {
        org.kermeta.kp.NamedElement element =  null;
        int parse_org_kermeta_kp_NamedElement_StartIndex = input.index();
        Token a0=null;
        org.kermeta.kp.KermetaProject c0 = null;

        org.kermeta.kp.Dependency c1 = null;

        org.kermeta.kp.WeaveDirective c2 = null;

        org.kermeta.kp.Option c3 = null;

        org.kermeta.kp.KermetaProjectRef c4 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Kpt.g:2091:1: ( (a0= TEXT ) | c0= parse_org_kermeta_kp_KermetaProject | c1= parse_org_kermeta_kp_Dependency | c2= parse_org_kermeta_kp_WeaveDirective | c3= parse_org_kermeta_kp_Option | c4= parse_org_kermeta_kp_KermetaProjectRef )
            int alt7=6;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case QUOTED_34_34:
                {
                alt7=6;
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
                    // Kpt.g:2092:2: (a0= TEXT )
                    {
                    // Kpt.g:2092:2: (a0= TEXT )
                    // Kpt.g:2093:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_kermeta_kp_NamedElement1444); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (terminateParsing) {
                      				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      			}
                      			if (element == null) {
                      				element = org.kermeta.kp.KpFactory.eINSTANCE.createNamedElement();
                      			}
                      			if (a0 != null) {
                      				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      				tokenResolver.setOptions(getOptions());
                      				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), result);
                      				java.lang.Object resolvedObject = result.getResolvedToken();
                      				if (resolvedObject == null) {
                      					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
                      				}
                      				java.lang.String resolved = (java.lang.String)resolvedObject;
                      				if (resolved != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), resolved);
                      					completedElement(resolved, false);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_10_0_0_0, resolved);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
                      			}
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      	
                    }

                    }
                    break;
                case 2 :
                    // Kpt.g:2127:2: c0= parse_org_kermeta_kp_KermetaProject
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProject_in_parse_org_kermeta_kp_NamedElement1470);
                    c0=parse_org_kermeta_kp_KermetaProject();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Kpt.g:2128:4: c1= parse_org_kermeta_kp_Dependency
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_NamedElement1480);
                    c1=parse_org_kermeta_kp_Dependency();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Kpt.g:2129:4: c2= parse_org_kermeta_kp_WeaveDirective
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_NamedElement1490);
                    c2=parse_org_kermeta_kp_WeaveDirective();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Kpt.g:2130:4: c3= parse_org_kermeta_kp_Option
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_NamedElement1500);
                    c3=parse_org_kermeta_kp_Option();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Kpt.g:2131:4: c4= parse_org_kermeta_kp_KermetaProjectRef
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_NamedElement1510);
                    c4=parse_org_kermeta_kp_KermetaProjectRef();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_kermeta_kp_NamedElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_NamedElement"


    // $ANTLR start "parse_org_kermeta_kp_KermetaProjectRef"
    // Kpt.g:2135:1: parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null] : (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= '[' (a4= QUOTED_34_34 ) a5= ']' ) )? ;
    public final org.kermeta.kp.KermetaProjectRef parse_org_kermeta_kp_KermetaProjectRef() throws RecognitionException {
        org.kermeta.kp.KermetaProjectRef element =  null;
        int parse_org_kermeta_kp_KermetaProjectRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Kpt.g:2138:1: ( (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= '[' (a4= QUOTED_34_34 ) a5= ']' ) )? )
            // Kpt.g:2139:2: (a0= QUOTED_34_34 ) a1= ':' (a2= QUOTED_34_34 ) ( (a3= '[' (a4= QUOTED_34_34 ) a5= ']' ) )?
            {
            // Kpt.g:2139:2: (a0= QUOTED_34_34 )
            // Kpt.g:2140:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1539); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              			}
              			if (a0 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_48, 59));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_org_kermeta_kp_KermetaProjectRef1560); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_49, 60));
              	
            }
            // Kpt.g:2187:2: (a2= QUOTED_34_34 )
            // Kpt.g:2188:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1578); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
              			}
              			if (element == null) {
              				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
              			}
              			if (a2 != null) {
              				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_50, 61));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 61, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 61));
              	
            }
            // Kpt.g:2223:2: ( (a3= '[' (a4= QUOTED_34_34 ) a5= ']' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Kpt.g:2224:3: (a3= '[' (a4= QUOTED_34_34 ) a5= ']' )
                    {
                    // Kpt.g:2224:3: (a3= '[' (a4= QUOTED_34_34 ) a5= ']' )
                    // Kpt.g:2225:4: a3= '[' (a4= QUOTED_34_34 ) a5= ']'
                    {
                    a3=(Token)match(input,30,FOLLOW_30_in_parse_org_kermeta_kp_KermetaProjectRef1608); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_51, 62));
                      			
                    }
                    // Kpt.g:2239:4: (a4= QUOTED_34_34 )
                    // Kpt.g:2240:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1634); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					}
                      					if (a4 != null) {
                      						org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                      						tokenResolver.setOptions(getOptions());
                      						org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_52, 63));
                      			
                    }
                    a5=(Token)match(input,31,FOLLOW_31_in_parse_org_kermeta_kp_KermetaProjectRef1667); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 64, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
                      				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 64));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 65, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
              		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 65));
              	
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


    // $ANTLR start "parse_org_kermeta_kp_Source"
    // Kpt.g:2298:1: parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null] : (c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery );
    public final org.kermeta.kp.Source parse_org_kermeta_kp_Source() throws RecognitionException {
        org.kermeta.kp.Source element =  null;
        int parse_org_kermeta_kp_Source_StartIndex = input.index();
        org.kermeta.kp.SourceFolder c0 = null;

        org.kermeta.kp.SourceFile c1 = null;

        org.kermeta.kp.SourceNSURI c2 = null;

        org.kermeta.kp.SourceQuery c3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Kpt.g:2299:1: (c0= parse_org_kermeta_kp_SourceFolder | c1= parse_org_kermeta_kp_SourceFile | c2= parse_org_kermeta_kp_SourceNSURI | c3= parse_org_kermeta_kp_SourceQuery )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==QUOTED_34_34) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==24) ) {
                            alt9=4;
                        }
                        else if ( (synpred15_Kpt()) ) {
                            alt9=1;
                        }
                        else if ( (synpred16_Kpt()) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA9_2==NSURI) ) {
                        alt9=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // Kpt.g:2300:2: c0= parse_org_kermeta_kp_SourceFolder
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source1711);
                    c0=parse_org_kermeta_kp_SourceFolder();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kpt.g:2301:4: c1= parse_org_kermeta_kp_SourceFile
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source1721);
                    c1=parse_org_kermeta_kp_SourceFile();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Kpt.g:2302:4: c2= parse_org_kermeta_kp_SourceNSURI
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source1731);
                    c2=parse_org_kermeta_kp_SourceNSURI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Kpt.g:2303:4: c3= parse_org_kermeta_kp_SourceQuery
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source1741);
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
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_kermeta_kp_Source_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Source"


    // $ANTLR start "parse_org_kermeta_kp_Expression"
    // Kpt.g:2307:1: parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null] : (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression );
    public final org.kermeta.kp.Expression parse_org_kermeta_kp_Expression() throws RecognitionException {
        org.kermeta.kp.Expression element =  null;
        int parse_org_kermeta_kp_Expression_StartIndex = input.index();
        org.kermeta.kp.StringExpression c0 = null;

        org.kermeta.kp.MixExpression c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Kpt.g:2308:1: (c0= parse_org_kermeta_kp_StringExpression | c1= parse_org_kermeta_kp_MixExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==QUOTED_34_34) ) {
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
                    // Kpt.g:2309:2: c0= parse_org_kermeta_kp_StringExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression1762);
                    c0=parse_org_kermeta_kp_StringExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Kpt.g:2310:4: c1= parse_org_kermeta_kp_MixExpression
                    {
                    pushFollow(FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression1772);
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
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_kermeta_kp_Expression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_org_kermeta_kp_Expression"

    // $ANTLR start synpred15_Kpt
    public final void synpred15_Kpt_fragment() throws RecognitionException {   
        org.kermeta.kp.SourceFolder c0 = null;


        // Kpt.g:2300:2: (c0= parse_org_kermeta_kp_SourceFolder )
        // Kpt.g:2300:2: c0= parse_org_kermeta_kp_SourceFolder
        {
        pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFolder_in_synpred15_Kpt1711);
        c0=parse_org_kermeta_kp_SourceFolder();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Kpt

    // $ANTLR start synpred16_Kpt
    public final void synpred16_Kpt_fragment() throws RecognitionException {   
        org.kermeta.kp.SourceFile c1 = null;


        // Kpt.g:2301:4: (c1= parse_org_kermeta_kp_SourceFile )
        // Kpt.g:2301:4: c1= parse_org_kermeta_kp_SourceFile
        {
        pushFollow(FOLLOW_parse_org_kermeta_kp_SourceFile_in_synpred16_Kpt1721);
        c1=parse_org_kermeta_kp_SourceFile();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Kpt

    // Delegated rules

    public final boolean synpred16_Kpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Kpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Kpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Kpt_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_14_in_parse_org_kermeta_kp_KermetaProject112 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject144 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_kermeta_kp_KermetaProject165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_kermeta_kp_KermetaProject179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_kermeta_kp_KermetaProject218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProject232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProject250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject271 = new BitSet(new long[]{0x000000000E500000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Source_in_parse_org_kermeta_kp_KermetaProject300 = new BitSet(new long[]{0x000000000E500000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_KermetaProject342 = new BitSet(new long[]{0x000000000E500000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_KermetaProject384 = new BitSet(new long[]{0x000000000E500000L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_KermetaProject426 = new BitSet(new long[]{0x000000000E500000L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject467 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_kermeta_kp_KermetaProject481 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_kermeta_kp_KermetaProject495 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_KermetaProject524 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_parse_org_kermeta_kp_KermetaProject565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFolder594 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceFolder608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFolder626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceFile662 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceFile676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceFile694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceNSURI730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceNSURI744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NSURI_in_parse_org_kermeta_kp_SourceNSURI762 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_SourceNSURI783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceNSURI801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_kermeta_kp_SourceQuery837 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_SourceQuery851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery869 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_kermeta_kp_SourceQuery890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_SourceQuery908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_Dependency944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency962 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_Dependency983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_kermeta_kp_Dependency1026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Dependency1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_kermeta_kp_WeaveDirective1080 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_WeaveDirective1103 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_WeaveDirective1133 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1151 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_WeaveDirective1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_kermeta_kp_Option1206 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1229 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_kermeta_kp_Option1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_Option1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_StringExpression1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_kermeta_kp_MixExpression1353 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1371 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Expression_in_parse_org_kermeta_kp_MixExpression1393 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_org_kermeta_kp_MixExpression1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_kermeta_kp_NamedElement1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProject_in_parse_org_kermeta_kp_NamedElement1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Dependency_in_parse_org_kermeta_kp_NamedElement1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_WeaveDirective_in_parse_org_kermeta_kp_NamedElement1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_Option_in_parse_org_kermeta_kp_NamedElement1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_KermetaProjectRef_in_parse_org_kermeta_kp_NamedElement1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1539 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_kermeta_kp_KermetaProjectRef1560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1578 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_org_kermeta_kp_KermetaProjectRef1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_kermeta_kp_KermetaProjectRef1634 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_kermeta_kp_KermetaProjectRef1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_parse_org_kermeta_kp_Source1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_parse_org_kermeta_kp_Source1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceNSURI_in_parse_org_kermeta_kp_Source1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceQuery_in_parse_org_kermeta_kp_Source1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_StringExpression_in_parse_org_kermeta_kp_Expression1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_MixExpression_in_parse_org_kermeta_kp_Expression1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFolder_in_synpred15_Kpt1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_kermeta_kp_SourceFile_in_synpred16_Kpt1721 = new BitSet(new long[]{0x0000000000000002L});

}