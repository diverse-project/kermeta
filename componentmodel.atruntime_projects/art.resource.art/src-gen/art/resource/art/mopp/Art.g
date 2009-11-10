grammar Art;

options {
	superClass = ArtANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package art.resource.art.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition       = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package art.resource.art.mopp;
}

@members{
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
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
	}
	(
		{
		}
		c0 = parse_art_System{ element = c0; }
	)
	EOF	
;

parse_art_System returns [art.System element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'system' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = 'root' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4_0 = parse_art_instance_CompositeInstance		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Compound
			}
			(
				{
					// expected element is a Terminal
				}
				(
					a5_0 = parse_art_type_Service					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a6_0 = parse_art_type_ComponentType					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a7_0 = parse_art_DataType					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a8_0 = parse_art_group_Group					{
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
				)
				
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
;

parse_art_DataType returns [art.DataType element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'datatype' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
;

parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'primitive' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = TEXT		
		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a5 = T_INSTANCE_STATE		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a7_0 = parse_art_implem_ComponentImplementation				{
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
			)
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a8 = 'groups' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			
			{
				// expected element is a CsString
			}
			a9 = ':' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a10 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a11 = ',' {
						if (element == null) {
							element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a11, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a12 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a13 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a13, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Compound
			}
			(
				{
					// expected element is a Terminal
				}
				(
					a14_0 = parse_art_instance_AttributeInstance					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a15_0 = parse_art_instance_TransmissionBinding					{
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
				)
				
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a16 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a16, element);
	}
	
;

parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'composite' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = TEXT		
		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a5 = T_INSTANCE_STATE		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a7_0 = parse_art_implem_ComponentImplementation				{
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
			)
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a8 = 'groups' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			
			{
				// expected element is a CsString
			}
			a9 = ':' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a10 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a11 = ',' {
						if (element == null) {
							element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a11, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a12 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a13 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a13, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Compound
			}
			(
				{
					// expected element is a Terminal
				}
				(
					a14_0 = parse_art_instance_AttributeInstance					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a15_0 = parse_art_instance_TransmissionBinding					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a16_0 = parse_art_instance_ComponentInstance					{
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
				)
				
				
				|				{
					// expected element is a Terminal
				}
				(
					a17_0 = parse_art_instance_DelegationBinding					{
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
				)
				
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a18 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a18, element);
	}
	
;

parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'bind' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a5 = TEXT		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			
			{
				// expected element is a CsString
			}
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			
			{
				// expected element is a CsString
			}
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a9 = STRING_LITERAL				
				{
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
			)
			
			{
				// expected element is a CsString
			}
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			
		)
		
	)?	
;

parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'delegate' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a5 = TEXT		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			
			{
				// expected element is a CsString
			}
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			
			{
				// expected element is a CsString
			}
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a9 = STRING_LITERAL				
				{
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
			)
			
			{
				// expected element is a CsString
			}
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			
		)
		
	)?	
;

parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = STRING_LITERAL		
		{
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
	)
	
;

parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a2_0 = parse_art_instance_Entry				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a3 = ',' {
						if (element == null) {
							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a3, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a4_0 = parse_art_instance_Entry						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
;

parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'type' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a3_0 = parse_art_implem_TypeImplementation				{
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
			)
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a4 = 'groups' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			{
				// expected element is a CsString
			}
			a5 = ':' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a6 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a7 = ',' {
						if (element == null) {
							element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a7, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a8 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a9 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a10_0 = parse_art_type_Port				{
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
			)
			
			
			|			{
				// expected element is a Terminal
			}
			(
				a11_0 = parse_art_type_Attribute				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a12 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a12, element);
	}
	
;

parse_art_type_CompositeType returns [art.type.CompositeType element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'compositetype' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a3_0 = parse_art_implem_TypeImplementation				{
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
			)
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a4 = 'groups' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			{
				// expected element is a CsString
			}
			a5 = ':' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a6 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a7 = ',' {
						if (element == null) {
							element = art.type.TypeFactory.eINSTANCE.createCompositeType();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a7, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a8 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a9 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a10_0 = parse_art_type_Port				{
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
			)
			
			
			|			{
				// expected element is a Terminal
			}
			(
				a11_0 = parse_art_type_Attribute				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a12 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a12, element);
	}
	
;

parse_art_type_Operation returns [art.type.Operation element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'operation' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = '(' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a3 = 'in' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a4_0 = parse_art_type_Parameter				{
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
			)
			
			
			|			{
				// expected element is a CsString
			}
			a5 = 'out' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a6_0 = parse_art_type_Parameter				{
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
			)
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a7 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			
			{
				// expected element is a Compound
			}
			(
				{
					// expected element is a CsString
				}
				a8 = 'in' {
					if (element == null) {
						element = art.type.TypeFactory.eINSTANCE.createOperation();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken)a8, element);
				}
				
				{
					// expected element is a Terminal
				}
				(
					a9_0 = parse_art_type_Parameter					{
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
				)
				
				
				|				{
					// expected element is a CsString
				}
				a10 = 'out' {
					if (element == null) {
						element = art.type.TypeFactory.eINSTANCE.createOperation();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken)a10, element);
				}
				
				{
					// expected element is a Terminal
				}
				(
					a11_0 = parse_art_type_Parameter					{
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
				)
				
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a12 = ')' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a12, element);
	}
	
;

parse_art_type_Parameter returns [art.type.Parameter element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a1 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createParameter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = TEXT		
		{
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
	)
	
;

parse_art_type_FunctionalService returns [art.type.FunctionalService element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'functional' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a4_0 = parse_art_type_Operation				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_art_type_ControlService returns [art.type.ControlService element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'control' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a4_0 = parse_art_type_Operation				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_art_type_Port returns [art.type.Port element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = T_PORT_KIND		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a1 = T_OPTIONAL				
				{
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
			)
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a2 = 'port' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a5 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a6 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a7 = INTEGER		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a8 = '..' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a9 = INTEGER		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a10 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a11 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a12_0 = parse_art_implem_PortImplementation				{
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
			)
			
		)
		
	)?	
;

parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'FractalComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a CsString
	}
	a2 = 'controllerDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = 'contentDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
	{
		// expected element is a CsString
	}
	a6 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a7 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a8 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	
;

parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'OSGiComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a CsString
	}
	a2 = 'implementingClass' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_art_implem_OSGiPort returns [art.implem.OSGiPort element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'OSGiPort' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a CsString
	}
	a2 = 'serviceId' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_art_group_TypeGroup returns [art.group.TypeGroup element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'typegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a3 = 'types' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			{
				// expected element is a CsString
			}
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a5 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a6, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a7 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a8_0 = parse_art_group_TypeGroup				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	
;

parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'instancegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a3 = 'instances' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			{
				// expected element is a CsString
			}
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a5 = TEXT				
				{
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
			)
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Compound
				}
				(
					{
						// expected element is a CsString
					}
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((CommonToken)a6, element);
					}
					
					{
						// expected element is a Terminal
					}
					(
						a7 = TEXT						
						{
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
					)
					
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a Terminal
			}
			(
				a8_0 = parse_art_group_InstanceGroup				{
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
			)
			
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	
;

parse_art_implem_OSGiType returns [art.implem.OSGiType element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'OSGiType' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a CsString
	}
	a2 = 'generateInstanceBundle' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a3 = TEXT		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a4 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a5 = STRING_LITERAL				
				{
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
			)
			
		)
		
	)?	
;

parse_art_type_Dictionary returns [art.type.Dictionary element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	{
		// expected element is a CsString
	}
	a3 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = '->' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a6 = TEXT		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a7 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a8 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			
			{
				// expected element is a CsString
			}
			a9 = '{' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			
			{
				// expected element before STAR or QUESTIONMARK or PLUS
			}
			(
				{
					// expected element is a Terminal
				}
				(
					a10_0 = parse_art_type_DictionaryDefaultValue					{
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
				)
				
			)*			{
				// expected element after STAR or PLUS
			}
			
			{
				// expected element is a CsString
			}
			a11 = '}' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			
		)
		
	)?	
;

parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1 = STRING_LITERAL		
		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Compound
		}
		(
			{
				// expected element is a CsString
			}
			a2 = '->' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			
			{
				// expected element is a Terminal
			}
			(
				a3 = STRING_LITERAL				
				{
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
			)
			
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a4 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_art_type_Service returns [art.type.Service element = null]
:
	c0 = parse_art_type_FunctionalService{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_type_ControlService{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_type_ComponentType returns [art.type.ComponentType element = null]
:
	c0 = parse_art_type_PrimitiveType{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_type_CompositeType{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_group_Group returns [art.group.Group element = null]
:
	c0 = parse_art_group_TypeGroup{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_group_InstanceGroup{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null]
:
	c0 = parse_art_implem_FractalComponent{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_implem_OSGiComponent{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null]
:
	c0 = parse_art_instance_ValuedAttribute{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_instance_DictionaryValuedAttribute{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null]
:
	c0 = parse_art_instance_PrimitiveInstance{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_instance_CompositeInstance{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_instance_Entry returns [art.instance.Entry element = null]
:
	c0 = parse_art_instance_DefaultEntry{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_instance_OtherEntry{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null]
:
	c0 = parse_art_implem_OSGiType{ element = c0; /* this is a subclass choice */ }
	
;

parse_art_type_Attribute returns [art.type.Attribute element = null]
:
	c0 = parse_art_type_BasicAttribute{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_type_Dictionary{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_implem_PortImplementation returns [art.implem.PortImplementation element = null]
:
	c0 = parse_art_implem_OSGiPort{ element = c0; /* this is a subclass choice */ }
	
;

SL_COMMENT:
	'//'(~('\n'|'\r'|'\uffff'))* 
	{ _channel = 99; }
;
ML_COMMENT:
	'/*'.*'*/'	{ _channel = 99; }
;
ANNOTATION:
	'@'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+	{ _channel = 99; }
;
STRING_LITERAL:
	'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"';
T_INSTANCE_STATE:
	'#ON'|'#OFF';
T_PORT_KIND:
	'provided'|'required';
T_OPTIONAL:
	'optional';
WHITESPACE:
	(' '|'\t'|'\f')
	{ _channel = 99; }
;
LINEBREAKS:
	('\r\n'|'\r'|'\n')
	{ _channel = 99; }
;
INTEGER:
	('-'? ('0'..'9')+ )
;
TEXT:
	('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*;
