grammar Artext;

options {
	superClass = ArtextANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package art.resource.artext.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
	}
}
@header{
	package art.resource.artext.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_0, 0));
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
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_1, 1));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_2, 2));
	}
	
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createSystem();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_0_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
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
	
	(
		(
			(
				(
					a3_0 = parse_art_distrib_Node					{
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
				)
				{
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
				
				
				|				(
					a4_0 = parse_art_type_Service					{
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
				)
				{
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
				
				
				|				(
					a5_0 = parse_art_type_ComponentType					{
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
				)
				{
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
				
				
				|				(
					a6_0 = parse_art_DataType					{
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
				)
				{
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
				
				
				|				(
					a7_0 = parse_art_group_Group					{
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
				)
				{
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
				
			)
			{
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
			
		)
		
	)*	{
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
	
;

parse_art_DataType returns [art.DataType element = null]
@init{
}
:
	a0 = 'datatype' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_1_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_11, 11));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_12, 12));
	}
	
	a2 = ';' {
		if (element == null) {
			element = art.ArtFactory.eINSTANCE.createDataType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_1_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
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
	
;

parse_art_distrib_Node returns [art.distrib.Node element = null]
@init{
}
:
	a0 = 'node' {
		if (element == null) {
			element = art.distrib.DistribFactory.eINSTANCE.createNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_13, 14));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_14, 15));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 15));
	}
	
	(
		(
			a2 = 'uri' {
				if (element == null) {
					element = art.distrib.DistribFactory.eINSTANCE.createNode();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_16, 16));
			}
			
			a3 = '=' {
				if (element == null) {
					element = art.distrib.DistribFactory.eINSTANCE.createNode();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_3_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_17, 17));
			}
			
			(
				a4 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 18));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_15, 19));
	}
	
	a5 = '{' {
		if (element == null) {
			element = art.distrib.DistribFactory.eINSTANCE.createNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 20, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 20, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 20));
	}
	
	(
		(
			a6_0 = parse_art_instance_ComponentInstance			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 21, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 21, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_5));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_20, 21));
	}
	
	a7 = '}' {
		if (element == null) {
			element = art.distrib.DistribFactory.eINSTANCE.createNode();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_2_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
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
	
;

parse_art_instance_PrimitiveInstance returns [art.instance.PrimitiveInstance element = null]
@init{
}
:
	a0 = 'primitive' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_21, 23));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_22, 24));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_23, 25));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_24, 26));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_25, 27));
	}
	
	(
		a5 = T_INSTANCE_STATE		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_26, 28));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 28));
	}
	
	(
		(
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_12_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_28, 29, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_29, 29, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
			}
			
			(
				a7_0 = parse_art_implem_ComponentImplementation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 30));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 31));
	}
	
	a8 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_14, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 32, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 32));
	}
	
	(
		(
			(
				(
					a9_0 = parse_art_instance_AttributeInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 33, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 33));
				}
				
				
				|				(
					a10_0 = parse_art_instance_TransmissionBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 34, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 34));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 35, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 35));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 36, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_33, 36));
	}
	
	a11 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createPrimitiveInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_3_0_0_17, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
	}
	{
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
	
;

parse_art_instance_CompositeInstance returns [art.instance.CompositeInstance element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_36, 38));
	}
	
	a1 = 'instance' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_37, 39));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_38, 40));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_39, 41));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_40, 42));
	}
	
	(
		a5 = T_INSTANCE_STATE		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_41, 43));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 43));
	}
	
	(
		(
			a6 = 'implementation' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_12_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_28, 44, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_29, 44, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_6));
			}
			
			(
				a7_0 = parse_art_implem_ComponentImplementation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 45));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 46));
	}
	
	a8 = '{' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_14, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 47, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 47));
	}
	
	(
		(
			(
				(
					a9_0 = parse_art_instance_AttributeInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 48, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 48));
				}
				
				
				|				(
					a10_0 = parse_art_instance_TransmissionBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 49, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 49));
				}
				
				
				|				(
					a11_0 = parse_art_instance_ComponentInstance					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 50, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 50));
				}
				
				
				|				(
					a12_0 = parse_art_instance_DelegationBinding					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 51, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
					addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 51));
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 52, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 52));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 53, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 53));
	}
	
	a13 = '}' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createCompositeInstance();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_4_0_0_17, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
	}
	{
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
	
;

parse_art_instance_TransmissionBinding returns [art.instance.TransmissionBinding element = null]
@init{
}
:
	a0 = 'bind' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_43, 55));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_44, 56));
	}
	
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_45, 57));
	}
	
	(
		a3 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_46, 58));
	}
	
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_47, 59));
	}
	
	(
		a5 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_49, 61));
			}
			
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_50, 62));
			}
			
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_4, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_51, 63));
			}
			
			(
				a9 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_52, 64));
			}
			
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createTransmissionBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_5_0_0_9_0_0_7, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
			}
			{
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
			
		)
		
	)?	{
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
	
;

parse_art_instance_DelegationBinding returns [art.instance.DelegationBinding element = null]
@init{
}
:
	a0 = 'delegate' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_53, 67));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_54, 68));
	}
	
	a2 = 'to' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_55, 69));
	}
	
	(
		a3 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_56, 70));
	}
	
	a4 = '::' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_57, 71));
	}
	
	(
		a5 = TEXT		
		{
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
	)
	{
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
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_59, 73));
			}
			
			a7 = 'id' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_60, 74));
			}
			
			a8 = '=' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_4, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_61, 75));
			}
			
			(
				a9 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_62, 76));
			}
			
			a10 = ')' {
				if (element == null) {
					element = art.instance.InstanceFactory.eINSTANCE.createDelegationBinding();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_6_0_0_9_0_0_7, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 77, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 77));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_30, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_31, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_7));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_32, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_8));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_18, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_19, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_10));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_34, 78, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_9));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_35, 78));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_63, 79));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createValuedAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_7_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_64, 80));
	}
	
	(
		a2 = STRING_LITERAL		
		{
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
	)
	{
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
	
;

parse_art_instance_DictionaryValuedAttribute returns [art.instance.DictionaryValuedAttribute element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_65, 82));
	}
	
	a1 = ':=' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
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
	
	(
		(
			(
				a2_0 = parse_art_instance_Entry				{
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
			)
			{
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
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = art.instance.InstanceFactory.eINSTANCE.createDictionaryValuedAttribute();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_8_0_0_4_0_0_1_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_66, 85, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_67, 85, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_11));
					}
					
					(
						a4_0 = parse_art_instance_Entry						{
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
					)
					{
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
					
				)
				
			)*			{
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
			
		)
		
	)?	{
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
	
;

parse_art_instance_DefaultEntry returns [art.instance.DefaultEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_69, 89));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_70, 90));
	}
	
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_71, 91));
	}
	
	(
		a3 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_72, 92));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createDefaultEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_9_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_art_instance_OtherEntry returns [art.instance.OtherEntry element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_73, 94));
	}
	
	(
		a1 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_74, 95));
	}
	
	a2 = '->' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_75, 96));
	}
	
	(
		a3 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_76, 97));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.instance.InstanceFactory.eINSTANCE.createOtherEntry();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_10_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
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
	
