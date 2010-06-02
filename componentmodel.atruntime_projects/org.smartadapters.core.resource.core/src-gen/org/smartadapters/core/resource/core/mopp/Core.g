grammar Core;

options {
	superClass = CoreANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.smartadapters.core.resource.core.mopp;
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
	package org.smartadapters.core.resource.core.mopp;
}

@members{
	private org.smartadapters.core.resource.core.ICoreTokenResolverFactory tokenResolverFactory = new org.smartadapters.core.resource.core.mopp.CoreTokenResolverFactory();
	@SuppressWarnings("unused")
	
	private int lastPosition;
	private org.smartadapters.core.resource.core.mopp.CoreTokenResolveResult tokenResolveResult = new org.smartadapters.core.resource.core.mopp.CoreTokenResolveResult();
	private boolean rememberExpectedElements = false;
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	private java.util.List<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal> expectedElements = new java.util.ArrayList<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal>();
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	//helper lists to allow a lexer to pass errors to its parser
	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private java.util.Collection<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>> postParseCommands;
	private boolean terminateParsing;
	private int tokenIndexOfLastCompleteElement;
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>() {
			public boolean execute(org.smartadapters.core.resource.core.ICoreTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.addProblem(new org.smartadapters.core.resource.core.ICoreProblem() {
					public org.smartadapters.core.resource.core.CoreEProblemType getType() {
						return org.smartadapters.core.resource.core.CoreEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.smartadapters.core.resource.core.mopp.CoreDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.smartadapters.core.resource.core.util.CoreMapUtil.castToEMap(value);
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
			assert(object instanceof org.smartadapters.core.resource.core.mopp.CoreDummyEObject);
			org.smartadapters.core.resource.core.mopp.CoreDummyEObject dummy = (org.smartadapters.core.resource.core.mopp.CoreDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>() {
			public boolean execute(org.smartadapters.core.resource.core.ICoreTextResource resource) {
				org.smartadapters.core.resource.core.ICoreLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>() {
			public boolean execute(org.smartadapters.core.resource.core.ICoreTextResource resource) {
				org.smartadapters.core.resource.core.ICoreLocationMap locationMap = resource.getLocationMap();
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
	
	public org.smartadapters.core.resource.core.ICoreTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new CoreParser(new org.antlr.runtime.CommonTokenStream(new CoreLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
			} else {
				return new CoreParser(new org.antlr.runtime.CommonTokenStream(new CoreLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.smartadapters.core.resource.core.mopp.CorePlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	// This default constructor is only used to call createInstance() on it
	public CoreParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((CoreLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((CoreLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.smartadapters.core.Adapter.class) {
				return parse_org_smartadapters_core_Adapter();
			}
			if (type.getInstanceClass() == org.smartadapters.core.Aspect.class) {
				return parse_org_smartadapters_core_Aspect();
			}
			if (type.getInstanceClass() == org.smartadapters.core.adaptations.SetruntimeSystem.class) {
				return parse_org_smartadapters_core_adaptations_SetruntimeSystem();
			}
			if (type.getInstanceClass() == org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance.class) {
				return parse_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance();
			}
			if (type.getInstanceClass() == org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance.class) {
				return parse_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance();
			}
			if (type.getInstanceClass() == org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance.class) {
				return parse_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance();
			}
			if (type.getInstanceClass() == org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding.class) {
				return parse_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding();
			}
			if (type.getInstanceClass() == pattern.art.System.class) {
				return parse_pattern_art_System();
			}
			if (type.getInstanceClass() == pattern.art.DataType.class) {
				return parse_pattern_art_DataType();
			}
			if (type.getInstanceClass() == pattern.art.instance.PrimitiveInstance.class) {
				return parse_pattern_art_instance_PrimitiveInstance();
			}
			if (type.getInstanceClass() == pattern.art.instance.CompositeInstance.class) {
				return parse_pattern_art_instance_CompositeInstance();
			}
			if (type.getInstanceClass() == pattern.art.instance.TransmissionBinding.class) {
				return parse_pattern_art_instance_TransmissionBinding();
			}
			if (type.getInstanceClass() == pattern.art.instance.DelegationBinding.class) {
				return parse_pattern_art_instance_DelegationBinding();
			}
			if (type.getInstanceClass() == pattern.art.instance.ValuedAttribute.class) {
				return parse_pattern_art_instance_ValuedAttribute();
			}
			if (type.getInstanceClass() == pattern.art.instance.DictionaryValuedAttribute.class) {
				return parse_pattern_art_instance_DictionaryValuedAttribute();
			}
			if (type.getInstanceClass() == pattern.art.instance.DefaultEntry.class) {
				return parse_pattern_art_instance_DefaultEntry();
			}
			if (type.getInstanceClass() == pattern.art.instance.OtherEntry.class) {
				return parse_pattern_art_instance_OtherEntry();
			}
			if (type.getInstanceClass() == pattern.art.type.PrimitiveType.class) {
				return parse_pattern_art_type_PrimitiveType();
			}
			if (type.getInstanceClass() == pattern.art.type.CompositeType.class) {
				return parse_pattern_art_type_CompositeType();
			}
			if (type.getInstanceClass() == pattern.art.type.Operation.class) {
				return parse_pattern_art_type_Operation();
			}
			if (type.getInstanceClass() == pattern.art.type.Parameter.class) {
				return parse_pattern_art_type_Parameter();
			}
			if (type.getInstanceClass() == pattern.art.type.FunctionalService.class) {
				return parse_pattern_art_type_FunctionalService();
			}
			if (type.getInstanceClass() == pattern.art.type.ControlService.class) {
				return parse_pattern_art_type_ControlService();
			}
			if (type.getInstanceClass() == pattern.art.type.Port.class) {
				return parse_pattern_art_type_Port();
			}
			if (type.getInstanceClass() == pattern.art.implem.FractalComponent.class) {
				return parse_pattern_art_implem_FractalComponent();
			}
			if (type.getInstanceClass() == pattern.art.implem.OSGiComponent.class) {
				return parse_pattern_art_implem_OSGiComponent();
			}
			if (type.getInstanceClass() == pattern.art.implem.OSGiType.class) {
				return parse_pattern_art_implem_OSGiType();
			}
			if (type.getInstanceClass() == pattern.art.type.BasicAttribute.class) {
				return parse_pattern_art_type_BasicAttribute();
			}
			if (type.getInstanceClass() == pattern.art.type.Dictionary.class) {
				return parse_pattern_art_type_Dictionary();
			}
			if (type.getInstanceClass() == pattern.art.type.DictionaryDefaultValue.class) {
				return parse_pattern_art_type_DictionaryDefaultValue();
			}
			if (type.getInstanceClass() == pattern.art.type.PortId.class) {
				return parse_pattern_art_type_PortId();
			}
			if (type.getInstanceClass() == pattern.art.type.PortCollection.class) {
				return parse_pattern_art_type_PortCollection();
			}
			if (type.getInstanceClass() == patternframework.ModelPattern.class) {
				return parse_patternframework_ModelPattern();
			}
			if (type.getInstanceClass() == patternframework.PModel.class) {
				return parse_patternframework_PModel();
			}
			if (type.getInstanceClass() == patternframework.PConstraint.class) {
				return parse_patternframework_PConstraint();
			}
			if (type.getInstanceClass() == patternframework.PRole.class) {
				return parse_patternframework_PRole();
			}
		}
		throw new org.smartadapters.core.resource.core.mopp.CoreUnexpectedContentTypeException(typeObject);
	}
	
	private org.smartadapters.core.resource.core.mopp.CoreTokenResolveResult getFreshTokenResolveResult() {
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
	
	public org.smartadapters.core.resource.core.mopp.CoreMetaInformation getMetaInformation() {
		return new org.smartadapters.core.resource.core.mopp.CoreMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.smartadapters.core.resource.core.mopp.CoreReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.smartadapters.core.resource.core.mopp.CoreReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.smartadapters.core.resource.core.ICoreOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	// Implementation that calls {@link #doParse()}  and handles the thrown
	// RecognitionExceptions.
	public org.smartadapters.core.resource.core.ICoreParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>>();
		org.smartadapters.core.resource.core.mopp.CoreParseResult parseResult = new org.smartadapters.core.resource.core.mopp.CoreParseResult();
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
	
	public java.util.List<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.smartadapters.core.resource.core.ICoreTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
		org.smartadapters.core.resource.core.ICoreParseResult result = parse();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal>();
		java.util.List<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal> newFollowSet = new java.util.ArrayList<org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 511;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected terminals
				// can be set
				for (org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are kept
				for (org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.smartadapters.core.resource.core.ICoreExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.smartadapters.core.resource.core.ICoreExpectedElement newFollower : newFollowers) {
							org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal newFollowTerminal = new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(newFollower, followSetID);
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
		for (org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal expectedElement, int tokenIndex) {
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
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new org.smartadapters.core.resource.core.ICoreCommand<org.smartadapters.core.resource.core.ICoreTextResource>() {
			public boolean execute(org.smartadapters.core.resource.core.ICoreTextResource resource) {
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
				tokenName = org.smartadapters.core.resource.core.util.CoreStringUtil.formatTokenName(tokenName);
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
	
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_0 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("Adapter");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_1 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAdapter().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_2 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(";");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_3 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("pointcut");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_4 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("protocol");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_5 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_6 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("set");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_7 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("set");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_8 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("set");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_9 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("set");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_10 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("set");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_11 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_12 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_13 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("constraint");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_14 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("featureID");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_15 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("pattern");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_16 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_17 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("advice");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_18 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_19 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("model");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_20 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_21 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("unique elements");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_22 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_23 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAspect().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_24 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_25 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAspect().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_26 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("system");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_27 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_28 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_29 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("root");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_30 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("services");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_31 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("types");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_32 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("datatypes");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_33 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_34 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_35 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_36 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_37 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_38 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_39 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_40 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_41 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_42 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_43 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_44 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_45 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_46 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_47 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_48 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("instance");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_49 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_50 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_51 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("type");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_52 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("state");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_53 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("super");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_54 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_55 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("binding");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_56 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("name");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_57 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_58 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_59 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_60 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_61 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_62 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_63 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_64 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_65 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_66 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_67 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_68 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_69 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_70 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_71 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_72 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_73 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_74 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("primitive");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_75 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("component");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_76 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_77 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_78 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("type");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_79 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("state");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_80 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("super");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_81 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_82 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("binding");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_83 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("name");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_84 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_85 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_86 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_87 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_88 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_89 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_90 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_91 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_92 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_93 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_94 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_95 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_96 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_97 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_98 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_99 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_100 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_101 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("composite");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_102 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("component");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_103 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_104 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_105 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("component");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_106 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("delegation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_107 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("state");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_108 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("super");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_109 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_110 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("binding");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_111 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("name");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_112 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_113 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_114 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_115 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_116 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_117 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_118 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_119 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_120 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_121 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_122 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_123 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_124 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_125 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_126 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_127 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_128 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_129 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("+=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_130 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_131 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_132 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_133 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_134 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_135 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("binding");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_136 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_137 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_138 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("requiredPort");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_139 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("providedPort");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_140 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("server");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_141 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("id");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_142 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_143 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_144 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_145 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_146 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_147 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_148 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_149 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_150 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_151 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("system");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_152 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getSystem().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_153 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_154 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(";");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_155 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getSystem().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_156 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_157 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("root");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_158 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("functional");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_159 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("control");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_160 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("type");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_161 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("compositetype");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_162 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("datatype");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_163 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_164 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("composite");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_165 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getDataType().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_166 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_167 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(";");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_168 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getDataType().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_169 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_170 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("primitive");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_171 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("instance");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_172 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_173 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_174 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_175 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_176 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_177 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_178 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_179 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), "T_INSTANCE_STATE");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_180 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_181 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_182 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("FractalComponent");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_183 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("OSGiComponent");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_184 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_185 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_186 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("bind");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_187 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_188 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("delegate");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_189 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_190 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("instance");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_191 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_192 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_193 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_194 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_195 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_196 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_197 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_198 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), "T_INSTANCE_STATE");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_199 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_200 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_201 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_202 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_203 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("to");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_204 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_205 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_206 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("::");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_207 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_208 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("(");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_209 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("id");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_210 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_211 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_212 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(")");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_213 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_214 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_215 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("to");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_216 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_217 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_218 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("::");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_219 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_220 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("(");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_221 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("id");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_222 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_223 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_224 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(")");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_225 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_226 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_227 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":=");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_228 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("[");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_229 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("[");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_230 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_231 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_232 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("->");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_233 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_234 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("]");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_235 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_236 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("->");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_237 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_238 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("]");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_239 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPrimitiveType().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_240 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_241 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_242 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_243 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPrimitiveType().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_244 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_245 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiType().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), "T_IMPLEM");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_246 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE), "T_PORT_KIND");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_247 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE), "T_PORT_KIND");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_248 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_249 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_250 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_251 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getCompositeType().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_252 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_253 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_254 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_255 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getCompositeType().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_256 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_257 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_258 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("operation");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_259 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getOperation().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_260 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_261 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("(");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_262 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getOperation().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_263 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_264 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_265 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_266 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_267 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(")");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_268 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_269 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_270 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_271 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_272 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_273 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_274 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_275 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_276 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("service");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_277 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getFunctionalService().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_278 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_279 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_280 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getFunctionalService().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_281 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_282 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("service");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_283 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getControlService().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_284 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_285 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_286 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getControlService().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_287 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_288 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL), "T_OPTIONAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_289 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("port");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_290 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_291 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_292 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_293 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_294 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_295 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_296 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_297 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("[");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_298 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), "MULTIPLICITY");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_299 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("..");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_300 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), "MULTIPLICITY");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_301 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("]");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_302 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_303 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("controllerDesc");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_304 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_305 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_306 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("contentDesc");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_307 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_308 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_309 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_310 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_311 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_312 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_313 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_314 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_315 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_316 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_317 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_318 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_319 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("default");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_320 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_321 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_322 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_323 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_324 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_325 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_326 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("[");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_327 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_328 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_329 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("->");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_330 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_331 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_332 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("]");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_333 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("default");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_334 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_335 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("[");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_336 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_337 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_338 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("->");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_339 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("]");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_340 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_341 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortId().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_342 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_343 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_344 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("port");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_345 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_346 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("<");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_347 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_348 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_349 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(">");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_350 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_351 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("?");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_352 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_353 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_354 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getModelPattern().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_355 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("negative");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_356 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("pattern");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_357 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_358 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("{");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_359 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("roles");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_360 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_361 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPRole().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_362 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(",");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_363 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(";");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_364 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("(");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_365 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPConstraint().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_366 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(")");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_367 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_368 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPConstraint().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_369 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(";");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_370 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString(":");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_371 = new org.smartadapters.core.resource.core.mopp.CoreExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPRole().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), "TEXT");
	private final static org.smartadapters.core.resource.core.ICoreExpectedElement TERMINAL_372 = new org.smartadapters.core.resource.core.mopp.CoreExpectedCsString("}");
	
	public static void wire0() {
		TERMINAL_0.addFollower(TERMINAL_1);
		TERMINAL_1.addFollower(TERMINAL_2);
		TERMINAL_2.addFollower(TERMINAL_3);
		TERMINAL_4.addFollower(TERMINAL_5);
		TERMINAL_5.addFollower(TERMINAL_6);
		TERMINAL_5.addFollower(TERMINAL_7);
		TERMINAL_5.addFollower(TERMINAL_8);
		TERMINAL_5.addFollower(TERMINAL_9);
		TERMINAL_5.addFollower(TERMINAL_10);
		TERMINAL_5.addFollower(TERMINAL_11);
		TERMINAL_3.addFollower(TERMINAL_12);
		TERMINAL_12.addFollower(TERMINAL_13);
		TERMINAL_12.addFollower(TERMINAL_14);
		TERMINAL_12.addFollower(TERMINAL_15);
		TERMINAL_16.addFollower(TERMINAL_17);
		TERMINAL_17.addFollower(TERMINAL_18);
		TERMINAL_18.addFollower(TERMINAL_19);
		TERMINAL_20.addFollower(TERMINAL_21);
		TERMINAL_20.addFollower(TERMINAL_4);
		TERMINAL_21.addFollower(TERMINAL_22);
		TERMINAL_22.addFollower(TERMINAL_23);
		TERMINAL_23.addFollower(TERMINAL_24);
		TERMINAL_23.addFollower(TERMINAL_4);
		TERMINAL_24.addFollower(TERMINAL_25);
		TERMINAL_25.addFollower(TERMINAL_24);
		TERMINAL_25.addFollower(TERMINAL_4);
		TERMINAL_6.addFollower(TERMINAL_26);
		TERMINAL_26.addFollower(TERMINAL_27);
		TERMINAL_27.addFollower(TERMINAL_28);
		TERMINAL_28.addFollower(TERMINAL_29);
		TERMINAL_28.addFollower(TERMINAL_30);
		TERMINAL_28.addFollower(TERMINAL_31);
		TERMINAL_28.addFollower(TERMINAL_32);
		TERMINAL_28.addFollower(TERMINAL_33);
		TERMINAL_29.addFollower(TERMINAL_34);
		TERMINAL_34.addFollower(TERMINAL_35);
		TERMINAL_35.addFollower(TERMINAL_29);
		TERMINAL_35.addFollower(TERMINAL_30);
		TERMINAL_35.addFollower(TERMINAL_31);
		TERMINAL_35.addFollower(TERMINAL_32);
		TERMINAL_35.addFollower(TERMINAL_33);
		TERMINAL_30.addFollower(TERMINAL_36);
		TERMINAL_36.addFollower(TERMINAL_37);
		TERMINAL_37.addFollower(TERMINAL_38);
		TERMINAL_37.addFollower(TERMINAL_29);
		TERMINAL_37.addFollower(TERMINAL_30);
		TERMINAL_37.addFollower(TERMINAL_31);
		TERMINAL_37.addFollower(TERMINAL_32);
		TERMINAL_37.addFollower(TERMINAL_33);
		TERMINAL_38.addFollower(TERMINAL_39);
		TERMINAL_39.addFollower(TERMINAL_38);
		TERMINAL_39.addFollower(TERMINAL_29);
		TERMINAL_39.addFollower(TERMINAL_30);
		TERMINAL_39.addFollower(TERMINAL_31);
		TERMINAL_39.addFollower(TERMINAL_32);
		TERMINAL_39.addFollower(TERMINAL_33);
		TERMINAL_31.addFollower(TERMINAL_40);
		TERMINAL_40.addFollower(TERMINAL_41);
		TERMINAL_41.addFollower(TERMINAL_42);
		TERMINAL_41.addFollower(TERMINAL_29);
		TERMINAL_41.addFollower(TERMINAL_30);
		TERMINAL_41.addFollower(TERMINAL_31);
		TERMINAL_41.addFollower(TERMINAL_32);
		TERMINAL_41.addFollower(TERMINAL_33);
		TERMINAL_42.addFollower(TERMINAL_43);
		TERMINAL_43.addFollower(TERMINAL_42);
		TERMINAL_43.addFollower(TERMINAL_29);
		TERMINAL_43.addFollower(TERMINAL_30);
		TERMINAL_43.addFollower(TERMINAL_31);
		TERMINAL_43.addFollower(TERMINAL_32);
		TERMINAL_43.addFollower(TERMINAL_33);
		TERMINAL_32.addFollower(TERMINAL_44);
		TERMINAL_44.addFollower(TERMINAL_45);
		TERMINAL_45.addFollower(TERMINAL_46);
		TERMINAL_45.addFollower(TERMINAL_29);
		TERMINAL_45.addFollower(TERMINAL_30);
		TERMINAL_45.addFollower(TERMINAL_31);
		TERMINAL_45.addFollower(TERMINAL_32);
		TERMINAL_45.addFollower(TERMINAL_33);
		TERMINAL_46.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_46);
		TERMINAL_47.addFollower(TERMINAL_29);
		TERMINAL_47.addFollower(TERMINAL_30);
		TERMINAL_47.addFollower(TERMINAL_31);
		TERMINAL_47.addFollower(TERMINAL_32);
		TERMINAL_47.addFollower(TERMINAL_33);
		TERMINAL_33.addFollower(TERMINAL_6);
		TERMINAL_33.addFollower(TERMINAL_7);
		TERMINAL_33.addFollower(TERMINAL_8);
		TERMINAL_33.addFollower(TERMINAL_9);
		TERMINAL_33.addFollower(TERMINAL_10);
		TERMINAL_33.addFollower(TERMINAL_11);
		TERMINAL_7.addFollower(TERMINAL_48);
		TERMINAL_48.addFollower(TERMINAL_49);
		TERMINAL_49.addFollower(TERMINAL_50);
		TERMINAL_50.addFollower(TERMINAL_51);
		TERMINAL_50.addFollower(TERMINAL_52);
		TERMINAL_50.addFollower(TERMINAL_53);
		TERMINAL_50.addFollower(TERMINAL_54);
		TERMINAL_50.addFollower(TERMINAL_55);
		TERMINAL_50.addFollower(TERMINAL_56);
		TERMINAL_50.addFollower(TERMINAL_57);
		TERMINAL_51.addFollower(TERMINAL_58);
		TERMINAL_58.addFollower(TERMINAL_59);
		TERMINAL_59.addFollower(TERMINAL_51);
		TERMINAL_59.addFollower(TERMINAL_52);
		TERMINAL_59.addFollower(TERMINAL_53);
		TERMINAL_59.addFollower(TERMINAL_54);
		TERMINAL_59.addFollower(TERMINAL_55);
		TERMINAL_59.addFollower(TERMINAL_56);
		TERMINAL_59.addFollower(TERMINAL_57);
		TERMINAL_52.addFollower(TERMINAL_60);
		TERMINAL_60.addFollower(TERMINAL_61);
		TERMINAL_61.addFollower(TERMINAL_51);
		TERMINAL_61.addFollower(TERMINAL_52);
		TERMINAL_61.addFollower(TERMINAL_53);
		TERMINAL_61.addFollower(TERMINAL_54);
		TERMINAL_61.addFollower(TERMINAL_55);
		TERMINAL_61.addFollower(TERMINAL_56);
		TERMINAL_61.addFollower(TERMINAL_57);
		TERMINAL_53.addFollower(TERMINAL_62);
		TERMINAL_62.addFollower(TERMINAL_63);
		TERMINAL_63.addFollower(TERMINAL_51);
		TERMINAL_63.addFollower(TERMINAL_52);
		TERMINAL_63.addFollower(TERMINAL_53);
		TERMINAL_63.addFollower(TERMINAL_54);
		TERMINAL_63.addFollower(TERMINAL_55);
		TERMINAL_63.addFollower(TERMINAL_56);
		TERMINAL_63.addFollower(TERMINAL_57);
		TERMINAL_54.addFollower(TERMINAL_64);
		TERMINAL_64.addFollower(TERMINAL_65);
		TERMINAL_65.addFollower(TERMINAL_66);
		TERMINAL_65.addFollower(TERMINAL_51);
		TERMINAL_65.addFollower(TERMINAL_52);
		TERMINAL_65.addFollower(TERMINAL_53);
		TERMINAL_65.addFollower(TERMINAL_54);
		TERMINAL_65.addFollower(TERMINAL_55);
		TERMINAL_65.addFollower(TERMINAL_56);
		TERMINAL_65.addFollower(TERMINAL_57);
		TERMINAL_66.addFollower(TERMINAL_67);
		TERMINAL_67.addFollower(TERMINAL_66);
		TERMINAL_67.addFollower(TERMINAL_51);
		TERMINAL_67.addFollower(TERMINAL_52);
		TERMINAL_67.addFollower(TERMINAL_53);
		TERMINAL_67.addFollower(TERMINAL_54);
		TERMINAL_67.addFollower(TERMINAL_55);
		TERMINAL_67.addFollower(TERMINAL_56);
		TERMINAL_67.addFollower(TERMINAL_57);
		TERMINAL_55.addFollower(TERMINAL_68);
		TERMINAL_68.addFollower(TERMINAL_69);
		TERMINAL_69.addFollower(TERMINAL_70);
		TERMINAL_69.addFollower(TERMINAL_51);
		TERMINAL_69.addFollower(TERMINAL_52);
		TERMINAL_69.addFollower(TERMINAL_53);
		TERMINAL_69.addFollower(TERMINAL_54);
		TERMINAL_69.addFollower(TERMINAL_55);
		TERMINAL_69.addFollower(TERMINAL_56);
		TERMINAL_69.addFollower(TERMINAL_57);
		TERMINAL_70.addFollower(TERMINAL_71);
		TERMINAL_71.addFollower(TERMINAL_70);
		TERMINAL_71.addFollower(TERMINAL_51);
		TERMINAL_71.addFollower(TERMINAL_52);
		TERMINAL_71.addFollower(TERMINAL_53);
		TERMINAL_71.addFollower(TERMINAL_54);
		TERMINAL_71.addFollower(TERMINAL_55);
		TERMINAL_71.addFollower(TERMINAL_56);
		TERMINAL_71.addFollower(TERMINAL_57);
		TERMINAL_56.addFollower(TERMINAL_72);
		TERMINAL_72.addFollower(TERMINAL_73);
		TERMINAL_73.addFollower(TERMINAL_51);
		TERMINAL_73.addFollower(TERMINAL_52);
		TERMINAL_73.addFollower(TERMINAL_53);
		TERMINAL_73.addFollower(TERMINAL_54);
		TERMINAL_73.addFollower(TERMINAL_55);
		TERMINAL_73.addFollower(TERMINAL_56);
		TERMINAL_73.addFollower(TERMINAL_57);
		TERMINAL_57.addFollower(TERMINAL_6);
		TERMINAL_57.addFollower(TERMINAL_7);
		TERMINAL_57.addFollower(TERMINAL_8);
		TERMINAL_57.addFollower(TERMINAL_9);
		TERMINAL_57.addFollower(TERMINAL_10);
		TERMINAL_57.addFollower(TERMINAL_11);
		TERMINAL_8.addFollower(TERMINAL_74);
		TERMINAL_74.addFollower(TERMINAL_75);
		TERMINAL_75.addFollower(TERMINAL_76);
		TERMINAL_76.addFollower(TERMINAL_77);
		TERMINAL_77.addFollower(TERMINAL_78);
		TERMINAL_77.addFollower(TERMINAL_79);
		TERMINAL_77.addFollower(TERMINAL_80);
		TERMINAL_77.addFollower(TERMINAL_81);
		TERMINAL_77.addFollower(TERMINAL_82);
		TERMINAL_77.addFollower(TERMINAL_83);
		TERMINAL_77.addFollower(TERMINAL_84);
		TERMINAL_78.addFollower(TERMINAL_85);
		TERMINAL_85.addFollower(TERMINAL_86);
		TERMINAL_86.addFollower(TERMINAL_78);
		TERMINAL_86.addFollower(TERMINAL_79);
		TERMINAL_86.addFollower(TERMINAL_80);
		TERMINAL_86.addFollower(TERMINAL_81);
		TERMINAL_86.addFollower(TERMINAL_82);
		TERMINAL_86.addFollower(TERMINAL_83);
		TERMINAL_86.addFollower(TERMINAL_84);
		TERMINAL_79.addFollower(TERMINAL_87);
		TERMINAL_87.addFollower(TERMINAL_88);
		TERMINAL_88.addFollower(TERMINAL_78);
		TERMINAL_88.addFollower(TERMINAL_79);
		TERMINAL_88.addFollower(TERMINAL_80);
		TERMINAL_88.addFollower(TERMINAL_81);
		TERMINAL_88.addFollower(TERMINAL_82);
		TERMINAL_88.addFollower(TERMINAL_83);
		TERMINAL_88.addFollower(TERMINAL_84);
		TERMINAL_80.addFollower(TERMINAL_89);
		TERMINAL_89.addFollower(TERMINAL_90);
		TERMINAL_90.addFollower(TERMINAL_78);
		TERMINAL_90.addFollower(TERMINAL_79);
		TERMINAL_90.addFollower(TERMINAL_80);
		TERMINAL_90.addFollower(TERMINAL_81);
		TERMINAL_90.addFollower(TERMINAL_82);
		TERMINAL_90.addFollower(TERMINAL_83);
		TERMINAL_90.addFollower(TERMINAL_84);
		TERMINAL_81.addFollower(TERMINAL_91);
		TERMINAL_91.addFollower(TERMINAL_92);
		TERMINAL_92.addFollower(TERMINAL_93);
		TERMINAL_92.addFollower(TERMINAL_78);
		TERMINAL_92.addFollower(TERMINAL_79);
		TERMINAL_92.addFollower(TERMINAL_80);
		TERMINAL_92.addFollower(TERMINAL_81);
		TERMINAL_92.addFollower(TERMINAL_82);
		TERMINAL_92.addFollower(TERMINAL_83);
		TERMINAL_92.addFollower(TERMINAL_84);
		TERMINAL_93.addFollower(TERMINAL_94);
		TERMINAL_94.addFollower(TERMINAL_93);
		TERMINAL_94.addFollower(TERMINAL_78);
		TERMINAL_94.addFollower(TERMINAL_79);
		TERMINAL_94.addFollower(TERMINAL_80);
		TERMINAL_94.addFollower(TERMINAL_81);
		TERMINAL_94.addFollower(TERMINAL_82);
		TERMINAL_94.addFollower(TERMINAL_83);
		TERMINAL_94.addFollower(TERMINAL_84);
		TERMINAL_82.addFollower(TERMINAL_95);
		TERMINAL_95.addFollower(TERMINAL_96);
		TERMINAL_96.addFollower(TERMINAL_97);
		TERMINAL_96.addFollower(TERMINAL_78);
		TERMINAL_96.addFollower(TERMINAL_79);
		TERMINAL_96.addFollower(TERMINAL_80);
		TERMINAL_96.addFollower(TERMINAL_81);
		TERMINAL_96.addFollower(TERMINAL_82);
		TERMINAL_96.addFollower(TERMINAL_83);
		TERMINAL_96.addFollower(TERMINAL_84);
		TERMINAL_97.addFollower(TERMINAL_98);
		TERMINAL_98.addFollower(TERMINAL_97);
		TERMINAL_98.addFollower(TERMINAL_78);
		TERMINAL_98.addFollower(TERMINAL_79);
		TERMINAL_98.addFollower(TERMINAL_80);
		TERMINAL_98.addFollower(TERMINAL_81);
		TERMINAL_98.addFollower(TERMINAL_82);
		TERMINAL_98.addFollower(TERMINAL_83);
		TERMINAL_98.addFollower(TERMINAL_84);
		TERMINAL_83.addFollower(TERMINAL_99);
		TERMINAL_99.addFollower(TERMINAL_100);
		TERMINAL_100.addFollower(TERMINAL_78);
		TERMINAL_100.addFollower(TERMINAL_79);
		TERMINAL_100.addFollower(TERMINAL_80);
		TERMINAL_100.addFollower(TERMINAL_81);
		TERMINAL_100.addFollower(TERMINAL_82);
		TERMINAL_100.addFollower(TERMINAL_83);
		TERMINAL_100.addFollower(TERMINAL_84);
		TERMINAL_84.addFollower(TERMINAL_6);
		TERMINAL_84.addFollower(TERMINAL_7);
		TERMINAL_84.addFollower(TERMINAL_8);
		TERMINAL_84.addFollower(TERMINAL_9);
		TERMINAL_84.addFollower(TERMINAL_10);
		TERMINAL_84.addFollower(TERMINAL_11);
		TERMINAL_9.addFollower(TERMINAL_101);
		TERMINAL_101.addFollower(TERMINAL_102);
		TERMINAL_102.addFollower(TERMINAL_103);
		TERMINAL_103.addFollower(TERMINAL_104);
		TERMINAL_104.addFollower(TERMINAL_105);
		TERMINAL_104.addFollower(TERMINAL_106);
		TERMINAL_104.addFollower(TERMINAL_107);
		TERMINAL_104.addFollower(TERMINAL_108);
		TERMINAL_104.addFollower(TERMINAL_109);
		TERMINAL_104.addFollower(TERMINAL_110);
		TERMINAL_104.addFollower(TERMINAL_111);
		TERMINAL_104.addFollower(TERMINAL_112);
	}
	public static void wire1() {
		TERMINAL_105.addFollower(TERMINAL_113);
		TERMINAL_113.addFollower(TERMINAL_114);
		TERMINAL_114.addFollower(TERMINAL_115);
		TERMINAL_114.addFollower(TERMINAL_105);
		TERMINAL_114.addFollower(TERMINAL_106);
		TERMINAL_114.addFollower(TERMINAL_107);
		TERMINAL_114.addFollower(TERMINAL_108);
		TERMINAL_114.addFollower(TERMINAL_109);
		TERMINAL_114.addFollower(TERMINAL_110);
		TERMINAL_114.addFollower(TERMINAL_111);
		TERMINAL_114.addFollower(TERMINAL_112);
		TERMINAL_115.addFollower(TERMINAL_116);
		TERMINAL_116.addFollower(TERMINAL_115);
		TERMINAL_116.addFollower(TERMINAL_105);
		TERMINAL_116.addFollower(TERMINAL_106);
		TERMINAL_116.addFollower(TERMINAL_107);
		TERMINAL_116.addFollower(TERMINAL_108);
		TERMINAL_116.addFollower(TERMINAL_109);
		TERMINAL_116.addFollower(TERMINAL_110);
		TERMINAL_116.addFollower(TERMINAL_111);
		TERMINAL_116.addFollower(TERMINAL_112);
		TERMINAL_106.addFollower(TERMINAL_117);
		TERMINAL_117.addFollower(TERMINAL_118);
		TERMINAL_118.addFollower(TERMINAL_119);
		TERMINAL_118.addFollower(TERMINAL_105);
		TERMINAL_118.addFollower(TERMINAL_106);
		TERMINAL_118.addFollower(TERMINAL_107);
		TERMINAL_118.addFollower(TERMINAL_108);
		TERMINAL_118.addFollower(TERMINAL_109);
		TERMINAL_118.addFollower(TERMINAL_110);
		TERMINAL_118.addFollower(TERMINAL_111);
		TERMINAL_118.addFollower(TERMINAL_112);
		TERMINAL_119.addFollower(TERMINAL_120);
		TERMINAL_120.addFollower(TERMINAL_119);
		TERMINAL_120.addFollower(TERMINAL_105);
		TERMINAL_120.addFollower(TERMINAL_106);
		TERMINAL_120.addFollower(TERMINAL_107);
		TERMINAL_120.addFollower(TERMINAL_108);
		TERMINAL_120.addFollower(TERMINAL_109);
		TERMINAL_120.addFollower(TERMINAL_110);
		TERMINAL_120.addFollower(TERMINAL_111);
		TERMINAL_120.addFollower(TERMINAL_112);
		TERMINAL_107.addFollower(TERMINAL_121);
		TERMINAL_121.addFollower(TERMINAL_122);
		TERMINAL_122.addFollower(TERMINAL_105);
		TERMINAL_122.addFollower(TERMINAL_106);
		TERMINAL_122.addFollower(TERMINAL_107);
		TERMINAL_122.addFollower(TERMINAL_108);
		TERMINAL_122.addFollower(TERMINAL_109);
		TERMINAL_122.addFollower(TERMINAL_110);
		TERMINAL_122.addFollower(TERMINAL_111);
		TERMINAL_122.addFollower(TERMINAL_112);
		TERMINAL_108.addFollower(TERMINAL_123);
		TERMINAL_123.addFollower(TERMINAL_124);
		TERMINAL_124.addFollower(TERMINAL_105);
		TERMINAL_124.addFollower(TERMINAL_106);
		TERMINAL_124.addFollower(TERMINAL_107);
		TERMINAL_124.addFollower(TERMINAL_108);
		TERMINAL_124.addFollower(TERMINAL_109);
		TERMINAL_124.addFollower(TERMINAL_110);
		TERMINAL_124.addFollower(TERMINAL_111);
		TERMINAL_124.addFollower(TERMINAL_112);
		TERMINAL_109.addFollower(TERMINAL_125);
		TERMINAL_125.addFollower(TERMINAL_126);
		TERMINAL_126.addFollower(TERMINAL_127);
		TERMINAL_126.addFollower(TERMINAL_105);
		TERMINAL_126.addFollower(TERMINAL_106);
		TERMINAL_126.addFollower(TERMINAL_107);
		TERMINAL_126.addFollower(TERMINAL_108);
		TERMINAL_126.addFollower(TERMINAL_109);
		TERMINAL_126.addFollower(TERMINAL_110);
		TERMINAL_126.addFollower(TERMINAL_111);
		TERMINAL_126.addFollower(TERMINAL_112);
		TERMINAL_127.addFollower(TERMINAL_128);
		TERMINAL_128.addFollower(TERMINAL_127);
		TERMINAL_128.addFollower(TERMINAL_105);
		TERMINAL_128.addFollower(TERMINAL_106);
		TERMINAL_128.addFollower(TERMINAL_107);
		TERMINAL_128.addFollower(TERMINAL_108);
		TERMINAL_128.addFollower(TERMINAL_109);
		TERMINAL_128.addFollower(TERMINAL_110);
		TERMINAL_128.addFollower(TERMINAL_111);
		TERMINAL_128.addFollower(TERMINAL_112);
		TERMINAL_110.addFollower(TERMINAL_129);
		TERMINAL_129.addFollower(TERMINAL_130);
		TERMINAL_130.addFollower(TERMINAL_131);
		TERMINAL_130.addFollower(TERMINAL_105);
		TERMINAL_130.addFollower(TERMINAL_106);
		TERMINAL_130.addFollower(TERMINAL_107);
		TERMINAL_130.addFollower(TERMINAL_108);
		TERMINAL_130.addFollower(TERMINAL_109);
		TERMINAL_130.addFollower(TERMINAL_110);
		TERMINAL_130.addFollower(TERMINAL_111);
		TERMINAL_130.addFollower(TERMINAL_112);
		TERMINAL_131.addFollower(TERMINAL_132);
		TERMINAL_132.addFollower(TERMINAL_131);
		TERMINAL_132.addFollower(TERMINAL_105);
		TERMINAL_132.addFollower(TERMINAL_106);
		TERMINAL_132.addFollower(TERMINAL_107);
		TERMINAL_132.addFollower(TERMINAL_108);
		TERMINAL_132.addFollower(TERMINAL_109);
		TERMINAL_132.addFollower(TERMINAL_110);
		TERMINAL_132.addFollower(TERMINAL_111);
		TERMINAL_132.addFollower(TERMINAL_112);
		TERMINAL_111.addFollower(TERMINAL_133);
		TERMINAL_133.addFollower(TERMINAL_134);
		TERMINAL_134.addFollower(TERMINAL_105);
		TERMINAL_134.addFollower(TERMINAL_106);
		TERMINAL_134.addFollower(TERMINAL_107);
		TERMINAL_134.addFollower(TERMINAL_108);
		TERMINAL_134.addFollower(TERMINAL_109);
		TERMINAL_134.addFollower(TERMINAL_110);
		TERMINAL_134.addFollower(TERMINAL_111);
		TERMINAL_134.addFollower(TERMINAL_112);
		TERMINAL_112.addFollower(TERMINAL_6);
		TERMINAL_112.addFollower(TERMINAL_7);
		TERMINAL_112.addFollower(TERMINAL_8);
		TERMINAL_112.addFollower(TERMINAL_9);
		TERMINAL_112.addFollower(TERMINAL_10);
		TERMINAL_112.addFollower(TERMINAL_11);
		TERMINAL_10.addFollower(TERMINAL_135);
		TERMINAL_135.addFollower(TERMINAL_136);
		TERMINAL_136.addFollower(TERMINAL_137);
		TERMINAL_137.addFollower(TERMINAL_138);
		TERMINAL_137.addFollower(TERMINAL_139);
		TERMINAL_137.addFollower(TERMINAL_140);
		TERMINAL_137.addFollower(TERMINAL_141);
		TERMINAL_137.addFollower(TERMINAL_142);
		TERMINAL_138.addFollower(TERMINAL_143);
		TERMINAL_143.addFollower(TERMINAL_144);
		TERMINAL_144.addFollower(TERMINAL_138);
		TERMINAL_144.addFollower(TERMINAL_139);
		TERMINAL_144.addFollower(TERMINAL_140);
		TERMINAL_144.addFollower(TERMINAL_141);
		TERMINAL_144.addFollower(TERMINAL_142);
		TERMINAL_139.addFollower(TERMINAL_145);
		TERMINAL_145.addFollower(TERMINAL_146);
		TERMINAL_146.addFollower(TERMINAL_138);
		TERMINAL_146.addFollower(TERMINAL_139);
		TERMINAL_146.addFollower(TERMINAL_140);
		TERMINAL_146.addFollower(TERMINAL_141);
		TERMINAL_146.addFollower(TERMINAL_142);
		TERMINAL_140.addFollower(TERMINAL_147);
		TERMINAL_147.addFollower(TERMINAL_148);
		TERMINAL_148.addFollower(TERMINAL_138);
		TERMINAL_148.addFollower(TERMINAL_139);
		TERMINAL_148.addFollower(TERMINAL_140);
		TERMINAL_148.addFollower(TERMINAL_141);
		TERMINAL_148.addFollower(TERMINAL_142);
		TERMINAL_141.addFollower(TERMINAL_149);
		TERMINAL_149.addFollower(TERMINAL_150);
		TERMINAL_150.addFollower(TERMINAL_138);
		TERMINAL_150.addFollower(TERMINAL_139);
		TERMINAL_150.addFollower(TERMINAL_140);
		TERMINAL_150.addFollower(TERMINAL_141);
		TERMINAL_150.addFollower(TERMINAL_142);
		TERMINAL_142.addFollower(TERMINAL_6);
		TERMINAL_142.addFollower(TERMINAL_7);
		TERMINAL_142.addFollower(TERMINAL_8);
		TERMINAL_142.addFollower(TERMINAL_9);
		TERMINAL_142.addFollower(TERMINAL_10);
		TERMINAL_142.addFollower(TERMINAL_11);
		TERMINAL_151.addFollower(TERMINAL_152);
		TERMINAL_151.addFollower(TERMINAL_153);
		TERMINAL_151.addFollower(TERMINAL_154);
		TERMINAL_152.addFollower(TERMINAL_153);
		TERMINAL_152.addFollower(TERMINAL_154);
		TERMINAL_153.addFollower(TERMINAL_155);
		TERMINAL_155.addFollower(TERMINAL_156);
		TERMINAL_156.addFollower(TERMINAL_154);
		TERMINAL_154.addFollower(TERMINAL_157);
		TERMINAL_154.addFollower(TERMINAL_158);
		TERMINAL_154.addFollower(TERMINAL_159);
		TERMINAL_154.addFollower(TERMINAL_160);
		TERMINAL_154.addFollower(TERMINAL_161);
		TERMINAL_154.addFollower(TERMINAL_162);
		TERMINAL_154.addFollower(TERMINAL_163);
		TERMINAL_157.addFollower(TERMINAL_164);
		TERMINAL_162.addFollower(TERMINAL_165);
		TERMINAL_162.addFollower(TERMINAL_166);
		TERMINAL_162.addFollower(TERMINAL_167);
		TERMINAL_165.addFollower(TERMINAL_166);
		TERMINAL_165.addFollower(TERMINAL_167);
		TERMINAL_166.addFollower(TERMINAL_168);
		TERMINAL_168.addFollower(TERMINAL_169);
		TERMINAL_169.addFollower(TERMINAL_167);
		TERMINAL_167.addFollower(TERMINAL_158);
		TERMINAL_167.addFollower(TERMINAL_159);
		TERMINAL_167.addFollower(TERMINAL_160);
		TERMINAL_167.addFollower(TERMINAL_161);
		TERMINAL_167.addFollower(TERMINAL_162);
		TERMINAL_167.addFollower(TERMINAL_163);
		TERMINAL_170.addFollower(TERMINAL_171);
		TERMINAL_171.addFollower(TERMINAL_172);
		TERMINAL_171.addFollower(TERMINAL_173);
		TERMINAL_171.addFollower(TERMINAL_174);
		TERMINAL_172.addFollower(TERMINAL_173);
		TERMINAL_172.addFollower(TERMINAL_174);
		TERMINAL_173.addFollower(TERMINAL_175);
		TERMINAL_175.addFollower(TERMINAL_176);
		TERMINAL_176.addFollower(TERMINAL_174);
		TERMINAL_174.addFollower(TERMINAL_177);
		TERMINAL_174.addFollower(TERMINAL_178);
		TERMINAL_177.addFollower(TERMINAL_179);
		TERMINAL_177.addFollower(TERMINAL_180);
		TERMINAL_177.addFollower(TERMINAL_181);
		TERMINAL_178.addFollower(TERMINAL_179);
		TERMINAL_178.addFollower(TERMINAL_180);
		TERMINAL_178.addFollower(TERMINAL_181);
		TERMINAL_179.addFollower(TERMINAL_180);
		TERMINAL_179.addFollower(TERMINAL_181);
		TERMINAL_180.addFollower(TERMINAL_182);
		TERMINAL_180.addFollower(TERMINAL_183);
		TERMINAL_181.addFollower(TERMINAL_184);
		TERMINAL_181.addFollower(TERMINAL_185);
		TERMINAL_181.addFollower(TERMINAL_186);
		TERMINAL_181.addFollower(TERMINAL_187);
		TERMINAL_187.addFollower(TERMINAL_184);
		TERMINAL_187.addFollower(TERMINAL_185);
		TERMINAL_187.addFollower(TERMINAL_186);
		TERMINAL_187.addFollower(TERMINAL_170);
		TERMINAL_187.addFollower(TERMINAL_164);
		TERMINAL_187.addFollower(TERMINAL_188);
		TERMINAL_187.addFollower(TERMINAL_189);
		TERMINAL_187.addFollower(TERMINAL_163);
		TERMINAL_164.addFollower(TERMINAL_190);
		TERMINAL_190.addFollower(TERMINAL_191);
		TERMINAL_190.addFollower(TERMINAL_192);
		TERMINAL_190.addFollower(TERMINAL_193);
		TERMINAL_191.addFollower(TERMINAL_192);
		TERMINAL_191.addFollower(TERMINAL_193);
		TERMINAL_192.addFollower(TERMINAL_194);
		TERMINAL_194.addFollower(TERMINAL_195);
		TERMINAL_195.addFollower(TERMINAL_193);
		TERMINAL_193.addFollower(TERMINAL_196);
		TERMINAL_193.addFollower(TERMINAL_197);
		TERMINAL_196.addFollower(TERMINAL_198);
		TERMINAL_196.addFollower(TERMINAL_199);
		TERMINAL_196.addFollower(TERMINAL_200);
		TERMINAL_197.addFollower(TERMINAL_198);
		TERMINAL_197.addFollower(TERMINAL_199);
		TERMINAL_197.addFollower(TERMINAL_200);
		TERMINAL_198.addFollower(TERMINAL_199);
		TERMINAL_198.addFollower(TERMINAL_200);
		TERMINAL_199.addFollower(TERMINAL_182);
		TERMINAL_199.addFollower(TERMINAL_183);
		TERMINAL_200.addFollower(TERMINAL_184);
		TERMINAL_200.addFollower(TERMINAL_185);
		TERMINAL_200.addFollower(TERMINAL_186);
		TERMINAL_200.addFollower(TERMINAL_170);
		TERMINAL_200.addFollower(TERMINAL_164);
		TERMINAL_200.addFollower(TERMINAL_188);
		TERMINAL_200.addFollower(TERMINAL_189);
		TERMINAL_189.addFollower(TERMINAL_158);
		TERMINAL_189.addFollower(TERMINAL_159);
		TERMINAL_189.addFollower(TERMINAL_160);
		TERMINAL_189.addFollower(TERMINAL_161);
		TERMINAL_189.addFollower(TERMINAL_162);
		TERMINAL_189.addFollower(TERMINAL_163);
		TERMINAL_189.addFollower(TERMINAL_184);
		TERMINAL_189.addFollower(TERMINAL_185);
		TERMINAL_189.addFollower(TERMINAL_186);
		TERMINAL_189.addFollower(TERMINAL_170);
		TERMINAL_189.addFollower(TERMINAL_164);
		TERMINAL_189.addFollower(TERMINAL_188);
		TERMINAL_189.addFollower(TERMINAL_189);
		TERMINAL_186.addFollower(TERMINAL_201);
		TERMINAL_186.addFollower(TERMINAL_202);
		TERMINAL_201.addFollower(TERMINAL_203);
		TERMINAL_202.addFollower(TERMINAL_203);
		TERMINAL_203.addFollower(TERMINAL_204);
		TERMINAL_203.addFollower(TERMINAL_205);
		TERMINAL_204.addFollower(TERMINAL_206);
		TERMINAL_206.addFollower(TERMINAL_207);
		TERMINAL_207.addFollower(TERMINAL_208);
		TERMINAL_207.addFollower(TERMINAL_184);
		TERMINAL_207.addFollower(TERMINAL_185);
		TERMINAL_207.addFollower(TERMINAL_186);
		TERMINAL_207.addFollower(TERMINAL_187);
		TERMINAL_207.addFollower(TERMINAL_170);
		TERMINAL_207.addFollower(TERMINAL_164);
		TERMINAL_207.addFollower(TERMINAL_188);
		TERMINAL_207.addFollower(TERMINAL_189);
		TERMINAL_207.addFollower(TERMINAL_163);
		TERMINAL_205.addFollower(TERMINAL_208);
		TERMINAL_205.addFollower(TERMINAL_184);
		TERMINAL_205.addFollower(TERMINAL_185);
		TERMINAL_205.addFollower(TERMINAL_186);
		TERMINAL_205.addFollower(TERMINAL_187);
		TERMINAL_205.addFollower(TERMINAL_170);
		TERMINAL_205.addFollower(TERMINAL_164);
		TERMINAL_205.addFollower(TERMINAL_188);
		TERMINAL_205.addFollower(TERMINAL_189);
		TERMINAL_205.addFollower(TERMINAL_163);
		TERMINAL_208.addFollower(TERMINAL_209);
		TERMINAL_209.addFollower(TERMINAL_210);
		TERMINAL_210.addFollower(TERMINAL_211);
		TERMINAL_211.addFollower(TERMINAL_212);
		TERMINAL_212.addFollower(TERMINAL_184);
		TERMINAL_212.addFollower(TERMINAL_185);
		TERMINAL_212.addFollower(TERMINAL_186);
		TERMINAL_212.addFollower(TERMINAL_187);
		TERMINAL_212.addFollower(TERMINAL_170);
		TERMINAL_212.addFollower(TERMINAL_164);
		TERMINAL_212.addFollower(TERMINAL_188);
		TERMINAL_212.addFollower(TERMINAL_189);
		TERMINAL_212.addFollower(TERMINAL_163);
		TERMINAL_188.addFollower(TERMINAL_213);
		TERMINAL_188.addFollower(TERMINAL_214);
	}
	public static void wire2() {
		TERMINAL_213.addFollower(TERMINAL_215);
		TERMINAL_214.addFollower(TERMINAL_215);
		TERMINAL_215.addFollower(TERMINAL_216);
		TERMINAL_215.addFollower(TERMINAL_217);
		TERMINAL_216.addFollower(TERMINAL_218);
		TERMINAL_218.addFollower(TERMINAL_219);
		TERMINAL_219.addFollower(TERMINAL_220);
		TERMINAL_219.addFollower(TERMINAL_184);
		TERMINAL_219.addFollower(TERMINAL_185);
		TERMINAL_219.addFollower(TERMINAL_186);
		TERMINAL_219.addFollower(TERMINAL_170);
		TERMINAL_219.addFollower(TERMINAL_164);
		TERMINAL_219.addFollower(TERMINAL_188);
		TERMINAL_219.addFollower(TERMINAL_189);
		TERMINAL_219.addFollower(TERMINAL_163);
		TERMINAL_217.addFollower(TERMINAL_220);
		TERMINAL_217.addFollower(TERMINAL_184);
		TERMINAL_217.addFollower(TERMINAL_185);
		TERMINAL_217.addFollower(TERMINAL_186);
		TERMINAL_217.addFollower(TERMINAL_170);
		TERMINAL_217.addFollower(TERMINAL_164);
		TERMINAL_217.addFollower(TERMINAL_188);
		TERMINAL_217.addFollower(TERMINAL_189);
		TERMINAL_217.addFollower(TERMINAL_163);
		TERMINAL_220.addFollower(TERMINAL_221);
		TERMINAL_221.addFollower(TERMINAL_222);
		TERMINAL_222.addFollower(TERMINAL_223);
		TERMINAL_223.addFollower(TERMINAL_224);
		TERMINAL_224.addFollower(TERMINAL_184);
		TERMINAL_224.addFollower(TERMINAL_185);
		TERMINAL_224.addFollower(TERMINAL_186);
		TERMINAL_224.addFollower(TERMINAL_170);
		TERMINAL_224.addFollower(TERMINAL_164);
		TERMINAL_224.addFollower(TERMINAL_188);
		TERMINAL_224.addFollower(TERMINAL_189);
		TERMINAL_224.addFollower(TERMINAL_163);
		TERMINAL_184.addFollower(TERMINAL_225);
		TERMINAL_225.addFollower(TERMINAL_226);
		TERMINAL_226.addFollower(TERMINAL_184);
		TERMINAL_226.addFollower(TERMINAL_185);
		TERMINAL_226.addFollower(TERMINAL_186);
		TERMINAL_226.addFollower(TERMINAL_187);
		TERMINAL_226.addFollower(TERMINAL_170);
		TERMINAL_226.addFollower(TERMINAL_164);
		TERMINAL_226.addFollower(TERMINAL_188);
		TERMINAL_226.addFollower(TERMINAL_189);
		TERMINAL_226.addFollower(TERMINAL_163);
		TERMINAL_185.addFollower(TERMINAL_227);
		TERMINAL_227.addFollower(TERMINAL_228);
		TERMINAL_227.addFollower(TERMINAL_229);
		TERMINAL_227.addFollower(TERMINAL_184);
		TERMINAL_227.addFollower(TERMINAL_185);
		TERMINAL_227.addFollower(TERMINAL_186);
		TERMINAL_227.addFollower(TERMINAL_187);
		TERMINAL_227.addFollower(TERMINAL_170);
		TERMINAL_227.addFollower(TERMINAL_164);
		TERMINAL_227.addFollower(TERMINAL_188);
		TERMINAL_227.addFollower(TERMINAL_189);
		TERMINAL_227.addFollower(TERMINAL_163);
		TERMINAL_230.addFollower(TERMINAL_228);
		TERMINAL_230.addFollower(TERMINAL_229);
		TERMINAL_228.addFollower(TERMINAL_231);
		TERMINAL_231.addFollower(TERMINAL_232);
		TERMINAL_232.addFollower(TERMINAL_233);
		TERMINAL_233.addFollower(TERMINAL_234);
		TERMINAL_234.addFollower(TERMINAL_230);
		TERMINAL_234.addFollower(TERMINAL_184);
		TERMINAL_234.addFollower(TERMINAL_185);
		TERMINAL_234.addFollower(TERMINAL_186);
		TERMINAL_234.addFollower(TERMINAL_187);
		TERMINAL_234.addFollower(TERMINAL_170);
		TERMINAL_234.addFollower(TERMINAL_164);
		TERMINAL_234.addFollower(TERMINAL_188);
		TERMINAL_234.addFollower(TERMINAL_189);
		TERMINAL_234.addFollower(TERMINAL_163);
		TERMINAL_229.addFollower(TERMINAL_235);
		TERMINAL_235.addFollower(TERMINAL_236);
		TERMINAL_236.addFollower(TERMINAL_237);
		TERMINAL_237.addFollower(TERMINAL_238);
		TERMINAL_238.addFollower(TERMINAL_230);
		TERMINAL_238.addFollower(TERMINAL_184);
		TERMINAL_238.addFollower(TERMINAL_185);
		TERMINAL_238.addFollower(TERMINAL_186);
		TERMINAL_238.addFollower(TERMINAL_187);
		TERMINAL_238.addFollower(TERMINAL_170);
		TERMINAL_238.addFollower(TERMINAL_164);
		TERMINAL_238.addFollower(TERMINAL_188);
		TERMINAL_238.addFollower(TERMINAL_189);
		TERMINAL_238.addFollower(TERMINAL_163);
		TERMINAL_160.addFollower(TERMINAL_239);
		TERMINAL_160.addFollower(TERMINAL_240);
		TERMINAL_160.addFollower(TERMINAL_241);
		TERMINAL_160.addFollower(TERMINAL_242);
		TERMINAL_239.addFollower(TERMINAL_240);
		TERMINAL_239.addFollower(TERMINAL_241);
		TERMINAL_239.addFollower(TERMINAL_242);
		TERMINAL_240.addFollower(TERMINAL_243);
		TERMINAL_243.addFollower(TERMINAL_244);
		TERMINAL_244.addFollower(TERMINAL_241);
		TERMINAL_244.addFollower(TERMINAL_242);
		TERMINAL_241.addFollower(TERMINAL_245);
		TERMINAL_242.addFollower(TERMINAL_246);
		TERMINAL_242.addFollower(TERMINAL_247);
		TERMINAL_242.addFollower(TERMINAL_248);
		TERMINAL_242.addFollower(TERMINAL_249);
		TERMINAL_242.addFollower(TERMINAL_250);
		TERMINAL_250.addFollower(TERMINAL_158);
		TERMINAL_250.addFollower(TERMINAL_159);
		TERMINAL_250.addFollower(TERMINAL_160);
		TERMINAL_250.addFollower(TERMINAL_161);
		TERMINAL_250.addFollower(TERMINAL_162);
		TERMINAL_250.addFollower(TERMINAL_163);
		TERMINAL_161.addFollower(TERMINAL_251);
		TERMINAL_161.addFollower(TERMINAL_252);
		TERMINAL_161.addFollower(TERMINAL_253);
		TERMINAL_161.addFollower(TERMINAL_254);
		TERMINAL_251.addFollower(TERMINAL_252);
		TERMINAL_251.addFollower(TERMINAL_253);
		TERMINAL_251.addFollower(TERMINAL_254);
		TERMINAL_252.addFollower(TERMINAL_255);
		TERMINAL_255.addFollower(TERMINAL_256);
		TERMINAL_256.addFollower(TERMINAL_253);
		TERMINAL_256.addFollower(TERMINAL_254);
		TERMINAL_253.addFollower(TERMINAL_245);
		TERMINAL_254.addFollower(TERMINAL_246);
		TERMINAL_254.addFollower(TERMINAL_247);
		TERMINAL_254.addFollower(TERMINAL_248);
		TERMINAL_254.addFollower(TERMINAL_249);
		TERMINAL_254.addFollower(TERMINAL_257);
		TERMINAL_257.addFollower(TERMINAL_158);
		TERMINAL_257.addFollower(TERMINAL_159);
		TERMINAL_257.addFollower(TERMINAL_160);
		TERMINAL_257.addFollower(TERMINAL_161);
		TERMINAL_257.addFollower(TERMINAL_162);
		TERMINAL_257.addFollower(TERMINAL_163);
		TERMINAL_258.addFollower(TERMINAL_259);
		TERMINAL_258.addFollower(TERMINAL_260);
		TERMINAL_258.addFollower(TERMINAL_261);
		TERMINAL_259.addFollower(TERMINAL_260);
		TERMINAL_259.addFollower(TERMINAL_261);
		TERMINAL_260.addFollower(TERMINAL_262);
		TERMINAL_262.addFollower(TERMINAL_263);
		TERMINAL_263.addFollower(TERMINAL_261);
		TERMINAL_261.addFollower(TERMINAL_264);
		TERMINAL_261.addFollower(TERMINAL_265);
		TERMINAL_261.addFollower(TERMINAL_266);
		TERMINAL_261.addFollower(TERMINAL_267);
		TERMINAL_266.addFollower(TERMINAL_264);
		TERMINAL_266.addFollower(TERMINAL_265);
		TERMINAL_267.addFollower(TERMINAL_268);
		TERMINAL_267.addFollower(TERMINAL_269);
		TERMINAL_267.addFollower(TERMINAL_258);
		TERMINAL_267.addFollower(TERMINAL_270);
		TERMINAL_267.addFollower(TERMINAL_271);
		TERMINAL_267.addFollower(TERMINAL_163);
		TERMINAL_268.addFollower(TERMINAL_264);
		TERMINAL_268.addFollower(TERMINAL_265);
		TERMINAL_269.addFollower(TERMINAL_264);
		TERMINAL_269.addFollower(TERMINAL_265);
		TERMINAL_264.addFollower(TERMINAL_272);
		TERMINAL_264.addFollower(TERMINAL_273);
		TERMINAL_264.addFollower(TERMINAL_266);
		TERMINAL_264.addFollower(TERMINAL_267);
		TERMINAL_264.addFollower(TERMINAL_163);
		TERMINAL_265.addFollower(TERMINAL_272);
		TERMINAL_265.addFollower(TERMINAL_273);
		TERMINAL_265.addFollower(TERMINAL_266);
		TERMINAL_265.addFollower(TERMINAL_267);
		TERMINAL_265.addFollower(TERMINAL_163);
		TERMINAL_272.addFollower(TERMINAL_273);
		TERMINAL_272.addFollower(TERMINAL_266);
		TERMINAL_272.addFollower(TERMINAL_267);
		TERMINAL_272.addFollower(TERMINAL_163);
		TERMINAL_273.addFollower(TERMINAL_274);
		TERMINAL_274.addFollower(TERMINAL_275);
		TERMINAL_275.addFollower(TERMINAL_266);
		TERMINAL_275.addFollower(TERMINAL_267);
		TERMINAL_275.addFollower(TERMINAL_163);
		TERMINAL_158.addFollower(TERMINAL_276);
		TERMINAL_276.addFollower(TERMINAL_277);
		TERMINAL_276.addFollower(TERMINAL_278);
		TERMINAL_276.addFollower(TERMINAL_279);
		TERMINAL_277.addFollower(TERMINAL_278);
		TERMINAL_277.addFollower(TERMINAL_279);
		TERMINAL_278.addFollower(TERMINAL_280);
		TERMINAL_280.addFollower(TERMINAL_281);
		TERMINAL_281.addFollower(TERMINAL_279);
		TERMINAL_279.addFollower(TERMINAL_258);
		TERMINAL_279.addFollower(TERMINAL_270);
		TERMINAL_270.addFollower(TERMINAL_158);
		TERMINAL_270.addFollower(TERMINAL_159);
		TERMINAL_270.addFollower(TERMINAL_160);
		TERMINAL_270.addFollower(TERMINAL_161);
		TERMINAL_270.addFollower(TERMINAL_162);
		TERMINAL_270.addFollower(TERMINAL_163);
		TERMINAL_159.addFollower(TERMINAL_282);
		TERMINAL_282.addFollower(TERMINAL_283);
		TERMINAL_282.addFollower(TERMINAL_284);
		TERMINAL_282.addFollower(TERMINAL_285);
		TERMINAL_283.addFollower(TERMINAL_284);
		TERMINAL_283.addFollower(TERMINAL_285);
		TERMINAL_284.addFollower(TERMINAL_286);
		TERMINAL_286.addFollower(TERMINAL_287);
		TERMINAL_287.addFollower(TERMINAL_285);
		TERMINAL_285.addFollower(TERMINAL_258);
		TERMINAL_285.addFollower(TERMINAL_271);
		TERMINAL_271.addFollower(TERMINAL_158);
		TERMINAL_271.addFollower(TERMINAL_159);
		TERMINAL_271.addFollower(TERMINAL_160);
		TERMINAL_271.addFollower(TERMINAL_161);
		TERMINAL_271.addFollower(TERMINAL_162);
		TERMINAL_271.addFollower(TERMINAL_163);
		TERMINAL_246.addFollower(TERMINAL_288);
		TERMINAL_246.addFollower(TERMINAL_289);
		TERMINAL_288.addFollower(TERMINAL_289);
		TERMINAL_289.addFollower(TERMINAL_290);
		TERMINAL_289.addFollower(TERMINAL_291);
		TERMINAL_289.addFollower(TERMINAL_292);
		TERMINAL_290.addFollower(TERMINAL_291);
		TERMINAL_290.addFollower(TERMINAL_292);
		TERMINAL_291.addFollower(TERMINAL_293);
		TERMINAL_293.addFollower(TERMINAL_294);
		TERMINAL_294.addFollower(TERMINAL_292);
		TERMINAL_292.addFollower(TERMINAL_295);
		TERMINAL_292.addFollower(TERMINAL_296);
		TERMINAL_292.addFollower(TERMINAL_297);
		TERMINAL_292.addFollower(TERMINAL_246);
		TERMINAL_292.addFollower(TERMINAL_247);
		TERMINAL_292.addFollower(TERMINAL_248);
		TERMINAL_292.addFollower(TERMINAL_249);
		TERMINAL_292.addFollower(TERMINAL_250);
		TERMINAL_292.addFollower(TERMINAL_257);
		TERMINAL_292.addFollower(TERMINAL_163);
		TERMINAL_295.addFollower(TERMINAL_297);
		TERMINAL_295.addFollower(TERMINAL_246);
		TERMINAL_295.addFollower(TERMINAL_247);
		TERMINAL_295.addFollower(TERMINAL_248);
		TERMINAL_295.addFollower(TERMINAL_249);
		TERMINAL_295.addFollower(TERMINAL_250);
		TERMINAL_295.addFollower(TERMINAL_257);
		TERMINAL_295.addFollower(TERMINAL_163);
		TERMINAL_296.addFollower(TERMINAL_297);
		TERMINAL_296.addFollower(TERMINAL_246);
		TERMINAL_296.addFollower(TERMINAL_247);
		TERMINAL_296.addFollower(TERMINAL_248);
		TERMINAL_296.addFollower(TERMINAL_249);
		TERMINAL_296.addFollower(TERMINAL_250);
		TERMINAL_296.addFollower(TERMINAL_257);
		TERMINAL_296.addFollower(TERMINAL_163);
		TERMINAL_297.addFollower(TERMINAL_298);
		TERMINAL_298.addFollower(TERMINAL_299);
		TERMINAL_299.addFollower(TERMINAL_300);
		TERMINAL_300.addFollower(TERMINAL_301);
		TERMINAL_301.addFollower(TERMINAL_246);
		TERMINAL_301.addFollower(TERMINAL_247);
		TERMINAL_301.addFollower(TERMINAL_248);
		TERMINAL_301.addFollower(TERMINAL_249);
		TERMINAL_301.addFollower(TERMINAL_250);
		TERMINAL_301.addFollower(TERMINAL_257);
		TERMINAL_301.addFollower(TERMINAL_163);
		TERMINAL_182.addFollower(TERMINAL_302);
		TERMINAL_302.addFollower(TERMINAL_303);
		TERMINAL_303.addFollower(TERMINAL_304);
		TERMINAL_304.addFollower(TERMINAL_305);
		TERMINAL_305.addFollower(TERMINAL_306);
		TERMINAL_306.addFollower(TERMINAL_307);
		TERMINAL_307.addFollower(TERMINAL_308);
		TERMINAL_308.addFollower(TERMINAL_309);
		TERMINAL_309.addFollower(TERMINAL_181);
		TERMINAL_309.addFollower(TERMINAL_200);
		TERMINAL_309.addFollower(TERMINAL_163);
	}
	public static void wire3() {
		TERMINAL_183.addFollower(TERMINAL_310);
		TERMINAL_310.addFollower(TERMINAL_311);
		TERMINAL_311.addFollower(TERMINAL_181);
		TERMINAL_311.addFollower(TERMINAL_200);
		TERMINAL_311.addFollower(TERMINAL_163);
		TERMINAL_245.addFollower(TERMINAL_242);
		TERMINAL_245.addFollower(TERMINAL_254);
		TERMINAL_245.addFollower(TERMINAL_163);
		TERMINAL_248.addFollower(TERMINAL_312);
		TERMINAL_248.addFollower(TERMINAL_313);
		TERMINAL_248.addFollower(TERMINAL_314);
		TERMINAL_312.addFollower(TERMINAL_313);
		TERMINAL_312.addFollower(TERMINAL_314);
		TERMINAL_313.addFollower(TERMINAL_315);
		TERMINAL_315.addFollower(TERMINAL_316);
		TERMINAL_316.addFollower(TERMINAL_314);
		TERMINAL_314.addFollower(TERMINAL_317);
		TERMINAL_314.addFollower(TERMINAL_318);
		TERMINAL_317.addFollower(TERMINAL_319);
		TERMINAL_317.addFollower(TERMINAL_246);
		TERMINAL_317.addFollower(TERMINAL_247);
		TERMINAL_317.addFollower(TERMINAL_248);
		TERMINAL_317.addFollower(TERMINAL_249);
		TERMINAL_317.addFollower(TERMINAL_250);
		TERMINAL_317.addFollower(TERMINAL_257);
		TERMINAL_317.addFollower(TERMINAL_163);
		TERMINAL_318.addFollower(TERMINAL_319);
		TERMINAL_318.addFollower(TERMINAL_246);
		TERMINAL_318.addFollower(TERMINAL_247);
		TERMINAL_318.addFollower(TERMINAL_248);
		TERMINAL_318.addFollower(TERMINAL_249);
		TERMINAL_318.addFollower(TERMINAL_250);
		TERMINAL_318.addFollower(TERMINAL_257);
		TERMINAL_318.addFollower(TERMINAL_163);
		TERMINAL_319.addFollower(TERMINAL_320);
		TERMINAL_320.addFollower(TERMINAL_246);
		TERMINAL_320.addFollower(TERMINAL_247);
		TERMINAL_320.addFollower(TERMINAL_248);
		TERMINAL_320.addFollower(TERMINAL_249);
		TERMINAL_320.addFollower(TERMINAL_250);
		TERMINAL_320.addFollower(TERMINAL_257);
		TERMINAL_320.addFollower(TERMINAL_163);
		TERMINAL_249.addFollower(TERMINAL_321);
		TERMINAL_249.addFollower(TERMINAL_322);
		TERMINAL_249.addFollower(TERMINAL_323);
		TERMINAL_321.addFollower(TERMINAL_322);
		TERMINAL_321.addFollower(TERMINAL_323);
		TERMINAL_322.addFollower(TERMINAL_324);
		TERMINAL_324.addFollower(TERMINAL_325);
		TERMINAL_325.addFollower(TERMINAL_323);
		TERMINAL_323.addFollower(TERMINAL_326);
		TERMINAL_326.addFollower(TERMINAL_327);
		TERMINAL_326.addFollower(TERMINAL_328);
		TERMINAL_327.addFollower(TERMINAL_329);
		TERMINAL_328.addFollower(TERMINAL_329);
		TERMINAL_329.addFollower(TERMINAL_330);
		TERMINAL_329.addFollower(TERMINAL_331);
		TERMINAL_330.addFollower(TERMINAL_332);
		TERMINAL_331.addFollower(TERMINAL_332);
		TERMINAL_332.addFollower(TERMINAL_333);
		TERMINAL_332.addFollower(TERMINAL_246);
		TERMINAL_332.addFollower(TERMINAL_247);
		TERMINAL_332.addFollower(TERMINAL_248);
		TERMINAL_332.addFollower(TERMINAL_249);
		TERMINAL_332.addFollower(TERMINAL_250);
		TERMINAL_332.addFollower(TERMINAL_257);
		TERMINAL_332.addFollower(TERMINAL_163);
		TERMINAL_333.addFollower(TERMINAL_334);
		TERMINAL_334.addFollower(TERMINAL_335);
		TERMINAL_334.addFollower(TERMINAL_336);
		TERMINAL_336.addFollower(TERMINAL_246);
		TERMINAL_336.addFollower(TERMINAL_247);
		TERMINAL_336.addFollower(TERMINAL_248);
		TERMINAL_336.addFollower(TERMINAL_249);
		TERMINAL_336.addFollower(TERMINAL_250);
		TERMINAL_336.addFollower(TERMINAL_257);
		TERMINAL_336.addFollower(TERMINAL_163);
		TERMINAL_335.addFollower(TERMINAL_337);
		TERMINAL_337.addFollower(TERMINAL_338);
		TERMINAL_337.addFollower(TERMINAL_339);
		TERMINAL_338.addFollower(TERMINAL_340);
		TERMINAL_340.addFollower(TERMINAL_339);
		TERMINAL_339.addFollower(TERMINAL_335);
		TERMINAL_339.addFollower(TERMINAL_336);
		TERMINAL_339.addFollower(TERMINAL_163);
		TERMINAL_341.addFollower(TERMINAL_342);
		TERMINAL_341.addFollower(TERMINAL_343);
		TERMINAL_341.addFollower(TERMINAL_163);
		TERMINAL_247.addFollower(TERMINAL_344);
		TERMINAL_344.addFollower(TERMINAL_345);
		TERMINAL_344.addFollower(TERMINAL_346);
		TERMINAL_344.addFollower(TERMINAL_347);
		TERMINAL_345.addFollower(TERMINAL_346);
		TERMINAL_345.addFollower(TERMINAL_347);
		TERMINAL_346.addFollower(TERMINAL_348);
		TERMINAL_348.addFollower(TERMINAL_349);
		TERMINAL_349.addFollower(TERMINAL_347);
		TERMINAL_347.addFollower(TERMINAL_350);
		TERMINAL_347.addFollower(TERMINAL_351);
		TERMINAL_350.addFollower(TERMINAL_352);
		TERMINAL_351.addFollower(TERMINAL_352);
		TERMINAL_352.addFollower(TERMINAL_341);
		TERMINAL_342.addFollower(TERMINAL_341);
		TERMINAL_343.addFollower(TERMINAL_246);
		TERMINAL_343.addFollower(TERMINAL_247);
		TERMINAL_343.addFollower(TERMINAL_248);
		TERMINAL_343.addFollower(TERMINAL_249);
		TERMINAL_343.addFollower(TERMINAL_250);
		TERMINAL_343.addFollower(TERMINAL_257);
		TERMINAL_343.addFollower(TERMINAL_163);
		TERMINAL_14.addFollower(TERMINAL_353);
		TERMINAL_353.addFollower(TERMINAL_354);
		TERMINAL_354.addFollower(TERMINAL_15);
		TERMINAL_15.addFollower(TERMINAL_19);
		TERMINAL_355.addFollower(TERMINAL_356);
		TERMINAL_356.addFollower(TERMINAL_357);
		TERMINAL_357.addFollower(TERMINAL_19);
		TERMINAL_19.addFollower(TERMINAL_358);
		TERMINAL_358.addFollower(TERMINAL_151);
		TERMINAL_358.addFollower(TERMINAL_157);
		TERMINAL_358.addFollower(TERMINAL_158);
		TERMINAL_358.addFollower(TERMINAL_159);
		TERMINAL_358.addFollower(TERMINAL_160);
		TERMINAL_358.addFollower(TERMINAL_161);
		TERMINAL_358.addFollower(TERMINAL_162);
		TERMINAL_358.addFollower(TERMINAL_170);
		TERMINAL_358.addFollower(TERMINAL_164);
		TERMINAL_358.addFollower(TERMINAL_186);
		TERMINAL_358.addFollower(TERMINAL_188);
		TERMINAL_358.addFollower(TERMINAL_184);
		TERMINAL_358.addFollower(TERMINAL_185);
		TERMINAL_358.addFollower(TERMINAL_228);
		TERMINAL_358.addFollower(TERMINAL_229);
		TERMINAL_358.addFollower(TERMINAL_258);
		TERMINAL_358.addFollower(TERMINAL_264);
		TERMINAL_358.addFollower(TERMINAL_265);
		TERMINAL_358.addFollower(TERMINAL_246);
		TERMINAL_358.addFollower(TERMINAL_182);
		TERMINAL_358.addFollower(TERMINAL_183);
		TERMINAL_358.addFollower(TERMINAL_245);
		TERMINAL_358.addFollower(TERMINAL_248);
		TERMINAL_358.addFollower(TERMINAL_249);
		TERMINAL_358.addFollower(TERMINAL_335);
		TERMINAL_358.addFollower(TERMINAL_341);
		TERMINAL_358.addFollower(TERMINAL_247);
		TERMINAL_358.addFollower(TERMINAL_163);
		TERMINAL_163.addFollower(TERMINAL_359);
		TERMINAL_163.addFollower(TERMINAL_20);
		TERMINAL_163.addFollower(TERMINAL_355);
		TERMINAL_359.addFollower(TERMINAL_360);
		TERMINAL_360.addFollower(TERMINAL_361);
		TERMINAL_362.addFollower(TERMINAL_361);
		TERMINAL_363.addFollower(TERMINAL_20);
		TERMINAL_363.addFollower(TERMINAL_355);
		TERMINAL_13.addFollower(TERMINAL_364);
		TERMINAL_364.addFollower(TERMINAL_365);
		TERMINAL_365.addFollower(TERMINAL_366);
		TERMINAL_366.addFollower(TERMINAL_367);
		TERMINAL_367.addFollower(TERMINAL_368);
		TERMINAL_368.addFollower(TERMINAL_369);
		TERMINAL_369.addFollower(TERMINAL_14);
		TERMINAL_369.addFollower(TERMINAL_15);
		TERMINAL_361.addFollower(TERMINAL_370);
		TERMINAL_370.addFollower(TERMINAL_371);
		TERMINAL_371.addFollower(TERMINAL_372);
		TERMINAL_372.addFollower(TERMINAL_362);
		TERMINAL_372.addFollower(TERMINAL_363);
	}
	// wire the terminals
	static {
		wire0();
		wire1();
		wire2();
		wire3();
	}
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_org_smartadapters_core_Adapter{ element = c0; }
	)
	EOF	
;

parse_org_smartadapters_core_Adapter returns [org.smartadapters.core.Adapter element = null]
@init{
}
:
	a0 = 'Adapter' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_1, 1));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_2, 2));
	}
	
	a2 = ';' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_3, 3));
	}
	
	(
		a3_0 = parse_org_smartadapters_core_Aspect		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__ASPECT), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 4));
	}
	
	a4 = 'protocol' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_5, 5));
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 6));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 6));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 6));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 6));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 6));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 6));
	}
	
	(
		(
			(
				a6_0 = parse_org_smartadapters_core_Adaptation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, org.smartadapters.core.CorePackage.ADAPTER__ADAPT, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 7));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 7));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 7));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 7));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 7));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 7));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 8));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 8));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 8));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 8));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 8));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 8));
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_org_smartadapters_core_Aspect returns [org.smartadapters.core.Aspect element = null]
@init{
}
:
	a0 = 'pointcut' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_12, 10));
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_13, 11));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_14, 11));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 11));
	}
	
	(
		a2_0 = parse_patternframework_ModelPattern		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__TEMPLATE), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_16, 12));
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_17, 13));
	}
	
	a4 = 'advice' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_18, 14));
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_19, 15));
	}
	
	(
		(
			a6_0 = parse_patternframework_PModel			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
				}
				if (a6_0 != null) {
					if (a6_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__STRUCTURE), a6_0);
						completedElement(a6_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a6_0, element); 				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_20, 16));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_20, 17));
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_21, 18));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 18));
	}
	
	(
		(
			a8 = 'unique elements' {
				if (element == null) {
					element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_22, 19));
			}
			
			a9 = ':' {
				if (element == null) {
					element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_23, 20));
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
					}
					if (a10 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.Aspect, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.CorePackage.ASPECT__PERSISTENT, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_24, 21));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 21));
			}
			
			(
				(
					a11 = ',' {
						if (element == null) {
							element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_25, 22));
					}
					
					(
						a12 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
							}
							if (a12 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.Aspect, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.CorePackage.ASPECT__PERSISTENT, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_24, 23));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 23));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_24, 24));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 24));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_4, 25));
	}
	
