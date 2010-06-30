grammar SmARText;

options {
	superClass = SmARTextANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.smartadapters.core.resource.smARText.mopp;
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
	package org.smartadapters.core.resource.smARText.mopp;
}

@members{
	private org.smartadapters.core.resource.smARText.ISmARTextTokenResolverFactory tokenResolverFactory = new org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolverFactory();
	@SuppressWarnings("unused")
	
	private int lastPosition;
	private org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolveResult tokenResolveResult = new org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolveResult();
	private boolean rememberExpectedElements = false;
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	private java.util.List<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal> expectedElements = new java.util.ArrayList<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal>();
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	//helper lists to allow a lexer to pass errors to its parser
	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>> postParseCommands;
	private boolean terminateParsing;
	private int tokenIndexOfLastCompleteElement;
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>() {
			public boolean execute(org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.addProblem(new org.smartadapters.core.resource.smARText.ISmARTextProblem() {
					public org.smartadapters.core.resource.smARText.SmARTextEProblemType getType() {
						return org.smartadapters.core.resource.smARText.SmARTextEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.smartadapters.core.resource.smARText.mopp.SmARTextDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.smartadapters.core.resource.smARText.util.SmARTextMapUtil.castToEMap(value);
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
			assert(object instanceof org.smartadapters.core.resource.smARText.mopp.SmARTextDummyEObject);
			org.smartadapters.core.resource.smARText.mopp.SmARTextDummyEObject dummy = (org.smartadapters.core.resource.smARText.mopp.SmARTextDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>() {
			public boolean execute(org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
				org.smartadapters.core.resource.smARText.ISmARTextLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>() {
			public boolean execute(org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
				org.smartadapters.core.resource.smARText.ISmARTextLocationMap locationMap = resource.getLocationMap();
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
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new SmARTextParser(new org.antlr.runtime.CommonTokenStream(new SmARTextLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
			} else {
				return new SmARTextParser(new org.antlr.runtime.CommonTokenStream(new SmARTextLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.smartadapters.core.resource.smARText.mopp.SmARTextPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	// This default constructor is only used to call createInstance() on it
	public SmARTextParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((SmARTextLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((SmARTextLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
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
		throw new org.smartadapters.core.resource.smARText.mopp.SmARTextUnexpectedContentTypeException(typeObject);
	}
	
	private org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolveResult getFreshTokenResolveResult() {
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
	
	public org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation getMetaInformation() {
		return new org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.smartadapters.core.resource.smARText.mopp.SmARTextReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.smartadapters.core.resource.smARText.mopp.SmARTextReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.smartadapters.core.resource.smARText.ISmARTextOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	// Implementation that calls {@link #doParse()}  and handles the thrown
	// RecognitionExceptions.
	public org.smartadapters.core.resource.smARText.ISmARTextParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>>();
		org.smartadapters.core.resource.smARText.mopp.SmARTextParseResult parseResult = new org.smartadapters.core.resource.smARText.mopp.SmARTextParseResult();
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
	
	public java.util.List<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.smartadapters.core.resource.smARText.ISmARTextTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
		org.smartadapters.core.resource.smARText.ISmARTextParseResult result = parse();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal>();
		java.util.List<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal> newFollowSet = new java.util.ArrayList<org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 494;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected terminals
				// can be set
				for (org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are kept
				for (org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.smartadapters.core.resource.smARText.ISmARTextExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.smartadapters.core.resource.smARText.ISmARTextExpectedElement newFollower : newFollowers) {
							org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal newFollowTerminal = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(newFollower, followSetID);
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
		for (org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal expectedElement, int tokenIndex) {
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
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new org.smartadapters.core.resource.smARText.ISmARTextCommand<org.smartadapters.core.resource.smARText.ISmARTextTextResource>() {
			public boolean execute(org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
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
				tokenName = org.smartadapters.core.resource.smARText.util.SmARTextStringUtil.formatTokenName(tokenName);
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
	
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_0 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("Adapter");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_1 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAdapter().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_2 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(";");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_3 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("pointcut");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_4 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("protocol");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_5 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_6 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("set");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_7 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("set");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_8 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("set");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_9 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("set");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_10 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("set");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_11 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_12 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_13 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("constraint");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_14 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("featureID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_15 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("system");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_16 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("root");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_17 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("functional");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_18 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("control");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_19 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("type");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_20 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("compositetype");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_21 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("datatype");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_22 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("primitive");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_23 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("composite");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_24 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("bind");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_25 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("delegate");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_26 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_27 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_28 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("[");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_29 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("[");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_30 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("operation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_31 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_32 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_33 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE), "T_PORT_KIND");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_34 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("FractalComponent");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_35 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("OSGiComponent");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_36 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiType().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), "T_IMPLEM");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_37 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_38 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_39 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("[");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_40 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortId().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_41 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE), "T_PORT_KIND");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_42 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("roles");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_43 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("negative");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_44 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_45 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("advice");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_46 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_47 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_48 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("unique elements");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_49 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_50 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAspect().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_51 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_52 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.CorePackage.eINSTANCE.getAspect().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_53 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("system");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_54 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_55 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_56 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("root");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_57 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("services");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_58 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("types");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_59 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("datatypes");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_60 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_61 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_62 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_63 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_64 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_65 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_66 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_67 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_68 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_69 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_70 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_71 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_72 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_73 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_74 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_75 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("instance");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_76 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_77 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_78 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("type");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_79 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("state");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_80 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("super");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_81 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_82 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("binding");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_83 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("name");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_84 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_85 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_86 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_87 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_88 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_89 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_90 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_91 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_92 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_93 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_94 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_95 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_96 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_97 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_98 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_99 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_100 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_101 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("primitive");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_102 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("component");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_103 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_104 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_105 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("type");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_106 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("state");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_107 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("super");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_108 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_109 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("binding");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_110 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("name");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_111 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_112 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_113 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_114 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_115 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_116 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_117 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_118 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_119 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_120 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_121 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_122 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_123 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_124 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_125 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_126 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_127 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_128 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("composite");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_129 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("component");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_130 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_131 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_132 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("component");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_133 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("delegation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_134 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("state");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_135 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("super");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_136 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("attribute");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_137 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("binding");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_138 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("name");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_139 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_140 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_141 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_142 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_143 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_144 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_145 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_146 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_147 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_148 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_149 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_150 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_151 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_152 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_153 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_154 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_155 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_156 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("+=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_157 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_158 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_159 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_160 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_161 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_162 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("binding");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_163 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_164 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_165 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("requiredPort");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_166 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("providedPort");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_167 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("server");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_168 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("id");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_169 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_170 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_171 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_172 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_173 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_174 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_175 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_176 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_177 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_178 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getSystem().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_179 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getSystem().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_180 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(";");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_181 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getDataType().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_182 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.ArtPackage.eINSTANCE.getDataType().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_183 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(";");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_184 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("instance");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_185 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_186 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_187 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_188 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_189 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_190 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getPrimitiveInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), "T_INSTANCE_STATE");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_191 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_192 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_193 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_194 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_195 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("instance");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_196 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_197 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_198 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_199 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_200 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_201 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getCompositeInstance().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), "T_INSTANCE_STATE");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_202 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_203 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_204 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_205 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_206 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("to");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_207 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_208 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_209 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("::");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_210 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_211 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_212 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("(");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_213 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("id");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_214 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_215 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_216 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(")");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_217 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_218 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_219 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("to");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_220 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_221 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_222 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("::");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_223 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_224 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_225 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("(");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_226 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("id");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_227 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_228 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_229 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(")");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_230 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_231 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_232 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_233 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":=");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_234 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_235 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_236 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_237 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("->");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_238 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_239 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("]");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_240 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_241 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_242 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("->");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_243 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_244 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("]");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_245 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.instance.InstancePackage.eINSTANCE.getOtherEntry().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_246 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPrimitiveType().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_247 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPrimitiveType().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_248 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_249 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_250 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_251 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getCompositeType().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_252 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getCompositeType().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_253 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("implementation");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_254 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_255 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_256 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getOperation().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_257 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getOperation().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_258 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("(");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_259 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_260 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(")");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_261 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_262 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_263 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_264 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_265 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_266 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getParameter().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_267 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("service");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_268 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getFunctionalService().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_269 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getFunctionalService().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_270 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_271 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("service");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_272 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getControlService().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_273 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getControlService().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_274 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_275 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL), "T_OPTIONAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_276 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("port");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_277 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_278 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_279 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_280 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_281 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_282 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("[");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_283 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), "MULTIPLICITY");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_284 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("..");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_285 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPort().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), "MULTIPLICITY");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_286 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("]");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_287 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("<");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_288 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("controllerDesc");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_289 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_290 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_291 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("contentDesc");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_292 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_293 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getFractalComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_294 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(">");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_295 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_296 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_297 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.implem.ImplemPackage.eINSTANCE.getOSGiComponent().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_298 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_299 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_300 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_301 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_302 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_303 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("default");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_304 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getBasicAttribute().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_305 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_306 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_307 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_308 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("[");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_309 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_310 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_311 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("->");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_312 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionary().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_313 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_314 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("]");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_315 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("default");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_316 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_317 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_318 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_319 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("->");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_320 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_321 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("]");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_322 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getDictionaryDefaultValue().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_323 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_324 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_325 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("port");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_326 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_327 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), "TXTID");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_328 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_329 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(pattern.art.type.TypePackage.eINSTANCE.getPortCollection().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_330 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("?");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_331 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("{");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_332 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_333 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getModelPattern().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_334 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("pattern");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_335 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_336 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_337 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPRole().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_338 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(",");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_339 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(";");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_340 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("(");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_341 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPConstraint().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_342 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(")");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_343 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_344 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPConstraint().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION), "STRING_LITERAL");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_345 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(";");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_346 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString(":");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_347 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedStructuralFeature(patternframework.PatternframeworkPackage.eINSTANCE.getPRole().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), "TEXT");
	private final static org.smartadapters.core.resource.smARText.ISmARTextExpectedElement TERMINAL_348 = new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedCsString("}");
	
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
		TERMINAL_12.addFollower(TERMINAL_16);
		TERMINAL_12.addFollower(TERMINAL_17);
		TERMINAL_12.addFollower(TERMINAL_18);
		TERMINAL_12.addFollower(TERMINAL_19);
		TERMINAL_12.addFollower(TERMINAL_20);
		TERMINAL_12.addFollower(TERMINAL_21);
		TERMINAL_12.addFollower(TERMINAL_22);
		TERMINAL_12.addFollower(TERMINAL_23);
		TERMINAL_12.addFollower(TERMINAL_24);
		TERMINAL_12.addFollower(TERMINAL_25);
		TERMINAL_12.addFollower(TERMINAL_26);
		TERMINAL_12.addFollower(TERMINAL_27);
		TERMINAL_12.addFollower(TERMINAL_28);
		TERMINAL_12.addFollower(TERMINAL_29);
		TERMINAL_12.addFollower(TERMINAL_30);
		TERMINAL_12.addFollower(TERMINAL_31);
		TERMINAL_12.addFollower(TERMINAL_32);
		TERMINAL_12.addFollower(TERMINAL_33);
		TERMINAL_12.addFollower(TERMINAL_34);
		TERMINAL_12.addFollower(TERMINAL_35);
		TERMINAL_12.addFollower(TERMINAL_36);
		TERMINAL_12.addFollower(TERMINAL_37);
		TERMINAL_12.addFollower(TERMINAL_38);
		TERMINAL_12.addFollower(TERMINAL_39);
		TERMINAL_12.addFollower(TERMINAL_40);
		TERMINAL_12.addFollower(TERMINAL_41);
		TERMINAL_12.addFollower(TERMINAL_42);
		TERMINAL_12.addFollower(TERMINAL_43);
		TERMINAL_12.addFollower(TERMINAL_44);
		TERMINAL_44.addFollower(TERMINAL_45);
		TERMINAL_45.addFollower(TERMINAL_46);
		TERMINAL_46.addFollower(TERMINAL_15);
		TERMINAL_46.addFollower(TERMINAL_16);
		TERMINAL_46.addFollower(TERMINAL_17);
		TERMINAL_46.addFollower(TERMINAL_18);
		TERMINAL_46.addFollower(TERMINAL_19);
		TERMINAL_46.addFollower(TERMINAL_20);
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
		TERMINAL_46.addFollower(TERMINAL_36);
		TERMINAL_46.addFollower(TERMINAL_37);
		TERMINAL_46.addFollower(TERMINAL_38);
		TERMINAL_46.addFollower(TERMINAL_39);
		TERMINAL_46.addFollower(TERMINAL_40);
		TERMINAL_46.addFollower(TERMINAL_41);
		TERMINAL_46.addFollower(TERMINAL_42);
		TERMINAL_46.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_48);
		TERMINAL_47.addFollower(TERMINAL_4);
		TERMINAL_48.addFollower(TERMINAL_49);
		TERMINAL_49.addFollower(TERMINAL_50);
		TERMINAL_50.addFollower(TERMINAL_51);
		TERMINAL_50.addFollower(TERMINAL_4);
		TERMINAL_51.addFollower(TERMINAL_52);
		TERMINAL_52.addFollower(TERMINAL_51);
		TERMINAL_52.addFollower(TERMINAL_4);
		TERMINAL_6.addFollower(TERMINAL_53);
		TERMINAL_53.addFollower(TERMINAL_54);
		TERMINAL_54.addFollower(TERMINAL_55);
		TERMINAL_55.addFollower(TERMINAL_56);
		TERMINAL_55.addFollower(TERMINAL_57);
		TERMINAL_55.addFollower(TERMINAL_58);
		TERMINAL_55.addFollower(TERMINAL_59);
		TERMINAL_55.addFollower(TERMINAL_60);
		TERMINAL_56.addFollower(TERMINAL_61);
		TERMINAL_61.addFollower(TERMINAL_62);
		TERMINAL_62.addFollower(TERMINAL_56);
		TERMINAL_62.addFollower(TERMINAL_57);
		TERMINAL_62.addFollower(TERMINAL_58);
		TERMINAL_62.addFollower(TERMINAL_59);
		TERMINAL_62.addFollower(TERMINAL_60);
		TERMINAL_57.addFollower(TERMINAL_63);
		TERMINAL_63.addFollower(TERMINAL_64);
		TERMINAL_64.addFollower(TERMINAL_65);
		TERMINAL_64.addFollower(TERMINAL_56);
		TERMINAL_64.addFollower(TERMINAL_57);
		TERMINAL_64.addFollower(TERMINAL_58);
		TERMINAL_64.addFollower(TERMINAL_59);
		TERMINAL_64.addFollower(TERMINAL_60);
		TERMINAL_65.addFollower(TERMINAL_66);
		TERMINAL_66.addFollower(TERMINAL_65);
		TERMINAL_66.addFollower(TERMINAL_56);
		TERMINAL_66.addFollower(TERMINAL_57);
		TERMINAL_66.addFollower(TERMINAL_58);
		TERMINAL_66.addFollower(TERMINAL_59);
		TERMINAL_66.addFollower(TERMINAL_60);
		TERMINAL_58.addFollower(TERMINAL_67);
		TERMINAL_67.addFollower(TERMINAL_68);
		TERMINAL_68.addFollower(TERMINAL_69);
		TERMINAL_68.addFollower(TERMINAL_56);
		TERMINAL_68.addFollower(TERMINAL_57);
		TERMINAL_68.addFollower(TERMINAL_58);
		TERMINAL_68.addFollower(TERMINAL_59);
		TERMINAL_68.addFollower(TERMINAL_60);
		TERMINAL_69.addFollower(TERMINAL_70);
		TERMINAL_70.addFollower(TERMINAL_69);
		TERMINAL_70.addFollower(TERMINAL_56);
		TERMINAL_70.addFollower(TERMINAL_57);
		TERMINAL_70.addFollower(TERMINAL_58);
		TERMINAL_70.addFollower(TERMINAL_59);
		TERMINAL_70.addFollower(TERMINAL_60);
		TERMINAL_59.addFollower(TERMINAL_71);
		TERMINAL_71.addFollower(TERMINAL_72);
		TERMINAL_72.addFollower(TERMINAL_73);
		TERMINAL_72.addFollower(TERMINAL_56);
		TERMINAL_72.addFollower(TERMINAL_57);
		TERMINAL_72.addFollower(TERMINAL_58);
		TERMINAL_72.addFollower(TERMINAL_59);
		TERMINAL_72.addFollower(TERMINAL_60);
		TERMINAL_73.addFollower(TERMINAL_74);
		TERMINAL_74.addFollower(TERMINAL_73);
		TERMINAL_74.addFollower(TERMINAL_56);
		TERMINAL_74.addFollower(TERMINAL_57);
		TERMINAL_74.addFollower(TERMINAL_58);
		TERMINAL_74.addFollower(TERMINAL_59);
		TERMINAL_74.addFollower(TERMINAL_60);
		TERMINAL_60.addFollower(TERMINAL_6);
		TERMINAL_60.addFollower(TERMINAL_7);
		TERMINAL_60.addFollower(TERMINAL_8);
		TERMINAL_60.addFollower(TERMINAL_9);
		TERMINAL_60.addFollower(TERMINAL_10);
		TERMINAL_60.addFollower(TERMINAL_11);
		TERMINAL_7.addFollower(TERMINAL_75);
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
		TERMINAL_8.addFollower(TERMINAL_101);
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
		TERMINAL_105.addFollower(TERMINAL_112);
		TERMINAL_112.addFollower(TERMINAL_113);
		TERMINAL_113.addFollower(TERMINAL_105);
		TERMINAL_113.addFollower(TERMINAL_106);
		TERMINAL_113.addFollower(TERMINAL_107);
		TERMINAL_113.addFollower(TERMINAL_108);
		TERMINAL_113.addFollower(TERMINAL_109);
		TERMINAL_113.addFollower(TERMINAL_110);
		TERMINAL_113.addFollower(TERMINAL_111);
		TERMINAL_106.addFollower(TERMINAL_114);
		TERMINAL_114.addFollower(TERMINAL_115);
		TERMINAL_115.addFollower(TERMINAL_105);
		TERMINAL_115.addFollower(TERMINAL_106);
		TERMINAL_115.addFollower(TERMINAL_107);
		TERMINAL_115.addFollower(TERMINAL_108);
		TERMINAL_115.addFollower(TERMINAL_109);
		TERMINAL_115.addFollower(TERMINAL_110);
		TERMINAL_115.addFollower(TERMINAL_111);
		TERMINAL_107.addFollower(TERMINAL_116);
		TERMINAL_116.addFollower(TERMINAL_117);
		TERMINAL_117.addFollower(TERMINAL_105);
		TERMINAL_117.addFollower(TERMINAL_106);
		TERMINAL_117.addFollower(TERMINAL_107);
		TERMINAL_117.addFollower(TERMINAL_108);
		TERMINAL_117.addFollower(TERMINAL_109);
		TERMINAL_117.addFollower(TERMINAL_110);
		TERMINAL_117.addFollower(TERMINAL_111);
		TERMINAL_108.addFollower(TERMINAL_118);
		TERMINAL_118.addFollower(TERMINAL_119);
		TERMINAL_119.addFollower(TERMINAL_120);
		TERMINAL_119.addFollower(TERMINAL_105);
		TERMINAL_119.addFollower(TERMINAL_106);
		TERMINAL_119.addFollower(TERMINAL_107);
		TERMINAL_119.addFollower(TERMINAL_108);
		TERMINAL_119.addFollower(TERMINAL_109);
		TERMINAL_119.addFollower(TERMINAL_110);
		TERMINAL_119.addFollower(TERMINAL_111);
		TERMINAL_120.addFollower(TERMINAL_121);
		TERMINAL_121.addFollower(TERMINAL_120);
		TERMINAL_121.addFollower(TERMINAL_105);
		TERMINAL_121.addFollower(TERMINAL_106);
		TERMINAL_121.addFollower(TERMINAL_107);
		TERMINAL_121.addFollower(TERMINAL_108);
		TERMINAL_121.addFollower(TERMINAL_109);
		TERMINAL_121.addFollower(TERMINAL_110);
		TERMINAL_121.addFollower(TERMINAL_111);
		TERMINAL_109.addFollower(TERMINAL_122);
		TERMINAL_122.addFollower(TERMINAL_123);
		TERMINAL_123.addFollower(TERMINAL_124);
		TERMINAL_123.addFollower(TERMINAL_105);
		TERMINAL_123.addFollower(TERMINAL_106);
		TERMINAL_123.addFollower(TERMINAL_107);
		TERMINAL_123.addFollower(TERMINAL_108);
		TERMINAL_123.addFollower(TERMINAL_109);
		TERMINAL_123.addFollower(TERMINAL_110);
		TERMINAL_123.addFollower(TERMINAL_111);
		TERMINAL_124.addFollower(TERMINAL_125);
		TERMINAL_125.addFollower(TERMINAL_124);
		TERMINAL_125.addFollower(TERMINAL_105);
		TERMINAL_125.addFollower(TERMINAL_106);
		TERMINAL_125.addFollower(TERMINAL_107);
		TERMINAL_125.addFollower(TERMINAL_108);
		TERMINAL_125.addFollower(TERMINAL_109);
		TERMINAL_125.addFollower(TERMINAL_110);
		TERMINAL_125.addFollower(TERMINAL_111);
		TERMINAL_110.addFollower(TERMINAL_126);
		TERMINAL_126.addFollower(TERMINAL_127);
		TERMINAL_127.addFollower(TERMINAL_105);
		TERMINAL_127.addFollower(TERMINAL_106);
		TERMINAL_127.addFollower(TERMINAL_107);
		TERMINAL_127.addFollower(TERMINAL_108);
		TERMINAL_127.addFollower(TERMINAL_109);
		TERMINAL_127.addFollower(TERMINAL_110);
		TERMINAL_127.addFollower(TERMINAL_111);
		TERMINAL_111.addFollower(TERMINAL_6);
		TERMINAL_111.addFollower(TERMINAL_7);
		TERMINAL_111.addFollower(TERMINAL_8);
		TERMINAL_111.addFollower(TERMINAL_9);
		TERMINAL_111.addFollower(TERMINAL_10);
		TERMINAL_111.addFollower(TERMINAL_11);
		TERMINAL_9.addFollower(TERMINAL_128);
		TERMINAL_128.addFollower(TERMINAL_129);
		TERMINAL_129.addFollower(TERMINAL_130);
		TERMINAL_130.addFollower(TERMINAL_131);
		TERMINAL_131.addFollower(TERMINAL_132);
		TERMINAL_131.addFollower(TERMINAL_133);
		TERMINAL_131.addFollower(TERMINAL_134);
		TERMINAL_131.addFollower(TERMINAL_135);
		TERMINAL_131.addFollower(TERMINAL_136);
		TERMINAL_131.addFollower(TERMINAL_137);
		TERMINAL_131.addFollower(TERMINAL_138);
		TERMINAL_131.addFollower(TERMINAL_139);
	}
	public static void wire1() {
		TERMINAL_132.addFollower(TERMINAL_140);
		TERMINAL_140.addFollower(TERMINAL_141);
		TERMINAL_141.addFollower(TERMINAL_142);
		TERMINAL_141.addFollower(TERMINAL_132);
		TERMINAL_141.addFollower(TERMINAL_133);
		TERMINAL_141.addFollower(TERMINAL_134);
		TERMINAL_141.addFollower(TERMINAL_135);
		TERMINAL_141.addFollower(TERMINAL_136);
		TERMINAL_141.addFollower(TERMINAL_137);
		TERMINAL_141.addFollower(TERMINAL_138);
		TERMINAL_141.addFollower(TERMINAL_139);
		TERMINAL_142.addFollower(TERMINAL_143);
		TERMINAL_143.addFollower(TERMINAL_142);
		TERMINAL_143.addFollower(TERMINAL_132);
		TERMINAL_143.addFollower(TERMINAL_133);
		TERMINAL_143.addFollower(TERMINAL_134);
		TERMINAL_143.addFollower(TERMINAL_135);
		TERMINAL_143.addFollower(TERMINAL_136);
		TERMINAL_143.addFollower(TERMINAL_137);
		TERMINAL_143.addFollower(TERMINAL_138);
		TERMINAL_143.addFollower(TERMINAL_139);
		TERMINAL_133.addFollower(TERMINAL_144);
		TERMINAL_144.addFollower(TERMINAL_145);
		TERMINAL_145.addFollower(TERMINAL_146);
		TERMINAL_145.addFollower(TERMINAL_132);
		TERMINAL_145.addFollower(TERMINAL_133);
		TERMINAL_145.addFollower(TERMINAL_134);
		TERMINAL_145.addFollower(TERMINAL_135);
		TERMINAL_145.addFollower(TERMINAL_136);
		TERMINAL_145.addFollower(TERMINAL_137);
		TERMINAL_145.addFollower(TERMINAL_138);
		TERMINAL_145.addFollower(TERMINAL_139);
		TERMINAL_146.addFollower(TERMINAL_147);
		TERMINAL_147.addFollower(TERMINAL_146);
		TERMINAL_147.addFollower(TERMINAL_132);
		TERMINAL_147.addFollower(TERMINAL_133);
		TERMINAL_147.addFollower(TERMINAL_134);
		TERMINAL_147.addFollower(TERMINAL_135);
		TERMINAL_147.addFollower(TERMINAL_136);
		TERMINAL_147.addFollower(TERMINAL_137);
		TERMINAL_147.addFollower(TERMINAL_138);
		TERMINAL_147.addFollower(TERMINAL_139);
		TERMINAL_134.addFollower(TERMINAL_148);
		TERMINAL_148.addFollower(TERMINAL_149);
		TERMINAL_149.addFollower(TERMINAL_132);
		TERMINAL_149.addFollower(TERMINAL_133);
		TERMINAL_149.addFollower(TERMINAL_134);
		TERMINAL_149.addFollower(TERMINAL_135);
		TERMINAL_149.addFollower(TERMINAL_136);
		TERMINAL_149.addFollower(TERMINAL_137);
		TERMINAL_149.addFollower(TERMINAL_138);
		TERMINAL_149.addFollower(TERMINAL_139);
		TERMINAL_135.addFollower(TERMINAL_150);
		TERMINAL_150.addFollower(TERMINAL_151);
		TERMINAL_151.addFollower(TERMINAL_132);
		TERMINAL_151.addFollower(TERMINAL_133);
		TERMINAL_151.addFollower(TERMINAL_134);
		TERMINAL_151.addFollower(TERMINAL_135);
		TERMINAL_151.addFollower(TERMINAL_136);
		TERMINAL_151.addFollower(TERMINAL_137);
		TERMINAL_151.addFollower(TERMINAL_138);
		TERMINAL_151.addFollower(TERMINAL_139);
		TERMINAL_136.addFollower(TERMINAL_152);
		TERMINAL_152.addFollower(TERMINAL_153);
		TERMINAL_153.addFollower(TERMINAL_154);
		TERMINAL_153.addFollower(TERMINAL_132);
		TERMINAL_153.addFollower(TERMINAL_133);
		TERMINAL_153.addFollower(TERMINAL_134);
		TERMINAL_153.addFollower(TERMINAL_135);
		TERMINAL_153.addFollower(TERMINAL_136);
		TERMINAL_153.addFollower(TERMINAL_137);
		TERMINAL_153.addFollower(TERMINAL_138);
		TERMINAL_153.addFollower(TERMINAL_139);
		TERMINAL_154.addFollower(TERMINAL_155);
		TERMINAL_155.addFollower(TERMINAL_154);
		TERMINAL_155.addFollower(TERMINAL_132);
		TERMINAL_155.addFollower(TERMINAL_133);
		TERMINAL_155.addFollower(TERMINAL_134);
		TERMINAL_155.addFollower(TERMINAL_135);
		TERMINAL_155.addFollower(TERMINAL_136);
		TERMINAL_155.addFollower(TERMINAL_137);
		TERMINAL_155.addFollower(TERMINAL_138);
		TERMINAL_155.addFollower(TERMINAL_139);
		TERMINAL_137.addFollower(TERMINAL_156);
		TERMINAL_156.addFollower(TERMINAL_157);
		TERMINAL_157.addFollower(TERMINAL_158);
		TERMINAL_157.addFollower(TERMINAL_132);
		TERMINAL_157.addFollower(TERMINAL_133);
		TERMINAL_157.addFollower(TERMINAL_134);
		TERMINAL_157.addFollower(TERMINAL_135);
		TERMINAL_157.addFollower(TERMINAL_136);
		TERMINAL_157.addFollower(TERMINAL_137);
		TERMINAL_157.addFollower(TERMINAL_138);
		TERMINAL_157.addFollower(TERMINAL_139);
		TERMINAL_158.addFollower(TERMINAL_159);
		TERMINAL_159.addFollower(TERMINAL_158);
		TERMINAL_159.addFollower(TERMINAL_132);
		TERMINAL_159.addFollower(TERMINAL_133);
		TERMINAL_159.addFollower(TERMINAL_134);
		TERMINAL_159.addFollower(TERMINAL_135);
		TERMINAL_159.addFollower(TERMINAL_136);
		TERMINAL_159.addFollower(TERMINAL_137);
		TERMINAL_159.addFollower(TERMINAL_138);
		TERMINAL_159.addFollower(TERMINAL_139);
		TERMINAL_138.addFollower(TERMINAL_160);
		TERMINAL_160.addFollower(TERMINAL_161);
		TERMINAL_161.addFollower(TERMINAL_132);
		TERMINAL_161.addFollower(TERMINAL_133);
		TERMINAL_161.addFollower(TERMINAL_134);
		TERMINAL_161.addFollower(TERMINAL_135);
		TERMINAL_161.addFollower(TERMINAL_136);
		TERMINAL_161.addFollower(TERMINAL_137);
		TERMINAL_161.addFollower(TERMINAL_138);
		TERMINAL_161.addFollower(TERMINAL_139);
		TERMINAL_139.addFollower(TERMINAL_6);
		TERMINAL_139.addFollower(TERMINAL_7);
		TERMINAL_139.addFollower(TERMINAL_8);
		TERMINAL_139.addFollower(TERMINAL_9);
		TERMINAL_139.addFollower(TERMINAL_10);
		TERMINAL_139.addFollower(TERMINAL_11);
		TERMINAL_10.addFollower(TERMINAL_162);
		TERMINAL_162.addFollower(TERMINAL_163);
		TERMINAL_163.addFollower(TERMINAL_164);
		TERMINAL_164.addFollower(TERMINAL_165);
		TERMINAL_164.addFollower(TERMINAL_166);
		TERMINAL_164.addFollower(TERMINAL_167);
		TERMINAL_164.addFollower(TERMINAL_168);
		TERMINAL_164.addFollower(TERMINAL_169);
		TERMINAL_165.addFollower(TERMINAL_170);
		TERMINAL_170.addFollower(TERMINAL_171);
		TERMINAL_171.addFollower(TERMINAL_165);
		TERMINAL_171.addFollower(TERMINAL_166);
		TERMINAL_171.addFollower(TERMINAL_167);
		TERMINAL_171.addFollower(TERMINAL_168);
		TERMINAL_171.addFollower(TERMINAL_169);
		TERMINAL_166.addFollower(TERMINAL_172);
		TERMINAL_172.addFollower(TERMINAL_173);
		TERMINAL_173.addFollower(TERMINAL_165);
		TERMINAL_173.addFollower(TERMINAL_166);
		TERMINAL_173.addFollower(TERMINAL_167);
		TERMINAL_173.addFollower(TERMINAL_168);
		TERMINAL_173.addFollower(TERMINAL_169);
		TERMINAL_167.addFollower(TERMINAL_174);
		TERMINAL_174.addFollower(TERMINAL_175);
		TERMINAL_175.addFollower(TERMINAL_165);
		TERMINAL_175.addFollower(TERMINAL_166);
		TERMINAL_175.addFollower(TERMINAL_167);
		TERMINAL_175.addFollower(TERMINAL_168);
		TERMINAL_175.addFollower(TERMINAL_169);
		TERMINAL_168.addFollower(TERMINAL_176);
		TERMINAL_176.addFollower(TERMINAL_177);
		TERMINAL_177.addFollower(TERMINAL_165);
		TERMINAL_177.addFollower(TERMINAL_166);
		TERMINAL_177.addFollower(TERMINAL_167);
		TERMINAL_177.addFollower(TERMINAL_168);
		TERMINAL_177.addFollower(TERMINAL_169);
		TERMINAL_169.addFollower(TERMINAL_6);
		TERMINAL_169.addFollower(TERMINAL_7);
		TERMINAL_169.addFollower(TERMINAL_8);
		TERMINAL_169.addFollower(TERMINAL_9);
		TERMINAL_169.addFollower(TERMINAL_10);
		TERMINAL_169.addFollower(TERMINAL_11);
		TERMINAL_15.addFollower(TERMINAL_178);
		TERMINAL_15.addFollower(TERMINAL_179);
		TERMINAL_15.addFollower(TERMINAL_180);
		TERMINAL_178.addFollower(TERMINAL_179);
		TERMINAL_178.addFollower(TERMINAL_180);
		TERMINAL_179.addFollower(TERMINAL_180);
		TERMINAL_180.addFollower(TERMINAL_16);
		TERMINAL_180.addFollower(TERMINAL_17);
		TERMINAL_180.addFollower(TERMINAL_18);
		TERMINAL_180.addFollower(TERMINAL_19);
		TERMINAL_180.addFollower(TERMINAL_20);
		TERMINAL_180.addFollower(TERMINAL_21);
		TERMINAL_180.addFollower(TERMINAL_42);
		TERMINAL_180.addFollower(TERMINAL_47);
		TERMINAL_180.addFollower(TERMINAL_43);
		TERMINAL_16.addFollower(TERMINAL_23);
		TERMINAL_21.addFollower(TERMINAL_181);
		TERMINAL_21.addFollower(TERMINAL_182);
		TERMINAL_21.addFollower(TERMINAL_183);
		TERMINAL_181.addFollower(TERMINAL_182);
		TERMINAL_181.addFollower(TERMINAL_183);
		TERMINAL_182.addFollower(TERMINAL_183);
		TERMINAL_183.addFollower(TERMINAL_17);
		TERMINAL_183.addFollower(TERMINAL_18);
		TERMINAL_183.addFollower(TERMINAL_19);
		TERMINAL_183.addFollower(TERMINAL_20);
		TERMINAL_183.addFollower(TERMINAL_21);
		TERMINAL_183.addFollower(TERMINAL_42);
		TERMINAL_183.addFollower(TERMINAL_47);
		TERMINAL_183.addFollower(TERMINAL_43);
		TERMINAL_22.addFollower(TERMINAL_184);
		TERMINAL_184.addFollower(TERMINAL_185);
		TERMINAL_184.addFollower(TERMINAL_186);
		TERMINAL_184.addFollower(TERMINAL_187);
		TERMINAL_185.addFollower(TERMINAL_186);
		TERMINAL_185.addFollower(TERMINAL_187);
		TERMINAL_186.addFollower(TERMINAL_187);
		TERMINAL_187.addFollower(TERMINAL_188);
		TERMINAL_187.addFollower(TERMINAL_189);
		TERMINAL_188.addFollower(TERMINAL_190);
		TERMINAL_188.addFollower(TERMINAL_191);
		TERMINAL_188.addFollower(TERMINAL_192);
		TERMINAL_189.addFollower(TERMINAL_190);
		TERMINAL_189.addFollower(TERMINAL_191);
		TERMINAL_189.addFollower(TERMINAL_192);
		TERMINAL_190.addFollower(TERMINAL_191);
		TERMINAL_190.addFollower(TERMINAL_192);
		TERMINAL_191.addFollower(TERMINAL_34);
		TERMINAL_191.addFollower(TERMINAL_35);
		TERMINAL_192.addFollower(TERMINAL_26);
		TERMINAL_192.addFollower(TERMINAL_27);
		TERMINAL_192.addFollower(TERMINAL_24);
		TERMINAL_192.addFollower(TERMINAL_193);
		TERMINAL_193.addFollower(TERMINAL_26);
		TERMINAL_193.addFollower(TERMINAL_27);
		TERMINAL_193.addFollower(TERMINAL_24);
		TERMINAL_193.addFollower(TERMINAL_22);
		TERMINAL_193.addFollower(TERMINAL_23);
		TERMINAL_193.addFollower(TERMINAL_25);
		TERMINAL_193.addFollower(TERMINAL_194);
		TERMINAL_193.addFollower(TERMINAL_42);
		TERMINAL_193.addFollower(TERMINAL_47);
		TERMINAL_193.addFollower(TERMINAL_43);
		TERMINAL_23.addFollower(TERMINAL_195);
		TERMINAL_195.addFollower(TERMINAL_196);
		TERMINAL_195.addFollower(TERMINAL_197);
		TERMINAL_195.addFollower(TERMINAL_198);
		TERMINAL_196.addFollower(TERMINAL_197);
		TERMINAL_196.addFollower(TERMINAL_198);
		TERMINAL_197.addFollower(TERMINAL_198);
		TERMINAL_198.addFollower(TERMINAL_199);
		TERMINAL_198.addFollower(TERMINAL_200);
		TERMINAL_199.addFollower(TERMINAL_201);
		TERMINAL_199.addFollower(TERMINAL_202);
		TERMINAL_199.addFollower(TERMINAL_203);
		TERMINAL_200.addFollower(TERMINAL_201);
		TERMINAL_200.addFollower(TERMINAL_202);
		TERMINAL_200.addFollower(TERMINAL_203);
		TERMINAL_201.addFollower(TERMINAL_202);
		TERMINAL_201.addFollower(TERMINAL_203);
		TERMINAL_202.addFollower(TERMINAL_34);
		TERMINAL_202.addFollower(TERMINAL_35);
		TERMINAL_203.addFollower(TERMINAL_26);
		TERMINAL_203.addFollower(TERMINAL_27);
		TERMINAL_203.addFollower(TERMINAL_24);
		TERMINAL_203.addFollower(TERMINAL_22);
		TERMINAL_203.addFollower(TERMINAL_23);
		TERMINAL_203.addFollower(TERMINAL_25);
		TERMINAL_203.addFollower(TERMINAL_194);
		TERMINAL_194.addFollower(TERMINAL_17);
		TERMINAL_194.addFollower(TERMINAL_18);
		TERMINAL_194.addFollower(TERMINAL_19);
		TERMINAL_194.addFollower(TERMINAL_20);
		TERMINAL_194.addFollower(TERMINAL_21);
		TERMINAL_194.addFollower(TERMINAL_42);
		TERMINAL_194.addFollower(TERMINAL_47);
		TERMINAL_194.addFollower(TERMINAL_43);
		TERMINAL_194.addFollower(TERMINAL_26);
		TERMINAL_194.addFollower(TERMINAL_27);
		TERMINAL_194.addFollower(TERMINAL_24);
		TERMINAL_194.addFollower(TERMINAL_22);
		TERMINAL_194.addFollower(TERMINAL_23);
		TERMINAL_194.addFollower(TERMINAL_25);
		TERMINAL_194.addFollower(TERMINAL_194);
		TERMINAL_24.addFollower(TERMINAL_204);
		TERMINAL_24.addFollower(TERMINAL_205);
		TERMINAL_204.addFollower(TERMINAL_206);
		TERMINAL_205.addFollower(TERMINAL_206);
		TERMINAL_206.addFollower(TERMINAL_207);
		TERMINAL_206.addFollower(TERMINAL_208);
		TERMINAL_207.addFollower(TERMINAL_209);
		TERMINAL_209.addFollower(TERMINAL_210);
		TERMINAL_210.addFollower(TERMINAL_211);
		TERMINAL_210.addFollower(TERMINAL_212);
		TERMINAL_210.addFollower(TERMINAL_26);
		TERMINAL_210.addFollower(TERMINAL_27);
		TERMINAL_210.addFollower(TERMINAL_24);
		TERMINAL_210.addFollower(TERMINAL_193);
		TERMINAL_210.addFollower(TERMINAL_22);
		TERMINAL_210.addFollower(TERMINAL_23);
		TERMINAL_210.addFollower(TERMINAL_25);
		TERMINAL_210.addFollower(TERMINAL_194);
		TERMINAL_210.addFollower(TERMINAL_42);
		TERMINAL_210.addFollower(TERMINAL_47);
		TERMINAL_210.addFollower(TERMINAL_43);
		TERMINAL_208.addFollower(TERMINAL_211);
		TERMINAL_208.addFollower(TERMINAL_212);
		TERMINAL_208.addFollower(TERMINAL_26);
		TERMINAL_208.addFollower(TERMINAL_27);
		TERMINAL_208.addFollower(TERMINAL_24);
		TERMINAL_208.addFollower(TERMINAL_193);
		TERMINAL_208.addFollower(TERMINAL_22);
		TERMINAL_208.addFollower(TERMINAL_23);
		TERMINAL_208.addFollower(TERMINAL_25);
		TERMINAL_208.addFollower(TERMINAL_194);
		TERMINAL_208.addFollower(TERMINAL_42);
		TERMINAL_208.addFollower(TERMINAL_47);
		TERMINAL_208.addFollower(TERMINAL_43);
		TERMINAL_211.addFollower(TERMINAL_212);
		TERMINAL_211.addFollower(TERMINAL_26);
		TERMINAL_211.addFollower(TERMINAL_27);
		TERMINAL_211.addFollower(TERMINAL_24);
		TERMINAL_211.addFollower(TERMINAL_193);
		TERMINAL_211.addFollower(TERMINAL_22);
		TERMINAL_211.addFollower(TERMINAL_23);
		TERMINAL_211.addFollower(TERMINAL_25);
		TERMINAL_211.addFollower(TERMINAL_194);
		TERMINAL_211.addFollower(TERMINAL_42);
		TERMINAL_211.addFollower(TERMINAL_47);
		TERMINAL_211.addFollower(TERMINAL_43);
		TERMINAL_212.addFollower(TERMINAL_213);
		TERMINAL_213.addFollower(TERMINAL_214);
		TERMINAL_214.addFollower(TERMINAL_215);
		TERMINAL_215.addFollower(TERMINAL_216);
		TERMINAL_216.addFollower(TERMINAL_26);
		TERMINAL_216.addFollower(TERMINAL_27);
		TERMINAL_216.addFollower(TERMINAL_24);
		TERMINAL_216.addFollower(TERMINAL_193);
		TERMINAL_216.addFollower(TERMINAL_22);
		TERMINAL_216.addFollower(TERMINAL_23);
		TERMINAL_216.addFollower(TERMINAL_25);
		TERMINAL_216.addFollower(TERMINAL_194);
		TERMINAL_216.addFollower(TERMINAL_42);
		TERMINAL_216.addFollower(TERMINAL_47);
		TERMINAL_216.addFollower(TERMINAL_43);
		TERMINAL_25.addFollower(TERMINAL_217);
		TERMINAL_25.addFollower(TERMINAL_218);
		TERMINAL_217.addFollower(TERMINAL_219);
		TERMINAL_218.addFollower(TERMINAL_219);
		TERMINAL_219.addFollower(TERMINAL_220);
		TERMINAL_219.addFollower(TERMINAL_221);
		TERMINAL_220.addFollower(TERMINAL_222);
		TERMINAL_222.addFollower(TERMINAL_223);
		TERMINAL_223.addFollower(TERMINAL_224);
		TERMINAL_223.addFollower(TERMINAL_225);
		TERMINAL_223.addFollower(TERMINAL_26);
		TERMINAL_223.addFollower(TERMINAL_27);
		TERMINAL_223.addFollower(TERMINAL_24);
		TERMINAL_223.addFollower(TERMINAL_22);
		TERMINAL_223.addFollower(TERMINAL_23);
		TERMINAL_223.addFollower(TERMINAL_25);
		TERMINAL_223.addFollower(TERMINAL_194);
		TERMINAL_223.addFollower(TERMINAL_42);
		TERMINAL_223.addFollower(TERMINAL_47);
		TERMINAL_223.addFollower(TERMINAL_43);
		TERMINAL_221.addFollower(TERMINAL_224);
		TERMINAL_221.addFollower(TERMINAL_225);
		TERMINAL_221.addFollower(TERMINAL_26);
		TERMINAL_221.addFollower(TERMINAL_27);
		TERMINAL_221.addFollower(TERMINAL_24);
		TERMINAL_221.addFollower(TERMINAL_22);
		TERMINAL_221.addFollower(TERMINAL_23);
		TERMINAL_221.addFollower(TERMINAL_25);
		TERMINAL_221.addFollower(TERMINAL_194);
		TERMINAL_221.addFollower(TERMINAL_42);
		TERMINAL_221.addFollower(TERMINAL_47);
		TERMINAL_221.addFollower(TERMINAL_43);
	}
	public static void wire2() {
		TERMINAL_224.addFollower(TERMINAL_225);
		TERMINAL_224.addFollower(TERMINAL_26);
		TERMINAL_224.addFollower(TERMINAL_27);
		TERMINAL_224.addFollower(TERMINAL_24);
		TERMINAL_224.addFollower(TERMINAL_22);
		TERMINAL_224.addFollower(TERMINAL_23);
		TERMINAL_224.addFollower(TERMINAL_25);
		TERMINAL_224.addFollower(TERMINAL_194);
		TERMINAL_224.addFollower(TERMINAL_42);
		TERMINAL_224.addFollower(TERMINAL_47);
		TERMINAL_224.addFollower(TERMINAL_43);
		TERMINAL_225.addFollower(TERMINAL_226);
		TERMINAL_226.addFollower(TERMINAL_227);
		TERMINAL_227.addFollower(TERMINAL_228);
		TERMINAL_228.addFollower(TERMINAL_229);
		TERMINAL_229.addFollower(TERMINAL_26);
		TERMINAL_229.addFollower(TERMINAL_27);
		TERMINAL_229.addFollower(TERMINAL_24);
		TERMINAL_229.addFollower(TERMINAL_22);
		TERMINAL_229.addFollower(TERMINAL_23);
		TERMINAL_229.addFollower(TERMINAL_25);
		TERMINAL_229.addFollower(TERMINAL_194);
		TERMINAL_229.addFollower(TERMINAL_42);
		TERMINAL_229.addFollower(TERMINAL_47);
		TERMINAL_229.addFollower(TERMINAL_43);
		TERMINAL_26.addFollower(TERMINAL_230);
		TERMINAL_230.addFollower(TERMINAL_231);
		TERMINAL_231.addFollower(TERMINAL_232);
		TERMINAL_231.addFollower(TERMINAL_26);
		TERMINAL_231.addFollower(TERMINAL_27);
		TERMINAL_231.addFollower(TERMINAL_24);
		TERMINAL_231.addFollower(TERMINAL_193);
		TERMINAL_231.addFollower(TERMINAL_22);
		TERMINAL_231.addFollower(TERMINAL_23);
		TERMINAL_231.addFollower(TERMINAL_25);
		TERMINAL_231.addFollower(TERMINAL_194);
		TERMINAL_231.addFollower(TERMINAL_42);
		TERMINAL_231.addFollower(TERMINAL_47);
		TERMINAL_231.addFollower(TERMINAL_43);
		TERMINAL_232.addFollower(TERMINAL_26);
		TERMINAL_232.addFollower(TERMINAL_27);
		TERMINAL_232.addFollower(TERMINAL_24);
		TERMINAL_232.addFollower(TERMINAL_193);
		TERMINAL_232.addFollower(TERMINAL_22);
		TERMINAL_232.addFollower(TERMINAL_23);
		TERMINAL_232.addFollower(TERMINAL_25);
		TERMINAL_232.addFollower(TERMINAL_194);
		TERMINAL_232.addFollower(TERMINAL_42);
		TERMINAL_232.addFollower(TERMINAL_47);
		TERMINAL_232.addFollower(TERMINAL_43);
		TERMINAL_27.addFollower(TERMINAL_233);
		TERMINAL_233.addFollower(TERMINAL_28);
		TERMINAL_233.addFollower(TERMINAL_29);
		TERMINAL_233.addFollower(TERMINAL_234);
		TERMINAL_233.addFollower(TERMINAL_26);
		TERMINAL_233.addFollower(TERMINAL_27);
		TERMINAL_233.addFollower(TERMINAL_24);
		TERMINAL_233.addFollower(TERMINAL_193);
		TERMINAL_233.addFollower(TERMINAL_22);
		TERMINAL_233.addFollower(TERMINAL_23);
		TERMINAL_233.addFollower(TERMINAL_25);
		TERMINAL_233.addFollower(TERMINAL_194);
		TERMINAL_233.addFollower(TERMINAL_42);
		TERMINAL_233.addFollower(TERMINAL_47);
		TERMINAL_233.addFollower(TERMINAL_43);
		TERMINAL_235.addFollower(TERMINAL_28);
		TERMINAL_235.addFollower(TERMINAL_29);
		TERMINAL_234.addFollower(TERMINAL_26);
		TERMINAL_234.addFollower(TERMINAL_27);
		TERMINAL_234.addFollower(TERMINAL_24);
		TERMINAL_234.addFollower(TERMINAL_193);
		TERMINAL_234.addFollower(TERMINAL_22);
		TERMINAL_234.addFollower(TERMINAL_23);
		TERMINAL_234.addFollower(TERMINAL_25);
		TERMINAL_234.addFollower(TERMINAL_194);
		TERMINAL_234.addFollower(TERMINAL_42);
		TERMINAL_234.addFollower(TERMINAL_47);
		TERMINAL_234.addFollower(TERMINAL_43);
		TERMINAL_28.addFollower(TERMINAL_236);
		TERMINAL_236.addFollower(TERMINAL_237);
		TERMINAL_237.addFollower(TERMINAL_238);
		TERMINAL_238.addFollower(TERMINAL_239);
		TERMINAL_239.addFollower(TERMINAL_240);
		TERMINAL_239.addFollower(TERMINAL_235);
		TERMINAL_239.addFollower(TERMINAL_234);
		TERMINAL_239.addFollower(TERMINAL_26);
		TERMINAL_239.addFollower(TERMINAL_27);
		TERMINAL_239.addFollower(TERMINAL_24);
		TERMINAL_239.addFollower(TERMINAL_193);
		TERMINAL_239.addFollower(TERMINAL_22);
		TERMINAL_239.addFollower(TERMINAL_23);
		TERMINAL_239.addFollower(TERMINAL_25);
		TERMINAL_239.addFollower(TERMINAL_194);
		TERMINAL_239.addFollower(TERMINAL_42);
		TERMINAL_239.addFollower(TERMINAL_47);
		TERMINAL_239.addFollower(TERMINAL_43);
		TERMINAL_240.addFollower(TERMINAL_235);
		TERMINAL_240.addFollower(TERMINAL_234);
		TERMINAL_240.addFollower(TERMINAL_26);
		TERMINAL_240.addFollower(TERMINAL_27);
		TERMINAL_240.addFollower(TERMINAL_24);
		TERMINAL_240.addFollower(TERMINAL_193);
		TERMINAL_240.addFollower(TERMINAL_22);
		TERMINAL_240.addFollower(TERMINAL_23);
		TERMINAL_240.addFollower(TERMINAL_25);
		TERMINAL_240.addFollower(TERMINAL_194);
		TERMINAL_240.addFollower(TERMINAL_42);
		TERMINAL_240.addFollower(TERMINAL_47);
		TERMINAL_240.addFollower(TERMINAL_43);
		TERMINAL_29.addFollower(TERMINAL_241);
		TERMINAL_241.addFollower(TERMINAL_242);
		TERMINAL_242.addFollower(TERMINAL_243);
		TERMINAL_243.addFollower(TERMINAL_244);
		TERMINAL_244.addFollower(TERMINAL_245);
		TERMINAL_244.addFollower(TERMINAL_235);
		TERMINAL_244.addFollower(TERMINAL_234);
		TERMINAL_244.addFollower(TERMINAL_26);
		TERMINAL_244.addFollower(TERMINAL_27);
		TERMINAL_244.addFollower(TERMINAL_24);
		TERMINAL_244.addFollower(TERMINAL_193);
		TERMINAL_244.addFollower(TERMINAL_22);
		TERMINAL_244.addFollower(TERMINAL_23);
		TERMINAL_244.addFollower(TERMINAL_25);
		TERMINAL_244.addFollower(TERMINAL_194);
		TERMINAL_244.addFollower(TERMINAL_42);
		TERMINAL_244.addFollower(TERMINAL_47);
		TERMINAL_244.addFollower(TERMINAL_43);
		TERMINAL_245.addFollower(TERMINAL_235);
		TERMINAL_245.addFollower(TERMINAL_234);
		TERMINAL_245.addFollower(TERMINAL_26);
		TERMINAL_245.addFollower(TERMINAL_27);
		TERMINAL_245.addFollower(TERMINAL_24);
		TERMINAL_245.addFollower(TERMINAL_193);
		TERMINAL_245.addFollower(TERMINAL_22);
		TERMINAL_245.addFollower(TERMINAL_23);
		TERMINAL_245.addFollower(TERMINAL_25);
		TERMINAL_245.addFollower(TERMINAL_194);
		TERMINAL_245.addFollower(TERMINAL_42);
		TERMINAL_245.addFollower(TERMINAL_47);
		TERMINAL_245.addFollower(TERMINAL_43);
		TERMINAL_19.addFollower(TERMINAL_246);
		TERMINAL_19.addFollower(TERMINAL_247);
		TERMINAL_19.addFollower(TERMINAL_248);
		TERMINAL_19.addFollower(TERMINAL_249);
		TERMINAL_246.addFollower(TERMINAL_247);
		TERMINAL_246.addFollower(TERMINAL_248);
		TERMINAL_246.addFollower(TERMINAL_249);
		TERMINAL_247.addFollower(TERMINAL_248);
		TERMINAL_247.addFollower(TERMINAL_249);
		TERMINAL_248.addFollower(TERMINAL_36);
		TERMINAL_249.addFollower(TERMINAL_33);
		TERMINAL_249.addFollower(TERMINAL_41);
		TERMINAL_249.addFollower(TERMINAL_37);
		TERMINAL_249.addFollower(TERMINAL_38);
		TERMINAL_249.addFollower(TERMINAL_250);
		TERMINAL_250.addFollower(TERMINAL_17);
		TERMINAL_250.addFollower(TERMINAL_18);
		TERMINAL_250.addFollower(TERMINAL_19);
		TERMINAL_250.addFollower(TERMINAL_20);
		TERMINAL_250.addFollower(TERMINAL_21);
		TERMINAL_250.addFollower(TERMINAL_42);
		TERMINAL_250.addFollower(TERMINAL_47);
		TERMINAL_250.addFollower(TERMINAL_43);
		TERMINAL_20.addFollower(TERMINAL_251);
		TERMINAL_20.addFollower(TERMINAL_252);
		TERMINAL_20.addFollower(TERMINAL_253);
		TERMINAL_20.addFollower(TERMINAL_254);
		TERMINAL_251.addFollower(TERMINAL_252);
		TERMINAL_251.addFollower(TERMINAL_253);
		TERMINAL_251.addFollower(TERMINAL_254);
		TERMINAL_252.addFollower(TERMINAL_253);
		TERMINAL_252.addFollower(TERMINAL_254);
		TERMINAL_253.addFollower(TERMINAL_36);
		TERMINAL_254.addFollower(TERMINAL_33);
		TERMINAL_254.addFollower(TERMINAL_41);
		TERMINAL_254.addFollower(TERMINAL_37);
		TERMINAL_254.addFollower(TERMINAL_38);
		TERMINAL_254.addFollower(TERMINAL_255);
		TERMINAL_255.addFollower(TERMINAL_17);
		TERMINAL_255.addFollower(TERMINAL_18);
		TERMINAL_255.addFollower(TERMINAL_19);
		TERMINAL_255.addFollower(TERMINAL_20);
		TERMINAL_255.addFollower(TERMINAL_21);
		TERMINAL_255.addFollower(TERMINAL_42);
		TERMINAL_255.addFollower(TERMINAL_47);
		TERMINAL_255.addFollower(TERMINAL_43);
		TERMINAL_30.addFollower(TERMINAL_256);
		TERMINAL_30.addFollower(TERMINAL_257);
		TERMINAL_30.addFollower(TERMINAL_258);
		TERMINAL_256.addFollower(TERMINAL_257);
		TERMINAL_256.addFollower(TERMINAL_258);
		TERMINAL_257.addFollower(TERMINAL_258);
		TERMINAL_258.addFollower(TERMINAL_31);
		TERMINAL_258.addFollower(TERMINAL_32);
		TERMINAL_258.addFollower(TERMINAL_259);
		TERMINAL_258.addFollower(TERMINAL_260);
		TERMINAL_259.addFollower(TERMINAL_31);
		TERMINAL_259.addFollower(TERMINAL_32);
		TERMINAL_260.addFollower(TERMINAL_261);
		TERMINAL_260.addFollower(TERMINAL_262);
		TERMINAL_260.addFollower(TERMINAL_30);
		TERMINAL_260.addFollower(TERMINAL_263);
		TERMINAL_260.addFollower(TERMINAL_264);
		TERMINAL_260.addFollower(TERMINAL_42);
		TERMINAL_260.addFollower(TERMINAL_47);
		TERMINAL_260.addFollower(TERMINAL_43);
		TERMINAL_261.addFollower(TERMINAL_31);
		TERMINAL_261.addFollower(TERMINAL_32);
		TERMINAL_262.addFollower(TERMINAL_31);
		TERMINAL_262.addFollower(TERMINAL_32);
		TERMINAL_31.addFollower(TERMINAL_265);
		TERMINAL_31.addFollower(TERMINAL_266);
		TERMINAL_31.addFollower(TERMINAL_259);
		TERMINAL_31.addFollower(TERMINAL_260);
		TERMINAL_31.addFollower(TERMINAL_42);
		TERMINAL_31.addFollower(TERMINAL_47);
		TERMINAL_31.addFollower(TERMINAL_43);
		TERMINAL_32.addFollower(TERMINAL_265);
		TERMINAL_32.addFollower(TERMINAL_266);
		TERMINAL_32.addFollower(TERMINAL_259);
		TERMINAL_32.addFollower(TERMINAL_260);
		TERMINAL_32.addFollower(TERMINAL_42);
		TERMINAL_32.addFollower(TERMINAL_47);
		TERMINAL_32.addFollower(TERMINAL_43);
		TERMINAL_265.addFollower(TERMINAL_266);
		TERMINAL_265.addFollower(TERMINAL_259);
		TERMINAL_265.addFollower(TERMINAL_260);
		TERMINAL_265.addFollower(TERMINAL_42);
		TERMINAL_265.addFollower(TERMINAL_47);
		TERMINAL_265.addFollower(TERMINAL_43);
		TERMINAL_266.addFollower(TERMINAL_259);
		TERMINAL_266.addFollower(TERMINAL_260);
		TERMINAL_266.addFollower(TERMINAL_42);
		TERMINAL_266.addFollower(TERMINAL_47);
		TERMINAL_266.addFollower(TERMINAL_43);
		TERMINAL_17.addFollower(TERMINAL_267);
		TERMINAL_267.addFollower(TERMINAL_268);
		TERMINAL_267.addFollower(TERMINAL_269);
		TERMINAL_267.addFollower(TERMINAL_270);
		TERMINAL_268.addFollower(TERMINAL_269);
		TERMINAL_268.addFollower(TERMINAL_270);
		TERMINAL_269.addFollower(TERMINAL_270);
		TERMINAL_270.addFollower(TERMINAL_30);
		TERMINAL_270.addFollower(TERMINAL_263);
		TERMINAL_263.addFollower(TERMINAL_17);
		TERMINAL_263.addFollower(TERMINAL_18);
		TERMINAL_263.addFollower(TERMINAL_19);
		TERMINAL_263.addFollower(TERMINAL_20);
		TERMINAL_263.addFollower(TERMINAL_21);
		TERMINAL_263.addFollower(TERMINAL_42);
		TERMINAL_263.addFollower(TERMINAL_47);
		TERMINAL_263.addFollower(TERMINAL_43);
		TERMINAL_18.addFollower(TERMINAL_271);
		TERMINAL_271.addFollower(TERMINAL_272);
		TERMINAL_271.addFollower(TERMINAL_273);
		TERMINAL_271.addFollower(TERMINAL_274);
		TERMINAL_272.addFollower(TERMINAL_273);
		TERMINAL_272.addFollower(TERMINAL_274);
		TERMINAL_273.addFollower(TERMINAL_274);
		TERMINAL_274.addFollower(TERMINAL_30);
		TERMINAL_274.addFollower(TERMINAL_264);
		TERMINAL_264.addFollower(TERMINAL_17);
		TERMINAL_264.addFollower(TERMINAL_18);
		TERMINAL_264.addFollower(TERMINAL_19);
		TERMINAL_264.addFollower(TERMINAL_20);
		TERMINAL_264.addFollower(TERMINAL_21);
		TERMINAL_264.addFollower(TERMINAL_42);
		TERMINAL_264.addFollower(TERMINAL_47);
		TERMINAL_264.addFollower(TERMINAL_43);
		TERMINAL_33.addFollower(TERMINAL_275);
		TERMINAL_33.addFollower(TERMINAL_276);
		TERMINAL_275.addFollower(TERMINAL_276);
		TERMINAL_276.addFollower(TERMINAL_277);
		TERMINAL_276.addFollower(TERMINAL_278);
		TERMINAL_276.addFollower(TERMINAL_279);
		TERMINAL_277.addFollower(TERMINAL_278);
		TERMINAL_277.addFollower(TERMINAL_279);
		TERMINAL_278.addFollower(TERMINAL_279);
		TERMINAL_279.addFollower(TERMINAL_280);
		TERMINAL_279.addFollower(TERMINAL_281);
		TERMINAL_279.addFollower(TERMINAL_282);
		TERMINAL_279.addFollower(TERMINAL_33);
		TERMINAL_279.addFollower(TERMINAL_41);
		TERMINAL_279.addFollower(TERMINAL_37);
		TERMINAL_279.addFollower(TERMINAL_38);
		TERMINAL_279.addFollower(TERMINAL_250);
		TERMINAL_279.addFollower(TERMINAL_255);
		TERMINAL_279.addFollower(TERMINAL_42);
		TERMINAL_279.addFollower(TERMINAL_47);
		TERMINAL_279.addFollower(TERMINAL_43);
		TERMINAL_280.addFollower(TERMINAL_282);
		TERMINAL_280.addFollower(TERMINAL_33);
		TERMINAL_280.addFollower(TERMINAL_41);
		TERMINAL_280.addFollower(TERMINAL_37);
		TERMINAL_280.addFollower(TERMINAL_38);
		TERMINAL_280.addFollower(TERMINAL_250);
		TERMINAL_280.addFollower(TERMINAL_255);
		TERMINAL_280.addFollower(TERMINAL_42);
		TERMINAL_280.addFollower(TERMINAL_47);
		TERMINAL_280.addFollower(TERMINAL_43);
		TERMINAL_281.addFollower(TERMINAL_282);
		TERMINAL_281.addFollower(TERMINAL_33);
		TERMINAL_281.addFollower(TERMINAL_41);
		TERMINAL_281.addFollower(TERMINAL_37);
		TERMINAL_281.addFollower(TERMINAL_38);
		TERMINAL_281.addFollower(TERMINAL_250);
		TERMINAL_281.addFollower(TERMINAL_255);
		TERMINAL_281.addFollower(TERMINAL_42);
		TERMINAL_281.addFollower(TERMINAL_47);
		TERMINAL_281.addFollower(TERMINAL_43);
		TERMINAL_282.addFollower(TERMINAL_283);
		TERMINAL_283.addFollower(TERMINAL_284);
		TERMINAL_284.addFollower(TERMINAL_285);
		TERMINAL_285.addFollower(TERMINAL_286);
		TERMINAL_286.addFollower(TERMINAL_33);
		TERMINAL_286.addFollower(TERMINAL_41);
		TERMINAL_286.addFollower(TERMINAL_37);
		TERMINAL_286.addFollower(TERMINAL_38);
		TERMINAL_286.addFollower(TERMINAL_250);
		TERMINAL_286.addFollower(TERMINAL_255);
		TERMINAL_286.addFollower(TERMINAL_42);
		TERMINAL_286.addFollower(TERMINAL_47);
		TERMINAL_286.addFollower(TERMINAL_43);
		TERMINAL_34.addFollower(TERMINAL_287);
		TERMINAL_287.addFollower(TERMINAL_288);
		TERMINAL_288.addFollower(TERMINAL_289);
		TERMINAL_289.addFollower(TERMINAL_290);
		TERMINAL_290.addFollower(TERMINAL_291);
		TERMINAL_291.addFollower(TERMINAL_292);
		TERMINAL_292.addFollower(TERMINAL_293);
		TERMINAL_293.addFollower(TERMINAL_294);
		TERMINAL_294.addFollower(TERMINAL_192);
		TERMINAL_294.addFollower(TERMINAL_203);
		TERMINAL_294.addFollower(TERMINAL_42);
		TERMINAL_294.addFollower(TERMINAL_47);
		TERMINAL_294.addFollower(TERMINAL_43);
		TERMINAL_35.addFollower(TERMINAL_295);
		TERMINAL_35.addFollower(TERMINAL_296);
		TERMINAL_295.addFollower(TERMINAL_296);
		TERMINAL_296.addFollower(TERMINAL_297);
		TERMINAL_297.addFollower(TERMINAL_192);
		TERMINAL_297.addFollower(TERMINAL_203);
		TERMINAL_297.addFollower(TERMINAL_42);
		TERMINAL_297.addFollower(TERMINAL_47);
		TERMINAL_297.addFollower(TERMINAL_43);
		TERMINAL_36.addFollower(TERMINAL_249);
		TERMINAL_36.addFollower(TERMINAL_254);
		TERMINAL_36.addFollower(TERMINAL_42);
		TERMINAL_36.addFollower(TERMINAL_47);
		TERMINAL_36.addFollower(TERMINAL_43);
		TERMINAL_37.addFollower(TERMINAL_298);
		TERMINAL_37.addFollower(TERMINAL_299);
		TERMINAL_37.addFollower(TERMINAL_300);
		TERMINAL_298.addFollower(TERMINAL_299);
		TERMINAL_298.addFollower(TERMINAL_300);
		TERMINAL_299.addFollower(TERMINAL_300);
		TERMINAL_300.addFollower(TERMINAL_301);
		TERMINAL_300.addFollower(TERMINAL_302);
		TERMINAL_301.addFollower(TERMINAL_303);
		TERMINAL_301.addFollower(TERMINAL_33);
		TERMINAL_301.addFollower(TERMINAL_41);
		TERMINAL_301.addFollower(TERMINAL_37);
		TERMINAL_301.addFollower(TERMINAL_38);
		TERMINAL_301.addFollower(TERMINAL_250);
		TERMINAL_301.addFollower(TERMINAL_255);
		TERMINAL_301.addFollower(TERMINAL_42);
		TERMINAL_301.addFollower(TERMINAL_47);
		TERMINAL_301.addFollower(TERMINAL_43);
		TERMINAL_302.addFollower(TERMINAL_303);
		TERMINAL_302.addFollower(TERMINAL_33);
		TERMINAL_302.addFollower(TERMINAL_41);
		TERMINAL_302.addFollower(TERMINAL_37);
		TERMINAL_302.addFollower(TERMINAL_38);
		TERMINAL_302.addFollower(TERMINAL_250);
		TERMINAL_302.addFollower(TERMINAL_255);
		TERMINAL_302.addFollower(TERMINAL_42);
		TERMINAL_302.addFollower(TERMINAL_47);
		TERMINAL_302.addFollower(TERMINAL_43);
		TERMINAL_303.addFollower(TERMINAL_304);
		TERMINAL_304.addFollower(TERMINAL_33);
		TERMINAL_304.addFollower(TERMINAL_41);
		TERMINAL_304.addFollower(TERMINAL_37);
		TERMINAL_304.addFollower(TERMINAL_38);
		TERMINAL_304.addFollower(TERMINAL_250);
		TERMINAL_304.addFollower(TERMINAL_255);
		TERMINAL_304.addFollower(TERMINAL_42);
		TERMINAL_304.addFollower(TERMINAL_47);
		TERMINAL_304.addFollower(TERMINAL_43);
		TERMINAL_38.addFollower(TERMINAL_305);
		TERMINAL_38.addFollower(TERMINAL_306);
		TERMINAL_38.addFollower(TERMINAL_307);
		TERMINAL_305.addFollower(TERMINAL_306);
		TERMINAL_305.addFollower(TERMINAL_307);
		TERMINAL_306.addFollower(TERMINAL_307);
	}
	public static void wire3() {
		TERMINAL_307.addFollower(TERMINAL_308);
		TERMINAL_308.addFollower(TERMINAL_309);
		TERMINAL_308.addFollower(TERMINAL_310);
		TERMINAL_309.addFollower(TERMINAL_311);
		TERMINAL_310.addFollower(TERMINAL_311);
		TERMINAL_311.addFollower(TERMINAL_312);
		TERMINAL_311.addFollower(TERMINAL_313);
		TERMINAL_312.addFollower(TERMINAL_314);
		TERMINAL_313.addFollower(TERMINAL_314);
		TERMINAL_314.addFollower(TERMINAL_315);
		TERMINAL_314.addFollower(TERMINAL_33);
		TERMINAL_314.addFollower(TERMINAL_41);
		TERMINAL_314.addFollower(TERMINAL_37);
		TERMINAL_314.addFollower(TERMINAL_38);
		TERMINAL_314.addFollower(TERMINAL_250);
		TERMINAL_314.addFollower(TERMINAL_255);
		TERMINAL_314.addFollower(TERMINAL_42);
		TERMINAL_314.addFollower(TERMINAL_47);
		TERMINAL_314.addFollower(TERMINAL_43);
		TERMINAL_315.addFollower(TERMINAL_316);
		TERMINAL_316.addFollower(TERMINAL_39);
		TERMINAL_316.addFollower(TERMINAL_317);
		TERMINAL_317.addFollower(TERMINAL_33);
		TERMINAL_317.addFollower(TERMINAL_41);
		TERMINAL_317.addFollower(TERMINAL_37);
		TERMINAL_317.addFollower(TERMINAL_38);
		TERMINAL_317.addFollower(TERMINAL_250);
		TERMINAL_317.addFollower(TERMINAL_255);
		TERMINAL_317.addFollower(TERMINAL_42);
		TERMINAL_317.addFollower(TERMINAL_47);
		TERMINAL_317.addFollower(TERMINAL_43);
		TERMINAL_39.addFollower(TERMINAL_318);
		TERMINAL_318.addFollower(TERMINAL_319);
		TERMINAL_318.addFollower(TERMINAL_320);
		TERMINAL_318.addFollower(TERMINAL_321);
		TERMINAL_319.addFollower(TERMINAL_322);
		TERMINAL_322.addFollower(TERMINAL_320);
		TERMINAL_322.addFollower(TERMINAL_321);
		TERMINAL_320.addFollower(TERMINAL_321);
		TERMINAL_321.addFollower(TERMINAL_39);
		TERMINAL_321.addFollower(TERMINAL_317);
		TERMINAL_321.addFollower(TERMINAL_42);
		TERMINAL_321.addFollower(TERMINAL_47);
		TERMINAL_321.addFollower(TERMINAL_43);
		TERMINAL_40.addFollower(TERMINAL_323);
		TERMINAL_40.addFollower(TERMINAL_324);
		TERMINAL_40.addFollower(TERMINAL_42);
		TERMINAL_40.addFollower(TERMINAL_47);
		TERMINAL_40.addFollower(TERMINAL_43);
		TERMINAL_41.addFollower(TERMINAL_325);
		TERMINAL_325.addFollower(TERMINAL_326);
		TERMINAL_325.addFollower(TERMINAL_327);
		TERMINAL_325.addFollower(TERMINAL_328);
		TERMINAL_326.addFollower(TERMINAL_327);
		TERMINAL_326.addFollower(TERMINAL_328);
		TERMINAL_327.addFollower(TERMINAL_328);
		TERMINAL_328.addFollower(TERMINAL_329);
		TERMINAL_328.addFollower(TERMINAL_330);
		TERMINAL_329.addFollower(TERMINAL_331);
		TERMINAL_330.addFollower(TERMINAL_331);
		TERMINAL_331.addFollower(TERMINAL_40);
		TERMINAL_323.addFollower(TERMINAL_40);
		TERMINAL_324.addFollower(TERMINAL_33);
		TERMINAL_324.addFollower(TERMINAL_41);
		TERMINAL_324.addFollower(TERMINAL_37);
		TERMINAL_324.addFollower(TERMINAL_38);
		TERMINAL_324.addFollower(TERMINAL_250);
		TERMINAL_324.addFollower(TERMINAL_255);
		TERMINAL_324.addFollower(TERMINAL_42);
		TERMINAL_324.addFollower(TERMINAL_47);
		TERMINAL_324.addFollower(TERMINAL_43);
		TERMINAL_14.addFollower(TERMINAL_332);
		TERMINAL_332.addFollower(TERMINAL_333);
		TERMINAL_333.addFollower(TERMINAL_15);
		TERMINAL_333.addFollower(TERMINAL_16);
		TERMINAL_333.addFollower(TERMINAL_17);
		TERMINAL_333.addFollower(TERMINAL_18);
		TERMINAL_333.addFollower(TERMINAL_19);
		TERMINAL_333.addFollower(TERMINAL_20);
		TERMINAL_333.addFollower(TERMINAL_21);
		TERMINAL_333.addFollower(TERMINAL_22);
		TERMINAL_333.addFollower(TERMINAL_23);
		TERMINAL_333.addFollower(TERMINAL_24);
		TERMINAL_333.addFollower(TERMINAL_25);
		TERMINAL_333.addFollower(TERMINAL_26);
		TERMINAL_333.addFollower(TERMINAL_27);
		TERMINAL_333.addFollower(TERMINAL_28);
		TERMINAL_333.addFollower(TERMINAL_29);
		TERMINAL_333.addFollower(TERMINAL_30);
		TERMINAL_333.addFollower(TERMINAL_31);
		TERMINAL_333.addFollower(TERMINAL_32);
		TERMINAL_333.addFollower(TERMINAL_33);
		TERMINAL_333.addFollower(TERMINAL_34);
		TERMINAL_333.addFollower(TERMINAL_35);
		TERMINAL_333.addFollower(TERMINAL_36);
		TERMINAL_333.addFollower(TERMINAL_37);
		TERMINAL_333.addFollower(TERMINAL_38);
		TERMINAL_333.addFollower(TERMINAL_39);
		TERMINAL_333.addFollower(TERMINAL_40);
		TERMINAL_333.addFollower(TERMINAL_41);
		TERMINAL_333.addFollower(TERMINAL_42);
		TERMINAL_333.addFollower(TERMINAL_43);
		TERMINAL_333.addFollower(TERMINAL_44);
		TERMINAL_43.addFollower(TERMINAL_334);
		TERMINAL_334.addFollower(TERMINAL_335);
		TERMINAL_335.addFollower(TERMINAL_15);
		TERMINAL_335.addFollower(TERMINAL_16);
		TERMINAL_335.addFollower(TERMINAL_17);
		TERMINAL_335.addFollower(TERMINAL_18);
		TERMINAL_335.addFollower(TERMINAL_19);
		TERMINAL_335.addFollower(TERMINAL_20);
		TERMINAL_335.addFollower(TERMINAL_21);
		TERMINAL_335.addFollower(TERMINAL_22);
		TERMINAL_335.addFollower(TERMINAL_23);
		TERMINAL_335.addFollower(TERMINAL_24);
		TERMINAL_335.addFollower(TERMINAL_25);
		TERMINAL_335.addFollower(TERMINAL_26);
		TERMINAL_335.addFollower(TERMINAL_27);
		TERMINAL_335.addFollower(TERMINAL_28);
		TERMINAL_335.addFollower(TERMINAL_29);
		TERMINAL_335.addFollower(TERMINAL_30);
		TERMINAL_335.addFollower(TERMINAL_31);
		TERMINAL_335.addFollower(TERMINAL_32);
		TERMINAL_335.addFollower(TERMINAL_33);
		TERMINAL_335.addFollower(TERMINAL_34);
		TERMINAL_335.addFollower(TERMINAL_35);
		TERMINAL_335.addFollower(TERMINAL_36);
		TERMINAL_335.addFollower(TERMINAL_37);
		TERMINAL_335.addFollower(TERMINAL_38);
		TERMINAL_335.addFollower(TERMINAL_39);
		TERMINAL_335.addFollower(TERMINAL_40);
		TERMINAL_335.addFollower(TERMINAL_41);
		TERMINAL_335.addFollower(TERMINAL_42);
		TERMINAL_335.addFollower(TERMINAL_43);
		TERMINAL_335.addFollower(TERMINAL_44);
		TERMINAL_42.addFollower(TERMINAL_336);
		TERMINAL_336.addFollower(TERMINAL_337);
		TERMINAL_338.addFollower(TERMINAL_337);
		TERMINAL_339.addFollower(TERMINAL_47);
		TERMINAL_339.addFollower(TERMINAL_43);
		TERMINAL_13.addFollower(TERMINAL_340);
		TERMINAL_340.addFollower(TERMINAL_341);
		TERMINAL_341.addFollower(TERMINAL_342);
		TERMINAL_342.addFollower(TERMINAL_343);
		TERMINAL_343.addFollower(TERMINAL_344);
		TERMINAL_344.addFollower(TERMINAL_345);
		TERMINAL_345.addFollower(TERMINAL_14);
		TERMINAL_345.addFollower(TERMINAL_15);
		TERMINAL_345.addFollower(TERMINAL_16);
		TERMINAL_345.addFollower(TERMINAL_17);
		TERMINAL_345.addFollower(TERMINAL_18);
		TERMINAL_345.addFollower(TERMINAL_19);
		TERMINAL_345.addFollower(TERMINAL_20);
		TERMINAL_345.addFollower(TERMINAL_21);
		TERMINAL_345.addFollower(TERMINAL_22);
		TERMINAL_345.addFollower(TERMINAL_23);
		TERMINAL_345.addFollower(TERMINAL_24);
		TERMINAL_345.addFollower(TERMINAL_25);
		TERMINAL_345.addFollower(TERMINAL_26);
		TERMINAL_345.addFollower(TERMINAL_27);
		TERMINAL_345.addFollower(TERMINAL_28);
		TERMINAL_345.addFollower(TERMINAL_29);
		TERMINAL_345.addFollower(TERMINAL_30);
		TERMINAL_345.addFollower(TERMINAL_31);
		TERMINAL_345.addFollower(TERMINAL_32);
		TERMINAL_345.addFollower(TERMINAL_33);
		TERMINAL_345.addFollower(TERMINAL_34);
		TERMINAL_345.addFollower(TERMINAL_35);
		TERMINAL_345.addFollower(TERMINAL_36);
		TERMINAL_345.addFollower(TERMINAL_37);
		TERMINAL_345.addFollower(TERMINAL_38);
		TERMINAL_345.addFollower(TERMINAL_39);
		TERMINAL_345.addFollower(TERMINAL_40);
		TERMINAL_345.addFollower(TERMINAL_41);
		TERMINAL_345.addFollower(TERMINAL_42);
		TERMINAL_345.addFollower(TERMINAL_43);
		TERMINAL_345.addFollower(TERMINAL_44);
		TERMINAL_337.addFollower(TERMINAL_346);
		TERMINAL_346.addFollower(TERMINAL_347);
		TERMINAL_347.addFollower(TERMINAL_348);
		TERMINAL_348.addFollower(TERMINAL_338);
		TERMINAL_348.addFollower(TERMINAL_339);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_0, 0));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_1, 1));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.CoreFactory.eINSTANCE.createAdapter();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_2, 2));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_3, 3));
	}
	
	(
		a3_0 = parse_org_smartadapters_core_Aspect		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 4));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_5, 5));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 6));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 6));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 6));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 6));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 6));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 6));
	}
	
	(
		(
			(
				a6_0 = parse_org_smartadapters_core_Adaptation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 7));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 7));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 7));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 7));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 7));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 7));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 8));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 8));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 8));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 8));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 8));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 8));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_12, 10));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_13, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_14, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 11));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 11));
	}
	
	(
		a2_0 = parse_patternframework_ModelPattern		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 12));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_45, 13));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_46, 14));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 15));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 15));
	}
	
	(
		(
			a6_0 = parse_patternframework_PModel			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 16));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 17));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_48, 18));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 18));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_49, 19));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_50, 20));
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
					}
					if (a10 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a10).getLine(), ((org.antlr.runtime.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a10).getStartIndex(), ((org.antlr.runtime.CommonToken) a10).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.Aspect, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_51, 21));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 21));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_52, 22));
					}
					
					(
						a12 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.CoreFactory.eINSTANCE.createAspect();
							}
							if (a12 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.Aspect, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_51, 23));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 23));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_51, 24));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 24));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_4, 25));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_53, 26));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_54, 27));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.System proxy = pattern.art.ArtFactory.eINSTANCE.createSystem();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.System>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemSystemToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_55, 28));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 29));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 29));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 29));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 29));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 29));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_61, 30));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_62, 31));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefrootReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 32));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 32));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 32));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 32));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 32));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_63, 33));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_64, 34));
			}
			
			(
				a9 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_65, 35));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 35));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 35));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 35));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 35));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 35));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_66, 36));
					}
					
					(
						a11 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a11 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_65, 37));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 37));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 37));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 37));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 37));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 37));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_65, 38));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 38));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 38));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 38));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 38));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 38));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_67, 39));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_68, 40));
			}
			
			(
				a14 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a14 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a14).getLine(), ((org.antlr.runtime.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a14).getStartIndex(), ((org.antlr.runtime.CommonToken) a14).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_69, 41));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 41));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 41));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 41));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 41));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 41));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_70, 42));
					}
					
					(
						a16 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a16 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a16).getLine(), ((org.antlr.runtime.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a16).getStartIndex(), ((org.antlr.runtime.CommonToken) a16).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_69, 43));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 43));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 43));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 43));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 43));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 43));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_69, 44));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 44));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 44));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 44));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 44));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 44));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_71, 45));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_72, 46));
			}
			
			(
				a19 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
					}
					if (a19 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a19).getLine(), ((org.antlr.runtime.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a19).getStartIndex(), ((org.antlr.runtime.CommonToken) a19).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_73, 47));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 47));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 47));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 47));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 47));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 47));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_74, 48));
					}
					
					(
						a21 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeSystem();
							}
							if (a21 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a21).getLine(), ((org.antlr.runtime.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a21).getStartIndex(), ((org.antlr.runtime.CommonToken) a21).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeSystem, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_73, 49));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 49));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 49));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 49));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 49));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 49));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_73, 50));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 50));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 50));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 50));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 50));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 50));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_56, 51));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_57, 51));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_58, 51));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_59, 51));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_60, 51));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 52));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 52));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 52));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 52));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 52));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 52));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_75, 53));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_76, 54));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_77, 55));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 56));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 56));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_85, 57));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_86, 58));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceReftypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 59));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 59));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_87, 60));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_88, 61));
			}
			
			(
				a9 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 62));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 62));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_89, 63));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_90, 64));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 65));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 65));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_91, 66));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_92, 67));
			}
			
			(
				a15 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a15 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a15).getLine(), ((org.antlr.runtime.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a15).getStartIndex(), ((org.antlr.runtime.CommonToken) a15).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_93, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 68));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 68));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_94, 69));
					}
					
					(
						a17 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
							}
							if (a17 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a17).getLine(), ((org.antlr.runtime.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a17).getStartIndex(), ((org.antlr.runtime.CommonToken) a17).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_93, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 70));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 70));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_93, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 71));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 71));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_95, 72));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_96, 73));
			}
			
			(
				a20 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a20 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a20).getLine(), ((org.antlr.runtime.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a20).getStartIndex(), ((org.antlr.runtime.CommonToken) a20).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_97, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 74));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 74));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_98, 75));
					}
					
					(
						a22 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
							}
							if (a22 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a22).getLine(), ((org.antlr.runtime.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a22).getStartIndex(), ((org.antlr.runtime.CommonToken) a22).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_97, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 76));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 76));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_97, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 77));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 77));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_99, 78));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_100, 79));
			}
			
			(
				a25 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceComponentInstance();
					}
					if (a25 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 80));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 80));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_78, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_79, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_80, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_81, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_82, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_83, 81));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_84, 81));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 82));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 82));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 82));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 82));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 82));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 82));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_101, 83));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_102, 84));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_103, 85));
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.PrimitiveInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.PrimitiveInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_104, 86));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 87));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 87));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_112, 88));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_113, 89));
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceReftypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 90));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 90));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_114, 91));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_115, 92));
			}
			
			(
				a10 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a10 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 93));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 93));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_116, 94));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_117, 95));
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a13 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a13).getLine(), ((org.antlr.runtime.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a13).getStartIndex(), ((org.antlr.runtime.CommonToken) a13).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 96));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 96));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_118, 97));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_119, 98));
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a16 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a16).getLine(), ((org.antlr.runtime.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a16).getStartIndex(), ((org.antlr.runtime.CommonToken) a16).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_120, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 99));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 99));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_121, 100));
					}
					
					(
						a18 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
							}
							if (a18 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a18).getLine(), ((org.antlr.runtime.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a18).getStartIndex(), ((org.antlr.runtime.CommonToken) a18).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_120, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 101));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 101));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_120, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 102));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 102));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_122, 103));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_123, 104));
			}
			
			(
				a21 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a21 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a21.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a21).getLine(), ((org.antlr.runtime.CommonToken) a21).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a21).getStartIndex(), ((org.antlr.runtime.CommonToken) a21).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_124, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 105));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 105));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_125, 106));
					}
					
					(
						a23 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
							}
							if (a23 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a23).getLine(), ((org.antlr.runtime.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a23).getStartIndex(), ((org.antlr.runtime.CommonToken) a23).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_124, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 107));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 107));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_124, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 108));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 108));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_126, 109));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_127, 110));
			}
			
			(
				a26 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstancePrimitiveInstance();
					}
					if (a26 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 111));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 111));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_105, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_106, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_107, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_108, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_109, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_110, 112));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_111, 112));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 113));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 113));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 113));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 113));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 113));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 113));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_128, 114));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_129, 115));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_130, 116));
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_131, 117));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 118));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 118));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_140, 119));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_141, 120));
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_142, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 121));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 121));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_143, 122));
					}
					
					(
						a9 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a9 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_142, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 123));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 123));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_142, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 124));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 124));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_144, 125));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_145, 126));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.DelegationBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.DelegationBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_146, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 127));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 127));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_147, 128));
					}
					
					(
						a14 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a14 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a14).getLine(), ((org.antlr.runtime.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a14).getStartIndex(), ((org.antlr.runtime.CommonToken) a14).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.DelegationBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.DelegationBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_146, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 129));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 129));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_146, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 130));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 130));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_148, 131));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_149, 132));
			}
			
			(
				a17 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a17 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 133));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 133));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_150, 134));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_151, 135));
			}
			
			(
				a20 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a20 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a20).getLine(), ((org.antlr.runtime.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a20).getStartIndex(), ((org.antlr.runtime.CommonToken) a20).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.CompositeInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.CompositeInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 136));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 136));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_152, 137));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_153, 138));
			}
			
			(
				a23 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a23 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a23).getLine(), ((org.antlr.runtime.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a23).getStartIndex(), ((org.antlr.runtime.CommonToken) a23).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_154, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 139));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 139));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_155, 140));
					}
					
					(
						a25 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a25 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a25.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a25).getLine(), ((org.antlr.runtime.CommonToken) a25).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a25).getStartIndex(), ((org.antlr.runtime.CommonToken) a25).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.ValuedAttribute proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.ValuedAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_154, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 141));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 141));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_154, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 142));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 142));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_156, 143));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_157, 144));
			}
			
			(
				a28 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a28 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a28.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a28).getLine(), ((org.antlr.runtime.CommonToken) a28).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a28).getStartIndex(), ((org.antlr.runtime.CommonToken) a28).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_158, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 145));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 145));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_159, 146));
					}
					
					(
						a30 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
							}
							if (a30 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a30.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a30).getLine(), ((org.antlr.runtime.CommonToken) a30).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a30).getStartIndex(), ((org.antlr.runtime.CommonToken) a30).getStopIndex());
								}
								String resolved = (String) resolvedObject;
								pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
								collectHiddenTokens(element);
								registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), resolved, proxy);
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_158, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 147));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 147));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_158, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 148));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 148));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_160, 149));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_161, 150));
			}
			
			(
				a33 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceCompositeInstance();
					}
					if (a33 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 151));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 151));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_132, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_133, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_134, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_135, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_136, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_137, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_138, 152));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_139, 152));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 153));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 153));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 153));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 153));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 153));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 153));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_162, 154));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_163, 155));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.instance.TransmissionBinding proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.instance.TransmissionBinding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_164, 156));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 157));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 157));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 157));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 157));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 157));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_170, 158));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_171, 159));
			}
			
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefclientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 160));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 160));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 160));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 160));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 160));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_172, 161));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_173, 162));
			}
			
			(
				a9 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 163));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 163));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 163));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 163));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 163));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_174, 164));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_175, 165));
			}
			
			(
				a12 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), resolved, proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 166));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 166));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 166));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 166));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 166));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_176, 167));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_177, 168));
			}
			
			(
				a15 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = org.smartadapters.core.adaptations.AdaptationsFactory.eINSTANCE.createSetruntimeinstanceTransmissionBinding();
					}
					if (a15 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 169));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 169));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 169));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 169));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 169));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_165, 170));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_166, 170));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_167, 170));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_168, 170));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_169, 170));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_6, 171));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_7, 171));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_8, 171));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_9, 171));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_10, 171));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_11, 171));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_178, 172));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_179, 172));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_180, 172));
			}
			
			(
				(
					(
						a1 = TEXT						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = pattern.art.ArtFactory.eINSTANCE.createSystem();
							}
							if (a1 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_179, 173));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_180, 173));
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_179, 174));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_180, 174));
			}
			
			(
				(
					(
						a2 = TXTID						
						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = pattern.art.ArtFactory.eINSTANCE.createSystem();
							}
							if (a2 != null) {
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
								tokenResolver.setOptions(getOptions());
								org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), result);
								java.lang.Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String)resolvedObject;
								if (resolved != null) {
									element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), resolved);
									completedElement(resolved);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_180, 175));
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_180, 176));
			}
			
			a3 = ';' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 177));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 177));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 178));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 178));
	}
	
	(
		(
			a4 = 'root' {
				if (element == null) {
					element = pattern.art.ArtFactory.eINSTANCE.createSystem();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 179));
			}
			
			(
				a5_0 = parse_pattern_art_instance_CompositeInstance				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createSystem();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__ROOT), a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 180));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 180));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 181));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 181));
	}
	
	(
		(
			(
				(
					a6_0 = parse_pattern_art_type_Service					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a6_0 != null) {
							if (a6_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__SERVICES, a6_0);
								completedElement(a6_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a6_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 182));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 182));
				}
				
				
				|				(
					a7_0 = parse_pattern_art_type_ComponentType					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__TYPES, a7_0);
								completedElement(a7_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a7_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 183));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 183));
				}
				
				
				|				(
					a8_0 = parse_pattern_art_DataType					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.ArtFactory.eINSTANCE.createSystem();
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								addObjectToList(element, pattern.art.ArtPackage.SYSTEM__DATA_TYPES, a8_0);
								completedElement(a8_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a8_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 184));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 184));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 185));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 185));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 186));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 186));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_181, 187));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_182, 187));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_183, 187));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createDataType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_182, 188));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_183, 188));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_182, 189));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_183, 189));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.ArtFactory.eINSTANCE.createDataType();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_183, 190));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_183, 191));
	}
	
	a3 = ';' {
		if (element == null) {
			element = pattern.art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 192));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 192));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_184, 193));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_185, 194));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_186, 194));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_187, 194));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_186, 195));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_187, 195));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_186, 196));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_187, 196));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_187, 197));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_187, 198));
	}
	
	a4 = ':' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_188, 199));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_189, 199));
	}
	
	(
		(
			a5 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				if (a5 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.ComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_190, 200));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_191, 200));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 200));
		}
		
		
		|		a6 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_190, 201));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_191, 201));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 201));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_190, 202));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_191, 202));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 202));
	}
	
	(
		(
			(
				a7 = T_INSTANCE_STATE				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_191, 203));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 203));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_191, 204));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 204));
	}
	
	(
		(
			a8 = 'implementation' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 205));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 205));
			}
			
			(
				a9_0 = parse_pattern_art_implem_ComponentImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM), a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 206));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 207));
	}
	
	a10 = '{' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 208));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 208));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 208));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 208));
	}
	
	(
		(
			(
				(
					a11_0 = parse_pattern_art_instance_AttributeInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
						}
						if (a11_0 != null) {
							if (a11_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE, a11_0);
								completedElement(a11_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a11_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 209));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 209));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 209));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 209));
				}
				
				
				|				(
					a12_0 = parse_pattern_art_instance_TransmissionBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
						}
						if (a12_0 != null) {
							if (a12_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING, a12_0);
								completedElement(a12_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a12_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 210));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 210));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 210));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 210));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 211));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 211));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 211));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 211));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 212));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 212));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 212));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 212));
	}
	
	a13 = '}' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 213));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 213));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_195, 214));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_196, 215));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_197, 215));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_198, 215));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_197, 216));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_198, 216));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_197, 217));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_198, 217));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_198, 218));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_198, 219));
	}
	
	a4 = ':' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_199, 220));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_200, 220));
	}
	
	(
		(
			a5 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				if (a5 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.ComponentType proxy = pattern.art.type.TypeFactory.eINSTANCE.createComponentType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.ComponentInstance, pattern.art.type.ComponentType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_201, 221));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_202, 221));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 221));
		}
		
		
		|		a6 = '?' {
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_201, 222));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_202, 222));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 222));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_201, 223));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_202, 223));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 223));
	}
	
	(
		(
			(
				a7 = T_INSTANCE_STATE				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_202, 224));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 224));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_202, 225));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 225));
	}
	
	(
		(
			a8 = 'implementation' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 226));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 226));
			}
			
			(
				a9_0 = parse_pattern_art_implem_ComponentImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM), a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 227));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 228));
	}
	
	a10 = '{' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 229));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 229));
	}
	
	(
		(
			(
				(
					a11_0 = parse_pattern_art_instance_AttributeInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a11_0 != null) {
							if (a11_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE, a11_0);
								completedElement(a11_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a11_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 230));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 230));
				}
				
				
				|				(
					a12_0 = parse_pattern_art_instance_TransmissionBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a12_0 != null) {
							if (a12_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING, a12_0);
								completedElement(a12_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a12_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 231));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 231));
				}
				
				
				|				(
					a13_0 = parse_pattern_art_instance_ComponentInstance					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a13_0 != null) {
							if (a13_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, a13_0);
								completedElement(a13_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a13_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 232));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 232));
				}
				
				
				|				(
					a14_0 = parse_pattern_art_instance_DelegationBinding					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
						}
						if (a14_0 != null) {
							if (a14_0 != null) {
								addObjectToList(element, pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION, a14_0);
								completedElement(a14_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a14_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 233));
					addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 233));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 234));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 234));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 235));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 235));
	}
	
	a15 = '}' {
		if (element == null) {
			element = pattern.art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 236));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 236));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_204, 237));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_205, 237));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a1 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_206, 238));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_206, 239));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_206, 240));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_207, 241));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_208, 241));
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a4 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_209, 242));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_210, 243));
		}
		
		(
			a6 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				if (a6 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.TransmissionBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_211, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_212, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 244));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 244));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_211, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_212, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 245));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 245));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_211, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_212, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 246));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 246));
	}
	
	(
		(
			(
				a8 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					}
					if (a8 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_212, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 247));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 247));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_212, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 248));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 248));
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_213, 249));
			}
			
			a10 = 'id' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_214, 250));
			}
			
			a11 = '=' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_215, 251));
			}
			
			(
				a12 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_216, 252));
			}
			
			a13 = ')' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 253));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 253));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 254));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 254));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_217, 255));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_218, 255));
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a1 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.DelegationBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_219, 256));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_219, 257));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_219, 258));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_220, 259));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_221, 259));
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a4 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.instance.ComponentInstance proxy = pattern.art.instance.InstanceFactory.eINSTANCE.createComponentInstance();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.Binding, pattern.art.instance.ComponentInstance>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_222, 260));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_223, 261));
		}
		
		(
			a6 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				if (a6 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.AbstractPort proxy = pattern.art.type.TypeFactory.eINSTANCE.createAbstractPort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.DelegationBinding, pattern.art.type.AbstractPort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_224, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_225, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 262));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 262));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_224, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_225, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 263));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 263));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_224, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_225, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 264));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 264));
	}
	
	(
		(
			(
				a8 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					}
					if (a8 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_225, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 265));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 265));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_225, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 266));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 266));
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_226, 267));
			}
			
			a10 = 'id' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_227, 268));
			}
			
			a11 = '=' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_228, 269));
			}
			
			(
				a12 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					}
					if (a12 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a12).getLine(), ((org.antlr.runtime.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a12).getStartIndex(), ((org.antlr.runtime.CommonToken) a12).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a12, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_229, 270));
			}
			
			a13 = ')' {
				if (element == null) {
					element = pattern.art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 271));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 271));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 272));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 272));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.BasicAttribute proxy = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.ValuedAttribute, pattern.art.type.BasicAttribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_230, 273));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_231, 274));
	}
	
	(
		a2 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_232, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 275));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 275));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 276));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 276));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 277));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 277));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.Dictionary proxy = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.DictionaryValuedAttribute, pattern.art.type.Dictionary>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_233, 278));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 279));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 279));
	}
	
	(
		(
			(
				a2_0 = parse_pattern_art_instance_Entry				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 280));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 280));
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 281));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 281));
					}
					
					(
						a4_0 = parse_pattern_art_instance_Entry						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 282));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 282));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 283));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 283));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 284));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 284));
	}
	
	(
		(
			(
				a5 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
					}
					if (a5 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 285));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 285));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 286));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 286));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_236, 287));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				pattern.art.type.DictionaryDefaultValue proxy = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.instance.DefaultEntry, pattern.art.type.DictionaryDefaultValue>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_237, 288));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_238, 289));
	}
	
	(
		a3 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_239, 290));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_240, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 291));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 291));
	}
	
	(
		(
			(
				a5 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
					}
					if (a5 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 292));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 292));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 293));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 293));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_241, 294));
	}
	
	(
		a1 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_242, 295));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_243, 296));
	}
	
	(
		a3 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_244, 297));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_245, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 298));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 298));
	}
	
	(
		(
			(
				a5 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
					}
					if (a5 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 299));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 299));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_235, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_234, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_193, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_194, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 300));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 300));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_246, 301));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_247, 301));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_248, 301));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 301));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_247, 302));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_248, 302));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 302));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_247, 303));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_248, 303));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 303));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_248, 304));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 304));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_248, 305));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 305));
	}
	
	(
		(
			a3 = 'implementation' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 306));
			}
			
			(
				a4_0 = parse_pattern_art_implem_TypeImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM), a4_0);
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 307));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 308));
	}
	
	a5 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 309));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 309));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 309));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 309));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 309));
	}
	
	(
		(
			(
				a6_0 = parse_pattern_art_type_AbstractPort				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.PRIMITIVE_TYPE__PORT, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 310));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 310));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 310));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 310));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 310));
			}
			
			
			|			(
				a7_0 = parse_pattern_art_type_Attribute				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE, a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 311));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 311));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 311));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 311));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 311));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 312));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 312));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 312));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 312));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 312));
	}
	
	a8 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 313));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 313));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_251, 314));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_252, 314));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_253, 314));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 314));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_252, 315));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_253, 315));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 315));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_252, 316));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_253, 316));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 316));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_253, 317));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 317));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_253, 318));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 318));
	}
	
	(
		(
			a3 = 'implementation' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 319));
			}
			
			(
				a4_0 = parse_pattern_art_implem_TypeImplementation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__IMPLEM), a4_0);
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 320));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 321));
	}
	
	a5 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 322));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 322));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 322));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 322));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 322));
	}
	
	(
		(
			(
				a6_0 = parse_pattern_art_type_AbstractPort				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.COMPOSITE_TYPE__PORT, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 323));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 323));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 323));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 323));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 323));
			}
			
			
			|			(
				a7_0 = parse_pattern_art_type_Attribute				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE, a7_0);
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 324));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 324));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 324));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 324));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 324));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 325));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 325));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 325));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 325));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 325));
	}
	
	a8 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 326));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 326));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_256, 327));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_257, 327));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_258, 327));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_257, 328));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_258, 328));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_257, 329));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_258, 329));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_258, 330));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_258, 331));
	}
	
	a3 = '(' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 332));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 332));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 332));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 332));
	}
	
	(
		(
			(
				a4_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__INPUT, a4_0);
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 333));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 333));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 334));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 334));
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 335));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 335));
			}
			
			(
				a6_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 336));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 336));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 337));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 337));
	}
	
	a7 = ')' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_261, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_262, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 338));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 338));
	}
	
	(
		(
			a8 = ':' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 339));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 339));
			}
			
			(
				a9_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.OPERATION__OUTPUT, a9_0);
							completedElement(a9_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a9_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_262, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 340));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 340));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_262, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 341));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 341));
	}
	
	(
		(
			a10 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 342));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 342));
			}
			
			(
				a11_0 = parse_pattern_art_type_Parameter				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_262, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 343));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 343));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_262, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 344));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 344));
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
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
				}
				if (a0 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), resolved, proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_265, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_266, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 345));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 345));
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_265, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_266, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 346));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 346));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_265, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_266, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 347));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 347));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_266, 348));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 348));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 348));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 348));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 348));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 348));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_266, 349));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 349));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 349));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 349));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 349));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 349));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createParameter();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 350));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 350));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 350));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 350));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 350));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_259, 351));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_260, 351));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 351));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 351));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 351));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_267, 352));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_268, 353));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_269, 353));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_270, 353));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_269, 354));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_270, 354));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_269, 355));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_270, 355));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_270, 356));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_270, 357));
	}
	
	a4 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 358));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 358));
	}
	
	(
		(
			(
				a5_0 = parse_pattern_art_type_Operation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION, a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 359));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 359));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 360));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_263, 360));
	}
	
	a6 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 361));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 361));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_271, 362));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_272, 363));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_273, 363));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_274, 363));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_273, 364));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_274, 364));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_273, 365));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_274, 365));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_274, 366));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_274, 367));
	}
	
	a4 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 368));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 368));
	}
	
	(
		(
			(
				a5_0 = parse_pattern_art_type_Operation				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							addObjectToList(element, pattern.art.type.TypePackage.CONTROL_SERVICE__OPERATION, a5_0);
							completedElement(a5_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a5_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 369));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 369));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 370));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_264, 370));
	}
	
	a6 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 371));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 371));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_275, 372));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_276, 372));
	}
	
	(
		(
			(
				a1 = T_OPTIONAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_OPTIONAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_276, 373));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_276, 374));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_277, 375));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_278, 375));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_279, 375));
	}
	
	(
		(
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_278, 376));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_279, 376));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_278, 377));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_279, 377));
	}
	
	(
		(
			(
				a4 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_279, 378));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_279, 379));
	}
	
	a5 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_280, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_281, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_282, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 380));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 380));
	}
	
	(
		(
			(
				a6 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a6 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a6).getLine(), ((org.antlr.runtime.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a6).getStartIndex(), ((org.antlr.runtime.CommonToken) a6).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.type.AbstractPort, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), proxy);
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_282, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 381));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 381));
			}
			
			
			|			a7 = '?' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_282, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 382));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 382));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_282, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 383));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 383));
	}
	
	(
		(
			a8 = '[' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_283, 384));
			}
			
			(
				a9 = MULTIPLICITY				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a9 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a9).getLine(), ((org.antlr.runtime.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a9).getStartIndex(), ((org.antlr.runtime.CommonToken) a9).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_284, 385));
			}
			
			a10 = '..' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_285, 386));
			}
			
			(
				a11 = MULTIPLICITY				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
					}
					if (a11 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a11).getLine(), ((org.antlr.runtime.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a11).getStartIndex(), ((org.antlr.runtime.CommonToken) a11).getStopIndex());
						}
						java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_286, 387));
			}
			
			a12 = ']' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPort();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 388));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 388));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 389));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 389));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_287, 390));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_288, 391));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_289, 392));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_290, 393));
	}
	
	(
		a4 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			}
			if (a4 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_291, 394));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_292, 395));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_293, 396));
	}
	
	(
		a7 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			}
			if (a7 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_294, 397));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 398));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 398));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 398));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 398));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 398));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_295, 399));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_296, 399));
	}
	
	(
		(
			(
				a1 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a1).getLine(), ((org.antlr.runtime.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a1).getStartIndex(), ((org.antlr.runtime.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_296, 400));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_296, 401));
	}
	
	a2 = ':' {
		if (element == null) {
			element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_297, 402));
	}
	
	(
		a3 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
			}
			if (a3 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_192, 403));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_203, 403));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 403));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 403));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 403));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.implem.ImplemFactory.eINSTANCE.createOSGiType();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_249, 404));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_254, 404));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 404));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 404));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 404));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_298, 405));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_299, 405));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_300, 405));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_299, 406));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_300, 406));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_299, 407));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_300, 407));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_300, 408));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_300, 409));
	}
	
	a3 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_301, 410));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_302, 410));
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				if (a4 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_303, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 411));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 411));
		}
		
		
		|		a5 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_303, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 412));
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 412));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_303, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 413));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 413));
	}
	
	(
		(
			a6 = 'default' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_304, 414));
			}
			
			(
				a7 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					}
					if (a7 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a7).getLine(), ((org.antlr.runtime.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a7).getStartIndex(), ((org.antlr.runtime.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 415));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 415));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 416));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 416));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_305, 417));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_306, 417));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_307, 417));
	}
	
	(
		(
			(
				a1 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
					}
					if (a1 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_306, 418));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_307, 418));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_306, 419));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_307, 419));
	}
	
	(
		(
			(
				a2 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_307, 420));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_307, 421));
	}
	
	a3 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_308, 422));
	}
	
	a4 = '[' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_309, 423));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_310, 423));
	}
	
	(
		(
			a5 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				if (a5 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.TypedElement, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_311, 424));
		}
		
		
		|		a6 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_311, 425));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_311, 426));
	}
	
	a7 = '->' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_312, 427));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_313, 427));
	}
	
	(
		(
			a8 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				if (a8 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a8).getLine(), ((org.antlr.runtime.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a8).getStartIndex(), ((org.antlr.runtime.CommonToken) a8).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.DataType proxy = pattern.art.ArtFactory.eINSTANCE.createDataType();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.type.Dictionary, pattern.art.DataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), proxy);
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
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_314, 428));
		}
		
		
		|		a9 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_314, 429));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_314, 430));
	}
	
	a10 = ']' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_315, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 431));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 431));
	}
	
	(
		(
			a11 = 'default' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_316, 432));
			}
			
			a12 = '{' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 433));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_317, 433));
			}
			
			(
				(
					a13_0 = parse_pattern_art_type_DictionaryDefaultValue					{
						if (terminateParsing) {
							throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
						}
						if (element == null) {
							element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
						}
						if (a13_0 != null) {
							if (a13_0 != null) {
								addObjectToList(element, pattern.art.type.TypePackage.DICTIONARY__KEYS, a13_0);
								completedElement(a13_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a13_0, element); 						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 434));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_317, 434));
			}
			
			a14 = '}' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 435));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 435));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 436));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 436));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_318, 437));
	}
	
	(
		a1 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
			}
			if (a1 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_319, 438));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_320, 438));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_321, 438));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_322, 439));
			}
			
			(
				a3 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_320, 440));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_321, 440));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_320, 441));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_321, 441));
	}
	
	(
		(
			(
				a4 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
					}
					if (a4 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_321, 442));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_321, 443));
	}
	
	a5 = ']' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 444));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_317, 444));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 444));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 444));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 444));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortId();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_323, 445));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_324, 445));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 445));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 445));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 445));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_325, 446));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_326, 447));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_327, 447));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_328, 447));
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
					}
					if (a2 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_327, 448));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_328, 448));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_327, 449));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_328, 449));
	}
	
	(
		(
			(
				a3 = TXTID				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TXTID");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_328, 450));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_328, 451));
	}
	
	a4 = ':' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_329, 452));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_330, 452));
	}
	
	(
		(
			a5 = TEXT			
			{
				if (terminateParsing) {
					throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
				}
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				if (a5 != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a5).getLine(), ((org.antlr.runtime.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a5).getStartIndex(), ((org.antlr.runtime.CommonToken) a5).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					pattern.art.type.Service proxy = pattern.art.type.TypeFactory.eINSTANCE.createService();
					collectHiddenTokens(element);
					registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<pattern.art.type.AbstractPort, pattern.art.type.Service>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), resolved, proxy);
					if (proxy != null) {
						element.eSet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), proxy);
						completedElement(proxy);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_331, 453));
		}
		
		
		|		a6 = '?' {
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_331, 454));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_331, 455));
	}
	
	a7 = '{' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 456));
	}
	
	(
		a8_0 = parse_pattern_art_type_PortId		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					addObjectToList(element, pattern.art.type.TypePackage.PORT_COLLECTION__IDS, a8_0);
					completedElement(a8_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a8_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_323, 457));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_324, 457));
	}
	
	(
		(
			a9 = ',' {
				if (element == null) {
					element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 458));
			}
			
			(
				a10_0 = parse_pattern_art_type_PortId				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
						copyLocalizationInfos(a10_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_323, 459));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_324, 459));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_323, 460));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_324, 460));
	}
	
	a11 = '}' {
		if (element == null) {
			element = pattern.art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_250, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_255, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 461));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 461));
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
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_14, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 462));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 462));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_14, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 463));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 463));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_332, 464));
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_333, 465));
			}
			
			(
				a3 = STRING_LITERAL				
				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
					}
					if (a3 != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						tokenResolver.setOptions(getOptions());
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 466));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 466));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 467));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 467));
	}
	
	(
		a4_0 = parse_patternframework_PModel		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__PATTERN), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 468));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 468));
	}
	
	(
		(
			a5 = 'negative' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_334, 469));
			}
			
			a6 = 'pattern' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_335, 470));
			}
			
			a7 = ':' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 471));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 471));
			}
			
			(
				a8_0 = parse_patternframework_PModel				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createModelPattern();
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							addObjectToList(element, patternframework.PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS, a8_0);
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 472));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 472));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 473));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 473));
	}
	
