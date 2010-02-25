grammar Logo;

options {
	superClass = LogoANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;
}

@members{
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory tokenResolverFactory = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolverFactory();
	@SuppressWarnings("unused")
	
	private int lastPosition;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolveResult tokenResolveResult = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolveResult();
	private boolean rememberExpectedElements = false;
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	private java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal>();
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	//helper lists to allow a lexer to pass errors to its parser
	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>> postParseCommands;
	private boolean terminateParsing;
	private int tokenIndexOfLastCompleteElement;
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>() {
			public boolean execute(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.addProblem(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoProblem() {
					public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType getType() {
						return org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoMapUtil.castToEMap(value);
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
			assert(object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoDummyEObject);
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoDummyEObject dummy = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>() {
			public boolean execute(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>() {
			public boolean execute(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoLocationMap locationMap = resource.getLocationMap();
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
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new LogoParser(new org.antlr.runtime.CommonTokenStream(new LogoLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
			} else {
				return new LogoParser(new org.antlr.runtime.CommonTokenStream(new LogoLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	// This default constructor is only used to call createInstance() on it
	public LogoParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((LogoLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((LogoLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater();
			}
			if (type.getInstanceClass() == org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower.class) {
				return parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower();
			}
		}
		throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoUnexpectedContentTypeException(typeObject);
	}
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolveResult getFreshTokenResolveResult() {
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
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation getMetaInformation() {
		return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	// Implementation that calls {@link #doParse()}  and handles the thrown
	// RecognitionExceptions.
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>>();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParseResult parseResult = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoParseResult();
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
	
	public java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoParseResult result = parse();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal>();
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 185;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected terminals
				// can be set
				for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are kept
				for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement newFollower : newFollowers) {
							org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal newFollowTerminal = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(newFollower, followSetID);
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
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal expectedElement, int tokenIndex) {
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
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoCommand<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource>() {
			public boolean execute(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
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
				tokenName = org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoStringUtil.formatTokenName(tokenName);
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
	
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_0 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("{");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_1 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("[");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_2 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Back");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_3 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getConstant().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE), "INTEGER");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_4 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("$");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_5 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getProcCall().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION), "TEXT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_6 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(":");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_7 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_8 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("+(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_9 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_10 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("-(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_11 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_12 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("*(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_13 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_14 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("/(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_15 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_16 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("=(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_17 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_18 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(">(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_19 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_20 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("<(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_21 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("BACK");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_22 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Forward");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_23 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("fd");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_24 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("FORWARD");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_25 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Left");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_26 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("LEFT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_27 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Right");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_28 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("rt");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_29 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("RIGHT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_30 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("PenDown");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_31 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("PENDOWN");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_32 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("PenUp");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_33 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("PENUP");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_34 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Clear");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_35 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("CLEAR");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_36 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("to");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_37 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("TO");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_38 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("If");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_39 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("IF");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_40 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("ifelse");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_41 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("IFELSE");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_42 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("Repeat");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_43 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("REPEAT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_44 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("While");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_45 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("WHILE");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_46 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("}");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_47 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("]");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_48 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_49 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_50 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("then");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_51 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("THEN");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_52 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("+");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_53 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("-");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_54 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("*");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_55 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("/");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_56 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("=");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_57 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(">");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_58 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("<");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_59 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("(");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_60 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getProcDeclaration().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME), "TEXT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_61 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(":");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_62 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("end");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_63 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("END");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_64 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("else");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_65 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString("ELSE");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_66 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getParameter().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME), "TEXT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_67 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.eINSTANCE.getParameterCall().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER), "TEXT");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_68 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_69 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_70 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_71 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_72 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_73 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_74 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_75 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_76 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_77 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_78 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_79 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_80 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_81 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_82 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_83 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_84 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_85 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_86 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_87 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(",");
	private final static org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoExpectedElement TERMINAL_88 = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedCsString(")");
	
	public static void wire0() {
		TERMINAL_2.addFollower(TERMINAL_3);
		TERMINAL_2.addFollower(TERMINAL_4);
		TERMINAL_2.addFollower(TERMINAL_5);
		TERMINAL_2.addFollower(TERMINAL_6);
		TERMINAL_2.addFollower(TERMINAL_7);
		TERMINAL_2.addFollower(TERMINAL_8);
		TERMINAL_2.addFollower(TERMINAL_9);
		TERMINAL_2.addFollower(TERMINAL_10);
		TERMINAL_2.addFollower(TERMINAL_11);
		TERMINAL_2.addFollower(TERMINAL_12);
		TERMINAL_2.addFollower(TERMINAL_13);
		TERMINAL_2.addFollower(TERMINAL_14);
		TERMINAL_2.addFollower(TERMINAL_15);
		TERMINAL_2.addFollower(TERMINAL_16);
		TERMINAL_2.addFollower(TERMINAL_17);
		TERMINAL_2.addFollower(TERMINAL_18);
		TERMINAL_2.addFollower(TERMINAL_19);
		TERMINAL_2.addFollower(TERMINAL_20);
		TERMINAL_21.addFollower(TERMINAL_3);
		TERMINAL_21.addFollower(TERMINAL_4);
		TERMINAL_21.addFollower(TERMINAL_5);
		TERMINAL_21.addFollower(TERMINAL_6);
		TERMINAL_21.addFollower(TERMINAL_7);
		TERMINAL_21.addFollower(TERMINAL_8);
		TERMINAL_21.addFollower(TERMINAL_9);
		TERMINAL_21.addFollower(TERMINAL_10);
		TERMINAL_21.addFollower(TERMINAL_11);
		TERMINAL_21.addFollower(TERMINAL_12);
		TERMINAL_21.addFollower(TERMINAL_13);
		TERMINAL_21.addFollower(TERMINAL_14);
		TERMINAL_21.addFollower(TERMINAL_15);
		TERMINAL_21.addFollower(TERMINAL_16);
		TERMINAL_21.addFollower(TERMINAL_17);
		TERMINAL_21.addFollower(TERMINAL_18);
		TERMINAL_21.addFollower(TERMINAL_19);
		TERMINAL_21.addFollower(TERMINAL_20);
		TERMINAL_22.addFollower(TERMINAL_3);
		TERMINAL_22.addFollower(TERMINAL_4);
		TERMINAL_22.addFollower(TERMINAL_5);
		TERMINAL_22.addFollower(TERMINAL_6);
		TERMINAL_22.addFollower(TERMINAL_7);
		TERMINAL_22.addFollower(TERMINAL_8);
		TERMINAL_22.addFollower(TERMINAL_9);
		TERMINAL_22.addFollower(TERMINAL_10);
		TERMINAL_22.addFollower(TERMINAL_11);
		TERMINAL_22.addFollower(TERMINAL_12);
		TERMINAL_22.addFollower(TERMINAL_13);
		TERMINAL_22.addFollower(TERMINAL_14);
		TERMINAL_22.addFollower(TERMINAL_15);
		TERMINAL_22.addFollower(TERMINAL_16);
		TERMINAL_22.addFollower(TERMINAL_17);
		TERMINAL_22.addFollower(TERMINAL_18);
		TERMINAL_22.addFollower(TERMINAL_19);
		TERMINAL_22.addFollower(TERMINAL_20);
		TERMINAL_23.addFollower(TERMINAL_3);
		TERMINAL_23.addFollower(TERMINAL_4);
		TERMINAL_23.addFollower(TERMINAL_5);
		TERMINAL_23.addFollower(TERMINAL_6);
		TERMINAL_23.addFollower(TERMINAL_7);
		TERMINAL_23.addFollower(TERMINAL_8);
		TERMINAL_23.addFollower(TERMINAL_9);
		TERMINAL_23.addFollower(TERMINAL_10);
		TERMINAL_23.addFollower(TERMINAL_11);
		TERMINAL_23.addFollower(TERMINAL_12);
		TERMINAL_23.addFollower(TERMINAL_13);
		TERMINAL_23.addFollower(TERMINAL_14);
		TERMINAL_23.addFollower(TERMINAL_15);
		TERMINAL_23.addFollower(TERMINAL_16);
		TERMINAL_23.addFollower(TERMINAL_17);
		TERMINAL_23.addFollower(TERMINAL_18);
		TERMINAL_23.addFollower(TERMINAL_19);
		TERMINAL_23.addFollower(TERMINAL_20);
		TERMINAL_24.addFollower(TERMINAL_3);
		TERMINAL_24.addFollower(TERMINAL_4);
		TERMINAL_24.addFollower(TERMINAL_5);
		TERMINAL_24.addFollower(TERMINAL_6);
		TERMINAL_24.addFollower(TERMINAL_7);
		TERMINAL_24.addFollower(TERMINAL_8);
		TERMINAL_24.addFollower(TERMINAL_9);
		TERMINAL_24.addFollower(TERMINAL_10);
		TERMINAL_24.addFollower(TERMINAL_11);
		TERMINAL_24.addFollower(TERMINAL_12);
		TERMINAL_24.addFollower(TERMINAL_13);
		TERMINAL_24.addFollower(TERMINAL_14);
		TERMINAL_24.addFollower(TERMINAL_15);
		TERMINAL_24.addFollower(TERMINAL_16);
		TERMINAL_24.addFollower(TERMINAL_17);
		TERMINAL_24.addFollower(TERMINAL_18);
		TERMINAL_24.addFollower(TERMINAL_19);
		TERMINAL_24.addFollower(TERMINAL_20);
		TERMINAL_25.addFollower(TERMINAL_3);
		TERMINAL_25.addFollower(TERMINAL_4);
		TERMINAL_25.addFollower(TERMINAL_5);
		TERMINAL_25.addFollower(TERMINAL_6);
		TERMINAL_25.addFollower(TERMINAL_7);
		TERMINAL_25.addFollower(TERMINAL_8);
		TERMINAL_25.addFollower(TERMINAL_9);
		TERMINAL_25.addFollower(TERMINAL_10);
		TERMINAL_25.addFollower(TERMINAL_11);
		TERMINAL_25.addFollower(TERMINAL_12);
		TERMINAL_25.addFollower(TERMINAL_13);
		TERMINAL_25.addFollower(TERMINAL_14);
		TERMINAL_25.addFollower(TERMINAL_15);
		TERMINAL_25.addFollower(TERMINAL_16);
		TERMINAL_25.addFollower(TERMINAL_17);
		TERMINAL_25.addFollower(TERMINAL_18);
		TERMINAL_25.addFollower(TERMINAL_19);
		TERMINAL_25.addFollower(TERMINAL_20);
		TERMINAL_26.addFollower(TERMINAL_3);
		TERMINAL_26.addFollower(TERMINAL_4);
		TERMINAL_26.addFollower(TERMINAL_5);
		TERMINAL_26.addFollower(TERMINAL_6);
		TERMINAL_26.addFollower(TERMINAL_7);
		TERMINAL_26.addFollower(TERMINAL_8);
		TERMINAL_26.addFollower(TERMINAL_9);
		TERMINAL_26.addFollower(TERMINAL_10);
		TERMINAL_26.addFollower(TERMINAL_11);
		TERMINAL_26.addFollower(TERMINAL_12);
		TERMINAL_26.addFollower(TERMINAL_13);
		TERMINAL_26.addFollower(TERMINAL_14);
		TERMINAL_26.addFollower(TERMINAL_15);
		TERMINAL_26.addFollower(TERMINAL_16);
		TERMINAL_26.addFollower(TERMINAL_17);
		TERMINAL_26.addFollower(TERMINAL_18);
		TERMINAL_26.addFollower(TERMINAL_19);
		TERMINAL_26.addFollower(TERMINAL_20);
		TERMINAL_27.addFollower(TERMINAL_3);
		TERMINAL_27.addFollower(TERMINAL_4);
		TERMINAL_27.addFollower(TERMINAL_5);
		TERMINAL_27.addFollower(TERMINAL_6);
		TERMINAL_27.addFollower(TERMINAL_7);
		TERMINAL_27.addFollower(TERMINAL_8);
		TERMINAL_27.addFollower(TERMINAL_9);
		TERMINAL_27.addFollower(TERMINAL_10);
		TERMINAL_27.addFollower(TERMINAL_11);
		TERMINAL_27.addFollower(TERMINAL_12);
		TERMINAL_27.addFollower(TERMINAL_13);
		TERMINAL_27.addFollower(TERMINAL_14);
		TERMINAL_27.addFollower(TERMINAL_15);
		TERMINAL_27.addFollower(TERMINAL_16);
		TERMINAL_27.addFollower(TERMINAL_17);
		TERMINAL_27.addFollower(TERMINAL_18);
		TERMINAL_27.addFollower(TERMINAL_19);
		TERMINAL_27.addFollower(TERMINAL_20);
		TERMINAL_28.addFollower(TERMINAL_3);
		TERMINAL_28.addFollower(TERMINAL_4);
		TERMINAL_28.addFollower(TERMINAL_5);
		TERMINAL_28.addFollower(TERMINAL_6);
		TERMINAL_28.addFollower(TERMINAL_7);
		TERMINAL_28.addFollower(TERMINAL_8);
		TERMINAL_28.addFollower(TERMINAL_9);
		TERMINAL_28.addFollower(TERMINAL_10);
		TERMINAL_28.addFollower(TERMINAL_11);
		TERMINAL_28.addFollower(TERMINAL_12);
		TERMINAL_28.addFollower(TERMINAL_13);
		TERMINAL_28.addFollower(TERMINAL_14);
		TERMINAL_28.addFollower(TERMINAL_15);
		TERMINAL_28.addFollower(TERMINAL_16);
		TERMINAL_28.addFollower(TERMINAL_17);
		TERMINAL_28.addFollower(TERMINAL_18);
		TERMINAL_28.addFollower(TERMINAL_19);
		TERMINAL_28.addFollower(TERMINAL_20);
		TERMINAL_29.addFollower(TERMINAL_3);
		TERMINAL_29.addFollower(TERMINAL_4);
		TERMINAL_29.addFollower(TERMINAL_5);
		TERMINAL_29.addFollower(TERMINAL_6);
		TERMINAL_29.addFollower(TERMINAL_7);
		TERMINAL_29.addFollower(TERMINAL_8);
		TERMINAL_29.addFollower(TERMINAL_9);
		TERMINAL_29.addFollower(TERMINAL_10);
		TERMINAL_29.addFollower(TERMINAL_11);
		TERMINAL_29.addFollower(TERMINAL_12);
		TERMINAL_29.addFollower(TERMINAL_13);
		TERMINAL_29.addFollower(TERMINAL_14);
		TERMINAL_29.addFollower(TERMINAL_15);
		TERMINAL_29.addFollower(TERMINAL_16);
		TERMINAL_29.addFollower(TERMINAL_17);
		TERMINAL_29.addFollower(TERMINAL_18);
		TERMINAL_29.addFollower(TERMINAL_19);
		TERMINAL_29.addFollower(TERMINAL_20);
		TERMINAL_30.addFollower(TERMINAL_2);
		TERMINAL_30.addFollower(TERMINAL_21);
		TERMINAL_30.addFollower(TERMINAL_22);
		TERMINAL_30.addFollower(TERMINAL_23);
		TERMINAL_30.addFollower(TERMINAL_24);
		TERMINAL_30.addFollower(TERMINAL_25);
		TERMINAL_30.addFollower(TERMINAL_26);
		TERMINAL_30.addFollower(TERMINAL_27);
		TERMINAL_30.addFollower(TERMINAL_28);
		TERMINAL_30.addFollower(TERMINAL_29);
		TERMINAL_30.addFollower(TERMINAL_30);
		TERMINAL_30.addFollower(TERMINAL_31);
		TERMINAL_30.addFollower(TERMINAL_32);
		TERMINAL_30.addFollower(TERMINAL_33);
		TERMINAL_30.addFollower(TERMINAL_34);
		TERMINAL_30.addFollower(TERMINAL_35);
		TERMINAL_30.addFollower(TERMINAL_3);
		TERMINAL_30.addFollower(TERMINAL_4);
		TERMINAL_30.addFollower(TERMINAL_5);
		TERMINAL_30.addFollower(TERMINAL_36);
		TERMINAL_30.addFollower(TERMINAL_37);
		TERMINAL_30.addFollower(TERMINAL_0);
		TERMINAL_30.addFollower(TERMINAL_1);
		TERMINAL_30.addFollower(TERMINAL_38);
		TERMINAL_30.addFollower(TERMINAL_39);
		TERMINAL_30.addFollower(TERMINAL_40);
		TERMINAL_30.addFollower(TERMINAL_41);
		TERMINAL_30.addFollower(TERMINAL_6);
		TERMINAL_30.addFollower(TERMINAL_7);
		TERMINAL_30.addFollower(TERMINAL_8);
		TERMINAL_30.addFollower(TERMINAL_9);
		TERMINAL_30.addFollower(TERMINAL_10);
		TERMINAL_30.addFollower(TERMINAL_11);
		TERMINAL_30.addFollower(TERMINAL_12);
		TERMINAL_30.addFollower(TERMINAL_13);
		TERMINAL_30.addFollower(TERMINAL_14);
		TERMINAL_30.addFollower(TERMINAL_15);
		TERMINAL_30.addFollower(TERMINAL_16);
		TERMINAL_30.addFollower(TERMINAL_17);
		TERMINAL_30.addFollower(TERMINAL_18);
		TERMINAL_30.addFollower(TERMINAL_19);
		TERMINAL_30.addFollower(TERMINAL_20);
		TERMINAL_30.addFollower(TERMINAL_42);
		TERMINAL_30.addFollower(TERMINAL_43);
		TERMINAL_30.addFollower(TERMINAL_44);
		TERMINAL_30.addFollower(TERMINAL_45);
		TERMINAL_30.addFollower(TERMINAL_46);
		TERMINAL_30.addFollower(TERMINAL_47);
		TERMINAL_31.addFollower(TERMINAL_2);
		TERMINAL_31.addFollower(TERMINAL_21);
		TERMINAL_31.addFollower(TERMINAL_22);
		TERMINAL_31.addFollower(TERMINAL_23);
		TERMINAL_31.addFollower(TERMINAL_24);
		TERMINAL_31.addFollower(TERMINAL_25);
		TERMINAL_31.addFollower(TERMINAL_26);
		TERMINAL_31.addFollower(TERMINAL_27);
		TERMINAL_31.addFollower(TERMINAL_28);
		TERMINAL_31.addFollower(TERMINAL_29);
		TERMINAL_31.addFollower(TERMINAL_30);
		TERMINAL_31.addFollower(TERMINAL_31);
		TERMINAL_31.addFollower(TERMINAL_32);
		TERMINAL_31.addFollower(TERMINAL_33);
		TERMINAL_31.addFollower(TERMINAL_34);
		TERMINAL_31.addFollower(TERMINAL_35);
		TERMINAL_31.addFollower(TERMINAL_3);
		TERMINAL_31.addFollower(TERMINAL_4);
		TERMINAL_31.addFollower(TERMINAL_5);
		TERMINAL_31.addFollower(TERMINAL_36);
		TERMINAL_31.addFollower(TERMINAL_37);
		TERMINAL_31.addFollower(TERMINAL_0);
		TERMINAL_31.addFollower(TERMINAL_1);
		TERMINAL_31.addFollower(TERMINAL_38);
		TERMINAL_31.addFollower(TERMINAL_39);
		TERMINAL_31.addFollower(TERMINAL_40);
		TERMINAL_31.addFollower(TERMINAL_41);
		TERMINAL_31.addFollower(TERMINAL_6);
		TERMINAL_31.addFollower(TERMINAL_7);
		TERMINAL_31.addFollower(TERMINAL_8);
		TERMINAL_31.addFollower(TERMINAL_9);
		TERMINAL_31.addFollower(TERMINAL_10);
		TERMINAL_31.addFollower(TERMINAL_11);
		TERMINAL_31.addFollower(TERMINAL_12);
		TERMINAL_31.addFollower(TERMINAL_13);
		TERMINAL_31.addFollower(TERMINAL_14);
		TERMINAL_31.addFollower(TERMINAL_15);
		TERMINAL_31.addFollower(TERMINAL_16);
		TERMINAL_31.addFollower(TERMINAL_17);
		TERMINAL_31.addFollower(TERMINAL_18);
		TERMINAL_31.addFollower(TERMINAL_19);
		TERMINAL_31.addFollower(TERMINAL_20);
		TERMINAL_31.addFollower(TERMINAL_42);
		TERMINAL_31.addFollower(TERMINAL_43);
		TERMINAL_31.addFollower(TERMINAL_44);
		TERMINAL_31.addFollower(TERMINAL_45);
		TERMINAL_31.addFollower(TERMINAL_46);
		TERMINAL_31.addFollower(TERMINAL_47);
		TERMINAL_32.addFollower(TERMINAL_2);
		TERMINAL_32.addFollower(TERMINAL_21);
		TERMINAL_32.addFollower(TERMINAL_22);
		TERMINAL_32.addFollower(TERMINAL_23);
		TERMINAL_32.addFollower(TERMINAL_24);
		TERMINAL_32.addFollower(TERMINAL_25);
		TERMINAL_32.addFollower(TERMINAL_26);
		TERMINAL_32.addFollower(TERMINAL_27);
		TERMINAL_32.addFollower(TERMINAL_28);
		TERMINAL_32.addFollower(TERMINAL_29);
		TERMINAL_32.addFollower(TERMINAL_30);
		TERMINAL_32.addFollower(TERMINAL_31);
		TERMINAL_32.addFollower(TERMINAL_32);
		TERMINAL_32.addFollower(TERMINAL_33);
		TERMINAL_32.addFollower(TERMINAL_34);
		TERMINAL_32.addFollower(TERMINAL_35);
		TERMINAL_32.addFollower(TERMINAL_3);
		TERMINAL_32.addFollower(TERMINAL_4);
		TERMINAL_32.addFollower(TERMINAL_5);
		TERMINAL_32.addFollower(TERMINAL_36);
		TERMINAL_32.addFollower(TERMINAL_37);
		TERMINAL_32.addFollower(TERMINAL_0);
		TERMINAL_32.addFollower(TERMINAL_1);
		TERMINAL_32.addFollower(TERMINAL_38);
		TERMINAL_32.addFollower(TERMINAL_39);
		TERMINAL_32.addFollower(TERMINAL_40);
		TERMINAL_32.addFollower(TERMINAL_41);
		TERMINAL_32.addFollower(TERMINAL_6);
		TERMINAL_32.addFollower(TERMINAL_7);
		TERMINAL_32.addFollower(TERMINAL_8);
		TERMINAL_32.addFollower(TERMINAL_9);
		TERMINAL_32.addFollower(TERMINAL_10);
		TERMINAL_32.addFollower(TERMINAL_11);
		TERMINAL_32.addFollower(TERMINAL_12);
		TERMINAL_32.addFollower(TERMINAL_13);
		TERMINAL_32.addFollower(TERMINAL_14);
		TERMINAL_32.addFollower(TERMINAL_15);
		TERMINAL_32.addFollower(TERMINAL_16);
		TERMINAL_32.addFollower(TERMINAL_17);
		TERMINAL_32.addFollower(TERMINAL_18);
		TERMINAL_32.addFollower(TERMINAL_19);
		TERMINAL_32.addFollower(TERMINAL_20);
		TERMINAL_32.addFollower(TERMINAL_42);
		TERMINAL_32.addFollower(TERMINAL_43);
		TERMINAL_32.addFollower(TERMINAL_44);
		TERMINAL_32.addFollower(TERMINAL_45);
		TERMINAL_32.addFollower(TERMINAL_46);
		TERMINAL_32.addFollower(TERMINAL_47);
		TERMINAL_33.addFollower(TERMINAL_2);
		TERMINAL_33.addFollower(TERMINAL_21);
		TERMINAL_33.addFollower(TERMINAL_22);
		TERMINAL_33.addFollower(TERMINAL_23);
		TERMINAL_33.addFollower(TERMINAL_24);
		TERMINAL_33.addFollower(TERMINAL_25);
		TERMINAL_33.addFollower(TERMINAL_26);
		TERMINAL_33.addFollower(TERMINAL_27);
		TERMINAL_33.addFollower(TERMINAL_28);
		TERMINAL_33.addFollower(TERMINAL_29);
		TERMINAL_33.addFollower(TERMINAL_30);
		TERMINAL_33.addFollower(TERMINAL_31);
		TERMINAL_33.addFollower(TERMINAL_32);
		TERMINAL_33.addFollower(TERMINAL_33);
		TERMINAL_33.addFollower(TERMINAL_34);
		TERMINAL_33.addFollower(TERMINAL_35);
		TERMINAL_33.addFollower(TERMINAL_3);
		TERMINAL_33.addFollower(TERMINAL_4);
		TERMINAL_33.addFollower(TERMINAL_5);
		TERMINAL_33.addFollower(TERMINAL_36);
		TERMINAL_33.addFollower(TERMINAL_37);
		TERMINAL_33.addFollower(TERMINAL_0);
		TERMINAL_33.addFollower(TERMINAL_1);
		TERMINAL_33.addFollower(TERMINAL_38);
		TERMINAL_33.addFollower(TERMINAL_39);
		TERMINAL_33.addFollower(TERMINAL_40);
		TERMINAL_33.addFollower(TERMINAL_41);
		TERMINAL_33.addFollower(TERMINAL_6);
		TERMINAL_33.addFollower(TERMINAL_7);
		TERMINAL_33.addFollower(TERMINAL_8);
		TERMINAL_33.addFollower(TERMINAL_9);
		TERMINAL_33.addFollower(TERMINAL_10);
		TERMINAL_33.addFollower(TERMINAL_11);
		TERMINAL_33.addFollower(TERMINAL_12);
		TERMINAL_33.addFollower(TERMINAL_13);
		TERMINAL_33.addFollower(TERMINAL_14);
		TERMINAL_33.addFollower(TERMINAL_15);
		TERMINAL_33.addFollower(TERMINAL_16);
		TERMINAL_33.addFollower(TERMINAL_17);
		TERMINAL_33.addFollower(TERMINAL_18);
		TERMINAL_33.addFollower(TERMINAL_19);
		TERMINAL_33.addFollower(TERMINAL_20);
		TERMINAL_33.addFollower(TERMINAL_42);
		TERMINAL_33.addFollower(TERMINAL_43);
		TERMINAL_33.addFollower(TERMINAL_44);
		TERMINAL_33.addFollower(TERMINAL_45);
		TERMINAL_33.addFollower(TERMINAL_46);
		TERMINAL_33.addFollower(TERMINAL_47);
		TERMINAL_34.addFollower(TERMINAL_2);
		TERMINAL_34.addFollower(TERMINAL_21);
		TERMINAL_34.addFollower(TERMINAL_22);
		TERMINAL_34.addFollower(TERMINAL_23);
		TERMINAL_34.addFollower(TERMINAL_24);
		TERMINAL_34.addFollower(TERMINAL_25);
		TERMINAL_34.addFollower(TERMINAL_26);
		TERMINAL_34.addFollower(TERMINAL_27);
		TERMINAL_34.addFollower(TERMINAL_28);
		TERMINAL_34.addFollower(TERMINAL_29);
		TERMINAL_34.addFollower(TERMINAL_30);
		TERMINAL_34.addFollower(TERMINAL_31);
		TERMINAL_34.addFollower(TERMINAL_32);
		TERMINAL_34.addFollower(TERMINAL_33);
		TERMINAL_34.addFollower(TERMINAL_34);
		TERMINAL_34.addFollower(TERMINAL_35);
		TERMINAL_34.addFollower(TERMINAL_3);
		TERMINAL_34.addFollower(TERMINAL_4);
		TERMINAL_34.addFollower(TERMINAL_5);
		TERMINAL_34.addFollower(TERMINAL_36);
		TERMINAL_34.addFollower(TERMINAL_37);
		TERMINAL_34.addFollower(TERMINAL_0);
		TERMINAL_34.addFollower(TERMINAL_1);
		TERMINAL_34.addFollower(TERMINAL_38);
		TERMINAL_34.addFollower(TERMINAL_39);
		TERMINAL_34.addFollower(TERMINAL_40);
		TERMINAL_34.addFollower(TERMINAL_41);
		TERMINAL_34.addFollower(TERMINAL_6);
		TERMINAL_34.addFollower(TERMINAL_7);
		TERMINAL_34.addFollower(TERMINAL_8);
		TERMINAL_34.addFollower(TERMINAL_9);
		TERMINAL_34.addFollower(TERMINAL_10);
		TERMINAL_34.addFollower(TERMINAL_11);
		TERMINAL_34.addFollower(TERMINAL_12);
		TERMINAL_34.addFollower(TERMINAL_13);
		TERMINAL_34.addFollower(TERMINAL_14);
		TERMINAL_34.addFollower(TERMINAL_15);
		TERMINAL_34.addFollower(TERMINAL_16);
		TERMINAL_34.addFollower(TERMINAL_17);
		TERMINAL_34.addFollower(TERMINAL_18);
		TERMINAL_34.addFollower(TERMINAL_19);
		TERMINAL_34.addFollower(TERMINAL_20);
		TERMINAL_34.addFollower(TERMINAL_42);
		TERMINAL_34.addFollower(TERMINAL_43);
		TERMINAL_34.addFollower(TERMINAL_44);
		TERMINAL_34.addFollower(TERMINAL_45);
		TERMINAL_34.addFollower(TERMINAL_46);
		TERMINAL_34.addFollower(TERMINAL_47);
		TERMINAL_35.addFollower(TERMINAL_2);
		TERMINAL_35.addFollower(TERMINAL_21);
		TERMINAL_35.addFollower(TERMINAL_22);
		TERMINAL_35.addFollower(TERMINAL_23);
		TERMINAL_35.addFollower(TERMINAL_24);
		TERMINAL_35.addFollower(TERMINAL_25);
		TERMINAL_35.addFollower(TERMINAL_26);
		TERMINAL_35.addFollower(TERMINAL_27);
		TERMINAL_35.addFollower(TERMINAL_28);
		TERMINAL_35.addFollower(TERMINAL_29);
		TERMINAL_35.addFollower(TERMINAL_30);
		TERMINAL_35.addFollower(TERMINAL_31);
		TERMINAL_35.addFollower(TERMINAL_32);
		TERMINAL_35.addFollower(TERMINAL_33);
		TERMINAL_35.addFollower(TERMINAL_34);
		TERMINAL_35.addFollower(TERMINAL_35);
		TERMINAL_35.addFollower(TERMINAL_3);
		TERMINAL_35.addFollower(TERMINAL_4);
		TERMINAL_35.addFollower(TERMINAL_5);
		TERMINAL_35.addFollower(TERMINAL_36);
		TERMINAL_35.addFollower(TERMINAL_37);
		TERMINAL_35.addFollower(TERMINAL_0);
		TERMINAL_35.addFollower(TERMINAL_1);
		TERMINAL_35.addFollower(TERMINAL_38);
		TERMINAL_35.addFollower(TERMINAL_39);
		TERMINAL_35.addFollower(TERMINAL_40);
		TERMINAL_35.addFollower(TERMINAL_41);
		TERMINAL_35.addFollower(TERMINAL_6);
		TERMINAL_35.addFollower(TERMINAL_7);
		TERMINAL_35.addFollower(TERMINAL_8);
		TERMINAL_35.addFollower(TERMINAL_9);
		TERMINAL_35.addFollower(TERMINAL_10);
		TERMINAL_35.addFollower(TERMINAL_11);
		TERMINAL_35.addFollower(TERMINAL_12);
		TERMINAL_35.addFollower(TERMINAL_13);
		TERMINAL_35.addFollower(TERMINAL_14);
		TERMINAL_35.addFollower(TERMINAL_15);
		TERMINAL_35.addFollower(TERMINAL_16);
		TERMINAL_35.addFollower(TERMINAL_17);
		TERMINAL_35.addFollower(TERMINAL_18);
		TERMINAL_35.addFollower(TERMINAL_19);
		TERMINAL_35.addFollower(TERMINAL_20);
		TERMINAL_35.addFollower(TERMINAL_42);
		TERMINAL_35.addFollower(TERMINAL_43);
		TERMINAL_35.addFollower(TERMINAL_44);
		TERMINAL_35.addFollower(TERMINAL_45);
		TERMINAL_35.addFollower(TERMINAL_46);
		TERMINAL_35.addFollower(TERMINAL_47);
		TERMINAL_3.addFollower(TERMINAL_2);
		TERMINAL_3.addFollower(TERMINAL_21);
		TERMINAL_3.addFollower(TERMINAL_22);
		TERMINAL_3.addFollower(TERMINAL_23);
		TERMINAL_3.addFollower(TERMINAL_24);
		TERMINAL_3.addFollower(TERMINAL_25);
		TERMINAL_3.addFollower(TERMINAL_26);
		TERMINAL_3.addFollower(TERMINAL_27);
		TERMINAL_3.addFollower(TERMINAL_28);
		TERMINAL_3.addFollower(TERMINAL_29);
		TERMINAL_3.addFollower(TERMINAL_30);
		TERMINAL_3.addFollower(TERMINAL_31);
		TERMINAL_3.addFollower(TERMINAL_32);
		TERMINAL_3.addFollower(TERMINAL_33);
		TERMINAL_3.addFollower(TERMINAL_34);
		TERMINAL_3.addFollower(TERMINAL_35);
		TERMINAL_3.addFollower(TERMINAL_3);
		TERMINAL_3.addFollower(TERMINAL_4);
		TERMINAL_3.addFollower(TERMINAL_5);
		TERMINAL_3.addFollower(TERMINAL_36);
		TERMINAL_3.addFollower(TERMINAL_37);
		TERMINAL_3.addFollower(TERMINAL_0);
		TERMINAL_3.addFollower(TERMINAL_1);
		TERMINAL_3.addFollower(TERMINAL_38);
		TERMINAL_3.addFollower(TERMINAL_39);
		TERMINAL_3.addFollower(TERMINAL_40);
		TERMINAL_3.addFollower(TERMINAL_41);
		TERMINAL_3.addFollower(TERMINAL_6);
		TERMINAL_3.addFollower(TERMINAL_7);
		TERMINAL_3.addFollower(TERMINAL_8);
		TERMINAL_3.addFollower(TERMINAL_9);
		TERMINAL_3.addFollower(TERMINAL_10);
		TERMINAL_3.addFollower(TERMINAL_11);
		TERMINAL_3.addFollower(TERMINAL_12);
		TERMINAL_3.addFollower(TERMINAL_13);
		TERMINAL_3.addFollower(TERMINAL_14);
		TERMINAL_3.addFollower(TERMINAL_15);
		TERMINAL_3.addFollower(TERMINAL_16);
		TERMINAL_3.addFollower(TERMINAL_17);
		TERMINAL_3.addFollower(TERMINAL_18);
		TERMINAL_3.addFollower(TERMINAL_19);
		TERMINAL_3.addFollower(TERMINAL_20);
		TERMINAL_3.addFollower(TERMINAL_42);
		TERMINAL_3.addFollower(TERMINAL_43);
		TERMINAL_3.addFollower(TERMINAL_44);
		TERMINAL_3.addFollower(TERMINAL_45);
		TERMINAL_3.addFollower(TERMINAL_46);
		TERMINAL_3.addFollower(TERMINAL_47);
		TERMINAL_3.addFollower(TERMINAL_48);
		TERMINAL_3.addFollower(TERMINAL_49);
		TERMINAL_3.addFollower(TERMINAL_50);
		TERMINAL_3.addFollower(TERMINAL_51);
		TERMINAL_3.addFollower(TERMINAL_52);
		TERMINAL_3.addFollower(TERMINAL_53);
		TERMINAL_3.addFollower(TERMINAL_54);
		TERMINAL_3.addFollower(TERMINAL_55);
		TERMINAL_3.addFollower(TERMINAL_56);
		TERMINAL_3.addFollower(TERMINAL_57);
		TERMINAL_3.addFollower(TERMINAL_58);
		TERMINAL_4.addFollower(TERMINAL_5);
		TERMINAL_5.addFollower(TERMINAL_59);
		TERMINAL_5.addFollower(TERMINAL_2);
		TERMINAL_5.addFollower(TERMINAL_21);
		TERMINAL_5.addFollower(TERMINAL_22);
		TERMINAL_5.addFollower(TERMINAL_23);
		TERMINAL_5.addFollower(TERMINAL_24);
		TERMINAL_5.addFollower(TERMINAL_25);
		TERMINAL_5.addFollower(TERMINAL_26);
		TERMINAL_5.addFollower(TERMINAL_27);
		TERMINAL_5.addFollower(TERMINAL_28);
		TERMINAL_5.addFollower(TERMINAL_29);
		TERMINAL_5.addFollower(TERMINAL_30);
		TERMINAL_5.addFollower(TERMINAL_31);
		TERMINAL_5.addFollower(TERMINAL_32);
		TERMINAL_5.addFollower(TERMINAL_33);
		TERMINAL_5.addFollower(TERMINAL_34);
		TERMINAL_5.addFollower(TERMINAL_35);
		TERMINAL_5.addFollower(TERMINAL_3);
		TERMINAL_5.addFollower(TERMINAL_4);
		TERMINAL_5.addFollower(TERMINAL_5);
		TERMINAL_5.addFollower(TERMINAL_36);
		TERMINAL_5.addFollower(TERMINAL_37);
		TERMINAL_5.addFollower(TERMINAL_0);
		TERMINAL_5.addFollower(TERMINAL_1);
		TERMINAL_5.addFollower(TERMINAL_38);
		TERMINAL_5.addFollower(TERMINAL_39);
		TERMINAL_5.addFollower(TERMINAL_40);
		TERMINAL_5.addFollower(TERMINAL_41);
		TERMINAL_5.addFollower(TERMINAL_6);
		TERMINAL_5.addFollower(TERMINAL_7);
		TERMINAL_5.addFollower(TERMINAL_8);
		TERMINAL_5.addFollower(TERMINAL_9);
		TERMINAL_5.addFollower(TERMINAL_10);
		TERMINAL_5.addFollower(TERMINAL_11);
		TERMINAL_5.addFollower(TERMINAL_12);
		TERMINAL_5.addFollower(TERMINAL_13);
		TERMINAL_5.addFollower(TERMINAL_14);
		TERMINAL_5.addFollower(TERMINAL_15);
		TERMINAL_5.addFollower(TERMINAL_16);
		TERMINAL_5.addFollower(TERMINAL_17);
		TERMINAL_5.addFollower(TERMINAL_18);
		TERMINAL_5.addFollower(TERMINAL_19);
		TERMINAL_5.addFollower(TERMINAL_20);
		TERMINAL_5.addFollower(TERMINAL_42);
		TERMINAL_5.addFollower(TERMINAL_43);
		TERMINAL_5.addFollower(TERMINAL_44);
		TERMINAL_5.addFollower(TERMINAL_45);
		TERMINAL_5.addFollower(TERMINAL_46);
		TERMINAL_5.addFollower(TERMINAL_47);
		TERMINAL_5.addFollower(TERMINAL_48);
		TERMINAL_5.addFollower(TERMINAL_49);
		TERMINAL_5.addFollower(TERMINAL_50);
		TERMINAL_5.addFollower(TERMINAL_51);
		TERMINAL_5.addFollower(TERMINAL_52);
		TERMINAL_5.addFollower(TERMINAL_53);
		TERMINAL_5.addFollower(TERMINAL_54);
		TERMINAL_5.addFollower(TERMINAL_55);
		TERMINAL_5.addFollower(TERMINAL_56);
		TERMINAL_5.addFollower(TERMINAL_57);
		TERMINAL_5.addFollower(TERMINAL_58);
		TERMINAL_59.addFollower(TERMINAL_3);
		TERMINAL_59.addFollower(TERMINAL_4);
		TERMINAL_59.addFollower(TERMINAL_5);
		TERMINAL_59.addFollower(TERMINAL_6);
		TERMINAL_59.addFollower(TERMINAL_7);
		TERMINAL_59.addFollower(TERMINAL_8);
		TERMINAL_59.addFollower(TERMINAL_9);
		TERMINAL_59.addFollower(TERMINAL_10);
		TERMINAL_59.addFollower(TERMINAL_11);
		TERMINAL_59.addFollower(TERMINAL_12);
		TERMINAL_59.addFollower(TERMINAL_13);
		TERMINAL_59.addFollower(TERMINAL_14);
		TERMINAL_59.addFollower(TERMINAL_15);
		TERMINAL_59.addFollower(TERMINAL_16);
		TERMINAL_59.addFollower(TERMINAL_17);
		TERMINAL_59.addFollower(TERMINAL_18);
		TERMINAL_59.addFollower(TERMINAL_19);
		TERMINAL_59.addFollower(TERMINAL_20);
		TERMINAL_59.addFollower(TERMINAL_48);
		TERMINAL_59.addFollower(TERMINAL_49);
		TERMINAL_48.addFollower(TERMINAL_3);
		TERMINAL_48.addFollower(TERMINAL_4);
		TERMINAL_48.addFollower(TERMINAL_5);
		TERMINAL_48.addFollower(TERMINAL_6);
		TERMINAL_48.addFollower(TERMINAL_7);
		TERMINAL_48.addFollower(TERMINAL_8);
		TERMINAL_48.addFollower(TERMINAL_9);
		TERMINAL_48.addFollower(TERMINAL_10);
		TERMINAL_48.addFollower(TERMINAL_11);
		TERMINAL_48.addFollower(TERMINAL_12);
		TERMINAL_48.addFollower(TERMINAL_13);
		TERMINAL_48.addFollower(TERMINAL_14);
		TERMINAL_48.addFollower(TERMINAL_15);
		TERMINAL_48.addFollower(TERMINAL_16);
		TERMINAL_48.addFollower(TERMINAL_17);
		TERMINAL_48.addFollower(TERMINAL_18);
		TERMINAL_48.addFollower(TERMINAL_19);
		TERMINAL_48.addFollower(TERMINAL_20);
		TERMINAL_49.addFollower(TERMINAL_2);
		TERMINAL_49.addFollower(TERMINAL_21);
		TERMINAL_49.addFollower(TERMINAL_22);
		TERMINAL_49.addFollower(TERMINAL_23);
		TERMINAL_49.addFollower(TERMINAL_24);
		TERMINAL_49.addFollower(TERMINAL_25);
		TERMINAL_49.addFollower(TERMINAL_26);
		TERMINAL_49.addFollower(TERMINAL_27);
		TERMINAL_49.addFollower(TERMINAL_28);
		TERMINAL_49.addFollower(TERMINAL_29);
		TERMINAL_49.addFollower(TERMINAL_30);
		TERMINAL_49.addFollower(TERMINAL_31);
		TERMINAL_49.addFollower(TERMINAL_32);
		TERMINAL_49.addFollower(TERMINAL_33);
		TERMINAL_49.addFollower(TERMINAL_34);
		TERMINAL_49.addFollower(TERMINAL_35);
		TERMINAL_49.addFollower(TERMINAL_3);
		TERMINAL_49.addFollower(TERMINAL_4);
		TERMINAL_49.addFollower(TERMINAL_5);
		TERMINAL_49.addFollower(TERMINAL_36);
		TERMINAL_49.addFollower(TERMINAL_37);
		TERMINAL_49.addFollower(TERMINAL_0);
		TERMINAL_49.addFollower(TERMINAL_1);
		TERMINAL_49.addFollower(TERMINAL_38);
		TERMINAL_49.addFollower(TERMINAL_39);
		TERMINAL_49.addFollower(TERMINAL_40);
		TERMINAL_49.addFollower(TERMINAL_41);
		TERMINAL_49.addFollower(TERMINAL_6);
		TERMINAL_49.addFollower(TERMINAL_7);
		TERMINAL_49.addFollower(TERMINAL_8);
		TERMINAL_49.addFollower(TERMINAL_9);
		TERMINAL_49.addFollower(TERMINAL_10);
		TERMINAL_49.addFollower(TERMINAL_11);
		TERMINAL_49.addFollower(TERMINAL_12);
		TERMINAL_49.addFollower(TERMINAL_13);
		TERMINAL_49.addFollower(TERMINAL_14);
		TERMINAL_49.addFollower(TERMINAL_15);
		TERMINAL_49.addFollower(TERMINAL_16);
		TERMINAL_49.addFollower(TERMINAL_17);
		TERMINAL_49.addFollower(TERMINAL_18);
		TERMINAL_49.addFollower(TERMINAL_19);
		TERMINAL_49.addFollower(TERMINAL_20);
		TERMINAL_49.addFollower(TERMINAL_42);
		TERMINAL_49.addFollower(TERMINAL_43);
		TERMINAL_49.addFollower(TERMINAL_44);
		TERMINAL_49.addFollower(TERMINAL_45);
		TERMINAL_49.addFollower(TERMINAL_46);
		TERMINAL_49.addFollower(TERMINAL_47);
		TERMINAL_49.addFollower(TERMINAL_48);
		TERMINAL_49.addFollower(TERMINAL_49);
		TERMINAL_49.addFollower(TERMINAL_50);
		TERMINAL_49.addFollower(TERMINAL_51);
		TERMINAL_49.addFollower(TERMINAL_52);
		TERMINAL_49.addFollower(TERMINAL_53);
		TERMINAL_49.addFollower(TERMINAL_54);
		TERMINAL_49.addFollower(TERMINAL_55);
		TERMINAL_49.addFollower(TERMINAL_56);
		TERMINAL_49.addFollower(TERMINAL_57);
		TERMINAL_49.addFollower(TERMINAL_58);
		TERMINAL_36.addFollower(TERMINAL_60);
		TERMINAL_37.addFollower(TERMINAL_60);
		TERMINAL_60.addFollower(TERMINAL_61);
		TERMINAL_60.addFollower(TERMINAL_0);
		TERMINAL_60.addFollower(TERMINAL_1);
		TERMINAL_62.addFollower(TERMINAL_2);
		TERMINAL_62.addFollower(TERMINAL_21);
		TERMINAL_62.addFollower(TERMINAL_22);
		TERMINAL_62.addFollower(TERMINAL_23);
		TERMINAL_62.addFollower(TERMINAL_24);
		TERMINAL_62.addFollower(TERMINAL_25);
		TERMINAL_62.addFollower(TERMINAL_26);
		TERMINAL_62.addFollower(TERMINAL_27);
		TERMINAL_62.addFollower(TERMINAL_28);
		TERMINAL_62.addFollower(TERMINAL_29);
		TERMINAL_62.addFollower(TERMINAL_30);
		TERMINAL_62.addFollower(TERMINAL_31);
		TERMINAL_62.addFollower(TERMINAL_32);
		TERMINAL_62.addFollower(TERMINAL_33);
		TERMINAL_62.addFollower(TERMINAL_34);
		TERMINAL_62.addFollower(TERMINAL_35);
		TERMINAL_62.addFollower(TERMINAL_3);
		TERMINAL_62.addFollower(TERMINAL_4);
		TERMINAL_62.addFollower(TERMINAL_5);
		TERMINAL_62.addFollower(TERMINAL_36);
		TERMINAL_62.addFollower(TERMINAL_37);
		TERMINAL_62.addFollower(TERMINAL_0);
		TERMINAL_62.addFollower(TERMINAL_1);
		TERMINAL_62.addFollower(TERMINAL_38);
		TERMINAL_62.addFollower(TERMINAL_39);
		TERMINAL_62.addFollower(TERMINAL_40);
		TERMINAL_62.addFollower(TERMINAL_41);
		TERMINAL_62.addFollower(TERMINAL_6);
		TERMINAL_62.addFollower(TERMINAL_7);
		TERMINAL_62.addFollower(TERMINAL_8);
		TERMINAL_62.addFollower(TERMINAL_9);
		TERMINAL_62.addFollower(TERMINAL_10);
		TERMINAL_62.addFollower(TERMINAL_11);
		TERMINAL_62.addFollower(TERMINAL_12);
		TERMINAL_62.addFollower(TERMINAL_13);
		TERMINAL_62.addFollower(TERMINAL_14);
		TERMINAL_62.addFollower(TERMINAL_15);
		TERMINAL_62.addFollower(TERMINAL_16);
		TERMINAL_62.addFollower(TERMINAL_17);
		TERMINAL_62.addFollower(TERMINAL_18);
		TERMINAL_62.addFollower(TERMINAL_19);
		TERMINAL_62.addFollower(TERMINAL_20);
		TERMINAL_62.addFollower(TERMINAL_42);
		TERMINAL_62.addFollower(TERMINAL_43);
		TERMINAL_62.addFollower(TERMINAL_44);
		TERMINAL_62.addFollower(TERMINAL_45);
		TERMINAL_62.addFollower(TERMINAL_46);
		TERMINAL_62.addFollower(TERMINAL_47);
		TERMINAL_63.addFollower(TERMINAL_2);
		TERMINAL_63.addFollower(TERMINAL_21);
		TERMINAL_63.addFollower(TERMINAL_22);
		TERMINAL_63.addFollower(TERMINAL_23);
		TERMINAL_63.addFollower(TERMINAL_24);
		TERMINAL_63.addFollower(TERMINAL_25);
		TERMINAL_63.addFollower(TERMINAL_26);
		TERMINAL_63.addFollower(TERMINAL_27);
		TERMINAL_63.addFollower(TERMINAL_28);
		TERMINAL_63.addFollower(TERMINAL_29);
		TERMINAL_63.addFollower(TERMINAL_30);
		TERMINAL_63.addFollower(TERMINAL_31);
		TERMINAL_63.addFollower(TERMINAL_32);
		TERMINAL_63.addFollower(TERMINAL_33);
		TERMINAL_63.addFollower(TERMINAL_34);
		TERMINAL_63.addFollower(TERMINAL_35);
		TERMINAL_63.addFollower(TERMINAL_3);
		TERMINAL_63.addFollower(TERMINAL_4);
		TERMINAL_63.addFollower(TERMINAL_5);
		TERMINAL_63.addFollower(TERMINAL_36);
		TERMINAL_63.addFollower(TERMINAL_37);
		TERMINAL_63.addFollower(TERMINAL_0);
		TERMINAL_63.addFollower(TERMINAL_1);
		TERMINAL_63.addFollower(TERMINAL_38);
		TERMINAL_63.addFollower(TERMINAL_39);
		TERMINAL_63.addFollower(TERMINAL_40);
		TERMINAL_63.addFollower(TERMINAL_41);
		TERMINAL_63.addFollower(TERMINAL_6);
		TERMINAL_63.addFollower(TERMINAL_7);
		TERMINAL_63.addFollower(TERMINAL_8);
		TERMINAL_63.addFollower(TERMINAL_9);
		TERMINAL_63.addFollower(TERMINAL_10);
		TERMINAL_63.addFollower(TERMINAL_11);
		TERMINAL_63.addFollower(TERMINAL_12);
		TERMINAL_63.addFollower(TERMINAL_13);
		TERMINAL_63.addFollower(TERMINAL_14);
		TERMINAL_63.addFollower(TERMINAL_15);
		TERMINAL_63.addFollower(TERMINAL_16);
		TERMINAL_63.addFollower(TERMINAL_17);
		TERMINAL_63.addFollower(TERMINAL_18);
		TERMINAL_63.addFollower(TERMINAL_19);
		TERMINAL_63.addFollower(TERMINAL_20);
		TERMINAL_63.addFollower(TERMINAL_42);
		TERMINAL_63.addFollower(TERMINAL_43);
		TERMINAL_63.addFollower(TERMINAL_44);
		TERMINAL_63.addFollower(TERMINAL_45);
		TERMINAL_63.addFollower(TERMINAL_46);
		TERMINAL_63.addFollower(TERMINAL_47);
		TERMINAL_0.addFollower(TERMINAL_2);
		TERMINAL_0.addFollower(TERMINAL_21);
		TERMINAL_0.addFollower(TERMINAL_22);
		TERMINAL_0.addFollower(TERMINAL_23);
		TERMINAL_0.addFollower(TERMINAL_24);
		TERMINAL_0.addFollower(TERMINAL_25);
		TERMINAL_0.addFollower(TERMINAL_26);
		TERMINAL_0.addFollower(TERMINAL_27);
		TERMINAL_0.addFollower(TERMINAL_28);
		TERMINAL_0.addFollower(TERMINAL_29);
		TERMINAL_0.addFollower(TERMINAL_30);
		TERMINAL_0.addFollower(TERMINAL_31);
		TERMINAL_0.addFollower(TERMINAL_32);
		TERMINAL_0.addFollower(TERMINAL_33);
		TERMINAL_0.addFollower(TERMINAL_34);
		TERMINAL_0.addFollower(TERMINAL_35);
		TERMINAL_0.addFollower(TERMINAL_3);
		TERMINAL_0.addFollower(TERMINAL_4);
		TERMINAL_0.addFollower(TERMINAL_5);
		TERMINAL_0.addFollower(TERMINAL_36);
		TERMINAL_0.addFollower(TERMINAL_37);
		TERMINAL_0.addFollower(TERMINAL_0);
		TERMINAL_0.addFollower(TERMINAL_1);
		TERMINAL_0.addFollower(TERMINAL_38);
		TERMINAL_0.addFollower(TERMINAL_39);
		TERMINAL_0.addFollower(TERMINAL_40);
		TERMINAL_0.addFollower(TERMINAL_41);
		TERMINAL_0.addFollower(TERMINAL_6);
		TERMINAL_0.addFollower(TERMINAL_7);
		TERMINAL_0.addFollower(TERMINAL_8);
		TERMINAL_0.addFollower(TERMINAL_9);
		TERMINAL_0.addFollower(TERMINAL_10);
		TERMINAL_0.addFollower(TERMINAL_11);
		TERMINAL_0.addFollower(TERMINAL_12);
		TERMINAL_0.addFollower(TERMINAL_13);
		TERMINAL_0.addFollower(TERMINAL_14);
		TERMINAL_0.addFollower(TERMINAL_15);
		TERMINAL_0.addFollower(TERMINAL_16);
		TERMINAL_0.addFollower(TERMINAL_17);
		TERMINAL_0.addFollower(TERMINAL_18);
		TERMINAL_0.addFollower(TERMINAL_19);
		TERMINAL_0.addFollower(TERMINAL_20);
		TERMINAL_0.addFollower(TERMINAL_42);
		TERMINAL_0.addFollower(TERMINAL_43);
		TERMINAL_0.addFollower(TERMINAL_44);
		TERMINAL_0.addFollower(TERMINAL_45);
		TERMINAL_0.addFollower(TERMINAL_46);
		TERMINAL_0.addFollower(TERMINAL_47);
		TERMINAL_1.addFollower(TERMINAL_2);
		TERMINAL_1.addFollower(TERMINAL_21);
		TERMINAL_1.addFollower(TERMINAL_22);
		TERMINAL_1.addFollower(TERMINAL_23);
		TERMINAL_1.addFollower(TERMINAL_24);
		TERMINAL_1.addFollower(TERMINAL_25);
		TERMINAL_1.addFollower(TERMINAL_26);
		TERMINAL_1.addFollower(TERMINAL_27);
		TERMINAL_1.addFollower(TERMINAL_28);
		TERMINAL_1.addFollower(TERMINAL_29);
		TERMINAL_1.addFollower(TERMINAL_30);
		TERMINAL_1.addFollower(TERMINAL_31);
		TERMINAL_1.addFollower(TERMINAL_32);
		TERMINAL_1.addFollower(TERMINAL_33);
		TERMINAL_1.addFollower(TERMINAL_34);
		TERMINAL_1.addFollower(TERMINAL_35);
		TERMINAL_1.addFollower(TERMINAL_3);
		TERMINAL_1.addFollower(TERMINAL_4);
		TERMINAL_1.addFollower(TERMINAL_5);
		TERMINAL_1.addFollower(TERMINAL_36);
		TERMINAL_1.addFollower(TERMINAL_37);
		TERMINAL_1.addFollower(TERMINAL_0);
		TERMINAL_1.addFollower(TERMINAL_1);
		TERMINAL_1.addFollower(TERMINAL_38);
		TERMINAL_1.addFollower(TERMINAL_39);
		TERMINAL_1.addFollower(TERMINAL_40);
		TERMINAL_1.addFollower(TERMINAL_41);
		TERMINAL_1.addFollower(TERMINAL_6);
		TERMINAL_1.addFollower(TERMINAL_7);
		TERMINAL_1.addFollower(TERMINAL_8);
		TERMINAL_1.addFollower(TERMINAL_9);
		TERMINAL_1.addFollower(TERMINAL_10);
		TERMINAL_1.addFollower(TERMINAL_11);
		TERMINAL_1.addFollower(TERMINAL_12);
		TERMINAL_1.addFollower(TERMINAL_13);
		TERMINAL_1.addFollower(TERMINAL_14);
		TERMINAL_1.addFollower(TERMINAL_15);
		TERMINAL_1.addFollower(TERMINAL_16);
		TERMINAL_1.addFollower(TERMINAL_17);
		TERMINAL_1.addFollower(TERMINAL_18);
		TERMINAL_1.addFollower(TERMINAL_19);
		TERMINAL_1.addFollower(TERMINAL_20);
		TERMINAL_1.addFollower(TERMINAL_42);
		TERMINAL_1.addFollower(TERMINAL_43);
		TERMINAL_1.addFollower(TERMINAL_44);
		TERMINAL_1.addFollower(TERMINAL_45);
		TERMINAL_1.addFollower(TERMINAL_46);
		TERMINAL_1.addFollower(TERMINAL_47);
		TERMINAL_46.addFollower(TERMINAL_62);
		TERMINAL_46.addFollower(TERMINAL_63);
		TERMINAL_46.addFollower(TERMINAL_2);
		TERMINAL_46.addFollower(TERMINAL_21);
		TERMINAL_46.addFollower(TERMINAL_22);
		TERMINAL_46.addFollower(TERMINAL_23);
		TERMINAL_46.addFollower(TERMINAL_24);
		TERMINAL_46.addFollower(TERMINAL_25);
		TERMINAL_46.addFollower(TERMINAL_26);
		TERMINAL_46.addFollower(TERMINAL_27);
		TERMINAL_46.addFollower(TERMINAL_28);
		TERMINAL_46.addFollower(TERMINAL_29);
		TERMINAL_46.addFollower(TERMINAL_30);
		TERMINAL_46.addFollower(TERMINAL_31);
		TERMINAL_46.addFollower(TERMINAL_32);
		TERMINAL_46.addFollower(TERMINAL_33);
		TERMINAL_46.addFollower(TERMINAL_34);
		TERMINAL_46.addFollower(TERMINAL_35);
		TERMINAL_46.addFollower(TERMINAL_3);
		TERMINAL_46.addFollower(TERMINAL_4);
		TERMINAL_46.addFollower(TERMINAL_5);
		TERMINAL_46.addFollower(TERMINAL_36);
		TERMINAL_46.addFollower(TERMINAL_37);
		TERMINAL_46.addFollower(TERMINAL_0);
		TERMINAL_46.addFollower(TERMINAL_1);
		TERMINAL_46.addFollower(TERMINAL_38);
		TERMINAL_46.addFollower(TERMINAL_39);
		TERMINAL_46.addFollower(TERMINAL_40);
		TERMINAL_46.addFollower(TERMINAL_41);
		TERMINAL_46.addFollower(TERMINAL_6);
		TERMINAL_46.addFollower(TERMINAL_7);
		TERMINAL_46.addFollower(TERMINAL_8);
		TERMINAL_46.addFollower(TERMINAL_9);
		TERMINAL_46.addFollower(TERMINAL_10);
		TERMINAL_46.addFollower(TERMINAL_11);
		TERMINAL_46.addFollower(TERMINAL_12);
		TERMINAL_46.addFollower(TERMINAL_13);
		TERMINAL_46.addFollower(TERMINAL_14);
		TERMINAL_46.addFollower(TERMINAL_15);
		TERMINAL_46.addFollower(TERMINAL_16);
		TERMINAL_46.addFollower(TERMINAL_17);
		TERMINAL_46.addFollower(TERMINAL_18);
		TERMINAL_46.addFollower(TERMINAL_19);
		TERMINAL_46.addFollower(TERMINAL_20);
		TERMINAL_46.addFollower(TERMINAL_42);
		TERMINAL_46.addFollower(TERMINAL_43);
		TERMINAL_46.addFollower(TERMINAL_44);
		TERMINAL_46.addFollower(TERMINAL_45);
		TERMINAL_46.addFollower(TERMINAL_46);
		TERMINAL_46.addFollower(TERMINAL_47);
		TERMINAL_46.addFollower(TERMINAL_64);
		TERMINAL_46.addFollower(TERMINAL_65);
		TERMINAL_47.addFollower(TERMINAL_62);
		TERMINAL_47.addFollower(TERMINAL_63);
		TERMINAL_47.addFollower(TERMINAL_2);
		TERMINAL_47.addFollower(TERMINAL_21);
		TERMINAL_47.addFollower(TERMINAL_22);
		TERMINAL_47.addFollower(TERMINAL_23);
		TERMINAL_47.addFollower(TERMINAL_24);
		TERMINAL_47.addFollower(TERMINAL_25);
		TERMINAL_47.addFollower(TERMINAL_26);
		TERMINAL_47.addFollower(TERMINAL_27);
		TERMINAL_47.addFollower(TERMINAL_28);
		TERMINAL_47.addFollower(TERMINAL_29);
		TERMINAL_47.addFollower(TERMINAL_30);
		TERMINAL_47.addFollower(TERMINAL_31);
		TERMINAL_47.addFollower(TERMINAL_32);
		TERMINAL_47.addFollower(TERMINAL_33);
		TERMINAL_47.addFollower(TERMINAL_34);
		TERMINAL_47.addFollower(TERMINAL_35);
		TERMINAL_47.addFollower(TERMINAL_3);
		TERMINAL_47.addFollower(TERMINAL_4);
		TERMINAL_47.addFollower(TERMINAL_5);
		TERMINAL_47.addFollower(TERMINAL_36);
		TERMINAL_47.addFollower(TERMINAL_37);
		TERMINAL_47.addFollower(TERMINAL_0);
		TERMINAL_47.addFollower(TERMINAL_1);
		TERMINAL_47.addFollower(TERMINAL_38);
		TERMINAL_47.addFollower(TERMINAL_39);
		TERMINAL_47.addFollower(TERMINAL_40);
		TERMINAL_47.addFollower(TERMINAL_41);
		TERMINAL_47.addFollower(TERMINAL_6);
		TERMINAL_47.addFollower(TERMINAL_7);
		TERMINAL_47.addFollower(TERMINAL_8);
		TERMINAL_47.addFollower(TERMINAL_9);
		TERMINAL_47.addFollower(TERMINAL_10);
		TERMINAL_47.addFollower(TERMINAL_11);
		TERMINAL_47.addFollower(TERMINAL_12);
		TERMINAL_47.addFollower(TERMINAL_13);
		TERMINAL_47.addFollower(TERMINAL_14);
		TERMINAL_47.addFollower(TERMINAL_15);
		TERMINAL_47.addFollower(TERMINAL_16);
		TERMINAL_47.addFollower(TERMINAL_17);
		TERMINAL_47.addFollower(TERMINAL_18);
		TERMINAL_47.addFollower(TERMINAL_19);
		TERMINAL_47.addFollower(TERMINAL_20);
		TERMINAL_47.addFollower(TERMINAL_42);
		TERMINAL_47.addFollower(TERMINAL_43);
		TERMINAL_47.addFollower(TERMINAL_44);
		TERMINAL_47.addFollower(TERMINAL_45);
		TERMINAL_47.addFollower(TERMINAL_46);
		TERMINAL_47.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_64);
		TERMINAL_47.addFollower(TERMINAL_65);
		TERMINAL_38.addFollower(TERMINAL_3);
		TERMINAL_38.addFollower(TERMINAL_4);
		TERMINAL_38.addFollower(TERMINAL_5);
		TERMINAL_38.addFollower(TERMINAL_6);
		TERMINAL_38.addFollower(TERMINAL_7);
		TERMINAL_38.addFollower(TERMINAL_8);
		TERMINAL_38.addFollower(TERMINAL_9);
		TERMINAL_38.addFollower(TERMINAL_10);
		TERMINAL_38.addFollower(TERMINAL_11);
		TERMINAL_38.addFollower(TERMINAL_12);
		TERMINAL_38.addFollower(TERMINAL_13);
		TERMINAL_38.addFollower(TERMINAL_14);
		TERMINAL_38.addFollower(TERMINAL_15);
		TERMINAL_38.addFollower(TERMINAL_16);
		TERMINAL_38.addFollower(TERMINAL_17);
		TERMINAL_38.addFollower(TERMINAL_18);
		TERMINAL_38.addFollower(TERMINAL_19);
		TERMINAL_38.addFollower(TERMINAL_20);
		TERMINAL_39.addFollower(TERMINAL_3);
		TERMINAL_39.addFollower(TERMINAL_4);
		TERMINAL_39.addFollower(TERMINAL_5);
		TERMINAL_39.addFollower(TERMINAL_6);
		TERMINAL_39.addFollower(TERMINAL_7);
		TERMINAL_39.addFollower(TERMINAL_8);
		TERMINAL_39.addFollower(TERMINAL_9);
		TERMINAL_39.addFollower(TERMINAL_10);
		TERMINAL_39.addFollower(TERMINAL_11);
		TERMINAL_39.addFollower(TERMINAL_12);
		TERMINAL_39.addFollower(TERMINAL_13);
		TERMINAL_39.addFollower(TERMINAL_14);
		TERMINAL_39.addFollower(TERMINAL_15);
		TERMINAL_39.addFollower(TERMINAL_16);
		TERMINAL_39.addFollower(TERMINAL_17);
		TERMINAL_39.addFollower(TERMINAL_18);
		TERMINAL_39.addFollower(TERMINAL_19);
		TERMINAL_39.addFollower(TERMINAL_20);
		TERMINAL_50.addFollower(TERMINAL_0);
		TERMINAL_50.addFollower(TERMINAL_1);
		TERMINAL_51.addFollower(TERMINAL_0);
		TERMINAL_51.addFollower(TERMINAL_1);
		TERMINAL_64.addFollower(TERMINAL_0);
		TERMINAL_64.addFollower(TERMINAL_1);
		TERMINAL_65.addFollower(TERMINAL_0);
		TERMINAL_65.addFollower(TERMINAL_1);
		TERMINAL_40.addFollower(TERMINAL_3);
		TERMINAL_40.addFollower(TERMINAL_4);
		TERMINAL_40.addFollower(TERMINAL_5);
		TERMINAL_40.addFollower(TERMINAL_6);
		TERMINAL_40.addFollower(TERMINAL_7);
		TERMINAL_40.addFollower(TERMINAL_8);
		TERMINAL_40.addFollower(TERMINAL_9);
		TERMINAL_40.addFollower(TERMINAL_10);
		TERMINAL_40.addFollower(TERMINAL_11);
		TERMINAL_40.addFollower(TERMINAL_12);
		TERMINAL_40.addFollower(TERMINAL_13);
		TERMINAL_40.addFollower(TERMINAL_14);
		TERMINAL_40.addFollower(TERMINAL_15);
		TERMINAL_40.addFollower(TERMINAL_16);
		TERMINAL_40.addFollower(TERMINAL_17);
		TERMINAL_40.addFollower(TERMINAL_18);
		TERMINAL_40.addFollower(TERMINAL_19);
		TERMINAL_40.addFollower(TERMINAL_20);
		TERMINAL_41.addFollower(TERMINAL_3);
		TERMINAL_41.addFollower(TERMINAL_4);
		TERMINAL_41.addFollower(TERMINAL_5);
		TERMINAL_41.addFollower(TERMINAL_6);
		TERMINAL_41.addFollower(TERMINAL_7);
		TERMINAL_41.addFollower(TERMINAL_8);
		TERMINAL_41.addFollower(TERMINAL_9);
		TERMINAL_41.addFollower(TERMINAL_10);
		TERMINAL_41.addFollower(TERMINAL_11);
		TERMINAL_41.addFollower(TERMINAL_12);
		TERMINAL_41.addFollower(TERMINAL_13);
		TERMINAL_41.addFollower(TERMINAL_14);
		TERMINAL_41.addFollower(TERMINAL_15);
		TERMINAL_41.addFollower(TERMINAL_16);
		TERMINAL_41.addFollower(TERMINAL_17);
		TERMINAL_41.addFollower(TERMINAL_18);
		TERMINAL_41.addFollower(TERMINAL_19);
		TERMINAL_41.addFollower(TERMINAL_20);
		TERMINAL_42.addFollower(TERMINAL_3);
		TERMINAL_42.addFollower(TERMINAL_4);
		TERMINAL_42.addFollower(TERMINAL_5);
		TERMINAL_42.addFollower(TERMINAL_6);
		TERMINAL_42.addFollower(TERMINAL_7);
		TERMINAL_42.addFollower(TERMINAL_8);
		TERMINAL_42.addFollower(TERMINAL_9);
		TERMINAL_42.addFollower(TERMINAL_10);
		TERMINAL_42.addFollower(TERMINAL_11);
		TERMINAL_42.addFollower(TERMINAL_12);
		TERMINAL_42.addFollower(TERMINAL_13);
		TERMINAL_42.addFollower(TERMINAL_14);
		TERMINAL_42.addFollower(TERMINAL_15);
		TERMINAL_42.addFollower(TERMINAL_16);
		TERMINAL_42.addFollower(TERMINAL_17);
		TERMINAL_42.addFollower(TERMINAL_18);
		TERMINAL_42.addFollower(TERMINAL_19);
		TERMINAL_42.addFollower(TERMINAL_20);
		TERMINAL_43.addFollower(TERMINAL_3);
		TERMINAL_43.addFollower(TERMINAL_4);
		TERMINAL_43.addFollower(TERMINAL_5);
		TERMINAL_43.addFollower(TERMINAL_6);
		TERMINAL_43.addFollower(TERMINAL_7);
		TERMINAL_43.addFollower(TERMINAL_8);
		TERMINAL_43.addFollower(TERMINAL_9);
		TERMINAL_43.addFollower(TERMINAL_10);
		TERMINAL_43.addFollower(TERMINAL_11);
		TERMINAL_43.addFollower(TERMINAL_12);
		TERMINAL_43.addFollower(TERMINAL_13);
		TERMINAL_43.addFollower(TERMINAL_14);
		TERMINAL_43.addFollower(TERMINAL_15);
		TERMINAL_43.addFollower(TERMINAL_16);
		TERMINAL_43.addFollower(TERMINAL_17);
		TERMINAL_43.addFollower(TERMINAL_18);
		TERMINAL_43.addFollower(TERMINAL_19);
		TERMINAL_43.addFollower(TERMINAL_20);
		TERMINAL_44.addFollower(TERMINAL_3);
		TERMINAL_44.addFollower(TERMINAL_4);
		TERMINAL_44.addFollower(TERMINAL_5);
		TERMINAL_44.addFollower(TERMINAL_6);
		TERMINAL_44.addFollower(TERMINAL_7);
		TERMINAL_44.addFollower(TERMINAL_8);
		TERMINAL_44.addFollower(TERMINAL_9);
		TERMINAL_44.addFollower(TERMINAL_10);
		TERMINAL_44.addFollower(TERMINAL_11);
		TERMINAL_44.addFollower(TERMINAL_12);
		TERMINAL_44.addFollower(TERMINAL_13);
		TERMINAL_44.addFollower(TERMINAL_14);
		TERMINAL_44.addFollower(TERMINAL_15);
		TERMINAL_44.addFollower(TERMINAL_16);
		TERMINAL_44.addFollower(TERMINAL_17);
		TERMINAL_44.addFollower(TERMINAL_18);
		TERMINAL_44.addFollower(TERMINAL_19);
		TERMINAL_44.addFollower(TERMINAL_20);
		TERMINAL_45.addFollower(TERMINAL_3);
		TERMINAL_45.addFollower(TERMINAL_4);
		TERMINAL_45.addFollower(TERMINAL_5);
		TERMINAL_45.addFollower(TERMINAL_6);
		TERMINAL_45.addFollower(TERMINAL_7);
		TERMINAL_45.addFollower(TERMINAL_8);
		TERMINAL_45.addFollower(TERMINAL_9);
		TERMINAL_45.addFollower(TERMINAL_10);
		TERMINAL_45.addFollower(TERMINAL_11);
		TERMINAL_45.addFollower(TERMINAL_12);
		TERMINAL_45.addFollower(TERMINAL_13);
		TERMINAL_45.addFollower(TERMINAL_14);
		TERMINAL_45.addFollower(TERMINAL_15);
		TERMINAL_45.addFollower(TERMINAL_16);
		TERMINAL_45.addFollower(TERMINAL_17);
		TERMINAL_45.addFollower(TERMINAL_18);
		TERMINAL_45.addFollower(TERMINAL_19);
		TERMINAL_45.addFollower(TERMINAL_20);
		TERMINAL_61.addFollower(TERMINAL_66);
		TERMINAL_66.addFollower(TERMINAL_61);
		TERMINAL_66.addFollower(TERMINAL_0);
		TERMINAL_66.addFollower(TERMINAL_1);
		TERMINAL_6.addFollower(TERMINAL_67);
		TERMINAL_67.addFollower(TERMINAL_2);
		TERMINAL_67.addFollower(TERMINAL_21);
		TERMINAL_67.addFollower(TERMINAL_22);
		TERMINAL_67.addFollower(TERMINAL_23);
		TERMINAL_67.addFollower(TERMINAL_24);
		TERMINAL_67.addFollower(TERMINAL_25);
		TERMINAL_67.addFollower(TERMINAL_26);
		TERMINAL_67.addFollower(TERMINAL_27);
		TERMINAL_67.addFollower(TERMINAL_28);
		TERMINAL_67.addFollower(TERMINAL_29);
		TERMINAL_67.addFollower(TERMINAL_30);
		TERMINAL_67.addFollower(TERMINAL_31);
		TERMINAL_67.addFollower(TERMINAL_32);
		TERMINAL_67.addFollower(TERMINAL_33);
		TERMINAL_67.addFollower(TERMINAL_34);
		TERMINAL_67.addFollower(TERMINAL_35);
		TERMINAL_67.addFollower(TERMINAL_3);
		TERMINAL_67.addFollower(TERMINAL_4);
		TERMINAL_67.addFollower(TERMINAL_5);
		TERMINAL_67.addFollower(TERMINAL_36);
		TERMINAL_67.addFollower(TERMINAL_37);
		TERMINAL_67.addFollower(TERMINAL_0);
		TERMINAL_67.addFollower(TERMINAL_1);
		TERMINAL_67.addFollower(TERMINAL_38);
		TERMINAL_67.addFollower(TERMINAL_39);
		TERMINAL_67.addFollower(TERMINAL_40);
		TERMINAL_67.addFollower(TERMINAL_41);
		TERMINAL_67.addFollower(TERMINAL_6);
		TERMINAL_67.addFollower(TERMINAL_7);
		TERMINAL_67.addFollower(TERMINAL_8);
		TERMINAL_67.addFollower(TERMINAL_9);
		TERMINAL_67.addFollower(TERMINAL_10);
		TERMINAL_67.addFollower(TERMINAL_11);
		TERMINAL_67.addFollower(TERMINAL_12);
		TERMINAL_67.addFollower(TERMINAL_13);
		TERMINAL_67.addFollower(TERMINAL_14);
		TERMINAL_67.addFollower(TERMINAL_15);
		TERMINAL_67.addFollower(TERMINAL_16);
		TERMINAL_67.addFollower(TERMINAL_17);
		TERMINAL_67.addFollower(TERMINAL_18);
		TERMINAL_67.addFollower(TERMINAL_19);
		TERMINAL_67.addFollower(TERMINAL_20);
		TERMINAL_67.addFollower(TERMINAL_42);
		TERMINAL_67.addFollower(TERMINAL_43);
		TERMINAL_67.addFollower(TERMINAL_44);
		TERMINAL_67.addFollower(TERMINAL_45);
		TERMINAL_67.addFollower(TERMINAL_46);
		TERMINAL_67.addFollower(TERMINAL_47);
		TERMINAL_67.addFollower(TERMINAL_48);
		TERMINAL_67.addFollower(TERMINAL_49);
		TERMINAL_67.addFollower(TERMINAL_50);
		TERMINAL_67.addFollower(TERMINAL_51);
		TERMINAL_67.addFollower(TERMINAL_52);
		TERMINAL_67.addFollower(TERMINAL_53);
		TERMINAL_67.addFollower(TERMINAL_54);
		TERMINAL_67.addFollower(TERMINAL_55);
		TERMINAL_67.addFollower(TERMINAL_56);
		TERMINAL_67.addFollower(TERMINAL_57);
		TERMINAL_67.addFollower(TERMINAL_58);
		TERMINAL_7.addFollower(TERMINAL_3);
		TERMINAL_7.addFollower(TERMINAL_4);
		TERMINAL_7.addFollower(TERMINAL_5);
		TERMINAL_7.addFollower(TERMINAL_6);
		TERMINAL_7.addFollower(TERMINAL_7);
		TERMINAL_7.addFollower(TERMINAL_8);
		TERMINAL_7.addFollower(TERMINAL_9);
		TERMINAL_7.addFollower(TERMINAL_10);
		TERMINAL_7.addFollower(TERMINAL_11);
		TERMINAL_7.addFollower(TERMINAL_12);
		TERMINAL_7.addFollower(TERMINAL_13);
		TERMINAL_7.addFollower(TERMINAL_14);
		TERMINAL_7.addFollower(TERMINAL_15);
		TERMINAL_7.addFollower(TERMINAL_16);
		TERMINAL_7.addFollower(TERMINAL_17);
		TERMINAL_7.addFollower(TERMINAL_18);
		TERMINAL_7.addFollower(TERMINAL_19);
		TERMINAL_7.addFollower(TERMINAL_20);
		TERMINAL_52.addFollower(TERMINAL_3);
		TERMINAL_52.addFollower(TERMINAL_4);
		TERMINAL_52.addFollower(TERMINAL_5);
		TERMINAL_52.addFollower(TERMINAL_6);
		TERMINAL_52.addFollower(TERMINAL_7);
		TERMINAL_52.addFollower(TERMINAL_8);
		TERMINAL_52.addFollower(TERMINAL_9);
		TERMINAL_52.addFollower(TERMINAL_10);
		TERMINAL_52.addFollower(TERMINAL_11);
		TERMINAL_52.addFollower(TERMINAL_12);
		TERMINAL_52.addFollower(TERMINAL_13);
		TERMINAL_52.addFollower(TERMINAL_14);
		TERMINAL_52.addFollower(TERMINAL_15);
		TERMINAL_52.addFollower(TERMINAL_16);
		TERMINAL_52.addFollower(TERMINAL_17);
		TERMINAL_52.addFollower(TERMINAL_18);
		TERMINAL_52.addFollower(TERMINAL_19);
		TERMINAL_52.addFollower(TERMINAL_20);
		TERMINAL_68.addFollower(TERMINAL_2);
		TERMINAL_68.addFollower(TERMINAL_21);
		TERMINAL_68.addFollower(TERMINAL_22);
		TERMINAL_68.addFollower(TERMINAL_23);
		TERMINAL_68.addFollower(TERMINAL_24);
		TERMINAL_68.addFollower(TERMINAL_25);
		TERMINAL_68.addFollower(TERMINAL_26);
		TERMINAL_68.addFollower(TERMINAL_27);
		TERMINAL_68.addFollower(TERMINAL_28);
		TERMINAL_68.addFollower(TERMINAL_29);
		TERMINAL_68.addFollower(TERMINAL_30);
		TERMINAL_68.addFollower(TERMINAL_31);
		TERMINAL_68.addFollower(TERMINAL_32);
		TERMINAL_68.addFollower(TERMINAL_33);
		TERMINAL_68.addFollower(TERMINAL_34);
		TERMINAL_68.addFollower(TERMINAL_35);
		TERMINAL_68.addFollower(TERMINAL_3);
		TERMINAL_68.addFollower(TERMINAL_4);
		TERMINAL_68.addFollower(TERMINAL_5);
		TERMINAL_68.addFollower(TERMINAL_36);
		TERMINAL_68.addFollower(TERMINAL_37);
		TERMINAL_68.addFollower(TERMINAL_0);
		TERMINAL_68.addFollower(TERMINAL_1);
		TERMINAL_68.addFollower(TERMINAL_38);
		TERMINAL_68.addFollower(TERMINAL_39);
		TERMINAL_68.addFollower(TERMINAL_40);
		TERMINAL_68.addFollower(TERMINAL_41);
		TERMINAL_68.addFollower(TERMINAL_6);
		TERMINAL_68.addFollower(TERMINAL_7);
		TERMINAL_68.addFollower(TERMINAL_8);
		TERMINAL_68.addFollower(TERMINAL_9);
		TERMINAL_68.addFollower(TERMINAL_10);
		TERMINAL_68.addFollower(TERMINAL_11);
		TERMINAL_68.addFollower(TERMINAL_12);
		TERMINAL_68.addFollower(TERMINAL_13);
		TERMINAL_68.addFollower(TERMINAL_14);
		TERMINAL_68.addFollower(TERMINAL_15);
		TERMINAL_68.addFollower(TERMINAL_16);
		TERMINAL_68.addFollower(TERMINAL_17);
		TERMINAL_68.addFollower(TERMINAL_18);
		TERMINAL_68.addFollower(TERMINAL_19);
		TERMINAL_68.addFollower(TERMINAL_20);
		TERMINAL_68.addFollower(TERMINAL_42);
		TERMINAL_68.addFollower(TERMINAL_43);
		TERMINAL_68.addFollower(TERMINAL_44);
		TERMINAL_68.addFollower(TERMINAL_45);
		TERMINAL_68.addFollower(TERMINAL_46);
		TERMINAL_68.addFollower(TERMINAL_47);
		TERMINAL_68.addFollower(TERMINAL_48);
		TERMINAL_68.addFollower(TERMINAL_49);
		TERMINAL_68.addFollower(TERMINAL_50);
		TERMINAL_68.addFollower(TERMINAL_51);
		TERMINAL_68.addFollower(TERMINAL_52);
		TERMINAL_68.addFollower(TERMINAL_53);
		TERMINAL_68.addFollower(TERMINAL_54);
		TERMINAL_68.addFollower(TERMINAL_55);
		TERMINAL_68.addFollower(TERMINAL_56);
		TERMINAL_68.addFollower(TERMINAL_57);
		TERMINAL_68.addFollower(TERMINAL_58);
		TERMINAL_8.addFollower(TERMINAL_3);
		TERMINAL_8.addFollower(TERMINAL_4);
		TERMINAL_8.addFollower(TERMINAL_5);
		TERMINAL_8.addFollower(TERMINAL_6);
		TERMINAL_8.addFollower(TERMINAL_7);
		TERMINAL_8.addFollower(TERMINAL_8);
		TERMINAL_8.addFollower(TERMINAL_9);
		TERMINAL_8.addFollower(TERMINAL_10);
		TERMINAL_8.addFollower(TERMINAL_11);
		TERMINAL_8.addFollower(TERMINAL_12);
		TERMINAL_8.addFollower(TERMINAL_13);
		TERMINAL_8.addFollower(TERMINAL_14);
		TERMINAL_8.addFollower(TERMINAL_15);
		TERMINAL_8.addFollower(TERMINAL_16);
		TERMINAL_8.addFollower(TERMINAL_17);
		TERMINAL_8.addFollower(TERMINAL_18);
		TERMINAL_8.addFollower(TERMINAL_19);
		TERMINAL_8.addFollower(TERMINAL_20);
		TERMINAL_69.addFollower(TERMINAL_3);
		TERMINAL_69.addFollower(TERMINAL_4);
		TERMINAL_69.addFollower(TERMINAL_5);
		TERMINAL_69.addFollower(TERMINAL_6);
		TERMINAL_69.addFollower(TERMINAL_7);
		TERMINAL_69.addFollower(TERMINAL_8);
		TERMINAL_69.addFollower(TERMINAL_9);
		TERMINAL_69.addFollower(TERMINAL_10);
		TERMINAL_69.addFollower(TERMINAL_11);
		TERMINAL_69.addFollower(TERMINAL_12);
		TERMINAL_69.addFollower(TERMINAL_13);
		TERMINAL_69.addFollower(TERMINAL_14);
		TERMINAL_69.addFollower(TERMINAL_15);
		TERMINAL_69.addFollower(TERMINAL_16);
		TERMINAL_69.addFollower(TERMINAL_17);
		TERMINAL_69.addFollower(TERMINAL_18);
		TERMINAL_69.addFollower(TERMINAL_19);
		TERMINAL_69.addFollower(TERMINAL_20);
		TERMINAL_70.addFollower(TERMINAL_2);
		TERMINAL_70.addFollower(TERMINAL_21);
		TERMINAL_70.addFollower(TERMINAL_22);
		TERMINAL_70.addFollower(TERMINAL_23);
		TERMINAL_70.addFollower(TERMINAL_24);
		TERMINAL_70.addFollower(TERMINAL_25);
		TERMINAL_70.addFollower(TERMINAL_26);
		TERMINAL_70.addFollower(TERMINAL_27);
		TERMINAL_70.addFollower(TERMINAL_28);
		TERMINAL_70.addFollower(TERMINAL_29);
		TERMINAL_70.addFollower(TERMINAL_30);
		TERMINAL_70.addFollower(TERMINAL_31);
		TERMINAL_70.addFollower(TERMINAL_32);
		TERMINAL_70.addFollower(TERMINAL_33);
		TERMINAL_70.addFollower(TERMINAL_34);
		TERMINAL_70.addFollower(TERMINAL_35);
		TERMINAL_70.addFollower(TERMINAL_3);
		TERMINAL_70.addFollower(TERMINAL_4);
		TERMINAL_70.addFollower(TERMINAL_5);
		TERMINAL_70.addFollower(TERMINAL_36);
		TERMINAL_70.addFollower(TERMINAL_37);
		TERMINAL_70.addFollower(TERMINAL_0);
		TERMINAL_70.addFollower(TERMINAL_1);
		TERMINAL_70.addFollower(TERMINAL_38);
		TERMINAL_70.addFollower(TERMINAL_39);
		TERMINAL_70.addFollower(TERMINAL_40);
		TERMINAL_70.addFollower(TERMINAL_41);
		TERMINAL_70.addFollower(TERMINAL_6);
		TERMINAL_70.addFollower(TERMINAL_7);
		TERMINAL_70.addFollower(TERMINAL_8);
		TERMINAL_70.addFollower(TERMINAL_9);
		TERMINAL_70.addFollower(TERMINAL_10);
		TERMINAL_70.addFollower(TERMINAL_11);
		TERMINAL_70.addFollower(TERMINAL_12);
		TERMINAL_70.addFollower(TERMINAL_13);
		TERMINAL_70.addFollower(TERMINAL_14);
		TERMINAL_70.addFollower(TERMINAL_15);
		TERMINAL_70.addFollower(TERMINAL_16);
		TERMINAL_70.addFollower(TERMINAL_17);
		TERMINAL_70.addFollower(TERMINAL_18);
		TERMINAL_70.addFollower(TERMINAL_19);
		TERMINAL_70.addFollower(TERMINAL_20);
		TERMINAL_70.addFollower(TERMINAL_42);
		TERMINAL_70.addFollower(TERMINAL_43);
		TERMINAL_70.addFollower(TERMINAL_44);
		TERMINAL_70.addFollower(TERMINAL_45);
		TERMINAL_70.addFollower(TERMINAL_46);
		TERMINAL_70.addFollower(TERMINAL_47);
		TERMINAL_70.addFollower(TERMINAL_48);
		TERMINAL_70.addFollower(TERMINAL_49);
		TERMINAL_70.addFollower(TERMINAL_50);
		TERMINAL_70.addFollower(TERMINAL_51);
		TERMINAL_70.addFollower(TERMINAL_52);
		TERMINAL_70.addFollower(TERMINAL_53);
		TERMINAL_70.addFollower(TERMINAL_54);
		TERMINAL_70.addFollower(TERMINAL_55);
		TERMINAL_70.addFollower(TERMINAL_56);
		TERMINAL_70.addFollower(TERMINAL_57);
		TERMINAL_70.addFollower(TERMINAL_58);
		TERMINAL_9.addFollower(TERMINAL_3);
		TERMINAL_9.addFollower(TERMINAL_4);
		TERMINAL_9.addFollower(TERMINAL_5);
		TERMINAL_9.addFollower(TERMINAL_6);
		TERMINAL_9.addFollower(TERMINAL_7);
		TERMINAL_9.addFollower(TERMINAL_8);
		TERMINAL_9.addFollower(TERMINAL_9);
		TERMINAL_9.addFollower(TERMINAL_10);
		TERMINAL_9.addFollower(TERMINAL_11);
		TERMINAL_9.addFollower(TERMINAL_12);
		TERMINAL_9.addFollower(TERMINAL_13);
		TERMINAL_9.addFollower(TERMINAL_14);
		TERMINAL_9.addFollower(TERMINAL_15);
		TERMINAL_9.addFollower(TERMINAL_16);
		TERMINAL_9.addFollower(TERMINAL_17);
		TERMINAL_9.addFollower(TERMINAL_18);
		TERMINAL_9.addFollower(TERMINAL_19);
		TERMINAL_9.addFollower(TERMINAL_20);
		TERMINAL_53.addFollower(TERMINAL_3);
		TERMINAL_53.addFollower(TERMINAL_4);
		TERMINAL_53.addFollower(TERMINAL_5);
		TERMINAL_53.addFollower(TERMINAL_6);
		TERMINAL_53.addFollower(TERMINAL_7);
		TERMINAL_53.addFollower(TERMINAL_8);
		TERMINAL_53.addFollower(TERMINAL_9);
		TERMINAL_53.addFollower(TERMINAL_10);
		TERMINAL_53.addFollower(TERMINAL_11);
		TERMINAL_53.addFollower(TERMINAL_12);
		TERMINAL_53.addFollower(TERMINAL_13);
		TERMINAL_53.addFollower(TERMINAL_14);
		TERMINAL_53.addFollower(TERMINAL_15);
		TERMINAL_53.addFollower(TERMINAL_16);
		TERMINAL_53.addFollower(TERMINAL_17);
		TERMINAL_53.addFollower(TERMINAL_18);
		TERMINAL_53.addFollower(TERMINAL_19);
		TERMINAL_53.addFollower(TERMINAL_20);
		TERMINAL_71.addFollower(TERMINAL_2);
		TERMINAL_71.addFollower(TERMINAL_21);
		TERMINAL_71.addFollower(TERMINAL_22);
		TERMINAL_71.addFollower(TERMINAL_23);
		TERMINAL_71.addFollower(TERMINAL_24);
		TERMINAL_71.addFollower(TERMINAL_25);
		TERMINAL_71.addFollower(TERMINAL_26);
		TERMINAL_71.addFollower(TERMINAL_27);
		TERMINAL_71.addFollower(TERMINAL_28);
		TERMINAL_71.addFollower(TERMINAL_29);
		TERMINAL_71.addFollower(TERMINAL_30);
		TERMINAL_71.addFollower(TERMINAL_31);
		TERMINAL_71.addFollower(TERMINAL_32);
		TERMINAL_71.addFollower(TERMINAL_33);
		TERMINAL_71.addFollower(TERMINAL_34);
		TERMINAL_71.addFollower(TERMINAL_35);
		TERMINAL_71.addFollower(TERMINAL_3);
		TERMINAL_71.addFollower(TERMINAL_4);
		TERMINAL_71.addFollower(TERMINAL_5);
		TERMINAL_71.addFollower(TERMINAL_36);
		TERMINAL_71.addFollower(TERMINAL_37);
		TERMINAL_71.addFollower(TERMINAL_0);
		TERMINAL_71.addFollower(TERMINAL_1);
		TERMINAL_71.addFollower(TERMINAL_38);
		TERMINAL_71.addFollower(TERMINAL_39);
		TERMINAL_71.addFollower(TERMINAL_40);
		TERMINAL_71.addFollower(TERMINAL_41);
		TERMINAL_71.addFollower(TERMINAL_6);
		TERMINAL_71.addFollower(TERMINAL_7);
		TERMINAL_71.addFollower(TERMINAL_8);
		TERMINAL_71.addFollower(TERMINAL_9);
		TERMINAL_71.addFollower(TERMINAL_10);
		TERMINAL_71.addFollower(TERMINAL_11);
		TERMINAL_71.addFollower(TERMINAL_12);
		TERMINAL_71.addFollower(TERMINAL_13);
		TERMINAL_71.addFollower(TERMINAL_14);
		TERMINAL_71.addFollower(TERMINAL_15);
		TERMINAL_71.addFollower(TERMINAL_16);
		TERMINAL_71.addFollower(TERMINAL_17);
		TERMINAL_71.addFollower(TERMINAL_18);
		TERMINAL_71.addFollower(TERMINAL_19);
		TERMINAL_71.addFollower(TERMINAL_20);
		TERMINAL_71.addFollower(TERMINAL_42);
		TERMINAL_71.addFollower(TERMINAL_43);
		TERMINAL_71.addFollower(TERMINAL_44);
		TERMINAL_71.addFollower(TERMINAL_45);
		TERMINAL_71.addFollower(TERMINAL_46);
		TERMINAL_71.addFollower(TERMINAL_47);
		TERMINAL_71.addFollower(TERMINAL_48);
		TERMINAL_71.addFollower(TERMINAL_49);
		TERMINAL_71.addFollower(TERMINAL_50);
		TERMINAL_71.addFollower(TERMINAL_51);
		TERMINAL_71.addFollower(TERMINAL_52);
		TERMINAL_71.addFollower(TERMINAL_53);
		TERMINAL_71.addFollower(TERMINAL_54);
		TERMINAL_71.addFollower(TERMINAL_55);
		TERMINAL_71.addFollower(TERMINAL_56);
		TERMINAL_71.addFollower(TERMINAL_57);
		TERMINAL_71.addFollower(TERMINAL_58);
		TERMINAL_10.addFollower(TERMINAL_3);
		TERMINAL_10.addFollower(TERMINAL_4);
		TERMINAL_10.addFollower(TERMINAL_5);
		TERMINAL_10.addFollower(TERMINAL_6);
		TERMINAL_10.addFollower(TERMINAL_7);
		TERMINAL_10.addFollower(TERMINAL_8);
		TERMINAL_10.addFollower(TERMINAL_9);
		TERMINAL_10.addFollower(TERMINAL_10);
		TERMINAL_10.addFollower(TERMINAL_11);
		TERMINAL_10.addFollower(TERMINAL_12);
		TERMINAL_10.addFollower(TERMINAL_13);
		TERMINAL_10.addFollower(TERMINAL_14);
		TERMINAL_10.addFollower(TERMINAL_15);
		TERMINAL_10.addFollower(TERMINAL_16);
		TERMINAL_10.addFollower(TERMINAL_17);
		TERMINAL_10.addFollower(TERMINAL_18);
		TERMINAL_10.addFollower(TERMINAL_19);
		TERMINAL_10.addFollower(TERMINAL_20);
		TERMINAL_72.addFollower(TERMINAL_3);
		TERMINAL_72.addFollower(TERMINAL_4);
		TERMINAL_72.addFollower(TERMINAL_5);
		TERMINAL_72.addFollower(TERMINAL_6);
		TERMINAL_72.addFollower(TERMINAL_7);
		TERMINAL_72.addFollower(TERMINAL_8);
		TERMINAL_72.addFollower(TERMINAL_9);
		TERMINAL_72.addFollower(TERMINAL_10);
		TERMINAL_72.addFollower(TERMINAL_11);
		TERMINAL_72.addFollower(TERMINAL_12);
		TERMINAL_72.addFollower(TERMINAL_13);
		TERMINAL_72.addFollower(TERMINAL_14);
		TERMINAL_72.addFollower(TERMINAL_15);
		TERMINAL_72.addFollower(TERMINAL_16);
		TERMINAL_72.addFollower(TERMINAL_17);
		TERMINAL_72.addFollower(TERMINAL_18);
		TERMINAL_72.addFollower(TERMINAL_19);
		TERMINAL_72.addFollower(TERMINAL_20);
		TERMINAL_73.addFollower(TERMINAL_2);
		TERMINAL_73.addFollower(TERMINAL_21);
		TERMINAL_73.addFollower(TERMINAL_22);
		TERMINAL_73.addFollower(TERMINAL_23);
		TERMINAL_73.addFollower(TERMINAL_24);
		TERMINAL_73.addFollower(TERMINAL_25);
		TERMINAL_73.addFollower(TERMINAL_26);
		TERMINAL_73.addFollower(TERMINAL_27);
		TERMINAL_73.addFollower(TERMINAL_28);
		TERMINAL_73.addFollower(TERMINAL_29);
		TERMINAL_73.addFollower(TERMINAL_30);
		TERMINAL_73.addFollower(TERMINAL_31);
		TERMINAL_73.addFollower(TERMINAL_32);
		TERMINAL_73.addFollower(TERMINAL_33);
		TERMINAL_73.addFollower(TERMINAL_34);
		TERMINAL_73.addFollower(TERMINAL_35);
		TERMINAL_73.addFollower(TERMINAL_3);
		TERMINAL_73.addFollower(TERMINAL_4);
		TERMINAL_73.addFollower(TERMINAL_5);
		TERMINAL_73.addFollower(TERMINAL_36);
		TERMINAL_73.addFollower(TERMINAL_37);
		TERMINAL_73.addFollower(TERMINAL_0);
		TERMINAL_73.addFollower(TERMINAL_1);
		TERMINAL_73.addFollower(TERMINAL_38);
		TERMINAL_73.addFollower(TERMINAL_39);
		TERMINAL_73.addFollower(TERMINAL_40);
		TERMINAL_73.addFollower(TERMINAL_41);
		TERMINAL_73.addFollower(TERMINAL_6);
		TERMINAL_73.addFollower(TERMINAL_7);
		TERMINAL_73.addFollower(TERMINAL_8);
		TERMINAL_73.addFollower(TERMINAL_9);
		TERMINAL_73.addFollower(TERMINAL_10);
		TERMINAL_73.addFollower(TERMINAL_11);
		TERMINAL_73.addFollower(TERMINAL_12);
		TERMINAL_73.addFollower(TERMINAL_13);
		TERMINAL_73.addFollower(TERMINAL_14);
		TERMINAL_73.addFollower(TERMINAL_15);
		TERMINAL_73.addFollower(TERMINAL_16);
		TERMINAL_73.addFollower(TERMINAL_17);
		TERMINAL_73.addFollower(TERMINAL_18);
		TERMINAL_73.addFollower(TERMINAL_19);
		TERMINAL_73.addFollower(TERMINAL_20);
		TERMINAL_73.addFollower(TERMINAL_42);
		TERMINAL_73.addFollower(TERMINAL_43);
		TERMINAL_73.addFollower(TERMINAL_44);
		TERMINAL_73.addFollower(TERMINAL_45);
		TERMINAL_73.addFollower(TERMINAL_46);
		TERMINAL_73.addFollower(TERMINAL_47);
		TERMINAL_73.addFollower(TERMINAL_48);
		TERMINAL_73.addFollower(TERMINAL_49);
		TERMINAL_73.addFollower(TERMINAL_50);
		TERMINAL_73.addFollower(TERMINAL_51);
		TERMINAL_73.addFollower(TERMINAL_52);
		TERMINAL_73.addFollower(TERMINAL_53);
		TERMINAL_73.addFollower(TERMINAL_54);
		TERMINAL_73.addFollower(TERMINAL_55);
		TERMINAL_73.addFollower(TERMINAL_56);
		TERMINAL_73.addFollower(TERMINAL_57);
		TERMINAL_73.addFollower(TERMINAL_58);
		TERMINAL_11.addFollower(TERMINAL_3);
		TERMINAL_11.addFollower(TERMINAL_4);
		TERMINAL_11.addFollower(TERMINAL_5);
		TERMINAL_11.addFollower(TERMINAL_6);
		TERMINAL_11.addFollower(TERMINAL_7);
		TERMINAL_11.addFollower(TERMINAL_8);
		TERMINAL_11.addFollower(TERMINAL_9);
		TERMINAL_11.addFollower(TERMINAL_10);
		TERMINAL_11.addFollower(TERMINAL_11);
		TERMINAL_11.addFollower(TERMINAL_12);
		TERMINAL_11.addFollower(TERMINAL_13);
		TERMINAL_11.addFollower(TERMINAL_14);
		TERMINAL_11.addFollower(TERMINAL_15);
		TERMINAL_11.addFollower(TERMINAL_16);
		TERMINAL_11.addFollower(TERMINAL_17);
		TERMINAL_11.addFollower(TERMINAL_18);
		TERMINAL_11.addFollower(TERMINAL_19);
		TERMINAL_11.addFollower(TERMINAL_20);
		TERMINAL_54.addFollower(TERMINAL_3);
		TERMINAL_54.addFollower(TERMINAL_4);
		TERMINAL_54.addFollower(TERMINAL_5);
		TERMINAL_54.addFollower(TERMINAL_6);
		TERMINAL_54.addFollower(TERMINAL_7);
		TERMINAL_54.addFollower(TERMINAL_8);
		TERMINAL_54.addFollower(TERMINAL_9);
		TERMINAL_54.addFollower(TERMINAL_10);
		TERMINAL_54.addFollower(TERMINAL_11);
		TERMINAL_54.addFollower(TERMINAL_12);
		TERMINAL_54.addFollower(TERMINAL_13);
		TERMINAL_54.addFollower(TERMINAL_14);
		TERMINAL_54.addFollower(TERMINAL_15);
		TERMINAL_54.addFollower(TERMINAL_16);
		TERMINAL_54.addFollower(TERMINAL_17);
		TERMINAL_54.addFollower(TERMINAL_18);
		TERMINAL_54.addFollower(TERMINAL_19);
		TERMINAL_54.addFollower(TERMINAL_20);
		TERMINAL_74.addFollower(TERMINAL_2);
		TERMINAL_74.addFollower(TERMINAL_21);
		TERMINAL_74.addFollower(TERMINAL_22);
		TERMINAL_74.addFollower(TERMINAL_23);
		TERMINAL_74.addFollower(TERMINAL_24);
		TERMINAL_74.addFollower(TERMINAL_25);
		TERMINAL_74.addFollower(TERMINAL_26);
		TERMINAL_74.addFollower(TERMINAL_27);
		TERMINAL_74.addFollower(TERMINAL_28);
		TERMINAL_74.addFollower(TERMINAL_29);
		TERMINAL_74.addFollower(TERMINAL_30);
		TERMINAL_74.addFollower(TERMINAL_31);
		TERMINAL_74.addFollower(TERMINAL_32);
		TERMINAL_74.addFollower(TERMINAL_33);
		TERMINAL_74.addFollower(TERMINAL_34);
		TERMINAL_74.addFollower(TERMINAL_35);
		TERMINAL_74.addFollower(TERMINAL_3);
		TERMINAL_74.addFollower(TERMINAL_4);
		TERMINAL_74.addFollower(TERMINAL_5);
		TERMINAL_74.addFollower(TERMINAL_36);
		TERMINAL_74.addFollower(TERMINAL_37);
		TERMINAL_74.addFollower(TERMINAL_0);
		TERMINAL_74.addFollower(TERMINAL_1);
		TERMINAL_74.addFollower(TERMINAL_38);
		TERMINAL_74.addFollower(TERMINAL_39);
		TERMINAL_74.addFollower(TERMINAL_40);
		TERMINAL_74.addFollower(TERMINAL_41);
		TERMINAL_74.addFollower(TERMINAL_6);
		TERMINAL_74.addFollower(TERMINAL_7);
		TERMINAL_74.addFollower(TERMINAL_8);
		TERMINAL_74.addFollower(TERMINAL_9);
		TERMINAL_74.addFollower(TERMINAL_10);
		TERMINAL_74.addFollower(TERMINAL_11);
		TERMINAL_74.addFollower(TERMINAL_12);
		TERMINAL_74.addFollower(TERMINAL_13);
		TERMINAL_74.addFollower(TERMINAL_14);
		TERMINAL_74.addFollower(TERMINAL_15);
		TERMINAL_74.addFollower(TERMINAL_16);
		TERMINAL_74.addFollower(TERMINAL_17);
		TERMINAL_74.addFollower(TERMINAL_18);
		TERMINAL_74.addFollower(TERMINAL_19);
		TERMINAL_74.addFollower(TERMINAL_20);
		TERMINAL_74.addFollower(TERMINAL_42);
		TERMINAL_74.addFollower(TERMINAL_43);
		TERMINAL_74.addFollower(TERMINAL_44);
		TERMINAL_74.addFollower(TERMINAL_45);
		TERMINAL_74.addFollower(TERMINAL_46);
		TERMINAL_74.addFollower(TERMINAL_47);
		TERMINAL_74.addFollower(TERMINAL_48);
		TERMINAL_74.addFollower(TERMINAL_49);
		TERMINAL_74.addFollower(TERMINAL_50);
		TERMINAL_74.addFollower(TERMINAL_51);
		TERMINAL_74.addFollower(TERMINAL_52);
		TERMINAL_74.addFollower(TERMINAL_53);
		TERMINAL_74.addFollower(TERMINAL_54);
		TERMINAL_74.addFollower(TERMINAL_55);
		TERMINAL_74.addFollower(TERMINAL_56);
		TERMINAL_74.addFollower(TERMINAL_57);
		TERMINAL_74.addFollower(TERMINAL_58);
		TERMINAL_12.addFollower(TERMINAL_3);
		TERMINAL_12.addFollower(TERMINAL_4);
		TERMINAL_12.addFollower(TERMINAL_5);
		TERMINAL_12.addFollower(TERMINAL_6);
		TERMINAL_12.addFollower(TERMINAL_7);
		TERMINAL_12.addFollower(TERMINAL_8);
		TERMINAL_12.addFollower(TERMINAL_9);
		TERMINAL_12.addFollower(TERMINAL_10);
		TERMINAL_12.addFollower(TERMINAL_11);
		TERMINAL_12.addFollower(TERMINAL_12);
		TERMINAL_12.addFollower(TERMINAL_13);
		TERMINAL_12.addFollower(TERMINAL_14);
		TERMINAL_12.addFollower(TERMINAL_15);
		TERMINAL_12.addFollower(TERMINAL_16);
		TERMINAL_12.addFollower(TERMINAL_17);
		TERMINAL_12.addFollower(TERMINAL_18);
		TERMINAL_12.addFollower(TERMINAL_19);
		TERMINAL_12.addFollower(TERMINAL_20);
		TERMINAL_75.addFollower(TERMINAL_3);
		TERMINAL_75.addFollower(TERMINAL_4);
		TERMINAL_75.addFollower(TERMINAL_5);
		TERMINAL_75.addFollower(TERMINAL_6);
		TERMINAL_75.addFollower(TERMINAL_7);
		TERMINAL_75.addFollower(TERMINAL_8);
		TERMINAL_75.addFollower(TERMINAL_9);
		TERMINAL_75.addFollower(TERMINAL_10);
		TERMINAL_75.addFollower(TERMINAL_11);
		TERMINAL_75.addFollower(TERMINAL_12);
		TERMINAL_75.addFollower(TERMINAL_13);
		TERMINAL_75.addFollower(TERMINAL_14);
		TERMINAL_75.addFollower(TERMINAL_15);
		TERMINAL_75.addFollower(TERMINAL_16);
		TERMINAL_75.addFollower(TERMINAL_17);
		TERMINAL_75.addFollower(TERMINAL_18);
		TERMINAL_75.addFollower(TERMINAL_19);
		TERMINAL_75.addFollower(TERMINAL_20);
		TERMINAL_76.addFollower(TERMINAL_2);
		TERMINAL_76.addFollower(TERMINAL_21);
		TERMINAL_76.addFollower(TERMINAL_22);
		TERMINAL_76.addFollower(TERMINAL_23);
		TERMINAL_76.addFollower(TERMINAL_24);
		TERMINAL_76.addFollower(TERMINAL_25);
		TERMINAL_76.addFollower(TERMINAL_26);
		TERMINAL_76.addFollower(TERMINAL_27);
		TERMINAL_76.addFollower(TERMINAL_28);
		TERMINAL_76.addFollower(TERMINAL_29);
		TERMINAL_76.addFollower(TERMINAL_30);
		TERMINAL_76.addFollower(TERMINAL_31);
		TERMINAL_76.addFollower(TERMINAL_32);
		TERMINAL_76.addFollower(TERMINAL_33);
		TERMINAL_76.addFollower(TERMINAL_34);
		TERMINAL_76.addFollower(TERMINAL_35);
		TERMINAL_76.addFollower(TERMINAL_3);
		TERMINAL_76.addFollower(TERMINAL_4);
		TERMINAL_76.addFollower(TERMINAL_5);
		TERMINAL_76.addFollower(TERMINAL_36);
		TERMINAL_76.addFollower(TERMINAL_37);
		TERMINAL_76.addFollower(TERMINAL_0);
		TERMINAL_76.addFollower(TERMINAL_1);
		TERMINAL_76.addFollower(TERMINAL_38);
		TERMINAL_76.addFollower(TERMINAL_39);
		TERMINAL_76.addFollower(TERMINAL_40);
		TERMINAL_76.addFollower(TERMINAL_41);
		TERMINAL_76.addFollower(TERMINAL_6);
		TERMINAL_76.addFollower(TERMINAL_7);
		TERMINAL_76.addFollower(TERMINAL_8);
		TERMINAL_76.addFollower(TERMINAL_9);
		TERMINAL_76.addFollower(TERMINAL_10);
		TERMINAL_76.addFollower(TERMINAL_11);
		TERMINAL_76.addFollower(TERMINAL_12);
		TERMINAL_76.addFollower(TERMINAL_13);
		TERMINAL_76.addFollower(TERMINAL_14);
		TERMINAL_76.addFollower(TERMINAL_15);
		TERMINAL_76.addFollower(TERMINAL_16);
		TERMINAL_76.addFollower(TERMINAL_17);
		TERMINAL_76.addFollower(TERMINAL_18);
		TERMINAL_76.addFollower(TERMINAL_19);
		TERMINAL_76.addFollower(TERMINAL_20);
		TERMINAL_76.addFollower(TERMINAL_42);
		TERMINAL_76.addFollower(TERMINAL_43);
		TERMINAL_76.addFollower(TERMINAL_44);
		TERMINAL_76.addFollower(TERMINAL_45);
		TERMINAL_76.addFollower(TERMINAL_46);
		TERMINAL_76.addFollower(TERMINAL_47);
		TERMINAL_76.addFollower(TERMINAL_48);
		TERMINAL_76.addFollower(TERMINAL_49);
		TERMINAL_76.addFollower(TERMINAL_50);
		TERMINAL_76.addFollower(TERMINAL_51);
		TERMINAL_76.addFollower(TERMINAL_52);
		TERMINAL_76.addFollower(TERMINAL_53);
		TERMINAL_76.addFollower(TERMINAL_54);
		TERMINAL_76.addFollower(TERMINAL_55);
		TERMINAL_76.addFollower(TERMINAL_56);
		TERMINAL_76.addFollower(TERMINAL_57);
		TERMINAL_76.addFollower(TERMINAL_58);
		TERMINAL_13.addFollower(TERMINAL_3);
		TERMINAL_13.addFollower(TERMINAL_4);
		TERMINAL_13.addFollower(TERMINAL_5);
		TERMINAL_13.addFollower(TERMINAL_6);
		TERMINAL_13.addFollower(TERMINAL_7);
		TERMINAL_13.addFollower(TERMINAL_8);
		TERMINAL_13.addFollower(TERMINAL_9);
		TERMINAL_13.addFollower(TERMINAL_10);
		TERMINAL_13.addFollower(TERMINAL_11);
		TERMINAL_13.addFollower(TERMINAL_12);
		TERMINAL_13.addFollower(TERMINAL_13);
		TERMINAL_13.addFollower(TERMINAL_14);
		TERMINAL_13.addFollower(TERMINAL_15);
		TERMINAL_13.addFollower(TERMINAL_16);
		TERMINAL_13.addFollower(TERMINAL_17);
		TERMINAL_13.addFollower(TERMINAL_18);
		TERMINAL_13.addFollower(TERMINAL_19);
		TERMINAL_13.addFollower(TERMINAL_20);
		TERMINAL_55.addFollower(TERMINAL_3);
		TERMINAL_55.addFollower(TERMINAL_4);
		TERMINAL_55.addFollower(TERMINAL_5);
		TERMINAL_55.addFollower(TERMINAL_6);
		TERMINAL_55.addFollower(TERMINAL_7);
		TERMINAL_55.addFollower(TERMINAL_8);
		TERMINAL_55.addFollower(TERMINAL_9);
		TERMINAL_55.addFollower(TERMINAL_10);
		TERMINAL_55.addFollower(TERMINAL_11);
		TERMINAL_55.addFollower(TERMINAL_12);
		TERMINAL_55.addFollower(TERMINAL_13);
		TERMINAL_55.addFollower(TERMINAL_14);
		TERMINAL_55.addFollower(TERMINAL_15);
		TERMINAL_55.addFollower(TERMINAL_16);
		TERMINAL_55.addFollower(TERMINAL_17);
		TERMINAL_55.addFollower(TERMINAL_18);
		TERMINAL_55.addFollower(TERMINAL_19);
		TERMINAL_55.addFollower(TERMINAL_20);
		TERMINAL_77.addFollower(TERMINAL_2);
		TERMINAL_77.addFollower(TERMINAL_21);
		TERMINAL_77.addFollower(TERMINAL_22);
		TERMINAL_77.addFollower(TERMINAL_23);
		TERMINAL_77.addFollower(TERMINAL_24);
		TERMINAL_77.addFollower(TERMINAL_25);
		TERMINAL_77.addFollower(TERMINAL_26);
		TERMINAL_77.addFollower(TERMINAL_27);
		TERMINAL_77.addFollower(TERMINAL_28);
		TERMINAL_77.addFollower(TERMINAL_29);
		TERMINAL_77.addFollower(TERMINAL_30);
		TERMINAL_77.addFollower(TERMINAL_31);
		TERMINAL_77.addFollower(TERMINAL_32);
		TERMINAL_77.addFollower(TERMINAL_33);
		TERMINAL_77.addFollower(TERMINAL_34);
		TERMINAL_77.addFollower(TERMINAL_35);
		TERMINAL_77.addFollower(TERMINAL_3);
		TERMINAL_77.addFollower(TERMINAL_4);
		TERMINAL_77.addFollower(TERMINAL_5);
		TERMINAL_77.addFollower(TERMINAL_36);
		TERMINAL_77.addFollower(TERMINAL_37);
		TERMINAL_77.addFollower(TERMINAL_0);
		TERMINAL_77.addFollower(TERMINAL_1);
		TERMINAL_77.addFollower(TERMINAL_38);
		TERMINAL_77.addFollower(TERMINAL_39);
		TERMINAL_77.addFollower(TERMINAL_40);
		TERMINAL_77.addFollower(TERMINAL_41);
		TERMINAL_77.addFollower(TERMINAL_6);
		TERMINAL_77.addFollower(TERMINAL_7);
		TERMINAL_77.addFollower(TERMINAL_8);
		TERMINAL_77.addFollower(TERMINAL_9);
		TERMINAL_77.addFollower(TERMINAL_10);
		TERMINAL_77.addFollower(TERMINAL_11);
		TERMINAL_77.addFollower(TERMINAL_12);
		TERMINAL_77.addFollower(TERMINAL_13);
		TERMINAL_77.addFollower(TERMINAL_14);
		TERMINAL_77.addFollower(TERMINAL_15);
		TERMINAL_77.addFollower(TERMINAL_16);
		TERMINAL_77.addFollower(TERMINAL_17);
		TERMINAL_77.addFollower(TERMINAL_18);
		TERMINAL_77.addFollower(TERMINAL_19);
		TERMINAL_77.addFollower(TERMINAL_20);
		TERMINAL_77.addFollower(TERMINAL_42);
		TERMINAL_77.addFollower(TERMINAL_43);
		TERMINAL_77.addFollower(TERMINAL_44);
		TERMINAL_77.addFollower(TERMINAL_45);
		TERMINAL_77.addFollower(TERMINAL_46);
		TERMINAL_77.addFollower(TERMINAL_47);
		TERMINAL_77.addFollower(TERMINAL_48);
		TERMINAL_77.addFollower(TERMINAL_49);
		TERMINAL_77.addFollower(TERMINAL_50);
		TERMINAL_77.addFollower(TERMINAL_51);
		TERMINAL_77.addFollower(TERMINAL_52);
		TERMINAL_77.addFollower(TERMINAL_53);
		TERMINAL_77.addFollower(TERMINAL_54);
		TERMINAL_77.addFollower(TERMINAL_55);
		TERMINAL_77.addFollower(TERMINAL_56);
		TERMINAL_77.addFollower(TERMINAL_57);
		TERMINAL_77.addFollower(TERMINAL_58);
		TERMINAL_14.addFollower(TERMINAL_3);
		TERMINAL_14.addFollower(TERMINAL_4);
		TERMINAL_14.addFollower(TERMINAL_5);
		TERMINAL_14.addFollower(TERMINAL_6);
		TERMINAL_14.addFollower(TERMINAL_7);
		TERMINAL_14.addFollower(TERMINAL_8);
		TERMINAL_14.addFollower(TERMINAL_9);
		TERMINAL_14.addFollower(TERMINAL_10);
		TERMINAL_14.addFollower(TERMINAL_11);
		TERMINAL_14.addFollower(TERMINAL_12);
		TERMINAL_14.addFollower(TERMINAL_13);
		TERMINAL_14.addFollower(TERMINAL_14);
		TERMINAL_14.addFollower(TERMINAL_15);
		TERMINAL_14.addFollower(TERMINAL_16);
		TERMINAL_14.addFollower(TERMINAL_17);
		TERMINAL_14.addFollower(TERMINAL_18);
		TERMINAL_14.addFollower(TERMINAL_19);
		TERMINAL_14.addFollower(TERMINAL_20);
		TERMINAL_78.addFollower(TERMINAL_3);
		TERMINAL_78.addFollower(TERMINAL_4);
		TERMINAL_78.addFollower(TERMINAL_5);
		TERMINAL_78.addFollower(TERMINAL_6);
		TERMINAL_78.addFollower(TERMINAL_7);
		TERMINAL_78.addFollower(TERMINAL_8);
		TERMINAL_78.addFollower(TERMINAL_9);
		TERMINAL_78.addFollower(TERMINAL_10);
		TERMINAL_78.addFollower(TERMINAL_11);
		TERMINAL_78.addFollower(TERMINAL_12);
		TERMINAL_78.addFollower(TERMINAL_13);
		TERMINAL_78.addFollower(TERMINAL_14);
		TERMINAL_78.addFollower(TERMINAL_15);
		TERMINAL_78.addFollower(TERMINAL_16);
		TERMINAL_78.addFollower(TERMINAL_17);
		TERMINAL_78.addFollower(TERMINAL_18);
		TERMINAL_78.addFollower(TERMINAL_19);
		TERMINAL_78.addFollower(TERMINAL_20);
		TERMINAL_79.addFollower(TERMINAL_2);
		TERMINAL_79.addFollower(TERMINAL_21);
		TERMINAL_79.addFollower(TERMINAL_22);
		TERMINAL_79.addFollower(TERMINAL_23);
		TERMINAL_79.addFollower(TERMINAL_24);
		TERMINAL_79.addFollower(TERMINAL_25);
		TERMINAL_79.addFollower(TERMINAL_26);
		TERMINAL_79.addFollower(TERMINAL_27);
		TERMINAL_79.addFollower(TERMINAL_28);
		TERMINAL_79.addFollower(TERMINAL_29);
		TERMINAL_79.addFollower(TERMINAL_30);
		TERMINAL_79.addFollower(TERMINAL_31);
		TERMINAL_79.addFollower(TERMINAL_32);
		TERMINAL_79.addFollower(TERMINAL_33);
		TERMINAL_79.addFollower(TERMINAL_34);
		TERMINAL_79.addFollower(TERMINAL_35);
		TERMINAL_79.addFollower(TERMINAL_3);
		TERMINAL_79.addFollower(TERMINAL_4);
		TERMINAL_79.addFollower(TERMINAL_5);
		TERMINAL_79.addFollower(TERMINAL_36);
		TERMINAL_79.addFollower(TERMINAL_37);
		TERMINAL_79.addFollower(TERMINAL_0);
		TERMINAL_79.addFollower(TERMINAL_1);
		TERMINAL_79.addFollower(TERMINAL_38);
		TERMINAL_79.addFollower(TERMINAL_39);
		TERMINAL_79.addFollower(TERMINAL_40);
		TERMINAL_79.addFollower(TERMINAL_41);
		TERMINAL_79.addFollower(TERMINAL_6);
		TERMINAL_79.addFollower(TERMINAL_7);
		TERMINAL_79.addFollower(TERMINAL_8);
		TERMINAL_79.addFollower(TERMINAL_9);
		TERMINAL_79.addFollower(TERMINAL_10);
		TERMINAL_79.addFollower(TERMINAL_11);
		TERMINAL_79.addFollower(TERMINAL_12);
		TERMINAL_79.addFollower(TERMINAL_13);
		TERMINAL_79.addFollower(TERMINAL_14);
		TERMINAL_79.addFollower(TERMINAL_15);
		TERMINAL_79.addFollower(TERMINAL_16);
		TERMINAL_79.addFollower(TERMINAL_17);
		TERMINAL_79.addFollower(TERMINAL_18);
		TERMINAL_79.addFollower(TERMINAL_19);
		TERMINAL_79.addFollower(TERMINAL_20);
		TERMINAL_79.addFollower(TERMINAL_42);
		TERMINAL_79.addFollower(TERMINAL_43);
		TERMINAL_79.addFollower(TERMINAL_44);
		TERMINAL_79.addFollower(TERMINAL_45);
		TERMINAL_79.addFollower(TERMINAL_46);
		TERMINAL_79.addFollower(TERMINAL_47);
		TERMINAL_79.addFollower(TERMINAL_48);
		TERMINAL_79.addFollower(TERMINAL_49);
		TERMINAL_79.addFollower(TERMINAL_50);
		TERMINAL_79.addFollower(TERMINAL_51);
		TERMINAL_79.addFollower(TERMINAL_52);
		TERMINAL_79.addFollower(TERMINAL_53);
		TERMINAL_79.addFollower(TERMINAL_54);
		TERMINAL_79.addFollower(TERMINAL_55);
		TERMINAL_79.addFollower(TERMINAL_56);
		TERMINAL_79.addFollower(TERMINAL_57);
		TERMINAL_79.addFollower(TERMINAL_58);
		TERMINAL_15.addFollower(TERMINAL_3);
		TERMINAL_15.addFollower(TERMINAL_4);
		TERMINAL_15.addFollower(TERMINAL_5);
		TERMINAL_15.addFollower(TERMINAL_6);
		TERMINAL_15.addFollower(TERMINAL_7);
		TERMINAL_15.addFollower(TERMINAL_8);
		TERMINAL_15.addFollower(TERMINAL_9);
		TERMINAL_15.addFollower(TERMINAL_10);
		TERMINAL_15.addFollower(TERMINAL_11);
		TERMINAL_15.addFollower(TERMINAL_12);
		TERMINAL_15.addFollower(TERMINAL_13);
		TERMINAL_15.addFollower(TERMINAL_14);
		TERMINAL_15.addFollower(TERMINAL_15);
		TERMINAL_15.addFollower(TERMINAL_16);
		TERMINAL_15.addFollower(TERMINAL_17);
		TERMINAL_15.addFollower(TERMINAL_18);
		TERMINAL_15.addFollower(TERMINAL_19);
		TERMINAL_15.addFollower(TERMINAL_20);
		TERMINAL_56.addFollower(TERMINAL_3);
		TERMINAL_56.addFollower(TERMINAL_4);
		TERMINAL_56.addFollower(TERMINAL_5);
		TERMINAL_56.addFollower(TERMINAL_6);
		TERMINAL_56.addFollower(TERMINAL_7);
		TERMINAL_56.addFollower(TERMINAL_8);
		TERMINAL_56.addFollower(TERMINAL_9);
		TERMINAL_56.addFollower(TERMINAL_10);
		TERMINAL_56.addFollower(TERMINAL_11);
		TERMINAL_56.addFollower(TERMINAL_12);
		TERMINAL_56.addFollower(TERMINAL_13);
		TERMINAL_56.addFollower(TERMINAL_14);
		TERMINAL_56.addFollower(TERMINAL_15);
		TERMINAL_56.addFollower(TERMINAL_16);
		TERMINAL_56.addFollower(TERMINAL_17);
		TERMINAL_56.addFollower(TERMINAL_18);
		TERMINAL_56.addFollower(TERMINAL_19);
		TERMINAL_56.addFollower(TERMINAL_20);
		TERMINAL_80.addFollower(TERMINAL_2);
		TERMINAL_80.addFollower(TERMINAL_21);
		TERMINAL_80.addFollower(TERMINAL_22);
		TERMINAL_80.addFollower(TERMINAL_23);
		TERMINAL_80.addFollower(TERMINAL_24);
		TERMINAL_80.addFollower(TERMINAL_25);
		TERMINAL_80.addFollower(TERMINAL_26);
		TERMINAL_80.addFollower(TERMINAL_27);
		TERMINAL_80.addFollower(TERMINAL_28);
		TERMINAL_80.addFollower(TERMINAL_29);
		TERMINAL_80.addFollower(TERMINAL_30);
		TERMINAL_80.addFollower(TERMINAL_31);
		TERMINAL_80.addFollower(TERMINAL_32);
		TERMINAL_80.addFollower(TERMINAL_33);
		TERMINAL_80.addFollower(TERMINAL_34);
		TERMINAL_80.addFollower(TERMINAL_35);
		TERMINAL_80.addFollower(TERMINAL_3);
		TERMINAL_80.addFollower(TERMINAL_4);
		TERMINAL_80.addFollower(TERMINAL_5);
		TERMINAL_80.addFollower(TERMINAL_36);
		TERMINAL_80.addFollower(TERMINAL_37);
		TERMINAL_80.addFollower(TERMINAL_0);
		TERMINAL_80.addFollower(TERMINAL_1);
		TERMINAL_80.addFollower(TERMINAL_38);
		TERMINAL_80.addFollower(TERMINAL_39);
		TERMINAL_80.addFollower(TERMINAL_40);
		TERMINAL_80.addFollower(TERMINAL_41);
		TERMINAL_80.addFollower(TERMINAL_6);
		TERMINAL_80.addFollower(TERMINAL_7);
		TERMINAL_80.addFollower(TERMINAL_8);
		TERMINAL_80.addFollower(TERMINAL_9);
		TERMINAL_80.addFollower(TERMINAL_10);
		TERMINAL_80.addFollower(TERMINAL_11);
		TERMINAL_80.addFollower(TERMINAL_12);
		TERMINAL_80.addFollower(TERMINAL_13);
		TERMINAL_80.addFollower(TERMINAL_14);
		TERMINAL_80.addFollower(TERMINAL_15);
		TERMINAL_80.addFollower(TERMINAL_16);
		TERMINAL_80.addFollower(TERMINAL_17);
		TERMINAL_80.addFollower(TERMINAL_18);
		TERMINAL_80.addFollower(TERMINAL_19);
		TERMINAL_80.addFollower(TERMINAL_20);
		TERMINAL_80.addFollower(TERMINAL_42);
		TERMINAL_80.addFollower(TERMINAL_43);
		TERMINAL_80.addFollower(TERMINAL_44);
		TERMINAL_80.addFollower(TERMINAL_45);
		TERMINAL_80.addFollower(TERMINAL_46);
		TERMINAL_80.addFollower(TERMINAL_47);
		TERMINAL_80.addFollower(TERMINAL_48);
		TERMINAL_80.addFollower(TERMINAL_49);
		TERMINAL_80.addFollower(TERMINAL_50);
		TERMINAL_80.addFollower(TERMINAL_51);
		TERMINAL_80.addFollower(TERMINAL_52);
		TERMINAL_80.addFollower(TERMINAL_53);
		TERMINAL_80.addFollower(TERMINAL_54);
		TERMINAL_80.addFollower(TERMINAL_55);
		TERMINAL_80.addFollower(TERMINAL_56);
		TERMINAL_80.addFollower(TERMINAL_57);
		TERMINAL_80.addFollower(TERMINAL_58);
		TERMINAL_16.addFollower(TERMINAL_3);
		TERMINAL_16.addFollower(TERMINAL_4);
		TERMINAL_16.addFollower(TERMINAL_5);
		TERMINAL_16.addFollower(TERMINAL_6);
		TERMINAL_16.addFollower(TERMINAL_7);
		TERMINAL_16.addFollower(TERMINAL_8);
		TERMINAL_16.addFollower(TERMINAL_9);
		TERMINAL_16.addFollower(TERMINAL_10);
		TERMINAL_16.addFollower(TERMINAL_11);
		TERMINAL_16.addFollower(TERMINAL_12);
		TERMINAL_16.addFollower(TERMINAL_13);
		TERMINAL_16.addFollower(TERMINAL_14);
		TERMINAL_16.addFollower(TERMINAL_15);
		TERMINAL_16.addFollower(TERMINAL_16);
		TERMINAL_16.addFollower(TERMINAL_17);
		TERMINAL_16.addFollower(TERMINAL_18);
		TERMINAL_16.addFollower(TERMINAL_19);
		TERMINAL_16.addFollower(TERMINAL_20);
		TERMINAL_81.addFollower(TERMINAL_3);
		TERMINAL_81.addFollower(TERMINAL_4);
		TERMINAL_81.addFollower(TERMINAL_5);
		TERMINAL_81.addFollower(TERMINAL_6);
		TERMINAL_81.addFollower(TERMINAL_7);
		TERMINAL_81.addFollower(TERMINAL_8);
		TERMINAL_81.addFollower(TERMINAL_9);
		TERMINAL_81.addFollower(TERMINAL_10);
		TERMINAL_81.addFollower(TERMINAL_11);
		TERMINAL_81.addFollower(TERMINAL_12);
		TERMINAL_81.addFollower(TERMINAL_13);
		TERMINAL_81.addFollower(TERMINAL_14);
		TERMINAL_81.addFollower(TERMINAL_15);
		TERMINAL_81.addFollower(TERMINAL_16);
		TERMINAL_81.addFollower(TERMINAL_17);
		TERMINAL_81.addFollower(TERMINAL_18);
		TERMINAL_81.addFollower(TERMINAL_19);
		TERMINAL_81.addFollower(TERMINAL_20);
		TERMINAL_82.addFollower(TERMINAL_2);
		TERMINAL_82.addFollower(TERMINAL_21);
		TERMINAL_82.addFollower(TERMINAL_22);
		TERMINAL_82.addFollower(TERMINAL_23);
		TERMINAL_82.addFollower(TERMINAL_24);
		TERMINAL_82.addFollower(TERMINAL_25);
		TERMINAL_82.addFollower(TERMINAL_26);
		TERMINAL_82.addFollower(TERMINAL_27);
		TERMINAL_82.addFollower(TERMINAL_28);
		TERMINAL_82.addFollower(TERMINAL_29);
		TERMINAL_82.addFollower(TERMINAL_30);
		TERMINAL_82.addFollower(TERMINAL_31);
		TERMINAL_82.addFollower(TERMINAL_32);
		TERMINAL_82.addFollower(TERMINAL_33);
		TERMINAL_82.addFollower(TERMINAL_34);
		TERMINAL_82.addFollower(TERMINAL_35);
		TERMINAL_82.addFollower(TERMINAL_3);
		TERMINAL_82.addFollower(TERMINAL_4);
		TERMINAL_82.addFollower(TERMINAL_5);
		TERMINAL_82.addFollower(TERMINAL_36);
		TERMINAL_82.addFollower(TERMINAL_37);
		TERMINAL_82.addFollower(TERMINAL_0);
		TERMINAL_82.addFollower(TERMINAL_1);
		TERMINAL_82.addFollower(TERMINAL_38);
		TERMINAL_82.addFollower(TERMINAL_39);
		TERMINAL_82.addFollower(TERMINAL_40);
		TERMINAL_82.addFollower(TERMINAL_41);
		TERMINAL_82.addFollower(TERMINAL_6);
		TERMINAL_82.addFollower(TERMINAL_7);
		TERMINAL_82.addFollower(TERMINAL_8);
		TERMINAL_82.addFollower(TERMINAL_9);
		TERMINAL_82.addFollower(TERMINAL_10);
		TERMINAL_82.addFollower(TERMINAL_11);
		TERMINAL_82.addFollower(TERMINAL_12);
		TERMINAL_82.addFollower(TERMINAL_13);
		TERMINAL_82.addFollower(TERMINAL_14);
		TERMINAL_82.addFollower(TERMINAL_15);
		TERMINAL_82.addFollower(TERMINAL_16);
		TERMINAL_82.addFollower(TERMINAL_17);
		TERMINAL_82.addFollower(TERMINAL_18);
		TERMINAL_82.addFollower(TERMINAL_19);
		TERMINAL_82.addFollower(TERMINAL_20);
		TERMINAL_82.addFollower(TERMINAL_42);
		TERMINAL_82.addFollower(TERMINAL_43);
		TERMINAL_82.addFollower(TERMINAL_44);
		TERMINAL_82.addFollower(TERMINAL_45);
		TERMINAL_82.addFollower(TERMINAL_46);
		TERMINAL_82.addFollower(TERMINAL_47);
		TERMINAL_82.addFollower(TERMINAL_48);
		TERMINAL_82.addFollower(TERMINAL_49);
		TERMINAL_82.addFollower(TERMINAL_50);
		TERMINAL_82.addFollower(TERMINAL_51);
		TERMINAL_82.addFollower(TERMINAL_52);
		TERMINAL_82.addFollower(TERMINAL_53);
		TERMINAL_82.addFollower(TERMINAL_54);
		TERMINAL_82.addFollower(TERMINAL_55);
		TERMINAL_82.addFollower(TERMINAL_56);
		TERMINAL_82.addFollower(TERMINAL_57);
		TERMINAL_82.addFollower(TERMINAL_58);
		TERMINAL_17.addFollower(TERMINAL_3);
		TERMINAL_17.addFollower(TERMINAL_4);
		TERMINAL_17.addFollower(TERMINAL_5);
		TERMINAL_17.addFollower(TERMINAL_6);
		TERMINAL_17.addFollower(TERMINAL_7);
		TERMINAL_17.addFollower(TERMINAL_8);
		TERMINAL_17.addFollower(TERMINAL_9);
		TERMINAL_17.addFollower(TERMINAL_10);
		TERMINAL_17.addFollower(TERMINAL_11);
		TERMINAL_17.addFollower(TERMINAL_12);
		TERMINAL_17.addFollower(TERMINAL_13);
		TERMINAL_17.addFollower(TERMINAL_14);
		TERMINAL_17.addFollower(TERMINAL_15);
		TERMINAL_17.addFollower(TERMINAL_16);
		TERMINAL_17.addFollower(TERMINAL_17);
		TERMINAL_17.addFollower(TERMINAL_18);
		TERMINAL_17.addFollower(TERMINAL_19);
		TERMINAL_17.addFollower(TERMINAL_20);
		TERMINAL_57.addFollower(TERMINAL_3);
		TERMINAL_57.addFollower(TERMINAL_4);
		TERMINAL_57.addFollower(TERMINAL_5);
		TERMINAL_57.addFollower(TERMINAL_6);
		TERMINAL_57.addFollower(TERMINAL_7);
		TERMINAL_57.addFollower(TERMINAL_8);
		TERMINAL_57.addFollower(TERMINAL_9);
		TERMINAL_57.addFollower(TERMINAL_10);
		TERMINAL_57.addFollower(TERMINAL_11);
		TERMINAL_57.addFollower(TERMINAL_12);
		TERMINAL_57.addFollower(TERMINAL_13);
		TERMINAL_57.addFollower(TERMINAL_14);
		TERMINAL_57.addFollower(TERMINAL_15);
		TERMINAL_57.addFollower(TERMINAL_16);
		TERMINAL_57.addFollower(TERMINAL_17);
		TERMINAL_57.addFollower(TERMINAL_18);
		TERMINAL_57.addFollower(TERMINAL_19);
		TERMINAL_57.addFollower(TERMINAL_20);
		TERMINAL_83.addFollower(TERMINAL_2);
		TERMINAL_83.addFollower(TERMINAL_21);
		TERMINAL_83.addFollower(TERMINAL_22);
		TERMINAL_83.addFollower(TERMINAL_23);
		TERMINAL_83.addFollower(TERMINAL_24);
		TERMINAL_83.addFollower(TERMINAL_25);
		TERMINAL_83.addFollower(TERMINAL_26);
		TERMINAL_83.addFollower(TERMINAL_27);
		TERMINAL_83.addFollower(TERMINAL_28);
		TERMINAL_83.addFollower(TERMINAL_29);
		TERMINAL_83.addFollower(TERMINAL_30);
		TERMINAL_83.addFollower(TERMINAL_31);
		TERMINAL_83.addFollower(TERMINAL_32);
		TERMINAL_83.addFollower(TERMINAL_33);
		TERMINAL_83.addFollower(TERMINAL_34);
		TERMINAL_83.addFollower(TERMINAL_35);
		TERMINAL_83.addFollower(TERMINAL_3);
		TERMINAL_83.addFollower(TERMINAL_4);
		TERMINAL_83.addFollower(TERMINAL_5);
		TERMINAL_83.addFollower(TERMINAL_36);
		TERMINAL_83.addFollower(TERMINAL_37);
		TERMINAL_83.addFollower(TERMINAL_0);
		TERMINAL_83.addFollower(TERMINAL_1);
		TERMINAL_83.addFollower(TERMINAL_38);
		TERMINAL_83.addFollower(TERMINAL_39);
		TERMINAL_83.addFollower(TERMINAL_40);
		TERMINAL_83.addFollower(TERMINAL_41);
		TERMINAL_83.addFollower(TERMINAL_6);
		TERMINAL_83.addFollower(TERMINAL_7);
		TERMINAL_83.addFollower(TERMINAL_8);
		TERMINAL_83.addFollower(TERMINAL_9);
		TERMINAL_83.addFollower(TERMINAL_10);
		TERMINAL_83.addFollower(TERMINAL_11);
		TERMINAL_83.addFollower(TERMINAL_12);
		TERMINAL_83.addFollower(TERMINAL_13);
		TERMINAL_83.addFollower(TERMINAL_14);
		TERMINAL_83.addFollower(TERMINAL_15);
		TERMINAL_83.addFollower(TERMINAL_16);
		TERMINAL_83.addFollower(TERMINAL_17);
		TERMINAL_83.addFollower(TERMINAL_18);
		TERMINAL_83.addFollower(TERMINAL_19);
		TERMINAL_83.addFollower(TERMINAL_20);
		TERMINAL_83.addFollower(TERMINAL_42);
		TERMINAL_83.addFollower(TERMINAL_43);
		TERMINAL_83.addFollower(TERMINAL_44);
		TERMINAL_83.addFollower(TERMINAL_45);
		TERMINAL_83.addFollower(TERMINAL_46);
		TERMINAL_83.addFollower(TERMINAL_47);
		TERMINAL_83.addFollower(TERMINAL_48);
		TERMINAL_83.addFollower(TERMINAL_49);
		TERMINAL_83.addFollower(TERMINAL_50);
		TERMINAL_83.addFollower(TERMINAL_51);
		TERMINAL_83.addFollower(TERMINAL_52);
		TERMINAL_83.addFollower(TERMINAL_53);
		TERMINAL_83.addFollower(TERMINAL_54);
		TERMINAL_83.addFollower(TERMINAL_55);
		TERMINAL_83.addFollower(TERMINAL_56);
		TERMINAL_83.addFollower(TERMINAL_57);
		TERMINAL_83.addFollower(TERMINAL_58);
		TERMINAL_18.addFollower(TERMINAL_3);
		TERMINAL_18.addFollower(TERMINAL_4);
		TERMINAL_18.addFollower(TERMINAL_5);
		TERMINAL_18.addFollower(TERMINAL_6);
		TERMINAL_18.addFollower(TERMINAL_7);
		TERMINAL_18.addFollower(TERMINAL_8);
		TERMINAL_18.addFollower(TERMINAL_9);
		TERMINAL_18.addFollower(TERMINAL_10);
		TERMINAL_18.addFollower(TERMINAL_11);
		TERMINAL_18.addFollower(TERMINAL_12);
		TERMINAL_18.addFollower(TERMINAL_13);
		TERMINAL_18.addFollower(TERMINAL_14);
		TERMINAL_18.addFollower(TERMINAL_15);
		TERMINAL_18.addFollower(TERMINAL_16);
		TERMINAL_18.addFollower(TERMINAL_17);
		TERMINAL_18.addFollower(TERMINAL_18);
		TERMINAL_18.addFollower(TERMINAL_19);
		TERMINAL_18.addFollower(TERMINAL_20);
		TERMINAL_84.addFollower(TERMINAL_3);
		TERMINAL_84.addFollower(TERMINAL_4);
		TERMINAL_84.addFollower(TERMINAL_5);
		TERMINAL_84.addFollower(TERMINAL_6);
		TERMINAL_84.addFollower(TERMINAL_7);
		TERMINAL_84.addFollower(TERMINAL_8);
		TERMINAL_84.addFollower(TERMINAL_9);
		TERMINAL_84.addFollower(TERMINAL_10);
		TERMINAL_84.addFollower(TERMINAL_11);
		TERMINAL_84.addFollower(TERMINAL_12);
		TERMINAL_84.addFollower(TERMINAL_13);
		TERMINAL_84.addFollower(TERMINAL_14);
		TERMINAL_84.addFollower(TERMINAL_15);
		TERMINAL_84.addFollower(TERMINAL_16);
		TERMINAL_84.addFollower(TERMINAL_17);
		TERMINAL_84.addFollower(TERMINAL_18);
		TERMINAL_84.addFollower(TERMINAL_19);
		TERMINAL_84.addFollower(TERMINAL_20);
		TERMINAL_85.addFollower(TERMINAL_2);
		TERMINAL_85.addFollower(TERMINAL_21);
		TERMINAL_85.addFollower(TERMINAL_22);
		TERMINAL_85.addFollower(TERMINAL_23);
		TERMINAL_85.addFollower(TERMINAL_24);
		TERMINAL_85.addFollower(TERMINAL_25);
		TERMINAL_85.addFollower(TERMINAL_26);
		TERMINAL_85.addFollower(TERMINAL_27);
		TERMINAL_85.addFollower(TERMINAL_28);
		TERMINAL_85.addFollower(TERMINAL_29);
		TERMINAL_85.addFollower(TERMINAL_30);
		TERMINAL_85.addFollower(TERMINAL_31);
		TERMINAL_85.addFollower(TERMINAL_32);
		TERMINAL_85.addFollower(TERMINAL_33);
		TERMINAL_85.addFollower(TERMINAL_34);
		TERMINAL_85.addFollower(TERMINAL_35);
		TERMINAL_85.addFollower(TERMINAL_3);
		TERMINAL_85.addFollower(TERMINAL_4);
		TERMINAL_85.addFollower(TERMINAL_5);
		TERMINAL_85.addFollower(TERMINAL_36);
		TERMINAL_85.addFollower(TERMINAL_37);
		TERMINAL_85.addFollower(TERMINAL_0);
		TERMINAL_85.addFollower(TERMINAL_1);
		TERMINAL_85.addFollower(TERMINAL_38);
		TERMINAL_85.addFollower(TERMINAL_39);
		TERMINAL_85.addFollower(TERMINAL_40);
		TERMINAL_85.addFollower(TERMINAL_41);
		TERMINAL_85.addFollower(TERMINAL_6);
		TERMINAL_85.addFollower(TERMINAL_7);
		TERMINAL_85.addFollower(TERMINAL_8);
		TERMINAL_85.addFollower(TERMINAL_9);
		TERMINAL_85.addFollower(TERMINAL_10);
		TERMINAL_85.addFollower(TERMINAL_11);
		TERMINAL_85.addFollower(TERMINAL_12);
		TERMINAL_85.addFollower(TERMINAL_13);
		TERMINAL_85.addFollower(TERMINAL_14);
		TERMINAL_85.addFollower(TERMINAL_15);
		TERMINAL_85.addFollower(TERMINAL_16);
		TERMINAL_85.addFollower(TERMINAL_17);
		TERMINAL_85.addFollower(TERMINAL_18);
		TERMINAL_85.addFollower(TERMINAL_19);
		TERMINAL_85.addFollower(TERMINAL_20);
		TERMINAL_85.addFollower(TERMINAL_42);
		TERMINAL_85.addFollower(TERMINAL_43);
		TERMINAL_85.addFollower(TERMINAL_44);
		TERMINAL_85.addFollower(TERMINAL_45);
		TERMINAL_85.addFollower(TERMINAL_46);
		TERMINAL_85.addFollower(TERMINAL_47);
		TERMINAL_85.addFollower(TERMINAL_48);
		TERMINAL_85.addFollower(TERMINAL_49);
		TERMINAL_85.addFollower(TERMINAL_50);
		TERMINAL_85.addFollower(TERMINAL_51);
		TERMINAL_85.addFollower(TERMINAL_52);
		TERMINAL_85.addFollower(TERMINAL_53);
		TERMINAL_85.addFollower(TERMINAL_54);
		TERMINAL_85.addFollower(TERMINAL_55);
		TERMINAL_85.addFollower(TERMINAL_56);
		TERMINAL_85.addFollower(TERMINAL_57);
		TERMINAL_85.addFollower(TERMINAL_58);
		TERMINAL_19.addFollower(TERMINAL_3);
		TERMINAL_19.addFollower(TERMINAL_4);
		TERMINAL_19.addFollower(TERMINAL_5);
		TERMINAL_19.addFollower(TERMINAL_6);
		TERMINAL_19.addFollower(TERMINAL_7);
		TERMINAL_19.addFollower(TERMINAL_8);
		TERMINAL_19.addFollower(TERMINAL_9);
		TERMINAL_19.addFollower(TERMINAL_10);
		TERMINAL_19.addFollower(TERMINAL_11);
		TERMINAL_19.addFollower(TERMINAL_12);
		TERMINAL_19.addFollower(TERMINAL_13);
		TERMINAL_19.addFollower(TERMINAL_14);
		TERMINAL_19.addFollower(TERMINAL_15);
		TERMINAL_19.addFollower(TERMINAL_16);
		TERMINAL_19.addFollower(TERMINAL_17);
		TERMINAL_19.addFollower(TERMINAL_18);
		TERMINAL_19.addFollower(TERMINAL_19);
		TERMINAL_19.addFollower(TERMINAL_20);
		TERMINAL_58.addFollower(TERMINAL_3);
		TERMINAL_58.addFollower(TERMINAL_4);
		TERMINAL_58.addFollower(TERMINAL_5);
		TERMINAL_58.addFollower(TERMINAL_6);
		TERMINAL_58.addFollower(TERMINAL_7);
		TERMINAL_58.addFollower(TERMINAL_8);
		TERMINAL_58.addFollower(TERMINAL_9);
		TERMINAL_58.addFollower(TERMINAL_10);
		TERMINAL_58.addFollower(TERMINAL_11);
		TERMINAL_58.addFollower(TERMINAL_12);
		TERMINAL_58.addFollower(TERMINAL_13);
		TERMINAL_58.addFollower(TERMINAL_14);
		TERMINAL_58.addFollower(TERMINAL_15);
		TERMINAL_58.addFollower(TERMINAL_16);
		TERMINAL_58.addFollower(TERMINAL_17);
		TERMINAL_58.addFollower(TERMINAL_18);
		TERMINAL_58.addFollower(TERMINAL_19);
		TERMINAL_58.addFollower(TERMINAL_20);
		TERMINAL_86.addFollower(TERMINAL_2);
		TERMINAL_86.addFollower(TERMINAL_21);
		TERMINAL_86.addFollower(TERMINAL_22);
		TERMINAL_86.addFollower(TERMINAL_23);
		TERMINAL_86.addFollower(TERMINAL_24);
		TERMINAL_86.addFollower(TERMINAL_25);
		TERMINAL_86.addFollower(TERMINAL_26);
		TERMINAL_86.addFollower(TERMINAL_27);
		TERMINAL_86.addFollower(TERMINAL_28);
		TERMINAL_86.addFollower(TERMINAL_29);
		TERMINAL_86.addFollower(TERMINAL_30);
		TERMINAL_86.addFollower(TERMINAL_31);
		TERMINAL_86.addFollower(TERMINAL_32);
		TERMINAL_86.addFollower(TERMINAL_33);
		TERMINAL_86.addFollower(TERMINAL_34);
		TERMINAL_86.addFollower(TERMINAL_35);
		TERMINAL_86.addFollower(TERMINAL_3);
		TERMINAL_86.addFollower(TERMINAL_4);
		TERMINAL_86.addFollower(TERMINAL_5);
		TERMINAL_86.addFollower(TERMINAL_36);
		TERMINAL_86.addFollower(TERMINAL_37);
		TERMINAL_86.addFollower(TERMINAL_0);
		TERMINAL_86.addFollower(TERMINAL_1);
		TERMINAL_86.addFollower(TERMINAL_38);
		TERMINAL_86.addFollower(TERMINAL_39);
		TERMINAL_86.addFollower(TERMINAL_40);
		TERMINAL_86.addFollower(TERMINAL_41);
		TERMINAL_86.addFollower(TERMINAL_6);
		TERMINAL_86.addFollower(TERMINAL_7);
		TERMINAL_86.addFollower(TERMINAL_8);
		TERMINAL_86.addFollower(TERMINAL_9);
		TERMINAL_86.addFollower(TERMINAL_10);
		TERMINAL_86.addFollower(TERMINAL_11);
		TERMINAL_86.addFollower(TERMINAL_12);
		TERMINAL_86.addFollower(TERMINAL_13);
		TERMINAL_86.addFollower(TERMINAL_14);
		TERMINAL_86.addFollower(TERMINAL_15);
		TERMINAL_86.addFollower(TERMINAL_16);
		TERMINAL_86.addFollower(TERMINAL_17);
		TERMINAL_86.addFollower(TERMINAL_18);
		TERMINAL_86.addFollower(TERMINAL_19);
		TERMINAL_86.addFollower(TERMINAL_20);
		TERMINAL_86.addFollower(TERMINAL_42);
		TERMINAL_86.addFollower(TERMINAL_43);
		TERMINAL_86.addFollower(TERMINAL_44);
		TERMINAL_86.addFollower(TERMINAL_45);
		TERMINAL_86.addFollower(TERMINAL_46);
		TERMINAL_86.addFollower(TERMINAL_47);
		TERMINAL_86.addFollower(TERMINAL_48);
		TERMINAL_86.addFollower(TERMINAL_49);
		TERMINAL_86.addFollower(TERMINAL_50);
		TERMINAL_86.addFollower(TERMINAL_51);
		TERMINAL_86.addFollower(TERMINAL_52);
		TERMINAL_86.addFollower(TERMINAL_53);
		TERMINAL_86.addFollower(TERMINAL_54);
		TERMINAL_86.addFollower(TERMINAL_55);
		TERMINAL_86.addFollower(TERMINAL_56);
		TERMINAL_86.addFollower(TERMINAL_57);
		TERMINAL_86.addFollower(TERMINAL_58);
		TERMINAL_20.addFollower(TERMINAL_3);
		TERMINAL_20.addFollower(TERMINAL_4);
		TERMINAL_20.addFollower(TERMINAL_5);
		TERMINAL_20.addFollower(TERMINAL_6);
		TERMINAL_20.addFollower(TERMINAL_7);
		TERMINAL_20.addFollower(TERMINAL_8);
		TERMINAL_20.addFollower(TERMINAL_9);
		TERMINAL_20.addFollower(TERMINAL_10);
		TERMINAL_20.addFollower(TERMINAL_11);
		TERMINAL_20.addFollower(TERMINAL_12);
		TERMINAL_20.addFollower(TERMINAL_13);
		TERMINAL_20.addFollower(TERMINAL_14);
		TERMINAL_20.addFollower(TERMINAL_15);
		TERMINAL_20.addFollower(TERMINAL_16);
		TERMINAL_20.addFollower(TERMINAL_17);
		TERMINAL_20.addFollower(TERMINAL_18);
		TERMINAL_20.addFollower(TERMINAL_19);
		TERMINAL_20.addFollower(TERMINAL_20);
		TERMINAL_87.addFollower(TERMINAL_3);
		TERMINAL_87.addFollower(TERMINAL_4);
		TERMINAL_87.addFollower(TERMINAL_5);
		TERMINAL_87.addFollower(TERMINAL_6);
		TERMINAL_87.addFollower(TERMINAL_7);
		TERMINAL_87.addFollower(TERMINAL_8);
		TERMINAL_87.addFollower(TERMINAL_9);
		TERMINAL_87.addFollower(TERMINAL_10);
		TERMINAL_87.addFollower(TERMINAL_11);
		TERMINAL_87.addFollower(TERMINAL_12);
		TERMINAL_87.addFollower(TERMINAL_13);
		TERMINAL_87.addFollower(TERMINAL_14);
		TERMINAL_87.addFollower(TERMINAL_15);
		TERMINAL_87.addFollower(TERMINAL_16);
		TERMINAL_87.addFollower(TERMINAL_17);
		TERMINAL_87.addFollower(TERMINAL_18);
		TERMINAL_87.addFollower(TERMINAL_19);
		TERMINAL_87.addFollower(TERMINAL_20);
		TERMINAL_88.addFollower(TERMINAL_2);
		TERMINAL_88.addFollower(TERMINAL_21);
		TERMINAL_88.addFollower(TERMINAL_22);
		TERMINAL_88.addFollower(TERMINAL_23);
		TERMINAL_88.addFollower(TERMINAL_24);
		TERMINAL_88.addFollower(TERMINAL_25);
		TERMINAL_88.addFollower(TERMINAL_26);
		TERMINAL_88.addFollower(TERMINAL_27);
		TERMINAL_88.addFollower(TERMINAL_28);
		TERMINAL_88.addFollower(TERMINAL_29);
		TERMINAL_88.addFollower(TERMINAL_30);
		TERMINAL_88.addFollower(TERMINAL_31);
		TERMINAL_88.addFollower(TERMINAL_32);
		TERMINAL_88.addFollower(TERMINAL_33);
		TERMINAL_88.addFollower(TERMINAL_34);
		TERMINAL_88.addFollower(TERMINAL_35);
		TERMINAL_88.addFollower(TERMINAL_3);
		TERMINAL_88.addFollower(TERMINAL_4);
		TERMINAL_88.addFollower(TERMINAL_5);
		TERMINAL_88.addFollower(TERMINAL_36);
		TERMINAL_88.addFollower(TERMINAL_37);
		TERMINAL_88.addFollower(TERMINAL_0);
		TERMINAL_88.addFollower(TERMINAL_1);
		TERMINAL_88.addFollower(TERMINAL_38);
		TERMINAL_88.addFollower(TERMINAL_39);
		TERMINAL_88.addFollower(TERMINAL_40);
		TERMINAL_88.addFollower(TERMINAL_41);
		TERMINAL_88.addFollower(TERMINAL_6);
		TERMINAL_88.addFollower(TERMINAL_7);
		TERMINAL_88.addFollower(TERMINAL_8);
		TERMINAL_88.addFollower(TERMINAL_9);
		TERMINAL_88.addFollower(TERMINAL_10);
		TERMINAL_88.addFollower(TERMINAL_11);
		TERMINAL_88.addFollower(TERMINAL_12);
		TERMINAL_88.addFollower(TERMINAL_13);
		TERMINAL_88.addFollower(TERMINAL_14);
		TERMINAL_88.addFollower(TERMINAL_15);
		TERMINAL_88.addFollower(TERMINAL_16);
		TERMINAL_88.addFollower(TERMINAL_17);
		TERMINAL_88.addFollower(TERMINAL_18);
		TERMINAL_88.addFollower(TERMINAL_19);
		TERMINAL_88.addFollower(TERMINAL_20);
		TERMINAL_88.addFollower(TERMINAL_42);
		TERMINAL_88.addFollower(TERMINAL_43);
		TERMINAL_88.addFollower(TERMINAL_44);
		TERMINAL_88.addFollower(TERMINAL_45);
		TERMINAL_88.addFollower(TERMINAL_46);
		TERMINAL_88.addFollower(TERMINAL_47);
		TERMINAL_88.addFollower(TERMINAL_48);
		TERMINAL_88.addFollower(TERMINAL_49);
		TERMINAL_88.addFollower(TERMINAL_50);
		TERMINAL_88.addFollower(TERMINAL_51);
		TERMINAL_88.addFollower(TERMINAL_52);
		TERMINAL_88.addFollower(TERMINAL_53);
		TERMINAL_88.addFollower(TERMINAL_54);
		TERMINAL_88.addFollower(TERMINAL_55);
		TERMINAL_88.addFollower(TERMINAL_56);
		TERMINAL_88.addFollower(TERMINAL_57);
		TERMINAL_88.addFollower(TERMINAL_58);
	}
	// wire the terminals
	static {
		wire0();
	}
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 0));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block{ element = c0; }
	)
	EOF	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back element = null]
@init{
}
:
	(
		a0 = 'Back' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBack();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 1));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 1));
		}
		
		
		|		a1 = 'BACK' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBack();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 2));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 2));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 3));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 3));
	}
	
	(
		a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBack();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BACK__STEPS), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 4));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 4));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward element = null]