;

parse_org_smartadapters_core_adaptations_SetruntimeSystem returns [org.smartadapters.core.adaptations.SetruntimeSystem element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_26, 26));
	}
	
	a1 = 'system' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_27, 27));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.System proxy = pattern.art.ArtFactory.eINSTANCE.createSystem();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.System>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemSystemToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_28, 28));
	}
	
	a3 = '{' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 29));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 29));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 29));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 29));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 29));
	}
	
	(
		(
			a4 = 'root' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_34, 30));
			}
			
			a5 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_35, 31));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefrootReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 32));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 32));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 32));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 32));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 32));
			}
			
			
			|			a7 = 'services' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_36, 33));
			}
			
			a8 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_37, 34));
			}
			
			(
				a9 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_38, 35));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 35));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 35));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 35));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 35));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 35));
			}
			
			(
				(
					a10 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_39, 36));
					}
					
					(
						a11 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a11 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_38, 37));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 37));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 37));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 37));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 37));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 37));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_38, 38));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 38));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 38));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 38));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 38));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 38));
			}
			
			
			|			a12 = 'types' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_40, 39));
			}
			
			a13 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_41, 40));
			}
			
			(
				a14 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a14 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a14).getLine(), ((org.antlr.runtime.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a14).getStartIndex(), ((org.antlr.runtime.CommonToken) a14).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a14, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a14, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_42, 41));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 41));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 41));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 41));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 41));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 41));
			}
			
			(
				(
					a15 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_43, 42));
					}
					
					(
						a16 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a16 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a16).getLine(), ((org.antlr.runtime.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a16).getStartIndex(), ((org.antlr.runtime.CommonToken) a16).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a16, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a16, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_42, 43));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 43));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 43));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 43));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 43));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 43));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_42, 44));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 44));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 44));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 44));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 44));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 44));
			}
			
			
			|			a17 = 'datatypes' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_44, 45));
			}
			
			a18 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_45, 46));
			}
			
			(
				a19 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a19 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a19).getLine(), ((org.antlr.runtime.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a19).getStartIndex(), ((org.antlr.runtime.CommonToken) a19).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a19, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a19, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_46, 47));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 47));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 47));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 47));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 47));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 47));
			}
			
			(
				(
					a20 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a20, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_47, 48));
					}
					
					(
						a21 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a21 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a21).getLine(), ((org.antlr.runtime.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a21).getStartIndex(), ((org.antlr.runtime.CommonToken) a21).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a21, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a21, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_46, 49));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 49));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 49));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 49));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 49));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 49));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_46, 50));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 50));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 50));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 50));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 50));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 50));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_29, 51));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_30, 51));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_31, 51));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_32, 51));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_33, 51));
	}
	
	a22 = '}' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 52));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 52));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 52));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 52));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 52));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 52));
	}
	
