grammar Kpt;

options {
	superClass = KptANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.kermeta.kp.editor.mopp;
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
	package org.kermeta.kp.editor.mopp;
}

@members{
	private org.kermeta.kp.editor.IKptTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	@SuppressWarnings("unused")
	private int lastPosition;
	
	/**
	 * the index of the last token that was handled by retrieveLayoutInformation()
	 */
	private int lastPosition2;
	
	private org.kermeta.kp.editor.mopp.KptTokenResolveResult tokenResolveResult = new org.kermeta.kp.editor.mopp.KptTokenResolveResult();
	
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
	private java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
	
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
	private java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> postParseCommands;
	
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
		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.kermeta.kp.editor.IKptProblem() {
					public org.kermeta.kp.editor.KptEProblemType getType() {
						return org.kermeta.kp.editor.KptEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.kermeta.kp.editor.mopp.KptDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.kermeta.kp.editor.util.KptMapUtil.castToEMap(value);
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
			assert(object instanceof org.kermeta.kp.editor.mopp.KptDummyEObject);
			org.kermeta.kp.editor.mopp.KptDummyEObject dummy = (org.kermeta.kp.editor.mopp.KptDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
				org.kermeta.kp.editor.IKptLocationMap locationMap = resource.getLocationMap();
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
	
	public org.kermeta.kp.editor.IKptTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new KptParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KptLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new KptParser(new org.antlr.runtime3_2_0.CommonTokenStream(new KptLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.kermeta.kp.editor.mopp.KptPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public KptParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((KptLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((KptLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
				return parse_org_kermeta_kp_KermetaProject();
			}
			if (type.getInstanceClass() == org.kermeta.kp.SourceFolder.class) {
				return parse_org_kermeta_kp_SourceFolder();
			}
			if (type.getInstanceClass() == org.kermeta.kp.SourceFile.class) {
				return parse_org_kermeta_kp_SourceFile();
			}
			if (type.getInstanceClass() == org.kermeta.kp.SourceNSURI.class) {
				return parse_org_kermeta_kp_SourceNSURI();
			}
			if (type.getInstanceClass() == org.kermeta.kp.SourceQuery.class) {
				return parse_org_kermeta_kp_SourceQuery();
			}
			if (type.getInstanceClass() == org.kermeta.kp.Dependency.class) {
				return parse_org_kermeta_kp_Dependency();
			}
			if (type.getInstanceClass() == org.kermeta.kp.WeaveDirective.class) {
				return parse_org_kermeta_kp_WeaveDirective();
			}
			if (type.getInstanceClass() == org.kermeta.kp.Option.class) {
				return parse_org_kermeta_kp_Option();
			}
			if (type.getInstanceClass() == org.kermeta.kp.StringExpression.class) {
				return parse_org_kermeta_kp_StringExpression();
			}
			if (type.getInstanceClass() == org.kermeta.kp.MixExpression.class) {
				return parse_org_kermeta_kp_MixExpression();
			}
			if (type.getInstanceClass() == org.kermeta.kp.NamedElement.class) {
				return parse_org_kermeta_kp_NamedElement();
			}
			if (type.getInstanceClass() == org.kermeta.kp.KermetaProjectRef.class) {
				return parse_org_kermeta_kp_KermetaProjectRef();
			}
		}
		throw new org.kermeta.kp.editor.mopp.KptUnexpectedContentTypeException(typeObject);
	}
	
	private org.kermeta.kp.editor.mopp.KptTokenResolveResult getFreshTokenResolveResult() {
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
	
	public org.kermeta.kp.editor.mopp.KptMetaInformation getMetaInformation() {
		return new org.kermeta.kp.editor.mopp.KptMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.kermeta.kp.editor.IKptOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.kermeta.kp.editor.IKptParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>>();
		org.kermeta.kp.editor.mopp.KptParseResult parseResult = new org.kermeta.kp.editor.mopp.KptParseResult();
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
	
	public java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKptTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
		org.kermeta.kp.editor.IKptParseResult result = parse();
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
			for (org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.kermeta.kp.editor.mopp.KptExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
		java.util.List<org.kermeta.kp.editor.mopp.KptExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KptExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 66;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.kermeta.kp.editor.util.KptPair<org.kermeta.kp.editor.IKptExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							org.kermeta.kp.editor.IKptExpectedElement newFollower = newFollowerPair.getLeft();
							org.kermeta.kp.editor.mopp.KptExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KptExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (org.kermeta.kp.editor.mopp.KptExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.kermeta.kp.editor.mopp.KptExpectedTerminal expectedElement, int tokenIndex) {
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
	
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new org.kermeta.kp.editor.IKptCommand<org.kermeta.kp.editor.IKptTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKptTextResource resource) {
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
				tokenName = org.kermeta.kp.editor.util.KptStringUtil.formatTokenName(tokenName);
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
	
	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, org.kermeta.kp.editor.grammar.KptSyntaxElement syntaxElement, java.lang.Object object) {
		if (!(syntaxElement instanceof org.kermeta.kp.editor.grammar.KptPlaceholder) && !(syntaxElement instanceof org.kermeta.kp.editor.grammar.KptKeyword)) {
			return;
		}
		org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		for (org.antlr.runtime3_2_0.CommonToken anonymousToken : anonymousTokens) {
			layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KptLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), ""));
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
		layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KptLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
	}
	
	protected org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter) {
				return (org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter) adapter;
			}
		}
		org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter newAdapter = new org.kermeta.kp.editor.mopp.KptLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; }
	)
	EOF	
;

parse_org_kermeta_kp_KermetaProject returns [org.kermeta.kp.KermetaProject element = null]
@init{
}
:
	a0 = 'KermetaProject' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_1, 1));
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_2, 2));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_3, 3));
	}
	
	a3 = 'version' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_4, 4));
	}
	
	a4 = ': ' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_5, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_5, 5));
	}
	
	(
		a5 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			}
			if (a5 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_6, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_6, 6));
	}
	
	a6 = 'group' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_8, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_7, 7));
	}
	
	a7 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_9, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_8, 8));
	}
	
	(
		a8 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			}
			if (a8 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_10, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_9, 9));
	}
	
	a9 = '{' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_12, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 10, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 10));
	}
	
	(
		(
			(
				a10_0 = parse_org_kermeta_kp_Source				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a10_0 != null) {
						if (a10_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES, a10_0);
							completedElement(a10_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_0_1, a10_0);
						copyLocalizationInfos(a10_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 11, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 11));
			}
			
			
			|			(
				a11_0 = parse_org_kermeta_kp_Dependency				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES, a11_0);
							completedElement(a11_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_1_1, a11_0);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 12, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 12));
			}
			
			
			|			(
				a12_0 = parse_org_kermeta_kp_Option				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS, a12_0);
							completedElement(a12_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_2_1, a12_0);
						copyLocalizationInfos(a12_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 13, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 13));
			}
			
			
			|			(
				a13_0 = parse_org_kermeta_kp_WeaveDirective				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES, a13_0);
							completedElement(a13_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_13_0_3_1, a13_0);
						copyLocalizationInfos(a13_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 14, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 14));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 15, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 15));
	}
	
	a14 = '}' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_15, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_19, 16));
	}
	
	a15 = 'ref' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_17, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_20, 17));
	}
	
	a16 = '{' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_18, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 18, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 18));
	}
	
	(
		(
			(
				a17_0 = parse_org_kermeta_kp_KermetaProjectRef				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					}
					if (a17_0 != null) {
						if (a17_0 != null) {
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF, a17_0);
							completedElement(a17_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_19_0_0_1, a17_0);
						copyLocalizationInfos(a17_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 19, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 19));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 20, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 20));
	}
	
	a18 = '}' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_0_0_0_21, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a18, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_org_kermeta_kp_SourceFolder returns [org.kermeta.kp.SourceFolder element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_23, 22));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_24, 23));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFolder();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_1_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 24, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 24));
	}
	
