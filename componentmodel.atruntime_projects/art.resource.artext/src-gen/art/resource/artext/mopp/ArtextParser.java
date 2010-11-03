// $ANTLR ${project.version} ${buildNumber}

	package art.resource.artext.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
public class ArtextParser extends ArtextANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "STRING_LITERAL", "T_INSTANCE_STATE", "T_PORT_KIND", "MULTIPLICITY", "T_IMPLEM", "SL_COMMENT", "ML_COMMENT", "ANNOTATION", "T_OPTIONAL", "WHITESPACE", "LINEBREAKS", "'system'", "';'", "'datatype'", "'node'", "'uri'", "'='", "'{'", "'}'", "'primitive'", "'instance'", "':'", "'implementation'", "'composite'", "'bind'", "'to'", "'::'", "'('", "'id'", "')'", "'delegate'", "':='", "','", "'['", "'->'", "']'", "'type'", "'compositetype'", "'operation'", "'functional'", "'service'", "'control'", "'port'", "'..'", "'protocol'", "'FractalComponent'", "'<'", "'controllerDesc'", "'contentDesc'", "'>'", "'OSGiComponent'", "'typegroup'", "'types'", "'instancegroup'", "'instances'", "'attribute'", "'default'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ANNOTATION=12;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T_OPTIONAL=13;
    public static final int T__61=61;
    public static final int LINEBREAKS=15;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_PORT_KIND=7;
    public static final int T__55=55;
    public static final int ML_COMMENT=11;
    public static final int MULTIPLICITY=8;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int STRING_LITERAL=5;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T_IMPLEM=9;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T_INSTANCE_STATE=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int WHITESPACE=14;
    public static final int TEXT=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int SL_COMMENT=10;

    // delegates
    // delegators


        public ArtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ArtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[92+1];
             
             
        }
        

    public String[] getTokenNames() { return ArtextParser.tokenNames; }
    public String getGrammarFileName() { return "Artext.g"; }


    	private art.resource.artext.IArtextTokenResolverFactory tokenResolverFactory = new art.resource.artext.mopp.ArtextTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	@SuppressWarnings("unused")
    	private int lastPosition;
    	
    	/**
    	 * the index of the last token that was handled by retrieveLayoutInformation()
    	 */
    	private int lastPosition2;
    	
    	private art.resource.artext.mopp.ArtextTokenResolveResult tokenResolveResult = new art.resource.artext.mopp.ArtextTokenResolveResult();
    	
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
    	private java.util.List<art.resource.artext.mopp.ArtextExpectedTerminal> expectedElements = new java.util.ArrayList<art.resource.artext.mopp.ArtextExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
    	
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
    	private java.util.Collection<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>> postParseCommands;
    	
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
    	private java.util.List<org.antlr.runtime3_2_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_2_0.CommonToken>();
    	
    	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>() {
    			public boolean execute(art.resource.artext.IArtextTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new art.resource.artext.IArtextProblem() {
    					public art.resource.artext.ArtextEProblemType getType() {
    						return art.resource.artext.ArtextEProblemType.ERROR;
    					}
    					public java.lang.String getMessage() {
    						return errorMessage;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(art.resource.artext.mopp.ArtextExpectedTerminal expectedElement) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		setPosition(expectedElement, input.index());
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, art.resource.artext.mopp.ArtextDummyEObject dummy) {
    		java.lang.Object value = element.eGet(structuralFeature);
    		java.lang.Object mapKey = dummy.getValueByName("key");
    		java.lang.Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = art.resource.artext.util.ArtextMapUtil.castToEMap(value);
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
    			assert(object instanceof art.resource.artext.mopp.ArtextDummyEObject);
    			art.resource.artext.mopp.ArtextDummyEObject dummy = (art.resource.artext.mopp.ArtextDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>() {
    			public boolean execute(art.resource.artext.IArtextTextResource resource) {
    				art.resource.artext.IArtextLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>() {
    			public boolean execute(art.resource.artext.IArtextTextResource resource) {
    				art.resource.artext.IArtextLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>() {
    			public boolean execute(art.resource.artext.IArtextTextResource resource) {
    				art.resource.artext.IArtextLocationMap locationMap = resource.getLocationMap();
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
    	
    	public art.resource.artext.IArtextTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
    		try {
    			if (encoding == null) {
    				return new ArtextParser(new org.antlr.runtime3_2_0.CommonTokenStream(new ArtextLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new ArtextParser(new org.antlr.runtime3_2_0.CommonTokenStream(new ArtextLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			art.resource.artext.mopp.ArtextPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public ArtextParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((ArtextLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((ArtextLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		java.lang.Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == art.System.class) {
    				return parse_art_System();
    			}
    			if (type.getInstanceClass() == art.DataType.class) {
    				return parse_art_DataType();
    			}
    			if (type.getInstanceClass() == art.distrib.Node.class) {
    				return parse_art_distrib_Node();
    			}
    			if (type.getInstanceClass() == art.instance.PrimitiveInstance.class) {
    				return parse_art_instance_PrimitiveInstance();
    			}
    			if (type.getInstanceClass() == art.instance.CompositeInstance.class) {
    				return parse_art_instance_CompositeInstance();
    			}
    			if (type.getInstanceClass() == art.instance.TransmissionBinding.class) {
    				return parse_art_instance_TransmissionBinding();
    			}
    			if (type.getInstanceClass() == art.instance.DelegationBinding.class) {
    				return parse_art_instance_DelegationBinding();
    			}
    			if (type.getInstanceClass() == art.instance.ValuedAttribute.class) {
    				return parse_art_instance_ValuedAttribute();
    			}
    			if (type.getInstanceClass() == art.instance.DictionaryValuedAttribute.class) {
    				return parse_art_instance_DictionaryValuedAttribute();
    			}
    			if (type.getInstanceClass() == art.instance.DefaultEntry.class) {
    				return parse_art_instance_DefaultEntry();
    			}
    			if (type.getInstanceClass() == art.instance.OtherEntry.class) {
    				return parse_art_instance_OtherEntry();
    			}
    			if (type.getInstanceClass() == art.type.PrimitiveType.class) {
    				return parse_art_type_PrimitiveType();
    			}
    			if (type.getInstanceClass() == art.type.CompositeType.class) {
    				return parse_art_type_CompositeType();
    			}
    			if (type.getInstanceClass() == art.type.Operation.class) {
    				return parse_art_type_Operation();
    			}
    			if (type.getInstanceClass() == art.type.Parameter.class) {
    				return parse_art_type_Parameter();
    			}
    			if (type.getInstanceClass() == art.type.FunctionalService.class) {
    				return parse_art_type_FunctionalService();
    			}
    			if (type.getInstanceClass() == art.type.ControlService.class) {
    				return parse_art_type_ControlService();
    			}
    			if (type.getInstanceClass() == art.type.Port.class) {
    				return parse_art_type_Port();
    			}
    			if (type.getInstanceClass() == art.implem.FractalComponent.class) {
    				return parse_art_implem_FractalComponent();
    			}
    			if (type.getInstanceClass() == art.implem.OSGiComponent.class) {
    				return parse_art_implem_OSGiComponent();
    			}
    			if (type.getInstanceClass() == art.group.TypeGroup.class) {
    				return parse_art_group_TypeGroup();
    			}
    			if (type.getInstanceClass() == art.group.InstanceGroup.class) {
    				return parse_art_group_InstanceGroup();
    			}
    			if (type.getInstanceClass() == art.implem.OSGiType.class) {
    				return parse_art_implem_OSGiType();
    			}
    			if (type.getInstanceClass() == art.type.BasicAttribute.class) {
    				return parse_art_type_BasicAttribute();
    			}
    			if (type.getInstanceClass() == art.type.Dictionary.class) {
    				return parse_art_type_Dictionary();
    			}
    			if (type.getInstanceClass() == art.type.DictionaryDefaultValue.class) {
    				return parse_art_type_DictionaryDefaultValue();
    			}
    			if (type.getInstanceClass() == art.type.PortId.class) {
    				return parse_art_type_PortId();
    			}
    			if (type.getInstanceClass() == art.type.PortCollection.class) {
    				return parse_art_type_PortCollection();
    			}
    		}
    		throw new art.resource.artext.mopp.ArtextUnexpectedContentTypeException(typeObject);
    	}
    	
    	private art.resource.artext.mopp.ArtextTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public java.lang.Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public art.resource.artext.mopp.ArtextMetaInformation getMetaInformation() {
    		return new art.resource.artext.mopp.ArtextMetaInformation();
    	}
    	
    	public java.lang.Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected art.resource.artext.mopp.ArtextReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (art.resource.artext.mopp.ArtextReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected java.lang.Object getTypeObject() {
    		java.lang.Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(art.resource.artext.IArtextOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public art.resource.artext.IArtextParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>>();
    		art.resource.artext.mopp.ArtextParseResult parseResult = new art.resource.artext.mopp.ArtextParseResult();
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
    	
    	public java.util.List<art.resource.artext.mopp.ArtextExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, art.resource.artext.IArtextTextResource dummyResource) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
    		art.resource.artext.IArtextParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<art.resource.artext.mopp.ArtextExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<art.resource.artext.mopp.ArtextExpectedTerminal>();
    		java.util.List<art.resource.artext.mopp.ArtextExpectedTerminal> newFollowSet = new java.util.ArrayList<art.resource.artext.mopp.ArtextExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			art.resource.artext.mopp.ArtextExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 245;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (art.resource.artext.mopp.ArtextExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (art.resource.artext.mopp.ArtextExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (art.resource.artext.util.ArtextPair<art.resource.artext.IArtextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							art.resource.artext.IArtextExpectedElement newFollower = newFollowerPair.getLeft();
    							art.resource.artext.mopp.ArtextExpectedTerminal newFollowTerminal = new art.resource.artext.mopp.ArtextExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    		for (art.resource.artext.mopp.ArtextExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(art.resource.artext.mopp.ArtextExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = java.lang.Math.max(0, tokenIndex);
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
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new art.resource.artext.IArtextCommand<art.resource.artext.IArtextTextResource>() {
    			public boolean execute(art.resource.artext.IArtextTextResource resource) {
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
    	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		java.lang.String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = art.resource.artext.util.ArtextStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: " + "xxx" + "; expecting " + tokenName;
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
    		final java.lang.String finalMessage = message;
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
    		java.lang.String message = "";
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
    			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
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
    	
    	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, art.resource.artext.grammar.ArtextSyntaxElement syntaxElement, java.lang.Object object) {
    		if (!(syntaxElement instanceof art.resource.artext.grammar.ArtextPlaceholder) && !(syntaxElement instanceof art.resource.artext.grammar.ArtextKeyword)) {
    			return;
    		}
    		art.resource.artext.mopp.ArtextLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
    		for (org.antlr.runtime3_2_0.CommonToken anonymousToken : anonymousTokens) {
    			layoutInformationAdapter.addLayoutInformation(new art.resource.artext.mopp.ArtextLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), ""));
    		}
    		anonymousTokens.clear();
    		int currentPos = getTokenStream().index();
    		if (currentPos == 0) {
    			return;
    		}
    		int endPos = currentPos - 1;
    		for (; endPos >= this.lastPosition2; endPos--) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(endPos);
    			int _channel = token.getChannel();
    			if (_channel != 99) {
    				break;
    			}
    		}
    		java.lang.StringBuilder hiddenTokenText = new java.lang.StringBuilder();
    		java.lang.StringBuilder visibleTokenText = new java.lang.StringBuilder();
    		org.antlr.runtime3_2_0.CommonToken firstToken = null;
    		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(pos);
    			if (firstToken == null) {
    				firstToken = (org.antlr.runtime3_2_0.CommonToken) token;
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
    		layoutInformationAdapter.addLayoutInformation(new art.resource.artext.mopp.ArtextLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
    		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
    	}
    	
    	protected art.resource.artext.mopp.ArtextLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
    		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
    			if (adapter instanceof art.resource.artext.mopp.ArtextLayoutInformationAdapter) {
    				return (art.resource.artext.mopp.ArtextLayoutInformationAdapter) adapter;
    			}
    		}
    		art.resource.artext.mopp.ArtextLayoutInformationAdapter newAdapter = new art.resource.artext.mopp.ArtextLayoutInformationAdapter();
    		element.eAdapters().add(newAdapter);
    		return newAdapter;
    	}
    	



    // $ANTLR start "start"
    // Artext.g:719:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_art_System ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        art.System c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Artext.g:720:1: ( (c0= parse_art_System ) EOF )
            // Artext.g:721:2: (c0= parse_art_System ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Artext.g:726:2: (c0= parse_art_System )
            // Artext.g:727:3: c0= parse_art_System
            {
            pushFollow(FOLLOW_parse_art_System_in_start82);
            c0=parse_art_System();

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


    // $ANTLR start "parse_art_System"
    // Artext.g:732:1: parse_art_System returns [art.System element = null] : a0= 'system' (a1= TEXT ) a2= ';' ( ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) ) )* ;
    public final art.System parse_art_System() throws RecognitionException {
        art.System element =  null;
        int parse_art_System_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        art.distrib.Node a3_0 = null;

        art.type.Service a4_0 = null;

        art.type.ComponentType a5_0 = null;

        art.DataType a6_0 = null;

        art.group.Group a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Artext.g:735:1: (a0= 'system' (a1= TEXT ) a2= ';' ( ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) ) )* )
            // Artext.g:736:2: a0= 'system' (a1= TEXT ) a2= ';' ( ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) ) )*
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_art_System112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_1, 1));
              	
            }
            // Artext.g:750:2: (a1= TEXT )
            // Artext.g:751:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_System130); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.ArtFactory.eINSTANCE.createSystem();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.ArtPackage.SYSTEM__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.ArtPackage.SYSTEM__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_2, 2));
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_System151); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 3, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }
            // Artext.g:805:2: ( ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=19)||(LA2_0>=41 && LA2_0<=42)||LA2_0==44||LA2_0==46||LA2_0==56||LA2_0==58) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Artext.g:806:3: ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) )
            	    {
            	    // Artext.g:806:3: ( ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) ) )
            	    // Artext.g:807:4: ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) )
            	    {
            	    // Artext.g:807:4: ( (a3_0= parse_art_distrib_Node ) | (a4_0= parse_art_type_Service ) | (a5_0= parse_art_type_ComponentType ) | (a6_0= parse_art_DataType ) | (a7_0= parse_art_group_Group ) )
            	    int alt1=5;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 44:
            	    case 46:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 41:
            	    case 42:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 56:
            	    case 58:
            	        {
            	        alt1=5;
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
            	            // Artext.g:808:5: (a3_0= parse_art_distrib_Node )
            	            {
            	            // Artext.g:808:5: (a3_0= parse_art_distrib_Node )
            	            // Artext.g:809:6: a3_0= parse_art_distrib_Node
            	            {
            	            pushFollow(FOLLOW_parse_art_distrib_Node_in_parse_art_System187);
            	            a3_0=parse_art_distrib_Node();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a3_0 != null) {
            	              							if (a3_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__NODES, a3_0);
            	              								completedElement(a3_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_5_0_0_1_0_0_0, a3_0);
            	              							copyLocalizationInfos(a3_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 4, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Artext.g:840:10: (a4_0= parse_art_type_Service )
            	            {
            	            // Artext.g:840:10: (a4_0= parse_art_type_Service )
            	            // Artext.g:841:6: a4_0= parse_art_type_Service
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Service_in_parse_art_System237);
            	            a4_0=parse_art_type_Service();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a4_0 != null) {
            	              							if (a4_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__SERVICES, a4_0);
            	              								completedElement(a4_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_5_0_0_1_0_1_0, a4_0);
            	              							copyLocalizationInfos(a4_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 5, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Artext.g:872:10: (a5_0= parse_art_type_ComponentType )
            	            {
            	            // Artext.g:872:10: (a5_0= parse_art_type_ComponentType )
            	            // Artext.g:873:6: a5_0= parse_art_type_ComponentType
            	            {
            	            pushFollow(FOLLOW_parse_art_type_ComponentType_in_parse_art_System287);
            	            a5_0=parse_art_type_ComponentType();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a5_0 != null) {
            	              							if (a5_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__TYPES, a5_0);
            	              								completedElement(a5_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_5_0_0_1_0_2_0, a5_0);
            	              							copyLocalizationInfos(a5_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 6, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Artext.g:904:10: (a6_0= parse_art_DataType )
            	            {
            	            // Artext.g:904:10: (a6_0= parse_art_DataType )
            	            // Artext.g:905:6: a6_0= parse_art_DataType
            	            {
            	            pushFollow(FOLLOW_parse_art_DataType_in_parse_art_System337);
            	            a6_0=parse_art_DataType();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a6_0 != null) {
            	              							if (a6_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__DATA_TYPES, a6_0);
            	              								completedElement(a6_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_5_0_0_1_0_3_0, a6_0);
            	              							copyLocalizationInfos(a6_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 7, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Artext.g:936:10: (a7_0= parse_art_group_Group )
            	            {
            	            // Artext.g:936:10: (a7_0= parse_art_group_Group )
            	            // Artext.g:937:6: a7_0= parse_art_group_Group
            	            {
            	            pushFollow(FOLLOW_parse_art_group_Group_in_parse_art_System387);
            	            a7_0=parse_art_group_Group();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a7_0 != null) {
            	              							if (a7_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__GROUPS, a7_0);
            	              								completedElement(a7_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_5_0_0_1_0_4_0, a7_0);
            	              							copyLocalizationInfos(a7_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 8, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 9, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
            	      			
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
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 10, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_art_System_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_System"


    // $ANTLR start "parse_art_DataType"
    // Artext.g:996:1: parse_art_DataType returns [art.DataType element = null] : a0= 'datatype' (a1= TEXT ) a2= ';' ;
    public final art.DataType parse_art_DataType() throws RecognitionException {
        art.DataType element =  null;
        int parse_art_DataType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Artext.g:999:1: (a0= 'datatype' (a1= TEXT ) a2= ';' )
            // Artext.g:1000:2: a0= 'datatype' (a1= TEXT ) a2= ';'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_art_DataType461); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_1_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_11, 11));
              	
            }
            // Artext.g:1014:2: (a1= TEXT )
            // Artext.g:1015:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_DataType479); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.ArtFactory.eINSTANCE.createDataType();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.ArtPackage.DATA_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.ArtPackage.DATA_TYPE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_1_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_12, 12));
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_DataType500); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_1_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 13, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_art_DataType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_DataType"


    // $ANTLR start "parse_art_distrib_Node"
    // Artext.g:1071:1: parse_art_distrib_Node returns [art.distrib.Node element = null] : a0= 'node' (a1= TEXT ) ( (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) ) )? a5= '{' ( (a6_0= parse_art_instance_ComponentInstance ) )* a7= '}' ;
    public final art.distrib.Node parse_art_distrib_Node() throws RecognitionException {
        art.distrib.Node element =  null;
        int parse_art_distrib_Node_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        art.instance.ComponentInstance a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Artext.g:1074:1: (a0= 'node' (a1= TEXT ) ( (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) ) )? a5= '{' ( (a6_0= parse_art_instance_ComponentInstance ) )* a7= '}' )
            // Artext.g:1075:2: a0= 'node' (a1= TEXT ) ( (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) ) )? a5= '{' ( (a6_0= parse_art_instance_ComponentInstance ) )* a7= '}'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_art_distrib_Node529); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.distrib.DistribFactory.eINSTANCE.createNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_13, 14));
              	
            }
            // Artext.g:1089:2: (a1= TEXT )
            // Artext.g:1090:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_distrib_Node547); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.distrib.DistribFactory.eINSTANCE.createNode();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.distrib.DistribPackage.NODE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.distrib.DistribPackage.NODE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_14, 15));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 15));
              	
            }
            // Artext.g:1124:2: ( (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Artext.g:1125:3: (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) )
                    {
                    // Artext.g:1125:3: (a2= 'uri' a3= '=' (a4= STRING_LITERAL ) )
                    // Artext.g:1126:4: a2= 'uri' a3= '=' (a4= STRING_LITERAL )
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_art_distrib_Node577); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.distrib.DistribFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_3_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_16, 16));
                      			
                    }
                    a3=(Token)match(input,21,FOLLOW_21_in_parse_art_distrib_Node597); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.distrib.DistribFactory.eINSTANCE.createNode();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_3_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_17, 17));
                      			
                    }
                    // Artext.g:1154:4: (a4= STRING_LITERAL )
                    // Artext.g:1155:5: a4= STRING_LITERAL
                    {
                    a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_distrib_Node623); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.distrib.DistribFactory.eINSTANCE.createNode();
                      					}
                      					if (a4 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.distrib.DistribPackage.NODE__URI), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.distrib.DistribPackage.NODE__URI), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_3_0_0_4, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 18));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 19));
              	
            }
            a5=(Token)match(input,22,FOLLOW_22_in_parse_art_distrib_Node669); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.distrib.DistribFactory.eINSTANCE.createNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 20, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 20, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 20));
              	
            }
            // Artext.g:1211:2: ( (a6_0= parse_art_instance_ComponentInstance ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Artext.g:1212:3: (a6_0= parse_art_instance_ComponentInstance )
            	    {
            	    // Artext.g:1212:3: (a6_0= parse_art_instance_ComponentInstance )
            	    // Artext.g:1213:4: a6_0= parse_art_instance_ComponentInstance
            	    {
            	    pushFollow(FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_distrib_Node692);
            	    a6_0=parse_art_instance_ComponentInstance();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = art.distrib.DistribFactory.eINSTANCE.createNode();
            	      				}
            	      				if (a6_0 != null) {
            	      					if (a6_0 != null) {
            	      						addObjectToList(element, art.distrib.DistribPackage.NODE__COMPONENTS, a6_0);
            	      						completedElement(a6_0, true);
            	      					}
            	      					collectHiddenTokens(element);
            	      					retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_6, a6_0);
            	      					copyLocalizationInfos(a6_0, element);
            	      				}
            	      			
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
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 21, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 21, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 21));
              	
            }
            a7=(Token)match(input,23,FOLLOW_23_in_parse_art_distrib_Node718); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.distrib.DistribFactory.eINSTANCE.createNode();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 22, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_art_distrib_Node_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_distrib_Node"


    // $ANTLR start "parse_art_instance_PrimitiveInstance"
    // Artext.g:1262:1: parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null] : a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' ;
    public final art.instance.PrimitiveInstance parse_art_instance_PrimitiveInstance() throws RecognitionException {
        art.instance.PrimitiveInstance element =  null;
        int parse_art_instance_PrimitiveInstance_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a11=null;
        art.implem.ComponentImplementation a7_0 = null;

        art.instance.AttributeInstance a9_0 = null;

        art.instance.TransmissionBinding a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Artext.g:1265:1: (a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' )
            // Artext.g:1266:2: a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_PrimitiveInstance747); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_21, 23));
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_PrimitiveInstance761); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_22, 24));
              	
            }
            // Artext.g:1294:2: (a2= TEXT )
            // Artext.g:1295:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance779); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_23, 25));
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_PrimitiveInstance800); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_24, 26));
              	
            }
            // Artext.g:1342:2: (a4= TEXT )
            // Artext.g:1343:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance818); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.ComponentType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_8, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_25, 27));
              	
            }
            // Artext.g:1380:2: (a5= T_INSTANCE_STATE )
            // Artext.g:1381:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance843); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a5 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_10, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_26, 28));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 28));
              	
            }
            // Artext.g:1415:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Artext.g:1416:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    // Artext.g:1416:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // Artext.g:1417:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    a6=(Token)match(input,27,FOLLOW_27_in_parse_art_instance_PrimitiveInstance873); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_12_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_28, 29, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_29, 29, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
                      			
                    }
                    // Artext.g:1432:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // Artext.g:1433:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance899);
                    a7_0=parse_art_implem_ComponentImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      					}
                      					if (a7_0 != null) {
                      						if (a7_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM), a7_0);
                      							completedElement(a7_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_12_0_0_3, a7_0);
                      						copyLocalizationInfos(a7_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 30));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 31));
              	
            }
            a8=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_PrimitiveInstance940); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_14, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 32));
              	
            }
            // Artext.g:1480:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TEXT||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Artext.g:1481:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    {
            	    // Artext.g:1481:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    // Artext.g:1482:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
            	    {
            	    // Artext.g:1482:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==TEXT) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==29) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // Artext.g:1483:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            // Artext.g:1483:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // Artext.g:1484:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance976);
            	            a9_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE, a9_0);
            	              								completedElement(a9_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_15_0_0_1_0_0_0, a9_0);
            	              							copyLocalizationInfos(a9_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 33));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Artext.g:1511:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            // Artext.g:1511:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            // Artext.g:1512:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance1026);
            	            a10_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a10_0 != null) {
            	              							if (a10_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING, a10_0);
            	              								completedElement(a10_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_15_0_0_1_0_1_0, a10_0);
            	              							copyLocalizationInfos(a10_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 34));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 35));
            	      			
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
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 36));
              	
            }
            a11=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_PrimitiveInstance1085); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_17, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 37));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 37, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 37));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_art_instance_PrimitiveInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_PrimitiveInstance"


    // $ANTLR start "parse_art_instance_CompositeInstance"
    // Artext.g:1580:1: parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null] : a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' ;
    public final art.instance.CompositeInstance parse_art_instance_CompositeInstance() throws RecognitionException {
        art.instance.CompositeInstance element =  null;
        int parse_art_instance_CompositeInstance_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a13=null;
        art.implem.ComponentImplementation a7_0 = null;

        art.instance.AttributeInstance a9_0 = null;

        art.instance.TransmissionBinding a10_0 = null;

        art.instance.ComponentInstance a11_0 = null;

        art.instance.DelegationBinding a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Artext.g:1583:1: (a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' )
            // Artext.g:1584:2: a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_CompositeInstance1114); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_36, 38));
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_CompositeInstance1128); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_37, 39));
              	
            }
            // Artext.g:1612:2: (a2= TEXT )
            // Artext.g:1613:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1146); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_38, 40));
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_CompositeInstance1167); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_39, 41));
              	
            }
            // Artext.g:1660:2: (a4= TEXT )
            // Artext.g:1661:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1185); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.ComponentType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_8, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_40, 42));
              	
            }
            // Artext.g:1698:2: (a5= T_INSTANCE_STATE )
            // Artext.g:1699:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1210); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a5 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_10, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_41, 43));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 43));
              	
            }
            // Artext.g:1733:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Artext.g:1734:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    // Artext.g:1734:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // Artext.g:1735:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    a6=(Token)match(input,27,FOLLOW_27_in_parse_art_instance_CompositeInstance1240); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_12_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_28, 44, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_29, 44, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
                      			
                    }
                    // Artext.g:1750:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // Artext.g:1751:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1266);
                    a7_0=parse_art_implem_ComponentImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      					}
                      					if (a7_0 != null) {
                      						if (a7_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM), a7_0);
                      							completedElement(a7_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_12_0_0_3, a7_0);
                      						copyLocalizationInfos(a7_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 45));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 46));
              	
            }
            a8=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_CompositeInstance1307); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_14, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 47));
              	
            }
            // Artext.g:1801:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TEXT||LA10_0==24||(LA10_0>=28 && LA10_0<=29)||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Artext.g:1802:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    {
            	    // Artext.g:1802:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    // Artext.g:1803:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
            	    {
            	    // Artext.g:1803:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
            	    int alt9=4;
            	    switch ( input.LA(1) ) {
            	    case TEXT:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 24:
            	    case 28:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // Artext.g:1804:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            // Artext.g:1804:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // Artext.g:1805:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1343);
            	            a9_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE, a9_0);
            	              								completedElement(a9_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_15_0_0_1_0_0_0, a9_0);
            	              							copyLocalizationInfos(a9_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 48));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Artext.g:1835:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            // Artext.g:1835:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            // Artext.g:1836:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1393);
            	            a10_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a10_0 != null) {
            	              							if (a10_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING, a10_0);
            	              								completedElement(a10_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_15_0_0_1_0_1_0, a10_0);
            	              							copyLocalizationInfos(a10_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 49));
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Artext.g:1866:10: (a11_0= parse_art_instance_ComponentInstance )
            	            {
            	            // Artext.g:1866:10: (a11_0= parse_art_instance_ComponentInstance )
            	            // Artext.g:1867:6: a11_0= parse_art_instance_ComponentInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1443);
            	            a11_0=parse_art_instance_ComponentInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a11_0 != null) {
            	              							if (a11_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, a11_0);
            	              								completedElement(a11_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_15_0_0_1_0_2_0, a11_0);
            	              							copyLocalizationInfos(a11_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 50));
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Artext.g:1897:10: (a12_0= parse_art_instance_DelegationBinding )
            	            {
            	            // Artext.g:1897:10: (a12_0= parse_art_instance_DelegationBinding )
            	            // Artext.g:1898:6: a12_0= parse_art_instance_DelegationBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1493);
            	            a12_0=parse_art_instance_DelegationBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a12_0 != null) {
            	              							if (a12_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION, a12_0);
            	              								completedElement(a12_0, true);
            	              							}
            	              							collectHiddenTokens(element);
            	              							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_15_0_0_1_0_3_0, a12_0);
            	              							copyLocalizationInfos(a12_0, element);
            	              						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
            	              					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 51));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 52));
            	      			
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
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 53));
              	
            }
            a13=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_CompositeInstance1552); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_17, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 54));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 54, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 54));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_art_instance_CompositeInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_CompositeInstance"


    // $ANTLR start "parse_art_instance_TransmissionBinding"
    // Artext.g:1975:1: parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null] : a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
    public final art.instance.TransmissionBinding parse_art_instance_TransmissionBinding() throws RecognitionException {
        art.instance.TransmissionBinding element =  null;
        int parse_art_instance_TransmissionBinding_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Artext.g:1978:1: (a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // Artext.g:1979:2: a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_TransmissionBinding1581); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_43, 55));
              	
            }
            // Artext.g:1993:2: (a1= TEXT )
            // Artext.g:1994:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1599); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.AbstractPort proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_2, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_44, 56));
              	
            }
            a2=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_TransmissionBinding1620); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_45, 57));
              	
            }
            // Artext.g:2045:2: (a3= TEXT )
            // Artext.g:2046:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1638); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a3 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.instance.ComponentInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.Binding, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_6, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_46, 58));
              	
            }
            a4=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_TransmissionBinding1659); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_47, 59));
              	
            }
            // Artext.g:2097:2: (a5= TEXT )
            // Artext.g:2098:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1677); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a5 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.AbstractPort proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_8, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_48, 60));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 60));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 60, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 60));
              	
            }
            // Artext.g:2143:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Artext.g:2144:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    // Artext.g:2144:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // Artext.g:2145:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    a6=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_TransmissionBinding1707); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_49, 61));
                      			
                    }
                    a7=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_TransmissionBinding1727); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_50, 62));
                      			
                    }
                    a8=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_TransmissionBinding1747); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_4, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_51, 63));
                      			
                    }
                    // Artext.g:2187:4: (a9= STRING_LITERAL )
                    // Artext.g:2188:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1773); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					}
                      					if (a9 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__ID), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__ID), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_6, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_52, 64));
                      			
                    }
                    a10=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_TransmissionBinding1806); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_7, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 65));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 65, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 65));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 66));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 66, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 66));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_art_instance_TransmissionBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_TransmissionBinding"


    // $ANTLR start "parse_art_instance_DelegationBinding"
    // Artext.g:2258:1: parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null] : a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
    public final art.instance.DelegationBinding parse_art_instance_DelegationBinding() throws RecognitionException {
        art.instance.DelegationBinding element =  null;
        int parse_art_instance_DelegationBinding_StartIndex = input.index();
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
            // Artext.g:2261:1: (a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // Artext.g:2262:2: a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_DelegationBinding1854); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_53, 67));
              	
            }
            // Artext.g:2276:2: (a1= TEXT )
            // Artext.g:2277:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1872); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.AbstractPort proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_2, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_54, 68));
              	
            }
            a2=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_DelegationBinding1893); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_55, 69));
              	
            }
            // Artext.g:2328:2: (a3= TEXT )
            // Artext.g:2329:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1911); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a3 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.instance.ComponentInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.Binding, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_6, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_56, 70));
              	
            }
            a4=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_DelegationBinding1932); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_57, 71));
              	
            }
            // Artext.g:2380:2: (a5= TEXT )
            // Artext.g:2381:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1950); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a5 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.AbstractPort proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_8, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_58, 72));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 72, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 72));
              	
            }
            // Artext.g:2425:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Artext.g:2426:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    // Artext.g:2426:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // Artext.g:2427:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    a6=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_DelegationBinding1980); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_59, 73));
                      			
                    }
                    a7=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_DelegationBinding2000); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_60, 74));
                      			
                    }
                    a8=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_DelegationBinding2020); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_4, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_61, 75));
                      			
                    }
                    // Artext.g:2469:4: (a9= STRING_LITERAL )
                    // Artext.g:2470:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding2046); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					}
                      					if (a9 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__ID), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a9).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__ID), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_6, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_62, 76));
                      			
                    }
                    a10=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_DelegationBinding2079); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_7, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 77));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 78));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_art_instance_DelegationBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DelegationBinding"


    // $ANTLR start "parse_art_instance_ValuedAttribute"
    // Artext.g:2538:1: parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null] : (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) ;
    public final art.instance.ValuedAttribute parse_art_instance_ValuedAttribute() throws RecognitionException {
        art.instance.ValuedAttribute element =  null;
        int parse_art_instance_ValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Artext.g:2541:1: ( (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) )
            // Artext.g:2542:2: (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL )
            {
            // Artext.g:2542:2: (a0= TEXT )
            // Artext.g:2543:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute2131); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.BasicAttribute proxy = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.ValuedAttribute, art.type.BasicAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_7_0_0_0, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_63, 79));
              	
            }
            a1=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_ValuedAttribute2152); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_7_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_64, 80));
              	
            }
            // Artext.g:2594:2: (a2= STRING_LITERAL )
            // Artext.g:2595:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute2170); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_7_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 81));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 81, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 81));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_art_instance_ValuedAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_ValuedAttribute"


    // $ANTLR start "parse_art_instance_DictionaryValuedAttribute"
    // Artext.g:2637:1: parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null] : (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? ;
    public final art.instance.DictionaryValuedAttribute parse_art_instance_DictionaryValuedAttribute() throws RecognitionException {
        art.instance.DictionaryValuedAttribute element =  null;
        int parse_art_instance_DictionaryValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        art.instance.Entry a2_0 = null;

        art.instance.Entry a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Artext.g:2640:1: ( (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? )
            // Artext.g:2641:2: (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            {
            // Artext.g:2641:2: (a0= TEXT )
            // Artext.g:2642:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2210); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Dictionary proxy = art.type.TypeFactory.eINSTANCE.createDictionary();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.DictionaryValuedAttribute, art.type.Dictionary>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_0, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_65, 82));
              	
            }
            a1=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2231); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_66, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_67, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 83));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 83, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 83));
              	
            }
            // Artext.g:2702:2: ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Artext.g:2703:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    {
                    // Artext.g:2703:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    // Artext.g:2704:4: (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    {
                    // Artext.g:2704:4: (a2_0= parse_art_instance_Entry )
                    // Artext.g:2705:5: a2_0= parse_art_instance_Entry
                    {
                    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2260);
                    a2_0=parse_art_instance_Entry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                      					}
                      					if (a2_0 != null) {
                      						if (a2_0 != null) {
                      							addObjectToList(element, art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a2_0);
                      							completedElement(a2_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_4_0_0_0, a2_0);
                      						copyLocalizationInfos(a2_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_68, 84));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 84));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 84, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 84));
                      			
                    }
                    // Artext.g:2736:4: ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==37) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Artext.g:2737:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    {
                    	    // Artext.g:2737:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    // Artext.g:2738:6: a3= ',' (a4_0= parse_art_instance_Entry )
                    	    {
                    	    a3=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_DictionaryValuedAttribute2301); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_4_0_0_1_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_66, 85, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_67, 85, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
                    	      					
                    	    }
                    	    // Artext.g:2753:6: (a4_0= parse_art_instance_Entry )
                    	    // Artext.g:2754:7: a4_0= parse_art_instance_Entry
                    	    {
                    	    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2335);
                    	    a4_0=parse_art_instance_Entry();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                    	      							}
                    	      							if (a4_0 != null) {
                    	      								if (a4_0 != null) {
                    	      									addObjectToList(element, art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a4_0);
                    	      									completedElement(a4_0, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_4_0_0_1_0_0_2, a4_0);
                    	      								copyLocalizationInfos(a4_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_68, 86));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 86));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 86, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 86));
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_68, 87));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 87));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 87, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 87));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 88));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 88, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 88));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_art_instance_DictionaryValuedAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DictionaryValuedAttribute"


    // $ANTLR start "parse_art_instance_DefaultEntry"
    // Artext.g:2816:1: parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null] : a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
    public final art.instance.DefaultEntry parse_art_instance_DefaultEntry() throws RecognitionException {
        art.instance.DefaultEntry element =  null;
        int parse_art_instance_DefaultEntry_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Artext.g:2819:1: (a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // Artext.g:2820:2: a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_DefaultEntry2424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_69, 89));
              	
            }
            // Artext.g:2834:2: (a1= TEXT )
            // Artext.g:2835:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2442); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.DictionaryDefaultValue proxy = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.instance.DefaultEntry, art.type.DictionaryDefaultValue>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_2, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_70, 90));
              	
            }
            a2=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_DefaultEntry2463); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_71, 91));
              	
            }
            // Artext.g:2886:2: (a3= STRING_LITERAL )
            // Artext.g:2887:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2481); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			}
              			if (a3 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_6, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_72, 92));
              	
            }
            a4=(Token)match(input,40,FOLLOW_40_in_parse_art_instance_DefaultEntry2502); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_68, 93));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 93));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 93, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 93));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_art_instance_DefaultEntry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DefaultEntry"


    // $ANTLR start "parse_art_instance_OtherEntry"
    // Artext.g:2944:1: parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null] : a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
    public final art.instance.OtherEntry parse_art_instance_OtherEntry() throws RecognitionException {
        art.instance.OtherEntry element =  null;
        int parse_art_instance_OtherEntry_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Artext.g:2947:1: (a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // Artext.g:2948:2: a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_OtherEntry2531); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_73, 94));
              	
            }
            // Artext.g:2962:2: (a1= STRING_LITERAL )
            // Artext.g:2963:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2549); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__KEY), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_74, 95));
              	
            }
            a2=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_OtherEntry2570); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_75, 96));
              	
            }
            // Artext.g:3010:2: (a3= STRING_LITERAL )
            // Artext.g:3011:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2588); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			}
              			if (a3 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__VALUE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_6, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_76, 97));
              	
            }
            a4=(Token)match(input,40,FOLLOW_40_in_parse_art_instance_OtherEntry2609); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_68, 98));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 98));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 98, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 98));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_art_instance_OtherEntry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_OtherEntry"


    // $ANTLR start "parse_art_type_PrimitiveType"
    // Artext.g:3068:1: parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null] : a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
    public final art.type.PrimitiveType parse_art_type_PrimitiveType() throws RecognitionException {
        art.type.PrimitiveType element =  null;
        int parse_art_type_PrimitiveType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a7=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.AbstractPort a5_0 = null;

        art.type.Attribute a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Artext.g:3071:1: (a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // Artext.g:3072:2: a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_art_type_PrimitiveType2638); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_77, 99));
              	
            }
            // Artext.g:3086:2: (a1= TEXT )
            // Artext.g:3087:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType2656); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_78, 100));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 100));
              	
            }
            // Artext.g:3121:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Artext.g:3122:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    // Artext.g:3122:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // Artext.g:3123:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    a2=(Token)match(input,27,FOLLOW_27_in_parse_art_type_PrimitiveType2686); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_4_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_80, 101, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_12));
                      			
                    }
                    // Artext.g:3137:4: (a3_0= parse_art_implem_TypeImplementation )
                    // Artext.g:3138:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2712);
                    a3_0=parse_art_implem_TypeImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM), a3_0);
                      							completedElement(a3_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_4_0_0_3, a3_0);
                      						copyLocalizationInfos(a3_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 102));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 103));
              	
            }
            a4=(Token)match(input,22,FOLLOW_22_in_parse_art_type_PrimitiveType2753); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 104));
              	
            }
            // Artext.g:3186:2: ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==T_PORT_KIND||LA17_0==60) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Artext.g:3187:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    // Artext.g:3187:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==T_PORT_KIND) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==60) ) {
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
            	            // Artext.g:3188:4: (a5_0= parse_art_type_AbstractPort )
            	            {
            	            // Artext.g:3188:4: (a5_0= parse_art_type_AbstractPort )
            	            // Artext.g:3189:5: a5_0= parse_art_type_AbstractPort
            	            {
            	            pushFollow(FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_PrimitiveType2782);
            	            a5_0=parse_art_type_AbstractPort();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__PORT, a5_0);
            	              							completedElement(a5_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_7_0_0_0, a5_0);
            	              						copyLocalizationInfos(a5_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 105));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Artext.g:3217:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            // Artext.g:3217:8: (a6_0= parse_art_type_Attribute )
            	            // Artext.g:3218:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2824);
            	            a6_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE, a6_0);
            	              							completedElement(a6_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_7_0_1_0, a6_0);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 106));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 107));
              	
            }
            a7=(Token)match(input,23,FOLLOW_23_in_parse_art_type_PrimitiveType2865); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 108, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_art_type_PrimitiveType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PrimitiveType"


    // $ANTLR start "parse_art_type_CompositeType"
    // Artext.g:3279:1: parse_art_type_CompositeType returns [art.type.CompositeType element = null] : a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
    public final art.type.CompositeType parse_art_type_CompositeType() throws RecognitionException {
        art.type.CompositeType element =  null;
        int parse_art_type_CompositeType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a7=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.AbstractPort a5_0 = null;

        art.type.Attribute a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Artext.g:3282:1: (a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // Artext.g:3283:2: a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_art_type_CompositeType2894); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_86, 109));
              	
            }
            // Artext.g:3297:2: (a1= TEXT )
            // Artext.g:3298:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType2912); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_87, 110));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 110));
              	
            }
            // Artext.g:3332:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Artext.g:3333:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    // Artext.g:3333:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // Artext.g:3334:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    a2=(Token)match(input,27,FOLLOW_27_in_parse_art_type_CompositeType2942); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_4_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_80, 111, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_12));
                      			
                    }
                    // Artext.g:3348:4: (a3_0= parse_art_implem_TypeImplementation )
                    // Artext.g:3349:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2968);
                    a3_0=parse_art_implem_TypeImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__IMPLEM), a3_0);
                      							completedElement(a3_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_4_0_0_3, a3_0);
                      						copyLocalizationInfos(a3_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 112));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 113));
              	
            }
            a4=(Token)match(input,22,FOLLOW_22_in_parse_art_type_CompositeType3009); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 114));
              	
            }
            // Artext.g:3397:2: ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==T_PORT_KIND||LA20_0==60) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Artext.g:3398:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    // Artext.g:3398:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==T_PORT_KIND) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==60) ) {
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
            	            // Artext.g:3399:4: (a5_0= parse_art_type_AbstractPort )
            	            {
            	            // Artext.g:3399:4: (a5_0= parse_art_type_AbstractPort )
            	            // Artext.g:3400:5: a5_0= parse_art_type_AbstractPort
            	            {
            	            pushFollow(FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_CompositeType3038);
            	            a5_0=parse_art_type_AbstractPort();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__PORT, a5_0);
            	              							completedElement(a5_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_7_0_0_0, a5_0);
            	              						copyLocalizationInfos(a5_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 115));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Artext.g:3428:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            // Artext.g:3428:8: (a6_0= parse_art_type_Attribute )
            	            // Artext.g:3429:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType3080);
            	            a6_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE, a6_0);
            	              							completedElement(a6_0, true);
            	              						}
            	              						collectHiddenTokens(element);
            	              						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_7_0_1_0, a6_0);
            	              						copyLocalizationInfos(a6_0, element);
            	              					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
            	              				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 116));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 117));
              	
            }
            a7=(Token)match(input,23,FOLLOW_23_in_parse_art_type_CompositeType3121); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 118, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_art_type_CompositeType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_CompositeType"


    // $ANTLR start "parse_art_type_Operation"
    // Artext.g:3490:1: parse_art_type_Operation returns [art.type.Operation element = null] : a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* ;
    public final art.type.Operation parse_art_type_Operation() throws RecognitionException {
        art.type.Operation element =  null;
        int parse_art_type_Operation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        art.type.Parameter a3_0 = null;

        art.type.Parameter a5_0 = null;

        art.type.Parameter a8_0 = null;

        art.type.Parameter a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Artext.g:3493:1: (a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* )
            // Artext.g:3494:2: a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_art_type_Operation3150); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_91, 119));
              	
            }
            // Artext.g:3508:2: (a1= TEXT )
            // Artext.g:3509:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Operation3168); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createOperation();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.OPERATION__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.OPERATION__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_92, 120));
              	
            }
            a2=(Token)match(input,32,FOLLOW_32_in_parse_art_type_Operation3189); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 121, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_15));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 121));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 121));
              	
            }
            // Artext.g:3558:2: ( ( (a3_0= parse_art_type_Parameter ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==TEXT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Artext.g:3559:3: ( (a3_0= parse_art_type_Parameter ) )
                    {
                    // Artext.g:3559:3: ( (a3_0= parse_art_type_Parameter ) )
                    // Artext.g:3560:4: (a3_0= parse_art_type_Parameter )
                    {
                    // Artext.g:3560:4: (a3_0= parse_art_type_Parameter )
                    // Artext.g:3561:5: a3_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3218);
                    a3_0=parse_art_type_Parameter();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createOperation();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a3_0);
                      							completedElement(a3_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_5_0_0_0, a3_0);
                      						copyLocalizationInfos(a3_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 122));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 122));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 123));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 123));
              	
            }
            // Artext.g:3593:2: ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Artext.g:3594:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    {
            	    // Artext.g:3594:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    // Artext.g:3595:4: a4= ',' (a5_0= parse_art_type_Parameter )
            	    {
            	    a4=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Operation3268); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_6_0_0_0, null);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 124, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_15));
            	      			
            	    }
            	    // Artext.g:3609:4: (a5_0= parse_art_type_Parameter )
            	    // Artext.g:3610:5: a5_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3294);
            	    a5_0=parse_art_type_Parameter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a5_0);
            	      							completedElement(a5_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_6_0_0_2, a5_0);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 125));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 125));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 126));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 126));
              	
            }
            a6=(Token)match(input,34,FOLLOW_34_in_parse_art_type_Operation3335); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_96, 127));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 127));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 127, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 127));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 127));
              	
            }
            // Artext.g:3660:2: ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Artext.g:3661:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    {
                    // Artext.g:3661:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    // Artext.g:3662:4: a7= ':' (a8_0= parse_art_type_Parameter )
                    {
                    a7=(Token)match(input,26,FOLLOW_26_in_parse_art_type_Operation3358); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createOperation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_8_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 128, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_17));
                      			
                    }
                    // Artext.g:3676:4: (a8_0= parse_art_type_Parameter )
                    // Artext.g:3677:5: a8_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3384);
                    a8_0=parse_art_type_Parameter();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createOperation();
                      					}
                      					if (a8_0 != null) {
                      						if (a8_0 != null) {
                      							addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a8_0);
                      							completedElement(a8_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_8_0_0_1, a8_0);
                      						copyLocalizationInfos(a8_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 129));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 129, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 129));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 129));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 130));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 130, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 130));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 130));
              	
            }
            // Artext.g:3713:2: ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Artext.g:3714:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    {
            	    // Artext.g:3714:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    // Artext.g:3715:4: a9= ',' (a10_0= parse_art_type_Parameter )
            	    {
            	    a9=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Operation3434); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_9_0_0_0, null);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 131, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_17));
            	      			
            	    }
            	    // Artext.g:3729:4: (a10_0= parse_art_type_Parameter )
            	    // Artext.g:3730:5: a10_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3460);
            	    a10_0=parse_art_type_Parameter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					}
            	      					if (a10_0 != null) {
            	      						if (a10_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a10_0);
            	      							completedElement(a10_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_9_0_0_2, a10_0);
            	      						copyLocalizationInfos(a10_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 132));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 132, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 132));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 132));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 133));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 133, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 133));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 133));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_art_type_Operation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Operation"


    // $ANTLR start "parse_art_type_Parameter"
    // Artext.g:3768:1: parse_art_type_Parameter returns [art.type.Parameter element = null] : (a0= TEXT ) (a1= TEXT ) ;
    public final art.type.Parameter parse_art_type_Parameter() throws RecognitionException {
        art.type.Parameter element =  null;
        int parse_art_type_Parameter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Artext.g:3771:1: ( (a0= TEXT ) (a1= TEXT ) )
            // Artext.g:3772:2: (a0= TEXT ) (a1= TEXT )
            {
            // Artext.g:3772:2: (a0= TEXT )
            // Artext.g:3773:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3520); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createParameter();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_14_0_0_0, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_100, 134));
              	
            }
            // Artext.g:3810:2: (a1= TEXT )
            // Artext.g:3811:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3545); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createParameter();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_14_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 135));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 135));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_art_type_Parameter_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Parameter"


    // $ANTLR start "parse_art_type_FunctionalService"
    // Artext.g:3847:1: parse_art_type_FunctionalService returns [art.type.FunctionalService element = null] : a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
    public final art.type.FunctionalService parse_art_type_FunctionalService() throws RecognitionException {
        art.type.FunctionalService element =  null;
        int parse_art_type_FunctionalService_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        art.type.Operation a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Artext.g:3850:1: (a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // Artext.g:3851:2: a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            a0=(Token)match(input,44,FOLLOW_44_in_parse_art_type_FunctionalService3581); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_101, 136));
              	
            }
            a1=(Token)match(input,45,FOLLOW_45_in_parse_art_type_FunctionalService3595); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_102, 137));
              	
            }
            // Artext.g:3879:2: (a2= TEXT )
            // Artext.g:3880:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_FunctionalService3613); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_103, 138));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_type_FunctionalService3634); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 139, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 139));
              	
            }
            // Artext.g:3928:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Artext.g:3929:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    // Artext.g:3929:3: ( (a4_0= parse_art_type_Operation ) )
            	    // Artext.g:3930:4: (a4_0= parse_art_type_Operation )
            	    {
            	    // Artext.g:3930:4: (a4_0= parse_art_type_Operation )
            	    // Artext.g:3931:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3663);
            	    a4_0=parse_art_type_Operation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
            	      					}
            	      					if (a4_0 != null) {
            	      						if (a4_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION, a4_0);
            	      							completedElement(a4_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_7_0_0_0, a4_0);
            	      						copyLocalizationInfos(a4_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 140, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 140));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 141, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 141));
              	
            }
            a5=(Token)match(input,23,FOLLOW_23_in_parse_art_type_FunctionalService3704); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 142, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_art_type_FunctionalService_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_FunctionalService"


    // $ANTLR start "parse_art_type_ControlService"
    // Artext.g:3986:1: parse_art_type_ControlService returns [art.type.ControlService element = null] : a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
    public final art.type.ControlService parse_art_type_ControlService() throws RecognitionException {
        art.type.ControlService element =  null;
        int parse_art_type_ControlService_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        art.type.Operation a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Artext.g:3989:1: (a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // Artext.g:3990:2: a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            a0=(Token)match(input,46,FOLLOW_46_in_parse_art_type_ControlService3733); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_104, 143));
              	
            }
            a1=(Token)match(input,45,FOLLOW_45_in_parse_art_type_ControlService3747); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_105, 144));
              	
            }
            // Artext.g:4018:2: (a2= TEXT )
            // Artext.g:4019:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_ControlService3765); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createControlService();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.CONTROL_SERVICE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.CONTROL_SERVICE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_106, 145));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_type_ControlService3786); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 146, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 146));
              	
            }
            // Artext.g:4067:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Artext.g:4068:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    // Artext.g:4068:3: ( (a4_0= parse_art_type_Operation ) )
            	    // Artext.g:4069:4: (a4_0= parse_art_type_Operation )
            	    {
            	    // Artext.g:4069:4: (a4_0= parse_art_type_Operation )
            	    // Artext.g:4070:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3815);
            	    a4_0=parse_art_type_Operation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createControlService();
            	      					}
            	      					if (a4_0 != null) {
            	      						if (a4_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.CONTROL_SERVICE__OPERATION, a4_0);
            	      							completedElement(a4_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_7_0_0_0, a4_0);
            	      						copyLocalizationInfos(a4_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 147, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 147));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 148, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 148));
              	
            }
            a5=(Token)match(input,23,FOLLOW_23_in_parse_art_type_ControlService3856); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 149, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_art_type_ControlService_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_ControlService"


    // $ANTLR start "parse_art_type_Port"
    // Artext.g:4125:1: parse_art_type_Port returns [art.type.Port element = null] : (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '[' (a6= MULTIPLICITY ) a7= '..' (a8= MULTIPLICITY ) a9= ']' ( (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) ) )? ( (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) ) )? ;
    public final art.type.Port parse_art_type_Port() throws RecognitionException {
        art.type.Port element =  null;
        int parse_art_type_Port_StartIndex = input.index();
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
        Token a14=null;
        Token a15=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Artext.g:4128:1: ( (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '[' (a6= MULTIPLICITY ) a7= '..' (a8= MULTIPLICITY ) a9= ']' ( (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) ) )? ( (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) ) )? )
            // Artext.g:4129:2: (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '[' (a6= MULTIPLICITY ) a7= '..' (a8= MULTIPLICITY ) a9= ']' ( (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) ) )? ( (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) ) )?
            {
            // Artext.g:4129:2: (a0= T_PORT_KIND )
            // Artext.g:4130:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_Port3889); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__ROLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__ROLE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_107, 150));
              	
            }
            a1=(Token)match(input,47,FOLLOW_47_in_parse_art_type_Port3910); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_108, 151));
              	
            }
            // Artext.g:4177:2: (a2= TEXT )
            // Artext.g:4178:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3928); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_5, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_109, 152));
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_art_type_Port3949); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_110, 153));
              	
            }
            // Artext.g:4225:2: (a4= TEXT )
            // Artext.g:4226:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3967); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Service proxy = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.type.AbstractPort, art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_9, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_111, 154));
              	
            }
            a5=(Token)match(input,38,FOLLOW_38_in_parse_art_type_Port3988); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_11, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_112, 155));
              	
            }
            // Artext.g:4277:2: (a6= MULTIPLICITY )
            // Artext.g:4278:3: a6= MULTIPLICITY
            {
            a6=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port4006); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a6 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__LOWER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__LOWER), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_12, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_113, 156));
              	
            }
            a7=(Token)match(input,48,FOLLOW_48_in_parse_art_type_Port4027); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_13, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_114, 157));
              	
            }
            // Artext.g:4325:2: (a8= MULTIPLICITY )
            // Artext.g:4326:3: a8= MULTIPLICITY
            {
            a8=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port4045); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a8 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__UPPER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__UPPER), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_14, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_115, 158));
              	
            }
            a9=(Token)match(input,40,FOLLOW_40_in_parse_art_type_Port4066); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_15, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_116, 159));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_117, 159));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 159, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 159, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 159, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 159, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 159));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 159));
              	
            }
            // Artext.g:4380:2: ( (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Artext.g:4381:3: (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) )
                    {
                    // Artext.g:4381:3: (a10= 'protocol' a11= '=' (a12= STRING_LITERAL ) )
                    // Artext.g:4382:4: a10= 'protocol' a11= '=' (a12= STRING_LITERAL )
                    {
                    a10=(Token)match(input,49,FOLLOW_49_in_parse_art_type_Port4089); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_16_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_118, 160));
                      			
                    }
                    a11=(Token)match(input,21,FOLLOW_21_in_parse_art_type_Port4109); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_16_0_0_3, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_119, 161));
                      			
                    }
                    // Artext.g:4410:4: (a12= STRING_LITERAL )
                    // Artext.g:4411:5: a12= STRING_LITERAL
                    {
                    a12=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_Port4135); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPort();
                      					}
                      					if (a12 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__PROTOCOL), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a12).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__PROTOCOL), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_16_0_0_5, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a12, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_117, 162));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 162));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 162));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_117, 163));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 163));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 163));
              	
            }
            // Artext.g:4463:2: ( (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Artext.g:4464:3: (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) )
                    {
                    // Artext.g:4464:3: (a13= 'uri' a14= '=' (a15= STRING_LITERAL ) )
                    // Artext.g:4465:4: a13= 'uri' a14= '=' (a15= STRING_LITERAL )
                    {
                    a13=(Token)match(input,20,FOLLOW_20_in_parse_art_type_Port4190); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_17_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_120, 164));
                      			
                    }
                    a14=(Token)match(input,21,FOLLOW_21_in_parse_art_type_Port4210); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_17_0_0_3, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a14, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_121, 165));
                      			
                    }
                    // Artext.g:4493:4: (a15= STRING_LITERAL )
                    // Artext.g:4494:5: a15= STRING_LITERAL
                    {
                    a15=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_Port4236); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPort();
                      					}
                      					if (a15 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__URI), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a15).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__URI), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_17_0_0_5, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a15, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 166));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 166));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 167));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 167));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_art_type_Port_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Port"


    // $ANTLR start "parse_art_implem_FractalComponent"
    // Artext.g:4546:1: parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null] : a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' ;
    public final art.implem.FractalComponent parse_art_implem_FractalComponent() throws RecognitionException {
        art.implem.FractalComponent element =  null;
        int parse_art_implem_FractalComponent_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Artext.g:4549:1: (a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' )
            // Artext.g:4550:2: a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>'
            {
            a0=(Token)match(input,50,FOLLOW_50_in_parse_art_implem_FractalComponent4297); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_122, 168));
              	
            }
            a1=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_FractalComponent4311); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_123, 169));
              	
            }
            a2=(Token)match(input,52,FOLLOW_52_in_parse_art_implem_FractalComponent4325); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_124, 170));
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_art_implem_FractalComponent4339); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_5, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_125, 171));
              	
            }
            // Artext.g:4606:2: (a4= STRING_LITERAL )
            // Artext.g:4607:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4357); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_7, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_126, 172));
              	
            }
            a5=(Token)match(input,53,FOLLOW_53_in_parse_art_implem_FractalComponent4378); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_127, 173));
              	
            }
            a6=(Token)match(input,26,FOLLOW_26_in_parse_art_implem_FractalComponent4392); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_11, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_128, 174));
              	
            }
            // Artext.g:4668:2: (a7= STRING_LITERAL )
            // Artext.g:4669:3: a7= STRING_LITERAL
            {
            a7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4410); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			}
              			if (a7 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_13, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_129, 175));
              	
            }
            a8=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_FractalComponent4431); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_14, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 176));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 176));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_art_implem_FractalComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_FractalComponent"


    // $ANTLR start "parse_art_implem_OSGiComponent"
    // Artext.g:4719:1: parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null] : a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) ;
    public final art.implem.OSGiComponent parse_art_implem_OSGiComponent() throws RecognitionException {
        art.implem.OSGiComponent element =  null;
        int parse_art_implem_OSGiComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Artext.g:4722:1: (a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) )
            // Artext.g:4723:2: a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL )
            {
            a0=(Token)match(input,55,FOLLOW_55_in_parse_art_implem_OSGiComponent4460); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_19_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_130, 177));
              	
            }
            a1=(Token)match(input,26,FOLLOW_26_in_parse_art_implem_OSGiComponent4474); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_19_0_0_2, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_131, 178));
              	
            }
            // Artext.g:4751:2: (a2= STRING_LITERAL )
            // Artext.g:4752:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4492); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_19_0_0_4, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 179));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 179));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_art_implem_OSGiComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiComponent"


    // $ANTLR start "parse_art_group_TypeGroup"
    // Artext.g:4788:1: parse_art_group_TypeGroup returns [art.group.TypeGroup element = null] : a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' ;
    public final art.group.TypeGroup parse_art_group_TypeGroup() throws RecognitionException {
        art.group.TypeGroup element =  null;
        int parse_art_group_TypeGroup_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        art.group.TypeGroup a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Artext.g:4791:1: (a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' )
            // Artext.g:4792:2: a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}'
            {
            a0=(Token)match(input,56,FOLLOW_56_in_parse_art_group_TypeGroup4528); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_132, 180));
              	
            }
            // Artext.g:4806:2: (a1= TEXT )
            // Artext.g:4807:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4546); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_133, 181));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_group_TypeGroup4567); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_134, 182));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 182, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 182));
              	
            }
            // Artext.g:4856:2: ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Artext.g:4857:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    // Artext.g:4857:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // Artext.g:4858:4: a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    a3=(Token)match(input,57,FOLLOW_57_in_parse_art_group_TypeGroup4590); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_136, 183));
                      			
                    }
                    a4=(Token)match(input,26,FOLLOW_26_in_parse_art_group_TypeGroup4610); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_3, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_137, 184));
                      			
                    }
                    // Artext.g:4886:4: (a5= TEXT )
                    // Artext.g:4887:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4636); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      					}
                      					if (a5 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.type.ComponentType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.group.TypeGroup, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__TYPES, proxy);
                      							completedElement(proxy, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_5, proxy);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 185));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 185, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 185));
                      			
                    }
                    // Artext.g:4926:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==37) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Artext.g:4927:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    // Artext.g:4927:5: (a6= ',' (a7= TEXT ) )
                    	    // Artext.g:4928:6: a6= ',' (a7= TEXT )
                    	    {
                    	    a6=(Token)match(input,37,FOLLOW_37_in_parse_art_group_TypeGroup4682); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_6_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_139, 186));
                    	      					
                    	    }
                    	    // Artext.g:4942:6: (a7= TEXT )
                    	    // Artext.g:4943:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4716); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      							}
                    	      							if (a7 != null) {
                    	      								art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.type.ComponentType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.group.TypeGroup, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__TYPES, proxy);
                    	      									completedElement(proxy, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_6_0_0_2, proxy);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 187));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 187, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 187));
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 188));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 188, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 188));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 189, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 189));
              	
            }
            // Artext.g:4999:2: ( ( (a8_0= parse_art_group_TypeGroup ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==56) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Artext.g:5000:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    {
            	    // Artext.g:5000:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    // Artext.g:5001:4: (a8_0= parse_art_group_TypeGroup )
            	    {
            	    // Artext.g:5001:4: (a8_0= parse_art_group_TypeGroup )
            	    // Artext.g:5002:5: a8_0= parse_art_group_TypeGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4812);
            	    a8_0=parse_art_group_TypeGroup();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__SUB_GROUPS, a8_0);
            	      							completedElement(a8_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_6_0_0_1, a8_0);
            	      						copyLocalizationInfos(a8_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 190, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 190));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 191, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 191));
              	
            }
            a9=(Token)match(input,23,FOLLOW_23_in_parse_art_group_TypeGroup4853); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 192, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 192));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_art_group_TypeGroup_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_TypeGroup"


    // $ANTLR start "parse_art_group_InstanceGroup"
    // Artext.g:5058:1: parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null] : a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' ;
    public final art.group.InstanceGroup parse_art_group_InstanceGroup() throws RecognitionException {
        art.group.InstanceGroup element =  null;
        int parse_art_group_InstanceGroup_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        art.group.InstanceGroup a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Artext.g:5061:1: (a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' )
            // Artext.g:5062:2: a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}'
            {
            a0=(Token)match(input,58,FOLLOW_58_in_parse_art_group_InstanceGroup4882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_140, 193));
              	
            }
            // Artext.g:5076:2: (a1= TEXT )
            // Artext.g:5077:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4900); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_141, 194));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_group_InstanceGroup4921); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_142, 195));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 195, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 195));
              	
            }
            // Artext.g:5126:2: ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Artext.g:5127:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    // Artext.g:5127:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // Artext.g:5128:4: a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    a3=(Token)match(input,59,FOLLOW_59_in_parse_art_group_InstanceGroup4944); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_144, 196));
                      			
                    }
                    a4=(Token)match(input,26,FOLLOW_26_in_parse_art_group_InstanceGroup4964); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_3, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_145, 197));
                      			
                    }
                    // Artext.g:5156:4: (a5= TEXT )
                    // Artext.g:5157:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4990); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      					}
                      					if (a5 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.instance.ComponentInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.group.InstanceGroup, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__INSTANCES, proxy);
                      							completedElement(proxy, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_5, proxy);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 198));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 198, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 198));
                      			
                    }
                    // Artext.g:5196:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==37) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Artext.g:5197:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    // Artext.g:5197:5: (a6= ',' (a7= TEXT ) )
                    	    // Artext.g:5198:6: a6= ',' (a7= TEXT )
                    	    {
                    	    a6=(Token)match(input,37,FOLLOW_37_in_parse_art_group_InstanceGroup5036); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_6_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_147, 199));
                    	      					
                    	    }
                    	    // Artext.g:5212:6: (a7= TEXT )
                    	    // Artext.g:5213:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup5070); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      							}
                    	      							if (a7 != null) {
                    	      								art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.instance.ComponentInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.group.InstanceGroup, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__INSTANCES, proxy);
                    	      									completedElement(proxy, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_6_0_0_2, proxy);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 200));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 200, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
                    	      						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 200));
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 201));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 201, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 201));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 202, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 202));
              	
            }
            // Artext.g:5269:2: ( ( (a8_0= parse_art_group_InstanceGroup ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==58) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Artext.g:5270:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    {
            	    // Artext.g:5270:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    // Artext.g:5271:4: (a8_0= parse_art_group_InstanceGroup )
            	    {
            	    // Artext.g:5271:4: (a8_0= parse_art_group_InstanceGroup )
            	    // Artext.g:5272:5: a8_0= parse_art_group_InstanceGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup5166);
            	    a8_0=parse_art_group_InstanceGroup();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__SUB_GROUPS, a8_0);
            	      							completedElement(a8_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_6_0_0_1, a8_0);
            	      						copyLocalizationInfos(a8_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 203, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 203));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 204, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 204));
              	
            }
            a9=(Token)match(input,23,FOLLOW_23_in_parse_art_group_InstanceGroup5207); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_8, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_3, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_0));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_4, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_5, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_1));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_6, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_7, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_2));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_8, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_3));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 205, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_4));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 205));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_art_group_InstanceGroup_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_InstanceGroup"


    // $ANTLR start "parse_art_implem_OSGiType"
    // Artext.g:5328:1: parse_art_implem_OSGiType returns [art.implem.OSGiType element = null] : (a0= T_IMPLEM ) ;
    public final art.implem.OSGiType parse_art_implem_OSGiType() throws RecognitionException {
        art.implem.OSGiType element =  null;
        int parse_art_implem_OSGiType_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Artext.g:5331:1: ( (a0= T_IMPLEM ) )
            // Artext.g:5332:2: (a0= T_IMPLEM )
            {
            // Artext.g:5332:2: (a0= T_IMPLEM )
            // Artext.g:5333:3: a0= T_IMPLEM
            {
            a0=(Token)match(input,T_IMPLEM,FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType5240); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_22_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 206));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 206));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_art_implem_OSGiType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiType"


    // $ANTLR start "parse_art_type_BasicAttribute"
    // Artext.g:5369:1: parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? ;
    public final art.type.BasicAttribute parse_art_type_BasicAttribute() throws RecognitionException {
        art.type.BasicAttribute element =  null;
        int parse_art_type_BasicAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // Artext.g:5372:1: (a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? )
            // Artext.g:5373:2: a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            {
            a0=(Token)match(input,60,FOLLOW_60_in_parse_art_type_BasicAttribute5276); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_148, 207));
              	
            }
            // Artext.g:5387:2: (a1= TEXT )
            // Artext.g:5388:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute5294); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_149, 208));
              	
            }
            a2=(Token)match(input,26,FOLLOW_26_in_parse_art_type_BasicAttribute5315); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_5, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_150, 209));
              	
            }
            // Artext.g:5435:2: (a3= TEXT )
            // Artext.g:5436:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute5333); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			}
              			if (a3 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_7, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_151, 210));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 210));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 210));
              	
            }
            // Artext.g:5479:2: ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Artext.g:5480:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    {
                    // Artext.g:5480:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    // Artext.g:5481:4: a4= 'default' (a5= STRING_LITERAL )
                    {
                    a4=(Token)match(input,61,FOLLOW_61_in_parse_art_type_BasicAttribute5363); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_8_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_152, 211));
                      			
                    }
                    // Artext.g:5495:4: (a5= STRING_LITERAL )
                    // Artext.g:5496:5: a5= STRING_LITERAL
                    {
                    a5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5389); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
                      					}
                      					if (a5 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_8_0_0_3, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 212));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 212));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 213));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 213));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_art_type_BasicAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_BasicAttribute"


    // $ANTLR start "parse_art_type_Dictionary"
    // Artext.g:5548:1: parse_art_type_Dictionary returns [art.type.Dictionary element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? ;
    public final art.type.Dictionary parse_art_type_Dictionary() throws RecognitionException {
        art.type.Dictionary element =  null;
        int parse_art_type_Dictionary_StartIndex = input.index();
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
        Token a11=null;
        art.type.DictionaryDefaultValue a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // Artext.g:5551:1: (a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? )
            // Artext.g:5552:2: a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            {
            a0=(Token)match(input,60,FOLLOW_60_in_parse_art_type_Dictionary5450); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_153, 214));
              	
            }
            // Artext.g:5566:2: (a1= TEXT )
            // Artext.g:5567:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5468); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_154, 215));
              	
            }
            a2=(Token)match(input,26,FOLLOW_26_in_parse_art_type_Dictionary5489); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_5, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_155, 216));
              	
            }
            a3=(Token)match(input,38,FOLLOW_38_in_parse_art_type_Dictionary5503); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_156, 217));
              	
            }
            // Artext.g:5628:2: (a4= TEXT )
            // Artext.g:5629:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5521); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_7, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_157, 218));
              	
            }
            a5=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Dictionary5542); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_9, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_158, 219));
              	
            }
            // Artext.g:5680:2: (a6= TEXT )
            // Artext.g:5681:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5560); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a6 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.type.Dictionary, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_11, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_159, 220));
              	
            }
            a7=(Token)match(input,40,FOLLOW_40_in_parse_art_type_Dictionary5581); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_12, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_160, 221));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 221));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 221));
              	
            }
            // Artext.g:5738:2: ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Artext.g:5739:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    {
                    // Artext.g:5739:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    // Artext.g:5740:4: a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}'
                    {
                    a8=(Token)match(input,61,FOLLOW_61_in_parse_art_type_Dictionary5604); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_1, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_161, 222));
                      			
                    }
                    a9=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Dictionary5624); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_3, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 223, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 223));
                      			
                    }
                    // Artext.g:5769:4: ( (a10_0= parse_art_type_DictionaryDefaultValue ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==38) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Artext.g:5770:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    {
                    	    // Artext.g:5770:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    // Artext.g:5771:6: a10_0= parse_art_type_DictionaryDefaultValue
                    	    {
                    	    pushFollow(FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5657);
                    	    a10_0=parse_art_type_DictionaryDefaultValue();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = art.type.TypeFactory.eINSTANCE.createDictionary();
                    	      						}
                    	      						if (a10_0 != null) {
                    	      							if (a10_0 != null) {
                    	      								addObjectToList(element, art.type.TypePackage.DICTIONARY__KEYS, a10_0);
                    	      								completedElement(a10_0, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_4, a10_0);
                    	      							copyLocalizationInfos(a10_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 224, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 224));
                      			
                    }
                    a11=(Token)match(input,23,FOLLOW_23_in_parse_art_type_Dictionary5697); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_6, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 225));
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 225));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 226));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 226));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_art_type_Dictionary_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Dictionary"


    // $ANTLR start "parse_art_type_DictionaryDefaultValue"
    // Artext.g:5829:1: parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null] : a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' ;
    public final art.type.DictionaryDefaultValue parse_art_type_DictionaryDefaultValue() throws RecognitionException {
        art.type.DictionaryDefaultValue element =  null;
        int parse_art_type_DictionaryDefaultValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // Artext.g:5832:1: (a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' )
            // Artext.g:5833:2: a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5745); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_164, 227));
              	
            }
            // Artext.g:5847:2: (a1= STRING_LITERAL )
            // Artext.g:5848:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5763); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              			}
              			if (a1 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_3, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_165, 228));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 228));
              	
            }
            // Artext.g:5882:2: ( (a2= '->' (a3= STRING_LITERAL ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Artext.g:5883:3: (a2= '->' (a3= STRING_LITERAL ) )
                    {
                    // Artext.g:5883:3: (a2= '->' (a3= STRING_LITERAL ) )
                    // Artext.g:5884:4: a2= '->' (a3= STRING_LITERAL )
                    {
                    a2=(Token)match(input,39,FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5793); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_5_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_167, 229));
                      			
                    }
                    // Artext.g:5898:4: (a3= STRING_LITERAL )
                    // Artext.g:5899:5: a3= STRING_LITERAL
                    {
                    a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5819); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
                      					}
                      					if (a3 != null) {
                      						art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_5_0_0_2, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 230));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 231));
              	
            }
            a4=(Token)match(input,40,FOLLOW_40_in_parse_art_type_DictionaryDefaultValue5865); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 232, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 232));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_art_type_DictionaryDefaultValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_DictionaryDefaultValue"


    // $ANTLR start "parse_art_type_PortId"
    // Artext.g:5956:1: parse_art_type_PortId returns [art.type.PortId element = null] : (a0= TEXT ) ;
    public final art.type.PortId parse_art_type_PortId() throws RecognitionException {
        art.type.PortId element =  null;
        int parse_art_type_PortId_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // Artext.g:5959:1: ( (a0= TEXT ) )
            // Artext.g:5960:2: (a0= TEXT )
            {
            // Artext.g:5960:2: (a0= TEXT )
            // Artext.g:5961:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortId5898); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortId();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_ID__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_ID__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_26_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 233));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 233));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_art_type_PortId_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PortId"


    // $ANTLR start "parse_art_type_PortCollection"
    // Artext.g:5997:1: parse_art_type_PortCollection returns [art.type.PortCollection element = null] : (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}' ;
    public final art.type.PortCollection parse_art_type_PortCollection() throws RecognitionException {
        art.type.PortCollection element =  null;
        int parse_art_type_PortCollection_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        art.type.PortId a6_0 = null;

        art.type.PortId a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // Artext.g:6000:1: ( (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}' )
            // Artext.g:6001:2: (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}'
            {
            // Artext.g:6001:2: (a0= T_PORT_KIND )
            // Artext.g:6002:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_PortCollection5938); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a0 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__ROLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__ROLE), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_171, 234));
              	
            }
            a1=(Token)match(input,47,FOLLOW_47_in_parse_art_type_PortCollection5959); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_172, 235));
              	
            }
            // Artext.g:6049:2: (a2= TEXT )
            // Artext.g:6050:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortCollection5977); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a2 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_5, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_173, 236));
              	
            }
            a3=(Token)match(input,26,FOLLOW_26_in_parse_art_type_PortCollection5998); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_7, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_174, 237));
              	
            }
            // Artext.g:6097:2: (a4= TEXT )
            // Artext.g:6098:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortCollection6016); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a4 != null) {
              				art.resource.artext.IArtextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.artext.IArtextTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Service proxy = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.artext.mopp.ArtextContextDependentURIFragmentFactory<art.type.AbstractPort, art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), proxy);
              					completedElement(proxy, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_9, proxy);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_175, 238));
              	
            }
            a5=(Token)match(input,22,FOLLOW_22_in_parse_art_type_PortCollection6037); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_11, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_168, 239, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_21));
              	
            }
            // Artext.g:6149:2: (a6_0= parse_art_type_PortId )
            // Artext.g:6150:3: a6_0= parse_art_type_PortId
            {
            pushFollow(FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection6055);
            a6_0=parse_art_type_PortId();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.artext.mopp.ArtextTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a6_0 != null) {
              				if (a6_0 != null) {
              					addObjectToList(element, art.type.TypePackage.PORT_COLLECTION__IDS, a6_0);
              					completedElement(a6_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_12, a6_0);
              				copyLocalizationInfos(a6_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 240));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 240));
              	
            }
            // Artext.g:6174:2: ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Artext.g:6175:3: (a7= ',' (a8_0= parse_art_type_PortId ) )
            	    {
            	    // Artext.g:6175:3: (a7= ',' (a8_0= parse_art_type_PortId ) )
            	    // Artext.g:6176:4: a7= ',' (a8_0= parse_art_type_PortId )
            	    {
            	    a7=(Token)match(input,37,FOLLOW_37_in_parse_art_type_PortCollection6082); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createPortCollection();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_13_0_0_0, null);
            	      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_168, 241, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_21));
            	      			
            	    }
            	    // Artext.g:6190:4: (a8_0= parse_art_type_PortId )
            	    // Artext.g:6191:5: a8_0= parse_art_type_PortId
            	    {
            	    pushFollow(FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection6108);
            	    a8_0=parse_art_type_PortId();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.artext.mopp.ArtextTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createPortCollection();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.PORT_COLLECTION__IDS, a8_0);
            	      							completedElement(a8_0, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_13_0_0_2, a8_0);
            	      						copyLocalizationInfos(a8_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 242));
            	      				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 242));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 243));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 243));
              	
            }
            a9=(Token)match(input,23,FOLLOW_23_in_parse_art_type_PortCollection6149); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_14, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 244));
              		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 244));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_art_type_PortCollection_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PortCollection"


    // $ANTLR start "parse_art_type_Service"
    // Artext.g:6244:1: parse_art_type_Service returns [art.type.Service element = null] : (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService );
    public final art.type.Service parse_art_type_Service() throws RecognitionException {
        art.type.Service element =  null;
        int parse_art_type_Service_StartIndex = input.index();
        art.type.FunctionalService c0 = null;

        art.type.ControlService c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // Artext.g:6245:1: (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            else if ( (LA40_0==46) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // Artext.g:6246:2: c0= parse_art_type_FunctionalService
                    {
                    pushFollow(FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service6174);
                    c0=parse_art_type_FunctionalService();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6247:4: c1= parse_art_type_ControlService
                    {
                    pushFollow(FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service6184);
                    c1=parse_art_type_ControlService();

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
            if ( state.backtracking>0 ) { memoize(input, 30, parse_art_type_Service_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Service"


    // $ANTLR start "parse_art_type_ComponentType"
    // Artext.g:6251:1: parse_art_type_ComponentType returns [art.type.ComponentType element = null] : (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType );
    public final art.type.ComponentType parse_art_type_ComponentType() throws RecognitionException {
        art.type.ComponentType element =  null;
        int parse_art_type_ComponentType_StartIndex = input.index();
        art.type.PrimitiveType c0 = null;

        art.type.CompositeType c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // Artext.g:6252:1: (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            else if ( (LA41_0==42) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // Artext.g:6253:2: c0= parse_art_type_PrimitiveType
                    {
                    pushFollow(FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType6205);
                    c0=parse_art_type_PrimitiveType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6254:4: c1= parse_art_type_CompositeType
                    {
                    pushFollow(FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType6215);
                    c1=parse_art_type_CompositeType();

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
            if ( state.backtracking>0 ) { memoize(input, 31, parse_art_type_ComponentType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_ComponentType"


    // $ANTLR start "parse_art_group_Group"
    // Artext.g:6258:1: parse_art_group_Group returns [art.group.Group element = null] : (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup );
    public final art.group.Group parse_art_group_Group() throws RecognitionException {
        art.group.Group element =  null;
        int parse_art_group_Group_StartIndex = input.index();
        art.group.TypeGroup c0 = null;

        art.group.InstanceGroup c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // Artext.g:6259:1: (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            else if ( (LA42_0==58) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // Artext.g:6260:2: c0= parse_art_group_TypeGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group6236);
                    c0=parse_art_group_TypeGroup();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6261:4: c1= parse_art_group_InstanceGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group6246);
                    c1=parse_art_group_InstanceGroup();

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
            if ( state.backtracking>0 ) { memoize(input, 32, parse_art_group_Group_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_Group"


    // $ANTLR start "parse_art_instance_ComponentInstance"
    // Artext.g:6265:1: parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null] : (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance );
    public final art.instance.ComponentInstance parse_art_instance_ComponentInstance() throws RecognitionException {
        art.instance.ComponentInstance element =  null;
        int parse_art_instance_ComponentInstance_StartIndex = input.index();
        art.instance.PrimitiveInstance c0 = null;

        art.instance.CompositeInstance c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // Artext.g:6266:1: (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            else if ( (LA43_0==28) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // Artext.g:6267:2: c0= parse_art_instance_PrimitiveInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance6267);
                    c0=parse_art_instance_PrimitiveInstance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6268:4: c1= parse_art_instance_CompositeInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance6277);
                    c1=parse_art_instance_CompositeInstance();

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
            if ( state.backtracking>0 ) { memoize(input, 33, parse_art_instance_ComponentInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_ComponentInstance"


    // $ANTLR start "parse_art_implem_ComponentImplementation"
    // Artext.g:6272:1: parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null] : (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent );
    public final art.implem.ComponentImplementation parse_art_implem_ComponentImplementation() throws RecognitionException {
        art.implem.ComponentImplementation element =  null;
        int parse_art_implem_ComponentImplementation_StartIndex = input.index();
        art.implem.FractalComponent c0 = null;

        art.implem.OSGiComponent c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // Artext.g:6273:1: (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            else if ( (LA44_0==55) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // Artext.g:6274:2: c0= parse_art_implem_FractalComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation6298);
                    c0=parse_art_implem_FractalComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6275:4: c1= parse_art_implem_OSGiComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation6308);
                    c1=parse_art_implem_OSGiComponent();

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
            if ( state.backtracking>0 ) { memoize(input, 34, parse_art_implem_ComponentImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_ComponentImplementation"


    // $ANTLR start "parse_art_instance_AttributeInstance"
    // Artext.g:6279:1: parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null] : (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute );
    public final art.instance.AttributeInstance parse_art_instance_AttributeInstance() throws RecognitionException {
        art.instance.AttributeInstance element =  null;
        int parse_art_instance_AttributeInstance_StartIndex = input.index();
        art.instance.ValuedAttribute c0 = null;

        art.instance.DictionaryValuedAttribute c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // Artext.g:6280:1: (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==TEXT) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==36) ) {
                    int LA45_2 = input.LA(3);

                    if ( (LA45_2==STRING_LITERAL) ) {
                        alt45=1;
                    }
                    else if ( (LA45_2==EOF||LA45_2==TEXT||(LA45_2>=23 && LA45_2<=24)||(LA45_2>=28 && LA45_2<=29)||LA45_2==35||LA45_2==38) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // Artext.g:6281:2: c0= parse_art_instance_ValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance6329);
                    c0=parse_art_instance_ValuedAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6282:4: c1= parse_art_instance_DictionaryValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance6339);
                    c1=parse_art_instance_DictionaryValuedAttribute();

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
            if ( state.backtracking>0 ) { memoize(input, 35, parse_art_instance_AttributeInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_AttributeInstance"


    // $ANTLR start "parse_art_instance_Entry"
    // Artext.g:6286:1: parse_art_instance_Entry returns [art.instance.Entry element = null] : (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry );
    public final art.instance.Entry parse_art_instance_Entry() throws RecognitionException {
        art.instance.Entry element =  null;
        int parse_art_instance_Entry_StartIndex = input.index();
        art.instance.DefaultEntry c0 = null;

        art.instance.OtherEntry c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // Artext.g:6287:1: (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==STRING_LITERAL) ) {
                    alt46=2;
                }
                else if ( (LA46_1==TEXT) ) {
                    alt46=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // Artext.g:6288:2: c0= parse_art_instance_DefaultEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry6360);
                    c0=parse_art_instance_DefaultEntry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6289:4: c1= parse_art_instance_OtherEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry6370);
                    c1=parse_art_instance_OtherEntry();

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
            if ( state.backtracking>0 ) { memoize(input, 36, parse_art_instance_Entry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_Entry"


    // $ANTLR start "parse_art_implem_TypeImplementation"
    // Artext.g:6293:1: parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null] : c0= parse_art_implem_OSGiType ;
    public final art.implem.TypeImplementation parse_art_implem_TypeImplementation() throws RecognitionException {
        art.implem.TypeImplementation element =  null;
        int parse_art_implem_TypeImplementation_StartIndex = input.index();
        art.implem.OSGiType c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // Artext.g:6294:1: (c0= parse_art_implem_OSGiType )
            // Artext.g:6295:2: c0= parse_art_implem_OSGiType
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6391);
            c0=parse_art_implem_OSGiType();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; /* this is a subclass or primitive expression choice */ 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, parse_art_implem_TypeImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_TypeImplementation"


    // $ANTLR start "parse_art_type_AbstractPort"
    // Artext.g:6299:1: parse_art_type_AbstractPort returns [art.type.AbstractPort element = null] : (c0= parse_art_type_Port | c1= parse_art_type_PortCollection );
    public final art.type.AbstractPort parse_art_type_AbstractPort() throws RecognitionException {
        art.type.AbstractPort element =  null;
        int parse_art_type_AbstractPort_StartIndex = input.index();
        art.type.Port c0 = null;

        art.type.PortCollection c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }
            // Artext.g:6300:1: (c0= parse_art_type_Port | c1= parse_art_type_PortCollection )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==T_PORT_KIND) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==47) ) {
                    int LA47_2 = input.LA(3);

                    if ( (LA47_2==TEXT) ) {
                        int LA47_3 = input.LA(4);

                        if ( (LA47_3==26) ) {
                            int LA47_4 = input.LA(5);

                            if ( (LA47_4==TEXT) ) {
                                int LA47_5 = input.LA(6);

                                if ( (LA47_5==38) ) {
                                    alt47=1;
                                }
                                else if ( (LA47_5==22) ) {
                                    alt47=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 47, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // Artext.g:6301:2: c0= parse_art_type_Port
                    {
                    pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_AbstractPort6412);
                    c0=parse_art_type_Port();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6302:4: c1= parse_art_type_PortCollection
                    {
                    pushFollow(FOLLOW_parse_art_type_PortCollection_in_parse_art_type_AbstractPort6422);
                    c1=parse_art_type_PortCollection();

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
            if ( state.backtracking>0 ) { memoize(input, 38, parse_art_type_AbstractPort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_AbstractPort"


    // $ANTLR start "parse_art_type_Attribute"
    // Artext.g:6306:1: parse_art_type_Attribute returns [art.type.Attribute element = null] : (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary );
    public final art.type.Attribute parse_art_type_Attribute() throws RecognitionException {
        art.type.Attribute element =  null;
        int parse_art_type_Attribute_StartIndex = input.index();
        art.type.BasicAttribute c0 = null;

        art.type.Dictionary c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }
            // Artext.g:6307:1: (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==60) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==TEXT) ) {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==26) ) {
                        int LA48_3 = input.LA(4);

                        if ( (LA48_3==TEXT) ) {
                            alt48=1;
                        }
                        else if ( (LA48_3==38) ) {
                            alt48=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // Artext.g:6308:2: c0= parse_art_type_BasicAttribute
                    {
                    pushFollow(FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6443);
                    c0=parse_art_type_BasicAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Artext.g:6309:4: c1= parse_art_type_Dictionary
                    {
                    pushFollow(FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6453);
                    c1=parse_art_type_Dictionary();

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
            if ( state.backtracking>0 ) { memoize(input, 39, parse_art_type_Attribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Attribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_art_System_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_art_System112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_System130 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_System151 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_parse_art_distrib_Node_in_parse_art_System187 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_parse_art_type_Service_in_parse_art_System237 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_parse_art_type_ComponentType_in_parse_art_System287 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_parse_art_DataType_in_parse_art_System337 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_parse_art_group_Group_in_parse_art_System387 = new BitSet(new long[]{0x05005600000C0002L});
    public static final BitSet FOLLOW_18_in_parse_art_DataType461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_DataType479 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_DataType500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_art_distrib_Node529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_distrib_Node547 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_parse_art_distrib_Node577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_distrib_Node597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_distrib_Node623 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_distrib_Node669 = new BitSet(new long[]{0x0000000011800000L});
    public static final BitSet FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_distrib_Node692 = new BitSet(new long[]{0x0000000011800000L});
    public static final BitSet FOLLOW_23_in_parse_art_distrib_Node718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_PrimitiveInstance747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_PrimitiveInstance761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance779 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_PrimitiveInstance800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance843 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_parse_art_instance_PrimitiveInstance873 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance899 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_PrimitiveInstance940 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance976 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance1026 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_PrimitiveInstance1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_CompositeInstance1114 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_CompositeInstance1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1146 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_CompositeInstance1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1210 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_parse_art_instance_CompositeInstance1240 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1266 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_CompositeInstance1307 = new BitSet(new long[]{0x0000000831800010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1343 = new BitSet(new long[]{0x0000000831800010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1393 = new BitSet(new long[]{0x0000000831800010L});
    public static final BitSet FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1443 = new BitSet(new long[]{0x0000000831800010L});
    public static final BitSet FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1493 = new BitSet(new long[]{0x0000000831800010L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_CompositeInstance1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_TransmissionBinding1581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1599 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_TransmissionBinding1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1638 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_TransmissionBinding1659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1677 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_TransmissionBinding1707 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_TransmissionBinding1727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_TransmissionBinding1747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1773 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_TransmissionBinding1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_DelegationBinding1854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1872 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_DelegationBinding1893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1911 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_DelegationBinding1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1950 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_DelegationBinding1980 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_DelegationBinding2000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_DelegationBinding2020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding2046 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_DelegationBinding2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute2131 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_ValuedAttribute2152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2210 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2231 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2260 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_DictionaryValuedAttribute2301 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2335 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_DefaultEntry2424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2442 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_DefaultEntry2463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2481 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_art_instance_DefaultEntry2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_OtherEntry2531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2549 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_OtherEntry2570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2588 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_art_instance_OtherEntry2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_art_type_PrimitiveType2638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType2656 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_parse_art_type_PrimitiveType2686 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_PrimitiveType2753 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_PrimitiveType2782 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2824 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_23_in_parse_art_type_PrimitiveType2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_art_type_CompositeType2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType2912 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_parse_art_type_CompositeType2942 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2968 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_CompositeType3009 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_CompositeType3038 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType3080 = new BitSet(new long[]{0x1000000000800080L});
    public static final BitSet FOLLOW_23_in_parse_art_type_CompositeType3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_art_type_Operation3150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Operation3168 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_type_Operation3189 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3218 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Operation3268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3294 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_34_in_parse_art_type_Operation3335 = new BitSet(new long[]{0x0000002004000002L});
    public static final BitSet FOLLOW_26_in_parse_art_type_Operation3358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3384 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Operation3434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3460 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_art_type_FunctionalService3581 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_art_type_FunctionalService3595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_FunctionalService3613 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_FunctionalService3634 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3663 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_FunctionalService3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_art_type_ControlService3733 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_art_type_ControlService3747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_ControlService3765 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_ControlService3786 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3815 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_ControlService3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_Port3889 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_art_type_Port3910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3928 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_Port3949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3967 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_Port3988 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port4006 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_parse_art_type_Port4027 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port4045 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_art_type_Port4066 = new BitSet(new long[]{0x0002000000100002L});
    public static final BitSet FOLLOW_49_in_parse_art_type_Port4089 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_Port4109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_Port4135 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_parse_art_type_Port4190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_Port4210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_Port4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_parse_art_implem_FractalComponent4297 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_FractalComponent4311 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_art_implem_FractalComponent4325 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_implem_FractalComponent4339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4357 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_art_implem_FractalComponent4378 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_implem_FractalComponent4392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4410 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_FractalComponent4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_parse_art_implem_OSGiComponent4460 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_implem_OSGiComponent4474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_parse_art_group_TypeGroup4528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4546 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_TypeGroup4567 = new BitSet(new long[]{0x0300000000800000L});
    public static final BitSet FOLLOW_57_in_parse_art_group_TypeGroup4590 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_group_TypeGroup4610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4636 = new BitSet(new long[]{0x0100002000800000L});
    public static final BitSet FOLLOW_37_in_parse_art_group_TypeGroup4682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4716 = new BitSet(new long[]{0x0100002000800000L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4812 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_23_in_parse_art_group_TypeGroup4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_parse_art_group_InstanceGroup4882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4900 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_InstanceGroup4921 = new BitSet(new long[]{0x0D005600008C0000L});
    public static final BitSet FOLLOW_59_in_parse_art_group_InstanceGroup4944 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_group_InstanceGroup4964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4990 = new BitSet(new long[]{0x05005620008C0000L});
    public static final BitSet FOLLOW_37_in_parse_art_group_InstanceGroup5036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup5070 = new BitSet(new long[]{0x05005620008C0000L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup5166 = new BitSet(new long[]{0x05005600008C0000L});
    public static final BitSet FOLLOW_23_in_parse_art_group_InstanceGroup5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_art_type_BasicAttribute5276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute5294 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_BasicAttribute5315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute5333 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_parse_art_type_BasicAttribute5363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_art_type_Dictionary5450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5468 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_Dictionary5489 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_Dictionary5503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5521 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Dictionary5542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5560 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_art_type_Dictionary5581 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_parse_art_type_Dictionary5604 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Dictionary5624 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5657 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_Dictionary5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5763 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5819 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_art_type_DictionaryDefaultValue5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortId5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_PortCollection5938 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_art_type_PortCollection5959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortCollection5977 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_PortCollection5998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortCollection6016 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_PortCollection6037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection6055 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_PortCollection6082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection6108 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_PortCollection6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_AbstractPort6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PortCollection_in_parse_art_type_AbstractPort6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6453 = new BitSet(new long[]{0x0000000000000002L});

}