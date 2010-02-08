// $ANTLR 3.1.1

	package art.resource.art.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class ArtParser extends ArtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "T_INSTANCE_STATE", "STRING_LITERAL", "T_PORT_KIND", "T_OPTIONAL", "MULTIPLICITY", "T_IMPLEM", "SL_COMMENT", "ML_COMMENT", "ANNOTATION", "WHITESPACE", "LINEBREAKS", "'system'", "';'", "'root'", "'datatype'", "'primitive'", "'instance'", "':'", "'implementation'", "'{'", "'}'", "'composite'", "'bind'", "'to'", "'::'", "'('", "'id'", "'='", "')'", "'delegate'", "':='", "','", "'['", "'->'", "']'", "'type'", "'compositetype'", "'operation'", "'functional'", "'service'", "'control'", "'port'", "'..'", "'FractalComponent'", "'<'", "'controllerDesc'", "'contentDesc'", "'>'", "'OSGiComponent'", "'typegroup'", "'types'", "'instancegroup'", "'instances'", "'attribute'", "'default'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ANNOTATION=13;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T_OPTIONAL=8;
    public static final int LINEBREAKS=15;
    public static final int EOF=-1;
    public static final int T_PORT_KIND=7;
    public static final int T__55=55;
    public static final int ML_COMMENT=12;
    public static final int MULTIPLICITY=9;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int STRING_LITERAL=6;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T_IMPLEM=10;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T_INSTANCE_STATE=5;
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
    public static final int SL_COMMENT=11;

    // delegates
    // delegators


        public ArtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ArtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[87+1];
             
             
        }
        

    public String[] getTokenNames() { return ArtParser.tokenNames; }
    public String getGrammarFileName() { return "/opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g"; }


    	private art.resource.art.IArtTokenResolverFactory tokenResolverFactory = new art.resource.art.mopp.ArtTokenResolverFactory();
    	@SuppressWarnings("unused")
    	
    	private int lastPosition;
    	private art.resource.art.mopp.ArtTokenResolveResult tokenResolveResult = new art.resource.art.mopp.ArtTokenResolveResult();
    	private boolean rememberExpectedElements = false;
    	private java.lang.Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	private java.util.List<art.resource.art.mopp.ArtExpectedTerminal> expectedElements = new java.util.ArrayList<art.resource.art.mopp.ArtExpectedTerminal>();
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	//helper lists to allow a lexer to pass errors to its parser
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private java.util.Collection<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>> postParseCommands;
    	private boolean terminateParsing;
    	private int tokenIndexOfLastCompleteElement;
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new art.resource.art.IArtCommand<art.resource.art.IArtTextResource>() {
    			public boolean execute(art.resource.art.IArtTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.addProblem(new art.resource.art.IArtProblem() {
    					public art.resource.art.ArtEProblemType getType() {
    						return art.resource.art.ArtEProblemType.ERROR;
    					}
    					public java.lang.String getMessage() {
    						return errorMessage;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(art.resource.art.mopp.ArtExpectedTerminal expectedElement) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		setPosition(expectedElement, input.index());
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, art.resource.art.mopp.ArtDummyEObject dummy) {
    		java.lang.Object value = element.eGet(structuralFeature);
    		java.lang.Object mapKey = dummy.getValueByName("key");
    		java.lang.Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = art.resource.art.util.ArtMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	private boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
    		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof art.resource.art.mopp.ArtDummyEObject);
    			art.resource.art.mopp.ArtDummyEObject dummy = (art.resource.art.mopp.ArtDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new art.resource.art.IArtCommand<art.resource.art.IArtTextResource>() {
    			public boolean execute(art.resource.art.IArtTextResource resource) {
    				art.resource.art.IArtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
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
    		postParseCommands.add(new art.resource.art.IArtCommand<art.resource.art.IArtTextResource>() {
    			public boolean execute(art.resource.art.IArtTextResource resource) {
    				art.resource.art.IArtLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
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
    	
    	public art.resource.art.IArtTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
    		try {
    			if (encoding == null) {
    				return new ArtParser(new org.antlr.runtime.CommonTokenStream(new ArtLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new ArtParser(new org.antlr.runtime.CommonTokenStream(new ArtLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			art.resource.art.mopp.ArtPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	// This default constructor is only used to call createInstance() on it
    	public ArtParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((ArtLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((ArtLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
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
    		throw new art.resource.art.mopp.ArtUnexpectedContentTypeException(typeObject);
    	}
    	
    	private art.resource.art.mopp.ArtTokenResolveResult getFreshTokenResolveResult() {
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
    	
    	public art.resource.art.mopp.ArtMetaInformation getMetaInformation() {
    		return new art.resource.art.mopp.ArtMetaInformation();
    	}
    	
    	public java.lang.Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected art.resource.art.mopp.ArtReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (art.resource.art.mopp.ArtReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected java.lang.Object getTypeObject() {
    		java.lang.Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(art.resource.art.IArtOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	// Implementation that calls {@link #doParse()}  and handles the thrown
    	// RecognitionExceptions.
    	public art.resource.art.IArtParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>>();
    		art.resource.art.mopp.ArtParseResult parseResult = new art.resource.art.mopp.ArtParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				//? can be caused if a null is set on EMF models where not allowed;
    				//? this will just happen if other errors occurred before
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
    	
    	public java.util.List<art.resource.art.mopp.ArtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, art.resource.art.IArtTextResource dummyResource) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
    		art.resource.art.IArtParseResult result = parse();
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (art.resource.art.IArtCommand<art.resource.art.IArtTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<art.resource.art.mopp.ArtExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<art.resource.art.mopp.ArtExpectedTerminal>();
    		java.util.List<art.resource.art.mopp.ArtExpectedTerminal> newFollowSet = new java.util.ArrayList<art.resource.art.mopp.ArtExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			art.resource.art.mopp.ArtExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 231;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected terminals
    				// can be set
    				for (art.resource.art.mopp.ArtExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are kept
    				for (art.resource.art.mopp.ArtExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<art.resource.art.IArtExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (art.resource.art.IArtExpectedElement newFollower : newFollowers) {
    							art.resource.art.mopp.ArtExpectedTerminal newFollowTerminal = new art.resource.art.mopp.ArtExpectedTerminal(newFollower, followSetID);
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
    		// after the last token in the stream we must set the position for the elements that were
    		// added during the last iteration of the loop
    		for (art.resource.art.mopp.ArtExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(art.resource.art.mopp.ArtExpectedTerminal expectedElement, int tokenIndex) {
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
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final art.resource.art.mopp.ArtContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new art.resource.art.IArtCommand<art.resource.art.IArtTextResource>() {
    			public boolean execute(art.resource.art.IArtTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	// Translates errors thrown by the parser into human readable messages.
    	public void reportError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = e.getMessage();
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = art.resource.art.util.ArtStringUtil.formatTokenName(tokenName);
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
    			message = "mismatched tree node: "+"xxx" +"; expecting " + tokenName;
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
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText+"}?";
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
    	
    	// Translates errors thrown by the lexer into human readable messages.
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
    	
    	protected void completedElement(Object element) {
    		if (element instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private final static art.resource.art.IArtExpectedElement TERMINAL_0 = new art.resource.art.mopp.ArtExpectedCsString("system");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_1 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.ArtPackage.eINSTANCE.getSystem().getEStructuralFeature(art.ArtPackage.SYSTEM__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_2 = new art.resource.art.mopp.ArtExpectedCsString(";");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_3 = new art.resource.art.mopp.ArtExpectedCsString("root");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_4 = new art.resource.art.mopp.ArtExpectedCsString("composite");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_5 = new art.resource.art.mopp.ArtExpectedCsString("functional");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_6 = new art.resource.art.mopp.ArtExpectedCsString("control");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_7 = new art.resource.art.mopp.ArtExpectedCsString("type");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_8 = new art.resource.art.mopp.ArtExpectedCsString("compositetype");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_9 = new art.resource.art.mopp.ArtExpectedCsString("datatype");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_10 = new art.resource.art.mopp.ArtExpectedCsString("typegroup");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_11 = new art.resource.art.mopp.ArtExpectedCsString("instancegroup");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_12 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.ArtPackage.eINSTANCE.getDataType().getEStructuralFeature(art.ArtPackage.DATA_TYPE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_13 = new art.resource.art.mopp.ArtExpectedCsString(";");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_14 = new art.resource.art.mopp.ArtExpectedCsString("primitive");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_15 = new art.resource.art.mopp.ArtExpectedCsString("instance");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_16 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_17 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_18 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_19 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), "T_INSTANCE_STATE");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_20 = new art.resource.art.mopp.ArtExpectedCsString("implementation");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_21 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_22 = new art.resource.art.mopp.ArtExpectedCsString("FractalComponent");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_23 = new art.resource.art.mopp.ArtExpectedCsString("OSGiComponent");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_24 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_25 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_26 = new art.resource.art.mopp.ArtExpectedCsString("bind");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_27 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_28 = new art.resource.art.mopp.ArtExpectedCsString("delegate");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_29 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_30 = new art.resource.art.mopp.ArtExpectedCsString("instance");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_31 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_32 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_33 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_34 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), "T_INSTANCE_STATE");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_35 = new art.resource.art.mopp.ArtExpectedCsString("implementation");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_36 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_37 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_38 = new art.resource.art.mopp.ArtExpectedCsString("to");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_39 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_40 = new art.resource.art.mopp.ArtExpectedCsString("::");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_41 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_42 = new art.resource.art.mopp.ArtExpectedCsString("(");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_43 = new art.resource.art.mopp.ArtExpectedCsString("id");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_44 = new art.resource.art.mopp.ArtExpectedCsString("=");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_45 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__ID), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_46 = new art.resource.art.mopp.ArtExpectedCsString(")");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_47 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_48 = new art.resource.art.mopp.ArtExpectedCsString("to");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_49 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_50 = new art.resource.art.mopp.ArtExpectedCsString("::");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_51 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_52 = new art.resource.art.mopp.ArtExpectedCsString("(");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_53 = new art.resource.art.mopp.ArtExpectedCsString("id");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_54 = new art.resource.art.mopp.ArtExpectedCsString("=");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_55 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__ID), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_56 = new art.resource.art.mopp.ArtExpectedCsString(")");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_57 = new art.resource.art.mopp.ArtExpectedCsString(":=");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_58 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_59 = new art.resource.art.mopp.ArtExpectedCsString(":=");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_60 = new art.resource.art.mopp.ArtExpectedCsString("[");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_61 = new art.resource.art.mopp.ArtExpectedCsString("[");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_62 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_63 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_64 = new art.resource.art.mopp.ArtExpectedCsString("->");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_65 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_66 = new art.resource.art.mopp.ArtExpectedCsString("]");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_67 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__KEY), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_68 = new art.resource.art.mopp.ArtExpectedCsString("->");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_69 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__VALUE), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_70 = new art.resource.art.mopp.ArtExpectedCsString("]");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_71 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPrimitiveType().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_72 = new art.resource.art.mopp.ArtExpectedCsString("implementation");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_73 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_74 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.implem.ImplemPackage.eINSTANCE.getOSGiType().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), "T_IMPLEM");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_75 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__ROLE), "T_PORT_KIND");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_76 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__ROLE), "T_PORT_KIND");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_77 = new art.resource.art.mopp.ArtExpectedCsString("attribute");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_78 = new art.resource.art.mopp.ArtExpectedCsString("attribute");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_79 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_80 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getCompositeType().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_81 = new art.resource.art.mopp.ArtExpectedCsString("implementation");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_82 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_83 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_84 = new art.resource.art.mopp.ArtExpectedCsString("operation");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_85 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getOperation().getEStructuralFeature(art.type.TypePackage.OPERATION__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_86 = new art.resource.art.mopp.ArtExpectedCsString("(");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_87 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_88 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_89 = new art.resource.art.mopp.ArtExpectedCsString(")");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_90 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_91 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_92 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_93 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_94 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_95 = new art.resource.art.mopp.ArtExpectedCsString("service");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_96 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getFunctionalService().getEStructuralFeature(art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_97 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_98 = new art.resource.art.mopp.ArtExpectedCsString("service");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_99 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getControlService().getEStructuralFeature(art.type.TypePackage.CONTROL_SERVICE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_100 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_101 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__IS_OPTIONAL), "T_OPTIONAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_102 = new art.resource.art.mopp.ArtExpectedCsString("port");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_103 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_104 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_105 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_106 = new art.resource.art.mopp.ArtExpectedCsString("[");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_107 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__LOWER), "MULTIPLICITY");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_108 = new art.resource.art.mopp.ArtExpectedCsString("..");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_109 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(art.type.TypePackage.PORT__UPPER), "MULTIPLICITY");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_110 = new art.resource.art.mopp.ArtExpectedCsString("]");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_111 = new art.resource.art.mopp.ArtExpectedCsString("<");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_112 = new art.resource.art.mopp.ArtExpectedCsString("controllerDesc");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_113 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_114 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_115 = new art.resource.art.mopp.ArtExpectedCsString("contentDesc");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_116 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_117 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_118 = new art.resource.art.mopp.ArtExpectedCsString(">");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_119 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_120 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.implem.ImplemPackage.eINSTANCE.getOSGiComponent().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_121 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getTypeGroup().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_122 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_123 = new art.resource.art.mopp.ArtExpectedCsString("types");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_124 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_125 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_126 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getTypeGroup().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_127 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_128 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getTypeGroup().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_129 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getInstanceGroup().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_130 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_131 = new art.resource.art.mopp.ArtExpectedCsString("instances");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_132 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_133 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_134 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getInstanceGroup().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_135 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_136 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.group.GroupPackage.eINSTANCE.getInstanceGroup().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_137 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_138 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_139 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_140 = new art.resource.art.mopp.ArtExpectedCsString("default");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_141 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_142 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(art.type.TypePackage.DICTIONARY__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_143 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_144 = new art.resource.art.mopp.ArtExpectedCsString("[");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_145 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_146 = new art.resource.art.mopp.ArtExpectedCsString("->");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_147 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_148 = new art.resource.art.mopp.ArtExpectedCsString("]");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_149 = new art.resource.art.mopp.ArtExpectedCsString("default");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_150 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_151 = new art.resource.art.mopp.ArtExpectedCsString("[");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_152 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_153 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_154 = new art.resource.art.mopp.ArtExpectedCsString("->");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_155 = new art.resource.art.mopp.ArtExpectedCsString("]");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_156 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), "STRING_LITERAL");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_157 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPortId().getEStructuralFeature(art.type.TypePackage.PORT_ID__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_158 = new art.resource.art.mopp.ArtExpectedCsString(",");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_159 = new art.resource.art.mopp.ArtExpectedCsString("}");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_160 = new art.resource.art.mopp.ArtExpectedCsString("port");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_161 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__NAME), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_162 = new art.resource.art.mopp.ArtExpectedCsString(":");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_163 = new art.resource.art.mopp.ArtExpectedStructuralFeature(art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), "TEXT");
    	private final static art.resource.art.IArtExpectedElement TERMINAL_164 = new art.resource.art.mopp.ArtExpectedCsString("{");
    	
    	public static void wire0() {
    		TERMINAL_0.addFollower(TERMINAL_1);
    		TERMINAL_1.addFollower(TERMINAL_2);
    		TERMINAL_2.addFollower(TERMINAL_3);
    		TERMINAL_3.addFollower(TERMINAL_4);
    		TERMINAL_9.addFollower(TERMINAL_12);
    		TERMINAL_12.addFollower(TERMINAL_13);
    		TERMINAL_13.addFollower(TERMINAL_5);
    		TERMINAL_13.addFollower(TERMINAL_6);
    		TERMINAL_13.addFollower(TERMINAL_7);
    		TERMINAL_13.addFollower(TERMINAL_8);
    		TERMINAL_13.addFollower(TERMINAL_9);
    		TERMINAL_13.addFollower(TERMINAL_10);
    		TERMINAL_13.addFollower(TERMINAL_11);
    		TERMINAL_14.addFollower(TERMINAL_15);
    		TERMINAL_15.addFollower(TERMINAL_16);
    		TERMINAL_16.addFollower(TERMINAL_17);
    		TERMINAL_17.addFollower(TERMINAL_18);
    		TERMINAL_18.addFollower(TERMINAL_19);
    		TERMINAL_19.addFollower(TERMINAL_20);
    		TERMINAL_19.addFollower(TERMINAL_21);
    		TERMINAL_20.addFollower(TERMINAL_22);
    		TERMINAL_20.addFollower(TERMINAL_23);
    		TERMINAL_21.addFollower(TERMINAL_24);
    		TERMINAL_21.addFollower(TERMINAL_25);
    		TERMINAL_21.addFollower(TERMINAL_26);
    		TERMINAL_21.addFollower(TERMINAL_27);
    		TERMINAL_27.addFollower(TERMINAL_24);
    		TERMINAL_27.addFollower(TERMINAL_25);
    		TERMINAL_27.addFollower(TERMINAL_26);
    		TERMINAL_27.addFollower(TERMINAL_14);
    		TERMINAL_27.addFollower(TERMINAL_4);
    		TERMINAL_27.addFollower(TERMINAL_28);
    		TERMINAL_27.addFollower(TERMINAL_29);
    		TERMINAL_4.addFollower(TERMINAL_30);
    		TERMINAL_30.addFollower(TERMINAL_31);
    		TERMINAL_31.addFollower(TERMINAL_32);
    		TERMINAL_32.addFollower(TERMINAL_33);
    		TERMINAL_33.addFollower(TERMINAL_34);
    		TERMINAL_34.addFollower(TERMINAL_35);
    		TERMINAL_34.addFollower(TERMINAL_36);
    		TERMINAL_35.addFollower(TERMINAL_22);
    		TERMINAL_35.addFollower(TERMINAL_23);
    		TERMINAL_36.addFollower(TERMINAL_24);
    		TERMINAL_36.addFollower(TERMINAL_25);
    		TERMINAL_36.addFollower(TERMINAL_26);
    		TERMINAL_36.addFollower(TERMINAL_14);
    		TERMINAL_36.addFollower(TERMINAL_4);
    		TERMINAL_36.addFollower(TERMINAL_28);
    		TERMINAL_36.addFollower(TERMINAL_29);
    		TERMINAL_29.addFollower(TERMINAL_5);
    		TERMINAL_29.addFollower(TERMINAL_6);
    		TERMINAL_29.addFollower(TERMINAL_7);
    		TERMINAL_29.addFollower(TERMINAL_8);
    		TERMINAL_29.addFollower(TERMINAL_9);
    		TERMINAL_29.addFollower(TERMINAL_10);
    		TERMINAL_29.addFollower(TERMINAL_11);
    		TERMINAL_29.addFollower(TERMINAL_24);
    		TERMINAL_29.addFollower(TERMINAL_25);
    		TERMINAL_29.addFollower(TERMINAL_26);
    		TERMINAL_29.addFollower(TERMINAL_14);
    		TERMINAL_29.addFollower(TERMINAL_4);
    		TERMINAL_29.addFollower(TERMINAL_28);
    		TERMINAL_29.addFollower(TERMINAL_29);
    		TERMINAL_26.addFollower(TERMINAL_37);
    		TERMINAL_37.addFollower(TERMINAL_38);
    		TERMINAL_38.addFollower(TERMINAL_39);
    		TERMINAL_39.addFollower(TERMINAL_40);
    		TERMINAL_40.addFollower(TERMINAL_41);
    		TERMINAL_41.addFollower(TERMINAL_42);
    		TERMINAL_41.addFollower(TERMINAL_24);
    		TERMINAL_41.addFollower(TERMINAL_25);
    		TERMINAL_41.addFollower(TERMINAL_26);
    		TERMINAL_41.addFollower(TERMINAL_27);
    		TERMINAL_41.addFollower(TERMINAL_14);
    		TERMINAL_41.addFollower(TERMINAL_4);
    		TERMINAL_41.addFollower(TERMINAL_28);
    		TERMINAL_41.addFollower(TERMINAL_29);
    		TERMINAL_42.addFollower(TERMINAL_43);
    		TERMINAL_43.addFollower(TERMINAL_44);
    		TERMINAL_44.addFollower(TERMINAL_45);
    		TERMINAL_45.addFollower(TERMINAL_46);
    		TERMINAL_46.addFollower(TERMINAL_24);
    		TERMINAL_46.addFollower(TERMINAL_25);
    		TERMINAL_46.addFollower(TERMINAL_26);
    		TERMINAL_46.addFollower(TERMINAL_27);
    		TERMINAL_46.addFollower(TERMINAL_14);
    		TERMINAL_46.addFollower(TERMINAL_4);
    		TERMINAL_46.addFollower(TERMINAL_28);
    		TERMINAL_46.addFollower(TERMINAL_29);
    		TERMINAL_28.addFollower(TERMINAL_47);
    		TERMINAL_47.addFollower(TERMINAL_48);
    		TERMINAL_48.addFollower(TERMINAL_49);
    		TERMINAL_49.addFollower(TERMINAL_50);
    		TERMINAL_50.addFollower(TERMINAL_51);
    		TERMINAL_51.addFollower(TERMINAL_52);
    		TERMINAL_51.addFollower(TERMINAL_24);
    		TERMINAL_51.addFollower(TERMINAL_25);
    		TERMINAL_51.addFollower(TERMINAL_26);
    		TERMINAL_51.addFollower(TERMINAL_14);
    		TERMINAL_51.addFollower(TERMINAL_4);
    		TERMINAL_51.addFollower(TERMINAL_28);
    		TERMINAL_51.addFollower(TERMINAL_29);
    		TERMINAL_52.addFollower(TERMINAL_53);
    		TERMINAL_53.addFollower(TERMINAL_54);
    		TERMINAL_54.addFollower(TERMINAL_55);
    		TERMINAL_55.addFollower(TERMINAL_56);
    		TERMINAL_56.addFollower(TERMINAL_24);
    		TERMINAL_56.addFollower(TERMINAL_25);
    		TERMINAL_56.addFollower(TERMINAL_26);
    		TERMINAL_56.addFollower(TERMINAL_14);
    		TERMINAL_56.addFollower(TERMINAL_4);
    		TERMINAL_56.addFollower(TERMINAL_28);
    		TERMINAL_56.addFollower(TERMINAL_29);
    		TERMINAL_24.addFollower(TERMINAL_57);
    		TERMINAL_57.addFollower(TERMINAL_58);
    		TERMINAL_58.addFollower(TERMINAL_24);
    		TERMINAL_58.addFollower(TERMINAL_25);
    		TERMINAL_58.addFollower(TERMINAL_26);
    		TERMINAL_58.addFollower(TERMINAL_27);
    		TERMINAL_58.addFollower(TERMINAL_14);
    		TERMINAL_58.addFollower(TERMINAL_4);
    		TERMINAL_58.addFollower(TERMINAL_28);
    		TERMINAL_58.addFollower(TERMINAL_29);
    		TERMINAL_25.addFollower(TERMINAL_59);
    		TERMINAL_59.addFollower(TERMINAL_60);
    		TERMINAL_59.addFollower(TERMINAL_61);
    		TERMINAL_59.addFollower(TERMINAL_24);
    		TERMINAL_59.addFollower(TERMINAL_25);
    		TERMINAL_59.addFollower(TERMINAL_26);
    		TERMINAL_59.addFollower(TERMINAL_27);
    		TERMINAL_59.addFollower(TERMINAL_14);
    		TERMINAL_59.addFollower(TERMINAL_4);
    		TERMINAL_59.addFollower(TERMINAL_28);
    		TERMINAL_59.addFollower(TERMINAL_29);
    		TERMINAL_62.addFollower(TERMINAL_60);
    		TERMINAL_62.addFollower(TERMINAL_61);
    		TERMINAL_60.addFollower(TERMINAL_63);
    		TERMINAL_63.addFollower(TERMINAL_64);
    		TERMINAL_64.addFollower(TERMINAL_65);
    		TERMINAL_65.addFollower(TERMINAL_66);
    		TERMINAL_66.addFollower(TERMINAL_62);
    		TERMINAL_66.addFollower(TERMINAL_24);
    		TERMINAL_66.addFollower(TERMINAL_25);
    		TERMINAL_66.addFollower(TERMINAL_26);
    		TERMINAL_66.addFollower(TERMINAL_27);
    		TERMINAL_66.addFollower(TERMINAL_14);
    		TERMINAL_66.addFollower(TERMINAL_4);
    		TERMINAL_66.addFollower(TERMINAL_28);
    		TERMINAL_66.addFollower(TERMINAL_29);
    		TERMINAL_61.addFollower(TERMINAL_67);
    		TERMINAL_67.addFollower(TERMINAL_68);
    		TERMINAL_68.addFollower(TERMINAL_69);
    		TERMINAL_69.addFollower(TERMINAL_70);
    		TERMINAL_70.addFollower(TERMINAL_62);
    		TERMINAL_70.addFollower(TERMINAL_24);
    		TERMINAL_70.addFollower(TERMINAL_25);
    		TERMINAL_70.addFollower(TERMINAL_26);
    		TERMINAL_70.addFollower(TERMINAL_27);
    		TERMINAL_70.addFollower(TERMINAL_14);
    		TERMINAL_70.addFollower(TERMINAL_4);
    		TERMINAL_70.addFollower(TERMINAL_28);
    		TERMINAL_70.addFollower(TERMINAL_29);
    		TERMINAL_7.addFollower(TERMINAL_71);
    		TERMINAL_71.addFollower(TERMINAL_72);
    		TERMINAL_71.addFollower(TERMINAL_73);
    		TERMINAL_72.addFollower(TERMINAL_74);
    		TERMINAL_73.addFollower(TERMINAL_75);
    		TERMINAL_73.addFollower(TERMINAL_76);
    		TERMINAL_73.addFollower(TERMINAL_77);
    		TERMINAL_73.addFollower(TERMINAL_78);
    		TERMINAL_73.addFollower(TERMINAL_79);
    		TERMINAL_79.addFollower(TERMINAL_5);
    		TERMINAL_79.addFollower(TERMINAL_6);
    		TERMINAL_79.addFollower(TERMINAL_7);
    		TERMINAL_79.addFollower(TERMINAL_8);
    		TERMINAL_79.addFollower(TERMINAL_9);
    		TERMINAL_79.addFollower(TERMINAL_10);
    		TERMINAL_79.addFollower(TERMINAL_11);
    		TERMINAL_8.addFollower(TERMINAL_80);
    		TERMINAL_80.addFollower(TERMINAL_81);
    		TERMINAL_80.addFollower(TERMINAL_82);
    		TERMINAL_81.addFollower(TERMINAL_74);
    		TERMINAL_82.addFollower(TERMINAL_75);
    		TERMINAL_82.addFollower(TERMINAL_76);
    		TERMINAL_82.addFollower(TERMINAL_77);
    		TERMINAL_82.addFollower(TERMINAL_78);
    		TERMINAL_82.addFollower(TERMINAL_83);
    		TERMINAL_83.addFollower(TERMINAL_5);
    		TERMINAL_83.addFollower(TERMINAL_6);
    		TERMINAL_83.addFollower(TERMINAL_7);
    		TERMINAL_83.addFollower(TERMINAL_8);
    		TERMINAL_83.addFollower(TERMINAL_9);
    		TERMINAL_83.addFollower(TERMINAL_10);
    		TERMINAL_83.addFollower(TERMINAL_11);
    		TERMINAL_84.addFollower(TERMINAL_85);
    		TERMINAL_85.addFollower(TERMINAL_86);
    		TERMINAL_86.addFollower(TERMINAL_87);
    		TERMINAL_86.addFollower(TERMINAL_88);
    		TERMINAL_86.addFollower(TERMINAL_89);
    		TERMINAL_88.addFollower(TERMINAL_87);
    		TERMINAL_89.addFollower(TERMINAL_90);
    		TERMINAL_89.addFollower(TERMINAL_91);
    		TERMINAL_89.addFollower(TERMINAL_84);
    		TERMINAL_89.addFollower(TERMINAL_92);
    		TERMINAL_89.addFollower(TERMINAL_93);
    		TERMINAL_90.addFollower(TERMINAL_87);
    		TERMINAL_91.addFollower(TERMINAL_87);
    		TERMINAL_87.addFollower(TERMINAL_94);
    		TERMINAL_94.addFollower(TERMINAL_88);
    		TERMINAL_94.addFollower(TERMINAL_89);
    		TERMINAL_5.addFollower(TERMINAL_95);
    		TERMINAL_95.addFollower(TERMINAL_96);
    		TERMINAL_96.addFollower(TERMINAL_97);
    		TERMINAL_97.addFollower(TERMINAL_84);
    		TERMINAL_97.addFollower(TERMINAL_92);
    		TERMINAL_92.addFollower(TERMINAL_5);
    		TERMINAL_92.addFollower(TERMINAL_6);
    		TERMINAL_92.addFollower(TERMINAL_7);
    		TERMINAL_92.addFollower(TERMINAL_8);
    		TERMINAL_92.addFollower(TERMINAL_9);
    		TERMINAL_92.addFollower(TERMINAL_10);
    		TERMINAL_92.addFollower(TERMINAL_11);
    		TERMINAL_6.addFollower(TERMINAL_98);
    		TERMINAL_98.addFollower(TERMINAL_99);
    		TERMINAL_99.addFollower(TERMINAL_100);
    		TERMINAL_100.addFollower(TERMINAL_84);
    		TERMINAL_100.addFollower(TERMINAL_93);
    		TERMINAL_93.addFollower(TERMINAL_5);
    		TERMINAL_93.addFollower(TERMINAL_6);
    		TERMINAL_93.addFollower(TERMINAL_7);
    		TERMINAL_93.addFollower(TERMINAL_8);
    		TERMINAL_93.addFollower(TERMINAL_9);
    		TERMINAL_93.addFollower(TERMINAL_10);
    		TERMINAL_93.addFollower(TERMINAL_11);
    		TERMINAL_75.addFollower(TERMINAL_101);
    		TERMINAL_75.addFollower(TERMINAL_102);
    		TERMINAL_101.addFollower(TERMINAL_102);
    		TERMINAL_102.addFollower(TERMINAL_103);
    		TERMINAL_103.addFollower(TERMINAL_104);
    		TERMINAL_104.addFollower(TERMINAL_105);
    		TERMINAL_105.addFollower(TERMINAL_106);
    		TERMINAL_106.addFollower(TERMINAL_107);
    		TERMINAL_107.addFollower(TERMINAL_108);
    	}
    	public static void wire1() {
    		TERMINAL_108.addFollower(TERMINAL_109);
    		TERMINAL_109.addFollower(TERMINAL_110);
    		TERMINAL_110.addFollower(TERMINAL_75);
    		TERMINAL_110.addFollower(TERMINAL_76);
    		TERMINAL_110.addFollower(TERMINAL_77);
    		TERMINAL_110.addFollower(TERMINAL_78);
    		TERMINAL_110.addFollower(TERMINAL_79);
    		TERMINAL_110.addFollower(TERMINAL_83);
    		TERMINAL_22.addFollower(TERMINAL_111);
    		TERMINAL_111.addFollower(TERMINAL_112);
    		TERMINAL_112.addFollower(TERMINAL_113);
    		TERMINAL_113.addFollower(TERMINAL_114);
    		TERMINAL_114.addFollower(TERMINAL_115);
    		TERMINAL_115.addFollower(TERMINAL_116);
    		TERMINAL_116.addFollower(TERMINAL_117);
    		TERMINAL_117.addFollower(TERMINAL_118);
    		TERMINAL_118.addFollower(TERMINAL_21);
    		TERMINAL_118.addFollower(TERMINAL_36);
    		TERMINAL_23.addFollower(TERMINAL_119);
    		TERMINAL_119.addFollower(TERMINAL_120);
    		TERMINAL_120.addFollower(TERMINAL_21);
    		TERMINAL_120.addFollower(TERMINAL_36);
    		TERMINAL_10.addFollower(TERMINAL_121);
    		TERMINAL_121.addFollower(TERMINAL_122);
    		TERMINAL_122.addFollower(TERMINAL_123);
    		TERMINAL_122.addFollower(TERMINAL_10);
    		TERMINAL_122.addFollower(TERMINAL_124);
    		TERMINAL_123.addFollower(TERMINAL_125);
    		TERMINAL_125.addFollower(TERMINAL_126);
    		TERMINAL_126.addFollower(TERMINAL_127);
    		TERMINAL_126.addFollower(TERMINAL_10);
    		TERMINAL_126.addFollower(TERMINAL_124);
    		TERMINAL_127.addFollower(TERMINAL_128);
    		TERMINAL_128.addFollower(TERMINAL_127);
    		TERMINAL_128.addFollower(TERMINAL_10);
    		TERMINAL_128.addFollower(TERMINAL_124);
    		TERMINAL_124.addFollower(TERMINAL_5);
    		TERMINAL_124.addFollower(TERMINAL_6);
    		TERMINAL_124.addFollower(TERMINAL_7);
    		TERMINAL_124.addFollower(TERMINAL_8);
    		TERMINAL_124.addFollower(TERMINAL_9);
    		TERMINAL_124.addFollower(TERMINAL_10);
    		TERMINAL_124.addFollower(TERMINAL_11);
    		TERMINAL_124.addFollower(TERMINAL_124);
    		TERMINAL_11.addFollower(TERMINAL_129);
    		TERMINAL_129.addFollower(TERMINAL_130);
    		TERMINAL_130.addFollower(TERMINAL_131);
    		TERMINAL_130.addFollower(TERMINAL_11);
    		TERMINAL_130.addFollower(TERMINAL_132);
    		TERMINAL_131.addFollower(TERMINAL_133);
    		TERMINAL_133.addFollower(TERMINAL_134);
    		TERMINAL_134.addFollower(TERMINAL_135);
    		TERMINAL_134.addFollower(TERMINAL_11);
    		TERMINAL_134.addFollower(TERMINAL_132);
    		TERMINAL_135.addFollower(TERMINAL_136);
    		TERMINAL_136.addFollower(TERMINAL_135);
    		TERMINAL_136.addFollower(TERMINAL_11);
    		TERMINAL_136.addFollower(TERMINAL_132);
    		TERMINAL_132.addFollower(TERMINAL_5);
    		TERMINAL_132.addFollower(TERMINAL_6);
    		TERMINAL_132.addFollower(TERMINAL_7);
    		TERMINAL_132.addFollower(TERMINAL_8);
    		TERMINAL_132.addFollower(TERMINAL_9);
    		TERMINAL_132.addFollower(TERMINAL_10);
    		TERMINAL_132.addFollower(TERMINAL_11);
    		TERMINAL_132.addFollower(TERMINAL_132);
    		TERMINAL_74.addFollower(TERMINAL_73);
    		TERMINAL_74.addFollower(TERMINAL_82);
    		TERMINAL_77.addFollower(TERMINAL_137);
    		TERMINAL_137.addFollower(TERMINAL_138);
    		TERMINAL_138.addFollower(TERMINAL_139);
    		TERMINAL_139.addFollower(TERMINAL_140);
    		TERMINAL_139.addFollower(TERMINAL_75);
    		TERMINAL_139.addFollower(TERMINAL_76);
    		TERMINAL_139.addFollower(TERMINAL_77);
    		TERMINAL_139.addFollower(TERMINAL_78);
    		TERMINAL_139.addFollower(TERMINAL_79);
    		TERMINAL_139.addFollower(TERMINAL_83);
    		TERMINAL_140.addFollower(TERMINAL_141);
    		TERMINAL_141.addFollower(TERMINAL_75);
    		TERMINAL_141.addFollower(TERMINAL_76);
    		TERMINAL_141.addFollower(TERMINAL_77);
    		TERMINAL_141.addFollower(TERMINAL_78);
    		TERMINAL_141.addFollower(TERMINAL_79);
    		TERMINAL_141.addFollower(TERMINAL_83);
    		TERMINAL_78.addFollower(TERMINAL_142);
    		TERMINAL_142.addFollower(TERMINAL_143);
    		TERMINAL_143.addFollower(TERMINAL_144);
    		TERMINAL_144.addFollower(TERMINAL_145);
    		TERMINAL_145.addFollower(TERMINAL_146);
    		TERMINAL_146.addFollower(TERMINAL_147);
    		TERMINAL_147.addFollower(TERMINAL_148);
    		TERMINAL_148.addFollower(TERMINAL_149);
    		TERMINAL_148.addFollower(TERMINAL_75);
    		TERMINAL_148.addFollower(TERMINAL_76);
    		TERMINAL_148.addFollower(TERMINAL_77);
    		TERMINAL_148.addFollower(TERMINAL_78);
    		TERMINAL_148.addFollower(TERMINAL_79);
    		TERMINAL_148.addFollower(TERMINAL_83);
    		TERMINAL_149.addFollower(TERMINAL_150);
    		TERMINAL_150.addFollower(TERMINAL_151);
    		TERMINAL_150.addFollower(TERMINAL_152);
    		TERMINAL_152.addFollower(TERMINAL_75);
    		TERMINAL_152.addFollower(TERMINAL_76);
    		TERMINAL_152.addFollower(TERMINAL_77);
    		TERMINAL_152.addFollower(TERMINAL_78);
    		TERMINAL_152.addFollower(TERMINAL_79);
    		TERMINAL_152.addFollower(TERMINAL_83);
    		TERMINAL_151.addFollower(TERMINAL_153);
    		TERMINAL_153.addFollower(TERMINAL_154);
    		TERMINAL_153.addFollower(TERMINAL_155);
    		TERMINAL_154.addFollower(TERMINAL_156);
    		TERMINAL_156.addFollower(TERMINAL_155);
    		TERMINAL_155.addFollower(TERMINAL_151);
    		TERMINAL_155.addFollower(TERMINAL_152);
    		TERMINAL_157.addFollower(TERMINAL_158);
    		TERMINAL_157.addFollower(TERMINAL_159);
    		TERMINAL_76.addFollower(TERMINAL_160);
    		TERMINAL_160.addFollower(TERMINAL_161);
    		TERMINAL_161.addFollower(TERMINAL_162);
    		TERMINAL_162.addFollower(TERMINAL_163);
    		TERMINAL_163.addFollower(TERMINAL_164);
    		TERMINAL_164.addFollower(TERMINAL_157);
    		TERMINAL_158.addFollower(TERMINAL_157);
    		TERMINAL_159.addFollower(TERMINAL_75);
    		TERMINAL_159.addFollower(TERMINAL_76);
    		TERMINAL_159.addFollower(TERMINAL_77);
    		TERMINAL_159.addFollower(TERMINAL_78);
    		TERMINAL_159.addFollower(TERMINAL_79);
    		TERMINAL_159.addFollower(TERMINAL_83);
    	}
    	// wire the terminals
    	static {
    		wire0();
    		wire1();
    	}



    // $ANTLR start "start"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1073:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_art_System ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        art.System c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1074:1: ( (c0= parse_art_System ) EOF )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1075:2: (c0= parse_art_System ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_0, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1080:2: (c0= parse_art_System )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1081:3: c0= parse_art_System
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1086:1: parse_art_System returns [art.System element = null] : a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )* ;
    public final art.System parse_art_System() throws RecognitionException {
        art.System element =  null;
        int parse_art_System_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        art.instance.CompositeInstance a4_0 = null;

        art.type.Service a5_0 = null;

        art.type.ComponentType a6_0 = null;

        art.DataType a7_0 = null;

        art.group.Group a8_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1089:1: (a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )* )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1090:2: a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )*
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_art_System112); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_1, 1));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1102:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1103:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_System130); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.ArtFactory.eINSTANCE.createSystem();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.ArtPackage.SYSTEM__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.ArtPackage.SYSTEM__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_2, 2));
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_System151); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_3, 3));
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_art_System165); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 4));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1159:2: (a4_0= parse_art_instance_CompositeInstance )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1160:3: a4_0= parse_art_instance_CompositeInstance
            {
            pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_System183);
            a4_0=parse_art_instance_CompositeInstance();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.ArtFactory.eINSTANCE.createSystem();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.ArtPackage.SYSTEM__ROOT), a4_0);
              					completedElement(a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 5));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 5));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1187:2: ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||(LA2_0>=40 && LA2_0<=41)||LA2_0==43||LA2_0==45||LA2_0==54||LA2_0==56) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1188:3: ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1188:3: ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1189:4: ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1189:4: ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	    case 45:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 40:
            	    case 41:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 54:
            	    case 56:
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1190:5: (a5_0= parse_art_type_Service )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1190:5: (a5_0= parse_art_type_Service )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1191:6: a5_0= parse_art_type_Service
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Service_in_parse_art_System223);
            	            a5_0=parse_art_type_Service();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a5_0 != null) {
            	              							if (a5_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__SERVICES, a5_0);
            	              								completedElement(a5_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a5_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 6));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 6));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1219:10: (a6_0= parse_art_type_ComponentType )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1219:10: (a6_0= parse_art_type_ComponentType )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1220:6: a6_0= parse_art_type_ComponentType
            	            {
            	            pushFollow(FOLLOW_parse_art_type_ComponentType_in_parse_art_System273);
            	            a6_0=parse_art_type_ComponentType();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a6_0 != null) {
            	              							if (a6_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__TYPES, a6_0);
            	              								completedElement(a6_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a6_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 7));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 7));
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1248:10: (a7_0= parse_art_DataType )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1248:10: (a7_0= parse_art_DataType )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1249:6: a7_0= parse_art_DataType
            	            {
            	            pushFollow(FOLLOW_parse_art_DataType_in_parse_art_System323);
            	            a7_0=parse_art_DataType();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a7_0 != null) {
            	              							if (a7_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__DATA_TYPES, a7_0);
            	              								completedElement(a7_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a7_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 8));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 8));
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1277:10: (a8_0= parse_art_group_Group )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1277:10: (a8_0= parse_art_group_Group )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1278:6: a8_0= parse_art_group_Group
            	            {
            	            pushFollow(FOLLOW_parse_art_group_Group_in_parse_art_System373);
            	            a8_0=parse_art_group_Group();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.ArtFactory.eINSTANCE.createSystem();
            	              						}
            	              						if (a8_0 != null) {
            	              							if (a8_0 != null) {
            	              								addObjectToList(element, art.ArtPackage.SYSTEM__GROUPS, a8_0);
            	              								completedElement(a8_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a8_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 9));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 9));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 10));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 10));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 11));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 11));
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1332:1: parse_art_DataType returns [art.DataType element = null] : a0= 'datatype' (a1= TEXT ) a2= ';' ;
    public final art.DataType parse_art_DataType() throws RecognitionException {
        art.DataType element =  null;
        int parse_art_DataType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1335:1: (a0= 'datatype' (a1= TEXT ) a2= ';' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1336:2: a0= 'datatype' (a1= TEXT ) a2= ';'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_art_DataType447); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_12, 12));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1348:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1349:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_DataType465); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.ArtFactory.eINSTANCE.createDataType();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.ArtPackage.DATA_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.ArtPackage.DATA_TYPE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_13, 13));
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_DataType486); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 14));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 14));
              	
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


    // $ANTLR start "parse_art_instance_PrimitiveInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1401:1: parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null] : a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1404:1: (a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1405:2: a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_art_instance_PrimitiveInstance515); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_15, 15));
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_PrimitiveInstance529); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_16, 16));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1429:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1430:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance547); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_17, 17));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_PrimitiveInstance568); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_18, 18));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1474:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1475:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance586); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.PrimitiveType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_19, 19));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1511:2: (a5= T_INSTANCE_STATE )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1512:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance611); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              			}
              			if (a5 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_20, 20));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 20));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1545:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1546:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1546:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1547:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    a6=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_PrimitiveInstance641); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_22, 21));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_23, 21));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1560:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1561:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance667);
                    a7_0=parse_art_implem_ComponentImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      					}
                      					if (a7_0 != null) {
                      						if (a7_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM), a7_0);
                      							completedElement(a7_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a7_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 22));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 23));
              	
            }
            a8=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_PrimitiveInstance708); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 24));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 24));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 24));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 24));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1604:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1605:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1605:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1606:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1606:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==TEXT) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==27) ) {
            	        alt4=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1607:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1607:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1608:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance744);
            	            a9_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE, a9_0);
            	              								completedElement(a9_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a9_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 25));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 25));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 25));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 25));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1633:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1633:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1634:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance794);
            	            a10_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a10_0 != null) {
            	              							if (a10_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING, a10_0);
            	              								completedElement(a10_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a10_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 26));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 26));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 26));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 26));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 27));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 27));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 27));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 27));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 28));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 28));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 28));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 28));
              	
            }
            a11=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_PrimitiveInstance853); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 29));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 29));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_art_instance_PrimitiveInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_PrimitiveInstance"


    // $ANTLR start "parse_art_instance_CompositeInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1697:1: parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null] : a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1700:1: (a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1701:2: a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_CompositeInstance882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_30, 30));
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_CompositeInstance896); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_31, 31));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1725:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1726:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance914); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_32, 32));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_CompositeInstance935); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_33, 33));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1770:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1771:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance953); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.PrimitiveType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_34, 34));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1807:2: (a5= T_INSTANCE_STATE )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1808:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance978); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              			}
              			if (a5 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_35, 35));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 35));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1841:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1842:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1842:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1843:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    a6=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_CompositeInstance1008); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_22, 36));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_23, 36));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1856:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1857:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1034);
                    a7_0=parse_art_implem_ComponentImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      					}
                      					if (a7_0 != null) {
                      						if (a7_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM), a7_0);
                      							completedElement(a7_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a7_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 37));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 38));
              	
            }
            a8=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_CompositeInstance1075); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 39));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 39));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1903:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==TEXT||LA8_0==20||(LA8_0>=26 && LA8_0<=27)||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1904:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1904:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1905:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1905:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
            	    int alt7=4;
            	    switch ( input.LA(1) ) {
            	    case TEXT:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 20:
            	    case 26:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt7=4;
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1906:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1906:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1907:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1111);
            	            a9_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE, a9_0);
            	              								completedElement(a9_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a9_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 40));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 40));
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1935:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1935:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1936:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1161);
            	            a10_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a10_0 != null) {
            	              							if (a10_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING, a10_0);
            	              								completedElement(a10_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a10_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 41));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 41));
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1964:10: (a11_0= parse_art_instance_ComponentInstance )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1964:10: (a11_0= parse_art_instance_ComponentInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1965:6: a11_0= parse_art_instance_ComponentInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1211);
            	            a11_0=parse_art_instance_ComponentInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a11_0 != null) {
            	              							if (a11_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, a11_0);
            	              								completedElement(a11_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a11_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 42));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 42));
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1993:10: (a12_0= parse_art_instance_DelegationBinding )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1993:10: (a12_0= parse_art_instance_DelegationBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1994:6: a12_0= parse_art_instance_DelegationBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1261);
            	            a12_0=parse_art_instance_DelegationBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a12_0 != null) {
            	              							if (a12_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION, a12_0);
            	              								completedElement(a12_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a12_0, element); 						}
            	              					
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              					// expected elements (follow set)
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 43));
            	              					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 43));
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 44));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 44));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 45));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 45));
              	
            }
            a13=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_CompositeInstance1320); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 46));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 46));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_art_instance_CompositeInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_CompositeInstance"


    // $ANTLR start "parse_art_instance_TransmissionBinding"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2073:1: parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null] : a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2076:1: (a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2077:2: a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_art_instance_TransmissionBinding1349); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_37, 47));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2089:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2090:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1367); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Port proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_38, 48));
              	
            }
            a2=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_TransmissionBinding1388); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_39, 49));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2138:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2139:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1406); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.instance.PrimitiveInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.Binding, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_40, 50));
              	
            }
            a4=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_TransmissionBinding1427); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_41, 51));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2187:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2188:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1445); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              			}
              			if (a5 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Port proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_42, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 52));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 52));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2232:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2233:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2233:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2234:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    a6=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_TransmissionBinding1475); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_43, 53));
                      			
                    }
                    a7=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_TransmissionBinding1495); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_44, 54));
                      			
                    }
                    a8=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_TransmissionBinding1515); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_45, 55));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2270:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2271:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1541); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      					}
                      					if (a9 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__ID), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__ID), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_46, 56));
                      			
                    }
                    a10=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_TransmissionBinding1574); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 57));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 57));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 58));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 58));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_art_instance_TransmissionBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_TransmissionBinding"


    // $ANTLR start "parse_art_instance_DelegationBinding"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2338:1: parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null] : a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2341:1: (a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2342:2: a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_DelegationBinding1622); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_47, 59));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2354:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2355:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1640); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Port proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_48, 60));
              	
            }
            a2=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_DelegationBinding1661); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_49, 61));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2403:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2404:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1679); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.instance.PrimitiveInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.Binding, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_50, 62));
              	
            }
            a4=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_DelegationBinding1700); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_51, 63));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2452:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2453:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1718); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              			}
              			if (a5 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Port proxy = art.type.TypeFactory.eINSTANCE.createPort();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_52, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 64));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 64));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2496:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2497:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2497:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2498:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    a6=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_DelegationBinding1748); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_53, 65));
                      			
                    }
                    a7=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_DelegationBinding1768); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_54, 66));
                      			
                    }
                    a8=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_DelegationBinding1788); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_55, 67));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2534:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2535:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding1814); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      					}
                      					if (a9 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__ID), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__ID), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_56, 68));
                      			
                    }
                    a10=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_DelegationBinding1847); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 69));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 69));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 70));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 70));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_art_instance_DelegationBinding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DelegationBinding"


    // $ANTLR start "parse_art_instance_ValuedAttribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2600:1: parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null] : (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) ;
    public final art.instance.ValuedAttribute parse_art_instance_ValuedAttribute() throws RecognitionException {
        art.instance.ValuedAttribute element =  null;
        int parse_art_instance_ValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2603:1: ( (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2604:2: (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL )
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2604:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2605:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute1899); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.BasicAttribute proxy = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ValuedAttribute, art.type.BasicAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_57, 71));
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_ValuedAttribute1920); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_58, 72));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2653:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2654:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute1938); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 73));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 73));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_art_instance_ValuedAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_ValuedAttribute"


    // $ANTLR start "parse_art_instance_DictionaryValuedAttribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2695:1: parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null] : (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? ;
    public final art.instance.DictionaryValuedAttribute parse_art_instance_DictionaryValuedAttribute() throws RecognitionException {
        art.instance.DictionaryValuedAttribute element =  null;
        int parse_art_instance_DictionaryValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        art.instance.Entry a2_0 = null;

        art.instance.Entry a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2698:1: ( (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2699:2: (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2699:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2700:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute1978); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.Dictionary proxy = art.type.TypeFactory.eINSTANCE.createDictionary();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DictionaryValuedAttribute, art.type.Dictionary>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_59, 74));
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_DictionaryValuedAttribute1999); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_60, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_61, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 75));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 75));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2757:2: ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2758:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2758:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2759:4: (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2759:4: (a2_0= parse_art_instance_Entry )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2760:5: a2_0= parse_art_instance_Entry
                    {
                    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2028);
                    a2_0=parse_art_instance_Entry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                      					}
                      					if (a2_0 != null) {
                      						if (a2_0 != null) {
                      							addObjectToList(element, art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a2_0);
                      							completedElement(a2_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a2_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_62, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 76));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 76));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2789:4: ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==36) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2790:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    {
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2790:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2791:6: a3= ',' (a4_0= parse_art_instance_Entry )
                    	    {
                    	    a3=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2069); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_60, 77));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_61, 77));
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2804:6: (a4_0= parse_art_instance_Entry )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2805:7: a4_0= parse_art_instance_Entry
                    	    {
                    	    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2103);
                    	    a4_0=parse_art_instance_Entry();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                    	      							}
                    	      							if (a4_0 != null) {
                    	      								if (a4_0 != null) {
                    	      									addObjectToList(element, art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a4_0);
                    	      									completedElement(a4_0);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos(a4_0, element); 							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_62, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 78));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 78));
                    	      					
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
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_62, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 79));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 79));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 80));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 80));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_art_instance_DictionaryValuedAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DictionaryValuedAttribute"


    // $ANTLR start "parse_art_instance_DefaultEntry"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2865:1: parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null] : a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
    public final art.instance.DefaultEntry parse_art_instance_DefaultEntry() throws RecognitionException {
        art.instance.DefaultEntry element =  null;
        int parse_art_instance_DefaultEntry_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2868:1: (a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2869:2: a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_DefaultEntry2192); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_63, 81));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2881:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2882:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2210); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.DictionaryDefaultValue proxy = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DefaultEntry, art.type.DictionaryDefaultValue>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__KEY), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_64, 82));
              	
            }
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_DefaultEntry2231); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_65, 83));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2930:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2931:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2249); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_66, 84));
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_DefaultEntry2270); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_62, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 85));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 85));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_art_instance_DefaultEntry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_DefaultEntry"


    // $ANTLR start "parse_art_instance_OtherEntry"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2985:1: parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null] : a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
    public final art.instance.OtherEntry parse_art_instance_OtherEntry() throws RecognitionException {
        art.instance.OtherEntry element =  null;
        int parse_art_instance_OtherEntry_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2988:1: (a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2989:2: a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_OtherEntry2299); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_67, 86));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3001:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3002:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2317); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__KEY), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_68, 87));
              	
            }
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_OtherEntry2338); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_69, 88));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3046:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3047:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2356); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__VALUE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.OTHER_ENTRY__VALUE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_70, 89));
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_OtherEntry2377); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_62, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 90));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 90));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_art_instance_OtherEntry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_OtherEntry"


    // $ANTLR start "parse_art_type_PrimitiveType"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3101:1: parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null] : a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3104:1: (a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3105:2: a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            a0=(Token)match(input,40,FOLLOW_40_in_parse_art_type_PrimitiveType2406); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_71, 91));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3117:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3118:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType2424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_72, 92));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 92));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3151:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3152:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3152:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3153:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_art_type_PrimitiveType2454); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_74, 93));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3165:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3166:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2480);
                    a3_0=parse_art_implem_TypeImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM), a3_0);
                      							completedElement(a3_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 94));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 95));
              	
            }
            a4=(Token)match(input,24,FOLLOW_24_in_parse_art_type_PrimitiveType2521); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 96));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 96));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 96));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 96));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 96));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3210:2: ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==T_PORT_KIND||LA15_0==58) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3211:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3211:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==T_PORT_KIND) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==58) ) {
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3212:4: (a5_0= parse_art_type_AbstractPort )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3212:4: (a5_0= parse_art_type_AbstractPort )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3213:5: a5_0= parse_art_type_AbstractPort
            	            {
            	            pushFollow(FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_PrimitiveType2550);
            	            a5_0=parse_art_type_AbstractPort();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__PORT, a5_0);
            	              							completedElement(a5_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a5_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 97));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 97));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 97));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 97));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 97));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3239:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3239:8: (a6_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3240:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2592);
            	            a6_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE, a6_0);
            	              							completedElement(a6_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a6_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 98));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 98));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 98));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 98));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 98));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 99));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 99));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 99));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 99));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 99));
              	
            }
            a7=(Token)match(input,25,FOLLOW_25_in_parse_art_type_PrimitiveType2633); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 100));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 100));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_art_type_PrimitiveType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PrimitiveType"


    // $ANTLR start "parse_art_type_CompositeType"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3296:1: parse_art_type_CompositeType returns [art.type.CompositeType element = null] : a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3299:1: (a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3300:2: a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_art_type_CompositeType2662); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_80, 101));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3312:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3313:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType2680); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_81, 102));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 102));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3346:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3347:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3347:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3348:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_art_type_CompositeType2710); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_74, 103));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3360:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3361:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2736);
                    a3_0=parse_art_implem_TypeImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__IMPLEM), a3_0);
                      							completedElement(a3_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 104));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 105));
              	
            }
            a4=(Token)match(input,24,FOLLOW_24_in_parse_art_type_CompositeType2777); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 106));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 106));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 106));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 106));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 106));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3405:2: ( ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==T_PORT_KIND||LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3406:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3406:3: ( (a5_0= parse_art_type_AbstractPort ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==T_PORT_KIND) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==58) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3407:4: (a5_0= parse_art_type_AbstractPort )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3407:4: (a5_0= parse_art_type_AbstractPort )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3408:5: a5_0= parse_art_type_AbstractPort
            	            {
            	            pushFollow(FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_CompositeType2806);
            	            a5_0=parse_art_type_AbstractPort();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a5_0 != null) {
            	              						if (a5_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__PORT, a5_0);
            	              							completedElement(a5_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a5_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 107));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 107));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 107));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 107));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 107));
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3434:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3434:8: (a6_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3435:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType2848);
            	            a6_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a6_0 != null) {
            	              						if (a6_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE, a6_0);
            	              							completedElement(a6_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a6_0, element); 					}
            	              				
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 108));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 108));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 108));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 108));
            	              				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 108));
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 109));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 109));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 109));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 109));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 109));
              	
            }
            a7=(Token)match(input,25,FOLLOW_25_in_parse_art_type_CompositeType2889); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 110));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 110));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_art_type_CompositeType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_CompositeType"


    // $ANTLR start "parse_art_type_Operation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3491:1: parse_art_type_Operation returns [art.type.Operation element = null] : a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3494:1: (a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3495:2: a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_art_type_Operation2918); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_85, 111));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3507:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3508:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Operation2936); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createOperation();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.OPERATION__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.OPERATION__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_86, 112));
              	
            }
            a2=(Token)match(input,30,FOLLOW_30_in_parse_art_type_Operation2957); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 113));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 113));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 113));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3554:2: ( ( (a3_0= parse_art_type_Parameter ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TEXT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3555:3: ( (a3_0= parse_art_type_Parameter ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3555:3: ( (a3_0= parse_art_type_Parameter ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3556:4: (a3_0= parse_art_type_Parameter )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3556:4: (a3_0= parse_art_type_Parameter )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3557:5: a3_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation2986);
                    a3_0=parse_art_type_Parameter();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createOperation();
                      					}
                      					if (a3_0 != null) {
                      						if (a3_0 != null) {
                      							addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a3_0);
                      							completedElement(a3_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 114));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 114));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 115));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 115));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3587:2: ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3588:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3588:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3589:4: a4= ',' (a5_0= parse_art_type_Parameter )
            	    {
            	    a4=(Token)match(input,36,FOLLOW_36_in_parse_art_type_Operation3036); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 116));
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3601:4: (a5_0= parse_art_type_Parameter )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3602:5: a5_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3062);
            	    a5_0=parse_art_type_Parameter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a5_0);
            	      							completedElement(a5_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a5_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 117));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 117));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 118));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 118));
              	
            }
            a6=(Token)match(input,33,FOLLOW_33_in_parse_art_type_Operation3103); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_90, 119));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 119));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 119));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 119));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 119));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3648:2: ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3649:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3649:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3650:4: a7= ':' (a8_0= parse_art_type_Parameter )
                    {
                    a7=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Operation3126); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createOperation();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 120));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3662:4: (a8_0= parse_art_type_Parameter )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3663:5: a8_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3152);
                    a8_0=parse_art_type_Parameter();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createOperation();
                      					}
                      					if (a8_0 != null) {
                      						if (a8_0 != null) {
                      							addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a8_0);
                      							completedElement(a8_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a8_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 121));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 121));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 121));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 121));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 122));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 122));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 122));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 122));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3697:2: ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3698:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3698:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3699:4: a9= ',' (a10_0= parse_art_type_Parameter )
            	    {
            	    a9=(Token)match(input,36,FOLLOW_36_in_parse_art_type_Operation3202); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 123));
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3711:4: (a10_0= parse_art_type_Parameter )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3712:5: a10_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3228);
            	    a10_0=parse_art_type_Parameter();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      					}
            	      					if (a10_0 != null) {
            	      						if (a10_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a10_0);
            	      							completedElement(a10_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a10_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 124));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 124));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 124));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 124));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 125));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 125));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 125));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 125));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_art_type_Operation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Operation"


    // $ANTLR start "parse_art_type_Parameter"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3748:1: parse_art_type_Parameter returns [art.type.Parameter element = null] : (a0= TEXT ) (a1= TEXT ) ;
    public final art.type.Parameter parse_art_type_Parameter() throws RecognitionException {
        art.type.Parameter element =  null;
        int parse_art_type_Parameter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3751:1: ( (a0= TEXT ) (a1= TEXT ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3752:2: (a0= TEXT ) (a1= TEXT )
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3752:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3753:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3288); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createParameter();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_94, 126));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3789:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3790:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3313); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createParameter();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 127));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 127));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_art_type_Parameter_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Parameter"


    // $ANTLR start "parse_art_type_FunctionalService"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3825:1: parse_art_type_FunctionalService returns [art.type.FunctionalService element = null] : a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3828:1: (a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3829:2: a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_art_type_FunctionalService3349); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_95, 128));
              	
            }
            a1=(Token)match(input,44,FOLLOW_44_in_parse_art_type_FunctionalService3363); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_96, 129));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3853:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3854:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_FunctionalService3381); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_97, 130));
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_art_type_FunctionalService3402); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 131));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 131));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3899:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3900:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3900:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3901:4: (a4_0= parse_art_type_Operation )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3901:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3902:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3431);
            	    a4_0=parse_art_type_Operation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
            	      					}
            	      					if (a4_0 != null) {
            	      						if (a4_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION, a4_0);
            	      							completedElement(a4_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a4_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 132));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 132));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 133));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 133));
              	
            }
            a5=(Token)match(input,25,FOLLOW_25_in_parse_art_type_FunctionalService3472); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 134));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 134));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_art_type_FunctionalService_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_FunctionalService"


    // $ANTLR start "parse_art_type_ControlService"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3952:1: parse_art_type_ControlService returns [art.type.ControlService element = null] : a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3955:1: (a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3956:2: a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            a0=(Token)match(input,45,FOLLOW_45_in_parse_art_type_ControlService3501); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_98, 135));
              	
            }
            a1=(Token)match(input,44,FOLLOW_44_in_parse_art_type_ControlService3515); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_99, 136));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3980:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3981:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_ControlService3533); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createControlService();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.CONTROL_SERVICE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.CONTROL_SERVICE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_100, 137));
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_art_type_ControlService3554); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 138));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 138));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4026:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4027:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4027:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4028:4: (a4_0= parse_art_type_Operation )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4028:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4029:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3583);
            	    a4_0=parse_art_type_Operation();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createControlService();
            	      					}
            	      					if (a4_0 != null) {
            	      						if (a4_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.CONTROL_SERVICE__OPERATION, a4_0);
            	      							completedElement(a4_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a4_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 139));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 139));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 140));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 140));
              	
            }
            a5=(Token)match(input,25,FOLLOW_25_in_parse_art_type_ControlService3624); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 141));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 141));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_art_type_ControlService_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_ControlService"


    // $ANTLR start "parse_art_type_Port"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4079:1: parse_art_type_Port returns [art.type.Port element = null] : (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']' ;
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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4082:1: ( (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4083:2: (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']'
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4083:2: (a0= T_PORT_KIND )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4084:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_Port3657); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__ROLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__ROLE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_101, 142));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 142));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4117:2: ( ( (a1= T_OPTIONAL ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==T_OPTIONAL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4118:3: ( (a1= T_OPTIONAL ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4118:3: ( (a1= T_OPTIONAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4119:4: (a1= T_OPTIONAL )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4119:4: (a1= T_OPTIONAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4120:5: a1= T_OPTIONAL
                    {
                    a1=(Token)match(input,T_OPTIONAL,FOLLOW_T_OPTIONAL_in_parse_art_type_Port3693); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPort();
                      					}
                      					if (a1 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_OPTIONAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__IS_OPTIONAL), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
                      						}
                      						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__IS_OPTIONAL), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 143));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 144));
              	
            }
            a2=(Token)match(input,46,FOLLOW_46_in_parse_art_type_Port3739); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_103, 145));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4171:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4172:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3757); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_104, 146));
              	
            }
            a4=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Port3778); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_105, 147));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4216:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4217:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3796); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a5 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.FunctionalService proxy = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.AbstractPort, art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_106, 148));
              	
            }
            a6=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Port3817); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_107, 149));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4265:2: (a7= MULTIPLICITY )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4266:3: a7= MULTIPLICITY
            {
            a7=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port3835); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a7 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__LOWER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__LOWER), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_108, 150));
              	
            }
            a8=(Token)match(input,47,FOLLOW_47_in_parse_art_type_Port3856); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_109, 151));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4310:2: (a9= MULTIPLICITY )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4311:3: a9= MULTIPLICITY
            {
            a9=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port3874); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a9 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__UPPER), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__UPPER), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_110, 152));
              	
            }
            a10=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Port3895); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 153));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 153));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 153));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 153));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 153));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 153));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_art_type_Port_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Port"


    // $ANTLR start "parse_art_implem_FractalComponent"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4362:1: parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null] : a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4365:1: (a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4366:2: a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>'
            {
            a0=(Token)match(input,48,FOLLOW_48_in_parse_art_implem_FractalComponent3924); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_111, 154));
              	
            }
            a1=(Token)match(input,49,FOLLOW_49_in_parse_art_implem_FractalComponent3938); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_112, 155));
              	
            }
            a2=(Token)match(input,50,FOLLOW_50_in_parse_art_implem_FractalComponent3952); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_113, 156));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_FractalComponent3966); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_114, 157));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4414:2: (a4= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4415:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent3984); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_115, 158));
              	
            }
            a5=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_FractalComponent4005); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_116, 159));
              	
            }
            a6=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_FractalComponent4019); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_117, 160));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4471:2: (a7= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4472:3: a7= STRING_LITERAL
            {
            a7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4037); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              			}
              			if (a7 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_118, 161));
              	
            }
            a8=(Token)match(input,52,FOLLOW_52_in_parse_art_implem_FractalComponent4058); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 162));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 162));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_art_implem_FractalComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_FractalComponent"


    // $ANTLR start "parse_art_implem_OSGiComponent"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4519:1: parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null] : a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) ;
    public final art.implem.OSGiComponent parse_art_implem_OSGiComponent() throws RecognitionException {
        art.implem.OSGiComponent element =  null;
        int parse_art_implem_OSGiComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4522:1: (a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4523:2: a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL )
            {
            a0=(Token)match(input,53,FOLLOW_53_in_parse_art_implem_OSGiComponent4087); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_119, 163));
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_OSGiComponent4101); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_120, 164));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4547:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4548:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4119); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 165));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 165));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_art_implem_OSGiComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiComponent"


    // $ANTLR start "parse_art_group_TypeGroup"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4583:1: parse_art_group_TypeGroup returns [art.group.TypeGroup element = null] : a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4586:1: (a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4587:2: a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}'
            {
            a0=(Token)match(input,54,FOLLOW_54_in_parse_art_group_TypeGroup4155); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_121, 166));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4599:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4600:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4173); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_122, 167));
              	
            }
            a2=(Token)match(input,24,FOLLOW_24_in_parse_art_group_TypeGroup4194); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_123, 168));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 168));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 168));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4646:2: ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4647:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4647:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4648:4: a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    a3=(Token)match(input,55,FOLLOW_55_in_parse_art_group_TypeGroup4217); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_125, 169));
                      			
                    }
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_art_group_TypeGroup4237); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_126, 170));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4672:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4673:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4263); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      					}
                      					if (a5 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.type.PrimitiveType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.group.TypeGroup, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__TYPES, proxy);
                      							completedElement(proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 171));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 171));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 171));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4711:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==36) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4712:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4712:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4713:6: a6= ',' (a7= TEXT )
                    	    {
                    	    a6=(Token)match(input,36,FOLLOW_36_in_parse_art_group_TypeGroup4309); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_128, 172));
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4725:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4726:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4343); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      							}
                    	      							if (a7 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.type.PrimitiveType proxy = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.group.TypeGroup, art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.TYPE_GROUP__TYPES), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__TYPES, proxy);
                    	      									completedElement(proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
                    	      								copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 173));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 173));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 173));
                    	      					
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
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 174));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 174));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 174));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 175));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 175));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4781:2: ( ( (a8_0= parse_art_group_TypeGroup ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4782:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4782:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4783:4: (a8_0= parse_art_group_TypeGroup )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4783:4: (a8_0= parse_art_group_TypeGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4784:5: a8_0= parse_art_group_TypeGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4439);
            	    a8_0=parse_art_group_TypeGroup();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.group.GroupPackage.TYPE_GROUP__SUB_GROUPS, a8_0);
            	      							completedElement(a8_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a8_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 176));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 176));
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 177));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 177));
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_group_TypeGroup4480); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 178));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 178));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_art_group_TypeGroup_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_TypeGroup"


    // $ANTLR start "parse_art_group_InstanceGroup"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4835:1: parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null] : a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4838:1: (a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4839:2: a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}'
            {
            a0=(Token)match(input,56,FOLLOW_56_in_parse_art_group_InstanceGroup4509); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_129, 179));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4851:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4852:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4527); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_130, 180));
              	
            }
            a2=(Token)match(input,24,FOLLOW_24_in_parse_art_group_InstanceGroup4548); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_131, 181));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 181));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 181));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4898:2: ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4899:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4899:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4900:4: a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    a3=(Token)match(input,57,FOLLOW_57_in_parse_art_group_InstanceGroup4571); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_133, 182));
                      			
                    }
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_art_group_InstanceGroup4591); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_134, 183));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4924:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4925:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4617); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      					}
                      					if (a5 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.instance.PrimitiveInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.group.InstanceGroup, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__INSTANCES, proxy);
                      							completedElement(proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 184));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 184));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 184));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4963:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==36) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4964:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4964:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4965:6: a6= ',' (a7= TEXT )
                    	    {
                    	    a6=(Token)match(input,36,FOLLOW_36_in_parse_art_group_InstanceGroup4663); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_136, 185));
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4977:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4978:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4697); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      							}
                    	      							if (a7 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.instance.PrimitiveInstance proxy = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.group.InstanceGroup, art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.group.GroupPackage.INSTANCE_GROUP__INSTANCES), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__INSTANCES, proxy);
                    	      									completedElement(proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
                    	      								copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 186));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 186));
                    	      						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 186));
                    	      					
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
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 187));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 187));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 187));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 188));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 188));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5033:2: ( ( (a8_0= parse_art_group_InstanceGroup ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==56) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5034:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5034:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5035:4: (a8_0= parse_art_group_InstanceGroup )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5035:4: (a8_0= parse_art_group_InstanceGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5036:5: a8_0= parse_art_group_InstanceGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup4793);
            	    a8_0=parse_art_group_InstanceGroup();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.group.GroupPackage.INSTANCE_GROUP__SUB_GROUPS, a8_0);
            	      							completedElement(a8_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a8_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 189));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 189));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 190));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 190));
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_group_InstanceGroup4834); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 191));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 191));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_art_group_InstanceGroup_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_InstanceGroup"


    // $ANTLR start "parse_art_implem_OSGiType"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5087:1: parse_art_implem_OSGiType returns [art.implem.OSGiType element = null] : (a0= T_IMPLEM ) ;
    public final art.implem.OSGiType parse_art_implem_OSGiType() throws RecognitionException {
        art.implem.OSGiType element =  null;
        int parse_art_implem_OSGiType_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5090:1: ( (a0= T_IMPLEM ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5091:2: (a0= T_IMPLEM )
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5091:2: (a0= T_IMPLEM )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5092:3: a0= T_IMPLEM
            {
            a0=(Token)match(input,T_IMPLEM,FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType4867); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 192));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 192));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_art_implem_OSGiType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiType"


    // $ANTLR start "parse_art_type_BasicAttribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5127:1: parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5130:1: (a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5131:2: a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            {
            a0=(Token)match(input,58,FOLLOW_58_in_parse_art_type_BasicAttribute4903); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_137, 193));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5143:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5144:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute4921); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_138, 194));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_BasicAttribute4942); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_139, 195));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5188:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5189:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute4960); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              			}
              			if (a3 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_140, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 196));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 196));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5231:2: ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5232:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5232:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5233:4: a4= 'default' (a5= STRING_LITERAL )
                    {
                    a4=(Token)match(input,59,FOLLOW_59_in_parse_art_type_BasicAttribute4990); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_141, 197));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5245:4: (a5= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5246:5: a5= STRING_LITERAL
                    {
                    a5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5016); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
                      					}
                      					if (a5 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 198));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 198));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 198));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 198));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 198));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 198));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 199));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 199));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 199));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 199));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 199));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 199));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_art_type_BasicAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_BasicAttribute"


    // $ANTLR start "parse_art_type_Dictionary"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5297:1: parse_art_type_Dictionary returns [art.type.Dictionary element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5300:1: (a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5301:2: a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            {
            a0=(Token)match(input,58,FOLLOW_58_in_parse_art_type_Dictionary5077); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_142, 200));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5313:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5314:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5095); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_143, 201));
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Dictionary5116); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_144, 202));
              	
            }
            a3=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Dictionary5130); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_145, 203));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5370:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5371:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5148); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_146, 204));
              	
            }
            a5=(Token)match(input,38,FOLLOW_38_in_parse_art_type_Dictionary5169); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_147, 205));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5419:2: (a6= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5420:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5187); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionary();
              			}
              			if (a6 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.Dictionary, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY__VALUE_TYPE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_148, 206));
              	
            }
            a7=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Dictionary5208); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_149, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 207));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 207));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5474:2: ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5475:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5475:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5476:4: a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}'
                    {
                    a8=(Token)match(input,59,FOLLOW_59_in_parse_art_type_Dictionary5231); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_150, 208));
                      			
                    }
                    a9=(Token)match(input,24,FOLLOW_24_in_parse_art_type_Dictionary5251); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 209));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 209));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5501:4: ( (a10_0= parse_art_type_DictionaryDefaultValue ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==37) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5502:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    {
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5502:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5503:6: a10_0= parse_art_type_DictionaryDefaultValue
                    	    {
                    	    pushFollow(FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5284);
                    	    a10_0=parse_art_type_DictionaryDefaultValue();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = art.type.TypeFactory.eINSTANCE.createDictionary();
                    	      						}
                    	      						if (a10_0 != null) {
                    	      							if (a10_0 != null) {
                    	      								addObjectToList(element, art.type.TypePackage.DICTIONARY__KEYS, a10_0);
                    	      								completedElement(a10_0);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							copyLocalizationInfos(a10_0, element); 						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 210));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 210));
                      			
                    }
                    a11=(Token)match(input,25,FOLLOW_25_in_parse_art_type_Dictionary5324); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 211));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 211));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 211));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 211));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 211));
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 211));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 212));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 212));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 212));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 212));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 212));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 212));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_art_type_Dictionary_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Dictionary"


    // $ANTLR start "parse_art_type_DictionaryDefaultValue"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5557:1: parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null] : a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' ;
    public final art.type.DictionaryDefaultValue parse_art_type_DictionaryDefaultValue() throws RecognitionException {
        art.type.DictionaryDefaultValue element =  null;
        int parse_art_type_DictionaryDefaultValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5560:1: (a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5561:2: a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_type_DictionaryDefaultValue5372); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_153, 213));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5573:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5574:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5390); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              			}
              			if (a1 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_154, 214));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 214));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5607:2: ( (a2= '->' (a3= STRING_LITERAL ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5608:3: (a2= '->' (a3= STRING_LITERAL ) )
                    {
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5608:3: (a2= '->' (a3= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5609:4: a2= '->' (a3= STRING_LITERAL )
                    {
                    a2=(Token)match(input,38,FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5420); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_156, 215));
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5621:4: (a3= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5622:5: a3= STRING_LITERAL
                    {
                    a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5446); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
                      					}
                      					if (a3 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), resolved);
                      							completedElement(resolved);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 216));
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 217));
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5492); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 218));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 218));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_art_type_DictionaryDefaultValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_DictionaryDefaultValue"


    // $ANTLR start "parse_art_type_PortId"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5676:1: parse_art_type_PortId returns [art.type.PortId element = null] : (a0= TEXT ) ;
    public final art.type.PortId parse_art_type_PortId() throws RecognitionException {
        art.type.PortId element =  null;
        int parse_art_type_PortId_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5679:1: ( (a0= TEXT ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5680:2: (a0= TEXT )
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5680:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5681:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortId5525); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortId();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_ID__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_ID__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 219));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 219));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_art_type_PortId_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PortId"


    // $ANTLR start "parse_art_type_PortCollection"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5716:1: parse_art_type_PortCollection returns [art.type.PortCollection element = null] : (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5719:1: ( (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5720:2: (a0= T_PORT_KIND ) a1= 'port' (a2= TEXT ) a3= ':' (a4= TEXT ) a5= '{' (a6_0= parse_art_type_PortId ) ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )* a9= '}'
            {
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5720:2: (a0= T_PORT_KIND )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5721:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_PortCollection5565); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a0 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__ROLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__ROLE), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_160, 220));
              	
            }
            a1=(Token)match(input,46,FOLLOW_46_in_parse_art_type_PortCollection5586); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_161, 221));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5765:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5766:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortCollection5604); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__NAME), resolved);
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_162, 222));
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_type_PortCollection5625); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_163, 223));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5810:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5811:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PortCollection5643); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.type.FunctionalService proxy = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.AbstractPort, art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT_COLLECTION__SERVICE), proxy);
              					completedElement(proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_164, 224));
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_art_type_PortCollection5664); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_157, 225));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5859:2: (a6_0= parse_art_type_PortId )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5860:3: a6_0= parse_art_type_PortId
            {
            pushFollow(FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection5682);
            a6_0=parse_art_type_PortId();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              			}
              			if (a6_0 != null) {
              				if (a6_0 != null) {
              					addObjectToList(element, art.type.TypePackage.PORT_COLLECTION__IDS, a6_0);
              					completedElement(a6_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a6_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 226));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 226));
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5882:2: ( (a7= ',' (a8_0= parse_art_type_PortId ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5883:3: (a7= ',' (a8_0= parse_art_type_PortId ) )
            	    {
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5883:3: (a7= ',' (a8_0= parse_art_type_PortId ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5884:4: a7= ',' (a8_0= parse_art_type_PortId )
            	    {
            	    a7=(Token)match(input,36,FOLLOW_36_in_parse_art_type_PortCollection5709); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createPortCollection();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_157, 227));
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5896:4: (a8_0= parse_art_type_PortId )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5897:5: a8_0= parse_art_type_PortId
            	    {
            	    pushFollow(FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection5735);
            	    a8_0=parse_art_type_PortId();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = art.type.TypeFactory.eINSTANCE.createPortCollection();
            	      					}
            	      					if (a8_0 != null) {
            	      						if (a8_0 != null) {
            	      							addObjectToList(element, art.type.TypePackage.PORT_COLLECTION__IDS, a8_0);
            	      							completedElement(a8_0);
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a8_0, element); 					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 228));
            	      				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 228));
            	      			
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
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 229));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 229));
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_type_PortCollection5776); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 230));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 230));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 230));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 230));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 230));
              		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 230));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_art_type_PortCollection_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_PortCollection"


    // $ANTLR start "parse_art_type_Service"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5946:1: parse_art_type_Service returns [art.type.Service element = null] : (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService );
    public final art.type.Service parse_art_type_Service() throws RecognitionException {
        art.type.Service element =  null;
        int parse_art_type_Service_StartIndex = input.index();
        art.type.FunctionalService c0 = null;

        art.type.ControlService c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5947:1: (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            else if ( (LA37_0==45) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5948:2: c0= parse_art_type_FunctionalService
                    {
                    pushFollow(FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service5801);
                    c0=parse_art_type_FunctionalService();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5949:4: c1= parse_art_type_ControlService
                    {
                    pushFollow(FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service5811);
                    c1=parse_art_type_ControlService();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 29, parse_art_type_Service_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Service"


    // $ANTLR start "parse_art_type_ComponentType"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5953:1: parse_art_type_ComponentType returns [art.type.ComponentType element = null] : (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType );
    public final art.type.ComponentType parse_art_type_ComponentType() throws RecognitionException {
        art.type.ComponentType element =  null;
        int parse_art_type_ComponentType_StartIndex = input.index();
        art.type.PrimitiveType c0 = null;

        art.type.CompositeType c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5954:1: (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            else if ( (LA38_0==41) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5955:2: c0= parse_art_type_PrimitiveType
                    {
                    pushFollow(FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType5832);
                    c0=parse_art_type_PrimitiveType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5956:4: c1= parse_art_type_CompositeType
                    {
                    pushFollow(FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType5842);
                    c1=parse_art_type_CompositeType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 30, parse_art_type_ComponentType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_ComponentType"


    // $ANTLR start "parse_art_group_Group"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5960:1: parse_art_group_Group returns [art.group.Group element = null] : (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup );
    public final art.group.Group parse_art_group_Group() throws RecognitionException {
        art.group.Group element =  null;
        int parse_art_group_Group_StartIndex = input.index();
        art.group.TypeGroup c0 = null;

        art.group.InstanceGroup c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5961:1: (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            else if ( (LA39_0==56) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5962:2: c0= parse_art_group_TypeGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group5863);
                    c0=parse_art_group_TypeGroup();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5963:4: c1= parse_art_group_InstanceGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group5873);
                    c1=parse_art_group_InstanceGroup();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 31, parse_art_group_Group_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_Group"


    // $ANTLR start "parse_art_implem_ComponentImplementation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5967:1: parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null] : (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent );
    public final art.implem.ComponentImplementation parse_art_implem_ComponentImplementation() throws RecognitionException {
        art.implem.ComponentImplementation element =  null;
        int parse_art_implem_ComponentImplementation_StartIndex = input.index();
        art.implem.FractalComponent c0 = null;

        art.implem.OSGiComponent c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5968:1: (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            else if ( (LA40_0==53) ) {
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5969:2: c0= parse_art_implem_FractalComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation5894);
                    c0=parse_art_implem_FractalComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5970:4: c1= parse_art_implem_OSGiComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation5904);
                    c1=parse_art_implem_OSGiComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 32, parse_art_implem_ComponentImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_ComponentImplementation"


    // $ANTLR start "parse_art_instance_AttributeInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5974:1: parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null] : (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute );
    public final art.instance.AttributeInstance parse_art_instance_AttributeInstance() throws RecognitionException {
        art.instance.AttributeInstance element =  null;
        int parse_art_instance_AttributeInstance_StartIndex = input.index();
        art.instance.ValuedAttribute c0 = null;

        art.instance.DictionaryValuedAttribute c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5975:1: (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==TEXT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==35) ) {
                    int LA41_2 = input.LA(3);

                    if ( (LA41_2==EOF||LA41_2==TEXT||LA41_2==20||(LA41_2>=25 && LA41_2<=27)||LA41_2==34||LA41_2==37) ) {
                        alt41=2;
                    }
                    else if ( (LA41_2==STRING_LITERAL) ) {
                        alt41=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5976:2: c0= parse_art_instance_ValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance5925);
                    c0=parse_art_instance_ValuedAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5977:4: c1= parse_art_instance_DictionaryValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance5935);
                    c1=parse_art_instance_DictionaryValuedAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 33, parse_art_instance_AttributeInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_AttributeInstance"


    // $ANTLR start "parse_art_instance_ComponentInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5981:1: parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null] : (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance );
    public final art.instance.ComponentInstance parse_art_instance_ComponentInstance() throws RecognitionException {
        art.instance.ComponentInstance element =  null;
        int parse_art_instance_ComponentInstance_StartIndex = input.index();
        art.instance.PrimitiveInstance c0 = null;

        art.instance.CompositeInstance c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5982:1: (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            else if ( (LA42_0==26) ) {
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5983:2: c0= parse_art_instance_PrimitiveInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance5956);
                    c0=parse_art_instance_PrimitiveInstance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5984:4: c1= parse_art_instance_CompositeInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance5966);
                    c1=parse_art_instance_CompositeInstance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 34, parse_art_instance_ComponentInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_ComponentInstance"


    // $ANTLR start "parse_art_instance_Entry"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5988:1: parse_art_instance_Entry returns [art.instance.Entry element = null] : (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry );
    public final art.instance.Entry parse_art_instance_Entry() throws RecognitionException {
        art.instance.Entry element =  null;
        int parse_art_instance_Entry_StartIndex = input.index();
        art.instance.DefaultEntry c0 = null;

        art.instance.OtherEntry c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5989:1: (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==TEXT) ) {
                    alt43=1;
                }
                else if ( (LA43_1==STRING_LITERAL) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5990:2: c0= parse_art_instance_DefaultEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry5987);
                    c0=parse_art_instance_DefaultEntry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5991:4: c1= parse_art_instance_OtherEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry5997);
                    c1=parse_art_instance_OtherEntry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 35, parse_art_instance_Entry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_Entry"


    // $ANTLR start "parse_art_implem_TypeImplementation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5995:1: parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null] : c0= parse_art_implem_OSGiType ;
    public final art.implem.TypeImplementation parse_art_implem_TypeImplementation() throws RecognitionException {
        art.implem.TypeImplementation element =  null;
        int parse_art_implem_TypeImplementation_StartIndex = input.index();
        art.implem.OSGiType c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5996:1: (c0= parse_art_implem_OSGiType )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5997:2: c0= parse_art_implem_OSGiType
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6018);
            c0=parse_art_implem_OSGiType();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; /* this is a subclass choice */ 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, parse_art_implem_TypeImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_TypeImplementation"


    // $ANTLR start "parse_art_type_AbstractPort"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6001:1: parse_art_type_AbstractPort returns [art.type.AbstractPort element = null] : (c0= parse_art_type_Port | c1= parse_art_type_PortCollection );
    public final art.type.AbstractPort parse_art_type_AbstractPort() throws RecognitionException {
        art.type.AbstractPort element =  null;
        int parse_art_type_AbstractPort_StartIndex = input.index();
        art.type.Port c0 = null;

        art.type.PortCollection c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6002:1: (c0= parse_art_type_Port | c1= parse_art_type_PortCollection )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==T_PORT_KIND) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==46) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==TEXT) ) {
                        int LA44_4 = input.LA(4);

                        if ( (LA44_4==22) ) {
                            int LA44_5 = input.LA(5);

                            if ( (LA44_5==TEXT) ) {
                                int LA44_6 = input.LA(6);

                                if ( (LA44_6==24) ) {
                                    alt44=2;
                                }
                                else if ( (LA44_6==37) ) {
                                    alt44=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 44, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 44, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA44_1==T_OPTIONAL) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6003:2: c0= parse_art_type_Port
                    {
                    pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_AbstractPort6039);
                    c0=parse_art_type_Port();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6004:4: c1= parse_art_type_PortCollection
                    {
                    pushFollow(FOLLOW_parse_art_type_PortCollection_in_parse_art_type_AbstractPort6049);
                    c1=parse_art_type_PortCollection();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 37, parse_art_type_AbstractPort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_AbstractPort"


    // $ANTLR start "parse_art_type_Attribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6008:1: parse_art_type_Attribute returns [art.type.Attribute element = null] : (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary );
    public final art.type.Attribute parse_art_type_Attribute() throws RecognitionException {
        art.type.Attribute element =  null;
        int parse_art_type_Attribute_StartIndex = input.index();
        art.type.BasicAttribute c0 = null;

        art.type.Dictionary c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6009:1: (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==TEXT) ) {
                    int LA45_2 = input.LA(3);

                    if ( (LA45_2==22) ) {
                        int LA45_3 = input.LA(4);

                        if ( (LA45_3==TEXT) ) {
                            alt45=1;
                        }
                        else if ( (LA45_3==37) ) {
                            alt45=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 3, input);

                            throw nvae;
                        }
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6010:2: c0= parse_art_type_BasicAttribute
                    {
                    pushFollow(FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6070);
                    c0=parse_art_type_BasicAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:6011:4: c1= parse_art_type_Dictionary
                    {
                    pushFollow(FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6080);
                    c1=parse_art_type_Dictionary();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 38, parse_art_type_Attribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Attribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_art_System_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_art_System112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_System130 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_System151 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_art_System165 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_System183 = new BitSet(new long[]{0x01402B0000080002L});
    public static final BitSet FOLLOW_parse_art_type_Service_in_parse_art_System223 = new BitSet(new long[]{0x01402B0000080002L});
    public static final BitSet FOLLOW_parse_art_type_ComponentType_in_parse_art_System273 = new BitSet(new long[]{0x01402B0000080002L});
    public static final BitSet FOLLOW_parse_art_DataType_in_parse_art_System323 = new BitSet(new long[]{0x01402B0000080002L});
    public static final BitSet FOLLOW_parse_art_group_Group_in_parse_art_System373 = new BitSet(new long[]{0x01402B0000080002L});
    public static final BitSet FOLLOW_19_in_parse_art_DataType447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_DataType465 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_DataType486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_art_instance_PrimitiveInstance515 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_PrimitiveInstance529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance547 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_PrimitiveInstance568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance611 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_PrimitiveInstance641 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance667 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_PrimitiveInstance708 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance744 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance794 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_PrimitiveInstance853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_CompositeInstance882 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_CompositeInstance896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance914 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_CompositeInstance935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance978 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_CompositeInstance1008 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_CompositeInstance1075 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1111 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1161 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1211 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1261 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_CompositeInstance1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_art_instance_TransmissionBinding1349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1367 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_TransmissionBinding1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1406 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_TransmissionBinding1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1445 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_TransmissionBinding1475 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_TransmissionBinding1495 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_TransmissionBinding1515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1541 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_TransmissionBinding1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_DelegationBinding1622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1640 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_DelegationBinding1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_DelegationBinding1700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1718 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_DelegationBinding1748 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_DelegationBinding1768 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_DelegationBinding1788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding1814 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_DelegationBinding1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute1899 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_ValuedAttribute1920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute1978 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_DictionaryValuedAttribute1999 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2028 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2069 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2103 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_DefaultEntry2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2210 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_DefaultEntry2231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2249 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_DefaultEntry2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_OtherEntry2299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2317 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_OtherEntry2338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2356 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_OtherEntry2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_art_type_PrimitiveType2406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType2424 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_PrimitiveType2454 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_PrimitiveType2521 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_PrimitiveType2550 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2592 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_25_in_parse_art_type_PrimitiveType2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_art_type_CompositeType2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType2680 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_CompositeType2710 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2736 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_CompositeType2777 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_parse_art_type_AbstractPort_in_parse_art_type_CompositeType2806 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType2848 = new BitSet(new long[]{0x0400000002000080L});
    public static final BitSet FOLLOW_25_in_parse_art_type_CompositeType2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_art_type_Operation2918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Operation2936 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_type_Operation2957 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation2986 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_36_in_parse_art_type_Operation3036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3062 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_type_Operation3103 = new BitSet(new long[]{0x0000001000400002L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Operation3126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3152 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_parse_art_type_Operation3202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3228 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_art_type_FunctionalService3349 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_FunctionalService3363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_FunctionalService3381 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_FunctionalService3402 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3431 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_FunctionalService3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_art_type_ControlService3501 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_ControlService3515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_ControlService3533 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_ControlService3554 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3583 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_ControlService3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_Port3657 = new BitSet(new long[]{0x0000400000000100L});
    public static final BitSet FOLLOW_T_OPTIONAL_in_parse_art_type_Port3693 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_art_type_Port3739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3757 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Port3778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3796 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Port3817 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port3835 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_art_type_Port3856 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port3874 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Port3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_art_implem_FractalComponent3924 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_art_implem_FractalComponent3938 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_art_implem_FractalComponent3952 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_FractalComponent3966 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent3984 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_FractalComponent4005 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_FractalComponent4019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4037 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_art_implem_FractalComponent4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_parse_art_implem_OSGiComponent4087 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_OSGiComponent4101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_parse_art_group_TypeGroup4155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_TypeGroup4194 = new BitSet(new long[]{0x00C0000002000000L});
    public static final BitSet FOLLOW_55_in_parse_art_group_TypeGroup4217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_TypeGroup4237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4263 = new BitSet(new long[]{0x0040001002000000L});
    public static final BitSet FOLLOW_36_in_parse_art_group_TypeGroup4309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4343 = new BitSet(new long[]{0x0040001002000000L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4439 = new BitSet(new long[]{0x0040000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_TypeGroup4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_parse_art_group_InstanceGroup4509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4527 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_InstanceGroup4548 = new BitSet(new long[]{0x03402B0002080000L});
    public static final BitSet FOLLOW_57_in_parse_art_group_InstanceGroup4571 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_InstanceGroup4591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4617 = new BitSet(new long[]{0x01402B1002080000L});
    public static final BitSet FOLLOW_36_in_parse_art_group_InstanceGroup4663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4697 = new BitSet(new long[]{0x01402B1002080000L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup4793 = new BitSet(new long[]{0x01402B0002080000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_InstanceGroup4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_parse_art_type_BasicAttribute4903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute4921 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_BasicAttribute4942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute4960 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parse_art_type_BasicAttribute4990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_parse_art_type_Dictionary5077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5095 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Dictionary5116 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Dictionary5130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5148 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_Dictionary5169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5187 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Dictionary5208 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parse_art_type_Dictionary5231 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_Dictionary5251 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5284 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_Dictionary5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_type_DictionaryDefaultValue5372 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5390 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5446 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortId5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_PortCollection5565 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_art_type_PortCollection5586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortCollection5604 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_PortCollection5625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PortCollection5643 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_PortCollection5664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection5682 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_36_in_parse_art_type_PortCollection5709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_PortId_in_parse_art_type_PortCollection5735 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_PortCollection5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_AbstractPort6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PortCollection_in_parse_art_type_AbstractPort6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6080 = new BitSet(new long[]{0x0000000000000002L});

}