@init{
}
:
	(
		a0 = 'Forward' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createForward();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 5));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 5));
		}
		
		
		|		a1 = 'fd' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createForward();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 6));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 6));
		}
		
		
		|		a2 = 'FORWARD' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createForward();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 7));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 7));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 8));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 8));
	}
	
	(
		a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createForward();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.FORWARD__STEPS), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 9));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 9));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left element = null]
@init{
}
:
	(
		a0 = 'Left' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLeft();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 10));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 10));
		}
		
		
		|		a1 = 'LEFT' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLeft();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 11));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 11));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 12));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 12));
	}
	
	(
		a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLeft();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LEFT__ANGLE), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 13));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 13));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right element = null]
@init{
}
:
	(
		a0 = 'Right' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRight();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 14));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 14));
		}
		
		
		|		a1 = 'rt' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRight();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 15));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 15));
		}
		
		
		|		a2 = 'RIGHT' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRight();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 16));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 16));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 17));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 17));
	}
	
	(
		a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRight();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.RIGHT__ANGLE), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 18));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 18));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown element = null]
@init{
}
:
	(
		a0 = 'PenDown' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPenDown();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 19));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 19));
		}
		
		
		|		a1 = 'PENDOWN' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPenDown();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 20));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 20));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 21));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 21));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp element = null]