;

parse_patternframework_PModel returns [patternframework.PModel element = null]
@init{
}
:
	(
		a0_0 = parse_patternframework_PObject		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__CONTENT, a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 474));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 474));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 474));
	}
	
	(
		(
			a1 = 'roles' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_336, 475));
			}
			
			a2 = ':' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_337, 476));
			}
			
			(
				a3_0 = parse_patternframework_PRole				{
					if (terminateParsing) {
						throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
					}
					if (element == null) {
						element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__ROLES, a3_0);
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_338, 477));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_339, 477));
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_337, 478));
					}
					
					(
						a5_0 = parse_patternframework_PRole						{
							if (terminateParsing) {
								throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
							}
							if (element == null) {
								element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									addObjectToList(element, patternframework.PatternframeworkPackage.PMODEL__ROLES, a5_0);
									completedElement(a5_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a5_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_338, 479));
						addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_339, 479));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_338, 480));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_339, 480));
			}
			
			a6 = ';' {
				if (element == null) {
					element = patternframework.PatternframeworkFactory.eINSTANCE.createPModel();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 481));
				addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 481));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_47, 482));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 482));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_340, 483));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_341, 484));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_342, 485));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_343, 486));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_344, 487));
	}
	
	(
		a5 = STRING_LITERAL		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPConstraint();
			}
			if (a5 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_345, 488));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_14, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_15, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_16, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_17, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_18, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_19, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_20, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_21, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_22, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_23, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_24, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_25, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_26, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_27, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_28, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_29, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_30, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_31, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_32, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_33, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_34, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_35, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_36, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_37, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_38, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_39, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_40, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_41, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_42, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_43, 489));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_44, 489));
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
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
			}
			if (a0 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_346, 490));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_347, 491));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.smartadapters.core.resource.smARText.mopp.SmARTextTerminateParsingException();
			}
			if (element == null) {
				element = patternframework.PatternframeworkFactory.eINSTANCE.createPRole();
			}
			if (a2 != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				patternframework.PObject proxy = patternframework.PatternframeworkFactory.eINSTANCE.createPObject();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.smartadapters.core.resource.smARText.mopp.SmARTextContextDependentURIFragmentFactory<patternframework.PRole, patternframework.PObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPRolePlayerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), resolved, proxy);
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_348, 492));
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
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_338, 493));
		addExpectedElement(new org.smartadapters.core.resource.smARText.mopp.SmARTextExpectedTerminal(TERMINAL_339, 493));
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
TXTID:
	'<'('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*'>';
TEXT:
	('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*;