;

parse_art_type_PrimitiveType returns [art.type.PrimitiveType element = null]
@init{
}
:
	a0 = 'type' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_77, 99));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_78, 100));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 100));
	}
	
	(
		(
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_4_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_80, 101, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_12));
			}
			
			(
				a3_0 = parse_art_implem_TypeImplementation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 102));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 103));
	}
	
	a4 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 104, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 104));
	}
	
	(
		(
			(
				a5_0 = parse_art_type_AbstractPort				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 105, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 105));
			}
			
			
			|			(
				a6_0 = parse_art_type_Attribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 106, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 106));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 107, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 107));
	}
	
	a7 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPrimitiveType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_11_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
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
	
;

parse_art_type_CompositeType returns [art.type.CompositeType element = null]
@init{
}
:
	a0 = 'compositetype' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_86, 109));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_87, 110));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 110));
	}
	
	(
		(
			a2 = 'implementation' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createCompositeType();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_4_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_80, 111, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_12));
			}
			
			(
				a3_0 = parse_art_implem_TypeImplementation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 112));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 113));
	}
	
	a4 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 114, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 114));
	}
	
	(
		(
			(
				a5_0 = parse_art_type_AbstractPort				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 115, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 115));
			}
			
			
			|			(
				a6_0 = parse_art_type_Attribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 116, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 116));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 117, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 117));
	}
	
	a7 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createCompositeType();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_12_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
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
	