@init{
}
:
	(
		a0 = 'PenUp' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPenUp();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 22));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 22));
		}
		
		
		|		a1 = 'PENUP' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPenUp();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 23));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 23));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 24));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 24));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear element = null]
@init{
}
:
	(
		a0 = 'Clear' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createClear();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 25));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 25));
		}
		
		
		|		a1 = 'CLEAR' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createClear();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 26));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 26));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 27));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 27));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant element = null]
@init{
}
:
	(
		a0 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createConstant();
			}
			if (a0 != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 28));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 28));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall element = null]
@init{
}
:
	(
		(
			a0 = '$' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 29));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 30));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
			}
			if (a1 != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration proxy = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoContextDependentURIFragmentFactory<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProcCallDeclarationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_59, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 31));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 31));
	}
	
	(
		(
			a2 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 32));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 32));
			}
			
			(
				(
					a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression					{
						if (terminateParsing) {
							throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
						}
						if (element == null) {
							element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								addObjectToList(element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__ACTUAL_ARGS, a3_0);
								completedElement(a3_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a3_0, element); 						}
					}
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 33));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 33));
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 34));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 34));
					}
					
					(
						a5_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression						{
							if (terminateParsing) {
								throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									addObjectToList(element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__ACTUAL_ARGS, a5_0);
									completedElement(a5_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a5_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 35));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 35));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 36));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 36));
			}
			
			a6 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcCall();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 37));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 37));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 38));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 38));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element = null]
