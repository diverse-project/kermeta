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
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
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
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_art_System{ element = c0; }
	)
	EOF	
;

parse_art_System returns [art.System element = null]
@init{
}
:
	a0 = 'system' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_1, 1));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_2, 2));
	}
	
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_3, 3));
	}
	
	a3 = 'root' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 4));
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
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 5));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 5));
	}
	
	(
		(
			(
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
								completedElement(a5_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a5_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 6));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 6));
				}
				
				
				|				(
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
								completedElement(a6_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a6_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 7));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 7));
				}
				
				
				|				(
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
								completedElement(a7_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a7_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 8));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 8));
				}
				
				
				|				(
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
								completedElement(a8_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a8_0, element); 						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 9));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 9));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 10));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 10));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 11));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 11));
	}
	
;

parse_art_DataType returns [art.DataType element = null]
@init{
}
:
	a0 = 'datatype' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_12, 12));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_13, 13));
	}
	
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 14));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 14));
	}
	
;

parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null]
@init{
}
:
	a0 = 'primitive' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_15, 15));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_16, 16));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_17, 17));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_18, 18));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_19, 19));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_20, 20));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 20));
	}
	
	(
		(
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_22, 21));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_23, 21));
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
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 22));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 23));
	}
	
	a8 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 24));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 24));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 24));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 24));
	}
	
	(
		(
			(
				(
					a9_0 = parse_art_instance_AttributeInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 25));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 25));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 25));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 25));
				}
				
				
				|				(
					a10_0 = parse_art_instance_TransmissionBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 26));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 26));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 26));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 26));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 27));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 27));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 27));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 27));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 28));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 28));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 28));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_27, 28));
	}
	
	a11 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 29));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 29));
	}
	
;

parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_30, 30));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_31, 31));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_32, 32));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_33, 33));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_34, 34));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_35, 35));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 35));
	}
	
	(
		(
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_22, 36));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_23, 36));
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
							completedElement(a7_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 37));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 38));
	}
	
	a8 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 39));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 39));
	}
	
	(
		(
			(
				(
					a9_0 = parse_art_instance_AttributeInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 40));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 40));
				}
				
				
				|				(
					a10_0 = parse_art_instance_TransmissionBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 41));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 41));
				}
				
				
				|				(
					a11_0 = parse_art_instance_ComponentInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 42));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 42));
				}
				
				
				|				(
					a12_0 = parse_art_instance_DelegationBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 43));
					addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 43));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 44));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 44));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 45));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 45));
	}
	
	a13 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a13, element);
	}
	{
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
	
;

parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null]
@init{
}
:
	a0 = 'bind' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_37, 47));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_38, 48));
	}
	
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_39, 49));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_40, 50));
	}
	
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_41, 51));
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
	)
	{
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
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_43, 53));
			}
			
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_44, 54));
			}
			
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_45, 55));
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
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_46, 56));
			}
			
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
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
			
		)
		
	)?	{
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
	
;

parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null]
@init{
}
:
	a0 = 'delegate' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_47, 59));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_48, 60));
	}
	
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_49, 61));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_50, 62));
	}
	
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_51, 63));
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
	)
	{
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
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_53, 65));
			}
			
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_54, 66));
			}
			
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_55, 67));
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
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_56, 68));
			}
			
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 69));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 69));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_24, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_25, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_26, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_14, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_4, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_28, 70));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_29, 70));
	}
	
;

parse_art_instance_ValuedAttribute returns [art.instance.ValuedAttribute element = null]
@init{
}
:
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_57, 71));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_58, 72));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
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
	
;

parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null]
@init{
}
:
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_59, 74));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
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
	
	(
		(
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
							completedElement(a2_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a2_0, element); 					}
				}
			)
			{
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
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_60, 77));
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_61, 77));
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
									completedElement(a4_0);
								}
								collectHiddenTokens(element);
								copyLocalizationInfos(a4_0, element); 							}
						}
					)
					{
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
					
				)
				
			)*			{
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
			
		)
		
	)?	{
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
	
;

parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_63, 81));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_64, 82));
	}
	
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_65, 83));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_66, 84));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
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
	
;

parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_67, 86));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_68, 87));
	}
	
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_69, 88));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_70, 89));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
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
	
;

parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null]
@init{
}
:
	a0 = 'type' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_71, 91));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_72, 92));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 92));
	}
	
	(
		(
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_74, 93));
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
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 94));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 95));
	}
	
	a4 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 96));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 96));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 96));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 96));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 96));
	}
	
	(
		(
			(
				a5_0 = parse_art_type_AbstractPort				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 97));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 97));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 97));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 97));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 97));
			}
			
			
			|			(
				a6_0 = parse_art_type_Attribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 98));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 98));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 98));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 98));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 98));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 99));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 99));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 99));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 99));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 99));
	}
	
	a7 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 100));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 100));
	}
	
;

parse_art_type_CompositeType returns [art.type.CompositeType element = null]
@init{
}
:
	a0 = 'compositetype' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_80, 101));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_81, 102));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 102));
	}
	
	(
		(
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_74, 103));
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
							completedElement(a3_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a3_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 104));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 105));
	}
	
	a4 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 106));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 106));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 106));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 106));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 106));
	}
	
	(
		(
			(
				a5_0 = parse_art_type_AbstractPort				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 107));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 107));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 107));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 107));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 107));
			}
			
			
			|			(
				a6_0 = parse_art_type_Attribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 108));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 108));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 108));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 108));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 108));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 109));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 109));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 109));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 109));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 109));
	}
	
	a7 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 110));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 110));
	}
	
;

parse_art_type_Operation returns [art.type.Operation element = null]
@init{
}
:
	a0 = 'operation' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_85, 111));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_86, 112));
	}
	
	a2 = '(' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 113));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 113));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 113));
	}
	
	(
		(
			(
				a3_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 114));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 114));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 115));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 115));
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 116));
			}
			
			(
				a5_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 117));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 117));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 118));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 118));
	}
	
	a6 = ')' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_90, 119));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 119));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 119));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 119));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 119));
	}
	
	(
		(
			a7 = ':' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 120));
			}
			
			(
				a8_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 121));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 121));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 121));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 121));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 122));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 122));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 122));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 122));
	}
	
	(
		(
			a9 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_87, 123));
			}
			
			(
				a10_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 124));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 124));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 124));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 124));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_91, 125));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 125));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 125));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 125));
	}
	
;

parse_art_type_Parameter returns [art.type.Parameter element = null]
@init{
}
:
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_94, 126));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_88, 127));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_89, 127));
	}
	
;

parse_art_type_FunctionalService returns [art.type.FunctionalService element = null]
@init{
}
:
	a0 = 'functional' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_95, 128));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_96, 129));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_97, 130));
	}
	
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 131));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 131));
	}
	
	(
		(
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
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 132));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 132));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 133));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_92, 133));
	}
	
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 134));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 134));
	}
	
;

parse_art_type_ControlService returns [art.type.ControlService element = null]
@init{
}
:
	a0 = 'control' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_98, 135));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_99, 136));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_100, 137));
	}
	
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 138));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 138));
	}
	
	(
		(
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
							completedElement(a4_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 139));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 139));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_84, 140));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_93, 140));
	}
	
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_5, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_6, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_7, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_8, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_9, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 141));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 141));
	}
	
;

parse_art_type_Port returns [art.type.Port element = null]
@init{
}
:
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_101, 142));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 142));
	}
	
	(
		(
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
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 143));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_102, 144));
	}
	
	a2 = 'port' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_103, 145));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_104, 146));
	}
	
	a4 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_105, 147));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_106, 148));
	}
	
	a6 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_107, 149));
	}
	
	(
		a7 = MULTIPLICITY		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_108, 150));
	}
	
	a8 = '..' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_109, 151));
	}
	
	(
		a9 = MULTIPLICITY		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_110, 152));
	}
	
	a10 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 153));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 153));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 153));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 153));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 153));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 153));
	}
	
;

parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null]
@init{
}
:
	a0 = 'FractalComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_111, 154));
	}
	
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_112, 155));
	}
	
	a2 = 'controllerDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_113, 156));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_114, 157));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_115, 158));
	}
	
	a5 = 'contentDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_116, 159));
	}
	
	a6 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_117, 160));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_118, 161));
	}
	
	a8 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 162));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 162));
	}
	
;

parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null]
@init{
}
:
	a0 = 'OSGiComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_119, 163));
	}
	
	a1 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_120, 164));
	}
	
	(
		a2 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_21, 165));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_36, 165));
	}
	