;

parse_org_kermeta_kp_SourceFile returns [org.kermeta.kp.SourceFile element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_25, 25));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_26, 26));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceFile();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URI), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_2_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 27, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 27));
	}
	
;

parse_org_kermeta_kp_SourceNSURI returns [org.kermeta.kp.SourceNSURI element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_27, 28));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_28, 29));
	}
	
	(
		a2 = NSURI		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NSURI");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URI), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_29, 30));
	}
	
	a3 = 'from' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_30, 31));
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceNSURI();
			}
			if (a4 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_3_0_0_4, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 32, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 32));
	}
	
;

parse_org_kermeta_kp_SourceQuery returns [org.kermeta.kp.SourceQuery element = null]
@init{
}
:
	a0 = 'source' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_31, 33));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_32, 34));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_33, 35));
	}
	
	a3 = 'from' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_34, 36));
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createSourceQuery();
			}
			if (a4 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kp.Dependency proxy = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.ImportedSource, org.kermeta.kp.Dependency>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_4_0_0_4, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 37, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 37));
	}
	
;

parse_org_kermeta_kp_Dependency returns [org.kermeta.kp.Dependency element = null]
@init{
}
:
	a0 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_35, 38));
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_1, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_36, 39));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_37, 40));
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			}
			if (a3 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_0_3, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 41, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 41));
	}
	
	
	|	a4 = 'dependency' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_1_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_38, 42));
	}
	
	(
		a5 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createDependency();
			}
			if (a5 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.kermeta.kp.KermetaProjectRef proxy = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KptContextDependentURIFragmentFactory<org.kermeta.kp.Dependency, org.kermeta.kp.KermetaProjectRef>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_5_0_1_1, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 43, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 43));
	}
	