;

parse_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance returns [org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_48, 53));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_49, 54));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_50, 55));
	}
	
	a3 = '{' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 56));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 56));
	}
	
	(
		(
			a4 = 'type' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_58, 57));
			}
			
			a5 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_59, 58));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceReftypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 59));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 59));
			}
			
			
			|			a7 = 'state' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_60, 60));
			}
			
			a8 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_61, 61));
			}
			
			(
				a9 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 62));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 62));
			}
			
			
			|			a10 = 'super' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_62, 63));
			}
			
			a11 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_63, 64));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 65));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 65));
			}
			
			
			|			a13 = 'attribute' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_64, 66));
			}
			
			a14 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_65, 67));
			}
			
			(
				a15 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a15 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a15).getLine(), ((org.antlr.runtime.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a15).getStartIndex(), ((org.antlr.runtime.CommonToken) a15).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a15, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a15, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_66, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 68));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 68));
			}
			
			(
				(
					a16 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_67, 69));
					}
					
					(
						a17 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
							}
							if (a17 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a17).getLine(), ((org.antlr.runtime.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a17).getStartIndex(), ((org.antlr.runtime.CommonToken) a17).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a17, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a17, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_66, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 70));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 70));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_66, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 71));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 71));
			}
			
			
			|			a18 = 'binding' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_68, 72));
			}
			
			a19 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_69, 73));
			}
			
			(
				a20 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a20 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a20).getLine(), ((org.antlr.runtime.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a20).getStartIndex(), ((org.antlr.runtime.CommonToken) a20).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a20, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a20, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_70, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 74));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 74));
			}
			
			(
				(
					a21 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a21, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_71, 75));
					}
					
					(
						a22 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
							}
							if (a22 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a22).getLine(), ((org.antlr.runtime.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a22).getStartIndex(), ((org.antlr.runtime.CommonToken) a22).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a22, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a22, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_70, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 76));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 76));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_70, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 77));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 77));
			}
			
			
			|			a23 = 'name' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a23, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_72, 78));
			}
			
			a24 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a24, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_73, 79));
			}
			
			(
				a25 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a25 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a25.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a25).getLine(), ((org.antlr.runtime.CommonToken) a25).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a25).getStartIndex(), ((org.antlr.runtime.CommonToken) a25).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a25, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 80));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 80));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_51, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_52, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_53, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_54, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_55, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_56, 81));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_57, 81));
	}
	
	a26 = '}' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a26, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 82));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 82));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 82));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 82));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 82));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 82));
	}
	