;

parse_art_type_Operation returns [art.type.Operation element = null]
@init{
}
:
	a0 = 'operation' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_91, 119));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_92, 120));
	}
	
	a2 = '(' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 121, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_15));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 121));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 121));
	}
	
	(
		(
			(
				a3_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 122));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 122));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 123));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 123));
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_6_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 124, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_15));
			}
			
			(
				a5_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 125));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 125));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 126));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 126));
	}
	
	a6 = ')' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_96, 127));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 127));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 127, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 127));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 127));
	}
	
	(
		(
			a7 = ':' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_8_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 128, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_17));
			}
			
			(
				a8_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 129));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 129, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 129));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 129));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 130));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 130, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 130));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 130));
	}
	
	(
		(
			a9 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createOperation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_13_0_0_9_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_93, 131, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_17));
			}
			
			(
				a10_0 = parse_art_type_Parameter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 132));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 132, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 132));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 132));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_97, 133));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 133, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 133));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 133));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_100, 134));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_94, 135));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_95, 135));
	}
	
;

parse_art_type_FunctionalService returns [art.type.FunctionalService element = null]
@init{
}
:
	a0 = 'functional' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_101, 136));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_102, 137));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_103, 138));
	}
	
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 139, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 139));
	}
	
	(
		(
			(
				a4_0 = parse_art_type_Operation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 140, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 140));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 141, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_98, 141));
	}
	
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createFunctionalService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_15_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
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
	
;

parse_art_type_ControlService returns [art.type.ControlService element = null]
@init{
}
:
	a0 = 'control' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_104, 143));
	}
	
	a1 = 'service' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_105, 144));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_106, 145));
	}
	
	a3 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 146, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 146));
	}
	
	(
		(
			(
				a4_0 = parse_art_type_Operation				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 147, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 147));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_90, 148, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_16));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_99, 148));
	}
	
	a5 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createControlService();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_16_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
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
	
;

parse_art_type_Port returns [art.type.Port element = null]
@init{
}
:
	(
		a0 = T_PORT_KIND		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_107, 150));
	}
	
	a1 = 'port' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_108, 151));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_109, 152));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_110, 153));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_111, 154));
	}
	
	a5 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_11, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_112, 155));
	}
	
	(
		a6 = MULTIPLICITY		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_113, 156));
	}
	
	a7 = '..' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_13, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_114, 157));
	}
	
	(
		a8 = MULTIPLICITY		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_115, 158));
	}
	
	a9 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_15, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
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
	
	(
		(
			a10 = 'protocol' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_16_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_118, 160));
			}
			
			a11 = '=' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_16_0_0_3, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_119, 161));
			}
			
			(
				a12 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_117, 162));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 162, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 162));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 162));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_117, 163));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 163, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 163));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 163));
	}
	
	(
		(
			a13 = 'uri' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_17_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_120, 164));
			}
			
			a14 = '=' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_17_0_0_17_0_0_3, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_121, 165));
			}
			
			(
				a15 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 166, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 166));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 166));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 167, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 167));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 167));
	}
	