;

parse_org_kermeta_kp_WeaveDirective returns [org.kermeta.kp.WeaveDirective element = null]
@init{
}
:
	a0 = 'weaver-directive' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_39, 44));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_40, 44));
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
				}
				if (a1 != null) {
					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), resolved);
						completedElement(resolved, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_1, resolved);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_40, 45));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 46, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_5));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 46, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_5));
	}
	
	(
		a3_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX), a3_0);
					completedElement(a3_0, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_3, a3_0);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 47, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 47, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
	}
	
	(
		a4_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createWeaveDirective();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET), a4_0);
					completedElement(a4_0, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_6_0_0_4, a4_0);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 48, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 48));
	}
	
;

parse_org_kermeta_kp_Option returns [org.kermeta.kp.Option element = null]
@init{
}
:
	a0 = 'merger-option' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_43, 49));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_44, 49));
	}
	
	(
		(
			a1 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
				}
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
				}
				if (a1 != null) {
					org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), resolved);
						completedElement(resolved, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_1, resolved);
					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_44, 50));
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_45, 51));
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createOption();
			}
			if (a3 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_7_0_0_3, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_10, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_11, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_12, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_13, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_14, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_15, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_16, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_2));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_17, 52, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_3));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_18, 52));
	}
	
;

parse_org_kermeta_kp_StringExpression returns [org.kermeta.kp.StringExpression element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createStringExpression();
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_8_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 53, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 53, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
	}
	
;

parse_org_kermeta_kp_MixExpression returns [org.kermeta.kp.MixExpression element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 54, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_7));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 54, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_7));
	}
	
	(
		a1_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT), a1_0);
					completedElement(a1_0, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_1, a1_0);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 55, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_8));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 55, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_8));
	}
	
	(
		a2_0 = parse_org_kermeta_kp_Expression		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT), a2_0);
					completedElement(a2_0, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_2, a2_0);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_46, 56));
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createMixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_9_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_41, 57, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_42, 57, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_6));
	}
	
;

parse_org_kermeta_kp_NamedElement returns [org.kermeta.kp.NamedElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createNamedElement();
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.NAMED_ELEMENT__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_10_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_kermeta_kp_Dependency{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_kermeta_kp_WeaveDirective{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_kermeta_kp_Option{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_kermeta_kp_KermetaProjectRef{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_kermeta_kp_KermetaProjectRef returns [org.kermeta.kp.KermetaProjectRef element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
			}
			if (a0 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_48, 59));
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_49, 60));
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
			}
			if (a2 != null) {
				org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_50, 61));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 61, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 61));
	}
	
	(
		(
			a3 = '[' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_51, 62));
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KptTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					}
					if (a4 != null) {
						org.kermeta.kp.editor.IKptTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKptTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), resolved);
							completedElement(resolved, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_1, resolved);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_52, 63));
			}
			
			a5 = ']' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProjectRef();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KptGrammarInformationProvider.KPT_11_0_0_3_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 64, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
				addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 64));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_21, 65, org.kermeta.kp.editor.grammar.KptFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.kermeta.kp.editor.mopp.KptExpectedTerminal(org.kermeta.kp.editor.grammar.KptFollowSetProvider.TERMINAL_22, 65));
	}
	
;

parse_org_kermeta_kp_Source returns [org.kermeta.kp.Source element = null]
:
	c0 = parse_org_kermeta_kp_SourceFolder{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_kermeta_kp_SourceFile{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_kermeta_kp_SourceNSURI{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_kermeta_kp_SourceQuery{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_kermeta_kp_Expression returns [org.kermeta.kp.Expression element = null]
:
	c0 = parse_org_kermeta_kp_StringExpression{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_kermeta_kp_MixExpression{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	'//'(~('\n'|'\r'))*
	{ _channel = 99; }
;
ML_COMMENT:
	'/*'.*'*/'	{ _channel = 99; }
;
INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0'	{ _channel = 99; }
;
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
MAVEN:
	'"'('A'..'Z')*'"'	{ _channel = 99; }
;
NSURI:
	('A'..'Z')(('_')?('A'..'Z'))*;
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
QUOTED_34_34:
	('"')(~('"'))*('"')
;