;

parse_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance returns [org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_74, 83));
	}
	
	a1 = 'primitive' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_75, 84));
	}
	
	a2 = 'component' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_76, 85));
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.PrimitiveInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.PrimitiveInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_77, 86));
	}
	
	a4 = '{' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 87));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 87));
	}
	
	(
		(
			a5 = 'type' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_85, 88));
			}
			
			a6 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_86, 89));
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceReftypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 90));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 90));
			}
			
			
			|			a8 = 'state' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_87, 91));
			}
			
			a9 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_88, 92));
			}
			
			(
				a10 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a10 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 93));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 93));
			}
			
			
			|			a11 = 'super' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_89, 94));
			}
			
			a12 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_90, 95));
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a13 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a13).getLine(), ((org.antlr.runtime.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a13).getStartIndex(), ((org.antlr.runtime.CommonToken) a13).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a13, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a13, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 96));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 96));
			}
			
			
			|			a14 = 'attribute' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_91, 97));
			}
			
			a15 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_92, 98));
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a16 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a16).getLine(), ((org.antlr.runtime.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a16).getStartIndex(), ((org.antlr.runtime.CommonToken) a16).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a16, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a16, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_93, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 99));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 99));
			}
			
			(
				(
					a17 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a17, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_94, 100));
					}
					
					(
						a18 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
							}
							if (a18 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a18).getLine(), ((org.antlr.runtime.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a18).getStartIndex(), ((org.antlr.runtime.CommonToken) a18).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a18, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a18, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_93, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 101));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 101));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_93, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 102));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 102));
			}
			
			
			|			a19 = 'binding' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_95, 103));
			}
			
			a20 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a20, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_96, 104));
			}
			
			(
				a21 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a21 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a21).getLine(), ((org.antlr.runtime.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a21).getStartIndex(), ((org.antlr.runtime.CommonToken) a21).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a21, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a21, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_97, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 105));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 105));
			}
			
			(
				(
					a22 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a22, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_98, 106));
					}
					
					(
						a23 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
							}
							if (a23 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a23).getLine(), ((org.antlr.runtime.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a23).getStartIndex(), ((org.antlr.runtime.CommonToken) a23).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a23, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a23, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_97, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 107));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 107));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_97, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 108));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 108));
			}
			
			
			|			a24 = 'name' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a24, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_99, 109));
			}
			
			a25 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a25, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_100, 110));
			}
			
			(
				a26 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a26 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a26.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a26).getLine(), ((org.antlr.runtime.CommonToken) a26).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a26).getStartIndex(), ((org.antlr.runtime.CommonToken) a26).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a26, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 111));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 111));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_78, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_79, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_80, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_81, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_82, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_83, 112));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_84, 112));
	}
	
	a27 = '}' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a27, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 113));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 113));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 113));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 113));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 113));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 113));
	}
	
