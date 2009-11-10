// $ANTLR 3.1.1

	package art.resource.art.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class ArtParser extends ArtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "T_INSTANCE_STATE", "STRING_LITERAL", "T_PORT_KIND", "T_OPTIONAL", "MULTIPLICITY", "T_IMPLEM", "SL_COMMENT", "ML_COMMENT", "ANNOTATION", "WHITESPACE", "LINEBREAKS", "'system'", "';'", "'root'", "'datatype'", "'primitive'", "'instance'", "':'", "'implementation'", "'{'", "'}'", "'composite'", "'bind'", "'to'", "'::'", "'('", "'id'", "'='", "')'", "'delegate'", "':='", "','", "'['", "'->'", "']'", "'type'", "'compositetype'", "'operation'", "'functional'", "'service'", "'control'", "'port'", "'..'", "'FractalComponent'", "'<'", "'controllerDesc'", "'contentDesc'", "'>'", "'OSGiComponent'", "'OSGiPort'", "'typegroup'", "'types'", "'instancegroup'", "'instances'", "'attribute'", "'default'"
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
    public static final int T__60=60;
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
            this.state.ruleMemo = new HashMap[85+1];
             
             
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
    	private boolean reachedIndex = false;
    	private java.util.List<art.resource.art.IArtExpectedElement> expectedElements = new java.util.ArrayList<art.resource.art.IArtExpectedElement>();
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	//helper lists to allow a lexer to pass errors to its parser
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private java.util.Collection<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>> postParseCommands;
    	private boolean terminateParsing;
    	
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
    	
    	public void addExpectedElement(art.resource.art.IArtExpectedElement expectedElement, java.lang.String message) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		if (this.reachedIndex) {
    			return;
    		}
    		int currentIndex = java.lang.Math.max(0, input.index());
    		//System.out.println("addExpectedElement() currentIndex = " + currentIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			//System.out.println("addExpectedElement() index = " + index);
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
    			//System.out.println("addExpectedElement() tokenAtIndex = " + tokenAtIndex);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    		System.out.println("Adding expected element (" + message + "): " + expectedElement + "");
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
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				art.resource.art.IArtLocationMap locationMap = resource.getLocationMap();
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
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				art.resource.art.IArtLocationMap locationMap = resource.getLocationMap();
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
    			if (type.getInstanceClass() == art.implem.OSGiPort.class) {
    				return parse_art_implem_OSGiPort();
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
    	
    	public java.util.List<art.resource.art.IArtExpectedElement> parseToExpectedElements(org.eclipse.emf.ecore.EClass type) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		parse();
    		return this.expectedElements;
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



    // $ANTLR start "start"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:452:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_art_System ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        art.System c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:453:1: ( (c0= parse_art_System ) EOF )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:454:2: (c0= parse_art_System ) EOF
            {
            if ( state.backtracking==0 ) {

              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:456:2: (c0= parse_art_System )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:457:3: c0= parse_art_System
            {
            if ( state.backtracking==0 ) {

              		
            }
            pushFollow(FOLLOW_parse_art_System_in_start86);
            c0=parse_art_System();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start93); if (state.failed) return element;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:464:1: parse_art_System returns [art.System element = null] : a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )* ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:467:1: (a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )* )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:468:2: a0= 'system' (a1= TEXT ) a2= ';' a3= 'root' (a4_0= parse_art_instance_CompositeInstance ) ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,16,FOLLOW_16_in_parse_art_System119); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:482:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:483:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_System137); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_System158); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_art_System172); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createSystem();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:535:2: (a4_0= parse_art_instance_CompositeInstance )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:536:3: a4_0= parse_art_instance_CompositeInstance
            {
            pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_System190);
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:555:2: ( ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||(LA2_0>=40 && LA2_0<=41)||LA2_0==43||LA2_0==45||LA2_0==55||LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:556:3: ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:559:3: ( ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:560:4: ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:563:4: ( (a5_0= parse_art_type_Service ) | (a6_0= parse_art_type_ComponentType ) | (a7_0= parse_art_DataType ) | (a8_0= parse_art_group_Group ) )
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
            	    case 55:
            	    case 57:
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:564:5: (a5_0= parse_art_type_Service )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:567:5: (a5_0= parse_art_type_Service )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:568:6: a5_0= parse_art_type_Service
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Service_in_parse_art_System245);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a5_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:585:10: (a6_0= parse_art_type_ComponentType )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:588:5: (a6_0= parse_art_type_ComponentType )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:589:6: a6_0= parse_art_type_ComponentType
            	            {
            	            pushFollow(FOLLOW_parse_art_type_ComponentType_in_parse_art_System295);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a6_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:606:10: (a7_0= parse_art_DataType )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:609:5: (a7_0= parse_art_DataType )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:610:6: a7_0= parse_art_DataType
            	            {
            	            pushFollow(FOLLOW_parse_art_DataType_in_parse_art_System345);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a7_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:627:10: (a8_0= parse_art_group_Group )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:630:5: (a8_0= parse_art_group_Group )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:631:6: a8_0= parse_art_group_Group
            	            {
            	            pushFollow(FOLLOW_parse_art_group_Group_in_parse_art_System395);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a8_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:657:1: parse_art_DataType returns [art.DataType element = null] : a0= 'datatype' (a1= TEXT ) a2= ';' ;
    public final art.DataType parse_art_DataType() throws RecognitionException {
        art.DataType element =  null;
        int parse_art_DataType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:660:1: (a0= 'datatype' (a1= TEXT ) a2= ';' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:661:2: a0= 'datatype' (a1= TEXT ) a2= ';'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,19,FOLLOW_19_in_parse_art_DataType461); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:675:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:676:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_DataType479); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_art_DataType500); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.ArtFactory.eINSTANCE.createDataType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:716:1: parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null] : a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:719:1: (a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:720:2: a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )* a11= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,20,FOLLOW_20_in_parse_art_instance_PrimitiveInstance529); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_PrimitiveInstance543); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:745:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:746:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance561); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_PrimitiveInstance582); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:787:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:788:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance600); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              				copyLocalizationInfos((CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:822:2: (a5= T_INSTANCE_STATE )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:823:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance625); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:853:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:854:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:857:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:858:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_PrimitiveInstance664); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:872:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:873:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance690);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a7_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a8=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_PrimitiveInstance726); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:906:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:907:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:910:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:911:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:914:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) )
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:915:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:918:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:919:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance777);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a9_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:936:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:939:5: (a10_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:940:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance827);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a10_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a11=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_PrimitiveInstance878); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a11, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:977:1: parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null] : a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:980:1: (a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:981:2: a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? a8= '{' ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )* a13= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_CompositeInstance907); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_CompositeInstance921); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1006:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1007:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance939); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_CompositeInstance960); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1048:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1049:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance978); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              				copyLocalizationInfos((CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1083:2: (a5= T_INSTANCE_STATE )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1084:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1003); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a5, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1114:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1115:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1118:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1119:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_CompositeInstance1042); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1133:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1134:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1068);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a7_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a8=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_CompositeInstance1104); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1167:2: ( ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==TEXT||LA8_0==20||(LA8_0>=26 && LA8_0<=27)||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1168:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1171:3: ( ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1172:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1175:4: ( (a9_0= parse_art_instance_AttributeInstance ) | (a10_0= parse_art_instance_TransmissionBinding ) | (a11_0= parse_art_instance_ComponentInstance ) | (a12_0= parse_art_instance_DelegationBinding ) )
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1176:5: (a9_0= parse_art_instance_AttributeInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1179:5: (a9_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1180:6: a9_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1155);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a9_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1197:10: (a10_0= parse_art_instance_TransmissionBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1200:5: (a10_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1201:6: a10_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1205);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a10_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1218:10: (a11_0= parse_art_instance_ComponentInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1221:5: (a11_0= parse_art_instance_ComponentInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1222:6: a11_0= parse_art_instance_ComponentInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1255);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a11_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1239:10: (a12_0= parse_art_instance_DelegationBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1242:5: (a12_0= parse_art_instance_DelegationBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1243:6: a12_0= parse_art_instance_DelegationBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1305);
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
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a12_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a13=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_CompositeInstance1356); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a13, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1280:1: parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null] : a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1283:1: (a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1284:2: a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,27,FOLLOW_27_in_parse_art_instance_TransmissionBinding1385); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1298:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1299:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1403); if (state.failed) return element;
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
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.Port>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              				copyLocalizationInfos((CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_TransmissionBinding1424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1344:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1345:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1442); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              				copyLocalizationInfos((CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_TransmissionBinding1463); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1390:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1391:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1481); if (state.failed) return element;
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
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.TransmissionBinding, art.type.Port>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a5, element);
              				copyLocalizationInfos((CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1425:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1426:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1429:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1430:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_TransmissionBinding1520); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a7=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_TransmissionBinding1540); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_TransmissionBinding1560); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1466:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1467:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1586); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a10=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_TransmissionBinding1619); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a10, element);
                      			
                    }

                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1510:1: parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null] : a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1513:1: (a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1514:2: a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_DelegationBinding1662); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1528:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1529:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1680); if (state.failed) return element;
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
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.Port>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              				copyLocalizationInfos((CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_DelegationBinding1701); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1574:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1575:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1719); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              				copyLocalizationInfos((CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_DelegationBinding1740); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1620:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1621:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1758); if (state.failed) return element;
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
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.DelegationBinding, art.type.Port>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a5, element);
              				copyLocalizationInfos((CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1655:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1656:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1659:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1660:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_DelegationBinding1797); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a7=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_DelegationBinding1817); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_DelegationBinding1837); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1696:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1697:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding1863); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a9, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a10=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_DelegationBinding1896); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a10, element);
                      			
                    }

                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1740:1: parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null] : (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) ;
    public final art.instance.ValuedAttribute parse_art_instance_ValuedAttribute() throws RecognitionException {
        art.instance.ValuedAttribute element =  null;
        int parse_art_instance_ValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1743:1: ( (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1744:2: (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1747:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1748:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute1943); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              				copyLocalizationInfos((CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_ValuedAttribute1964); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1793:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1794:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute1982); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1823:1: parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null] : (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1826:1: ( (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1827:2: (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1830:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1831:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2022); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              				copyLocalizationInfos((CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_DictionaryValuedAttribute2043); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1876:2: ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1877:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1880:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1881:4: (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1884:4: (a2_0= parse_art_instance_Entry )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1885:5: a2_0= parse_art_instance_Entry
                    {
                    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2081);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a2_0, element); 					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1904:4: ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==36) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1905:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1908:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1909:6: a3= ',' (a4_0= parse_art_instance_Entry )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a3=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2135); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a3, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1923:6: (a4_0= parse_art_instance_Entry )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1924:7: a4_0= parse_art_instance_Entry
                    	    {
                    	    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2169);
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
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos(a4_0, element); 							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected element after STAR or PLUS
                      			
                    }

                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1951:1: parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null] : a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1954:1: (a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1955:2: a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_DefaultEntry2251); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1969:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1970:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2269); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              				copyLocalizationInfos((CommonToken) a1, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_DefaultEntry2290); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2015:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2016:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2308); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_DefaultEntry2329); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2056:1: parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null] : a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2059:1: (a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2060:2: a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_OtherEntry2358); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2074:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2075:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2376); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_OtherEntry2397); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2116:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2117:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2415); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_OtherEntry2436); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2157:1: parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null] : a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
    public final art.type.PrimitiveType parse_art_type_PrimitiveType() throws RecognitionException {
        art.type.PrimitiveType element =  null;
        int parse_art_type_PrimitiveType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a7=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.Port a5_0 = null;

        art.type.Attribute a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2160:1: (a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2161:2: a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,40,FOLLOW_40_in_parse_art_type_PrimitiveType2465); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2175:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2176:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType2483); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2206:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2207:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2210:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2211:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_art_type_PrimitiveType2522); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2225:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2226:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2548);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,24,FOLLOW_24_in_parse_art_type_PrimitiveType2584); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2259:2: ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==T_PORT_KIND||LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2260:3: ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2263:3: ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==T_PORT_KIND) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==59) ) {
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2264:4: (a5_0= parse_art_type_Port )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2267:4: (a5_0= parse_art_type_Port )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2268:5: a5_0= parse_art_type_Port
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_PrimitiveType2622);
            	            a5_0=parse_art_type_Port();

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
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a5_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2285:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2288:4: (a6_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2289:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2664);
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
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a6_0, element); 					}
            	              				
            	            }

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

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a7=(Token)match(input,25,FOLLOW_25_in_parse_art_type_PrimitiveType2703); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a7, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2324:1: parse_art_type_CompositeType returns [art.type.CompositeType element = null] : a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' ;
    public final art.type.CompositeType parse_art_type_CompositeType() throws RecognitionException {
        art.type.CompositeType element =  null;
        int parse_art_type_CompositeType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a7=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.Port a5_0 = null;

        art.type.Attribute a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2327:1: (a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2328:2: a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? a4= '{' ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )* a7= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,41,FOLLOW_41_in_parse_art_type_CompositeType2732); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2342:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2343:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType2750); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2373:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2374:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2377:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2378:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,23,FOLLOW_23_in_parse_art_type_CompositeType2789); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2392:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2393:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2815);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,24,FOLLOW_24_in_parse_art_type_CompositeType2851); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2426:2: ( ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==T_PORT_KIND||LA18_0==59) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2427:3: ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2430:3: ( (a5_0= parse_art_type_Port ) | (a6_0= parse_art_type_Attribute ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==T_PORT_KIND) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==59) ) {
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2431:4: (a5_0= parse_art_type_Port )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2434:4: (a5_0= parse_art_type_Port )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2435:5: a5_0= parse_art_type_Port
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_CompositeType2889);
            	            a5_0=parse_art_type_Port();

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
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a5_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2452:8: (a6_0= parse_art_type_Attribute )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2455:4: (a6_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2456:5: a6_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType2931);
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
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a6_0, element); 					}
            	              				
            	            }

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

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a7=(Token)match(input,25,FOLLOW_25_in_parse_art_type_CompositeType2970); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a7, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2491:1: parse_art_type_Operation returns [art.type.Operation element = null] : a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2494:1: (a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )* )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2495:2: a0= 'operation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_art_type_Parameter ) ) )? ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )* a6= ')' ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )? ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,42,FOLLOW_42_in_parse_art_type_Operation2999); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2509:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2510:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Operation3017); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,30,FOLLOW_30_in_parse_art_type_Operation3038); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2551:2: ( ( (a3_0= parse_art_type_Parameter ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TEXT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2552:3: ( (a3_0= parse_art_type_Parameter ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2555:3: ( (a3_0= parse_art_type_Parameter ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2556:4: (a3_0= parse_art_type_Parameter )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2559:4: (a3_0= parse_art_type_Parameter )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2560:5: a3_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3076);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a3_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2582:2: ( (a4= ',' (a5_0= parse_art_type_Parameter ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2583:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2586:3: (a4= ',' (a5_0= parse_art_type_Parameter ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2587:4: a4= ',' (a5_0= parse_art_type_Parameter )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a CsString
            	      			
            	    }
            	    a4=(Token)match(input,36,FOLLOW_36_in_parse_art_type_Operation3130); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2601:4: (a5_0= parse_art_type_Parameter )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2602:5: a5_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3156);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a5_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a6=(Token)match(input,33,FOLLOW_33_in_parse_art_type_Operation3195); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2638:2: ( (a7= ':' (a8_0= parse_art_type_Parameter ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2639:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2642:3: (a7= ':' (a8_0= parse_art_type_Parameter ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2643:4: a7= ':' (a8_0= parse_art_type_Parameter )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a7=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Operation3227); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createOperation();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a7, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2657:4: (a8_0= parse_art_type_Parameter )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2658:5: a8_0= parse_art_type_Parameter
                    {
                    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3253);
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a8_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2680:2: ( (a9= ',' (a10_0= parse_art_type_Parameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2681:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2684:3: (a9= ',' (a10_0= parse_art_type_Parameter ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2685:4: a9= ',' (a10_0= parse_art_type_Parameter )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a CsString
            	      			
            	    }
            	    a9=(Token)match(input,36,FOLLOW_36_in_parse_art_type_Operation3307); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a9, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2699:4: (a10_0= parse_art_type_Parameter )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2700:5: a10_0= parse_art_type_Parameter
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3333);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a10_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2724:1: parse_art_type_Parameter returns [art.type.Parameter element = null] : (a0= TEXT ) (a1= TEXT ) ;
    public final art.type.Parameter parse_art_type_Parameter() throws RecognitionException {
        art.type.Parameter element =  null;
        int parse_art_type_Parameter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2727:1: ( (a0= TEXT ) (a1= TEXT ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2728:2: (a0= TEXT ) (a1= TEXT )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2731:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2732:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3391); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              				copyLocalizationInfos((CommonToken) a0, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2766:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2767:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter3416); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2796:1: parse_art_type_FunctionalService returns [art.type.FunctionalService element = null] : a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2799:1: (a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2800:2: a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,43,FOLLOW_43_in_parse_art_type_FunctionalService3452); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,44,FOLLOW_44_in_parse_art_type_FunctionalService3466); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2825:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2826:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_FunctionalService3484); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_art_type_FunctionalService3505); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2867:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2868:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2871:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2872:4: (a4_0= parse_art_type_Operation )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2875:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2876:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3543);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a4_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,25,FOLLOW_25_in_parse_art_type_FunctionalService3582); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2911:1: parse_art_type_ControlService returns [art.type.ControlService element = null] : a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2914:1: (a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2915:2: a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,45,FOLLOW_45_in_parse_art_type_ControlService3611); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,44,FOLLOW_44_in_parse_art_type_ControlService3625); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2940:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2941:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_ControlService3643); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_art_type_ControlService3664); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2982:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2983:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2986:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2987:4: (a4_0= parse_art_type_Operation )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2990:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2991:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3702);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a4_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,25,FOLLOW_25_in_parse_art_type_ControlService3741); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createControlService();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3026:1: parse_art_type_Port returns [art.type.Port element = null] : (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )? ;
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
        art.implem.PortImplementation a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3029:1: ( (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3030:2: (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= MULTIPLICITY ) a8= '..' (a9= MULTIPLICITY ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3033:2: (a0= T_PORT_KIND )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3034:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_Port3774); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3064:2: ( ( (a1= T_OPTIONAL ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==T_OPTIONAL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3065:3: ( (a1= T_OPTIONAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3068:3: ( (a1= T_OPTIONAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3069:4: (a1= T_OPTIONAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3072:4: (a1= T_OPTIONAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3073:5: a1= T_OPTIONAL
                    {
                    a1=(Token)match(input,T_OPTIONAL,FOLLOW_T_OPTIONAL_in_parse_art_type_Port3819); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a1, element);
                      					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,46,FOLLOW_46_in_parse_art_type_Port3860); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3117:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3118:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3878); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Port3899); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3159:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3160:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port3917); if (state.failed) return element;
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
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.Port, art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__SERVICE), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a5, element);
              				copyLocalizationInfos((CommonToken) a5, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a6=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Port3938); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3205:2: (a7= MULTIPLICITY )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3206:3: a7= MULTIPLICITY
            {
            a7=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port3956); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a7, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a8=(Token)match(input,47,FOLLOW_47_in_parse_art_type_Port3977); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3247:2: (a9= MULTIPLICITY )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3248:3: a9= MULTIPLICITY
            {
            a9=(Token)match(input,MULTIPLICITY,FOLLOW_MULTIPLICITY_in_parse_art_type_Port3995); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a9, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a10=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Port4016); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a10, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3289:2: ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3290:3: (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3293:3: (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3294:4: a11= 'implementation' (a12_0= parse_art_implem_PortImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a11=(Token)match(input,23,FOLLOW_23_in_parse_art_type_Port4048); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPort();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3308:4: (a12_0= parse_art_implem_PortImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3309:5: a12_0= parse_art_implem_PortImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_PortImplementation_in_parse_art_type_Port4074);
                    a12_0=parse_art_implem_PortImplementation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPort();
                      					}
                      					if (a12_0 != null) {
                      						if (a12_0 != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PORT__IMPLEM), a12_0);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos(a12_0, element); 					}
                      				
                    }

                    }


                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3330:1: parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null] : a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3333:1: (a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3334:2: a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,48,FOLLOW_48_in_parse_art_implem_FractalComponent4125); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,49,FOLLOW_49_in_parse_art_implem_FractalComponent4139); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,50,FOLLOW_50_in_parse_art_implem_FractalComponent4153); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_FractalComponent4167); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3381:2: (a4= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3382:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4185); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_FractalComponent4206); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a6=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_FractalComponent4220); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3434:2: (a7= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3435:3: a7= STRING_LITERAL
            {
            a7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4238); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a7, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a8=(Token)match(input,52,FOLLOW_52_in_parse_art_implem_FractalComponent4259); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a8, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3475:1: parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null] : a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) ;
    public final art.implem.OSGiComponent parse_art_implem_OSGiComponent() throws RecognitionException {
        art.implem.OSGiComponent element =  null;
        int parse_art_implem_OSGiComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3478:1: (a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3479:2: a0= 'OSGiComponent' a1= ':' (a2= STRING_LITERAL )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,53,FOLLOW_53_in_parse_art_implem_OSGiComponent4288); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_OSGiComponent4302); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3504:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3505:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4320); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

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


    // $ANTLR start "parse_art_implem_OSGiPort"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3534:1: parse_art_implem_OSGiPort returns [art.implem.OSGiPort element = null] : a0= 'OSGiPort' a1= ':' (a2= STRING_LITERAL ) ;
    public final art.implem.OSGiPort parse_art_implem_OSGiPort() throws RecognitionException {
        art.implem.OSGiPort element =  null;
        int parse_art_implem_OSGiPort_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3537:1: (a0= 'OSGiPort' a1= ':' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3538:2: a0= 'OSGiPort' a1= ':' (a2= STRING_LITERAL )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_OSGiPort4356); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_art_implem_OSGiPort4370); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3563:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3564:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiPort4388); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_PORT__SERVICE_ID), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_PORT__SERVICE_ID), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_art_implem_OSGiPort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiPort"


    // $ANTLR start "parse_art_group_TypeGroup"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3593:1: parse_art_group_TypeGroup returns [art.group.TypeGroup element = null] : a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3596:1: (a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3597:2: a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,55,FOLLOW_55_in_parse_art_group_TypeGroup4424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3611:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3612:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4442); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,24,FOLLOW_24_in_parse_art_group_TypeGroup4463); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3653:2: ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3654:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3657:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3658:4: a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a3=(Token)match(input,56,FOLLOW_56_in_parse_art_group_TypeGroup4495); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_art_group_TypeGroup4515); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3683:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3684:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4541); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a5, element);
                      						copyLocalizationInfos((CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3718:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==36) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3719:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3722:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3723:6: a6= ',' (a7= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a6=(Token)match(input,36,FOLLOW_36_in_parse_art_group_TypeGroup4600); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3737:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3738:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup4634); if (state.failed) return element;
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
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a7, element);
                    	      								copyLocalizationInfos((CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected element after STAR or PLUS
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3781:2: ( ( (a8_0= parse_art_group_TypeGroup ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==55) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3782:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3785:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3786:4: (a8_0= parse_art_group_TypeGroup )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3789:4: (a8_0= parse_art_group_TypeGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3790:5: a8_0= parse_art_group_TypeGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4732);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a8_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_group_TypeGroup4771); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a9, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3825:1: parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null] : a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3828:1: (a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3829:2: a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,57,FOLLOW_57_in_parse_art_group_InstanceGroup4800); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3843:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3844:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4818); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,24,FOLLOW_24_in_parse_art_group_InstanceGroup4839); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3885:2: ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3886:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3889:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3890:4: a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a3=(Token)match(input,58,FOLLOW_58_in_parse_art_group_InstanceGroup4871); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_art_group_InstanceGroup4891); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3915:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3916:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup4917); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a5, element);
                      						copyLocalizationInfos((CommonToken) a5, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3950:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==36) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3951:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3954:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3955:6: a6= ',' (a7= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a6=(Token)match(input,36,FOLLOW_36_in_parse_art_group_InstanceGroup4976); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a6, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3969:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3970:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup5010); if (state.failed) return element;
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
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a7, element);
                    	      								copyLocalizationInfos((CommonToken) a7, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected element after STAR or PLUS
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4013:2: ( ( (a8_0= parse_art_group_InstanceGroup ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==57) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4014:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4017:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4018:4: (a8_0= parse_art_group_InstanceGroup )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4021:4: (a8_0= parse_art_group_InstanceGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4022:5: a8_0= parse_art_group_InstanceGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup5108);
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
            	      						}
            	      						collectHiddenTokens(element);
            	      						copyLocalizationInfos(a8_0, element); 					}
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_group_InstanceGroup5147); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a9, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4057:1: parse_art_implem_OSGiType returns [art.implem.OSGiType element = null] : (a0= T_IMPLEM ) ;
    public final art.implem.OSGiType parse_art_implem_OSGiType() throws RecognitionException {
        art.implem.OSGiType element =  null;
        int parse_art_implem_OSGiType_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4060:1: ( (a0= T_IMPLEM ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4061:2: (a0= T_IMPLEM )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4064:2: (a0= T_IMPLEM )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4065:3: a0= T_IMPLEM
            {
            a0=(Token)match(input,T_IMPLEM,FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType5180); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4094:1: parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4097:1: (a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4098:2: a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,59,FOLLOW_59_in_parse_art_type_BasicAttribute5216); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4112:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4113:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute5234); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_BasicAttribute5255); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4154:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4155:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute5273); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a3, element);
              				copyLocalizationInfos((CommonToken) a3, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4189:2: ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4190:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4193:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4194:4: a4= 'default' (a5= STRING_LITERAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,60,FOLLOW_60_in_parse_art_type_BasicAttribute5312); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4208:4: (a5= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4209:5: a5= STRING_LITERAL
                    {
                    a5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5338); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a5, element);
                      					}
                      				
                    }

                    }


                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4241:1: parse_art_type_Dictionary returns [art.type.Dictionary element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4244:1: (a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4245:2: a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,59,FOLLOW_59_in_parse_art_type_Dictionary5394); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4259:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4260:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5412); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Dictionary5433); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Dictionary5447); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4312:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4313:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5465); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              				copyLocalizationInfos((CommonToken) a4, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,38,FOLLOW_38_in_parse_art_type_Dictionary5486); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4358:2: (a6= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4359:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary5504); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a6, element);
              				copyLocalizationInfos((CommonToken) a6, proxy);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a7=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Dictionary5525); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4404:2: ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==60) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4405:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4408:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4409:4: a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,60,FOLLOW_60_in_parse_art_type_Dictionary5557); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a9=(Token)match(input,24,FOLLOW_24_in_parse_art_type_Dictionary5577); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4434:4: ( (a10_0= parse_art_type_DictionaryDefaultValue ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==37) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4435:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Terminal
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4438:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4439:6: a10_0= parse_art_type_DictionaryDefaultValue
                    	    {
                    	    pushFollow(FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5616);
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
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							copyLocalizationInfos(a10_0, element); 						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected element after STAR or PLUS
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a11=(Token)match(input,25,FOLLOW_25_in_parse_art_type_Dictionary5661); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionary();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a11, element);
                      			
                    }

                    }


                    }
                    break;

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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4475:1: parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null] : a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4478:1: (a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4479:2: a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_type_DictionaryDefaultValue5704); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4493:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4494:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5722); if (state.failed) return element;
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
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4524:2: ( (a2= '->' (a3= STRING_LITERAL ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4525:3: (a2= '->' (a3= STRING_LITERAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4528:3: (a2= '->' (a3= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4529:4: a2= '->' (a3= STRING_LITERAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,38,FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5761); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4543:4: (a3= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4544:5: a3= STRING_LITERAL
                    {
                    a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5787); if (state.failed) return element;
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
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a3, element);
                      					}
                      				
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5828); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
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


    // $ANTLR start "parse_art_type_Service"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4587:1: parse_art_type_Service returns [art.type.Service element = null] : (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService );
    public final art.type.Service parse_art_type_Service() throws RecognitionException {
        art.type.Service element =  null;
        int parse_art_type_Service_StartIndex = input.index();
        art.type.FunctionalService c0 = null;

        art.type.ControlService c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4588:1: (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4589:2: c0= parse_art_type_FunctionalService
                    {
                    pushFollow(FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service5850);
                    c0=parse_art_type_FunctionalService();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4590:4: c1= parse_art_type_ControlService
                    {
                    pushFollow(FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service5860);
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
            if ( state.backtracking>0 ) { memoize(input, 28, parse_art_type_Service_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Service"


    // $ANTLR start "parse_art_type_ComponentType"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4594:1: parse_art_type_ComponentType returns [art.type.ComponentType element = null] : (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType );
    public final art.type.ComponentType parse_art_type_ComponentType() throws RecognitionException {
        art.type.ComponentType element =  null;
        int parse_art_type_ComponentType_StartIndex = input.index();
        art.type.PrimitiveType c0 = null;

        art.type.CompositeType c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4595:1: (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4596:2: c0= parse_art_type_PrimitiveType
                    {
                    pushFollow(FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType5881);
                    c0=parse_art_type_PrimitiveType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4597:4: c1= parse_art_type_CompositeType
                    {
                    pushFollow(FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType5891);
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
            if ( state.backtracking>0 ) { memoize(input, 29, parse_art_type_ComponentType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_ComponentType"


    // $ANTLR start "parse_art_group_Group"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4601:1: parse_art_group_Group returns [art.group.Group element = null] : (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup );
    public final art.group.Group parse_art_group_Group() throws RecognitionException {
        art.group.Group element =  null;
        int parse_art_group_Group_StartIndex = input.index();
        art.group.TypeGroup c0 = null;

        art.group.InstanceGroup c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4602:1: (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            else if ( (LA39_0==57) ) {
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4603:2: c0= parse_art_group_TypeGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group5912);
                    c0=parse_art_group_TypeGroup();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4604:4: c1= parse_art_group_InstanceGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group5922);
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
            if ( state.backtracking>0 ) { memoize(input, 30, parse_art_group_Group_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_group_Group"


    // $ANTLR start "parse_art_implem_ComponentImplementation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4608:1: parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null] : (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent );
    public final art.implem.ComponentImplementation parse_art_implem_ComponentImplementation() throws RecognitionException {
        art.implem.ComponentImplementation element =  null;
        int parse_art_implem_ComponentImplementation_StartIndex = input.index();
        art.implem.FractalComponent c0 = null;

        art.implem.OSGiComponent c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4609:1: (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4610:2: c0= parse_art_implem_FractalComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation5943);
                    c0=parse_art_implem_FractalComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4611:4: c1= parse_art_implem_OSGiComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation5953);
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
            if ( state.backtracking>0 ) { memoize(input, 31, parse_art_implem_ComponentImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_ComponentImplementation"


    // $ANTLR start "parse_art_instance_AttributeInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4615:1: parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null] : (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute );
    public final art.instance.AttributeInstance parse_art_instance_AttributeInstance() throws RecognitionException {
        art.instance.AttributeInstance element =  null;
        int parse_art_instance_AttributeInstance_StartIndex = input.index();
        art.instance.ValuedAttribute c0 = null;

        art.instance.DictionaryValuedAttribute c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4616:1: (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4617:2: c0= parse_art_instance_ValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance5974);
                    c0=parse_art_instance_ValuedAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4618:4: c1= parse_art_instance_DictionaryValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance5984);
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
            if ( state.backtracking>0 ) { memoize(input, 32, parse_art_instance_AttributeInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_AttributeInstance"


    // $ANTLR start "parse_art_instance_ComponentInstance"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4622:1: parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null] : (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance );
    public final art.instance.ComponentInstance parse_art_instance_ComponentInstance() throws RecognitionException {
        art.instance.ComponentInstance element =  null;
        int parse_art_instance_ComponentInstance_StartIndex = input.index();
        art.instance.PrimitiveInstance c0 = null;

        art.instance.CompositeInstance c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4623:1: (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4624:2: c0= parse_art_instance_PrimitiveInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance6005);
                    c0=parse_art_instance_PrimitiveInstance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4625:4: c1= parse_art_instance_CompositeInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance6015);
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
            if ( state.backtracking>0 ) { memoize(input, 33, parse_art_instance_ComponentInstance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_ComponentInstance"


    // $ANTLR start "parse_art_instance_Entry"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4629:1: parse_art_instance_Entry returns [art.instance.Entry element = null] : (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry );
    public final art.instance.Entry parse_art_instance_Entry() throws RecognitionException {
        art.instance.Entry element =  null;
        int parse_art_instance_Entry_StartIndex = input.index();
        art.instance.DefaultEntry c0 = null;

        art.instance.OtherEntry c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4630:1: (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry )
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4631:2: c0= parse_art_instance_DefaultEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry6036);
                    c0=parse_art_instance_DefaultEntry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4632:4: c1= parse_art_instance_OtherEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry6046);
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
            if ( state.backtracking>0 ) { memoize(input, 34, parse_art_instance_Entry_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_instance_Entry"


    // $ANTLR start "parse_art_implem_TypeImplementation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4636:1: parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null] : c0= parse_art_implem_OSGiType ;
    public final art.implem.TypeImplementation parse_art_implem_TypeImplementation() throws RecognitionException {
        art.implem.TypeImplementation element =  null;
        int parse_art_implem_TypeImplementation_StartIndex = input.index();
        art.implem.OSGiType c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4637:1: (c0= parse_art_implem_OSGiType )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4638:2: c0= parse_art_implem_OSGiType
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6067);
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
            if ( state.backtracking>0 ) { memoize(input, 35, parse_art_implem_TypeImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_TypeImplementation"


    // $ANTLR start "parse_art_type_Attribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4642:1: parse_art_type_Attribute returns [art.type.Attribute element = null] : (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary );
    public final art.type.Attribute parse_art_type_Attribute() throws RecognitionException {
        art.type.Attribute element =  null;
        int parse_art_type_Attribute_StartIndex = input.index();
        art.type.BasicAttribute c0 = null;

        art.type.Dictionary c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4643:1: (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==59) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==TEXT) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==22) ) {
                        int LA44_3 = input.LA(4);

                        if ( (LA44_3==TEXT) ) {
                            alt44=1;
                        }
                        else if ( (LA44_3==37) ) {
                            alt44=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 44, 3, input);

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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4644:2: c0= parse_art_type_BasicAttribute
                    {
                    pushFollow(FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6088);
                    c0=parse_art_type_BasicAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4645:4: c1= parse_art_type_Dictionary
                    {
                    pushFollow(FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6098);
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
            if ( state.backtracking>0 ) { memoize(input, 36, parse_art_type_Attribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_type_Attribute"


    // $ANTLR start "parse_art_implem_PortImplementation"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4649:1: parse_art_implem_PortImplementation returns [art.implem.PortImplementation element = null] : c0= parse_art_implem_OSGiPort ;
    public final art.implem.PortImplementation parse_art_implem_PortImplementation() throws RecognitionException {
        art.implem.PortImplementation element =  null;
        int parse_art_implem_PortImplementation_StartIndex = input.index();
        art.implem.OSGiPort c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4650:1: (c0= parse_art_implem_OSGiPort )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4651:2: c0= parse_art_implem_OSGiPort
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiPort_in_parse_art_implem_PortImplementation6119);
            c0=parse_art_implem_OSGiPort();

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
            if ( state.backtracking>0 ) { memoize(input, 37, parse_art_implem_PortImplementation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_PortImplementation"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_art_System_in_start86 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_art_System119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_System137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_System158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_art_System172 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_System190 = new BitSet(new long[]{0x02802B0000080002L});
    public static final BitSet FOLLOW_parse_art_type_Service_in_parse_art_System245 = new BitSet(new long[]{0x02802B0000080002L});
    public static final BitSet FOLLOW_parse_art_type_ComponentType_in_parse_art_System295 = new BitSet(new long[]{0x02802B0000080002L});
    public static final BitSet FOLLOW_parse_art_DataType_in_parse_art_System345 = new BitSet(new long[]{0x02802B0000080002L});
    public static final BitSet FOLLOW_parse_art_group_Group_in_parse_art_System395 = new BitSet(new long[]{0x02802B0000080002L});
    public static final BitSet FOLLOW_19_in_parse_art_DataType461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_DataType479 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_DataType500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_art_instance_PrimitiveInstance529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_PrimitiveInstance543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance561 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_PrimitiveInstance582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance625 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_PrimitiveInstance664 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_PrimitiveInstance726 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance777 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance827 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_PrimitiveInstance878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_CompositeInstance907 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_CompositeInstance921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance939 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_CompositeInstance960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1003 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_CompositeInstance1042 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1068 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_CompositeInstance1104 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1155 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1205 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1255 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1305 = new BitSet(new long[]{0x000000040E100010L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_CompositeInstance1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_art_instance_TransmissionBinding1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1403 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_TransmissionBinding1424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1442 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_TransmissionBinding1463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1481 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_TransmissionBinding1520 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_TransmissionBinding1540 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_TransmissionBinding1560 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding1586 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_TransmissionBinding1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_DelegationBinding1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1680 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_DelegationBinding1701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1719 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_DelegationBinding1740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding1758 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_DelegationBinding1797 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_DelegationBinding1817 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_DelegationBinding1837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding1863 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_DelegationBinding1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute1943 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_ValuedAttribute1964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2022 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_DictionaryValuedAttribute2043 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2081 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2135 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2169 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_DefaultEntry2251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2269 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_DefaultEntry2290 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2308 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_DefaultEntry2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_OtherEntry2358 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2376 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_OtherEntry2397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2415 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_OtherEntry2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_art_type_PrimitiveType2465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType2483 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_PrimitiveType2522 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType2548 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_PrimitiveType2584 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_PrimitiveType2622 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType2664 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_25_in_parse_art_type_PrimitiveType2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_art_type_CompositeType2732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType2750 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_CompositeType2789 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType2815 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_CompositeType2851 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_CompositeType2889 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType2931 = new BitSet(new long[]{0x0800000002000080L});
    public static final BitSet FOLLOW_25_in_parse_art_type_CompositeType2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_art_type_Operation2999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Operation3017 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_type_Operation3038 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3076 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_36_in_parse_art_type_Operation3130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3156 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_type_Operation3195 = new BitSet(new long[]{0x0000001000400002L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Operation3227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3253 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_parse_art_type_Operation3307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation3333 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_art_type_FunctionalService3452 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_FunctionalService3466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_FunctionalService3484 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_FunctionalService3505 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService3543 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_FunctionalService3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_art_type_ControlService3611 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_ControlService3625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_ControlService3643 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_ControlService3664 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService3702 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_ControlService3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_Port3774 = new BitSet(new long[]{0x0000400000000100L});
    public static final BitSet FOLLOW_T_OPTIONAL_in_parse_art_type_Port3819 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_art_type_Port3860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3878 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Port3899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port3917 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Port3938 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port3956 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_art_type_Port3977 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MULTIPLICITY_in_parse_art_type_Port3995 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Port4016 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parse_art_type_Port4048 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_PortImplementation_in_parse_art_type_Port4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_art_implem_FractalComponent4125 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_art_implem_FractalComponent4139 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_art_implem_FractalComponent4153 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_FractalComponent4167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4185 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_FractalComponent4206 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_FractalComponent4220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent4238 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_art_implem_FractalComponent4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_parse_art_implem_OSGiComponent4288 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_OSGiComponent4302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_OSGiPort4356 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_implem_OSGiPort4370 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiPort4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_parse_art_group_TypeGroup4424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4442 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_TypeGroup4463 = new BitSet(new long[]{0x0180000002000000L});
    public static final BitSet FOLLOW_56_in_parse_art_group_TypeGroup4495 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_TypeGroup4515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4541 = new BitSet(new long[]{0x0080001002000000L});
    public static final BitSet FOLLOW_36_in_parse_art_group_TypeGroup4600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup4634 = new BitSet(new long[]{0x0080001002000000L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup4732 = new BitSet(new long[]{0x0080000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_TypeGroup4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_parse_art_group_InstanceGroup4800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4818 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_InstanceGroup4839 = new BitSet(new long[]{0x06802B0002080000L});
    public static final BitSet FOLLOW_58_in_parse_art_group_InstanceGroup4871 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_group_InstanceGroup4891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup4917 = new BitSet(new long[]{0x02802B1002080000L});
    public static final BitSet FOLLOW_36_in_parse_art_group_InstanceGroup4976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup5010 = new BitSet(new long[]{0x02802B1002080000L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup5108 = new BitSet(new long[]{0x02802B0002080000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_InstanceGroup5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_IMPLEM_in_parse_art_implem_OSGiType5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_parse_art_type_BasicAttribute5216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute5234 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_BasicAttribute5255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute5273 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_art_type_BasicAttribute5312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_parse_art_type_Dictionary5394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5412 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Dictionary5433 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Dictionary5447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5465 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_Dictionary5486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary5504 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Dictionary5525 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_art_type_Dictionary5557 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_Dictionary5577 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary5616 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_Dictionary5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_type_DictionaryDefaultValue5704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5722 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_DictionaryDefaultValue5761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue5787 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_DictionaryDefaultValue5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiPort_in_parse_art_implem_PortImplementation6119 = new BitSet(new long[]{0x0000000000000002L});

}