@init{
}
:
	(
		a0 = 'to' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_60, 39));
		}
		
		
		|		a1 = 'TO' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_60, 40));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_60, 41));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			if (a2 != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_61, 42));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 42));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 42));
	}
	
	(
		(
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							addObjectToList(element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__ARGS, a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_61, 43));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 43));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 43));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_61, 44));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 44));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 44));
	}
	
	(
		a4_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__BLOCK), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_62, 45));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_63, 45));
	}
	
	(
		a5 = 'end' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 46));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 46));
		}
		
		
		|		a6 = 'END' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createProcDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 47));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 47));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 48));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 48));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element = null]
@init{
}
:
	(
		a0 = '{' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBlock();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 49));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 49));
		}
		
		
		|		a1 = '[' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBlock();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 50));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 50));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 51));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 51));
	}
	
	(
		(
			(
				a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Instruction				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBlock();
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							addObjectToList(element, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS, a2_0);
							completedElement(a2_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a2_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 52));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 52));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 53));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 53));
	}
	
	(
		a3 = '}' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBlock();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_62, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_63, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_64, 54));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_65, 54));
		}
		
		
		|		a4 = ']' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createBlock();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_62, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_63, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_64, 55));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_65, 55));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_62, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_63, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_64, 56));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_65, 56));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element = null]