;

parse_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance returns [org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_101, 114));
	}
	
	a1 = 'composite' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_102, 115));
	}
	
	a2 = 'component' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_103, 116));
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_104, 117));
	}
	
	a4 = '{' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 118));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 118));
	}
	
	(
		(
			a5 = 'component' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_113, 119));
			}
			
			a6 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_114, 120));
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_115, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 121));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 121));
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_116, 122));
					}
					
					(
						a9 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a9 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_115, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 123));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 123));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_115, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 124));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 124));
			}
			
			
			|			a10 = 'delegation' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_117, 125));
			}
			
			a11 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_118, 126));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.DelegationBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.DelegationBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_119, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 127));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 127));
			}
			
			(
				(
					a13 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_120, 128));
					}
					
					(
						a14 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a14 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a14).getLine(), ((org.antlr.runtime.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a14).getStartIndex(), ((org.antlr.runtime.CommonToken) a14).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.DelegationBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.DelegationBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a14, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a14, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_119, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 129));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 129));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_119, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 130));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 130));
			}
			
			
			|			a15 = 'state' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_121, 131));
			}
			
			a16 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_122, 132));
			}
			
			(
				a17 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a17 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a17).getLine(), ((org.antlr.runtime.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a17).getStartIndex(), ((org.antlr.runtime.CommonToken) a17).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a17, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 133));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 133));
			}
			
			
			|			a18 = 'super' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_123, 134));
			}
			
			a19 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_124, 135));
			}
			
			(
				a20 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a20 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a20).getLine(), ((org.antlr.runtime.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a20).getStartIndex(), ((org.antlr.runtime.CommonToken) a20).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a20, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a20, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 136));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 136));
			}
			
			
			|			a21 = 'attribute' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a21, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_125, 137));
			}
			
			a22 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a22, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_126, 138));
			}
			
			(
				a23 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a23 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a23).getLine(), ((org.antlr.runtime.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a23).getStartIndex(), ((org.antlr.runtime.CommonToken) a23).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a23, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a23, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_127, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 139));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 139));
			}
			
			(
				(
					a24 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a24, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_128, 140));
					}
					
					(
						a25 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a25 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a25.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a25).getLine(), ((org.antlr.runtime.CommonToken) a25).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a25).getStartIndex(), ((org.antlr.runtime.CommonToken) a25).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a25, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a25, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_127, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 141));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 141));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_127, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 142));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 142));
			}
			
			
			|			a26 = 'binding' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a26, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_129, 143));
			}
			
			a27 = '+=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a27, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_130, 144));
			}
			
			(
				a28 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a28 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a28.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a28).getLine(), ((org.antlr.runtime.CommonToken) a28).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a28).getStartIndex(), ((org.antlr.runtime.CommonToken) a28).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING, proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a28, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a28, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_131, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 145));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 145));
			}
			
			(
				(
					a29 = ',' {
						if (element == null) {
							element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a29, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_132, 146));
					}
					
					(
						a30 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a30 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a30.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a30).getLine(), ((org.antlr.runtime.CommonToken) a30).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a30).getStartIndex(), ((org.antlr.runtime.CommonToken) a30).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), resolved, proxy);
								if (proxy != null) {
									addObjectToList(element, org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING, proxy);
									completedElement(proxy);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a30, element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a30, proxy);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_131, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 147));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 147));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_131, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 148));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 148));
			}
			
			
			|			a31 = 'name' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a31, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_133, 149));
			}
			
			a32 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a32, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_134, 150));
			}
			
			(
				a33 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a33 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a33.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a33).getLine(), ((org.antlr.runtime.CommonToken) a33).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a33).getStartIndex(), ((org.antlr.runtime.CommonToken) a33).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a33, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 151));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 151));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_105, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_106, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_107, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_108, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_109, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_110, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_111, 152));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_112, 152));
	}
	
	a34 = '}' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a34, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 153));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 153));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 153));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 153));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 153));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 153));
	}
	