;

parse_art_implem_FractalComponent returns [art.implem.FractalComponent element = null]
@init{
}
:
	a0 = 'FractalComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_122, 168));
	}
	
	a1 = '<' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_123, 169));
	}
	
	a2 = 'controllerDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_124, 170));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_5, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_125, 171));
	}
	
	(
		a4 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_126, 172));
	}
	
	a5 = 'contentDesc' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_127, 173));
	}
	
	a6 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_11, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_128, 174));
	}
	
	(
		a7 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_129, 175));
	}
	
	a8 = '>' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createFractalComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_18_0_0_14, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 176));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 176));
	}
	
;

parse_art_implem_OSGiComponent returns [art.implem.OSGiComponent element = null]
@init{
}
:
	a0 = 'OSGiComponent' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_19_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_130, 177));
	}
	
	a1 = ':' {
		if (element == null) {
			element = art.implem.ImplemFactory.eINSTANCE.createOSGiComponent();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_19_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_131, 178));
	}
	
	(
		a2 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_27, 179));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_42, 179));
	}
	
;

parse_art_group_TypeGroup returns [art.group.TypeGroup element = null]
@init{
}
:
	a0 = 'typegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_132, 180));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_133, 181));
	}
	
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_134, 182));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 182, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 182));
	}
	
	(
		(
			a3 = 'types' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_136, 183));
			}
			
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_3, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_137, 184));
			}
			
			(
				a5 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 185));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 185, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 185));
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_5_0_0_6_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_139, 186));
					}
					
					(
						a7 = TEXT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 187));
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 187, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 187));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_138, 188));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 188, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 188));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 189, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 189));
	}
	
	(
		(
			(
				a8_0 = parse_art_group_TypeGroup				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 190, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 190));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_9, 191, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_18));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_135, 191));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createTypeGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_20_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
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
	
;

parse_art_group_InstanceGroup returns [art.group.InstanceGroup element = null]
@init{
}
:
	a0 = 'instancegroup' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_140, 193));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_141, 194));
	}
	
	a2 = '{' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_142, 195));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 195, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 195));
	}
	
	(
		(
			a3 = 'instances' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_144, 196));
			}
			
			a4 = ':' {
				if (element == null) {
					element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_3, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_145, 197));
			}
			
			(
				a5 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 198));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 198, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 198));
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_5_0_0_6_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_147, 199));
					}
					
					(
						a7 = TEXT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 200));
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 200, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
						addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 200));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_146, 201));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 201, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 201));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 202, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 202));
	}
	
	(
		(
			(
				a8_0 = parse_art_group_InstanceGroup				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 203, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 203));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_10, 204, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_19));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_143, 204));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.group.GroupFactory.eINSTANCE.createInstanceGroup();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_21_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
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
	
;

parse_art_implem_OSGiType returns [art.implem.OSGiType element = null]
@init{
}
:
	(
		a0 = T_IMPLEM		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_79, 206));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_88, 206));
	}
	
;

parse_art_type_BasicAttribute returns [art.type.BasicAttribute element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_148, 207));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_149, 208));
	}
	
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_5, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_150, 209));
	}
	
	(
		a3 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_151, 210));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 210, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 210));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 210));
	}
	
	(
		(
			a4 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createBasicAttribute();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_23_0_0_8_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_152, 211));
			}
			
			(
				a5 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 212, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 212));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 212));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 213, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 213));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 213));
	}
	
;