@init{
}
:
	(
		(
			(
				a0 = 'If' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 57));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 57));
				}
				
				
				|				a1 = 'IF' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 58));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 58));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 59));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 59));
			}
			
			(
				a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__CONDITION), a2_0);
							completedElement(a2_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a2_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 60));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 60));
			}
			
			(
				a3 = 'then' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 61));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 61));
				}
				
				
				|				a4 = 'THEN' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 62));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 62));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 63));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 63));
			}
			
			(
				a5_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__THEN_PART), a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_64, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_65, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 64));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 64));
			}
			
			(
				(
					(
						a6 = 'else' {
							if (element == null) {
								element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
							}
							collectHiddenTokens(element);
							copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 65));
							addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 65));
						}
						
						
						|						a7 = 'ELSE' {
							if (element == null) {
								element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
							}
							collectHiddenTokens(element);
							copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 66));
							addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 66));
						}
						
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 67));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 67));
					}
					
					(
						a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block						{
							if (terminateParsing) {
								throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
							}
							if (a8_0 != null) {
								if (a8_0 != null) {
									element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__ELSE_PART), a8_0);
									completedElement(a8_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a8_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 68));
						addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 68));
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 69));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 69));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 70));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 70));
		}
		
		
		|		(
			(
				a9 = 'ifelse' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 71));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 71));
				}
				
				
				|				a10 = 'IFELSE' {
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 72));
					addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 72));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 73));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 73));
			}
			
			(
				a11_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__CONDITION), a11_0);
							completedElement(a11_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a11_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 74));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 74));
			}
			
			(
				a12_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__THEN_PART), a12_0);
							completedElement(a12_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a12_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 75));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 75));
			}
			
			(
				a13_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createIf();
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__ELSE_PART), a13_0);
							completedElement(a13_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a13_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 76));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 76));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 77));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 77));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 78));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 78));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure element = null]