;

parse_art_group_TypeGroup returns [art.group.TypeGroup element = null]
@init{
}
:
	a0 = 'typegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_121, 166));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_122, 167));
	}
	
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_123, 168));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 168));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 168));
	}
	
	(
		(
			a3 = 'types' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_125, 169));
			}
			
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_126, 170));
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
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 171));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 171));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 171));
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_128, 172));
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
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 173));
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 173));
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 173));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_127, 174));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 174));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 174));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 175));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 175));
	}
	
	(
		(
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
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 176));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 176));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_10, 177));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_124, 177));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
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
	
;

parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null]
@init{
}
:
	a0 = 'instancegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_129, 179));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_130, 180));
	}
	
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_131, 181));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 181));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 181));
	}
	
	(
		(
			a3 = 'instances' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_133, 182));
			}
			
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_134, 183));
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
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 184));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 184));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 184));
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_136, 185));
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
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 186));
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 186));
						addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 186));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_135, 187));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 187));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 187));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 188));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 188));
	}
	
	(
		(
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
							completedElement(a8_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a8_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 189));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 189));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_11, 190));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_132, 190));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
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
	
;

parse_art_implem_OSGiType returns [art.implem.OSGiType element = null]
@init{
}
:
	(
		a0 = T_IMPLEM		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_73, 192));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_82, 192));
	}
	
;

parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_137, 193));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_138, 194));
	}
	
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_139, 195));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_140, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 196));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 196));
	}
	
	(
		(
			a4 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_141, 197));
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
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 198));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 198));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 198));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 198));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 198));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 198));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 199));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 199));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 199));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 199));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 199));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 199));
	}
	
;

parse_art_type_Dictionary returns [art.type.Dictionary element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_142, 200));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_143, 201));
	}
	
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_144, 202));
	}
	
	a3 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_145, 203));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_146, 204));
	}
	
	a5 = '->' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_147, 205));
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
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_148, 206));
	}
	
	a7 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_149, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 207));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 207));
	}
	
	(
		(
			a8 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_150, 208));
			}
			
			a9 = '{' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 209));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 209));
			}
			
			(
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
								completedElement(a10_0);
							}
							collectHiddenTokens(element);
							copyLocalizationInfos(a10_0, element); 						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 210));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 210));
			}
			
			a11 = '}' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 211));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 211));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 211));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 211));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 211));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 211));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 212));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 212));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 212));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 212));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 212));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 212));
	}
	
;

parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_153, 213));
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
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_154, 214));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 214));
	}
	
	(
		(
			a2 = '->' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_156, 215));
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
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 216));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_155, 217));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_151, 218));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_152, 218));
	}
	
;

parse_art_type_PortId returns [art.type.PortId element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 219));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 219));
	}
	
;

parse_art_type_PortCollection returns [art.type.PortCollection element = null]
@init{
}
:
	(
		a0 = T_PORT_KIND		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_160, 220));
	}
	
	a1 = 'port' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_161, 221));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_162, 222));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_163, 223));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_164, 224));
	}
	
	a5 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_157, 225));
	}
	
	(
		a6_0 = parse_art_type_PortId		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 226));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 226));
	}
	
	(
		(
			a7 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPortCollection();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_157, 227));
			}
			
			(
				a8_0 = parse_art_type_PortId				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 228));
				addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 228));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_158, 229));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_159, 229));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_75, 230));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_76, 230));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_77, 230));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_78, 230));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_79, 230));
		addExpectedElement(new art.resource.art.mopp.ArtExpectedTerminal(TERMINAL_83, 230));
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

parse_art_type_AbstractPort returns [art.type.AbstractPort element = null]
:
	c0 = parse_art_type_Port{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_type_PortCollection{ element = c1; /* this is a subclass choice */ }
	
;

parse_art_type_Attribute returns [art.type.Attribute element = null]
:
	c0 = parse_art_type_BasicAttribute{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_art_type_Dictionary{ element = c1; /* this is a subclass choice */ }
	
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
T_IMPLEM:
	'bundle'|'memory';
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
MULTIPLICITY:
	( ('*') | (('0'..'9')+) )
;
TEXT:
	('A'..'Z' | 'a'..'z' | '_' )('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )* ('.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)*;