;

parse_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding returns [org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding element = null]
@init{
}
:
	a0 = 'set' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_135, 154));
	}
	
	a1 = 'binding' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_136, 155));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_137, 156));
	}
	
	a3 = '{' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 157));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 157));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 157));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 157));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 157));
	}
	
	(
		(
			a4 = 'requiredPort' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_143, 158));
			}
			
			a5 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_144, 159));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefclientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 160));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 160));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 160));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 160));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 160));
			}
			
			
			|			a7 = 'providedPort' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_145, 161));
			}
			
			a8 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_146, 162));
			}
			
			(
				a9 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 163));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 163));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 163));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 163));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 163));
			}
			
			
			|			a10 = 'server' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_147, 164));
			}
			
			a11 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_148, 165));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 166));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 166));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 166));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 166));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 166));
			}
			
			
			|			a13 = 'id' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_149, 167));
			}
			
			a14 = '=' {
				if (element == null) {
					element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_150, 168));
			}
			
			(
				a15 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a15 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a15).getLine(), ((org.antlr.runtime.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a15).getStartIndex(), ((org.antlr.runtime.CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 169));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 169));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 169));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 169));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 169));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_138, 170));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_139, 170));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_140, 170));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_141, 170));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_142, 170));
	}
	
	a16 = '}' {
		if (element == null) {
			element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_6, 171));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_7, 171));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_8, 171));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_9, 171));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_10, 171));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_11, 171));
	}
	