@init{
}
:
	(
		a0_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createControlStructure();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONTROL_STRUCTURE__CONDITION), a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 79));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 79));
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While{ element = c2; /* this is a subclass choice */ }
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat element = null]
@init{
}
:
	(
		a0 = 'Repeat' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRepeat();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 80));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 80));
		}
		
		
		|		a1 = 'REPEAT' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRepeat();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 81));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 81));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 82));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 82));
	}
	
	(
		a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRepeat();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__CONDITION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 83));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 83));
	}
	
	(
		a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createRepeat();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__BLOCK), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 84));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 84));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While element = null]
@init{
}
:
	(
		a0 = 'While' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createWhile();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 85));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 85));
		}
		
		
		|		a1 = 'WHILE' {
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createWhile();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 86));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 86));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 87));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 87));
	}
	
	(
		a2_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createWhile();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__CONDITION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 88));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 88));
	}
	
	(
		a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createWhile();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__BLOCK), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 89));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 89));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter element = null]
@init{
}
:
	a0 = ':' {
		if (element == null) {
			element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createParameter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_66, 90));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createParameter();
			}
			if (a1 != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_61, 91));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 91));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 91));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall element = null]
@init{
}
:
	a0 = ':' {
		if (element == null) {
			element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createParameterCall();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_67, 92));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createParameterCall();
			}
			if (a1 != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter proxy = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createParameter();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoContextDependentURIFragmentFactory<org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall, org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterCallParameterReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 93));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 93));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 94));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 94));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 95));
			}
			
			a2 = '+' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 96));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 96));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_68, 97));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 98));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 98));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 99));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 99));
		}
		
		
		|		(
			a5 = '+(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 100));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 100));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_69, 101));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 102));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 102));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_70, 103));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createPlus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 104));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 104));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 105));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 105));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 106));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 106));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 107));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 107));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 108));
			}
			
			a2 = '-' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 109));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 109));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_71, 110));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 111));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 111));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 112));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 112));
		}
		
		
		|		(
			a5 = '-(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 113));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 113));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_72, 114));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 115));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 115));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_73, 116));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMinus();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 117));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 117));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 118));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 118));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 119));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 119));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 120));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 120));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 121));
			}
			
			a2 = '*' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 122));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 122));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_74, 123));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 124));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 124));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 125));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 125));
		}
		
		
		|		(
			a5 = '*(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 126));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 126));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_75, 127));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 128));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 128));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_76, 129));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createMult();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 130));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 130));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 131));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 131));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 132));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 132));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 133));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 133));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 134));
			}
			
			a2 = '/' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 135));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 135));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_77, 136));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 137));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 137));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 138));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 138));
		}
		
		
		|		(
			a5 = '/(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 139));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 139));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_78, 140));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 141));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 141));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_79, 142));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createDiv();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 143));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 143));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 144));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 144));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 145));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 145));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 146));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 146));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 147));
			}
			
			a2 = '=' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 148));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 148));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_80, 149));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 150));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 150));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 151));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 151));
		}
		
		
		|		(
			a5 = '=(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 152));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 152));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_81, 153));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 154));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 154));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_82, 155));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createEquals();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 156));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 156));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 157));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 157));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 158));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 158));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 159));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 159));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 160));
			}
			
			a2 = '>' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 161));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 161));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_83, 162));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 163));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 163));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 164));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 164));
		}
		
		
		|		(
			a5 = '>(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 165));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 165));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_84, 166));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 167));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 167));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_85, 168));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createGreater();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 169));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 169));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 170));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 170));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 171));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 171));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 172));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 172));
			}
			
			(
				a1_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__LHS), a1_0);
							completedElement(a1_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a1_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 173));
			}
			
			a2 = '<' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 174));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 174));
			}
			
			(
				a3_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__RHS), a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_86, 175));
			}
			
			a4 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 176));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 176));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 177));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 177));
		}
		
		
		|		(
			a5 = '<(' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 178));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 178));
			}
			
			(
				a6_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__LHS), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_87, 179));
			}
			
			a7 = ',' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 180));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 180));
			}
			
			(
				a8_0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression				{
					if (terminateParsing) {
						throw new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__RHS), a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_88, 181));
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMFactory.eINSTANCE.createLower();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 182));
				addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 182));
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 183));
			addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 183));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_2, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_21, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_22, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_23, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_24, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_25, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_26, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_27, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_28, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_29, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_30, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_31, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_32, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_33, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_34, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_35, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_3, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_4, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_5, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_36, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_37, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_0, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_1, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_38, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_39, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_40, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_41, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_6, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_7, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_8, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_9, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_10, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_11, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_12, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_13, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_14, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_15, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_16, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_17, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_18, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_19, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_20, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_42, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_43, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_44, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_45, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_46, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_47, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_48, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_49, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_50, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_51, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_52, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_53, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_54, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_55, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_56, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_57, 184));
		addExpectedElement(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoExpectedTerminal(TERMINAL_58, 184));
	}
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression element = null]
:
	c0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower{ element = c9; /* this is a subclass choice */ }
	
;

parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Instruction returns [org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction element = null]
:
	c0 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure{ element = c12; /* this is a subclass choice */ }
	|	c13 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat{ element = c13; /* this is a subclass choice */ }
	|	c14 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While{ element = c14; /* this is a subclass choice */ }
	|	c15 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall{ element = c15; /* this is a subclass choice */ }
	|	c16 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus{ element = c16; /* this is a subclass choice */ }
	|	c17 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus{ element = c17; /* this is a subclass choice */ }
	|	c18 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult{ element = c18; /* this is a subclass choice */ }
	|	c19 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div{ element = c19; /* this is a subclass choice */ }
	|	c20 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals{ element = c20; /* this is a subclass choice */ }
	|	c21 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater{ element = c21; /* this is a subclass choice */ }
	|	c22 = parse_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower{ element = c22; /* this is a subclass choice */ }
	
;

INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0';
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
TEXT:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+;
WHITESPACE:
	(' ' | '\t' | '\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n' | '\r' | '\n')
	{ _channel = 99; }
;