parse_art_type_Dictionary returns [art.type.Dictionary element = null]
@init{
}
:
	a0 = 'attribute' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_153, 214));
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_154, 215));
	}
	
	a2 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_5, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_155, 216));
	}
	
	a3 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_156, 217));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_157, 218));
	}
	
	a5 = '->' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_158, 219));
	}
	
	(
		a6 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_159, 220));
	}
	
	a7 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionary();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_12, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_160, 221));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 221, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 221));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 221));
	}
	
	(
		(
			a8 = 'default' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_1, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_161, 222));
			}
			
			a9 = '{' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_3, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 223, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 223));
			}
			
			(
				(
					a10_0 = parse_art_type_DictionaryDefaultValue					{
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
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 224, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 224));
			}
			
			a11 = '}' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionary();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_24_0_0_13_0_0_6, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 225, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 225));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 225));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 226, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 226));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 226));
	}
	
;

parse_art_type_DictionaryDefaultValue returns [art.type.DictionaryDefaultValue element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_164, 227));
	}
	
	(
		a1 = STRING_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_165, 228));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 228));
	}
	
	(
		(
			a2 = '->' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_5_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_167, 229));
			}
			
			(
				a3 = STRING_LITERAL				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 230));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_166, 231));
	}
	
	a4 = ']' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createDictionaryDefaultValue();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_25_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_162, 232, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_20));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_163, 232));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 233));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 233));
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_171, 234));
	}
	
	a1 = 'port' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_172, 235));
	}
	
	(
		a2 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_173, 236));
	}
	
	a3 = ':' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_7, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_174, 237));
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_175, 238));
	}
	
	a5 = '{' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_11, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_168, 239, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_21));
	}
	
	(
		a6_0 = parse_art_type_PortId		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 240));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 240));
	}
	
	(
		(
			a7 = ',' {
				if (element == null) {
					element = art.type.TypeFactory.eINSTANCE.createPortCollection();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_13_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_168, 241, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_21));
			}
			
			(
				a8_0 = parse_art_type_PortId				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 242));
				addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 242));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_169, 243));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_170, 243));
	}
	
	a9 = '}' {
		if (element == null) {
			element = art.type.TypeFactory.eINSTANCE.createPortCollection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, art.resource.artext.grammar.ArtextGrammarInformationProvider.ARTEXT_27_0_0_14, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_81, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_82, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_13));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_83, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_84, 244, art.resource.artext.grammar.ArtextFollowSetProvider.FEATURE_14));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_85, 244));
		addExpectedElement(new art.resource.artext.mopp.ArtextExpectedTerminal(art.resource.artext.grammar.ArtextFollowSetProvider.TERMINAL_89, 244));
	}
	
;

parse_art_type_Service returns [art.type.Service element = null]
:
	c0 = parse_art_type_FunctionalService{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_type_ControlService{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_type_ComponentType returns [art.type.ComponentType element = null]
:
	c0 = parse_art_type_PrimitiveType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_type_CompositeType{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_group_Group returns [art.group.Group element = null]
:
	c0 = parse_art_group_TypeGroup{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_group_InstanceGroup{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_instance_ComponentInstance returns [art.instance.ComponentInstance element = null]
:
	c0 = parse_art_instance_PrimitiveInstance{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_instance_CompositeInstance{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_implem_ComponentImplementation returns [art.implem.ComponentImplementation element = null]
:
	c0 = parse_art_implem_FractalComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_implem_OSGiComponent{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_instance_AttributeInstance returns [art.instance.AttributeInstance element = null]
:
	c0 = parse_art_instance_ValuedAttribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_instance_DictionaryValuedAttribute{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_instance_Entry returns [art.instance.Entry element = null]
:
	c0 = parse_art_instance_DefaultEntry{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_instance_OtherEntry{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_implem_TypeImplementation returns [art.implem.TypeImplementation element = null]
:
	c0 = parse_art_implem_OSGiType{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_type_AbstractPort returns [art.type.AbstractPort element = null]
:
	c0 = parse_art_type_Port{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_type_PortCollection{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_art_type_Attribute returns [art.type.Attribute element = null]
:
	c0 = parse_art_type_BasicAttribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_art_type_Dictionary{ element = c1; /* this is a subclass or primitive expression choice */ }
	
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