;

parse_pattern_art_System returns [pattern.art.System element = null]
@init{
}
:
	(
		(
			a0 = 'system' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_152, 172));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_153, 172));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_154, 172));
			}
			
			(
				(
					(
						a1 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = pattern.art.ArtFactory.eINSTANCE.createSystem();
							}
							if (a1 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String)resolvedObject;
								if (resolved != null) {
									element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME), resolved);
									completedElement(resolved);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_153, 173));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_154, 173));
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_153, 174));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_154, 174));
			}
			
			(
				(
					a2 = '<' {
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_155, 175));
					}
					
					(
						a3 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = pattern.art.ArtFactory.eINSTANCE.createSystem();
							}
							if (a3 != null) {
								org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String)resolvedObject;
								if (resolved != null) {
									element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), resolved);
									completedElement(resolved);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_156, 176));
					}
					
					a4 = '>' {
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_154, 177));
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_154, 178));
			}
			
			a5 = ';' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_157, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 179));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 179));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_157, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 180));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 180));
	}
	
	(
		(
			a6 = 'root' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 181));
			}
			
			(
				a7_0 = parse_pattern_art_instance_CompositeInstance				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createSystem();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__ROOT), a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 182));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 182));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 182));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 182));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 182));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 182));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 183));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 183));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 183));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 183));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 183));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 183));
	}
	
	(
		(
			(
				(
					a8_0 = parse_pattern_art_type_Service					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__SERVICES, a8_0);
								completedElement(a8_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a8_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 184));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 184));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 184));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 184));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 184));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 184));
				}
				
				
				|				(
					a9_0 = parse_pattern_art_type_ComponentType					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a9_0 != null) {
							if (a9_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__TYPES, a9_0);
								completedElement(a9_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a9_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 185));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 185));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 185));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 185));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 185));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 185));
				}
				
				
				|				(
					a10_0 = parse_pattern_art_DataType					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a10_0 != null) {
							if (a10_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__DATA_TYPES, a10_0);
								completedElement(a10_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a10_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 186));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 186));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 186));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 186));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 186));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 186));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 187));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 187));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 187));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 187));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 187));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 187));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 188));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 188));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 188));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 188));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 188));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 188));
	}
	
;

parse_pattern_art_DataType returns [pattern.art.DataType element = null]
@init{
}
:
	a0 = 'datatype' {
		if (element == null) {
			element = pattern.art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_165, 189));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_166, 189));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_167, 189));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createDataType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_166, 190));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_167, 190));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_166, 191));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_167, 191));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createDataType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_168, 192));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createDataType();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_169, 193));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createDataType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_167, 194));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_167, 195));
	}
	
	a5 = ';' {
		if (element == null) {
			element = pattern.art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 196));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 196));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 196));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 196));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 196));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 196));
	}
	
;

parse_pattern_art_instance_PrimitiveInstance returns [pattern.art.instance.PrimitiveInstance element = null]
@init{
}
:
	a0 = 'primitive' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_171, 197));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_172, 198));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_173, 198));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_174, 198));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_173, 199));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_174, 199));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_173, 200));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_174, 200));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_175, 201));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_176, 202));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_174, 203));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_174, 204));
	}
	
	a6 = ':' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_177, 205));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_178, 205));
	}
	
	(
		(
			a7 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				if (a7 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.ComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_179, 206));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_180, 206));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 206));
		}
		
		
		|		a8 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_179, 207));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_180, 207));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 207));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_179, 208));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_180, 208));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 208));
	}
	
	(
		(
			(
				a9 = T_INSTANCE_STATE				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_180, 209));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 209));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_180, 210));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 210));
	}
	
	(
		(
			a10 = 'implementation' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_182, 211));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_183, 211));
			}
			
			(
				a11_0 = parse_pattern_art_implem_ComponentImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM), a11_0);
							completedElement(a11_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a11_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 212));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 213));
	}
	
	a12 = '{' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 214));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 214));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 214));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 214));
	}
	
	(
		(
			(
				(
					a13_0 = parse_pattern_art_instance_AttributeInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
						}
						if (a13_0 != null) {
							if (a13_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE, a13_0);
								completedElement(a13_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a13_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 215));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 215));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 215));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 215));
				}
				
				
				|				(
					a14_0 = parse_pattern_art_instance_TransmissionBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
						}
						if (a14_0 != null) {
							if (a14_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING, a14_0);
								completedElement(a14_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a14_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 216));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 216));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 216));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 216));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 217));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 217));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 217));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 217));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 218));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 218));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 218));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 218));
	}
	
	a15 = '}' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 219));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 219));
	}
	
;

parse_pattern_art_instance_CompositeInstance returns [pattern.art.instance.CompositeInstance element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_190, 220));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_191, 221));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_192, 221));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_193, 221));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_192, 222));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_193, 222));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_192, 223));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_193, 223));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_194, 224));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_195, 225));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_193, 226));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_193, 227));
	}
	
	a6 = ':' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_196, 228));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_197, 228));
	}
	
	(
		(
			a7 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				if (a7 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.ComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_198, 229));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_199, 229));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 229));
		}
		
		
		|		a8 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_198, 230));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_199, 230));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 230));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_198, 231));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_199, 231));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 231));
	}
	
	(
		(
			(
				a9 = T_INSTANCE_STATE				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_199, 232));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 232));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_199, 233));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 233));
	}
	
	(
		(
			a10 = 'implementation' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_182, 234));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_183, 234));
			}
			
			(
				a11_0 = parse_pattern_art_implem_ComponentImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM), a11_0);
							completedElement(a11_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a11_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 235));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 236));
	}
	
	a12 = '{' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 237));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 237));
	}
	
	(
		(
			(
				(
					a13_0 = parse_pattern_art_instance_AttributeInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a13_0 != null) {
							if (a13_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE, a13_0);
								completedElement(a13_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a13_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 238));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 238));
				}
				
				
				|				(
					a14_0 = parse_pattern_art_instance_TransmissionBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a14_0 != null) {
							if (a14_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING, a14_0);
								completedElement(a14_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a14_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 239));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 239));
				}
				
				
				|				(
					a15_0 = parse_pattern_art_instance_ComponentInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a15_0 != null) {
							if (a15_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, a15_0);
								completedElement(a15_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a15_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 240));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 240));
				}
				
				
				|				(
					a16_0 = parse_pattern_art_instance_DelegationBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a16_0 != null) {
							if (a16_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION, a16_0);
								completedElement(a16_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a16_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 241));
					addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 241));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 242));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 242));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 243));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 243));
	}
	
	a17 = '}' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 244));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 244));
	}
	
;

parse_pattern_art_instance_TransmissionBinding returns [pattern.art.instance.TransmissionBinding element = null]
@init{
}
:
	a0 = 'bind' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_201, 245));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_202, 245));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a1 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_203, 246));
		}
		
		
		|		a2 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_203, 247));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_203, 248));
	}
	
	a3 = 'to' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_204, 249));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_205, 249));
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a4 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_206, 250));
		}
		
		a5 = '::' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_207, 251));
		}
		
		(
			a6 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a6 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_208, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 252));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 252));
		}
		
		
		|		a7 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_208, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 253));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 253));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_208, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 254));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 254));
	}
	
	(
		(
			a8 = '(' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_209, 255));
			}
			
			a9 = 'id' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_210, 256));
			}
			
			a10 = '=' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_211, 257));
			}
			
			(
				a11 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					}
					if (a11 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_212, 258));
			}
			
			a12 = ')' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 259));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 259));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 260));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 260));
	}
	
;

parse_pattern_art_instance_DelegationBinding returns [pattern.art.instance.DelegationBinding element = null]
@init{
}
:
	a0 = 'delegate' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_213, 261));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_214, 261));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a1 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.DelegationBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_215, 262));
		}
		
		
		|		a2 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_215, 263));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_215, 264));
	}
	
	a3 = 'to' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_216, 265));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_217, 265));
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a4 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_218, 266));
		}
		
		a5 = '::' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_219, 267));
		}
		
		(
			a6 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a6 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.DelegationBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_220, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 268));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 268));
		}
		
		
		|		a7 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_220, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 269));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 269));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_220, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 270));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 270));
	}
	
	(
		(
			a8 = '(' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_221, 271));
			}
			
			a9 = 'id' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_222, 272));
			}
			
			a10 = '=' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_223, 273));
			}
			
			(
				a11 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					}
					if (a11 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_224, 274));
			}
			
			a12 = ')' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 275));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 275));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 276));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 276));
	}
	
;

parse_pattern_art_instance_ValuedAttribute returns [pattern.art.instance.ValuedAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.BasicAttribute proxy = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.ValuedAttribute, pattern.art.type.BasicAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_225, 277));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_226, 278));
	}
	
	(
		a2 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 279));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 279));
	}
	
;

parse_pattern_art_instance_DictionaryValuedAttribute returns [pattern.art.instance.DictionaryValuedAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.Dictionary proxy = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.DictionaryValuedAttribute, pattern.art.type.Dictionary>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_227, 280));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_228, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_229, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 281));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 281));
	}
	
	(
		(
			(
				a2_0 = parse_pattern_art_instance_Entry				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							addObjectToList(element, pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a2_0);
							completedElement(a2_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a2_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_230, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 282));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 282));
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_228, 283));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_229, 283));
					}
					
					(
						a4_0 = parse_pattern_art_instance_Entry						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									addObjectToList(element, pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES, a4_0);
									completedElement(a4_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a4_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_230, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 284));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 284));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_230, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 285));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 285));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 286));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 286));
	}
	
;

parse_pattern_art_instance_DefaultEntry returns [pattern.art.instance.DefaultEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_231, 287));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.DictionaryDefaultValue proxy = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.instance.DefaultEntry, pattern.art.type.DictionaryDefaultValue>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_232, 288));
	}
	
	a2 = '->' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_233, 289));
	}
	
	(
		a3 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_234, 290));
	}
	
	a4 = ']' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_230, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 291));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 291));
	}
	
;

parse_pattern_art_instance_OtherEntry returns [pattern.art.instance.OtherEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_235, 292));
	}
	
	(
		a1 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_236, 293));
	}
	
	a2 = '->' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_237, 294));
	}
	
	(
		a3 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_238, 295));
	}
	
	a4 = ']' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_230, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_187, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_189, 296));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 296));
	}
	
;

parse_pattern_art_type_PrimitiveType returns [pattern.art.type.PrimitiveType element = null]
@init{
}
:
	a0 = 'type' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_239, 297));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_240, 297));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_241, 297));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 297));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_240, 298));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_241, 298));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 298));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_240, 299));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_241, 299));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 299));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_243, 300));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_244, 301));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_241, 302));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 302));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_241, 303));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 303));
	}
	
	(
		(
			a5 = 'implementation' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_245, 304));
			}
			
			(
				a6_0 = parse_pattern_art_implem_TypeImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 305));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 306));
	}
	
	a7 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 307));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 307));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 307));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 307));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 307));
	}
	
	(
		(
			(
				a8_0 = parse_pattern_art_type_AbstractPort				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.PRIMITIVE_TYPE__PORT, a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 308));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 308));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 308));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 308));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 308));
			}
			
			
			|			(
				a9_0 = parse_pattern_art_type_Attribute				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE, a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 309));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 309));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 309));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 309));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 309));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 310));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 310));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 310));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 310));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 310));
	}
	
	a10 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 311));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 311));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 311));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 311));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 311));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 311));
	}
	
;

parse_pattern_art_type_CompositeType returns [pattern.art.type.CompositeType element = null]
@init{
}
:
	a0 = 'compositetype' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_251, 312));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_252, 312));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_253, 312));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 312));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_252, 313));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_253, 313));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 313));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_252, 314));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_253, 314));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 314));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_255, 315));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_256, 316));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_253, 317));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 317));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_253, 318));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 318));
	}
	
	(
		(
			a5 = 'implementation' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_245, 319));
			}
			
			(
				a6_0 = parse_pattern_art_implem_TypeImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__IMPLEM), a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 320));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 321));
	}
	
	a7 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 322));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 322));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 322));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 322));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 322));
	}
	
	(
		(
			(
				a8_0 = parse_pattern_art_type_AbstractPort				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.COMPOSITE_TYPE__PORT, a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 323));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 323));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 323));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 323));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 323));
			}
			
			
			|			(
				a9_0 = parse_pattern_art_type_Attribute				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE, a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 324));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 324));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 324));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 324));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 324));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 325));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 325));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 325));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 325));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 325));
	}
	
	a10 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 326));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 326));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 326));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 326));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 326));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 326));
	}
	
;

parse_pattern_art_type_Operation returns [pattern.art.type.Operation element = null]
@init{
}
:
	a0 = 'operation' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_259, 327));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_260, 327));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_261, 327));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_260, 328));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_261, 328));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_260, 329));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_261, 329));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_262, 330));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_263, 331));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_261, 332));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_261, 333));
	}
	
	a5 = '(' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_264, 334));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_265, 334));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 334));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 334));
	}
	
	(
		(
			(
				a6_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__INPUT, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 335));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 335));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 336));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 336));
	}
	
	(
		(
			a7 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_264, 337));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_265, 337));
			}
			
			(
				a8_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__INPUT, a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 338));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 338));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 339));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 339));
	}
	
	a9 = ')' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_268, 340));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_269, 340));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 340));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 340));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 340));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 340));
	}
	
	(
		(
			a10 = ':' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_264, 341));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_265, 341));
			}
			
			(
				a11_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__OUTPUT, a11_0);
							completedElement(a11_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a11_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_269, 342));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 342));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 342));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 342));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 342));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_269, 343));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 343));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 343));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 343));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 343));
	}
	
	(
		(
			a12 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_264, 344));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_265, 344));
			}
			
			(
				a13_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__OUTPUT, a13_0);
							completedElement(a13_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a13_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_269, 345));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 345));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 345));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 345));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 345));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_269, 346));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 346));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 346));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 346));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 346));
	}
	
;

parse_pattern_art_type_Parameter returns [pattern.art.type.Parameter element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
				}
				if (a0 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_272, 347));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_273, 347));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 347));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 347));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 347));
		}
		
		
		|		a1 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_272, 348));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_273, 348));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 348));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 348));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 348));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_272, 349));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_273, 349));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 349));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 349));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 349));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_273, 350));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 350));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 350));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 350));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_273, 351));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 351));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 351));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 351));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_274, 352));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_275, 353));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 354));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 354));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 354));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_266, 355));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_267, 355));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 355));
	}
	
;

parse_pattern_art_type_FunctionalService returns [pattern.art.type.FunctionalService element = null]
@init{
}
:
	a0 = 'functional' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_276, 356));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_277, 357));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_278, 357));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_279, 357));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_278, 358));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_279, 358));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_278, 359));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_279, 359));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_280, 360));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_281, 361));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_279, 362));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_279, 363));
	}
	
	a6 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 364));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 364));
	}
	
	(
		(
			(
				a7_0 = parse_pattern_art_type_Operation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION, a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 365));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 365));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 366));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_270, 366));
	}
	
	a8 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 367));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 367));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 367));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 367));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 367));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 367));
	}
	
;

