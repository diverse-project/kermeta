// $ANTLR 3.1.1

	package art.resource.art.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class ArtParser extends ArtANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "T_INSTANCE_STATE", "STRING_LITERAL", "T_PORT_KIND", "T_OPTIONAL", "INTEGER", "SL_COMMENT", "ML_COMMENT", "ANNOTATION", "WHITESPACE", "LINEBREAKS", "'system'", "';'", "'root'", "'datatype'", "'primitive'", "'instance'", "':'", "'implementation'", "'groups'", "','", "'{'", "'}'", "'composite'", "'bind'", "'to'", "'::'", "'('", "'id'", "'='", "')'", "'delegate'", "':='", "'['", "'->'", "']'", "'type'", "'compositetype'", "'operation'", "'in'", "'out'", "'functional'", "'service'", "'control'", "'port'", "'..'", "'FractalComponent'", "'<'", "'controllerDesc'", "'contentDesc'", "'>'", "'OSGiComponent'", "'implementingClass'", "'OSGiPort'", "'serviceId'", "'typegroup'", "'types'", "'instancegroup'", "'instances'", "'OSGiType'", "'generateInstanceBundle'", "'attribute'", "'default'"
    };
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ANNOTATION=12;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T_OPTIONAL=8;
    public static final int T__61=61;
    public static final int LINEBREAKS=14;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_PORT_KIND=7;
    public static final int T__55=55;
    public static final int ML_COMMENT=11;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int STRING_LITERAL=6;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T_INSTANCE_STATE=5;
    public static final int T__50=50;
    public static final int INTEGER=9;
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
    public static final int WHITESPACE=13;
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


        public ArtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ArtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[93+1];
             
             
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
            a0=(Token)match(input,15,FOLLOW_15_in_parse_art_System119); if (state.failed) return element;
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
            a2=(Token)match(input,16,FOLLOW_16_in_parse_art_System158); if (state.failed) return element;
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
            a3=(Token)match(input,17,FOLLOW_17_in_parse_art_System172); if (state.failed) return element;
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

                if ( (LA2_0==18||(LA2_0>=40 && LA2_0<=41)||LA2_0==45||LA2_0==47||LA2_0==59||LA2_0==61) ) {
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
            	    case 45:
            	    case 47:
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
            	    case 18:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 59:
            	    case 61:
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
            a0=(Token)match(input,18,FOLLOW_18_in_parse_art_DataType461); if (state.failed) return element;
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
            a2=(Token)match(input,16,FOLLOW_16_in_parse_art_DataType500); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:716:1: parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null] : a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) ) )* a16= '}' ;
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
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a16=null;
        art.implem.ComponentImplementation a7_0 = null;

        art.instance.AttributeInstance a14_0 = null;

        art.instance.TransmissionBinding a15_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:719:1: (a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) ) )* a16= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:720:2: a0= 'primitive' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) ) )* a16= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,19,FOLLOW_19_in_parse_art_instance_PrimitiveInstance529); if (state.failed) return element;
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
            a1=(Token)match(input,20,FOLLOW_20_in_parse_art_instance_PrimitiveInstance543); if (state.failed) return element;
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
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_PrimitiveInstance582); if (state.failed) return element;
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

            if ( (LA3_0==22) ) {
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
                    a6=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_PrimitiveInstance664); if (state.failed) return element;
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

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:895:2: ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:896:3: (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:899:3: (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:900:4: a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_PrimitiveInstance744); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a9=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_PrimitiveInstance764); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:925:4: (a10= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:926:5: a10= TEXT
                    {
                    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance790); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                      					}
                      					if (a10 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.group.InstanceGroup proxy = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.group.InstanceGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS, proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a10, element);
                      						copyLocalizationInfos((CommonToken) a10, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:960:4: ( (a11= ',' (a12= TEXT ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==24) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:961:5: (a11= ',' (a12= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:964:5: (a11= ',' (a12= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:965:6: a11= ',' (a12= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a11=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_PrimitiveInstance849); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a11, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:979:6: (a12= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:980:7: a12= TEXT
                    	    {
                    	    a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance883); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
                    	      							}
                    	      							if (a12 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.group.InstanceGroup proxy = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.group.InstanceGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS, proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a12, element);
                    	      								copyLocalizationInfos((CommonToken) a12, proxy);
                    	      							}
                    	      						
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

                      				// expected element after STAR or PLUS
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a13=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_PrimitiveInstance957); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1034:2: ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TEXT||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1035:3: ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1038:3: ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1039:4: ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1042:4: ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==TEXT) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==28) ) {
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1043:5: (a14_0= parse_art_instance_AttributeInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1046:5: (a14_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1047:6: a14_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance1008);
            	            a14_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a14_0 != null) {
            	              							if (a14_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE, a14_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a14_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1064:10: (a15_0= parse_art_instance_TransmissionBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1067:5: (a15_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1068:6: a15_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance1058);
            	            a15_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
            	              						}
            	              						if (a15_0 != null) {
            	              							if (a15_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING, a15_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a15_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a16=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_PrimitiveInstance1109); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a16, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1105:1: parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null] : a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) ) )* a18= '}' ;
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
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a18=null;
        art.implem.ComponentImplementation a7_0 = null;

        art.instance.AttributeInstance a14_0 = null;

        art.instance.TransmissionBinding a15_0 = null;

        art.instance.ComponentInstance a16_0 = null;

        art.instance.DelegationBinding a17_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1108:1: (a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) ) )* a18= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1109:2: a0= 'composite' a1= 'instance' (a2= TEXT ) a3= ':' (a4= TEXT ) (a5= T_INSTANCE_STATE ) ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )? ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )? a13= '{' ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) ) )* a18= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,27,FOLLOW_27_in_parse_art_instance_CompositeInstance1138); if (state.failed) return element;
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
            a1=(Token)match(input,20,FOLLOW_20_in_parse_art_instance_CompositeInstance1152); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1134:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1135:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1170); if (state.failed) return element;
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
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_CompositeInstance1191); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1176:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1177:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1209); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1211:2: (a5= T_INSTANCE_STATE )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1212:3: a5= T_INSTANCE_STATE
            {
            a5=(Token)match(input,T_INSTANCE_STATE,FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1234); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1242:2: ( (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1243:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1246:3: (a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1247:4: a6= 'implementation' (a7_0= parse_art_implem_ComponentImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,22,FOLLOW_22_in_parse_art_instance_CompositeInstance1273); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1261:4: (a7_0= parse_art_implem_ComponentImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1262:5: a7_0= parse_art_implem_ComponentImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1299);
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

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1284:2: ( (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1285:3: (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1288:3: (a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1289:4: a8= 'groups' a9= ':' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,23,FOLLOW_23_in_parse_art_instance_CompositeInstance1353); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a9=(Token)match(input,21,FOLLOW_21_in_parse_art_instance_CompositeInstance1373); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1314:4: (a10= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1315:5: a10= TEXT
                    {
                    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1399); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                      					}
                      					if (a10 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.group.InstanceGroup proxy = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.group.InstanceGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS, proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a10, element);
                      						copyLocalizationInfos((CommonToken) a10, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1349:4: ( (a11= ',' (a12= TEXT ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1350:5: (a11= ',' (a12= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1353:5: (a11= ',' (a12= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1354:6: a11= ',' (a12= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a11=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_CompositeInstance1458); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a11, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1368:6: (a12= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1369:7: a12= TEXT
                    	    {
                    	    a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1492); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
                    	      							}
                    	      							if (a12 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.group.InstanceGroup proxy = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.instance.ComponentInstance, art.group.InstanceGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS, proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a12, element);
                    	      								copyLocalizationInfos((CommonToken) a12, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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

              		// expected element is a CsString
              	
            }
            a13=(Token)match(input,25,FOLLOW_25_in_parse_art_instance_CompositeInstance1566); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1423:2: ( ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TEXT||LA12_0==19||(LA12_0>=27 && LA12_0<=28)||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1424:3: ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1427:3: ( ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1428:4: ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1431:4: ( (a14_0= parse_art_instance_AttributeInstance ) | (a15_0= parse_art_instance_TransmissionBinding ) | (a16_0= parse_art_instance_ComponentInstance ) | (a17_0= parse_art_instance_DelegationBinding ) )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case TEXT:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 19:
            	    case 27:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1432:5: (a14_0= parse_art_instance_AttributeInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1435:5: (a14_0= parse_art_instance_AttributeInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1436:6: a14_0= parse_art_instance_AttributeInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1617);
            	            a14_0=parse_art_instance_AttributeInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a14_0 != null) {
            	              							if (a14_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE, a14_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a14_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1453:10: (a15_0= parse_art_instance_TransmissionBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1456:5: (a15_0= parse_art_instance_TransmissionBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1457:6: a15_0= parse_art_instance_TransmissionBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1667);
            	            a15_0=parse_art_instance_TransmissionBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a15_0 != null) {
            	              							if (a15_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING, a15_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a15_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1474:10: (a16_0= parse_art_instance_ComponentInstance )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1477:5: (a16_0= parse_art_instance_ComponentInstance )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1478:6: a16_0= parse_art_instance_ComponentInstance
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1717);
            	            a16_0=parse_art_instance_ComponentInstance();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a16_0 != null) {
            	              							if (a16_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, a16_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a16_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1495:10: (a17_0= parse_art_instance_DelegationBinding )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1498:5: (a17_0= parse_art_instance_DelegationBinding )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1499:6: a17_0= parse_art_instance_DelegationBinding
            	            {
            	            pushFollow(FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1767);
            	            a17_0=parse_art_instance_DelegationBinding();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
            	              						}
            	              						if (a17_0 != null) {
            	              							if (a17_0 != null) {
            	              								addObjectToList(element, art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION, a17_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a17_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a18=(Token)match(input,26,FOLLOW_26_in_parse_art_instance_CompositeInstance1818); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a18, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1536:1: parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null] : a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1539:1: (a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1540:2: a0= 'bind' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,28,FOLLOW_28_in_parse_art_instance_TransmissionBinding1847); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1554:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1555:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1865); if (state.failed) return element;
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
            a2=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_TransmissionBinding1886); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1600:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1601:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1904); if (state.failed) return element;
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
            a4=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_TransmissionBinding1925); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1646:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1647:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1943); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1681:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1682:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1685:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1686:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_TransmissionBinding1982); if (state.failed) return element;
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
                    a7=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_TransmissionBinding2002); if (state.failed) return element;
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
                    a8=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_TransmissionBinding2022); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1722:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1723:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding2048); if (state.failed) return element;
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
                    a10=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_TransmissionBinding2081); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1766:1: parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null] : a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1769:1: (a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1770:2: a0= 'delegate' (a1= TEXT ) a2= 'to' (a3= TEXT ) a4= '::' (a5= TEXT ) ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,35,FOLLOW_35_in_parse_art_instance_DelegationBinding2124); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1784:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1785:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2142); if (state.failed) return element;
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
            a2=(Token)match(input,29,FOLLOW_29_in_parse_art_instance_DelegationBinding2163); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1830:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1831:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2181); if (state.failed) return element;
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
            a4=(Token)match(input,30,FOLLOW_30_in_parse_art_instance_DelegationBinding2202); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1876:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1877:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2220); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1911:2: ( (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1912:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1915:3: (a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1916:4: a6= '(' a7= 'id' a8= '=' (a9= STRING_LITERAL ) a10= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a6=(Token)match(input,31,FOLLOW_31_in_parse_art_instance_DelegationBinding2259); if (state.failed) return element;
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
                    a7=(Token)match(input,32,FOLLOW_32_in_parse_art_instance_DelegationBinding2279); if (state.failed) return element;
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
                    a8=(Token)match(input,33,FOLLOW_33_in_parse_art_instance_DelegationBinding2299); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1952:4: (a9= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1953:5: a9= STRING_LITERAL
                    {
                    a9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding2325); if (state.failed) return element;
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
                    a10=(Token)match(input,34,FOLLOW_34_in_parse_art_instance_DelegationBinding2358); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1996:1: parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null] : (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) ;
    public final art.instance.ValuedAttribute parse_art_instance_ValuedAttribute() throws RecognitionException {
        art.instance.ValuedAttribute element =  null;
        int parse_art_instance_ValuedAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:1999:1: ( (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2000:2: (a0= TEXT ) a1= ':=' (a2= STRING_LITERAL )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2003:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2004:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute2405); if (state.failed) return element;
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
            a1=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_ValuedAttribute2426); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2049:2: (a2= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2050:3: a2= STRING_LITERAL
            {
            a2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute2444); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2079:1: parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null] : (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2082:1: ( (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2083:2: (a0= TEXT ) a1= ':=' ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2086:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2087:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2484); if (state.failed) return element;
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
            a1=(Token)match(input,36,FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2505); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2132:2: ( ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2133:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2136:3: ( (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2137:4: (a2_0= parse_art_instance_Entry ) ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2140:4: (a2_0= parse_art_instance_Entry )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2141:5: a2_0= parse_art_instance_Entry
                    {
                    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2543);
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2160:4: ( (a3= ',' (a4_0= parse_art_instance_Entry ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2161:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2164:5: (a3= ',' (a4_0= parse_art_instance_Entry ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2165:6: a3= ',' (a4_0= parse_art_instance_Entry )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a3=(Token)match(input,24,FOLLOW_24_in_parse_art_instance_DictionaryValuedAttribute2597); if (state.failed) return element;
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
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2179:6: (a4_0= parse_art_instance_Entry )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2180:7: a4_0= parse_art_instance_Entry
                    	    {
                    	    pushFollow(FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2631);
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
                    	    break loop15;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2207:1: parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null] : a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2210:1: (a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2211:2: a0= '[' (a1= TEXT ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_DefaultEntry2713); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2225:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2226:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2731); if (state.failed) return element;
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
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_DefaultEntry2752); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2271:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2272:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2770); if (state.failed) return element;
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
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_DefaultEntry2791); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2312:1: parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null] : a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2315:1: (a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2316:2: a0= '[' (a1= STRING_LITERAL ) a2= '->' (a3= STRING_LITERAL ) a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_instance_OtherEntry2820); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2330:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2331:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2838); if (state.failed) return element;
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
            a2=(Token)match(input,38,FOLLOW_38_in_parse_art_instance_OtherEntry2859); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2372:2: (a3= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2373:3: a3= STRING_LITERAL
            {
            a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2877); if (state.failed) return element;
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
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_instance_OtherEntry2898); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2413:1: parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null] : a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}' ;
    public final art.type.PrimitiveType parse_art_type_PrimitiveType() throws RecognitionException {
        art.type.PrimitiveType element =  null;
        int parse_art_type_PrimitiveType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a12=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.Port a10_0 = null;

        art.type.Attribute a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2416:1: (a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2417:2: a0= 'type' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,40,FOLLOW_40_in_parse_art_type_PrimitiveType2927); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2431:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2432:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType2945); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2462:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2463:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2466:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2467:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_PrimitiveType2984); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2481:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2482:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType3010);
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

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2504:2: ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2505:3: (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2508:3: (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2509:4: a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,23,FOLLOW_23_in_parse_art_type_PrimitiveType3064); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a5=(Token)match(input,21,FOLLOW_21_in_parse_art_type_PrimitiveType3084); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2534:4: (a6= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2535:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType3110); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                      					}
                      					if (a6 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__GROUPS), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.group.TypeGroup proxy = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.ComponentType, art.group.TypeGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentTypeGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__GROUPS), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__GROUPS, proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a6, element);
                      						copyLocalizationInfos((CommonToken) a6, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2569:4: ( (a7= ',' (a8= TEXT ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2570:5: (a7= ',' (a8= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2573:5: (a7= ',' (a8= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2574:6: a7= ',' (a8= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a7=(Token)match(input,24,FOLLOW_24_in_parse_art_type_PrimitiveType3169); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2588:6: (a8= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2589:7: a8= TEXT
                    	    {
                    	    a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_PrimitiveType3203); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
                    	      							}
                    	      							if (a8 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__GROUPS), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.group.TypeGroup proxy = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.ComponentType, art.group.TypeGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentTypeGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PRIMITIVE_TYPE__GROUPS), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__GROUPS, proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a8, element);
                    	      								copyLocalizationInfos((CommonToken) a8, proxy);
                    	      							}
                    	      						
                    	    }

                    	    }


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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_type_PrimitiveType3277); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2643:2: ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==T_PORT_KIND||LA21_0==65) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2644:3: ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2647:3: ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==T_PORT_KIND) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==65) ) {
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
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2648:4: (a10_0= parse_art_type_Port )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2651:4: (a10_0= parse_art_type_Port )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2652:5: a10_0= parse_art_type_Port
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_PrimitiveType3315);
            	            a10_0=parse_art_type_Port();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a10_0 != null) {
            	              						if (a10_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__PORT, a10_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a10_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2669:8: (a11_0= parse_art_type_Attribute )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2672:4: (a11_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2673:5: a11_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType3357);
            	            a11_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
            	              					}
            	              					if (a11_0 != null) {
            	              						if (a11_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE, a11_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a11_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a12=(Token)match(input,26,FOLLOW_26_in_parse_art_type_PrimitiveType3396); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a12, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2708:1: parse_art_type_CompositeType returns [art.type.CompositeType element = null] : a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}' ;
    public final art.type.CompositeType parse_art_type_CompositeType() throws RecognitionException {
        art.type.CompositeType element =  null;
        int parse_art_type_CompositeType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a12=null;
        art.implem.TypeImplementation a3_0 = null;

        art.type.Port a10_0 = null;

        art.type.Attribute a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2711:1: (a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2712:2: a0= 'compositetype' (a1= TEXT ) ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )? ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )? a9= '{' ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )* a12= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,41,FOLLOW_41_in_parse_art_type_CompositeType3425); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2726:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2727:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType3443); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2757:2: ( (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2758:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2761:3: (a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2762:4: a2= 'implementation' (a3_0= parse_art_implem_TypeImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,22,FOLLOW_22_in_parse_art_type_CompositeType3482); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2776:4: (a3_0= parse_art_implem_TypeImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2777:5: a3_0= parse_art_implem_TypeImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType3508);
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

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2799:2: ( (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2800:3: (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2803:3: (a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2804:4: a4= 'groups' a5= ':' (a6= TEXT ) ( (a7= ',' (a8= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,23,FOLLOW_23_in_parse_art_type_CompositeType3562); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a5=(Token)match(input,21,FOLLOW_21_in_parse_art_type_CompositeType3582); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2829:4: (a6= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2830:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType3608); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new art.resource.art.mopp.ArtTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                      					}
                      					if (a6 != null) {
                      						art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__GROUPS), result);
                      						java.lang.Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
                      						}
                      						String resolved = (String) resolvedObject;
                      						art.group.TypeGroup proxy = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                      						collectHiddenTokens(element);
                      						registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.ComponentType, art.group.TypeGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentTypeGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__GROUPS), resolved, proxy);
                      						if (proxy != null) {
                      							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__GROUPS, proxy);
                      						}
                      						collectHiddenTokens(element);
                      						copyLocalizationInfos((CommonToken) a6, element);
                      						copyLocalizationInfos((CommonToken) a6, proxy);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected element before STAR or QUESTIONMARK or PLUS
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2864:4: ( (a7= ',' (a8= TEXT ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==24) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2865:5: (a7= ',' (a8= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2868:5: (a7= ',' (a8= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2869:6: a7= ',' (a8= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a7=(Token)match(input,24,FOLLOW_24_in_parse_art_type_CompositeType3667); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						copyLocalizationInfos((CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a Terminal
                    	      					
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2883:6: (a8= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2884:7: a8= TEXT
                    	    {
                    	    a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_CompositeType3701); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new art.resource.art.mopp.ArtTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = art.type.TypeFactory.eINSTANCE.createCompositeType();
                    	      							}
                    	      							if (a8 != null) {
                    	      								art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__GROUPS), result);
                    	      								java.lang.Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
                    	      								}
                    	      								String resolved = (String) resolvedObject;
                    	      								art.group.TypeGroup proxy = art.group.GroupFactory.eINSTANCE.createTypeGroup();
                    	      								collectHiddenTokens(element);
                    	      								registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.type.ComponentType, art.group.TypeGroup>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentTypeGroupsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.COMPOSITE_TYPE__GROUPS), resolved, proxy);
                    	      								if (proxy != null) {
                    	      									addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__GROUPS, proxy);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								copyLocalizationInfos((CommonToken) a8, element);
                    	      								copyLocalizationInfos((CommonToken) a8, proxy);
                    	      							}
                    	      						
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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,25,FOLLOW_25_in_parse_art_type_CompositeType3775); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2938:2: ( ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==T_PORT_KIND||LA26_0==65) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2939:3: ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2942:3: ( (a10_0= parse_art_type_Port ) | (a11_0= parse_art_type_Attribute ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==T_PORT_KIND) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==65) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2943:4: (a10_0= parse_art_type_Port )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2946:4: (a10_0= parse_art_type_Port )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2947:5: a10_0= parse_art_type_Port
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Port_in_parse_art_type_CompositeType3813);
            	            a10_0=parse_art_type_Port();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a10_0 != null) {
            	              						if (a10_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__PORT, a10_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a10_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2964:8: (a11_0= parse_art_type_Attribute )
            	            {
            	            if ( state.backtracking==0 ) {

            	              				// expected element is a Terminal
            	              			
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2967:4: (a11_0= parse_art_type_Attribute )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:2968:5: a11_0= parse_art_type_Attribute
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType3855);
            	            a11_0=parse_art_type_Attribute();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (terminateParsing) {
            	              						throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              					}
            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createCompositeType();
            	              					}
            	              					if (a11_0 != null) {
            	              						if (a11_0 != null) {
            	              							addObjectToList(element, art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE, a11_0);
            	              						}
            	              						collectHiddenTokens(element);
            	              						copyLocalizationInfos(a11_0, element); 					}
            	              				
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a12=(Token)match(input,26,FOLLOW_26_in_parse_art_type_CompositeType3894); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a12, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3003:1: parse_art_type_Operation returns [art.type.Operation element = null] : a0= 'operation' (a1= TEXT ) a2= '(' ( (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) ) )? ( (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) ) )* a12= ')' ;
    public final art.type.Operation parse_art_type_Operation() throws RecognitionException {
        art.type.Operation element =  null;
        int parse_art_type_Operation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        art.type.Parameter a4_0 = null;

        art.type.Parameter a6_0 = null;

        art.type.Parameter a9_0 = null;

        art.type.Parameter a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3006:1: (a0= 'operation' (a1= TEXT ) a2= '(' ( (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) ) )? ( (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) ) )* a12= ')' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3007:2: a0= 'operation' (a1= TEXT ) a2= '(' ( (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) ) )? ( (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) ) )* a12= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,42,FOLLOW_42_in_parse_art_type_Operation3923); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3021:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3022:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Operation3941); if (state.failed) return element;
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
            a2=(Token)match(input,31,FOLLOW_31_in_parse_art_type_Operation3962); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3063:2: ( (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=43 && LA28_0<=44)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3064:3: (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3067:3: (a3= 'in' (a4_0= parse_art_type_Parameter ) | a5= 'out' (a6_0= parse_art_type_Parameter ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==43) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==44) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3068:4: a3= 'in' (a4_0= parse_art_type_Parameter )
                            {
                            if ( state.backtracking==0 ) {

                              				// expected element is a CsString
                              			
                            }
                            a3=(Token)match(input,43,FOLLOW_43_in_parse_art_type_Operation3994); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (element == null) {
                              					element = art.type.TypeFactory.eINSTANCE.createOperation();
                              				}
                              				collectHiddenTokens(element);
                              				copyLocalizationInfos((CommonToken)a3, element);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				// expected element is a Terminal
                              			
                            }
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3082:4: (a4_0= parse_art_type_Parameter )
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3083:5: a4_0= parse_art_type_Parameter
                            {
                            pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4020);
                            a4_0=parse_art_type_Parameter();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (terminateParsing) {
                              						throw new art.resource.art.mopp.ArtTerminateParsingException();
                              					}
                              					if (element == null) {
                              						element = art.type.TypeFactory.eINSTANCE.createOperation();
                              					}
                              					if (a4_0 != null) {
                              						if (a4_0 != null) {
                              							addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a4_0);
                              						}
                              						collectHiddenTokens(element);
                              						copyLocalizationInfos(a4_0, element); 					}
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3100:8: a5= 'out' (a6_0= parse_art_type_Parameter )
                            {
                            if ( state.backtracking==0 ) {

                              				// expected element is a CsString
                              			
                            }
                            a5=(Token)match(input,44,FOLLOW_44_in_parse_art_type_Operation4056); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              				if (element == null) {
                              					element = art.type.TypeFactory.eINSTANCE.createOperation();
                              				}
                              				collectHiddenTokens(element);
                              				copyLocalizationInfos((CommonToken)a5, element);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				// expected element is a Terminal
                              			
                            }
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3114:4: (a6_0= parse_art_type_Parameter )
                            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3115:5: a6_0= parse_art_type_Parameter
                            {
                            pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4082);
                            a6_0=parse_art_type_Parameter();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (terminateParsing) {
                              						throw new art.resource.art.mopp.ArtTerminateParsingException();
                              					}
                              					if (element == null) {
                              						element = art.type.TypeFactory.eINSTANCE.createOperation();
                              					}
                              					if (a6_0 != null) {
                              						if (a6_0 != null) {
                              							addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a6_0);
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

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3137:2: ( (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3138:3: (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3141:3: (a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3142:4: a7= ',' (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a CsString
            	      			
            	    }
            	    a7=(Token)match(input,24,FOLLOW_24_in_parse_art_type_Operation4136); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = art.type.TypeFactory.eINSTANCE.createOperation();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a7, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Compound
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3156:4: (a8= 'in' (a9_0= parse_art_type_Parameter ) | a10= 'out' (a11_0= parse_art_type_Parameter ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==43) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==44) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3157:5: a8= 'in' (a9_0= parse_art_type_Parameter )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a CsString
            	              				
            	            }
            	            a8=(Token)match(input,43,FOLLOW_43_in_parse_art_type_Operation4168); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	              					}
            	              					collectHiddenTokens(element);
            	              					copyLocalizationInfos((CommonToken)a8, element);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3171:5: (a9_0= parse_art_type_Parameter )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3172:6: a9_0= parse_art_type_Parameter
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4198);
            	            a9_0=parse_art_type_Parameter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.type.TypeFactory.eINSTANCE.createOperation();
            	              						}
            	              						if (a9_0 != null) {
            	              							if (a9_0 != null) {
            	              								addObjectToList(element, art.type.TypePackage.OPERATION__INPUT, a9_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a9_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3189:10: a10= 'out' (a11_0= parse_art_type_Parameter )
            	            {
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a CsString
            	              				
            	            }
            	            a10=(Token)match(input,44,FOLLOW_44_in_parse_art_type_Operation4241); if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              					if (element == null) {
            	              						element = art.type.TypeFactory.eINSTANCE.createOperation();
            	              					}
            	              					collectHiddenTokens(element);
            	              					copyLocalizationInfos((CommonToken)a10, element);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					// expected element is a Terminal
            	              				
            	            }
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3203:5: (a11_0= parse_art_type_Parameter )
            	            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3204:6: a11_0= parse_art_type_Parameter
            	            {
            	            pushFollow(FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4271);
            	            a11_0=parse_art_type_Parameter();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

            	              						if (terminateParsing) {
            	              							throw new art.resource.art.mopp.ArtTerminateParsingException();
            	              						}
            	              						if (element == null) {
            	              							element = art.type.TypeFactory.eINSTANCE.createOperation();
            	              						}
            	              						if (a11_0 != null) {
            	              							if (a11_0 != null) {
            	              								addObjectToList(element, art.type.TypePackage.OPERATION__OUTPUT, a11_0);
            	              							}
            	              							collectHiddenTokens(element);
            	              							copyLocalizationInfos(a11_0, element); 						}
            	              					
            	            }

            	            }


            	            }
            	            break;

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
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a12=(Token)match(input,34,FOLLOW_34_in_parse_art_type_Operation4322); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createOperation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a12, element);
              	
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3241:1: parse_art_type_Parameter returns [art.type.Parameter element = null] : (a0= TEXT ) a1= ':' (a2= TEXT ) ;
    public final art.type.Parameter parse_art_type_Parameter() throws RecognitionException {
        art.type.Parameter element =  null;
        int parse_art_type_Parameter_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3244:1: ( (a0= TEXT ) a1= ':' (a2= TEXT ) )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3245:2: (a0= TEXT ) a1= ':' (a2= TEXT )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3248:2: (a0= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3249:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter4355); if (state.failed) return element;
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
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__NAME), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,21,FOLLOW_21_in_parse_art_type_Parameter4376); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.type.TypeFactory.eINSTANCE.createParameter();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3290:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3291:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Parameter4394); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createParameter();
              			}
              			if (a2 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				String resolved = (String) resolvedObject;
              				art.DataType proxy = art.ArtFactory.eINSTANCE.createDataType();
              				collectHiddenTokens(element);
              				registerContextDependentProxy(new art.resource.art.mopp.ArtContextDependentURIFragmentFactory<art.TypedElement, art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), resolved, proxy);
              				if (proxy != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.type.TypePackage.PARAMETER__TYPE), proxy);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              				copyLocalizationInfos((CommonToken) a2, proxy);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3324:1: parse_art_type_FunctionalService returns [art.type.FunctionalService element = null] : a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3327:1: (a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3328:2: a0= 'functional' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,45,FOLLOW_45_in_parse_art_type_FunctionalService4430); if (state.failed) return element;
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
            a1=(Token)match(input,46,FOLLOW_46_in_parse_art_type_FunctionalService4444); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3353:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3354:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_FunctionalService4462); if (state.failed) return element;
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
            a3=(Token)match(input,25,FOLLOW_25_in_parse_art_type_FunctionalService4483); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3395:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3396:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3399:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3400:4: (a4_0= parse_art_type_Operation )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3403:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3404:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService4521);
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
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,26,FOLLOW_26_in_parse_art_type_FunctionalService4560); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3439:1: parse_art_type_ControlService returns [art.type.ControlService element = null] : a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3442:1: (a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3443:2: a0= 'control' a1= 'service' (a2= TEXT ) a3= '{' ( ( (a4_0= parse_art_type_Operation ) ) )* a5= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,47,FOLLOW_47_in_parse_art_type_ControlService4589); if (state.failed) return element;
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
            a1=(Token)match(input,46,FOLLOW_46_in_parse_art_type_ControlService4603); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3468:2: (a2= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3469:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_ControlService4621); if (state.failed) return element;
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
            a3=(Token)match(input,25,FOLLOW_25_in_parse_art_type_ControlService4642); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3510:2: ( ( (a4_0= parse_art_type_Operation ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3511:3: ( (a4_0= parse_art_type_Operation ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3514:3: ( (a4_0= parse_art_type_Operation ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3515:4: (a4_0= parse_art_type_Operation )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3518:4: (a4_0= parse_art_type_Operation )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3519:5: a4_0= parse_art_type_Operation
            	    {
            	    pushFollow(FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService4680);
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
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,26,FOLLOW_26_in_parse_art_type_ControlService4719); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3554:1: parse_art_type_Port returns [art.type.Port element = null] : (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= INTEGER ) a8= '..' (a9= INTEGER ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3557:1: ( (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= INTEGER ) a8= '..' (a9= INTEGER ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3558:2: (a0= T_PORT_KIND ) ( ( (a1= T_OPTIONAL ) ) )? a2= 'port' (a3= TEXT ) a4= ':' (a5= TEXT ) a6= '[' (a7= INTEGER ) a8= '..' (a9= INTEGER ) a10= ']' ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3561:2: (a0= T_PORT_KIND )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3562:3: a0= T_PORT_KIND
            {
            a0=(Token)match(input,T_PORT_KIND,FOLLOW_T_PORT_KIND_in_parse_art_type_Port4752); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3592:2: ( ( (a1= T_OPTIONAL ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==T_OPTIONAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3593:3: ( (a1= T_OPTIONAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3596:3: ( (a1= T_OPTIONAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3597:4: (a1= T_OPTIONAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a Terminal
                      			
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3600:4: (a1= T_OPTIONAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3601:5: a1= T_OPTIONAL
                    {
                    a1=(Token)match(input,T_OPTIONAL,FOLLOW_T_OPTIONAL_in_parse_art_type_Port4797); if (state.failed) return element;
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
            a2=(Token)match(input,48,FOLLOW_48_in_parse_art_type_Port4838); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3645:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3646:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port4856); if (state.failed) return element;
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
            a4=(Token)match(input,21,FOLLOW_21_in_parse_art_type_Port4877); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3687:2: (a5= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3688:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Port4895); if (state.failed) return element;
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
            a6=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Port4916); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3733:2: (a7= INTEGER )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3734:3: a7= INTEGER
            {
            a7=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_art_type_Port4934); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a7 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
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
            a8=(Token)match(input,49,FOLLOW_49_in_parse_art_type_Port4955); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3775:2: (a9= INTEGER )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3776:3: a9= INTEGER
            {
            a9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_art_type_Port4973); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.type.TypeFactory.eINSTANCE.createPort();
              			}
              			if (a9 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
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
            a10=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Port4994); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3817:2: ( (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3818:3: (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3821:3: (a11= 'implementation' (a12_0= parse_art_implem_PortImplementation ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3822:4: a11= 'implementation' (a12_0= parse_art_implem_PortImplementation )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a11=(Token)match(input,22,FOLLOW_22_in_parse_art_type_Port5026); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3836:4: (a12_0= parse_art_implem_PortImplementation )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3837:5: a12_0= parse_art_implem_PortImplementation
                    {
                    pushFollow(FOLLOW_parse_art_implem_PortImplementation_in_parse_art_type_Port5052);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3858:1: parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null] : a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3861:1: (a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3862:2: a0= 'FractalComponent' a1= '<' a2= 'controllerDesc' a3= ':' (a4= STRING_LITERAL ) a5= 'contentDesc' a6= ':' (a7= STRING_LITERAL ) a8= '>'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,50,FOLLOW_50_in_parse_art_implem_FractalComponent5103); if (state.failed) return element;
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
            a1=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_FractalComponent5117); if (state.failed) return element;
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
            a2=(Token)match(input,52,FOLLOW_52_in_parse_art_implem_FractalComponent5131); if (state.failed) return element;
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
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_implem_FractalComponent5145); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3909:2: (a4= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3910:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent5163); if (state.failed) return element;
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
            a5=(Token)match(input,53,FOLLOW_53_in_parse_art_implem_FractalComponent5184); if (state.failed) return element;
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
            a6=(Token)match(input,21,FOLLOW_21_in_parse_art_implem_FractalComponent5198); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3962:2: (a7= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:3963:3: a7= STRING_LITERAL
            {
            a7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent5216); if (state.failed) return element;
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
            a8=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_FractalComponent5237); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4003:1: parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null] : a0= 'OSGiComponent' a1= '<' a2= 'implementingClass' a3= ':' (a4= STRING_LITERAL ) a5= '>' ;
    public final art.implem.OSGiComponent parse_art_implem_OSGiComponent() throws RecognitionException {
        art.implem.OSGiComponent element =  null;
        int parse_art_implem_OSGiComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4006:1: (a0= 'OSGiComponent' a1= '<' a2= 'implementingClass' a3= ':' (a4= STRING_LITERAL ) a5= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4007:2: a0= 'OSGiComponent' a1= '<' a2= 'implementingClass' a3= ':' (a4= STRING_LITERAL ) a5= '>'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,55,FOLLOW_55_in_parse_art_implem_OSGiComponent5266); if (state.failed) return element;
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
            a1=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_OSGiComponent5280); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,56,FOLLOW_56_in_parse_art_implem_OSGiComponent5294); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_implem_OSGiComponent5308); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4054:2: (a4= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4055:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent5326); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_OSGiComponent5347); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
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
            if ( state.backtracking>0 ) { memoize(input, 20, parse_art_implem_OSGiComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiComponent"


    // $ANTLR start "parse_art_implem_OSGiPort"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4095:1: parse_art_implem_OSGiPort returns [art.implem.OSGiPort element = null] : a0= 'OSGiPort' a1= '<' a2= 'serviceId' a3= ':' (a4= STRING_LITERAL ) a5= '>' ;
    public final art.implem.OSGiPort parse_art_implem_OSGiPort() throws RecognitionException {
        art.implem.OSGiPort element =  null;
        int parse_art_implem_OSGiPort_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4098:1: (a0= 'OSGiPort' a1= '<' a2= 'serviceId' a3= ':' (a4= STRING_LITERAL ) a5= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4099:2: a0= 'OSGiPort' a1= '<' a2= 'serviceId' a3= ':' (a4= STRING_LITERAL ) a5= '>'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,57,FOLLOW_57_in_parse_art_implem_OSGiPort5376); if (state.failed) return element;
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
            a1=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_OSGiPort5390); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,58,FOLLOW_58_in_parse_art_implem_OSGiPort5404); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_implem_OSGiPort5418); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4146:2: (a4= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4147:3: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiPort5436); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_PORT__SERVICE_ID), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_PORT__SERVICE_ID), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_OSGiPort5457); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
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
            if ( state.backtracking>0 ) { memoize(input, 21, parse_art_implem_OSGiPort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiPort"


    // $ANTLR start "parse_art_group_TypeGroup"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4187:1: parse_art_group_TypeGroup returns [art.group.TypeGroup element = null] : a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4190:1: (a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4191:2: a0= 'typegroup' (a1= TEXT ) a2= '{' ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_TypeGroup ) ) )* a9= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,59,FOLLOW_59_in_parse_art_group_TypeGroup5486); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4205:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4206:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup5504); if (state.failed) return element;
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
            a2=(Token)match(input,25,FOLLOW_25_in_parse_art_group_TypeGroup5525); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4247:2: ( (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4248:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4251:3: (a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4252:4: a3= 'types' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a3=(Token)match(input,60,FOLLOW_60_in_parse_art_group_TypeGroup5557); if (state.failed) return element;
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
                    a4=(Token)match(input,21,FOLLOW_21_in_parse_art_group_TypeGroup5577); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4277:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4278:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup5603); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4312:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==24) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4313:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4316:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4317:6: a6= ',' (a7= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a6=(Token)match(input,24,FOLLOW_24_in_parse_art_group_TypeGroup5662); if (state.failed) return element;
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
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4331:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4332:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_TypeGroup5696); if (state.failed) return element;
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
                    	    break loop35;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4375:2: ( ( (a8_0= parse_art_group_TypeGroup ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==59) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4376:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4379:3: ( (a8_0= parse_art_group_TypeGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4380:4: (a8_0= parse_art_group_TypeGroup )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4383:4: (a8_0= parse_art_group_TypeGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4384:5: a8_0= parse_art_group_TypeGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup5794);
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
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,26,FOLLOW_26_in_parse_art_group_TypeGroup5833); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4419:1: parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null] : a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4422:1: (a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4423:2: a0= 'instancegroup' (a1= TEXT ) a2= '{' ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )? ( ( (a8_0= parse_art_group_InstanceGroup ) ) )* a9= '}'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,61,FOLLOW_61_in_parse_art_group_InstanceGroup5862); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4437:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4438:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup5880); if (state.failed) return element;
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
            a2=(Token)match(input,25,FOLLOW_25_in_parse_art_group_InstanceGroup5901); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4479:2: ( (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4480:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4483:3: (a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )* )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4484:4: a3= 'instances' a4= ':' (a5= TEXT ) ( (a6= ',' (a7= TEXT ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a3=(Token)match(input,62,FOLLOW_62_in_parse_art_group_InstanceGroup5933); if (state.failed) return element;
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
                    a4=(Token)match(input,21,FOLLOW_21_in_parse_art_group_InstanceGroup5953); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4509:4: (a5= TEXT )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4510:5: a5= TEXT
                    {
                    a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup5979); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4544:4: ( (a6= ',' (a7= TEXT ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==24) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4545:5: (a6= ',' (a7= TEXT ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Compound
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4548:5: (a6= ',' (a7= TEXT ) )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4549:6: a6= ',' (a7= TEXT )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						// expected element is a CsString
                    	      					
                    	    }
                    	    a6=(Token)match(input,24,FOLLOW_24_in_parse_art_group_InstanceGroup6038); if (state.failed) return element;
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
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4563:6: (a7= TEXT )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4564:7: a7= TEXT
                    	    {
                    	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_group_InstanceGroup6072); if (state.failed) return element;
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
                    	    break loop38;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4607:2: ( ( (a8_0= parse_art_group_InstanceGroup ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==61) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4608:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Compound
            	      		
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4611:3: ( (a8_0= parse_art_group_InstanceGroup ) )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4612:4: (a8_0= parse_art_group_InstanceGroup )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				// expected element is a Terminal
            	      			
            	    }
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4615:4: (a8_0= parse_art_group_InstanceGroup )
            	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4616:5: a8_0= parse_art_group_InstanceGroup
            	    {
            	    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup6170);
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
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a9=(Token)match(input,26,FOLLOW_26_in_parse_art_group_InstanceGroup6209); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4651:1: parse_art_implem_OSGiType returns [art.implem.OSGiType element = null] : a0= 'OSGiType' a1= '<' a2= 'generateInstanceBundle' a3= ':' (a4= TEXT ) a5= '>' ;
    public final art.implem.OSGiType parse_art_implem_OSGiType() throws RecognitionException {
        art.implem.OSGiType element =  null;
        int parse_art_implem_OSGiType_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4654:1: (a0= 'OSGiType' a1= '<' a2= 'generateInstanceBundle' a3= ':' (a4= TEXT ) a5= '>' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4655:2: a0= 'OSGiType' a1= '<' a2= 'generateInstanceBundle' a3= ':' (a4= TEXT ) a5= '>'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,63,FOLLOW_63_in_parse_art_implem_OSGiType6238); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,51,FOLLOW_51_in_parse_art_implem_OSGiType6252); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a2=(Token)match(input,64,FOLLOW_64_in_parse_art_implem_OSGiType6266); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,21,FOLLOW_21_in_parse_art_implem_OSGiType6280); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4702:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4703:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_implem_OSGiType6298); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new art.resource.art.mopp.ArtTerminateParsingException();
              			}
              			if (element == null) {
              				element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
              			}
              			if (a4 != null) {
              				art.resource.art.IArtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				art.resource.art.IArtTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
              				}
              				java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,54,FOLLOW_54_in_parse_art_implem_OSGiType6319); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_art_implem_OSGiType_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_art_implem_OSGiType"


    // $ANTLR start "parse_art_type_BasicAttribute"
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4743:1: parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4746:1: (a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4747:2: a0= 'attribute' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,65,FOLLOW_65_in_parse_art_type_BasicAttribute6348); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4761:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4762:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute6366); if (state.failed) return element;
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
            a2=(Token)match(input,21,FOLLOW_21_in_parse_art_type_BasicAttribute6387); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4803:2: (a3= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4804:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_BasicAttribute6405); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4838:2: ( (a4= 'default' (a5= STRING_LITERAL ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4839:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4842:3: (a4= 'default' (a5= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4843:4: a4= 'default' (a5= STRING_LITERAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a4=(Token)match(input,66,FOLLOW_66_in_parse_art_type_BasicAttribute6444); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4857:4: (a5= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4858:5: a5= STRING_LITERAL
                    {
                    a5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute6470); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4890:1: parse_art_type_Dictionary returns [art.type.Dictionary element = null] : a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4893:1: (a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )? )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4894:2: a0= 'attribute' (a1= TEXT ) a2= ':' a3= '[' (a4= TEXT ) a5= '->' (a6= TEXT ) a7= ']' ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,65,FOLLOW_65_in_parse_art_type_Dictionary6526); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4908:2: (a1= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4909:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary6544); if (state.failed) return element;
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
            a2=(Token)match(input,21,FOLLOW_21_in_parse_art_type_Dictionary6565); if (state.failed) return element;
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
            a3=(Token)match(input,37,FOLLOW_37_in_parse_art_type_Dictionary6579); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4961:2: (a4= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:4962:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary6597); if (state.failed) return element;
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
            a5=(Token)match(input,38,FOLLOW_38_in_parse_art_type_Dictionary6618); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5007:2: (a6= TEXT )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5008:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_art_type_Dictionary6636); if (state.failed) return element;
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
            a7=(Token)match(input,39,FOLLOW_39_in_parse_art_type_Dictionary6657); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5053:2: ( (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==66) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5054:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5057:3: (a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}' )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5058:4: a8= 'default' a9= '{' ( (a10_0= parse_art_type_DictionaryDefaultValue ) )* a11= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a8=(Token)match(input,66,FOLLOW_66_in_parse_art_type_Dictionary6689); if (state.failed) return element;
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
                    a9=(Token)match(input,25,FOLLOW_25_in_parse_art_type_Dictionary6709); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5083:4: ( (a10_0= parse_art_type_DictionaryDefaultValue ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==37) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5084:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					// expected element is a Terminal
                    	      				
                    	    }
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5087:5: (a10_0= parse_art_type_DictionaryDefaultValue )
                    	    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5088:6: a10_0= parse_art_type_DictionaryDefaultValue
                    	    {
                    	    pushFollow(FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary6748);
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
                    	    break loop42;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected element after STAR or PLUS
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a11=(Token)match(input,26,FOLLOW_26_in_parse_art_type_Dictionary6793); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5124:1: parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null] : a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' ;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5127:1: (a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']' )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5128:2: a0= '[' (a1= STRING_LITERAL ) ( (a2= '->' (a3= STRING_LITERAL ) ) )? a4= ']'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_art_type_DictionaryDefaultValue6836); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5142:2: (a1= STRING_LITERAL )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5143:3: a1= STRING_LITERAL
            {
            a1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue6854); if (state.failed) return element;
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
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5173:2: ( (a2= '->' (a3= STRING_LITERAL ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5174:3: (a2= '->' (a3= STRING_LITERAL ) )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Compound
                      		
                    }
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5177:3: (a2= '->' (a3= STRING_LITERAL ) )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5178:4: a2= '->' (a3= STRING_LITERAL )
                    {
                    if ( state.backtracking==0 ) {

                      				// expected element is a CsString
                      			
                    }
                    a2=(Token)match(input,38,FOLLOW_38_in_parse_art_type_DictionaryDefaultValue6893); if (state.failed) return element;
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
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5192:4: (a3= STRING_LITERAL )
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5193:5: a3= STRING_LITERAL
                    {
                    a3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue6919); if (state.failed) return element;
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
            a4=(Token)match(input,39,FOLLOW_39_in_parse_art_type_DictionaryDefaultValue6960); if (state.failed) return element;
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5236:1: parse_art_type_Service returns [art.type.Service element = null] : (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService );
    public final art.type.Service parse_art_type_Service() throws RecognitionException {
        art.type.Service element =  null;
        int parse_art_type_Service_StartIndex = input.index();
        art.type.FunctionalService c0 = null;

        art.type.ControlService c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5237:1: (c0= parse_art_type_FunctionalService | c1= parse_art_type_ControlService )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            else if ( (LA45_0==47) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5238:2: c0= parse_art_type_FunctionalService
                    {
                    pushFollow(FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service6982);
                    c0=parse_art_type_FunctionalService();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5239:4: c1= parse_art_type_ControlService
                    {
                    pushFollow(FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service6992);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5243:1: parse_art_type_ComponentType returns [art.type.ComponentType element = null] : (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType );
    public final art.type.ComponentType parse_art_type_ComponentType() throws RecognitionException {
        art.type.ComponentType element =  null;
        int parse_art_type_ComponentType_StartIndex = input.index();
        art.type.PrimitiveType c0 = null;

        art.type.CompositeType c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5244:1: (c0= parse_art_type_PrimitiveType | c1= parse_art_type_CompositeType )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            else if ( (LA46_0==41) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5245:2: c0= parse_art_type_PrimitiveType
                    {
                    pushFollow(FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType7013);
                    c0=parse_art_type_PrimitiveType();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5246:4: c1= parse_art_type_CompositeType
                    {
                    pushFollow(FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType7023);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5250:1: parse_art_group_Group returns [art.group.Group element = null] : (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup );
    public final art.group.Group parse_art_group_Group() throws RecognitionException {
        art.group.Group element =  null;
        int parse_art_group_Group_StartIndex = input.index();
        art.group.TypeGroup c0 = null;

        art.group.InstanceGroup c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5251:1: (c0= parse_art_group_TypeGroup | c1= parse_art_group_InstanceGroup )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            else if ( (LA47_0==61) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5252:2: c0= parse_art_group_TypeGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group7044);
                    c0=parse_art_group_TypeGroup();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5253:4: c1= parse_art_group_InstanceGroup
                    {
                    pushFollow(FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group7054);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5257:1: parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null] : (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent );
    public final art.implem.ComponentImplementation parse_art_implem_ComponentImplementation() throws RecognitionException {
        art.implem.ComponentImplementation element =  null;
        int parse_art_implem_ComponentImplementation_StartIndex = input.index();
        art.implem.FractalComponent c0 = null;

        art.implem.OSGiComponent c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5258:1: (c0= parse_art_implem_FractalComponent | c1= parse_art_implem_OSGiComponent )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            else if ( (LA48_0==55) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5259:2: c0= parse_art_implem_FractalComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation7075);
                    c0=parse_art_implem_FractalComponent();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5260:4: c1= parse_art_implem_OSGiComponent
                    {
                    pushFollow(FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation7085);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5264:1: parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null] : (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute );
    public final art.instance.AttributeInstance parse_art_instance_AttributeInstance() throws RecognitionException {
        art.instance.AttributeInstance element =  null;
        int parse_art_instance_AttributeInstance_StartIndex = input.index();
        art.instance.ValuedAttribute c0 = null;

        art.instance.DictionaryValuedAttribute c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5265:1: (c0= parse_art_instance_ValuedAttribute | c1= parse_art_instance_DictionaryValuedAttribute )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==TEXT) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==36) ) {
                    int LA49_2 = input.LA(3);

                    if ( (LA49_2==STRING_LITERAL) ) {
                        alt49=1;
                    }
                    else if ( (LA49_2==EOF||LA49_2==TEXT||LA49_2==19||(LA49_2>=26 && LA49_2<=28)||LA49_2==35||LA49_2==37) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5266:2: c0= parse_art_instance_ValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance7106);
                    c0=parse_art_instance_ValuedAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5267:4: c1= parse_art_instance_DictionaryValuedAttribute
                    {
                    pushFollow(FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance7116);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5271:1: parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null] : (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance );
    public final art.instance.ComponentInstance parse_art_instance_ComponentInstance() throws RecognitionException {
        art.instance.ComponentInstance element =  null;
        int parse_art_instance_ComponentInstance_StartIndex = input.index();
        art.instance.PrimitiveInstance c0 = null;

        art.instance.CompositeInstance c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5272:1: (c0= parse_art_instance_PrimitiveInstance | c1= parse_art_instance_CompositeInstance )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                alt50=1;
            }
            else if ( (LA50_0==27) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5273:2: c0= parse_art_instance_PrimitiveInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance7137);
                    c0=parse_art_instance_PrimitiveInstance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5274:4: c1= parse_art_instance_CompositeInstance
                    {
                    pushFollow(FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance7147);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5278:1: parse_art_instance_Entry returns [art.instance.Entry element = null] : (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry );
    public final art.instance.Entry parse_art_instance_Entry() throws RecognitionException {
        art.instance.Entry element =  null;
        int parse_art_instance_Entry_StartIndex = input.index();
        art.instance.DefaultEntry c0 = null;

        art.instance.OtherEntry c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5279:1: (c0= parse_art_instance_DefaultEntry | c1= parse_art_instance_OtherEntry )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==TEXT) ) {
                    alt51=1;
                }
                else if ( (LA51_1==STRING_LITERAL) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5280:2: c0= parse_art_instance_DefaultEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry7168);
                    c0=parse_art_instance_DefaultEntry();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5281:4: c1= parse_art_instance_OtherEntry
                    {
                    pushFollow(FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry7178);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5285:1: parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null] : c0= parse_art_implem_OSGiType ;
    public final art.implem.TypeImplementation parse_art_implem_TypeImplementation() throws RecognitionException {
        art.implem.TypeImplementation element =  null;
        int parse_art_implem_TypeImplementation_StartIndex = input.index();
        art.implem.OSGiType c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5286:1: (c0= parse_art_implem_OSGiType )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5287:2: c0= parse_art_implem_OSGiType
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation7199);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5291:1: parse_art_type_Attribute returns [art.type.Attribute element = null] : (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary );
    public final art.type.Attribute parse_art_type_Attribute() throws RecognitionException {
        art.type.Attribute element =  null;
        int parse_art_type_Attribute_StartIndex = input.index();
        art.type.BasicAttribute c0 = null;

        art.type.Dictionary c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5292:1: (c0= parse_art_type_BasicAttribute | c1= parse_art_type_Dictionary )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==TEXT) ) {
                    int LA52_2 = input.LA(3);

                    if ( (LA52_2==21) ) {
                        int LA52_3 = input.LA(4);

                        if ( (LA52_3==37) ) {
                            alt52=2;
                        }
                        else if ( (LA52_3==TEXT) ) {
                            alt52=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5293:2: c0= parse_art_type_BasicAttribute
                    {
                    pushFollow(FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute7220);
                    c0=parse_art_type_BasicAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5294:4: c1= parse_art_type_Dictionary
                    {
                    pushFollow(FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute7230);
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
    // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5298:1: parse_art_implem_PortImplementation returns [art.implem.PortImplementation element = null] : c0= parse_art_implem_OSGiPort ;
    public final art.implem.PortImplementation parse_art_implem_PortImplementation() throws RecognitionException {
        art.implem.PortImplementation element =  null;
        int parse_art_implem_PortImplementation_StartIndex = input.index();
        art.implem.OSGiPort c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5299:1: (c0= parse_art_implem_OSGiPort )
            // /opt/eclipses/eclipse-modeling-galileo-incubation-linux-gtk-x86_64-DIVA_dev/workspace/art.resource.art/src-gen/art/resource/art/mopp/Art.g:5300:2: c0= parse_art_implem_OSGiPort
            {
            pushFollow(FOLLOW_parse_art_implem_OSGiPort_in_parse_art_implem_PortImplementation7251);
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
    public static final BitSet FOLLOW_15_in_parse_art_System119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_System137 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_art_System158 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_art_System172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_System190 = new BitSet(new long[]{0x2800A30000040002L});
    public static final BitSet FOLLOW_parse_art_type_Service_in_parse_art_System245 = new BitSet(new long[]{0x2800A30000040002L});
    public static final BitSet FOLLOW_parse_art_type_ComponentType_in_parse_art_System295 = new BitSet(new long[]{0x2800A30000040002L});
    public static final BitSet FOLLOW_parse_art_DataType_in_parse_art_System345 = new BitSet(new long[]{0x2800A30000040002L});
    public static final BitSet FOLLOW_parse_art_group_Group_in_parse_art_System395 = new BitSet(new long[]{0x2800A30000040002L});
    public static final BitSet FOLLOW_18_in_parse_art_DataType461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_DataType479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_art_DataType500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_art_instance_PrimitiveInstance529 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_art_instance_PrimitiveInstance543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance561 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_PrimitiveInstance582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_PrimitiveInstance625 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_PrimitiveInstance664 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_PrimitiveInstance690 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_PrimitiveInstance744 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_PrimitiveInstance764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance790 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_PrimitiveInstance849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_PrimitiveInstance883 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_PrimitiveInstance957 = new BitSet(new long[]{0x0000000014000010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_PrimitiveInstance1008 = new BitSet(new long[]{0x0000000014000010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_PrimitiveInstance1058 = new BitSet(new long[]{0x0000000014000010L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_PrimitiveInstance1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_art_instance_CompositeInstance1138 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_art_instance_CompositeInstance1152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1170 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_CompositeInstance1191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INSTANCE_STATE_in_parse_art_instance_CompositeInstance1234 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_22_in_parse_art_instance_CompositeInstance1273 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_ComponentImplementation_in_parse_art_instance_CompositeInstance1299 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_parse_art_instance_CompositeInstance1353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_instance_CompositeInstance1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1399 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_CompositeInstance1458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_CompositeInstance1492 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_parse_art_instance_CompositeInstance1566 = new BitSet(new long[]{0x000000081C080010L});
    public static final BitSet FOLLOW_parse_art_instance_AttributeInstance_in_parse_art_instance_CompositeInstance1617 = new BitSet(new long[]{0x000000081C080010L});
    public static final BitSet FOLLOW_parse_art_instance_TransmissionBinding_in_parse_art_instance_CompositeInstance1667 = new BitSet(new long[]{0x000000081C080010L});
    public static final BitSet FOLLOW_parse_art_instance_ComponentInstance_in_parse_art_instance_CompositeInstance1717 = new BitSet(new long[]{0x000000081C080010L});
    public static final BitSet FOLLOW_parse_art_instance_DelegationBinding_in_parse_art_instance_CompositeInstance1767 = new BitSet(new long[]{0x000000081C080010L});
    public static final BitSet FOLLOW_26_in_parse_art_instance_CompositeInstance1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_art_instance_TransmissionBinding1847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1865 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_TransmissionBinding1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1904 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_TransmissionBinding1925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_TransmissionBinding1943 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_TransmissionBinding1982 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_TransmissionBinding2002 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_TransmissionBinding2022 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_TransmissionBinding2048 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_TransmissionBinding2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_art_instance_DelegationBinding2124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2142 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_art_instance_DelegationBinding2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2181 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_art_instance_DelegationBinding2202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DelegationBinding2220 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_parse_art_instance_DelegationBinding2259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_art_instance_DelegationBinding2279 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_art_instance_DelegationBinding2299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DelegationBinding2325 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_art_instance_DelegationBinding2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_ValuedAttribute2405 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_ValuedAttribute2426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_ValuedAttribute2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DictionaryValuedAttribute2484 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_art_instance_DictionaryValuedAttribute2505 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2543 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_art_instance_DictionaryValuedAttribute2597 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_parse_art_instance_Entry_in_parse_art_instance_DictionaryValuedAttribute2631 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_DefaultEntry2713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_instance_DefaultEntry2731 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_DefaultEntry2752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_DefaultEntry2770 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_DefaultEntry2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_instance_OtherEntry2820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2838 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_instance_OtherEntry2859 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_instance_OtherEntry2877 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_instance_OtherEntry2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_art_type_PrimitiveType2927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType2945 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_PrimitiveType2984 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_PrimitiveType3010 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_PrimitiveType3064 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_PrimitiveType3084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType3110 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_PrimitiveType3169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_PrimitiveType3203 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_PrimitiveType3277 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_PrimitiveType3315 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_PrimitiveType3357 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_art_type_PrimitiveType3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_art_type_CompositeType3425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType3443 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_22_in_parse_art_type_CompositeType3482 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_TypeImplementation_in_parse_art_type_CompositeType3508 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_parse_art_type_CompositeType3562 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_CompositeType3582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType3608 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_CompositeType3667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_CompositeType3701 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_CompositeType3775 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Port_in_parse_art_type_CompositeType3813 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Attribute_in_parse_art_type_CompositeType3855 = new BitSet(new long[]{0x0000000004000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_art_type_CompositeType3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_art_type_Operation3923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Operation3941 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_art_type_Operation3962 = new BitSet(new long[]{0x0000180401000000L});
    public static final BitSet FOLLOW_43_in_parse_art_type_Operation3994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4020 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_Operation4056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4082 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_parse_art_type_Operation4136 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_parse_art_type_Operation4168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4198 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_44_in_parse_art_type_Operation4241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_art_type_Parameter_in_parse_art_type_Operation4271 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_parse_art_type_Operation4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter4355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_Parameter4376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Parameter4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_art_type_FunctionalService4430 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_art_type_FunctionalService4444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_FunctionalService4462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_FunctionalService4483 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_FunctionalService4521 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_FunctionalService4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_art_type_ControlService4589 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_art_type_ControlService4603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_ControlService4621 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_ControlService4642 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_parse_art_type_Operation_in_parse_art_type_ControlService4680 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_ControlService4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_PORT_KIND_in_parse_art_type_Port4752 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_T_OPTIONAL_in_parse_art_type_Port4797 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_parse_art_type_Port4838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port4856 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_Port4877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Port4895 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Port4916 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_parse_art_type_Port4934 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_art_type_Port4955 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_parse_art_type_Port4973 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Port4994 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_parse_art_type_Port5026 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_parse_art_implem_PortImplementation_in_parse_art_type_Port5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_parse_art_implem_FractalComponent5103 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_FractalComponent5117 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_art_implem_FractalComponent5131 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_implem_FractalComponent5145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent5163 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_art_implem_FractalComponent5184 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_implem_FractalComponent5198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_FractalComponent5216 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_FractalComponent5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_parse_art_implem_OSGiComponent5266 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_OSGiComponent5280 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_art_implem_OSGiComponent5294 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_implem_OSGiComponent5308 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiComponent5326 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_OSGiComponent5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_parse_art_implem_OSGiPort5376 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_OSGiPort5390 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_art_implem_OSGiPort5404 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_implem_OSGiPort5418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_implem_OSGiPort5436 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_OSGiPort5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_parse_art_group_TypeGroup5486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup5504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_TypeGroup5525 = new BitSet(new long[]{0x1800000004000000L});
    public static final BitSet FOLLOW_60_in_parse_art_group_TypeGroup5557 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_group_TypeGroup5577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup5603 = new BitSet(new long[]{0x0800000005000000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_TypeGroup5662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_TypeGroup5696 = new BitSet(new long[]{0x0800000005000000L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_TypeGroup5794 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_group_TypeGroup5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_parse_art_group_InstanceGroup5862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup5880 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_group_InstanceGroup5901 = new BitSet(new long[]{0x6800A30004040000L});
    public static final BitSet FOLLOW_62_in_parse_art_group_InstanceGroup5933 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_group_InstanceGroup5953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup5979 = new BitSet(new long[]{0x2800A30005040000L});
    public static final BitSet FOLLOW_24_in_parse_art_group_InstanceGroup6038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_group_InstanceGroup6072 = new BitSet(new long[]{0x2800A30005040000L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_InstanceGroup6170 = new BitSet(new long[]{0x2800A30004040000L});
    public static final BitSet FOLLOW_26_in_parse_art_group_InstanceGroup6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_parse_art_implem_OSGiType6238 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_art_implem_OSGiType6252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parse_art_implem_OSGiType6266 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_implem_OSGiType6280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_implem_OSGiType6298 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_art_implem_OSGiType6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parse_art_type_BasicAttribute6348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute6366 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_BasicAttribute6387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_BasicAttribute6405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_art_type_BasicAttribute6444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_BasicAttribute6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parse_art_type_Dictionary6526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary6544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_art_type_Dictionary6565 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_art_type_Dictionary6579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary6597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_Dictionary6618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_art_type_Dictionary6636 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_Dictionary6657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_art_type_Dictionary6689 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_art_type_Dictionary6709 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_parse_art_type_DictionaryDefaultValue_in_parse_art_type_Dictionary6748 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_26_in_parse_art_type_Dictionary6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_art_type_DictionaryDefaultValue6836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue6854 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_parse_art_type_DictionaryDefaultValue6893 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_art_type_DictionaryDefaultValue6919 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_art_type_DictionaryDefaultValue6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_FunctionalService_in_parse_art_type_Service6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_ControlService_in_parse_art_type_Service6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_PrimitiveType_in_parse_art_type_ComponentType7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_CompositeType_in_parse_art_type_ComponentType7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_TypeGroup_in_parse_art_group_Group7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_group_InstanceGroup_in_parse_art_group_Group7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_FractalComponent_in_parse_art_implem_ComponentImplementation7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiComponent_in_parse_art_implem_ComponentImplementation7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_ValuedAttribute_in_parse_art_instance_AttributeInstance7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DictionaryValuedAttribute_in_parse_art_instance_AttributeInstance7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_PrimitiveInstance_in_parse_art_instance_ComponentInstance7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_CompositeInstance_in_parse_art_instance_ComponentInstance7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_DefaultEntry_in_parse_art_instance_Entry7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_instance_OtherEntry_in_parse_art_instance_Entry7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiType_in_parse_art_implem_TypeImplementation7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_BasicAttribute_in_parse_art_type_Attribute7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_type_Dictionary_in_parse_art_type_Attribute7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_art_implem_OSGiPort_in_parse_art_implem_PortImplementation7251 = new BitSet(new long[]{0x0000000000000002L});

}