parse_pattern_art_type_ControlService returns [pattern.art.type.ControlService element = null]
@init{
}
:
	a0 = 'control' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_282, 368));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_283, 369));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_284, 369));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_285, 369));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_284, 370));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_285, 370));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_284, 371));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_285, 371));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_286, 372));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_287, 373));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_285, 374));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_285, 375));
	}
	
	a6 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 376));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 376));
	}
	
	(
		(
			(
				a7_0 = parse_pattern_art_type_Operation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.CONTROL_SERVICE__OPERATION, a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 377));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 377));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 378));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_271, 378));
	}
	
	a8 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 379));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 379));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 379));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 379));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 379));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 379));
	}
	
;

parse_pattern_art_type_Port returns [pattern.art.type.Port element = null]
@init{
}
:
	(
		a0 = T_PORT_KIND		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_288, 380));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_289, 380));
	}
	
	(
		(
			(
				a1 = T_OPTIONAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_OPTIONAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_289, 381));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_289, 382));
	}
	
	a2 = 'port' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_290, 383));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_291, 383));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_292, 383));
	}
	
	(
		(
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_291, 384));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_292, 384));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_291, 385));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_292, 385));
	}
	
	(
		(
			a4 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_293, 386));
			}
			
			(
				a5 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a5 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_294, 387));
			}
			
			a6 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_292, 388));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_292, 389));
	}
	
	a7 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_295, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_296, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_297, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 390));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 390));
	}
	
	(
		(
			(
				a8 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a8 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.type.AbstractPort, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), proxy);
							completedElement(proxy);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_297, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 391));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 391));
			}
			
			
			|			a9 = '?' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_297, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 392));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 392));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_297, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 393));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 393));
	}
	
	(
		(
			a10 = '[' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_298, 394));
			}
			
			(
				a11 = MULTIPLICITY				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a11 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_299, 395));
			}
			
			a12 = '..' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_300, 396));
			}
			
			(
				a13 = MULTIPLICITY				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a13 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a13).getLine(), ((org.antlr.runtime.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a13).getStartIndex(), ((org.antlr.runtime.CommonToken) a13).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_301, 397));
			}
			
			a14 = ']' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 398));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 398));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 399));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 399));
	}
	
;

parse_pattern_art_implem_FractalComponent returns [pattern.art.implem.FractalComponent element = null]
@init{
}
:
	a0 = 'FractalComponent' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_302, 400));
	}
	
	a1 = '<' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_303, 401));
	}
	
	a2 = 'controllerDesc' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_304, 402));
	}
	
	a3 = ':' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_305, 403));
	}
	
	(
		a4 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			}
			if (a4 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_306, 404));
	}
	
	a5 = 'contentDesc' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_307, 405));
	}
	
	a6 = ':' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_308, 406));
	}
	
	(
		a7 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			}
			if (a7 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_309, 407));
	}
	
	a8 = '>' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 408));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 408));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 408));
	}
	
;

parse_pattern_art_implem_OSGiComponent returns [pattern.art.implem.OSGiComponent element = null]
@init{
}
:
	a0 = 'OSGiComponent' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_310, 409));
	}
	
	a1 = ':' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_311, 410));
	}
	
	(
		a2 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_181, 411));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_200, 411));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 411));
	}
	
;

parse_pattern_art_implem_OSGiType returns [pattern.art.implem.OSGiType element = null]
@init{
}
:
	(
		a0 = T_IMPLEM		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiType();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.Boolean resolved = (java.lang.Boolean)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_242, 412));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_254, 412));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 412));
	}
	
;

parse_pattern_art_type_BasicAttribute returns [pattern.art.type.BasicAttribute element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_312, 413));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_313, 413));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_314, 413));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_313, 414));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_314, 414));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_313, 415));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_314, 415));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_315, 416));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_316, 417));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_314, 418));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_314, 419));
	}
	
	a5 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_317, 420));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_318, 420));
	}
	
	(
		(
			a6 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				if (a6 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a6, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_319, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 421));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 421));
		}
		
		
		|		a7 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_319, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 422));
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 422));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_319, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 423));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 423));
	}
	
	(
		(
			a8 = 'default' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_320, 424));
			}
			
			(
				a9 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 425));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 425));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 426));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 426));
	}
	
;

parse_pattern_art_type_Dictionary returns [pattern.art.type.Dictionary element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_321, 427));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_322, 427));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_323, 427));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_322, 428));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_323, 428));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_322, 429));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_323, 429));
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_324, 430));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_325, 431));
			}
			
			a4 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_323, 432));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_323, 433));
	}
	
	a5 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_326, 434));
	}
	
	a6 = '[' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_327, 435));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_328, 435));
	}
	
	(
		(
			a7 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				if (a7 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_329, 436));
		}
		
		
		|		a8 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_329, 437));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_329, 438));
	}
	
	a9 = '->' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_330, 439));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_331, 439));
	}
	
	(
		(
			a10 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				if (a10 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.type.Dictionary, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a10, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_332, 440));
		}
		
		
		|		a11 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_332, 441));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_332, 442));
	}
	
	a12 = ']' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_333, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 443));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 443));
	}
	
	(
		(
			a13 = 'default' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_334, 444));
			}
			
			a14 = '{' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_335, 445));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_336, 445));
			}
			
			(
				(
					a15_0 = parse_pattern_art_type_DictionaryDefaultValue					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
						}
						if (a15_0 != null) {
							if (a15_0 != null) {
								addObjectToList(element, pattern.art.type.TypePackage.DICTIONARY__KEYS, a15_0);
								completedElement(a15_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a15_0, element); 						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_335, 446));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_336, 446));
			}
			
			a16 = '}' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 447));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 447));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 448));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 448));
	}
	
;

parse_pattern_art_type_DictionaryDefaultValue returns [pattern.art.type.DictionaryDefaultValue element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_337, 449));
	}
	
	(
		a1 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_338, 450));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_339, 450));
	}
	
	(
		(
			a2 = '->' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_340, 451));
			}
			
			(
				a3 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_339, 452));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_339, 453));
	}
	
	a4 = ']' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_335, 454));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_336, 454));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 454));
	}
	
;

parse_pattern_art_type_PortId returns [pattern.art.type.PortId element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortId();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_342, 455));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_343, 455));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 455));
	}
	
;

parse_pattern_art_type_PortCollection returns [pattern.art.type.PortCollection element = null]
@init{
}
:
	(
		a0 = T_PORT_KIND		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_344, 456));
	}
	
	a1 = 'port' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_345, 457));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_346, 457));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_347, 457));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_346, 458));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_347, 458));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_346, 459));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_347, 459));
	}
	
	(
		(
			a3 = '<' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_348, 460));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_349, 461));
			}
			
			a5 = '>' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_347, 462));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_347, 463));
	}
	
	a6 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_350, 464));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_351, 464));
	}
	
	(
		(
			a7 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				if (a7 != null) {
					org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<pattern.art.type.AbstractPort, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_352, 465));
		}
		
		
		|		a8 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_352, 466));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_352, 467));
	}
	
	a9 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_341, 468));
	}
	
	(
		a10_0 = parse_pattern_art_type_PortId		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			if (a10_0 != null) {
				if (a10_0 != null) {
					addObjectToList(element, pattern.art.type.TypePackage.PORT_COLLECTION__IDS, a10_0);
					completedElement(a10_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a10_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_342, 469));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_343, 469));
	}
	
	(
		(
			a11 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_341, 470));
			}
			
			(
				a12_0 = parse_pattern_art_type_PortId				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.PORT_COLLECTION__IDS, a12_0);
							completedElement(a12_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a12_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_342, 471));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_343, 471));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_342, 472));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_343, 472));
	}
	
	a13 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_250, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_257, 473));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 473));
	}
	
;

parse_patternframework_ModelPattern returns [patternframework.ModelPattern element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_patternframework_PConstraint				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS), a0_0);
							completedElement(a0_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a0_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_14, 474));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 474));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_14, 475));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 475));
	}
	
	(
		(
			a1 = 'featureID' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_353, 476));
			}
			
			a2 = ':' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_354, 477));
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							addObjectToList(element, patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER, resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 478));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 479));
	}
	
	a4 = 'pattern' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_19, 480));
	}
	
	(
		a5_0 = parse_patternframework_PModel		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__PATTERN), a5_0);
					completedElement(a5_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a5_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 481));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_16, 481));
	}
	
	(
		(
			a6 = 'negative' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_356, 482));
			}
			
			a7 = 'pattern' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_357, 483));
			}
			
			a8 = ':' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_19, 484));
			}
			
			(
				a9_0 = parse_patternframework_PModel				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							addObjectToList(element, patternframework.PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS, a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 485));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_16, 485));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 486));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_16, 486));
	}
	
;

parse_patternframework_PModel returns [patternframework.PModel element = null]
@init{
}
:
	a0 = 'model' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_358, 487));
	}
	
	a1 = '{' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_151, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_157, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_158, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_159, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_160, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_161, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_162, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_170, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_164, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_186, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_188, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_184, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_185, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_228, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_229, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_258, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_264, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_265, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_246, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_182, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_183, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_245, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_248, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_249, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_335, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_341, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_247, 488));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 488));
	}
	
	(
		(
			a2_0 = parse_patternframework_PObject			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
				}
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__CONTENT, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 489));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_163, 490));
	}
	
	a3 = '}' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_359, 491));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_20, 491));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 491));
	}
	
	(
		(
			a4 = 'roles' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_360, 492));
			}
			
			a5 = ':' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_361, 493));
			}
			
			(
				a6_0 = parse_patternframework_PRole				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__ROLES, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_362, 494));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_363, 494));
			}
			
			(
				(
					a7 = ',' {
						if (element == null) {
							element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_361, 495));
					}
					
					(
						a8_0 = parse_patternframework_PRole						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
							}
							if (element == null) {
								element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
							}
							if (a8_0 != null) {
								if (a8_0 != null) {
									addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__ROLES, a8_0);
									completedElement(a8_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a8_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_362, 496));
						addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_363, 496));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_362, 497));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_363, 497));
			}
			
			a9 = ';' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_20, 498));
				addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 498));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_20, 499));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_355, 499));
	}
	
;

parse_patternframework_PConstraint returns [patternframework.PConstraint element = null]
@init{
}
:
	a0 = 'constraint' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_364, 500));
	}
	
	a1 = '(' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_365, 501));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				patternframework.PConstraintLanguage resolved = (patternframework.PConstraintLanguage)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_366, 502));
	}
	
	a3 = ')' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_367, 503));
	}
	
	a4 = ':' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_368, 504));
	}
	
	(
		a5 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
			}
			if (a5 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_369, 505));
	}
	
	a6 = ';' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_14, 506));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_15, 506));
	}
	
;

parse_patternframework_PRole returns [patternframework.PRole element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_370, 507));
	}
	
	a1 = ':' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_371, 508));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.core.mopp.CoreTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.core.ICoreTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.core.ICoreTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.core.mopp.CoreContextDependentURIFragmentFactory<patternframework.PRole, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPRolePlayerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), proxy);
					completedElement(proxy);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_372, 509));
	}
	
	a3 = '}' {
		if (element == null) {
			element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_362, 510));
		addExpectedElement(new org.smartadapters.core.resource.core.mopp.CoreExpectedTerminal(TERMINAL_363, 510));
	}
	
;

parse_org_smartadapters_core_Adaptation returns [org.smartadapters.core.Adaptation element = null]
:
	c0 = parse_org_smartadapters_core_adaptations_SetruntimeSystem{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding{ element = c4; /* this is a subclass choice */ }
	
;

parse_pattern_art_type_Service returns [pattern.art.type.Service element = null]
:
	c0 = parse_pattern_art_type_FunctionalService{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_type_ControlService{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_type_ComponentType returns [pattern.art.type.ComponentType element = null]
:
	c0 = parse_pattern_art_type_PrimitiveType{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_type_CompositeType{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_implem_ComponentImplementation returns [pattern.art.implem.ComponentImplementation element = null]
:
	c0 = parse_pattern_art_implem_FractalComponent{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_implem_OSGiComponent{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_instance_AttributeInstance returns [pattern.art.instance.AttributeInstance element = null]
:
	c0 = parse_pattern_art_instance_ValuedAttribute{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_instance_DictionaryValuedAttribute{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_instance_ComponentInstance returns [pattern.art.instance.ComponentInstance element = null]
:
	c0 = parse_pattern_art_instance_PrimitiveInstance{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_instance_CompositeInstance{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_instance_Entry returns [pattern.art.instance.Entry element = null]
:
	c0 = parse_pattern_art_instance_DefaultEntry{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_instance_OtherEntry{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_implem_TypeImplementation returns [pattern.art.implem.TypeImplementation element = null]
:
	c0 = parse_pattern_art_implem_OSGiType{ element = c0; /* this is a subclass choice */ }
	
;

parse_pattern_art_type_AbstractPort returns [pattern.art.type.AbstractPort element = null]
:
	c0 = parse_pattern_art_type_Port{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_type_PortCollection{ element = c1; /* this is a subclass choice */ }
	
;

parse_pattern_art_type_Attribute returns [pattern.art.type.Attribute element = null]
:
	c0 = parse_pattern_art_type_BasicAttribute{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_type_Dictionary{ element = c1; /* this is a subclass choice */ }
	
;

parse_patternframework_PObject returns [patternframework.PObject element = null]
:
	c0 = parse_pattern_art_System{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_pattern_art_DataType{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_pattern_art_instance_PrimitiveInstance{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_pattern_art_instance_CompositeInstance{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_pattern_art_instance_TransmissionBinding{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_pattern_art_instance_DelegationBinding{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_pattern_art_instance_ValuedAttribute{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_pattern_art_instance_DictionaryValuedAttribute{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_pattern_art_instance_DefaultEntry{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_pattern_art_instance_OtherEntry{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_pattern_art_type_PrimitiveType{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_pattern_art_type_CompositeType{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_pattern_art_type_Operation{ element = c12; /* this is a subclass choice */ }
	|	c13 = parse_pattern_art_type_Parameter{ element = c13; /* this is a subclass choice */ }
	|	c14 = parse_pattern_art_type_FunctionalService{ element = c14; /* this is a subclass choice */ }
	|	c15 = parse_pattern_art_type_ControlService{ element = c15; /* this is a subclass choice */ }
	|	c16 = parse_pattern_art_type_Port{ element = c16; /* this is a subclass choice */ }
	|	c17 = parse_pattern_art_implem_FractalComponent{ element = c17; /* this is a subclass choice */ }
	|	c18 = parse_pattern_art_implem_OSGiComponent{ element = c18; /* this is a subclass choice */ }
	|	c19 = parse_pattern_art_implem_OSGiType{ element = c19; /* this is a subclass choice */ }
	|	c20 = parse_pattern_art_type_BasicAttribute{ element = c20; /* this is a subclass choice */ }
	|	c21 = parse_pattern_art_type_Dictionary{ element = c21; /* this is a subclass choice */ }
	|	c22 = parse_pattern_art_type_DictionaryDefaultValue{ element = c22; /* this is a subclass choice */ }
	|	c23 = parse_pattern_art_type_PortId{ element = c23; /* this is a subclass choice */ }
	|	c24 = parse_pattern_art_type_PortCollection{ element = c24; /* this is a subclass choice */ }
	
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
T_INSTANCE_STATE:
	'#ON'|'#OFF';
T_PORT_KIND:
	'provided'|'required';
T_IMPLEM:
	'bundle'|'memory';
T_OPTIONAL:
	'optional';
MULTIPLICITY:
	( ('*') | (('0'..'9')+) )
;
STRING_LITERAL:
	'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"';
WHITESPACE:
	(' '|'\t'|'\f')
	{ _channel = 99; }
;
LINEBREAKS:
	('\r\n'|'\r'|'\n')
	{ _channel = 99; }
;
TEXT:
	('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*;

